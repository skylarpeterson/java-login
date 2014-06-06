package login;

import java.util.HashMap;

public class AccountManager {
	
	private HashMap<String, String> users;

	public AccountManager() {
		users = new HashMap<String, String>();
		users.put("Patrick","1234");
		users.put("Molly","FloPup");
	}
	
	public boolean userExists(String username){
		return users.containsKey(username);
	}
	
	public boolean passwordCorrect(String username, String password){
		return password.equals(users.get(username));
	}
	
	public void createAccount(String username, String password) {
		users.put(username, password);
	}
	
}
