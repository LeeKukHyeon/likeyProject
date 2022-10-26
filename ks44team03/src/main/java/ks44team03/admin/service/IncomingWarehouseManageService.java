package ks44team03.admin.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks44team03.admin.controller.IncomingWarehouseManageController;
import ks44team03.admin.mapper.IncomingWarehouseManageMapper;
import ks44team03.common.mapper.CommonMapper;
import ks44team03.common.mapper.FileMapper;
import ks44team03.common.util.FileUtil;
import ks44team03.dto.Nodata;

@Service
@Transactional
public class IncomingWarehouseManageService {
	
	private static final Logger log = LoggerFactory.getLogger(IncomingWarehouseManageController.class);
	//의존성 주입
	private final FileUtil fileUtil;
	private final FileMapper fileMapper;
	private final IncomingWarehouseManageMapper incomingWarehouseManageMapper;
	private final CommonMapper commonMapper;
	
	public IncomingWarehouseManageService(IncomingWarehouseManageMapper incomingWarehouseManageMapper, CommonMapper commonMapper, FileUtil fileUtil, FileMapper fileMapper) {
		this.incomingWarehouseManageMapper = incomingWarehouseManageMapper;
		this.commonMapper = commonMapper;
		
		this.fileUtil = fileUtil;
		this.fileMapper = fileMapper;
	}
	
	//노데이터 입고등록
	public int regNodata(Nodata nodata) {
		String newNodataManageCode = commonMapper.getCommonPkCode("nodata_manage", "nodata_manage_code");
		nodata.setNodataManageCode(newNodataManageCode);
		
		int result = incomingWarehouseManageMapper.regNodata(nodata);
		
		return result;
	}
}
