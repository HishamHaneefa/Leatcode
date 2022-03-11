package intro;
import java.lang.Math;
import java.util.Arrays;

public class square_sort_array {

    public static int[] sortedSquares(int[] nums) {
        
        int[] sol = new int[nums.length];
        
        for(int i=0 ; i< nums.length; i++){
           sol[i] = (int)Math.pow(nums[i], 2);
            
        
        }
        Arrays.sort(sol);
        
        return sol;
    }

    public static void main(String[] args){
        int[] arr = {-4,-1,0,3,10};

        System.out.println(sortedSquares(arr));
    }
}

