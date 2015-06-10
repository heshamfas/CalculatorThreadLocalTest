import java.util.HashMap;
import java.util.Objects;

/**
 * Created by root on 6/10/15.
 */
public abstract class Calculator {
    private static ThreadLocal<HashMap<Object,Object>> results = new ThreadLocal<HashMap<Object,Object>>(){

        protected HashMap<Object, Object> initialValue(){
            return new HashMap<Object, Object>();
        }
    };

    public Object calculate(Object param){

        HashMap<Object,Object> hm = results.get();
        Object o = hm.get(param);
                if(o!= null){
                    return o;
                }
        o = doLocalCalculate(param);
        return o;
    }

    protected abstract Object doLocalCalculate(Object param);
}
