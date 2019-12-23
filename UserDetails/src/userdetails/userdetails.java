package userdetails;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class userdetails {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the attributes of arraylist");
		List<UserEntity> users=Arrays.asList(new UserEntity(1,"A",50,34),
				new UserEntity(2,"B",45,23),
				new UserEntity(3,"C",60,31),
				new UserEntity(4,"D",70,21));
//		Collections.sort(users,new UserAgeComparator()
//				.thenComparing(new UserMarksComparator().thenComparing(new UserNameComparator())));
//		
		Collections.sort(users);
		for (UserEntity userEntity : users) {
			System.out.println(userEntity.toString());
		}
		
		
	}

}
