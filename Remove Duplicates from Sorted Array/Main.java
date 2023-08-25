public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = new int[] {1,1,2,3,3,4};
        System.out.println(main.removeDuplicates(nums));
    }
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int k = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
