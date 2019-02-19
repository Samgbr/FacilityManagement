package com.fms.dal;
//
public class DBConfig {

	
	//Credentials will be created as instances
		private String username;
		private String password;
		private String databaseURL;
		private String databaseName;
		
		public DBConfig(){
			username="User1";
			password="dbUser1";
			databaseURL="jdbc:mysql://localhost:3306";
			databaseName="fms";
		}
		
		public String getUsername() {
			return username;
		}
		
		public String getPassword() {
			return password;
		}
		
		public String getDatabaseURL() {
			return databaseURL+"/"+getDatabaseName();
		}
		
		public String getDatabaseName() {
			return databaseName;
		}
		
}
