package thread;

class Mythread extends Thread{
	public void run() {
		System.out.println("Thread: "+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	}
}
public class ThreadPriority {
	public static void main(String args[]) {
		Mythread t1=new Mythread();
		Mythread t2=new Mythread();
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(5);
		
		t1.start();
		t2.start();
	}
}