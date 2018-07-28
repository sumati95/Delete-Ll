public class Duplicate {
    public static void main(String[] args) {
        Node1 head = new Node1(4);
        head.next = new Node1(1);
        head.next.next = new Node1(3);
        head.next.next.next = new Node1(6);
        head.next.next.next.next = new Node1(6);
        head.next.next.next.next.next = new Node1(6);
        removeDuplicate(head);
        print(head);
    }

    static void print(Node1 head) {
        Node1 ptr = head;
        while (ptr != null) {
            System.out.print(ptr.value);
            ptr = ptr.next;
        }
    }

    static void removeDuplicate(Node1 head) {
        Node1 ptr = head;
        while (ptr.next != null) {
            if (ptr.next.value == ptr.value) {
                ptr.next = ptr.next.next;
            }
            else {
                ptr = ptr.next;
            }
        }
        head = head.next;
    }
}

class Node1 {
    Node1 next;
    int value;
    Node1(int v) {
        value = v;
    }
}