package stacks.exercises;
import java.util.Stack;

public class WordInversion {
    private Stack<Character> stack;

    public WordInversion() {
        this.stack = new Stack<>();
    }

    public String invertWord(String word) {
        stack.clear();
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        WordInversion solution = new WordInversion();

        String res = solution.invertWord("Gabriel");
        System.out.println(res);
    }
}
