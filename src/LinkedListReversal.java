/******************************************************************************
 * Q22. Reverse a singly linked list.
 *
 * Example:
 *   Input : 1 -> 2 -> 3 -> 4 -> 5
 *   Output: 5 -> 4 -> 3 -> 2 -> 1
 *
 * Approach : Iterative — maintain previous, current, next pointers.
 *
 * Complexity: Time O(n)  |  Space O(1)
 * Difficulty: Easy-Medium
 ******************************************************************************/
public class LinkedListReversal {

    static class Node {
        int  val;
        Node next;
        Node(int v) { val = v; }
    }

    public static Node reverse(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev      = curr;
            curr      = next;
        }
        return prev;
    }

    private static void print(Node head) {
        for (Node n = head; n != null; n = n.next) {
            System.out.print(n.val + (n.next != null ? " -> " : ""));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        print(head);           // 1 -> 2 -> 3 -> 4 -> 5
        head = reverse(head);
        print(head);           // 5 -> 4 -> 3 -> 2 -> 1
    }
}
