package stacks.exercises;
import java.util.Stack;
import java.util.HashMap;

public class BalancedRelationships {
    HashMap<String, String> mapping;
    Stack<Character> stack;

    public BalancedRelationships() {
        this.mapping = new HashMap<String, String>();
        this.stack = new Stack<>();

        mapping.put(")","(");
        mapping.put("]","[");
        mapping.put("}","{");

    }

    public Boolean isBalanced(String s) {
        stack.clear();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Se for um dos caracteres de abertura
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                // Verifica se o topo corresponde ao fechamento atual
                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        BalancedRelationships solution = new BalancedRelationships();
        Boolean result = solution.isBalanced("[{(}]");

        System.out.println(result);

    }
}
