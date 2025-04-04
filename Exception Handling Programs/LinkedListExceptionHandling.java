class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void get(int index) {
        try {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                if (temp == null) throw new IndexOutOfBoundsException("Index out of bounds!");
                temp = temp.next;
            }
            System.out.println("Element at index " + index + ": " + temp.data);
        } catch (NullPointerException e) {
            System.out.println("Error: List is empty.");
        }
    }
}

public class LinkedListExceptionHandling {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.get(2);
    }
}
