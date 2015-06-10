import java.util.InputMismatchException;

/**
 * Created by root on 6/10/15.
 */
public class CalculatorTest extends Calculator implements Runnable{



    @Override
    protected Object doLocalCalculate(Object param) {
        System.out.println("doing calculation of " + param + " in thread " + Thread.currentThread().getName());
        return param;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0 ; i < 30 ; i++){
            Integer p = new Integer(i%5);
            calculate(p);
        }


    }
}
