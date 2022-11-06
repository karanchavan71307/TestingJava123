package com.thread;

public class CreatingThread {

	public static void main(String[] args) {


		
		Runnable run=() -> System.out.println("thread starting the task "+Thread.currentThread().getName());
		
		
		
		Thread t=new Thread(run);
		
		t.start();
		t.setName("karan");
		
		Thread t2=new Thread(run);
		t2.start();
		t2.setName("teju");
		

	}

}
