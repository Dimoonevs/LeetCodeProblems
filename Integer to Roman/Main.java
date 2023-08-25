import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().intToRoman(1994));
    }
    public String intToRoman(int num) {
        HashMap<Integer, String> arabicToRoman = new HashMap<>();
        arabicToRoman.put(1, "I");
        arabicToRoman.put(4, "IV");
        arabicToRoman.put(5, "V");
        arabicToRoman.put(9, "IX");
        arabicToRoman.put(10, "X");
        arabicToRoman.put(40, "XL");
        arabicToRoman.put(50, "L");
        arabicToRoman.put(90, "XC");
        arabicToRoman.put(100, "C");
        arabicToRoman.put(400, "CD");
        arabicToRoman.put(500, "D");
        arabicToRoman.put(900, "CM");
        arabicToRoman.put(1000, "M");

        StringBuilder romain = new StringBuilder();

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        for (int value: values){
            while (num >= value){
                romain.append(arabicToRoman.get(value));
                num -= value;
            }
        }

        return romain.toString();
    }
}
