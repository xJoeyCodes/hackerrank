// Method/snippet only. Add required imports and HackerRank node types in the editor.

public static String isBalanced(String s) {
    Deque<Character> stack = new ArrayDeque<>();

    for (char ch : s.toCharArray()) {
        if (ch == '(' || ch == '[' || ch == '{') {
            stack.push(ch);
        } else {
            if (stack.isEmpty()) return "NO";
            char open = stack.pop();
            if ((ch == ')' && open != '(')
                    || (ch == ']' && open != '[')
                    || (ch == '}' && open != '{')) {
                return "NO";
            }
        }
    }
    return stack.isEmpty() ? "YES" : "NO";
}
