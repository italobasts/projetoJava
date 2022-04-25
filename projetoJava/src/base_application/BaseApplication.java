package base_application;

import java.util.ArrayList;

import model.User;

public class BaseApplication {
	public ArrayList<User> users;
	
	private static BaseApplication instace;
	
	private BaseApplication() {}
	
	public static BaseApplication getInstance() {
		if(instace == null) {
			instace = new BaseApplication(); 
		}
		return instace;
		
	}
}
