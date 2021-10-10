package io1.a.points.to.ponder;

public class OddEven {

	public static void main(String[] args) {

		Messenger msg = new Messenger();
		msg.isOdd = true;
		
		Printer printer  = new Printer(msg);
		
		Even t1 = new Even(printer);
		Odd t2 = new Odd(printer);
		
		t2.start();
		t1.start();
		
		
	}

}




class Even extends Thread{
	
	Printer printer;
	
	public Even(Printer printer) {
		this.printer = printer;
	}
	
	@Override
	public void run() {
	
		for(int i = 2; i <=10; i+=2) {
			try {
				printer.printEven(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}


class Odd extends Thread{
	
	Printer printer;
	
	public Odd(Printer printer) {
		this.printer = printer;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <=9; i+=2) {
			try {
				printer.printOdd(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}



class Printer{
	
	private Messenger messenger;
	
	public Printer(Messenger messenger) {
		this.messenger = messenger;
	}
	
	public void printOdd(int n) throws InterruptedException {
		
		synchronized (messenger) {
			if(messenger.isOdd == true) {
				System.out.println(n);
			}else {
				messenger.wait();
				System.out.println(n);
			}
			
			messenger.isOdd = false;
			messenger.notify();
		}
	}
	
	public void printEven(int n) throws InterruptedException {
		
		synchronized (messenger) {
			if(messenger.isOdd == false) {
				System.out.println(n);
			}else {
				messenger.wait();
				System.out.println(n);
			}
			
			messenger.isOdd = true;
			messenger.notify();
		}
	}
}




class Messenger{
	public boolean isOdd = true;
}





