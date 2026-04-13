import java.util.Deque;
import java.util.ArrayDeque;

/******************************************************************************
 * Q26. Implement a Queue using two Stacks.
 *
 * Approach : Enqueue to stack1.  On dequeue, if stack2 is empty, pour all of
 *            stack1 into stack2 (reverses order → FIFO from stack2).
 *
 * Complexity: enqueue O(1) amortized  |  dequeue O(1) amortized  |  Space O(n)
 * Difficulty: Medium
 ******************************************************************************/
public class QueueUsingStacks {

    private final Deque<Integer> s1 = new ArrayDeque<>(); // enqueue here
    private final Deque<Integer> s2 = new ArrayDeque<>(); // dequeue from here

    public void enqueue(int val) { s1.push(val); }

    public int dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) throw new RuntimeException("Queue empty");
        if (s2.isEmpty()) { while (!s1.isEmpty()) s2.push(s1.pop()); }
        return s2.pop();
    }

    public int peek() {
        if (s1.isEmpty() && s2.isEmpty()) throw new RuntimeException("Queue empty");
        if (s2.isEmpty()) { while (!s1.isEmpty()) s2.push(s1.pop()); }
        return s2.peek();
    }

    public boolean isEmpty() { return s1.isEmpty() && s2.isEmpty(); }

    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();
        q.enqueue(1); q.enqueue(2); q.enqueue(3);
        System.out.println(q.dequeue()); // 1
        System.out.println(q.peek());    // 2
        System.out.println(q.dequeue()); // 2
    }
}
