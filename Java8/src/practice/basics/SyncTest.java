package practice.basics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class SyncTest {

    private static class Counter implements Runnable{

	private int length;
	private String name;

	Counter(int length, String name){
	    this.length = length;
	    this.name = name;

	}

	public void run(){
	    for(int i = 0; i<length; i++){
		System.out.print(name+" ");
		System.out.println(i);

	    }
	}

    }

    public static void main(String[] args) {

	ExecutorService executer = Executors.newFixedThreadPool(10);

	executer.execute(new Counter(10, "takemotto"));
	executer.execute(new Counter(15,"answer"));
	executer.execute(new Counter(20, "kosuke"));


    }

}
