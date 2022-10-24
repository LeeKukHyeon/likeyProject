package ks44team03.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.FileDto;

@Mapper
public interface FileMapper {

	//파일 경로 삽입
	public int addFile(List<FileDto> fileList); 
	
	//파일리스트
	public List<FileDto> getFileList(boolean fileIsLocal);
	
	//파일인덱스
	public FileDto getFileInfoByIdx(String fileIdx, boolean fileIsLocal);
	
	//입고 파일 경로 삽입
	public int addIncomingFile(List<FileDto> fileList);
}
