/**
 * Created by user on 18.03.2017.
 */
public class Problem27 {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        if (nums.length==1){
            if(nums[0]==val){
                return 0;
            }
            else {
                return 1;
            }
        }
        int numOfval=0;
        int lenght=nums.length;
        int i=0;
        int last=nums.length-1;
        while (i<=last){
            if (nums[i]==val){
                while (last>i){
                    if (nums[last]==val){
                        last--;
                        numOfval++;
                    }
                    else {
                        break;
                    }

                }
                nums[i]=nums[last];
                nums[last]=val;
                last--;
                numOfval++;
            }
            i++;
        }
        return lenght-numOfval;
    }
    public static void main(String ... args){
        Problem27 test=new Problem27();
        int[] nums={4,5};
        System.out.print(test.removeElement(nums,5));
    }
}
