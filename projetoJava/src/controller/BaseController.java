package controller;

import java.util.ArrayList;

import base_application.BaseApplication;
import model.User;

public class BaseController {
	
	BaseApplication base;
	
	public void initBase() {
		base = BaseApplication.getInstance();
		base.users = new ArrayList<User>();
	}
	
	public void registerUser(User user) {
		base.users.add(user);
	}
	
	public void deleteUser(String email) {
		base.users.removeIf(user -> user.getEmail().equals(email));
	}
	
	public void showUsers() {
		for(User user : base.users) {
			System.out.println(user.getName());
			System.out.println(user.getEmail());
		}
	}
}
