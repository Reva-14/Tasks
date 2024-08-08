package tasks;

public class SingleTon {
		    private static SingleTon singleInstance = null;
	    private SingleTon() {}
	    public static SingleTon getInstance() {
	        if (singleInstance == null) {
	            singleInstance = new SingleTon();
	        }
	        return singleInstance;
	    }
	    public void showMessage() {
	        System.out.println("Hello!");
	    }
	    public static void main(String[] args) {
	        SingleTon instance1 = SingleTon.getInstance();
	        SingleTon instance2 = SingleTon.getInstance();
	        System.out.println(System.identityHashCode(instance1)); 
	        System.out.println(System.identityHashCode(instance2));;
	        instance1.showMessage();
	}}