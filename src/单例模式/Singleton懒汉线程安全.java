package ����ģʽ;
/*
 * ���������̰߳�ȫ,Ч�ʺܵͣ���
 */
public class Singleton�����̰߳�ȫ {
	
    private static Singleton�����̰߳�ȫ instance;  
    private Singleton�����̰߳�ȫ (){
    	
    }  
    public static synchronized Singleton�����̰߳�ȫ getInstance() {  
	    if (instance == null) {  
	        instance = new Singleton�����̰߳�ȫ();  
	    }  
	    return instance;  
    }  
}
