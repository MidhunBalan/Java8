package com.predicate;

import java.util.function.Predicate;

public class Example7 {

	public static void main(String[] args) {
		User user= new User("Midhun", "mypassword");
		Predicate<User> authenticate = u -> u.username.equals("Midhun")&& u.password.equals("mypassword");
		System.out.println("Authenticate:"+authenticate.test(user));
		System.out.println("Authenticate:"+authenticate.test(new User("Midhun", "oldpassword")));
	}

}

class User{
	 String username;
	 String password;
	
	User(String username, String password){
		this.username = username;
		this.password = password;
	}
}
