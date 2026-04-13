import java.util.LinkedList;
import java.util.Queue;

/******************************************************************************
 * Q25. Implement a Stack using two Queues.
 *
 * Approach : push() is costly – every new element goes to queue2, then all of
 *            queue1 is drained into queue2, then the queues are swapped.
 *            pop() and peek() are O(1).
 *
 * Complexity: push O(n)  |  pop/peek O(1)  |  Space O(n)
 * Difficulty: Medium
 ******************************************************************************/
public class StackUsingQueues {

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int val) {
        q2.add(val);
        while (!q1.isEmpty()) q2.add(q1.poll());
        Queue<Integer> tmp = q1; q1 = q2; q2 = tmp;
    }

    public int pop() {
        if (q1.isEmpty()) throw new RuntimeException("Stack underflow");
        return q1.poll();
    }

    public int peek() {
        if (q1.isEmpty()) throw new RuntimeException("Stack is empty");
        return q1.peek();
    }

    public boolean isEmpty() { return q1.isEmpty(); }

    public static void main(String[] args) {
        StackUsingQueues s = new StackUsingQueues();
        s.push(1); s.push(2); s.push(3);
        System.out.println(s.pop());   // 3
        System.out.println(s.peek());  // 2
        System.out.println(s.pop());   // 2
        System.out.println(s.pop());   // 1
    }
}
