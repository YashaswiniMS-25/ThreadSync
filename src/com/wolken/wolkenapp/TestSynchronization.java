package com.wolken.wolkenapp;

public class TestSynchronization {
	public static void main(String[] args) {
		System.out.println("Thread is"+Thread.currentThread().getId());
		System.out.println("Thread is"+Thread.currentThread().getName());
		
		Table t=new Table();
		Thread1 t1= new Thread1(t);
		System.out.println("State of thread1 is"+t1.getState());
		Thread2 t2=new Thread2(t);
		System.out.println("State of thread2 is"+t2.getState());
		
		t1.start();
		t2.start();
		
		
		  thread3 t3=new thread3(t);
		 
		  
		  Thread th=new Thread(t3);
		 System.out.println("State of thread3 is"+th.getState());
		  th.start();
		 
		
		
		
		
		
	}

}
class Thread1 extends Thread{
Table t;
	public Thread1(Table t) {
		this.t=t;
		
	}
	@Override
	public void run() {
		
		System.out.println("Thread is"+Thread.currentThread().getId());
		System.out.println("Thread is"+Thread.currentThread().getName());
		t.TableOf(21);
		
	}
	
	
}
class Thread2 extends Thread{
	Table t=new Table();
	public Thread2(Table t) {
		
		this.t=t;
	}
	
	@Override
	public void run() {
		
		System.out.println("Thread is"+Thread2.currentThread().getId());
		System.out.println("Thread is"+Thread.currentThread().getName());
		
		t.TableOf(23);
	}
	
}
class thread3 implements Runnable{
	Table t;
	public thread3(Table t2) {
		// TODO Auto-generated constructor stub
		this.t=t2;
	}
	
	public void run() {
		System.out.println("Thread is"+Thread.currentThread().getId());
		System.out.println("Thread is"+Thread.currentThread().getName());
		
		t.TableOf(24);
		
	}
}
class Table{
	synchronized void TableOf(int tableOf) {
		for (int i = 0; i < 10; i++) {
			System.out.println(tableOf +"*"+i+"="+(tableOf*i));
			
			
		}
	}
	
}
