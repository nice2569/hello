import java.nio.channels.*;
import java.util.logging.*;

class Runner {
	public static void main(String[] args) {
		MyThread t1= new MyThread();
		t1.start();
		
	}
}
class MyThread extends Thread{ 
	public void run(){
		for (int i=0;i<=10;i++) {
			try {
				System.out.println("hello"+i);
				Thread.sleep(1000);
				} catch (InterruptedException ex) {
					Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null,ex);
			}	
		}
	}
}