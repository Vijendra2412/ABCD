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

//     import java.util.Scanner;

// class LinkedList {
//     class Node {
//         int data;
//         Node next;
        
//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     Node head = null;
//     Scanner sc = new Scanner(System.in);

//     // Insert at the beginning
//     public void beginsert() {
//         System.out.println("Enter value: ");
//         int item = sc.nextInt();
//         Node newNode = new Node(item);
//         newNode.next = head;
//         head = newNode;
//         System.out.println("Node inserted at the beginning");
//     }

//     // Insert at the last
//     public void lastinsert() {
//         System.out.println("Enter value: ");
//         int item = sc.nextInt();
//         Node newNode = new Node(item);
//         if (head == null) {
//             head = newNode;
//         } else {
//             Node temp = head;
//             while (temp.next != null) {
//                 temp = temp.next;
//             }
//             temp.next = newNode;
//         }
//         System.out.println("Node inserted at the last");
//     }

//     // Insert at a random position
//     public void randominsert() {
//         System.out.println("Enter value: ");
//         int item = sc.nextInt();
//         System.out.println("Enter the position after which to insert: ");
//         int loc = sc.nextInt();
        
//         Node newNode = new Node(item);
//         Node temp = head;
//         for (int i = 0; i < loc; i++) {
//             if (temp == null) {
//                 System.out.println("Can't insert at this position");
//                 return;
//             }
//             temp = temp.next;
//         }
//         newNode.next = temp.next;
//         temp.next = newNode;
//         System.out.println("Node inserted at random position");
//     }

//     // Delete from the beginning
//     public void begin_delete() {
//         if (head == null) {
//             System.out.println("List is empty");
//         } else {
//             head = head.next;
//             System.out.println("Node deleted from the beginning");
//         }
//     }

//     // Delete from the last
//     public void last_delete() {
//         if (head == null) {
//             System.out.println("List is empty");
//         } else if (head.next == null) {
//             head = null;
//             System.out.println("Last node deleted");
//         } else {
//             Node temp = head;
//             Node prev = null;
//             while (temp.next != null) {
//                 prev = temp;
//                 temp = temp.next;
//             }
//             prev.next = null;
//             System.out.println("Node deleted from the last");
//         }
//     }

//     // Delete node after a random position
//     public void random_delete() {
//         System.out.println("Enter the location after which to delete: ");
//         int loc = sc.nextInt();
//         Node temp = head;
//         for (int i = 0; i < loc; i++) {
//             if (temp == null || temp.next == null) {
//                 System.out.println("Can't delete");
//                 return;
//             }
//             temp = temp.next;
//         }
//         temp.next = temp.next.next;
//         System.out.println("Node deleted after position " + loc);
//     }

//     // Search for an element
//     public void search() {
//         System.out.println("Enter the item to search for: ");
//         int item = sc.nextInt();
//         Node temp = head;
//         int i = 1;
//         boolean found = false;
//         while (temp != null) {
//             if (temp.data == item) {
//                 System.out.println("Item found at position " + i);
//                 found = true;
//                 break;
//             }
//             temp = temp.next;
//             i++;
//         }
//         if (!found) {
//             System.out.println("Item not found");
//         }
//     }

//     // Display the list
//     public void display() {
//         if (head == null) {
//             System.out.println("List is empty");
//         } else {
//             Node temp = head;
//             System.out.println("Printing values:");
//             while (temp != null) {
//                 System.out.println(temp.data + " ");
//                 temp = temp.next;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();
//         Scanner sc = new Scanner(System.in);
//         int choice = 0;

//         while (choice != 9) {
//             System.out.println("\n*********Main Menu*********");
//             System.out.println("1. Insert in beginning\n2. Insert at last\n3. Insert at random\n4. Delete from beginning\n5. Delete from last\n6. Delete node after location\n7. Search\n8. Display\n9. Exit");
//             System.out.println("Enter your choice:");
//             choice = sc.nextInt();

//             switch (choice) {
//                 case 1:
//                     list.beginsert();
//                     break;
//                 case 2:
//                     list.lastinsert();
//                     break;
//                 case 3:
//                      list.randominsert();
//                     break;
//                 case 4:
//                     list.begin_delete();
//                     break;
//                 case 5:
//                     list.last_delete();
//                     break;
//                 case 6:
//                     list.random_delete();
//                     break;
//                 case 7:
//                     list.search();
//                     break;
//                 case 8:
//                     list.display();
//                     break;
//                 case 9:
//                     System.out.println("Exiting...");
//                     break;
//                 default:
//                     System.out.println("Please enter a valid choice.");
//             }
//         }
//     }
// }

