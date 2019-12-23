package userdetails;

public class UserEntity implements Comparable<UserEntity>{
	
	private int userId;
	private String userName;
	private int userMark;
	private int userAge;
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserEntity(int userId, String userName, int userMark, int userAge) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userMark = userMark;
		this.userAge = userAge;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserMark() {
		return userMark;
	}
	public void setUserMark(int userMark) {
		this.userMark = userMark;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", userName=" + userName + ", userMark=" + userMark + ", userAge="
				+ userAge + "]";
	}

@Override
public int compareTo(UserEntity other) {
     int result = this.getUserAge()-other.getUserAge();
     if (result == 0) {
          result = this.getUserMark()-other.getUserMark();
     }
     if (result == 0) {
          result = this.getUserName().compareTo(other.getUserName());
     }
     return result;
}

	

}
