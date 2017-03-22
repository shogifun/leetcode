import java.util.LinkedList;
import java.util.regex.Matcher;

/**
 * Created by user on 22.03.2017.
 */
public class Problem204{
    private LinkedList<Integer> numbers=new LinkedList<>();
    public int countPrimes(int n) {
        int res=1;
        if((n==0)||(n==1)){
            return 0;
        }
        if (n==2){
            return 0;
        }
        numbers.addLast(2);
        for (int i=3;i<n;i+=2){
            if(isPrime(i)){
                res++;
                numbers.addLast(i);
            }
        }
        return res;
    }
    public boolean isPrime(int k){
        for (int num:numbers){
            if (k%num==0){
                return false;
            }
            if(num>(int) Math.sqrt(k)){
                break;
            }
        }

        return true;
    }
    public static void main(String ... args){
        Problem204 test=new Problem204();
        System.out.print(test.countPrimes(499979));
    }
}