import javafx.util.Pair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by user on 17.03.2017.
 */
public class Task2 {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        HashMap<Integer,LinkedList<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                map.get(new Integer(nums[i])).add(new Integer(i));
            }else{
                map.put(new Integer(nums[i]),new LinkedList<Integer>());
                map.get(nums[i]).add(i);
            }
        }
        for (int i=0;i<nums.length;i++){
            if(target-nums[i]==nums[i]){
                if (map.get(new Integer(nums[i])).size()>1){
                    res[0]=map.get(nums[i]).get(0);
                    res[1]=map.get(nums[i]).get(1);
                    return res;
                }
            }
            else {
                if(map.containsKey(target-nums[i])){
                    res[0]=map.get(nums[i]).getFirst();
                    res[1]=map.get(target-nums[i]).getFirst();
                    return res;
                }
            }
        }

        return res;
    }
    public static void main(String ... args){
        int []nums={3,2,4};
        Task2 test=new  Task2();
        System.out.print(test.twoSum(nums,6)[0]+" "+test.twoSum(nums,6)[1]);;


    }
}
