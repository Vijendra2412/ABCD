
// public class Tech{
//     // instance variable
// // static variable;
//     public static void main(String[] args) {
// // local variable

//     }
// }

// Scanner class built-in class of java.util.package 
// it provides buitl in methods to take different types of user inputs from the user 

// import java.util.*;

// class vj {
//     public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter your name ");
// String name = sc.nextLine();
// System.out.println("Your name is:- " + name);

// System.out.println("-----------------------------------------------------------");

// System.out.println(" Enter your age:- ");
// double age = sc.nextDouble();
// System.out.println("your age is:- "+ age);

// Date date = new Date();
// System.out.println(date.toString());

// ------Loops-------
// while Loops
// do while loop
// for loop
// for-each loop

// Loop control Statement
// break Statement
// continue Statement

// ?: Opearator

// int a , b;
// a=12;
// b = (a==1)?20:30;
// System.out.println("valuse of b is:- " + b);

// b = (a==12)?20:30;
// System.out.println(" value of b is:- " + b);

// syntax :

// for(initialization;Boolean_expression;update){

// }

// for(int i=0;i<20;i++){
// System.out.println(i);
// }

// for(int x = 10;x<20;x--){
// System.out.print("value of x : " + x );
// System.out.println();

// }

// for(int i = 0; i<=10;i++){
// // System.out.println(2*i);
// System.out.println("2" +"*"+ i + "=" + 2*i);
// }
// for (int i = 1; i <= 2; i++) {
//     System.out.print(" Outer " + i);
//     for(int j =1;j<=3;j++){
//         System.out.print("  inner " + j);
//     }
//     System.out.println();
// }

// int num  =1;
// int i =1;

// for(num = 1; num<=10;num++){
//     System.out.print("Table of:- " + num + " is :");
//     for(i=1;i<=10;i++){
//         System.out.print(num * i + " ");
//     }
//     System.out.println();
// }

// while (condition) {
//     //code
// update
// }

// int x = 1;
// while (x<10) {
//     System.out.print("vj");
//        while (x<5) {
//         System.out.println("ij");
//         x++;
//        }
//        x++;
// }

// while (true) {
//     System.out.print("vj");
// }

// Syntax:- 
//    do{

//     //update

//    }while(condtions);

// int x = 10;
// do{
//     System.out.println(" value of x:- " + x);
//     x++;
//     System.out.println();
// }while(x<20);

//     }
// }

// import java.util.Scanner;
// class practice{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println(" Enter ur number:- ");
//         int num = sc.nextInt();
//         int reverse= 0;
//         while (num!=0) {
//             int digit = num%10;
//             reverse = reverse*10 + digit;
//             num =num/10;
//         }
//         System.out.println("Reverse number is " + reverse);

//     }
// }

// import java.util.Scanner;
// class practice{
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int num = sc.nextInt();
//     int fact =1 , i=1;
//     while (i<=num) {
//         fact *=i;
//         i++;
//     }
//     System.out.println("factorial of " + num + " is " + fact);

// }
// }

// import java.util.Scanner;
// class practice{
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     long num = sc.nextLong();
//     int count = 0;
//     while (num!=0) {
//         num/=10;
//         count++;
//     }
//     System.out.println("number of digit "  + count);
// }
// }

// import java.util.Scanner;
// class practice{
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println(" enter ur number:- ");
//     int num = sc.nextInt();
//     int original = num , reverse =0;

//     while (num!=0) {
//         int digit = num%10;
//         reverse = reverse*10 + digit;
//         num/=10;
//     }
//     if(original == reverse){
//         System.out.println(original + " is palindrome");
//     }
//     else{
//         System.out.println(original + " is not palindrome");
//     }
// }
// }

// import java.util.Scanner;
// class practice{
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println(" enter ur number:- ");
//     int num = sc.nextInt();
//    int fst = 0 ,second = 1, count = 0;
//    while (count<num) {
//     System.out.print(fst + " ");
//     int next = fst + second;
//     fst = second;
//     second = next;
//     count++;

//    }
// }
// }

// import java.util.Scanner;
// class practice{
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println(" enter ur number:- ");
//     int num = sc.nextInt();
//     int sum = 0;
//     while (num!=0) {
//         int digit = num%10;
//         sum+= digit; 
//         num/=10;
//     }
//     System.out.println("Sum of digit:- " + sum);
// }
// }

// import java.util.Scanner;

// class practice {
// public static void main(String[] args) {
    
