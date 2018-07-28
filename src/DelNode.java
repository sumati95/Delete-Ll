public class DelNode {
    static int deleteNode(Node head, int d) {
        Node ptr = head;
        if (ptr == null) {
            System.out.println("Empty list");
        }
        if(ptr.value == d) {
            return ptr.next.value;
        }
        while (ptr != null) {
            if (ptr.next.value == d) {
                ptr.next = ptr.next.next;
                return head.value;
            }
            else  {
                ptr = ptr.next;
            }
        }
        return head.value;
    }

    static void print(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.println(ptr.value);
            ptr = ptr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(1);
        head.next.next = new Node(8);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);
        System.out.println(deleteNode(head, 2));
        print(head);
    }
}

class Node {
    Node next;
    int value;
    Node(int v) {
        value = v;
    }
}
