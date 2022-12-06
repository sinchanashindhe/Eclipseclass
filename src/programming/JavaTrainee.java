package com.src.programming;

public abstract class JavaTrainee extends Person implements Xworkzrule {

	public abstract String training();
	public abstract boolean excecuteprogram();

	@Override
	String eat() {
		System.out.println("Running eat");
		return null;
	}

	@Override
	public boolean uploadedTask() {
		System.out.println("Running uploadedTask");
		return false;
	}

	@Override
	public boolean completedTask() {
		System.out.println("Running completedTask");
		return false;
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


