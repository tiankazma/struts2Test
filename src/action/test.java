package action;

import com.opensymphony.xwork2.ActionSupport;

public class test extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String userName;

	public String execute() throws Exception {

		if (userName == null || "".equals(userName)) {
			return ERROR;
		} else {
			return SUCCESS;
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
