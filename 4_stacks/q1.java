import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        int points = 0;

        Stack<Integer> stack = new Stack<>();

        for (String operation : operations) {
            if (operation.equals("+")) {
                int a = stack.pop();
                int b = stack.peek();
                stack.push(a);
                stack.push(a + b);
            } else if (operation.equals("D")) {
                int a = stack.peek();
                stack.push(2 * a);
            } else if (operation.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(operation));
            }
        }

        while(!stack.isEmpty()) {
            points += stack.pop();
        }

        return points;
    }
}