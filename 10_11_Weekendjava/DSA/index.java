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

class Queue{
   int size=5;
   int item[]  = new int[size];
   int front , rear;

   Queue(){
      front = -1;
      rear = -1;
   }

   boolean isFull(){
      if(front ==0 && rear == size){
         return true;
      }
      else{
         return false;
      }
   }

   boolean isEmpty(){
      if(front == -1){
         return true;
      }
      else{
         return false;
      }
   }


   void enQueue (int element){
      if(isFull()){
      System.out.println("Queue is full");
      }
      else{
         if(front == -1){
            front = 0;
            rear++;
            item[rear] = element;
            System.out.println(" inserted element:- " + element);
         }
      }
   }

   int deQueue(){
      int element;
      if(isEmpty()){
         System.out.println(" Queue is empty ");
         return (-1);
      }
      else{
         element = item[front];
         if(front >= rear){
            front =-1;
            rear =-1;
         }
         else{
            front++;
         }
         System.out.println("Deleted -> " + element);
         return (element);
      }
   }

   void display(){
      int i;
      if (isEmpty()) {
         System.out.println("Empty Queue");
      }
      else{
         System.out.println("\nfront index-> " + front);
         System.out.println("Item->");
         for(i = front; i<=rear;i++ ){
            System.out.println(item[i] + " ");
            System.out.println("\n Rear index " + rear);
         }
      }
      
   }
   public static void main(String[] args) {
      Queue q = new Queue();
      q.deQueue();
      q.enQueue(1);
      q.enQueue(2);
      q.enQueue(3);
      q.enQueue(4);
      q.enQueue(5);

      q.display();
      q.deQueue();
      q.display();




   }
}

