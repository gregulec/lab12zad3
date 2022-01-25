package lab12zad3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab12zad3 {

    public static void main(String[] args) {
       Counter counter = new Counter();
       Thread t1=new Thread(
               () -> {
                   for (int i=0;i<1000;i++){
                       counter.add(1);
                   }
       });
       Thread t2=new Thread(
               () -> {
                   for (int i=0;i<1000;i++){
                       counter.add(1);
                   }
       });
       Thread t3 = new Thread(
               () -> {
                   for (int i=0;i<1000;i++){
                       counter.add(1);
                   }
       });
       t1.start();
       t2.start();
       t3.start();
       
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ex) {
           System.out.println("Exception");
        }
       
       
       System.out.println(counter.getCount());
    }
    
}
