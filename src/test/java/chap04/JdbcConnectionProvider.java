package chap04;

import java.sql.Connection;

public class JdbcConnectionProvider implements ConnectionProvider{

	private String driver;
	private String user;
	private String password;
	private String url;
	
	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void init(){
		System.out.printf("�ʱ�ȭ ��[%s,%s,%s,%s]\n",driver,url,user,password);
	}
	@Override
	public Connection getConection() {
		System.out.println("JdbcConnectionProvider: "+url+"���� ����");
		return null;
	}

}
