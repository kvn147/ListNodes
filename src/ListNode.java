import java.util.*;

public class ListNode<E> {
    // Linked List fields for singly-linked nodes
    public E data;
    public ListNode<E> next; //pointer

    public ListNode() {
        // look for a constructor in this class
        this(null, null);
    }

    // parameterized constructor
    public ListNode(E data) {
        this(data, null);
    }

    // parameterize constructor
    public ListNode(E data, ListNode<E> next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode: data- " + data + " next- " + next;
    }

    public static void main(String[] args) {

        // Create an ArrayList as a list interface type
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//
//        System.out.println("Array List: " + list1);
//
//        // Create a linked list as a list interface type
//        List<Integer> list2 = new LinkedList<>();
//        list2.add(1);
//        list2.add(2);
//        list2.add(3);
//
//        System.out.println("Linked List: " + list2);

        ListNode<Integer> three = new ListNode<>(3, null); // null pointer
        ListNode<Integer> two = new ListNode<>(2, three);
        ListNode<Integer> one = new ListNode<>(1, two);

        // or

//      ListNode one = new ListNode(1, new ListNode(2, new ListNode(3)));

        ListNode<Integer> current = one;

        // visit every node in the linked list and print out the data stored in the node
        while (current != null) {
            // print out data
            System.out.print(current.data + " ");
            // move current along the list
            current = current.next;
        }

        // outside while loop current is null
        System.out.println();
        // visit every node BUT the last node
        // reset current to the ListNode one which is the beginning of our list
        current = one;
        while (current.next != null) {
            System.out.print(current.data + " ");
            current = current.next; // traverse node to next node
        }
        // after while loop, current will be at the last node
        System.out.println("On the last node: " + current.data);

    }
}
