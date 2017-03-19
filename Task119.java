import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * Created by user on 19.03.2017.
 */
public class Task119 {
    BigInteger[] fact;
    private void initFact(int n){
        fact=new BigInteger[n+1];
        fact[0]=BigInteger.ONE;
        for (int i=1;i<=n;i++){
            fact[i]=BigInteger.valueOf(i).multiply(fact[i-1]);
        }

    }
    private int c(int n,int k){
        //return fact[n].divide(fact[k].multiply(fact[n-k])).intValue();
        BigInteger mul=fact[k].multiply(fact[n-k]);
        BigInteger res=fact[n].divide(mul);
        return res.intValue();
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result=new LinkedList<>();
        if(rowIndex==0){
            result.add(1);
            return result;
        }
        initFact(rowIndex);
        for (int i=0;i<=rowIndex;i++){
            result.add(c(rowIndex,i));
        }
        return result;
    }
}
