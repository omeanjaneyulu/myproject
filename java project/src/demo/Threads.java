package demo;

public class Threads {
	
		public static void main(String[] args) {
		Shop c = new Shop();
		Producer p = new Producer(c,1);
		Consumer co = new Consumer(c, 1);
		p.start();
		co.start();

		}
		}
		 class Shop {
		private int materials;
		private boolean available = false;

		public synchronized int get() {
		while(available == false) {
		try {
		wait();
		}
		catch(Exception ie) {
		}
		}available = false;
		notifyAll();
		return materials;
		}

		public synchronized void put(int value) {
		while(available == true) {
		try {
		wait();
		}
		catch(Exception ie) {
		ie.printStackTrace();
		}
		}
		materials = value;
		available = true;
		notifyAll();
		}
		}

		class Consumer extends Thread {
		private Shop shop;
		private int number;

		public Consumer(Shop c, int number) {
		shop = c;
		this.number = number;
		}
		public void run() {
		int value = 0;
		for(int i=0; i<10; i++) {
		value = shop.get();
		System.out.println("consuming value" +this.number+ "=" +value);
		}
		}
		}

		class Producer extends Thread {
		private Shop shop;
		private int number;

		public Producer(Shop c, int number) {
		shop = c;
		this.number = number;
		}

		public void run() {
		for(int i=0; i<10; i++) {
		shop.put(i);
		System.out.println("product value" +this.number+ "=" +i);
		try {
		sleep((int)(Math.random()*100));
		}
		catch(Exception ie) {
		ie.printStackTrace();
		}
		}

		}
		}


