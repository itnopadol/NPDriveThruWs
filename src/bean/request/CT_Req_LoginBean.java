package bean.request;

public class CT_Req_LoginBean {
	private String user_code;
	private String password;
	private String company_id;
	private String zone_id;
	
	
	public CT_Req_LoginBean() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CT_Req_LoginBean(String user_code, String password,
			String company_id, String zone_id) {
		super();
		this.user_code = user_code;
		this.password = password;
		this.company_id = company_id;
		this.zone_id = zone_id;
	}


	public String getUser_code() {
		return user_code;
	}


	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getCompany_id() {
		return company_id;
	}


	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}


	public String getZone_id() {
		return zone_id;
	}


	public void setZone_id(String zone_id) {
		this.zone_id = zone_id;
	}


	
}
