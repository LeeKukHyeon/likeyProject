package ks44team03.dto;

public class ManagementLevel {
	
	private String eLevelCode;
	private String eLevelName;
	
	public String geteLevelCode() {
		return eLevelCode;
	}
	public void seteLevelCode(String eLevelCode) {
		this.eLevelCode = eLevelCode;
	}
	public String geteLevelName() {
		return eLevelName;
	}
	public void seteLevelName(String eLevelName) {
		this.eLevelName = eLevelName;
	}
	
	@Override
	public String toString() {
		return "ManagementLevel [eLevelCode=" + eLevelCode + ", eLevelName=" + eLevelName + "]";
	}
	
}
