<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 <!DOCTYPE html>
<html lang="ko"
	  xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout"
      layout:decorate="~{layout/registration_layout.html}">

<head>
<style>
.sub_navi_text > div {
    background: url(/image/S_navi_home.gif) 0 50% no-repeat;
    padding-left: 20px;
    font-size: 13px;
    color: #6e6e6e;
}
.sub_title_main {
    font-size: 24px;
    color: #f76c87;
    font-weight: bold;
    padding: 0px 20px 20px 4px;
}
.step_txt {
    color: #919191;
    font-size: 14px;
    line-height: 25px;
}
.input_table th {
    height: 30px;
    background-color: #f8f8f8;
    font-size: 15px;
    color: #447b9a;
    font-weight: bold;
    text-align: center;
}
.input_table th, .input_table td {
    border: 1px solid #c6c6c6;
}
.input_table td.td2 {
    padding: 10px 20px;
}
.input_table td {
    height: 30px;
    font-size: 14px;
    color: #565656;
    line-height: 25px;
    padding-right: 30px;
}
.select_add {
    height: 26px;
    border: 1px solid #c2c2c2;
}
body, td{
    color: #00000;
    font-size: 12px;
    line-height: 1.2;
    font-family: "Nanum Gothic","����", Dotum, "����", Gulim, Verdana, AppleGothic, sans-serif;
}
.sub1_title {
    font-size: 20px;
    color: #3f3f3f;
    font-weight: bold;
    padding-right: 28px;
}
button {
    appearance: auto;
    writing-mode: horizontal-tb !important;
    font-style: ;
    font-variant-ligatures: ;
    font-variant-caps: ;
    font-variant-numeric: ;
    font-variant-east-asian: ;
    font-weight: ;
    font-stretch: ;
    font-size: ;
    font-family: ;
    text-rendering: auto;
    color: buttontext;
    letter-spacing: normal;
    word-spacing: normal;
    line-height: normal;
    text-transform: none;
    text-indent: 0px;
    text-shadow: none;
    display: inline-block;
    text-align: center;
    align-items: flex-start;
    cursor: default;
    box-sizing: border-box;
    background-color: buttonface;
    margin: 0em;
    padding: 1px 6px;
    border-width: 2px;
    border-style: outset;
    border-color: buttonborder;
    border-image: initial;
}
.next_button {
    background-color: #5b95e5;
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 17px;
    margin: 4px 2px;
    cursor: pointer;
    font-weight: bold;
}
.cancel_button {
    background-color: #535353;
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 17px;
    margin: 4px 2px;
    cursor: pointer;
}
.olmessagef {color: red; font-style: Italic;}
.olmessaget {color: blue; font-style: Italic;}
</style>

<!-- 아이디 비밀번호 입력되었는지 확인하는 함수  -->
 <script type="text/javascript">
	 function checkValue() {
	     if(!document.userInfo.id.value){
	         alert("아이디를 입력하세요.");
	         return false;
	     }
	     
	     if(!document.userInfo.password.value){
	         alert("비밀번호를 입력하세요.");
	         return false;
	     }
	     
	     // 비밀번호와 비밀번호 확인에 입력된 값이 동일한지 확인
	     if(document.userInfo.password.value != document.userInfo.passwordcheck.value ){
	         alert("비밀번호를 동일하게 입력하세요.");
	         return false;
	     }
	 }
    </script>

<!-- 생년월일 js -->
<script type="text/javascript" src="http://code.jquery.com/jquery-1.12.4.min.js"></script>
<script>
$(document).ready(function(){            
    var now = new Date();
    var year = now.getFullYear();
    var mon = (now.getMonth() + 1) > 9 ? ''+(now.getMonth() + 1) : '0'+(now.getMonth() + 1); 
    var day = (now.getDate()) > 9 ? ''+(now.getDate()) : '0'+(now.getDate());           
    //년도 selectbox만들기               
    for(var i = 1900 ; i <= year ; i++) {
        $('#year').append('<option value="' + i + '">' + i + '</option>');    
    }

    // 월별 selectbox 만들기            
    for(var i=1; i <= 12; i++) {
        var mm = i > 9 ? i : "0"+i ;            
        $('#month').append('<option value="' + mm + '">' + mm + '</option>');    
    }
    
    // 일별 selectbox 만들기
    for(var i=1; i <= 31; i++) {
        var dd = i > 9 ? i : "0"+i ;            
        $('#day').append('<option value="' + dd + '">' + dd+ '</option>');    
    }
    $("#year  > option[value="+year+"]").attr("selected", "true");        
    $("#month  > option[value="+mon+"]").attr("selected", "true");    
    $("#day  > option[value="+day+"]").attr("selected", "true");       
  
})
</script>

