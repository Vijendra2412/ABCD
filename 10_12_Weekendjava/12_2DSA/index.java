// Array 

// array are defined as the collections of similar types 
// properties :- 
//              each element in an arra is of the same data type and carries the same size 
            //  at contigious memory location
            // 

// import java.util.Scanner;

// class dsa{
//                 public static void main(String[] args) {
                    // int x [] = {1,2,3,4,5,6};
                    // base address of the array 
                    // size of an elements in bytes
                    // types of indexing

                    // traversal :
                    // insertion :
                    // Deletion :
                    // search :
                    // Update :

                    // int arr[] = {1,2,3,4,5,6};
                    // for(int i=0;i<arr.length;i++){
                    //     System.out.println(arr[i]);
                    // }
                    // for(int i:arr){
                    //     System.out.println(i);
                    // }

                    // int x[] = {1,2,3,4,5};
                    // x[0] = 7;
                    //  for(int i:x){
                    //     System.out.println(i);
                    // }
                    // int arr[] = {1,2,3,4,5,6};
                    // int n=5;

                    // System.out.println("Array of elements before the insetion:- ");
                    // for(int i:arr){
                    //     System.out.println(i);
                    // }

                    // int x= 7;
                    // int pos = 4;
                    // n++;

                    // for(int i=n-1;i>=pos;i--){
                    //     arr[i] = arr[i-1];
                    // }
                    // arr[pos-1] =x;
                    // System.out.println("Array of elements After the insetion:- ");
                    // for(int i =0;i<=n;i++){
                    //     System.out.print(arr[i] + " ");
                    // }
                    // System.out.println();

                    // Acccess   O(1)     O(1)
                    // Search       O(n)     O(n) 

                    // 2D array is organised as matrix which can be represent as the collection of rows and column
                     

                    // int x[] ={}
                    // int x[][] = {
                    //     {1,2,3},
                    //     {4,5,6}
                    // };
                    // System.out.println(x[1][1]);

                  


    //     int arr[][] = new int[3][3];  // Changed to 3x3 to match the loop bounds
    //     Scanner sc = new Scanner(System.in);
        
    //     // Input
    //     for(int i = 0; i < 3; i++) {
    //         for(int j = 0; j < 3; j++) {
    //             System.out.print("Enter the element: ");
    //             arr[i][j] = sc.nextInt();
    //         }
    //     }
        
    //     // Output
    //     System.out.println("Print the elements:");
    //     for(int i = 0; i < 3; i++) {
    //         for(int j = 0; j < 3; j++) {
    //             System.out.print(arr[i][j] + "\t");
    //         }
    //         System.out.println();  // Move to next line after each row
    //     }
        
    //     sc.close();  // Close the scanner

 //find max
                // int x[] =  {1,2,3,7,8,9,4,5,6};
                // int max = x[0];
                // for(int i =1;i<x.length; i++ ){
                //     if(x[i]>max){
                //         max=x[i];
                //     }
                // }
                // System.out.println("max element is:- " + max);


                // reverse 
                // int arr[] = {1,2,3,4,5,6,7,8,9};
                // int n = arr.length;
                // for(int i =0;i<n/2;i++){
                //     int temp = arr[i];
                //     arr[i] = arr[n-i-1];
                //     arr[n-i-1] = temp;
                // }
                // System.out.println("Reversed Array");
                // for(int i : arr){
                //     System.out.print(i +" ");

                // }


                /* 
               // single
                struct node{
                    int data;
                    struct node*next;
                };
                struct node*head,*ptr
                ptr=(struct node *)malloc(sizeof(struct node*))


                    //double 
                     struct node{
                    int data;
                    struct node*next;
                    struct node*prev;
                }

                // circular 
                struct node{
                int data
                struct node*next;
                }





                */
           


                



    // }
    //             }

    import java.util.Scanner;

class LinkedList {
    class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Scanner sc = new Scanner(System.in);

    // Insert at the beginning
    public void beginsert() {
        System.out.println("Enter value: ");
        int item = sc.nextInt();
        Node newNode = new Node(item);
        newNode.next = head;
        head = newNode;
        System.out.println("Node inserted at the beginning");
    }

    // Insert at the last
    public void lastinsert() {
        System.out.println("Enter value: ");
        int item = sc.nextInt();
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Node inserted at the last");
    }

    // Insert at a random position
    public void randominsert() {
        System.out.println("Enter value: ");
        int item = sc.nextInt();
        System.out.println("Enter the position after which to insert: ");
        int loc = sc.nextInt();
        
        Node newNode = new Node(item);
        Node temp = head;
        for (int i = 0; i < loc; i++) {
            if (temp == null) {
                System.out.println("Can't insert at this position");
                return;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Node inserted at random position");
    }

    // Delete from the beginning
    public void begin_delete() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
            System.out.println("Node deleted from the beginning");
        }
    }

    // Delete from the last
    public void last_delete() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) {
            head = null;
            System.out.println("Last node deleted");
        } else {
            Node temp = head;
            Node prev = null;
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            System.out.println("Node deleted from the last");
        }
    }

    // Delete node after a random position
    public void random_delete() {
        System.out.println("Enter the location after which to delete: ");
        int loc = sc.nextInt();
        Node temp = head;
        for (int i = 0; i < loc; i++) {
            if (temp == null || temp.next == null) {
                System.out.println("Can't delete");
                return;
            }
            temp = temp.next;
        }
        temp.next = temp.next.next;
        System.out.println("Node deleted after position " + loc);
    }

    // Search for an element
    public void search() {
        System.out.println("Enter the item to search for: ");
        int item = sc.nextInt();
        Node temp = head;
        int i = 1;
        boolean found = false;
        while (temp != null) {
            if (temp.data == item) {
                System.out.println("Item found at position " + i);
                found = true;
                break;
            }
            temp = temp.next;
            i++;
        }
        if (!found) {
            System.out.println("Item not found");
        }
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            System.out.println("Printing values:");
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 9) {
            System.out.println("\n*********Main Menu*********");
            System.out.println("1. Insert in beginning\n2. Insert at last\n3. Insert at random\n4. Delete from beginning\n5. Delete from last\n6. Delete node after location\n7. Search\n8. Display\n9. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    list.beginsert();
                    break;
                case 2:
                    list.lastinsert();
                    break;
                case 3:
                    list.randominsert();
                    break;
                case 4:
                    list.begin_delete();
                    break;
                case 5:
                    list.last_delete();
                    break;
                case 6:
                    list.random_delete();
                    break;
                case 7:
                    list.search();
                    break;
                case 8:
                    list.display();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Please enter a valid choice.");
            }
        }
    }
}

            