package thread;

public class Mythread implements Runnable{
	public void run(){
	      System.out.println("Thread Running");
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Thread thread=new Thread(new Mythread());
		thread.start();
	}
			 
}