<!-- 아이디 중복확인 버튼 클릭시 중복체크  -->
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
 <script>
 	var idchk = false; // 아이디 검사
 	
 	$(function() {
		
 		var $uId = $("#uId");
		var $id = $("#id");
		
		console.log("ㅠㅠ");
		console.dir("uid : "+$uId);
		// 아이디 정규식
		
		$uId.on("keyup", function() { // 키보드 눌렀을 때 실행
			var regExp = /^[a-z]+[a-z0-9]{5,15}$/g;
			console.log('zzzzzzzzzzzzzzzzzzzzz');

			if (!regExp.test($uId.val())) { // id 가 공백인 경우 체크
				idchk = false;
				$id.html("<span id='check'>아이디를 입력해주세요.</span>");
				$("#check").css({
					"color" : "#FA3E3E",
					"font-weight" : "bold",
					"font-size" : "15px"
				})
			} else { // 공백아니면 중복체크
				$.ajax({
					type : "POST",
					url : "/signup/checkid",
					data : {
						"type" : "user",
						"id" : $uId.val()
					},
					success : function(data) {
						if (data == 1) { // 1이면 중복
							idchk = false;
							$id.html("<span id='check'>이미 존재하는 아이디입니다</span>")
							$("#check").css({
								"color" : "#FA3E3E",
								"font-weight" : "bold",
								"font-size" : "15px"

							})
							//console.log("중복아이디");
						} else { // 아니면 중복아님
							idchk = true;
							$id.html("<span id='check'>사용가능한 아이디입니다</span>")

							$("#check").css({
								"color" : "#0D6EFD",
								"font-weight" : "bold",
								"font-size" : "15px"

							})
							//console.log("중복아닌 아이디");
						}
					}
					});
				}//
			});
 	});
 
 </script>
 
