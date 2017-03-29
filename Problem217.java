import java.util.HashSet;

/**
 * Created by user on 28.03.2017.
 */
public class Problem217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for (int i:nums){
            if(set.contains(i)){
                return true;
            }
            else {
                set.add(i);
            }
        }
        return false;
    }
}
