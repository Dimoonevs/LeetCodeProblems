public class Main {
    public static void main(String[] args) {
        int[] nums = new int[] {3,2,2,3};
        Main main = new Main();
        System.out.println(main.removeElement(nums, 3));
    }
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int[] resultArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val) {
                nums[count] = nums[i]; // Если текущий элемент не равен val, перемещаем его в начало массива.
                count++; // Увеличиваем счетчик элементов, которые не равны val.
            }
        }
        return count;
    }
}
