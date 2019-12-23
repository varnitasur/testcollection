package userdetails;

import java.util.Comparator;

public class UserAgeComparator implements Comparator<UserEntity> {

	@Override
	public int compare(UserEntity u1, UserEntity u2) {
		 if (u1.getUserAge() < u2.getUserAge())
			 return -1; 
	        if (u1.getUserAge() > u2.getUserAge()) 
	        	return 1; 
	        else return 0; 
		
	}

}
