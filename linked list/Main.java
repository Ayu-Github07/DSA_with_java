import java.util.*;

/**
 * How to search in the middle of the linked List
 * At specific position of linkedList
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.add(4);

        int position = 2;

        try {
            System.out.println(linkedList.get(position));
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Specific position doesn't exists in the list");
        }
    }
}
