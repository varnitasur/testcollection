package userdetails;

import java.util.Comparator;

public class UserMarksComparator implements Comparator<UserEntity>{

	@Override
	public int compare(UserEntity u1, UserEntity u2) {
		 if (u1.getUserMark() < u2.getUserMark())
			 return -1; 
	        if (u1.getUserMark() > u2.getUserMark()) 
	        	return 1; 
	        else return 0; 
		
	}


}
