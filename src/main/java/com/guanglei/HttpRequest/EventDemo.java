package com.guanglei.HttpRequest;

public class EventDemo extends Thread {
		EventDemo(){
			
		}
		HalifaxEvent event=new HalifaxEvent();
		
		public void run(){
			event.getFebruaryEvent();
			event.getJanuaryEvent();
		}
		
		public static void main(String[] args) {
			EventDemo h1=new EventDemo();
			EventDemo h2=new EventDemo();
	        h1.start();
	        h2.start();
	    }

		
}

