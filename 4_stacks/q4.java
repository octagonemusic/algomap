import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] soln= new int[n];

        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < n; i++) {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                soln[idx] = i - idx;
            }

            stack.push(i);
        }
        return soln;
    }
}
