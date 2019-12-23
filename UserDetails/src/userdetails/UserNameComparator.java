package userdetails;

import java.util.Comparator;

public class UserNameComparator implements Comparator<UserEntity> {

	@Override
	public int compare(UserEntity u1, UserEntity u2) {
		 if (u1.getUserName().compareTo(u2.getUserName())==0)
			 return 0; 
	        if (u1.getUserName().compareTo(u2.getUserName())>0) 
	        	return 1; 
	        else return -1; 
		
	}

}
