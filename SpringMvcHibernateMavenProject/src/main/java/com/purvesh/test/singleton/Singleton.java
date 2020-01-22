package com.purvesh.test.singleton;

public class Singleton {

	private static final Singleton obj = new Singleton(); //eager initialization
	private Singleton() {}
	
	public static Singleton getInstance() {
		return obj;
	}
}


//Lazy initialization
class Singleton1{
	private static Singleton1 obj;
	
	private Singleton1() {}
	
	public static Singleton1 getInstance() {
		if(obj == null) {
			obj= new Singleton1();
		}
		return obj;
	}
	
}

//Thread Safe singleton
class ThreadSafeSingleton{
	private static volatile ThreadSafeSingleton obj;
	private ThreadSafeSingleton(){}
	
	public static synchronized ThreadSafeSingleton getInstance() {
		if(obj==null) {
			obj=new ThreadSafeSingleton();
		}
		return obj;
	}
}

//double checked locking singleton
class DoubleCheckSingleton{
	
	private static volatile DoubleCheckSingleton obj; //*IMP volatile keyword
	
	private DoubleCheckSingleton() {}
	
	public static  DoubleCheckSingleton getInstance(){
		if(obj== null) {
			synchronized(DoubleCheckSingleton.class){ //**IMP : // dont use instance because static
				if(obj==null){
					obj = new DoubleCheckSingleton();
				}
				
			}
		}
		return obj;
	}
}


//inner class

class InnerSingleton {
	private InnerSingleton(){}
	
	private static class InnerSingletonHelper{
		private static final InnerSingleton INSTANCE = new InnerSingleton();
	}
	
	public static InnerSingleton getInstance() {
		return InnerSingletonHelper.INSTANCE;
	}
}