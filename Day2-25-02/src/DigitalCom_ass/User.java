package DigitalCom_ass;

public class User implements IValidate {

	private String userid;
	private String password;

	public void addUser(String userid, String password) {
		this.userid = userid;
		this.password = password;
	}

	@Override
	public boolean isAuthenticated(String userid, String password) {

		if (this.userid == null || this.password == null) {
			return false;
		}

		return this.userid.equals(userid) && this.password.equals(password);
	}
}