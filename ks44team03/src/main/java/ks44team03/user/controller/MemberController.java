package ks44team03.user.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import groovyjarjarpicocli.CommandLine.Model;
import ks44team03.dto.MemberDTO;
import ks44team03.dto.UserInfo;
import ks44team03.user.service.MemberService;

@Controller
public class MemberController {
	
	private MemberService memberService;
	
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
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

	// 회원가입 페이지 이동
	@GetMapping("/userForm")
	public String userForm() {
		return "registration/userForm";
	}
	
	//로그인 버튼 클릭시 로그인 완료 및 마이페이지로 이동
	@PostMapping("/userLogin")
	public String loginProcess(@RequestParam("uId") String uId, @RequestParam("uPw") String uPw
							,RedirectAttributes reAttr,HttpSession session){
		
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
		reAttr.addAttribute("msg", "회원의 정보가 일치하지 않습니다.");
		return "redirect:/login/loginForm";
	}
	
	//
	@GetMapping("/userLogin")
	public String login(Model model
					   ,@RequestParam(value="msg", required = false) String msg) {
			
		//model.addAttribute("title", "로그인 화면");
		//if(msg != null) model.addAttribute("msg", msg);
			
		return "/admin/login/adminLogin";
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
