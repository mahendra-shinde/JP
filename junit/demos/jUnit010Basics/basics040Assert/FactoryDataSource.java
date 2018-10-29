package com.jUnit010Basics.basics040Assert;

public class FactoryDataSource {
	private static FactoryDataSource factory;
	
	private FactoryDataSource(){
		
	}
	
	public static FactoryDataSource getInstance(){
		if (factory == null){
			factory = new FactoryDataSource();
		}
		return factory;
	}
}