// }
// // }
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) {
//         val = x;
//     }
// }

// public class ReverseList {
//     public ListNode reverseList(ListNode head) {
//         ListNode prev = null;
//         ListNode current = head;
//         while (current != null) {
//             ListNode nextTemp = current.next;
//             current.next = prev;
//             prev = current;
//             current = nextTemp;
//         }
//         return prev;
//     }

//     // Helper method to print the linked list
//     public static void printList(ListNode head) {
//         ListNode current = head;
//         while (current != null) {
//             System.out.print(current.val + " -> ");
//             current = current.next;
//         }
//         System.out.println("null");
//     }

//     public static void main(String[] args) {
//         // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
//         ListNode head = new ListNode(1);
//         head.next = new ListNode(2);
//         head.next.next = new ListNode(3);
//         head.next.next.next = new ListNode(4);
//         head.next.next.next.next = new ListNode(5);

//         System.out.println("Original list:");
//         printList(head);

//         ReverseList solution = new ReverseList();
//         ListNode reversedHead = solution.reverseList(head);

//         System.out.println("Reversed list:");
//         printList(reversedHead);
//     }
// }

// import java.util.List;

// class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) {
//         val = x;
//         next = null;
//     }
// }

// public class DetectCycle {
//     public boolean hasCycle(ListNode head) {
//         if (head == null || head.next == null) {
//             return false;
//         }
//         ListNode slow = head;
//         ListNode fast = head.next;
//         while (slow != fast) {
//             if (fast == null || fast.next == null) {
//                 return false;
//             }
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return true;  // This line was missing in the original code
//     }

//     public static void main(String[] args) {
//         DetectCycle solution = new DetectCycle();

//         // Test case 1: No cycle
//         ListNode head1 = new ListNode(1);
//         head1.next = new ListNode(2);
//         head1.next.next = new ListNode(3);
//         head1.next.next.next = new ListNode(4);

//         System.out.println("Test case 1 (No cycle): " + solution.hasCycle(head1));

//         // Test case 2: Has cycle5
//         ListNode head2 = new ListNode(1);
//         head2.next = new ListNode(2);
//         head2.next.next = new ListNode(3);
//         head2.next.next.next = new ListNode(4);
//         head2.next.next.next.next = head2.next;  // Create a cycle

//         System.out.println("Test case 2 (Has cycle): " + solution.hasCycle(head2));
//     }
// }



// class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) {
//         val = x;
//         next = null;
//     }
// }

// public class MiddleNodeOfLL {
//     public ListNode middleNode(ListNode head) {
//         ListNode slow = head, fast = head;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }

//     // Helper method to create a linked list from an array
//     private static ListNode createLinkedList(int[] arr) {
//         if (arr == null || arr.length == 0) return null;
//         ListNode head = new ListNode(arr[0]);
//         ListNode current = head;
//         for (int i = 1; i < arr.length; i++) {
//             current.next = new ListNode(arr[i]);
//             current = current.next;
//         }
//         return head;
//     }

//     // Helper method to print a linked list
//     private static void printList(ListNode head) {
//         ListNode current = head;
//         while (current != null) {
//             System.out.print(current.val + " -> ");
//             current = current.next;
//         }
//         System.out.println("null");
//     }

//     public static void main(String[] args) {
//         MiddleNodeOfLL solution = new MiddleNodeOfLL();

//         // Test case 1: Odd number of nodes
//         int[] arr1 = {1, 2, 3, 4, 5};
//         ListNode head1 = createLinkedList(arr1);
//         System.out.println("Test case 1 (Odd number of nodes):");
//         System.out.print("Original list: ");
//         printList(head1);
//         ListNode middle1 = solution.middleNode(head1);
//         System.out.println("Middle node: " + middle1.val);

//         // Test case 2: Even number of nodes
//         int[] arr2 = {1, 2, 3, 4, 5, 6};
//         ListNode head2 = createLinkedList(arr2);
//         System.out.println("\nTest case 2 (Even number of nodes):");
//         System.out.print("Original list: ");
//         printList(head2);
//         ListNode middle2 = solution.middleNode(head2);
//         System.out.println("Middle node: " + middle2.val);

//         // Test case 3: Single node
//         ListNode head3 = new ListNode(1);
//         System.out.println("\nTest case 3 (Single node):");
//         System.out.print("Original list: ");
//         printList(head3);
//         ListNode middle3 = solution.middleNode(head3);
//         System.out.println("Middle node: " + middle3.val);
//     }
// }


// class ArrayStack{
//     private int maxsize;
//     private int[] stackArray;
//     private int top;

//     public ArrayStack(int size){
//         maxsize = size;
//         stackArray = new int[maxsize];
//         top=-1;
//     }

//     public void push(int value){
//         if(isFull()){
//             System.out.println("Stack is full. Cannot push " + value);
//             return;
//         }
//         top++;
//         stackArray[top] = value;
//     }

//     public int pop(){
//         if (isEmpty()) {
//             System.out.println("Stack is empty. cannot pop.");
//             return -1;
//         }
//         int poppedValue = stackArray[top];
//         top--;
//         return poppedValue;
//     }

//     public int peek(){
//         if(isEmpty()){
//             System.out.println("Stack is empty. cannot peek");
//             return -1;
//         }
//         return stackArray[top];
//     }
//     public boolean isEmpty(){
//         return (top == -1);
//     }
//     public boolean isFull(){
//         return (top == maxsize - 1);
//     }
//     public static void main(String[] args) {
//         ArrayStack stack = new ArrayStack(5);
//         stack.push(1);
//         stack.push(2);
//         stack.push(3);
//         stack.push(4);
//         stack.push(5);
//         stack.push(4);




//         System.out.println("top element " + stack.peek());
//         System.out.println("popped element " + stack.pop());
//         System.out.println(" is empty ??" + stack.isEmpty() );

//     }

// }
            
// import java.util.Stack;

// class validparameter{
// public static boolean isValid(String s){
//     Stack<Character> stack = new Stack<>();
//     for(char c: s.toCharArray()){
//         if(c == '('){
//             stack.push(')');
//         }
//         else if(c== '{'){
//             stack.push('}');
//         }
//         else if(c =='['){
//             stack.push(']');
//         }
//         else if(stack.isEmpty() || stack.pop() != c){
//             return false;
//         }
//     }
//     return stack.isEmpty();
// }
// public static void main(String[] args) {
//     String[] testCases = {"()","()[]{}","(]","([)]","{[]}"};
//     for(String testCase : testCases){
//         System.out.println("Input:- " + testCase);
//         System.out.println("Is valid:- " + isValid(testCase));
//         System.out.println();
//     }
// }
// }

//String reversal 

// import java.util.Stack;

// class Stringreversal{
//     public static String reveString(String input){
//         Stack<Character> stack = new Stack<>();
//         for(char c: input.toCharArray()){
//             stack.push(c);
//         }
//         StringBuilder reversed = new StringBuilder();
//         while (!stack.isEmpty()) {
//             reversed.append(stack.pop());
//         }
//         return reversed.toString();

//     }
//     public static void main(String[] args) {
//         String[] testCases = {"Vijendra vj!","OpenAi","Java Stack","Sanya","kishan","Pintu"};
//         for(String testCase : testCases) {
//             System.out.println("Original:- " + testCase);
//             System.out.println("Reversed:- " +  reveString(testCase));
//             System.out.println();
//         }
//     }
// }

// import java.util.List;
// import java.util.Scanner;

// class ListNode{
//     int val;
//     ListNode next;

//     ListNode(int val){
//         this.val=val;
//         this.next = null;
//     }
// }

// class solution{
//     public ListNode reverselist(ListNode head){
//         ListNode prev = null;
//         ListNode current = head;
//         while (current!=null) {
//             ListNode nextNode = current.next;

//             current.next = prev; //reverse the pointer of the current node to point to the previousnode


//             // move the previous and current pointers one step forward
//             prev = current;
//             current = nextNode;
//         }
//         return prev;
//     }
//     public static void printList(ListNode head){
//         ListNode temp = head;
//         while (temp!= null) {
//             System.out.print(temp.val + " ");
//             temp = temp.next;
//         }  
// System.out.println();
//     }
//     public static void main(String[] args) {
        
//         ListNode head  = new ListNode(1);
//         head.next = new ListNode(2);
//         head.next.next = new ListNode(3);
//         head.next.next.next = new ListNode(4);
//         head.next.next.next.next = new ListNode(5);

//         System.out.println("original Linked List: ");
//         printList(head);

//         solution sc = new solution();
//         ListNode reversedHead = sc.reverselist(head);

//         System.out.println("reverse linked list:- ");
//         printList(reversedHead);

//     }
// }

//merge two sort 
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

class mergeTwoSortList{
    //merge two sortlist
    public static ListNode mergeTwoList(ListNode list1, ListNode list2){
        ListNode dummy  = new ListNode(-1);
        ListNode current = dummy;

        while (list1!=null && list2!=null) {
            if(list1.val<=list2.val){
                current.next = list1;
                list1 = list1.next;
            }
            else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        //if any node are left in one of the list , append them
        if(list1!=null){
            current.next = list1;

        }
        else{
            current.next = list2;
        }

        return dummy.next;
    }
        public static void printList(ListNode head){
        ListNode current = head;
        while (current!= null) {
            System.out.print(current.val + " ");
            current = current.next;
        }  
System.out.println(" :-null");
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
       list1.next = new ListNode(2);
       list1.next.next = new ListNode(4);

       ListNode list2 = new ListNode(3);
       list2.next = new ListNode(5);
       list2.next.next = new ListNode(6);

       ListNode mergedList = mergeTwoList(list1, list2);
       System.out.println("Merged List:- ");
       
printList(mergedList);

    }
}


