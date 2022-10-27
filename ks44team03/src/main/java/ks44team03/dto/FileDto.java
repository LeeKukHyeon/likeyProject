package ks44team03.dto;

public class FileDto {

	private String fileIdx;
	private String fileOriginalName;
	private String fileNewName;
	private String filePath;
	private Long fileSize;
	private boolean fileIsLocal;
	private String newCommunityCode;
	private String newIncomingCode;
	
	public String getFileIdx() {
		return fileIdx;
	}
	public void setFileIdx(String fileIdx) {
		this.fileIdx = fileIdx;
	}
	public String getFileOriginalName() {
		return fileOriginalName;
	}
	public void setFileOriginalName(String fileOriginalName) {
		this.fileOriginalName = fileOriginalName;
	}
	public String getFileNewName() {
		return fileNewName;
	}
	public void setFileNewName(String fileNewName) {
		this.fileNewName = fileNewName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public Long getFileSize() {
		return fileSize;
	}
	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}
	public boolean isFileIsLocal() {
		return fileIsLocal;
	}
	public void setFileIsLocal(boolean fileIsLocal) {
		this.fileIsLocal = fileIsLocal;
	}
	public String getNewCommunityCode() {
		return newCommunityCode;
	}
	public void setNewCommunityCode(String newCommunityCode) {
		this.newCommunityCode = newCommunityCode;
	}
	public String getNewIncomingCode() {
		return newIncomingCode;
	}
	public void setNewIncomingCode(String newIncomingCode) {
		this.newIncomingCode = newIncomingCode;
	}
	
	@Override
	public String toString() {
		return "FileDto [fileIdx=" + fileIdx + ", fileOriginalName=" + fileOriginalName + ", fileNewName=" + fileNewName
				+ ", filePath=" + filePath + ", fileSize=" + fileSize + ", fileIsLocal=" + fileIsLocal
				+ ", newCommunityCode=" + newCommunityCode + ", newIncomingCode=" + newIncomingCode + "]";
	}
	
	
	
	
	
}
