package thread;

class PrintMessgae extends Thread {
	private String message;
	
	public PrintMessgae(String message) {
		this.message=message;
	}
	public void run() {
		while(true) {
			System.out.println(message);
			step();
			try {
                // sleep method is used to hold the thread for some time
                Thread.sleep(500); // 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
		}
	}
	public void step() {
		try {
            // sleep method is used to hold the thread for some time
            Thread.sleep(200); // 500 milliseconds
        } catch (InterruptedException e) {
            System.out.println(e);
        }
	}
	
}
public class Printing{
	public static void main(String args[]) {
		PrintMessgae t1=new PrintMessgae("Good Morning");
		PrintMessgae t2=new PrintMessgae("Welcome");
		t1.start();
		t2.start();
	}
}