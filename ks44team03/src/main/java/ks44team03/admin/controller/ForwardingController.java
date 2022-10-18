/*
 * package ks44team03.admin.controller;
 * 
 * import java.util.List;
 * 
 * import org.slf4j.Logger; import org.slf4j.LoggerFactory; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RequestParam;
 * 
 * import ks44team03.admin.service.ForwardingService; import
 * ks44team03.dto.IncomingInfo;
 * 
 * @Controller public class ForwardingController {
 * 
 * private static final Logger log =
 * LoggerFactory.getLogger(ForwardingController.class);
 * 
 * private ForwardingService forwardingService;
 * 
 * 
 * public ForwardingController(ForwardingService forwardingService) {
 * this.forwardingService = forwardingService;
 * 
 * }
 * 
 * //출고 등록 대기 목록
 * 
 * @GetMapping("/forwardingRegister") public String
 * regForwarding(@RequestParam(value="goodsInfoCode", required = false) String
 * goodsInfoCode, Model model) { List<IncomingInfo> regForwarding =
 * forwardingService.regForwarding();
 * 
 * log.info("goodsInfoCode ::::" + goodsInfoCode);
 * 
 * model.addAttribute("title", "출고 등록");
 * model.addAttribute("regForwarding",regForwarding); return
 * "forwardingManagement/forwardingRegister"; }
 * 
 * }
 */