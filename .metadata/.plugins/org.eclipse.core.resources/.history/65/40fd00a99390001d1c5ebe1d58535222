package com.kFoods.control;

import com.kFoods.action.*;

public class ActionFactory {
	
	private static ActionFactory instance;
	
	private ActionFactory() {}
	
	public static synchronized ActionFactory getInstance() {
		if(instance == null) {
			instance = new ActionFactory();
		}
		return instance;
	}
	
	public Action getAction(String cmd) {
		Action action = null;
		
		switch (cmd) {
		
		case "signUp":
			action = new SignUpAction();
			break;
			
		case "signIn":
			action = new SignInAction();
			break;
			
		default:
			action = new IndexAction();
			break;
		}
	
		return action;
	}
	
}
