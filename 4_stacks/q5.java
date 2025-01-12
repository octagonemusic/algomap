import java.util.*;

class MinStack {

    private List<int[]> stack;
    private int minVal;

    public MinStack() {
        stack = new ArrayList<>();
        minVal = Integer.MAX_VALUE;
    }

    public void push(int val) {
        minVal = Math.min(val, minVal);
        stack.add(new int[] { val, minVal });
    }

    public void pop() {
        stack.remove(stack.size() - 1);
        if (!stack.isEmpty()) {
            minVal = stack.get(stack.size() - 1)[1];
        } else {
            minVal = Integer.MAX_VALUE;
        }
    }

    public int top() {
        return stack.get(stack.size() - 1)[0];
    }

    public int getMin() {
        return stack.get(stack.size() - 1)[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */