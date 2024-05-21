package beans;
import java.io.Serializable;

public class User {
    	private static final long serialVersionUID = 1L;

		private String fname;
		private String lname;
		private String Username;
		private String email;
		private String password;
		
		
		public User(){}
		
		public User(String fname, String lname, String Username, String email, String password) {
			this.fname = fname;
			this.lname = lname;
			this.Username = Username;
			this.email = email;
			this.password = password;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getUsername() {
			return Username;
		}

		public void setUsername(String username) {
			Username = username;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

}
