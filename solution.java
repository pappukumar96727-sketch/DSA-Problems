//majority element
public class solution {
    public static void main(String [] args){
        solution sol = new solution();
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