package com.votingSystem;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private static List<User> listOfUsers = new ArrayList<>();

	public static List<User> maxage(int max_age) {
		ArrayList<User> userList = new ArrayList<>();
		int thisYear = Year.now().getValue();
		for (User v : listOfUsers) {
			if ((thisYear - Integer.parseInt(v.getDob().split("/")[2])) > max_age) {
				
			int s	= (thisYear - Integer.parseInt(v.getDob().split("/")[2]));
			String age =Integer.toString(s);
				User vs = new User();
				vs.setName(v.getName());
				vs.setAge(age);
				 
				userList.add(vs);
			}
		}
		return userList;
	}

	public static User addUser(User user) {
		listOfUsers.add(user);
		return user;

	}

	public static List<User> getUsers(int count) {
		return count > listOfUsers.size() ? new ArrayList<>(listOfUsers): new ArrayList<>(listOfUsers.subList(0, count));
	}

}
