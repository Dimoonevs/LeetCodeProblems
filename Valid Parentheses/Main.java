import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.isValid("()()[]{}"));
    }
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        if (s.isEmpty()){
            return false;
        }
        for (int i = 0; i < s.length(); i++){
            char charter = s.charAt(i);
            if (charter == '(' || charter == '{' || charter == '['){
                stack.push(charter);

            }else {
                if (s.isEmpty()){
                    return false;
                }
                char open = stack.pop();
                if (charter == ')' && open != '(' || charter == '}' && open != '{' || charter == ']' && open != '['){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
