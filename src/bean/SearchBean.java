package bean;

public class SearchBean {
	private String access_token;
	private String keyword;
	
	
	public SearchBean() {

	}
	public SearchBean(String access_token, String keyword) {
		this.access_token = access_token;
		this.keyword = keyword;
	}
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	
}
