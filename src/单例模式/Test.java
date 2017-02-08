package 单例模式;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test implements Callable<Object>{
	
	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("后调用线程的方法。。。。。。。。。。");
		return Singleton2.getInstance();
	}

	
	

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		Singleton singleton=Singleton.getInstance();
		Singleton singleton2=Singleton.getInstance();
		print(singleton, singleton2);
		
		Singleton2 instance2=Singleton2.getInstance();
		ExecutorService executorService=Executors.newFixedThreadPool(10);
		Future future=executorService.submit(new Test());
		Singleton2 instance=(Singleton2) future.get();
		print(instance, instance2);
		
	}
	
	private static void print(Object object1,Object object2){
		System.out.println("singleton"+object1);
		System.out.println("singleton"+object2);
		System.out.println("singleton==singleton2     "+(object1==object2));
	}

	

}
