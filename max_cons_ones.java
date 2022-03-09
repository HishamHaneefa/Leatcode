//FOR LEEDCODE CHANGE CLASS AS '''solution'''
public class max_cons_ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
       //init variables
        int max_cons = 0;
        int cons = 0;
        
        for (int i=0; i<nums.length; i++){
            
            //check the value is 0/1
            if(nums[i] == 0){
                cons = 0;
            }
            else{
                cons++;
                //CHECK THE CONSTANT, ASSIGN IF THE VALUE IS MAXED
                if(cons > max_cons){
                    max_cons = cons;
                }
            }
        }
        return max_cons;
    }

    public static void main(String[] args){

        //int[] arr = new int[5];

        // TEST CASE 1
        int[] arr = {1,1,1,0,1,1};

        int size = findMaxConsecutiveOnes(arr);

        System.out.println(size);
    }
}
