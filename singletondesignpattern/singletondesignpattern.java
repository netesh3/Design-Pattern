package com.netesh;

public class singletondesignpattern {
	public static volatile singletondesignpattern instance = null;

	private singletondesignpattern() {
		System.out.println("Singalton Constructor");
	}

	public static singletondesignpattern getInstance() {
		if (instance == null) {
			synchronized (singletondesignpattern.class) {
				if (instance == null) {
					instance = new singletondesignpattern();
					System.out.println("Object is created");
				}
			}
		}
		System.out.println("Object is allready created");
		return instance;
	}

	public static int m1(int a, int b) {
		return a + b;
	}
}
