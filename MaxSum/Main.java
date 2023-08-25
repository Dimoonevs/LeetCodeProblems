public class Main {
    public static void main(String[] args) {

        int[] array = new int[] {51,71,17,24,42};
        System.out.println(new Main().MaxSum(array));
    }
    public int MaxSum(int[] array){
        int maxSum = -1;
        int[] maxDigits = new int[10];
        for (int num : array){
            int digitSum = DigitSum(num);
            maxDigits[digitSum] = Math.max(maxDigits[digitSum], num);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int digitSum1 = DigitSum(array[i]); // Сумма цифр первого числа.
                int digitSum2 = DigitSum(array[j]); // Сумма цифр второго числа.

                if (digitSum1 == digitSum2) {
                    maxSum = Math.max(maxSum, array[i] + array[j]); // Обновляем максимальную сумму, если наибольшие цифры совпадают.
                }
            }
        }
        return 0;
    }

    private int DigitSum(int num){
        int sum = 0;
        while (sum > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
