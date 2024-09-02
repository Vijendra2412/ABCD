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


class vj{
   private int arr[];
   private int top;
   private int capacity;

   vj(int size){
      arr = new int[size];
      capacity = size;
      top = -1;
   }

   public void push(int x){
      if(isFull()){
         System.out.println("overflow\nprogram Terminated\n");
         System.exit(1);
      }
      System.out.println("Inserting " + x);
      arr[++top] = x; 
   }

   public int pop(){
      if (isEmpty()){
         System.out.println("stack empy");
         System.exit(1);
      }
      return arr[top--];
   }

   public Boolean isEmpty(){
      return top == -1;

   }
   public int size(){
      return top +1;
   }
   public Boolean isFull(){
      return top == capacity -1;
   }
}



