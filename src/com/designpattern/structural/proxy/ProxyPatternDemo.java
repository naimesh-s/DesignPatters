package com.designpattern.structural.proxy;

public class ProxyPatternDemo {

	public static void main(String[] args) throws Exception {
		String username = "Admin";
		String password = "Admin123";
		
		String query = "DELETE";
		DatabaseExecuter dbexe = new DatabaseExecuterProxyImpl(username, password);
		dbexe.executeDatabase(query);
	}

}
