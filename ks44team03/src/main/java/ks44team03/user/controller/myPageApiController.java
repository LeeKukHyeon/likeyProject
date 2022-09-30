package ks44team03.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks44team03.dto.Nodata;
import ks44team03.user.service.MypageService;

@Controller
public class myPageApiController {
	
	private MypageService mypageService;
		
	
	public myPageApiController(MypageService mypageService) {
		this.mypageService = mypageService;
	}

	@PostMapping("api/nodataListApi")
	public String bcd(Model model) {
		String u_id = "id001";
		List<Nodata> nodataList = mypageService.nodataList(u_id);
		model.addAttribute("nodataList", nodataList);
		return "myPage/myPageApi/nodataList";
	}

	
	@PostMapping("shipStepInfo")
	public String abc(@RequestParam(name="q_ship_step_type", defaultValue = "") String test) {
		
		System.out.println(test);
		
		if (test.equals("noDataCnt")){			
			return "myPage/myPageApi/nodataApi";
		}else if (test.equals("Imsi")) {
			return "myPage/myPageApi/tempApi";
		}else if (test.equals("orderType1")) {			
			return "myPage/myPageApi/orderType1";
		}else if (test.equals("buyingItem")) {				
				return "myPage/myPageApi/buyingItem";
		}else if (test.equals("Arrived")) {			
			return "myPage/myPageApi/arrived";
		}else if (test.equals("PartialStock")) {			
			return "myPage/myPageApi/partialStock";
		}else if (test.equals("AllIn")) {			
			return "myPage/myPageApi/allIn";
		}else if (test.equals("Err")) {			
			return "myPage/myPageApi/err";
		}else if (test.equals("Err")) {			
			return "myPage/myPageApi/err";
		}else if (test.equals("noOutNoPayCnt")) {			
			return "myPage/myPageApi/noOutNoPayCnt";
		}else if (test.equals("noOutPaid")) {			
		return "myPage/myPageApi/noOutPaid";
		}else if (test.equals("weightShipHold")) {			
		return "myPage/myPageApi/weightShipHold";
		}else if (test.equals("outNoPay")) {			
		return "myPage/myPageApi/outNoPay";
		}else if (test.equals("gsiOut")) {			
		return "myPage/myPageApi/gsiOut";
		}else if (test.equals("customsing")) {			
		return "myPage/myPageApi/customsing";
		}else if (test.equals("CustomsClosed")) {			
		return "myPage/myPageApi/customsClosed";
		}else if (test.equals("localShipping")) {			
		return "myPage/myPageApi/localShipping";
		}else if (test.equals("ShipClosed")) {			
		return "myPage/myPageApi/shipClosed";
		}else if (test.equals("keepFeeCnt")) {			
		return "myPage/myPageApi/keepFeeCnt";
		}
			
		
		
		return null;
	}
}
