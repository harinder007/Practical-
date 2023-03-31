package Threading;

public class Sleep_method  extends Thread{
    public void run() {//predefine method
        for(int i=0;i<=5;i++) {//012345---012345
            try {
                Thread.sleep(800);//thread will sleep for 800 mili sec
            }
            catch(InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {//main mathod
        Sleep_method t= new Sleep_method();
        Sleep_method t1= new Sleep_method();
        Sleep_method t2= new Sleep_method();
        t.start();
        t1.start();
        t2.start();
    }
    }