
public class RunnableExample {
	
	public static void main(String[] args) {
		
		
		Runnable r = new Runnable(){

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				
			}
			
		};
		
		Thread childThread = new Thread(r,"childthread");
		
		childThread.start();
		
		Runnable r2=()->System.out.println(Thread.currentThread().getName());
		
		Thread childThread2 = new Thread(r,"secondthread");
		
		childThread2.start();
	}

}