//     System.out.println(" enter ur Armstrong number btwn 1 and 1000:- ");
//     for(int num =1;num<=1000;num++){
//     int original = num;
//     int sum =0;
//     int digits = String.valueOf(num).length() ; //count the digit
//     while (original !=0) {
//         int digit = original % 10;
//         sum += Math.pow(digit, digits);
//         original/=10;
//     }

//     if(sum == num){
//         System.out.println(num);
//     }
// }
// }
// }

// import java.util.Scanner;
// class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//             System.out.println(" enter the value n :- ");
//             int n = sc.nextInt();
//             double sum = 0;

//             for(int i = 1; i<=n ; i++){
//                     sum+= 1.0/i;
//             }
//             System.out.println("sum of series is:- " + sum);
    
//     }
//     }



// import java.util.Scanner;
// class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//             System.out.println(" enter the 1st number ");
//             int num1 = sc.nextInt();
//             System.out.println(" enter the 2nd number ");
//             int num2 = sc.nextInt();
//             int a = num1,b =num2;
//             while (b!=0) {
//                 int remainder = a%b;
//                 a=b;
//                 b=remainder;
//             }
          
//             System.out.println("our GCD of " + num1 + " and  " +num2 + " is " + a);
//     }
//     }

// import java.util.Scanner;
// class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter rows:- ");
//         // int n = sc.nextInt();
//         int n = 5;

//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
          
//             System.out.println();

//         }
            
//     }
//     }

// import java.util.Scanner;
// class practice {
//     public static void main(String[] args) {
        
    
//         int n = 5, num =1;

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=(2*i-1);j++){
//                 System.out.print("* ");
//             }
          
//             System.out.println();

//         }
            
//     }
//     }



//diamond 
// import java.util.Scanner;
// class practice {
//     public static void main(String[] args) {
        
    
//         int n = 5;
//             //upper
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=(2*i-1);j++){
//                 System.out.print("* ");
//             }
          
//             System.out.println();

//         }
//         for(int i=n-1;i>=1;i--){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=(2*i-1);j++){
//                 System.out.print("* ");
//             }
//         System.out.println();

//         }
            
//     }
//     }



// number ryt angle triangle 
// class practice {
//     public static void main(String[] args) {
//         int n = 5;

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j + " ");
//             }
          
//             System.out.println();

//         }
            
//     }
//     }

// floyd triangle
// class practice {
//     public static void main(String[] args) {
//         int n = 5 ,num =1;

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(num++ + " ");
//             }
          
//             System.out.println();

//         }
            
//     }
//     }

// butterfly pattern 
// class practice {
//     public static void main(String[] args) {
//         int n = 5;
//         //uuper
//         for(int i =1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int j =1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         //lower
//         for(int i =n-1;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int j =1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
            
//     }
//     }

// Square pattern 

// class practice {
//     public static void main(String[] args) {
//         int n = 5 ;

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(i==1 || i==n || j==1 || j==n){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
               
//             }
          
//             System.out.println();

//         }
            
//     }
//     }


// class vj{
//     int x = 9234; // instance variable
//     public static void main(String[] args) {
//         vj obj  = new vj();
//         vj obj1  = new vj();
//         vj obj2  = new vj();
//         vj obj3  = new vj();


//         System.out.println(obj.x);
//         System.out.println(obj1.x);
//         System.out.println(obj2.x);
//         System.out.println(obj3.x);

//     }

// }


// class clsname{
//     // field
//     // methods
//     public static void main(String[] args) {
        
//     }
// }


// class Student{
//     int id;
//     String name;

// }

// class vj{
//     public static void main(String[] args) {
//         Student obj = new Student();
//         obj.id = 123;
//         obj.name = "Vijendra";
//         System.out.println(obj.id + " " + obj.name);
//     }
// }





// class Student{
//     int id;
//     String name;
//      void abc(){
//         System.out.println("its vj class");

//     }

// }

// class vj{
//     public static void main(String[] args) {
//         Student obj = new Student();
//         obj.id = 123;
//         obj.name = "Vijendra";
//         System.out.println(obj.id + " " + obj.name);
//         obj.abc();
//     }
// }

// class Student{
//     int rollno;
//     String name;
//     void insertrecord(int r, String n){
//         rollno = r;
//         name = n;
//     }
// void display(){
//     System.out.println(rollno + " " + name);
// }

// public static void main(String[] args) {
//     Student obj  = new Student();
//     Student obj1  = new Student();
//     obj.insertrecord(123,"vj");
//     obj.display();



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
















