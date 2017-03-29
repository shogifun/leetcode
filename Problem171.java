/**
 * Created by user on 28.03.2017.
 */
public class Problem171 {
    public int titleToNumber(String s) {
        int res=0;
        int osn= (int) Math.pow(26,s.length()-1);
        for (int i=0;i<s.length();i++){
            res+=(s.codePointAt(i)-"A".codePointAt(0)+1)*osn;
            osn/=26;
        }
        return res;
    }
    public static void main(String ... args){
        Problem171 test=new Problem171();
        System.out.print(test.titleToNumber("AA"));
    }
}