</head>
	<!-- 나중에 Container-fluid로 잡아주기  -->
	<!-- default_layout.html에 정의한 main page 부분 -->
	<body layout:fragment="content">
	<!-- 오른쪽 내용 -->
	<div class="right_text">
		<div class="sub_navi_text"> 
			<div>HOME &nbsp;>&nbsp; 회원관리 &nbsp;>&nbsp; <b>회원가입</b></div>
		</div>
		
		<div class="sub_title_main">- 회원가입 신청서 작성</div>

		<p class="step_txt">
		회원가입시 신규 가입 <strong>10% 할인쿠폰</strong>을 증정합니다.<br/>
		</p>
		
		<form method="post" action="signup">
			<input type="hidden" name="action_type" value="MemJoin">
			<input type="hidden" name="auth_num" value="">
			
			<table class="input_table" style="width:100%;" >
				<colgroup>
					<col width="15%"/><col width="35%"/>
					<col width="35%"/>
				</colgroup>
			<tbody>
				<tr>
					<th class="td1">아이디 <span class="required-addon">*</span></th>
					<td class="td2" width="50%">
						<div class="form-group first">
							<label for="id" id="id">아이디를 입력해주세요 (5~15자 입력)</label> </br>
							<input type="text"  name="uId" id="uId" maxlength="30" style="width:150px;" class="input_add" required /> 
							<span id="olmessage"></span>
						</div>
					</td> 
				</tr>
				<tr>
					<th class="td1">비밀번호 <span class="required-addon">*</span></th>
					<td class="td2">
						<input type="password" name="uPw" id="uPw" maxlength="20" class="input_add" value="" />
						<div id="user_pwd-errmsg"></div>
					</td>
				</tr>
				<tr>
					<th class="td1">비번확인 <span class="required-addon">*</span></th>
					<td class="td2">
						<input type="password" name="uRepw" id="uRepw" maxlength="20" class="input_add" value="" />
						<div id="user_repwd-errmsg"></div>
					</td>
				</tr>  
				<tr>
					<th class="td1">이름 <span class="required-addon">*</span></th>
					<td class="td2">
						<input type="text" name="uName" id="uName" maxlength="30" class="input_add" value="" />
						<div id="name-errmsg"></div>
					</td>
				</tr>  
				<tr>
					<th class="td1">생년월일 <span class="required-addon">*</span></th>
					<td class="td2">
						<select name="yy" id="year" class="select_add"></select>년
						<select name="mm" id="month" class="select_add"></select>월
						<select name="dd" id="day" class="select_add"></select>일
						<div id="birth_y-errmsg"></div>
						<div id="birth_m-errmsg"></div>
						<div id="birth_d-errmsg"></div>
					</td>
				</tr>
				<tr>
					<th class="td1">닉네임 <span class="required-addon">*</span></th>
					<td class="td2">
						<input type="text" name="uNick" id="uNick" maxlength="20" style="width:150px;" class="input_add" value="" />
						<div id="nickname-errmsg"></div>
					</td>
				</tr>
 
  
				<tr> 
					<th class="td1">휴대폰 <span class="required-addon">*</span></th>
					<td class="td2">
						<div>
							<select name="countryCode" id="countryCode"  class="select_add" style="width:95px;">
								<optgroup label="Other countries">
								<option data-countryCode="GB" value="44" Selected>UK (+44)</option>
								<option data-countryCode="US" value="1">USA (+1)</option>
								<option data-countryCode="DZ" value="213">Algeria (+213)</option>
								<option data-countryCode="AD" value="376">Andorra (+376)</option>
								<option data-countryCode="AO" value="244">Angola (+244)</option>
								<option data-countryCode="AI" value="1264">Anguilla (+1264)</option>
								<option data-countryCode="AG" value="1268">Antigua &amp; Barbuda (+1268)</option>
								<option data-countryCode="AR" value="54">Argentina (+54)</option>
								<option data-countryCode="AM" value="374">Armenia (+374)</option>
								<option data-countryCode="AW" value="297">Aruba (+297)</option>
								<option data-countryCode="AU" value="61">Australia (+61)</option>
								<option data-countryCode="AT" value="43">Austria (+43)</option>
								<option data-countryCode="AZ" value="994">Azerbaijan (+994)</option>
								<option data-countryCode="BS" value="1242">Bahamas (+1242)</option>
								<option data-countryCode="BH" value="973">Bahrain (+973)</option>
								<option data-countryCode="BD" value="880">Bangladesh (+880)</option>
								<option data-countryCode="BB" value="1246">Barbados (+1246)</option>
								<option data-countryCode="BY" value="375">Belarus (+375)</option>
								<option data-countryCode="BE" value="32">Belgium (+32)</option>
								<option data-countryCode="BZ" value="501">Belize (+501)</option>
								<option data-countryCode="BJ" value="229">Benin (+229)</option>
								<option data-countryCode="BM" value="1441">Bermuda (+1441)</option>
								<option data-countryCode="BT" value="975">Bhutan (+975)</option>
								<option data-countryCode="BO" value="591">Bolivia (+591)</option>
								<option data-countryCode="BA" value="387">Bosnia Herzegovina (+387)</option>
								<option data-countryCode="BW" value="267">Botswana (+267)</option>
								<option data-countryCode="BR" value="55">Brazil (+55)</option>
								<option data-countryCode="BN" value="673">Brunei (+673)</option>
								<option data-countryCode="BG" value="359">Bulgaria (+359)</option>
								<option data-countryCode="BF" value="226">Burkina Faso (+226)</option>
								<option data-countryCode="BI" value="257">Burundi (+257)</option>
								<option data-countryCode="KH" value="855">Cambodia (+855)</option>
								<option data-countryCode="CM" value="237">Cameroon (+237)</option>
								<option data-countryCode="CA" value="1">Canada (+1)</option>
								<option data-countryCode="CV" value="238">Cape Verde Islands (+238)</option>
								<option data-countryCode="KY" value="1345">Cayman Islands (+1345)</option>
								<option data-countryCode="CF" value="236">Central African Republic (+236)</option>
								<option data-countryCode="CL" value="56">Chile (+56)</option>
								<option data-countryCode="CN" value="86">China (+86)</option>
								<option data-countryCode="CO" value="57">Colombia (+57)</option>
								<option data-countryCode="KM" value="269">Comoros (+269)</option>
								<option data-countryCode="CG" value="242">Congo (+242)</option>
								<option data-countryCode="CK" value="682">Cook Islands (+682)</option>
								<option data-countryCode="CR" value="506">Costa Rica (+506)</option>
								<option data-countryCode="HR" value="385">Croatia (+385)</option>
								<option data-countryCode="CU" value="53">Cuba (+53)</option>
								<option data-countryCode="CY" value="90392">Cyprus North (+90392)</option>
								<option data-countryCode="CY" value="357">Cyprus South (+357)</option>
								<option data-countryCode="CZ" value="42">Czech Republic (+42)</option>
								<option data-countryCode="DK" value="45">Denmark (+45)</option>
								<option data-countryCode="DJ" value="253">Djibouti (+253)</option>
								<option data-countryCode="DM" value="1809">Dominica (+1809)</option>
								<option data-countryCode="DO" value="1809">Dominican Republic (+1809)</option>
								<option data-countryCode="EC" value="593">Ecuador (+593)</option>
								<option data-countryCode="EG" value="20">Egypt (+20)</option>
								<option data-countryCode="SV" value="503">El Salvador (+503)</option>
								<option data-countryCode="GQ" value="240">Equatorial Guinea (+240)</option>
								<option data-countryCode="ER" value="291">Eritrea (+291)</option>
								<option data-countryCode="EE" value="372">Estonia (+372)</option>
								<option data-countryCode="ET" value="251">Ethiopia (+251)</option>
								<option data-countryCode="FK" value="500">Falkland Islands (+500)</option>
								<option data-countryCode="FO" value="298">Faroe Islands (+298)</option>
								<option data-countryCode="FJ" value="679">Fiji (+679)</option>
								<option data-countryCode="FI" value="358">Finland (+358)</option>
								<option data-countryCode="FR" value="33">France (+33)</option>
								<option data-countryCode="GF" value="594">French Guiana (+594)</option>
								<option data-countryCode="PF" value="689">French Polynesia (+689)</option>
								<option data-countryCode="GA" value="241">Gabon (+241)</option>
								<option data-countryCode="GM" value="220">Gambia (+220)</option>
								<option data-countryCode="GE" value="7880">Georgia (+7880)</option>
								<option data-countryCode="DE" value="49">Germany (+49)</option>
								<option data-countryCode="GH" value="233">Ghana (+233)</option>
								<option data-countryCode="GI" value="350">Gibraltar (+350)</option>
								<option data-countryCode="GR" value="30">Greece (+30)</option>
								<option data-countryCode="GL" value="299">Greenland (+299)</option>
								<option data-countryCode="GD" value="1473">Grenada (+1473)</option>
								<option data-countryCode="GP" value="590">Guadeloupe (+590)</option>
								<option data-countryCode="GU" value="671">Guam (+671)</option>
								<option data-countryCode="GT" value="502">Guatemala (+502)</option>
								<option data-countryCode="GN" value="224">Guinea (+224)</option>
								<option data-countryCode="GW" value="245">Guinea - Bissau (+245)</option>
								<option data-countryCode="GY" value="592">Guyana (+592)</option>
								<option data-countryCode="HT" value="509">Haiti (+509)</option>
								<option data-countryCode="HN" value="504">Honduras (+504)</option>
								<option data-countryCode="HK" value="852">Hong Kong (+852)</option>
								<option data-countryCode="HU" value="36">Hungary (+36)</option>
								<option data-countryCode="IS" value="354">Iceland (+354)</option>
								<option data-countryCode="IN" value="91">India (+91)</option>
								<option data-countryCode="ID" value="62">Indonesia (+62)</option>
								<option data-countryCode="IR" value="98">Iran (+98)</option>
								<option data-countryCode="IQ" value="964">Iraq (+964)</option>
								<option data-countryCode="IE" value="353">Ireland (+353)</option>
								<option data-countryCode="IL" value="972">Israel (+972)</option>
								<option data-countryCode="IT" value="39">Italy (+39)</option>
								<option data-countryCode="JM" value="1876">Jamaica (+1876)</option>
								<option data-countryCode="JP" value="81">Japan (+81)</option>
								<option data-countryCode="JO" value="962">Jordan (+962)</option>
								<option data-countryCode="KZ" value="7">Kazakhstan (+7)</option>
								<option data-countryCode="KE" value="254">Kenya (+254)</option>
								<option data-countryCode="KI" value="686">Kiribati (+686)</option>
								<option data-countryCode="KP" value="850">Korea North (+850)</option>
								<option data-countryCode="KR" value="82">Korea South (+82)</option>
								<option data-countryCode="KW" value="965">Kuwait (+965)</option>
								<option data-countryCode="KG" value="996">Kyrgyzstan (+996)</option>
								<option data-countryCode="LA" value="856">Laos (+856)</option>
								<option data-countryCode="LV" value="371">Latvia (+371)</option>
								<option data-countryCode="LB" value="961">Lebanon (+961)</option>
								<option data-countryCode="LS" value="266">Lesotho (+266)</option>
								<option data-countryCode="LR" value="231">Liberia (+231)</option>
								<option data-countryCode="LY" value="218">Libya (+218)</option>
								<option data-countryCode="LI" value="417">Liechtenstein (+417)</option>
								<option data-countryCode="LT" value="370">Lithuania (+370)</option>
								<option data-countryCode="LU" value="352">Luxembourg (+352)</option>
								<option data-countryCode="MO" value="853">Macao (+853)</option>
								<option data-countryCode="MK" value="389">Macedonia (+389)</option>
								<option data-countryCode="MG" value="261">Madagascar (+261)</option>
								<option data-countryCode="MW" value="265">Malawi (+265)</option>
								<option data-countryCode="MY" value="60">Malaysia (+60)</option>
								<option data-countryCode="MV" value="960">Maldives (+960)</option>
								<option data-countryCode="ML" value="223">Mali (+223)</option>
								<option data-countryCode="MT" value="356">Malta (+356)</option>
								<option data-countryCode="MH" value="692">Marshall Islands (+692)</option>
								<option data-countryCode="MQ" value="596">Martinique (+596)</option>
								<option data-countryCode="MR" value="222">Mauritania (+222)</option>
								<option data-countryCode="YT" value="269">Mayotte (+269)</option>
								<option data-countryCode="MX" value="52">Mexico (+52)</option>
								<option data-countryCode="FM" value="691">Micronesia (+691)</option>
								<option data-countryCode="MD" value="373">Moldova (+373)</option>
								<option data-countryCode="MC" value="377">Monaco (+377)</option>
								<option data-countryCode="MN" value="976">Mongolia (+976)</option>
								<option data-countryCode="MS" value="1664">Montserrat (+1664)</option>
								<option data-countryCode="MA" value="212">Morocco (+212)</option>
								<option data-countryCode="MZ" value="258">Mozambique (+258)</option>
								<option data-countryCode="MN" value="95">Myanmar (+95)</option>
								<option data-countryCode="NA" value="264">Namibia (+264)</option>
								<option data-countryCode="NR" value="674">Nauru (+674)</option>
								<option data-countryCode="NP" value="977">Nepal (+977)</option>
								<option data-countryCode="NL" value="31">Netherlands (+31)</option>
								<option data-countryCode="NC" value="687">New Caledonia (+687)</option>
								<option data-countryCode="NZ" value="64">New Zealand (+64)</option>
								<option data-countryCode="NI" value="505">Nicaragua (+505)</option>
								<option data-countryCode="NE" value="227">Niger (+227)</option>
								<option data-countryCode="NG" value="234">Nigeria (+234)</option>
								<option data-countryCode="NU" value="683">Niue (+683)</option>
								<option data-countryCode="NF" value="672">Norfolk Islands (+672)</option>
								<option data-countryCode="NP" value="670">Northern Marianas (+670)</option>
								<option data-countryCode="NO" value="47">Norway (+47)</option>
								<option data-countryCode="OM" value="968">Oman (+968)</option>
								<option data-countryCode="PW" value="680">Palau (+680)</option>
								<option data-countryCode="PA" value="507">Panama (+507)</option>
								<option data-countryCode="PG" value="675">Papua New Guinea (+675)</option>
								<option data-countryCode="PY" value="595">Paraguay (+595)</option>
								<option data-countryCode="PE" value="51">Peru (+51)</option>
								<option data-countryCode="PH" value="63">Philippines (+63)</option>
								<option data-countryCode="PL" value="48">Poland (+48)</option>
								<option data-countryCode="PT" value="351">Portugal (+351)</option>
								<option data-countryCode="PR" value="1787">Puerto Rico (+1787)</option>
								<option data-countryCode="QA" value="974">Qatar (+974)</option>
								<option data-countryCode="RE" value="262">Reunion (+262)</option>
								<option data-countryCode="RO" value="40">Romania (+40)</option>
								<option data-countryCode="RU" value="7">Russia (+7)</option>
								<option data-countryCode="RW" value="250">Rwanda (+250)</option>
								<option data-countryCode="SM" value="378">San Marino (+378)</option>
								<option data-countryCode="ST" value="239">Sao Tome &amp; Principe (+239)</option>
								<option data-countryCode="SA" value="966">Saudi Arabia (+966)</option>
								<option data-countryCode="SN" value="221">Senegal (+221)</option>
								<option data-countryCode="CS" value="381">Serbia (+381)</option>
								<option data-countryCode="SC" value="248">Seychelles (+248)</option>
								<option data-countryCode="SL" value="232">Sierra Leone (+232)</option>
								<option data-countryCode="SG" value="65">Singapore (+65)</option>
								<option data-countryCode="SK" value="421">Slovak Republic (+421)</option>
								<option data-countryCode="SI" value="386">Slovenia (+386)</option>
								<option data-countryCode="SB" value="677">Solomon Islands (+677)</option>
								<option data-countryCode="SO" value="252">Somalia (+252)</option>
								<option data-countryCode="ZA" value="27">South Africa (+27)</option>
								<option data-countryCode="ES" value="34">Spain (+34)</option>
								<option data-countryCode="LK" value="94">Sri Lanka (+94)</option>
								<option data-countryCode="SH" value="290">St. Helena (+290)</option>
								<option data-countryCode="KN" value="1869">St. Kitts (+1869)</option>
								<option data-countryCode="SC" value="1758">St. Lucia (+1758)</option>
								<option data-countryCode="SD" value="249">Sudan (+249)</option>
								<option data-countryCode="SR" value="597">Suriname (+597)</option>
								<option data-countryCode="SZ" value="268">Swaziland (+268)</option>
								<option data-countryCode="SE" value="46">Sweden (+46)</option>
								<option data-countryCode="CH" value="41">Switzerland (+41)</option>
								<option data-countryCode="SI" value="963">Syria (+963)</option>
								<option data-countryCode="TW" value="886">Taiwan (+886)</option>
								<option data-countryCode="TJ" value="7">Tajikstan (+7)</option>
								<option data-countryCode="TH" value="66">Thailand (+66)</option>
								<option data-countryCode="TG" value="228">Togo (+228)</option>
								<option data-countryCode="TO" value="676">Tonga (+676)</option>
								<option data-countryCode="TT" value="1868">Trinidad &amp; Tobago (+1868)</option>
								<option data-countryCode="TN" value="216">Tunisia (+216)</option>
								<option data-countryCode="TR" value="90">Turkey (+90)</option>
								<option data-countryCode="TM" value="7">Turkmenistan (+7)</option>
								<option data-countryCode="TM" value="993">Turkmenistan (+993)</option>
								<option data-countryCode="TC" value="1649">Turks &amp; Caicos Islands (+1649)</option>
								<option data-countryCode="TV" value="688">Tuvalu (+688)</option>
								<option data-countryCode="UG" value="256">Uganda (+256)</option>
								<!-- <option data-countryCode="GB" value="44">UK (+44)</option> -->
								<option data-countryCode="UA" value="380">Ukraine (+380)</option>
								<option data-countryCode="AE" value="971">United Arab Emirates (+971)</option>
								<option data-countryCode="UY" value="598">Uruguay (+598)</option>
								<!-- <option data-countryCode="US" value="1">USA (+1)</option> -->
								<option data-countryCode="UZ" value="7">Uzbekistan (+7)</option>
								<option data-countryCode="VU" value="678">Vanuatu (+678)</option>
								<option data-countryCode="VA" value="379">Vatican City (+379)</option>
								<option data-countryCode="VE" value="58">Venezuela (+58)</option>
								<option data-countryCode="VN" value="84">Vietnam (+84)</option>
								<option data-countryCode="VG" value="84">Virgin Islands - British (+1284)</option>
								<option data-countryCode="VI" value="84">Virgin Islands - US (+1340)</option>
								<option data-countryCode="WF" value="681">Wallis &amp; Futuna (+681)</option>
								<option data-countryCode="YE" value="969">Yemen (North)(+969)</option>
								<option data-countryCode="YE" value="967">Yemen (South)(+967)</option>
								<option data-countryCode="ZM" value="260">Zambia (+260)</option>
								<option data-countryCode="ZW" value="263">Zimbabwe (+263)</option>
								</optgroup>
								</select>
							<input type="text" name="hp" id="hp" maxlength="20" style="width:200px;" class="input_add" onchange="this.value=this.value.replace(/[^0-9]/g,'');" /> 
							</div>
					
					</td>
				</tr>   
				<tr>
					<th class="td1">이메일 <span class="required-addon">*</span></th>
					<td class="td2">
						<input type="text" id="uEmail" name="uEmail" maxlength="30"  style="width:300px;" class="input_add" value=""/>
					</td>
				</tr>    
				<tr>
				</tbody>
			</table>
	
			<div class=" sub1_tab_box">
				<div class="sub1_title">개인정보 수집 및 이용에 대한 안내</div>
				<div class="sub1_text">
					수집항목 : 성명(국문, 영문), 이메일, 비밀번호, 휴대폰번호<br/>
					수집목적 : 홈페이지 회원가입 및 관리, 민원사무 처리, 재화 또는 서비스 제공, 마케팅 및 광고에의 활용<br/>
					이용기한 : 수집ㆍ이용에 관한 동의일로부터 회원 탈퇴일까지<br/><br/>	
					<div style="border-top:1px dashed #d6d6d6;font-size:14px;color:#252525;line-height:34px;padding-top:15px;">
					
					<input type="checkbox" name="mem_agree" id="mem_agree"> <label for="mem_agree">이용약관에 동의합니다. </label>
					<a href="/mem_join_terms.html" target="_blank" class="fColor1">[전문보기]</a>
					<div id="mem_agree-errmsg"></div>
					<br>
					<input type="checkbox" name="data_agree" id="data_agree"> <label for="data_agree">개인정보 수집 및 이용에 동의 합니다. </label> 
					<a href="/mem_data_terms.html" target="_blank" class="fColor1">[전문보기]</a>
					<div id="data_agree-errmsg"></div>
					</div>
				</div>
			</div>
			<table>
			  <tr>
			    <td style="padding-right:9px;">
					<button type="submit"  class="next_button">회원가입</button>
				</td>
				<td><button type="button" th:onClick="|location.href='@{./loginForm}'|" class="cancel_button">취소</button></td>
			  </tr>
			</table>	
		</form>
	</div>
	<!-- //오른쪽 내용 -->
	</body>
</html>
