import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        System.out.println (SumAverage.sum ( 1,100 ));
        int[] arr = {1,1,1};
        System.out.println (SumAverage.sum (arr));

        System.out.println (SumAverage.average ( 1,100 ));
    }
}
