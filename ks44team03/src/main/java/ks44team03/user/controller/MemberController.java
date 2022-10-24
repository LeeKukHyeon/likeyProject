package ks44team03.user.controller;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import org.springframework.ui.Model;
import ks44team03.dto.MemberDTO;
import ks44team03.dto.UserInfo;
import ks44team03.user.service.MemberService;

@Controller
@RequestMapping(value = "/user")
public class MemberController {
	
	private static final Logger log = LoggerFactory.getLogger(MemberController.class);
	
	private MemberService memberService;
	
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	@PostConstruct
	public void memberControllerInit() {
		log.info("memberController 생성");
	}
	
	// 로그인페이지로 이동
	@GetMapping("loginForm")
	public String loginForm() {
		return "/login/loginForm";
	}

	// 아이디 비밀번호 찾기 페이지로 이동
	@GetMapping("/findIdPw")
	public String findIdPw() {
		return "login/findIdPw";
	}
	
	//
	@PostMapping("/findMemberId")
	@ResponseBody
	public int findMemberId(@RequestParam("mnameID") String uName,
						@RequestParam("phoneNumber") String uPhone) {
		System.out.println(uName + "제발젤브ㅓㅏㄹ더로저로");
		System.out.println(uPhone+ "ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
		//int result = memberService.findMemberId(uName, uPhone);
		return 0;
	}
	
	

	// 회원가입 페이지 이동
	@GetMapping("/userForm")
	public String userForm() {
		return "registration/userForm";
	}
	
	//로그아웃 버튼 클릭시 로그아웃 완료 및 로그인페이지로 이동
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:/user/loginForm";
	}
	
	//로그인 버튼 클릭시 로그인 완료 및 마이페이지로 이동
	@PostMapping("/login")
	public String loginProcess(@RequestParam("uId") String uId
							,@RequestParam("uPw") String uPw
							,RedirectAttributes reAttr
							,HttpSession session){
		
		UserInfo userinfo = memberService.getMemberInfoById(uId);

		if(userinfo != null) {
			String checkPw = userinfo.getuPw();
			
			if(uPw != null && checkPw.equals(uPw)) {
				session.setAttribute("SID", uId);
				session.setAttribute("SNAME", userinfo.getuName());
				session.setAttribute("SLEVEL", userinfo.getuLevel());
				// 회원의 정보가 일치하면
				return "myPage/member/mypageScreen";
			}
		}
		
		// 회원의 정보가 일치하기 않으면
		reAttr.addAttribute("msg", "회원의 정보가 일치하지 않습니다.");
		return "redirect:/login/loginForm";
	}

	@GetMapping("/login")
	public String login(Model model
					   ,@RequestParam(value="msg", required = false) String msg) {
			
		model.addAttribute("title", "로그인 화면");
		if(msg != null) model.addAttribute("msg", msg);
			
		return "/user/login";
	}
	
	
	// 회원가입 버튼 클릭시 회원가입 완료 및 로그인페이지로 이동
	  @PostMapping("/signup")
	  public String signUp(MemberDTO member) {
		  int result = memberService.userSignup(member);
		  System.out.println(result); 
		  return "/login/loginForm";
		  }
	  
	
	  // 회원가입 시 아이디 중복 검사
	  @PostMapping("/signup/checkid")
	  @ResponseBody
	  public int checkId(@RequestParam("id") String id) {
		if (id.equals(memberService.checkID(id))) {
			return 1;
		}else {
			return 0;
		}
	  }
	  
	  // 회원가입 시 닉네임 중복 검사
	  @PostMapping("/signup/checknick")
	  @ResponseBody
	  public int checkNick(@RequestParam("nick") String nick) {
		  if (nick.equals(memberService.checkNick(nick))) {
			  return 1;
		  }else {
			  return 0;
		  }
	  }
}
