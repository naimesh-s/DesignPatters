package com.designpattern.structural.proxy;

public class DatabaseExecuterProxyImpl implements DatabaseExecuter{
	
	boolean isAdmin;
	DatabaseExecuterImpl databaseExecuter;
	
	public DatabaseExecuterProxyImpl(String username, String password) {
		if(username.equalsIgnoreCase("Admin") && password.equals("Admin123")) {
			this.isAdmin = true;
		}
		databaseExecuter = new DatabaseExecuterImpl();
	}
	
	@Override
	public void executeDatabase(String query) throws Exception {
		if(isAdmin) {
			databaseExecuter.executeDatabase(query);
		} else {
			if(query.equals("DELETE")) {
				throw new Exception("Delete operation for non-admin  users are not allowed. Please contact your administrator!!!");
			}else {
				databaseExecuter.executeDatabase(query);
			}
		}
	}

}
