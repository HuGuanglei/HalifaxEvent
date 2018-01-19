package com.guanglei.HttpRequest;
/*
public class EventDemo extends Thread {
		int mounth = 0;
		EventDemo(int num){
			mounth = num;
		}
		HalifaxEvent event=new HalifaxEvent();
		
		public void run(){
			event.getEventByMounth(mounth);
		}
		
		public static void main(String[] args) {
			EventDemo h1=new EventDemo(1);
			EventDemo h2=new EventDemo(2);
	        h1.start();
	        h2.start();
	    }

		
}
*/

public class EventDemo implements Runnable {
    int mounth;
    public EventDemo(int x) {
        mounth = x;
    }
    HalifaxEvent event=new HalifaxEvent();
    public void run() {
    	event.getEventByMounth(mounth);
    }
    static public void main(String args[]) {
    	 Thread t1 = new Thread (new EventDemo(1));
         t1.start();
         Thread t2 = new Thread (new EventDemo(2));
         t2.start();
   
    }

}

