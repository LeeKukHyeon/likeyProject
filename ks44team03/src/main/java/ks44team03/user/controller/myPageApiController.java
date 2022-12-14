package ks44team03.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ks44team03.dto.Nodata;
import ks44team03.dto.ShipOrderApi;
import ks44team03.user.service.MypageService;

@Controller
public class myPageApiController {
	
	private MypageService mypageService;
		
	
	public myPageApiController(MypageService mypageService) {
		this.mypageService = mypageService;
	}
	
	

	@PostMapping("/user/addGoodsInfo")
	@ResponseBody
	public String addGoodsInfo(@RequestBody Map<String, Object> ResultList) {
		
		System.out.println(ResultList);
		
		return "전송완료";
	}

	
	
	@GetMapping("/juso")
	public String jusoRequest() {
		return "myPage/myPageApi/jusoPopup";
	}
	
	@PostMapping("/juso")
	public String jusoResponse(HttpServletRequest request, String inputYn, Model model) {
		String roadAddrPart1 = request.getParameter("roadAddrPart1");
		String roadAddrPart2 = request.getParameter("roadAddrPart2");
		String zipNo = request.getParameter("zipNo");
		
		model.addAttribute("roadAddrPart1", roadAddrPart1);
		model.addAttribute("roadAddrPart2", roadAddrPart2);
		model.addAttribute("zipNo", zipNo);
		model.addAttribute("inputYn", inputYn);
		return "myPage/myPageApi/jusoPopup";
	}
	
	
	
	
	//상태 선택에 따른 데이터 표로 출력
	@PostMapping("/api/shipOrderApi")
	public String shipOrderApi(@RequestParam(value = "q_status_name", required = false) String q_status_name, Model model,HttpSession session) {
		String u_id = null;	
		if (session.getAttribute("TESTID") == null) {
			u_id = (String)session.getAttribute("SID");
		}else {
			u_id = (String)session.getAttribute("TESTID");
		}
		
		System.out.println(q_status_name);
		List<ShipOrderApi> shipOrderApi = null;
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("u_id", u_id);
		paramMap.put("q_status_name", q_status_name);
		shipOrderApi = mypageService.shipOrderApi(paramMap);	
			
		
		
		model.addAttribute("shipOrderApi", shipOrderApi);
		
	
		return "myPage/myPageApi/shipOrderApi";
	}
	
	//노데이터 창으로 출력
	@GetMapping("/api/nodataListApi")
	public String nodataList(Model model) {
		String u_id = "id001";
		List<Nodata> nodataList = mypageService.nodataList(u_id);
		model.addAttribute("nodataList", nodataList);
		return "myPage/myPageApi/nodataOpen";
	}

	//노데이터 목록 출력
	@PostMapping("/api/nodataListApi")
	public String nodataListApi(Model model) {
		String u_id = "id001";
		List<Nodata> nodataList = mypageService.nodataList(u_id);
		model.addAttribute("nodataList", nodataList);
		return "myPage/myPageApi/nodataList";
	}
	
	 // 마이페이지 각 단계 설명 
	@PostMapping("/shipStepInfo")
	public String shipStepInfo(@RequestParam(name="q_ship_step_type", defaultValue = "") String shipStepInfo) {
		
		
		
		if (shipStepInfo.equals("noDataCnt")){			
			return "myPage/myPageApi/nodataApi";
		}else if (shipStepInfo.equals("Imsi")) {
			return "myPage/myPageApi/tempApi";
		}else if (shipStepInfo.equals("orderType1")) {			
			return "myPage/myPageApi/orderType1";
		}else if (shipStepInfo.equals("buyingItem")) {				
				return "myPage/myPageApi/buyingItem";
		}else if (shipStepInfo.equals("Arrived")) {			
			return "myPage/myPageApi/arrived";
		}else if (shipStepInfo.equals("PartialStock")) {			
			return "myPage/myPageApi/partialStock";
		}else if (shipStepInfo.equals("AllIn")) {			
			return "myPage/myPageApi/allIn";
		}else if (shipStepInfo.equals("Err")) {			
			return "myPage/myPageApi/err";
		}else if (shipStepInfo.equals("Err")) {			
			return "myPage/myPageApi/err";
		}else if (shipStepInfo.equals("noOutNoPayCnt")) {			
			return "myPage/myPageApi/noOutNoPayCnt";
		}else if (shipStepInfo.equals("noOutPaid")) {			
		return "myPage/myPageApi/noOutPaid";
		}else if (shipStepInfo.equals("weightShipHold")) {			
		return "myPage/myPageApi/weightShipHold";
		}else if (shipStepInfo.equals("outNoPay")) {			
		return "myPage/myPageApi/outNoPay";
		}else if (shipStepInfo.equals("gsiOut")) {			
		return "myPage/myPageApi/gsiOut";
		}else if (shipStepInfo.equals("customsing")) {			
		return "myPage/myPageApi/customsing";
		}else if (shipStepInfo.equals("CustomsClosed")) {			
		return "myPage/myPageApi/customsClosed";
		}else if (shipStepInfo.equals("localShipping")) {			
		return "myPage/myPageApi/localShipping";
		}else if (shipStepInfo.equals("ShipClosed")) {			
		return "myPage/myPageApi/shipClosed";
		}else if (shipStepInfo.equals("keepFeeCnt")) {			
		return "myPage/myPageApi/keepFeeCnt";
		}
			
		
		
		return null;
	}
}
