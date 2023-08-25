import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().romainToInt("MCMXCIV"));
    }
    public int romainToInt(String romain){
        HashMap<Character, Integer> romainInInt = new HashMap<>();
        romainInInt.put('I', 1);
        romainInInt.put('V', 5);
        romainInInt.put('X', 10);
        romainInInt.put('L', 50);
        romainInInt.put('C', 100);
        romainInInt.put('D', 500);
        romainInInt.put('M', 1000);

        int prevValue = 0;
        int total = 0;

        for (int i = romain.length() -1; i >= 0; i--){
            int value = romainInInt.get(romain.charAt(i));

            if (value < prevValue){
                total -= value;
            }else {
                total += value;
            }
            prevValue = value;
        }
        return total;
    }


}
