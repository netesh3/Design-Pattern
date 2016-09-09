package com.netesh;

public class SingletonClient {

	public static void main(String[] args) {
		System.out.println("Singalton Client");
		singletondesignpattern s = singletondesignpattern.getInstance();
		if(s!=null){
			int sum=s.m1(1, 12);
			System.out.println(sum);
			System.out.println(s.m1(11, 11));
			System.out.println(s.m1(11, 22));
		}
	}

}
