/*
 * package ks44team03.admin.service;
 * 
 * import java.util.List;
 * 
 * import org.slf4j.Logger; import org.slf4j.LoggerFactory; import
 * org.springframework.stereotype.Service; import
 * org.springframework.transaction.annotation.Transactional;
 * 
 * import ks44team03.admin.controller.ForwardingController; import
 * ks44team03.admin.mapper.ForwardingMapper; import
 * ks44team03.common.mapper.CommonMapper; import ks44team03.dto.IncomingInfo;
 * 
 * @Service
 * 
 * @Transactional public class ForwardingService {
 * 
 * private static final Logger log =
 * LoggerFactory.getLogger(ForwardingController.class); //의존성 주입 private final
 * ForwardingMapper forwardingMapper; private final CommonMapper commonMapper;
 * 
 * public ForwardingService(ForwardingMapper forwardingMapper, CommonMapper
 * commonMapper) { this.forwardingMapper = forwardingMapper; this.commonMapper =
 * commonMapper; }
 * 
 * //출고 등록 대기 목록 public List<IncomingInfo> regForwarding(){ List<IncomingInfo>
 * regForwarding = forwardingMapper.regForwarding();
 * 
 * return regForwarding; }
 * 
 * 
 * }
 */