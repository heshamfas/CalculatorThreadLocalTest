/**
 * Created by root on 6/10/15.
 */
public class mainClass {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int nThreads = Integer.parseInt(args[0]);
        for (int i=0; i<nThreads; i++){
            Thread t = new Thread(new CalculatorTest(),"thread number " + i);
            t.start();
        }

    }
}
