// Java Thread Example by extending Thread class 
// public class vj extends Thread{
//     public void run(){
//         System.out.println("Thread is running....");
//     }
//     public static void main(String[] args) {
//         vj obj = new vj();
//         obj.start();
//     }
// }


// public class vj implements Runnable{
//     public void run(){
//         System.out.println("Thread is running....");
//     }

//     public static void main(String[] args) {
//         vj obj = new vj();
//         Thread t1 = new Thread(obj);
//         t1.start();
//     }
// }


// Using the Thread Class: Thread(String Name)
// class vj{
//     public static void main(String[] args) {
//         Thread obj = new Thread("its vj class");
//         obj.start();
//         String str = obj.getName();
//         System.out.println(str);
//     }
// }

// Using the Thread Class: Thread(Runnable r, String name)
// public class vj implements Runnable{
//     public void run(){
//         System.out.println("Its running class....");
//     }
//     public static void main(String[] args) {
//         Runnable r = new vj();
//         Thread t1 = new Thread(r,"its vijendra shrma");
//         t1.start();

//         String str = t1.getName();
//         System.out.println(str);
//     }
// }

// Example of the sleep() method in Java : on the custom thread
// class vj extends Thread{
//     public void run(){
//         for(int i=1;i<5;i++){
//             try {
//                 Thread.sleep(500);
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//             System.out.println(i);
//         }
//     }
//     public static void main(String[] args) {
//         vj t1 = new vj();
//         vj t2 = new vj();
//         t1.start();;
//         t2.start();
//     }
// }

// Example of the sleep() Method in Java : on the main thread
// import java.lang.Thread;
// import java.io.*;

// public class vj{
//     public static void main(String[] args) {
//         try {
//             for(int i=0;i<5;i++){
//                 Thread.sleep(1000);
//             }
//             System.out.println(i);
        
//         } catch (Exception e) {
//             System.out.println(e);
//     }
// }
// }

// sleep() Method in Java: When the sleeping time is -ive

// import java.lang.Thread;
// import java.io.*; 
// class vj {
//     public static void main(String[] args) {
//         try {
//             for(int i=0;i<5;i++){
//                 Thread.sleep(-100);
//             }
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }

// Can we start a thread twice
// class vj extends Thread{
//     public void run(){
//         System.out.println("its running....");
//     }
//     public static void main(String[] args) {
//         vj t1 = new vj();
//         t1.start();
//         t1.start();
//     }
// }


// What if we call Java run() method directly instead start() method?
// class vj extends Thread{
//     public void run(){
//         System.out.println("its running....");
//     }

//     public static void main(String[] args) {
//         vj t1 = new vj();
//         t1.run();
//     }
// }

// Problem if you direct call run() method
// class vj extends Thread{
//     public void run(){
//         for(int i =0;i<10;i++){
//             try {
//                 Thread.sleep(3000);
//             } catch (Exception e) {
//                 System.out.println(e);
//             }
//             System.out.println(i);
//         }

//     }
//     public static void main(String[] args) {
//         vj t1 = new vj();
//         vj t2 = new vj();

//         t1.run();
//         t2.run();

//     }
// }

// join() Method 
// import java.io.*;
// class vj extends Thread{
//     public void run(){
//         for(int i=0;i<2;i++){
//             try {
//                 Thread.sleep(300);
//                 System.out.println("The current thread name is: " + Thread.currentThread().getName());
//             } catch (Exception e) {
//                 System.out.println("The exception has been caught");
//             }
//         }
//     }
// }

// class vj extends Thread {
//     public void run(){
//         System.out.println("Its running....");
//     }
//     public static void main(String[] args) {
//         vj t1 = new vj();
//         vj t2 = new vj();
//         System.out.println("Name of t1 is :-  " + t1.getName());
//         System.out.println("Name of t2:- " + t2.getName());
//         t1.start();
//         t2.start();

//         t1.setName("vijay");
//         System.out.println("After changing name of t1:- " + t1.getName());
//     }

// }
// Without Using setName() Method 
// import java.io.*;
// class vj extends Thread{
// vj(String vj){
//     super(vj);
// }
// public void run(){
//     System.out.println("Thread is executing....");
// }


// public static void main(String[] args) {
//     vj t1 = new vj("vijendra");
//     vj t2 = new vj("vijay");
//     System.out.println("Thread:- 1 "  + t1.getName());
//     System.out.println("Thread 2:- " + t2.getName());
//     t1.start();
//     t2.start();
// }
// }


// currentThread() method 
// class vj extends Thread{
//     public void run(){
//         System.out.println(Thread.currentThread().getName());
//     }

//     public static void main(String[] args) {
//         vj t1 = new vj();
//         vj t2 = new vj();
//         t1.start();
//         t2.start();
//     }
// }

class Table{  
    void printTable(int n){//method not synchronized  
       for(int i=1;i<=5;i++){  
         System.out.println(n*i);  
         try{  
          Thread.sleep(400);  
         }catch(Exception e){System.out.println(e);}  
       }  
      
     }  
    }  
      
    class MyThread1 extends Thread{  
    Table t;  
    MyThread1(Table t){  
    this.t=t;  
    }  
    public void run(){  
    t.printTable(5);  
    }  
      
    }  
    class MyThread2 extends Thread{  
    Table t;  
    MyThread2(Table t){  
    this.t=t;  
    }  
    public void run(){  
    t.printTable(100);  
    }  
    }  
      
    class TestSynchronization1{  
    public static void main(String args[]){  
    Table obj = new Table();//only one object  
    MyThread1 t1=new MyThread1(obj);  
    MyThread2 t2=new MyThread2(obj);  
    t1.start();  
    t2.start();  
    }  
    }  















