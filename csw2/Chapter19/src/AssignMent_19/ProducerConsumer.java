package AssignMent_19;

import java.util.LinkedList;

import java.util.Queue;
 class SharedResourcer {

	private Queue<Integer> q=new LinkedList<>();
	private int capacity;
	SharedResourcer(int capacity){
		this.capacity=capacity;

	}
	
	public void put(int i) throws InterruptedException{
		synchronized(this) {
			
			while(q.size()==capacity) 
				wait();
		
			q.add(i);
			System.out.println("Produced Value  "+ i);
			notify();
			
		}
	}
	public synchronized void get() { 
        while (q.isEmpty()) { 
            try { 
                wait(); 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            } 
        } 
        int value =q.remove(); 
        System.out.println("Consumed: " + value); 
        notify(); //return value; 
    } 
}
 
 
	
	class Producer extends Thread { 
	    private final SharedResourcer buffer; 
	    public Producer(SharedResourcer buffer) { 
	        this.buffer = buffer; 
	    } 
	    @Override
	    public void run() { 
	        try { 
	        for (int i = 1; i <= 5; i++) { 
	            buffer.put(i); 
	        }
	                Thread.sleep(500); 
	            } catch (InterruptedException e) { 
	                e.printStackTrace(); 
	            } 
	        } 
	    } 
	
	
		class Consumer extends Thread { 
	    private final SharedResourcer buffer; 
	    public Consumer(SharedResourcer buffer) { 
	        this.buffer = buffer; 
	    } 
	    public void run() { 
	        for (int i = 1; i <= 5; i++) { 
	            buffer.get(); 
	            try { 
	                Thread.sleep(1000); 
	            } catch (InterruptedException e) { 
	                e.printStackTrace(); 
	            } 
	        } 
	    } 
	} 
	
	
	public class ProducerConsumer { 
	    public static void main(String[] args) { 
	        SharedResourcer  buffer= new SharedResourcer(3); 
	        Producer producer = new Producer(buffer); 
	        Consumer consumer = new Consumer(buffer); 
	        producer.start(); 
	        consumer.start(); 
	        try { 
	            producer.join(); 
	            consumer.join(); 
	        } catch (InterruptedException e) { 
	            e.printStackTrace(); 
	        } 
	        System.out.println("Producer and Consumer have completed their tasks."); 
	    } 
	} 

