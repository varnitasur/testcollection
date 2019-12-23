package userlaptop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UserApplication {

	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		Set<User> users = addUsers();
		displayUsers(users);

	}

	private static void displayUsers(Set<User> users) {
		System.out.println("All Users details are- ");
		
		for (User user : users) {
			System.out.println("User Id- " + user.getUserId());
			System.out.println("user name" + user.getUserName());
			Map<Laptop,List<Movies>> set= user.getMap();
			for (Map.Entry m : set.entrySet()) {
				System.out.println(m.getKey().toString() + " " + m.getValue().toString());
			}
		}
	}

	private static Set<User> addUsers() {
		System.out.println("Enter Number of users- ");
		int n =sc.nextInt();
		Set<User> users=new HashSet<User>();
		for(int i=0; i<n; i++)
		{
			User user=new User();
			System.out.println("Enter User Id- ");
			user.setUserId(sc.nextInt());
			System.out.println("Enter User name- ");
			user.setUserName(sc.next());
			System.out.println("Enter Number of laptops you want");
			int l=sc.nextInt();
			Map<Laptop, List<Movies>>map=new HashMap<Laptop, List<Movies>>();
			for(int j=0; j<l; j++)
			{
				Laptop laptop=new Laptop();
				System.out.println("Enter laptop Id- ");
				laptop.setLaptopId(sc.nextInt());
				System.out.println("Enter laptop name- ");
				laptop.setLaptopName(sc.next());
				System.out.println("Enter Number of Movies- ");
				int m=sc.nextInt();
				List<Movies> movies=new ArrayList<Movies>(); 
				for(int k=0; k <m; k++)
				{ Movies movie=new Movies();
					System.out.println("Enter Movie Name");
					movie.setMovieName(sc.next());
					movies.add(movie);
				}
				map.put(laptop, movies);	
			}
			user.setMap(map);
			users.add(user);
		}
		return users;
	}

		
	}
