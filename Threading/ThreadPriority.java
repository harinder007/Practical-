package Threading;
 public class ThreadPriority extends Thread{
    public void run() {//pre define method
        for(int i=0;i<5;i++) {
        try {
            Thread.sleep(200);//break for a time inside single thread
        }
        catch(InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(i);
    }}
    public static void main(String[] args) {//main method
        ThreadPriority t1= new ThreadPriority();//main class with object1
        ThreadPriority t2= new ThreadPriority();//main class with object2
        ThreadPriority t3= new ThreadPriority();//main class with object3
        t2.setPriority(MAX_PRIORITY);//to set the max priority---10
        System.out.println(t2.getPriority());//print the maximum thread
        System.out.println(Thread.currentThread().getPriority()+" "+Thread.currentThread());
        //it will print one by one
    t1.start();//0--1--2
    t2.start();//0--1--2
    t3.start();//0--1--2
    t1.setName("Harinder");
    System.out.println(t1.getName());
    }
    }