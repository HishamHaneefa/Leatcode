public class even_num_digit{

    public static int findNumbers(int[] nums) {
        int count =0;
        int even_digit_num=0;

        for (int i=0; i<nums.length;  i++){
            count = 0;
            while(nums[i] > 0){
                nums[i] = nums[i]/10;
                count++;
            }
            if(count % 2 == 0){
                even_digit_num++;
            }
        }
       return even_digit_num;
    }


    public static void main(String[] args){

        int arr[] = {555,901,482,1771};

        System.out.println(findNumbers(arr));
    }
}       