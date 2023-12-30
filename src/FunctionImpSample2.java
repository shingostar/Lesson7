import java.util.function.Function;

public class FunctionImpSample2 {

    public static void main(String[] args) {
        Function<Integer,Integer> f = new Function<Integer,Integer>(){


        public Integer apply(Integer i) {
            return i * 2;
            }
        };
        System.out.println(f.apply(2));
    }
}
