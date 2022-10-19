package ks44team03.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	
	@RequestMapping(value = {"/jusoPopup"}, method = RequestMethod.POST)
	public ModelAndView jusoPopup(HttpServletRequest request, Model model) {
		System.out.println("--------------------");
	    
		ModelAndView mav = new ModelAndView("/myPage/myPageApi/jusoPopup");

		String inputYn = request.getParameter("inputYn");
		String zipNo = request.getParameter("zipNo");
		String roadAddrPart1 = request.getParameter("roadAddrPart1");
		String roadAddrPart2 = request.getParameter("roadAddrPart2");
		String addrDetail = request.getParameter("addrDetail");
		String jibunAddr = request.getParameter("jibunAddr");

		mav.addObject("inputYn", inputYn);
		mav.addObject("zipNo", zipNo);
		mav.addObject("roadAddrPart1", roadAddrPart1);
		mav.addObject("roadAddrPart2", roadAddrPart2);
		mav.addObject("jibunAddr", jibunAddr);
		mav.addObject("addrDetail", addrDetail);

		return mav;
	  }
	 
	

	@RequestMapping(value = {"/jusoPopup"})
	  public String jusoGetPopup(HttpServletRequest request, Model model) {
		String inputYn = request.getParameter("inputYn");
		String zipNo = request.getParameter("zipNo");
		String roadAddrPart1 = request.getParameter("roadAddrPart1");
		String roadAddrPart2 = request.getParameter("roadAddrPart2");
		String addrDetail = request.getParameter("addrDetail");
		String jibunAddr = request.getParameter("jibunAddr");

		model.addAttribute("inputYn", inputYn);
		model.addAttribute("zipNo", zipNo);
		model.addAttribute("roadAddrPart1", roadAddrPart1);
		model.addAttribute("roadAddrPart2", roadAddrPart2);
		model.addAttribute("jibunAddr", jibunAddr);
		model.addAttribute("addrDetail", addrDetail);
	    
	    return "myPage/myPageApi/jusoPopup";
	  }
	
	
	
	
	
	
	
	@PostMapping("api/shipOrderApi")
	public String cdf(@RequestParam(value = "q_status", required = false) int test, Model model) {
		
		String u_id = "id001";	
		String stat_info = "";
		List<ShipOrderApi> shipOrderApi = null;
		Map<String, Object> paramMap = new HashMap<String, Object>();
		if (test == 0) {
			
			stat_info = "n";
			paramMap.put("u_id", u_id);
			paramMap.put("stat_info", stat_info);
			shipOrderApi = mypageService.shipOrderApi(paramMap);	
			
		}
					
		model.addAttribute("shipOrderApi", shipOrderApi);
		
		System.out.println(shipOrderApi);
		return "myPage/myPageApi/shipOrderApi";
	}
	
	
	@GetMapping("api/nodataListApi")
	public String nodataList(Model model) {
		String u_id = "id001";
		List<Nodata> nodataList = mypageService.nodataList(u_id);
		model.addAttribute("nodataList", nodataList);
		return "myPage/myPageApi/nodataOpen";
	}

	@PostMapping("api/nodataListApi")
	public String nodataListApi(Model model) {
		String u_id = "id001";
		List<Nodata> nodataList = mypageService.nodataList(u_id);
		model.addAttribute("nodataList", nodataList);
		return "myPage/myPageApi/nodataList";
	}
	
	 
	@PostMapping("shipStepInfo")
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
