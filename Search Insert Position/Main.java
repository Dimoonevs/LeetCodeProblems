public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1,3,5,6};
        System.out.println(new Main().searchInsert(array, 2));
    }
    public int searchInsert(int[] nums, int target) {
        int result = 0;
        for (int i = 0; i < nums.length; i++){
            if (target - nums[i] == 0 ){
                result = i;
                break;
            }else if (target - nums[i] < 0){
                result = i;
                break;
            }else if (target - nums[nums.length - 1] > 0){
                result = nums.length;
                break;
            }
        }
        return result;
    }
}
