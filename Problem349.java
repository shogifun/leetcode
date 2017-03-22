import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by user on 19.03.2017.
 */
public class Problem349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> first=new HashSet<>();
        HashSet<Integer> second=new HashSet<>();
        for (int i=0;i<nums1.length;i++){
            first.add(nums1[i]);
        }
        for (int j=0;j<nums2.length;j++){
            second.add(nums2[j]);
        }
        first.retainAll(second);
        int[] res=new int[first.size()];
        int i=0;
        Iterator<Integer>iterator=first.iterator();
        while (iterator.hasNext()){
            res[i++]=iterator.next();
        }
        return res;
    }
}
