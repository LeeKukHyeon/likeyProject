package ks44team03.user.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MypageAjaxController {

	@PostMapping("/api/ship_step_info_api")
	@ResponseBody
	public String ship_step_info_api() {
		
		String abc = '<div>'
			<div class="title">- 배송대행신청 미작성 입고(노데이터)</div>
			<div class="text_box">
				<div class="text1">호야USA 물류센터로 상품이 도착하였으나, 배송신청서 미작성 입고로 분류된 상품입니다.</div>
	
				<div class="text2">배송신청서 미작성 입고가 발생하는 경우</div>
				<ul class="text3">
					<li>- 주문한 상품이 물류센터에 도착한 시점까지 배송대행 신청서를 작성하지 않은 경우</li>
					<li>- 주문한 상품이 물류센터에 도착한 시점까지 배송대행 신청서는 작성하였지만, 트래킹 번호를 기재하지 않은 경우</li>
					<li>- 실제 입고된 트래킹 번호와 배송대행 신청서에 기재한 트래킹 번호가 상이한 경우 </li>
				</ul>	
				<div class="text2">배송대행신청 미작성 입고 처리방법 </div>
				<ul class="text3">
					<li><b>- 처리방법 1 :</b> “신청서 등록하기” 버튼을 클릭해서 배송신청서를 작성해 주세요.</li>
					<li><b>- 처리방법 2 :</b> 아래 “배송대행신청 완료” 리스트에서 미리 작성해 놓은 배송신청번호를 클릭하고 트래킹 번호를 입력해 주세요.</li>
					<li><b>- 처리방법 3 :</b> 고객님께서 주문한 상품이 아닐 경우 고객센터 1:1 문의 통하여 전달 부탁 드리겠습니다.</li>
				</ul>
	
				<div class="text1">노데이터(미작성 입고)건의 <span style="color:#ff9520;font-weight:bold;">최대 무료 보관일은 15일</span>이며, 15일 초과시 16일째 $5 + 이후 1일 경과 시 매일 $1씩 추가되어 보관 수수료가 부과 됩니다.</div>
				<div class="text1">상품 도착 후 신청서가 작성되지 않은 상태(노데이터)에서 <span style="color:#ff9520;font-weight:bold;">최대 보관일수 30일 이후</span>에는 사전 고지 없이 <span style="color:#ff9520;font-weight:bold;">자체 폐기</span>됩니다.</div>
				
		</div>
	</div>'
		return abc;
		
	}
}
