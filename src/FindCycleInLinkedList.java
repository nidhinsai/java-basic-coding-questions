/******************************************************************************
 * Q44. Detect a cycle in a singly linked list (Floyd's Tortoise & Hare).
 *
 * Example:
 *   1 -> 2 -> 3 -> 4 -> 2 (cycle)  →  true
 *   1 -> 2 -> 3            →  false
 *
 * Complexity: Time O(n)  |  Space O(1)
 * Difficulty: Medium
 ******************************************************************************/
public class FindCycleInLinkedList {

    static class Node {
        int  val;
        Node next;
        Node(int v) { val = v; }
    }

    public static boolean hasCycle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Build list with cycle
        Node n1 = new Node(1), n2 = new Node(2), n3 = new Node(3), n4 = new Node(4);
        n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n2; // cycle
        System.out.println(hasCycle(n1)); // true

        // No cycle
        Node a = new Node(1), b = new Node(2), c = new Node(3);
        a.next = b; b.next = c;
        System.out.println(hasCycle(a));  // false
    }
}
