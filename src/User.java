import java.util.HashSet;
import java.util.Set;

public class User {
	
	private String username;
	private String password;

	public static Set<User> users;

	static {
		users = new HashSet<User>();
		users.add(new User("admin", "1234"));
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static boolean validate(String username, String password) {
		for (User user: users) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	public static User findUser(String username) {
		for (User user: users) {
			if (user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}
}
