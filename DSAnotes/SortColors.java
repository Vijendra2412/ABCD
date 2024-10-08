

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head; // Head of the list

    // Method to insert a new node at the end
    public void insert(int data) {
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

    // Method to search for a key in the linked list
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true; // Key mil gaya toh true return karenge
            }
            temp = temp.next; // Next node pe jaate hain
        }
        return false; // Agar pura list traverse kar ke key nahi mili toh false return karenge
    }

    // Method to display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Inserting elements into the linked list
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("Linked List:");
        list.display();

        // Searching for elements in the linked list
        int key1 = 20;
        int key2 = 60;

        System.out.println("\nSearching for " + key1 + ": " + (list.search(key1) ? "Found" : "Not Found"));
        System.out.println("Searching for " + key2 + ": " + (list.search(key2) ? "Found" : "Not Found"));
    }
}
