package com.designpattern.structural.proxy;

public class DatabaseExecuterImpl implements DatabaseExecuter{

	@Override
	public void executeDatabase(String query) throws Exception {
		System.out.println("Successfully executed query : "+query);
	}

}
