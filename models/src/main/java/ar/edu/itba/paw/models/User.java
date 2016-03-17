package ar.edu.itba.paw.models;

public class User {
	private final String username;
	private final String password;
	
	public User(final String username, final String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
}