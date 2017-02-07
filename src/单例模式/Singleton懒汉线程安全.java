package 单例模式;
/*
 * （懒汉，线程安全,效率很低）：
 */
public class Singleton懒汉线程安全 {
	
    private static Singleton懒汉线程安全 instance;  
    private Singleton懒汉线程安全 (){
    	
    }  
    public static synchronized Singleton懒汉线程安全 getInstance() {  
	    if (instance == null) {  
	        instance = new Singleton懒汉线程安全();  
	    }  
	    return instance;  
    }  
}
