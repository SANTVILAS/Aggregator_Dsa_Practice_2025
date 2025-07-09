package module03_LinkList_Questions;

import java.util.HashSet;

class LinkNode {
    int data;
    LinkNode next;

    // Default constructor
    public LinkNode() {
        this.data = 0;  // Initialize with a default value
        this.next = null;
    }

    // Parameterized constructor
    public LinkNode(int value) {
        this.data = value; // Correctly assign the value parameter
        this.next = null;
    }
}

public class Test01_DuplicatesFromLinkedList {

    public static LinkNode createLinkedList(int values[]) {
        LinkNode head = null;
        LinkNode temp = null;

        for (int value : values) {
            LinkNode newNode = new LinkNode(value);
            if (head == null) {
                head = newNode;
                temp = head;
            } else {
                temp.next = newNode;
                temp = temp.next;
            }
        }
        return head;
    }

    public static void findDuplicates(LinkNode head) {
        HashSet<Integer> seen = new HashSet<>();
        LinkNode temp = head;

        while (temp != null) {
            if (seen.contains(temp.data)) {
                System.out.println("Duplicate Found: " + temp.data);
            } else {
                seen.add(temp.data);
            }

            // Move to the next node
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int values[] = {1, 2, 3, 4, 5, 2, 3};

        LinkNode head = createLinkedList(values);

        // Finding duplicates in the linked list
        findDuplicates(head);
    }
}
