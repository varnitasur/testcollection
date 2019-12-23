package userlaptop;

import java.util.List;
import java.util.Map;

public class User {
	
	private int userId;
	private String UserName;
	Map<Laptop,List<Movies>> map;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String userName, Map<Laptop, List<Movies>> map) {
		super();
		this.userId = userId;
		UserName = userName;
		this.map = map;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public Map<Laptop, List<Movies>> getMap() {
		return map;
	}
	public void setMap(Map<Laptop, List<Movies>> map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", UserName=" + UserName + ", map=" + map + "]";
	}
	
	

}
