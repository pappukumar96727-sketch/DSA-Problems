//majority element
public class problem1 {
    public static void main(String [] args){
        problem1 sol = new problem1();
        int[] nums = {3, 2, 3};
        System.out.println(sol.majorityElement(nums));
    }
    public int majorityElement(int[] nums) {
        int n = nums.length;
        for(int val: nums){
            int freq = 0;

            for(int el: nums){
                if(el == val){
                    freq++;
                }
            }
            if( freq > n/2){
                return val;
            }
        }
        return -1;
    }
}