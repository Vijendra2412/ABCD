// An algorithm is a set of well-defined instructions to sole a particular problem.
// it takes a set of inputs and produce the desired output.

// take two numer inputs
// add number using the + operator
// display the result
/* 
find the largest number among three number 
step 1: start
step 2: declare variable a,b,c 
step 3: read variable a,b and c
step 4: if a>b
            if a>c
            display a is greater
            else
            c is greater
        else
         if b>c
            display b is greater
         else
            display c is greater

*/
// find the root of a quadratic Equations ax^2 + bx + c = 0
// find factorial of number 
// check whether a number is prime or not
// find fibonacci series till the term less tham 1000 

// Data Structure is a storage that is used to store and organize data. 

// Types of data Structure 
// 1. linear DS :- Array,Stack,Queue,Linked list
// 2. non- linear DS:-


// divide and Conquer alogorithm. 


// class vj{
//    private int arr[];
//    private int top;
//    private int capacity;

//    vj(int size){
//       arr = new int[size];
//       capacity = size;
//       top = -1;
//    }

//    public void push(int x){
//       if(isFull()){
//          System.out.println("overflow\nprogram Terminated\n");
//          System.exit(1);
//       }
//       System.out.println("Inserting " + x);
//       arr[++top] = x; 
//    }

//    public int pop(){
//       if (isEmpty()){
//          System.out.println("stack empy");
//          System.exit(1);
//       }
//       return arr[top--];
//    }

//    public Boolean isEmpty(){
//       return top == -1;

//    }
//    public int size(){
//       return top +1;
//    }
//    public Boolean isFull(){
//       return top == capacity -1;
//    }
// }

// class Queue{
//    int size=5;
//    int item[]  = new int[size];
//    int front , rear;

//    Queue(){
//       front = -1;
//       rear = -1;
//    }

//    boolean isFull(){
//       if(front ==0 && rear == size){
//          return true;
//       }
//       else{
//          return false;
//       }
//    }

//    boolean isEmpty(){
//       if(front == -1){
//          return true;
//       }
//       else{
//          return false;
//       }
//    }


//    void enQueue (int element){
//       if(isFull()){
//       System.out.println("Queue is full");
//       }
//       else{
//          if(front == -1){
//             front = 0;
//             rear++;
//             item[rear] = element;
//             System.out.println(" inserted element:- " + element);
//          }
//       }
//    }

//    int deQueue(){
//       int element;
//       if(isEmpty()){
//          System.out.println(" Queue is empty ");
//          return (-1);
//       }
//       else{
//          element = item[front];
//          if(front >= rear){
//             front =-1;
//             rear =-1;
//          }
//          else{
//             front++;
//          }
//          System.out.println("Deleted -> " + element);
//          return (element);
//       }
//    }

//    void display(){
//       int i;
//       if (isEmpty()) {
//          System.out.println("Empty Queue");
//       }
//       else{
//          System.out.println("\nfront index-> " + front);
//          System.out.println("Item->");
//          for(i = front; i<=rear;i++ ){
//             System.out.println(item[i] + " ");
//             System.out.println("\n Rear index " + rear);
//          }
//       }
      
//    }
//    public static void main(String[] args) {
//       Queue q = new Queue();
//       q.deQueue();
//       q.enQueue(1);
//       q.enQueue(2);
//       q.enQueue(3);
//       q.enQueue(4);
//       q.enQueue(5);

//       q.display();
//       q.deQueue();
//       q.display();
//    }
// }

// simple Queue
// Circular Queue
// Priority Queue 
// Double ended Queue 


// Applications 
// CPU scheduling 
// memory management
// Traffic management
// import java.util.*;  
// class TestCollection12{  
// public static void main(String args[]){  
// PriorityQueue<String> queue=new PriorityQueue<String>();  
// queue.add("Amit");  
// queue.add("Vijay");  
// queue.add("Karan");  
// queue.add("Jai");  
// System.out.println("head:"+queue.element());  
// System.out.println("head:"+queue.peek());
  

// System.out.println("iterating the queue elements:");  
// Iterator itr=queue.iterator();  
// while(itr.hasNext()){  
// System.out.println(itr.next());  
// }  
// queue.remove();  
// queue.poll();  
// System.out.println("after removing two elements:");  
// Iterator<String> itr2=queue.iterator();  
// while(itr2.hasNext()){  
// System.out.println(itr2.next());  
// }  
// }  
// }  
/* 

struct node{
   int data;
   struct node *next;
}
------------------------------------
//initiliaze node 

struct *head;
struct node *one  = null;
struct node *two  = null;
struct node *Three  = null;

//allocate memory 
one = malloc(sizeof(struct node));
two = malloc(sizeof(struct node));
three = malloc(sizeof(struct node));

//Assign data values
one->data =1;
two->data = 2;
three-> data=3

//connect nodes
one->next = two;
two->next = three;
three->next = null;

*/


class LinkedList {
   // create node
   Node head;
   static class Node {
       int value;
       Node next;
       Node(int d) {
           value = d;
           next = null;
       }
   }

   public void printList() {
       Node current = head;
       while (current != null) {
           System.out.print(current.value + " ");
           current = current.next;
       }
       System.out.println();
   }

   public static void main(String[] args) {
       LinkedList linkedList = new LinkedList();
       //assign value
       linkedList.head = new Node(1);
       Node second = new Node(2);
       Node third = new Node(3);

       //connect nodes
       linkedList.head.next = second;
       second.next = third;

       linkedList.printList();
   }
}