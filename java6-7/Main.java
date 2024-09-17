// //  class index {
// //     public static void main(String[] args) {
// // //    int x = 10;
// // //    int y=-10;
// // // boolean c =true;
// // // boolean d = false;
// // // System.out.println(~x);
// // // System.out.println(~y);
// // // System.out.println(!c);
// // // System.out.println(!d);

// // // System.out.println(10*10/5+3-1*4/2);

// // // <<
// // // System.out.println(10<<2);
// // // System.out.println(10<<3);
// // // System.out.println(20<<2);
// // // System.out.println(15<<4);

// // //Right Shift >>
// // // System.out.println(10>>2);
// // // System.out.println(20>>2);
// // // System.out.println(20>>3);

// // // System.out.println(20>>2);
// // // System.out.println(20>>>2);
// // // System.out.println("----------------------------------");
// // // System.out.println(-20>>2);
// // // System.out.println(-20>>>2);

// //         // logical operatora 
// //         // or(||)    and(&&)     not(!) 

// //         // int a =10;
// //         // int b = 5;
// //         // int c = 20;
// //         // System.out.println(a<b && a<c);
// //         // System.out.println(a<b & a<c);

// //         // int x =8;
// //         // int y =7;
// //         // if(x<y){
// //         //     System.out.println("hello vj");
// //         // }
// //         // else if(x>y){
// //         //     System.out.println("else if ryt" );
// //         // }
// //         // else{
// //         //     System.out.println("wrong code");
// //         // }

// //         // int x =10;
// //         // int y = 12;
// //         // if(x+y <10){
// //         //     System.out.println(" x+y is less than 10");
// //         // }
// //         // else{
// //         //     System.out.println("x+y is greater ");
// //         // }

// //     }
// // }

// public class GradingSystem {
//     public static void main(String[] args) {
//         int mathScore = 90;
//         int scienceScore = 75;
//         int englishScore = 80;

//         if (mathScore >= 90) {
//             System.out.println("Math grade: A");
//         } else if (mathScore >= 80) {
//             System.out.println("Math grade: B");
//         } else {
//             System.out.println("Math grade: C");
//         }

//         if (scienceScore >= 90) {
//             System.out.println("Science grade: A");
//         } else if (scienceScore >= 80) {
//             System.out.println("Science grade: B");
//         } else {
//             System.out.println("Science grade: C");
//         }

//         if (englishScore >= 90) {
//             System.out.println("English grade: A");
//         } else if (englishScore >= 80) {
//             System.out.println("English grade: B");
//         } else {
//             System.out.println("English grade: C");
//         }
//     }
// }

//  class DayOfWeek {
//     public static void main(String[] args) {
//         int day = 3; // Let's assume 1 = Monday, 2 = Tuesday, ..., 7 = Sunday

//         if (day == 1) {
//             System.out.println("Monday");
//         } else if (day == 2) {
//             System.out.println("Tuesday");
//         } else if (day == 3) {
//             System.out.println("Wednesday");
//         } else if (day == 4) {
//             System.out.println("Thursday");
//         } else if (day == 5) {
//             System.out.println("Friday");
//         } else if (day == 6) {
//             System.out.println("Saturday");
//         } else if (day == 7) {
//             System.out.println("Sunday");
//         } else {
//             System.out.println("Invalid day!");
//         }
//     }
// }

// import java.util.Scanner;

//  class VowelCount {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String str = scanner.nextLine();
//         int vowelCount = 0;

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
//                 ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//                 vowelCount++;
//             }
//         }

//         System.out.println("Number of vowels: " + vowelCount);
//     }
// }

// public class RightAngledTriangle {
//     public static void main(String[] args) {
//         int rows = 5;
//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class InvertedTriangle {
//     public static void main(String[] args) {
//         int rows = 5;
//         for (int i = rows; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class PyramidPattern {
//     public static void main(String[] args) {
//         int rows = 5;
//         for (int i = 1; i <= rows; i++) {
//             for (int j = rows; j > i; j--) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= i; k++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class DiamondPattern {
//     public static void main(String[] args) {
//         int rows = 5;
// for (int i = 1; i <= rows; i++) {
//     for (int j = rows; j > i; j--) {
//         System.out.print(" ");
//     }
//     for (int k = 1; k <= i; k++) {
//         System.out.print("* ");
//     }
//     System.out.println();
// }
//         for (int i = rows - 1; i >= 1; i--) {
//             for (int j = rows; j > i; j--) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= i; k++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// class vj{
//     public static void main(String[] args) {
//         String x = "vijendra sharma";
//         System.out.println(x);

//         String y = new String("vj");
//         System.out.println(y);
//     }
// }

// while(conditions){
//     //code
//     //I/D
// // }
// class vj{
//     public static void main(String[] args) {
// //         int x= 1;
//         while(x<=10){
// System.out.print("hello vj");
//             x++;
//         }

// while (true) {
//     System.out.println("hello");
// }

// for(true){
//     System.out.print("hello");
// }

// do{
//     //code
//     //I/D
// }while();

// int x= 1;
// do{
//     System.out.println("hello vj");
//     // x++;

// }while(true);
//     }
// }

// class vj{
//     public static void main(String[] args) {
//         for(int i =0;i<=10;i++){
//             if(i==5){
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

// class vj{
//     public static void main(String[] args) {
//         for(int i=1;i<=3;i++){
//             System.out.println("Outer " + i);
//             for(int j=1;j<=3;j++){
//                 System.out.println("inner " );
//                 if(i==2 && j==2){
//                     break;
//                 }
//                 System.out.println(i+ " " + j);
//             }
//         }
//     }
// }
// import java.util.*;
// class vj{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.println("enter the height");
//         int height = sc.nextInt();
//         for(int i =1;i<=height;i++ ){
//             for(int j= 1;j<=i;j++){
//                 if(i==height || j==1 || j==i){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// // import java.util.*;
// // class pascal{
// //     public static void main(String[] args) {

// //     }
// // }

// Oops (object Oriented programming)
// oops is paradigm that provide many concept such as 
// inheritence, data binding, polymorphism,etc

// object:- its a real-world entity such as pen...
// Oriented programming :- it is a methodogly or paradigsm to design a program 
// using classes and object 

// class 
// object 
// inheritence 
// polymorphism
// Abstraction
// Encapsulation

// class is group of object which have common properties. it is a template or blue print from which object are created
// it is a logical entity 
// it can not be physical 

// Object:- an entity has state and behaviour is known as an object 
// class xyz {
//     // field; //instance variable
//     // method; it is like a function which is used to expose the behavior of object
//     // advantages of method 
//     // code resuability 
//     // code Optimization

//     // new :- it is used to allocate memory at runtime. All object get memory in heap memory area

// }

// class vj{
//     int id = 1; 
//     String name = "vijendra";
// public static void main(String[] args) {
//     vj obj = new vj();
//     System.out.println(obj.id);
//     System.out.println(obj.name);
// }
// }

// 3 ways to initialize object 
// 1.by refrence variable 
// 2.by method 
// 3.by constructor

// class details{
//     int id;
//     String name;
//     String Lname;
// }

// class index{
//     public static void main(String[] args) {
//         details obj = new details();
//         details obj1 = new details();

//         obj.id = 12;
//         obj.name = "vijendra";
//         obj.Lname = "Sharma";

//         obj1.id = 1;
//         obj1.name = "vijay";
//         obj1.Lname = "Shamra";

//         // System.out.println(obj.id);
//         // System.out.println(obj.name);
//         // System.out.println(obj.Lname);
//         System.out.println(obj.id + " " + obj.name +" " + obj.Lname );

//         System.out.println(obj1.id);
//         System.out.println(obj1.name);
//         System.out.println(obj1.Lname);

//     }
// }

// components of class
// field 
// methods 
// constructors 
// blocks 
// nested class and interface 

// object our class 
// initialization through refrence :-

// class vj{
//     int id;
//  String name;
// }
// class index{
//     public static void main(String[] args) {
//         vj obj = new vj();
//         obj.id = 12;
//         obj.name = "vijendra Sharma";
//         System.out.println(obj.id + " " + obj.name);
//     }
// }

//initilize through method 
// class abc{
//     int rollno;
//     String name;
//  void ab(int r, String s){
//         rollno = r;
//         String = s;

//  }
//  void display(){
//     System.out.println(rollno + " " + name);
//  }
// public static void main(String[] args) {
//     abc obj = new abc(1,"abcdefg");
//     abc obj1 = new abc(2,"ghi");

//     obj1.display();
//     obj2.display();

// }
// }

// class Student{
//         int rollno;
//         String name;
//         void insert(int r , String s){
//                 rollno = r;
//                 name = s;
//         }
//         void display(){
//                 System.out.println(rollno + " " + name);
//         }
// }
// class jkl{
//         public static void main(String[] args) {
//                 Student obj = new Student();
//                 obj.insert(1, "vijay");
//                 obj.display();
//         }
// }

// Static Method :- 

// class abc{

//         static void show(){
//                 System.out.println(" it is an static method");
//         }
//         public static void main(String[] args) {
//                 show();
//         }
// }

// instance Method 

// class abc{

//         int x;
//         public int add(int a , int b){
//                x=  a+b;
//                return x;
//         }
//         public static void main(String[] args) {
//                 abc obj = new abc();
//                 System.out.println(obj.add(1, 2));
//         }
// }

// there are two types of instance method :
// Accessor Method:- that read the instance variable is known as the accessor method .
// mutator Method :- the insance avriable and also modify the values ,

// class Student{
//         private int roll;
//         private String name;

//         public int getRoll(){
//                 return roll;
//         }
//         public void setRoll(int roll){
//                 this.roll = roll;
//         }

//         public int getname(){
//                 return name;
//         }
//         public void setname(String name){
//                 this.name = name;
//         }

//         public void display(){
//                 System.out.println("RollNo is:- " + roll);
//                 System.out.println("Name is:- " + name);

//         }
//  public static void main(String[] args) {

//  }

// }

// constructor 
// it is special type of method which is used to initialize the object 

// there are two types constructor
// 1. no arg/default constructor
// 2. parameterized constructor 

// there are two rules of constructor 
// 1.constructor name must be the same as its class name 
// 2.a constructor must have no explicit return type 
// 3.A java constructor cannot be abstract, static,final,synchronized 

// class abc{
//         abc(){
//                 System.out.println("its a constructor");
//         }
//         public static void main(String[] args) {
//                 abc obj = new abc();
//         }
// }

// class abc{
//         int id;
//         String name;
//         void display(){
//                 System.out.println(id + " " + name);
//         }
//         public static void main(String[] args) {
//                 abc obj = new abc();
//                 abc obj1 = new abc();
//                 obj.display();
//                 obj1.display();
//         }

// }

// class abc{
//         int id;
//         String name;

//         abc(int i, String n){
//               id =i;
//               name =n;  
//         }
//         void display(){
//                 System.out.println(id + " " + name );
//         }
//         public static void main(String[] args) {
//                 abc obj = new abc(1234,"vj");

//                 obj.display();
//         }
// }

// constructor Overloading 
// class abc{
//         int id ;
//         String name;
//         int age;

//         //create two args constructor
//         abc(int i,String n){
//                 id =i;
//                 name =n;

//         }
//         abc(int i,String n,int a){
//                 id =i;
//                 name = n;
//                 age = a;
//         }

//         void display(){
//                 System.out.println(id + " "+ name+" " + age);
//         }

//         public static void main(String[] args) {
//                 abc obj = new abc(123, "vijay");
//                 abc obj1 = new abc(1232345, "vijendra",67);
//                 obj.display();
//                 obj1.display();

//         }

//         }

// constructor VS Method 

//copy Constructor
// by constructor 
// one obj to another 
// clone() 

// class abc{
//         int id ;
//         String name;
//         abc(int i , String n){
//                 id =i;
//                 name =n;
//         }
//         abc(abc x){
//                 id = x.id;
//                 name = x.name;
//         }

//         void display(){
//                 System.out.println(id +" "+ name);
//         }

//         public static void main(String[] args) {
//                 abc obj = new abc(123,"vj");
//                 abc obj1 = new abc(obj);
//                 obj.display();
//                 obj1.display();
//         }
// }

// class abc{
//         int id;
//         String name;
//         abc(int i, String n){
//                 id=i;
//                 name=n;
//         }

//         abc(){

//         }

//         void display(){

//                 System.out.println(id +" "+ name);
//         }

//         public static void main(String[] args) {
//                 abc obj = new abc(123,"vjiay");
//                 abc obj1 = new abc();
//                 obj1.id=obj.id;
//                 obj1.name = obj.name;
//                 obj.display();
//                 obj1.display();

//         }
// }

// static keyword :- it is used for memory management mainly.
// used with:- variable , methods , blocks and nested classes 

// class abc{
//         int roll_no;
//         String name;
//         static String college = "abc";

//         abc(int r ,String n){
//                 roll_no = r;
//                 name = n;
//         }
//         void display(){
//                 System.out.println(roll_no +" "+ name +" "+ college);
//         }
//         public static void main(String[] args) {
//                 abc obj = new abc(123, "vj");
//                 obj.display();
//         }
// }

// public class Main{
//         static int count =0;
//         Main(){
//             count++;
//             System.out.println(count);
//         }
//             public static void main(String[] args) {
//                     Main obj = new Main();
//                     Main obj1 = new Main();
//                     Main obj2 = new Main();
//                     Main obj3 = new Main();

//             }
//     }

// this keyword :- current class variable
//         current class method (implicitly)
//         current class constructor ()
//          method call
//         constructor 
//         current clas instance ko method se return karne ke lie

// class vj {
//         int age ;
//         String name;
//         double salary;

//         vj(int age,String name,double salary){
//                 this.age = age;
//                 this.name = name;
//                 this.salary = salary;
//         }
//         void display(){
//                 System.out.println(age +" "+ name + " "+ salary);
//         }
//         public static void main(String[] args) {
//                 vj obj  = new vj(30, "vijendra", 10000.50);
//                 obj.display();
//         }
// }

// class vj{
//         void abc(){
//                 System.out.println(" its vj class");
//         }
//         void xyz(){
//                 this.abc();
//                 System.out.println("its vijay class");

//         }

//         public static void main(String[] args) {
//                 vj obj = new vj();

//                 obj.xyz();
//         }
// }

// class vj{
//         vj(){
//                 this(12);
//                 System.out.println(" its constructor1");
//         }
//         vj(int x){

//                 System.out.println(x);
//         }
//         public static void main(String[] args) {
//                 vj obj = new vj();
//         }
// }

// this: to pass as an Argument in the method 

// class vj{
//         void abc( vj obj1){
//                 System.out.println("its invoked");
//         }
//         void xyz(){
//                abc(this); 
//         }
//         public static void main(String[] args) {
//                 vj a = new vj();
//                 a.xyz();
//         }
// }

// class vj{
//         abc obj;
//         vj(abc obj){
//                 this.obj=obj;
//         }
//         void display(){
//                 System.out.println(obj.value);
//         }
// }
// class abc{
//         int value = 12;
//         abc(){
//                 vj x = new vj(this);
//                 x.display();
//         }
//         public static void main(String[] args) {
//                 abc obj = new abc();
//         }
// }

// class vj{
//         vj getx(){
//                 return this;
//         }

//         void display(){
//                 System.out.println("Its vj clss");
//         }

//         public static void main(String[] args) {
//                 new vj().getx().display();
//         }
// }

// class vj{
//         void abc(){
// System.out.println(this);
//         }
//         public static void main(String[] args) {
//                 vj obj = new vj();
//                 System.out.println(obj);
//                 obj.abc();
//         }
// }

// Accesss Modifires 
// there are 4 different types of access modifire 
// default 
// private 
// protected 
// public 

// class vj{
//         String x = "vijendra";
//         boolean age(){
//                 return true;
//         }
// }

// method 
// variable 
// constructor

// class vj {
//         private int age = 12;

//         int get(int a) {
//                 return age;
//         }

// }

// public class Main{
//     private String name;
//     public String get(){
//         return name;
//     }
//     public void set(String name){
//         this.name = name;
//     }
//     public static void main(String[] args) {
//         Main obj = new Main();
//         obj.set("vj");
//         System.out.println(obj.get());
//     }
// }


// Access Modifire 
// class Main{
//     int x = 5;
//     public static void main(String[] args) {
        
//     }
// }

// Default 
// private:- method, variable, COnstructor
// protected:- method, variable, COnstructor
// public

// class Main{
//     private int age ;
//     public int get(){
//         return this.age;
//     }
//     public void set(int age){
//         this.age = age;
//     }
    
//     public static void main(String[] args) {
//         Main obj = new Main();
//         obj.set(12);
//         System.out.println(obj.get());

//     }
// }

// class one{
//     protected void print1(){
//         System.out.println(" its one class");
//     }
// }


// class child extends one{
        
//     public static void main(String[] args) {
//         one obj = new one();
//     obj.print1();
//     }
// }




// inheritence 
// class Cal{
//     int z;
//     public void add(int x, int y){
//         z = x+y;
//         System.out.println(" sum is:- " + z);
//     }
//     public void sub(int x, int y){
//         z = x-y;
//         System.out.println(" sub is:- " + z);
//     }
// }


// class child extends Cal{
//     public void multi(int x , int y){
//         z = x*y;
//         System.out.println("multi:- " + z);
//     }

    
// public static void main(String[] args) {
//     int a =10, b= 10;
//     child obj = new child();
//     obj.add(a,b);
//     obj.sub(a, b);
//     obj.multi(a, b);
// }
// }


// Types of inheritence:- 
// single
// multilevel 
// hierachcl


// class G_parent{
//     void height(){
//         System.out.println(" 6inch");
//     }
// }
// class parent extends G_parent{
//     void color(){
//         System.out.println(" white");
//     }
// }
// class child extends parent{
//     void voice(){
//         System.out.println(" sweet voice");
//     }
// }

// class Main{
//     public static void main(String[] args) {
//         child obj = new child();
//         obj.height();
//         // obj.color();
//         obj.voice();
//     }
// }

// Aggregation 
// class vehicle{
//     private String x;
//     public String get(){
//         return x;
//     }
//     public void setx(String x){
//         this.x = x;
//     }
// }

// class Speed{
//     private double max;
//     public double getmax(){
//         return max;
//     }
//     public void setmax(){
//         this.max=max;
//     }
// }

// class abc extends vehicle{
//     private Speed speed;
//     public Speed getSpeed(){
//         return speed;
//     }
//     public void setSpeed(){
//         this.speed = speed;
//     }
//     public void print(){
//         System.out.println("x:- " + this.getx() + "max speed" + speed.getmax());
//     }

//     public static void main(String[] args) {
//         Speed speed = new Speed();
//         speed.setmax(100);
//         abc obj = new abc();
//         obj.setSpeed("123");
//         obj.print();
//     }
// }

// class Operation{  
//     int square(int n){  
//      return n*n;  
//     }  
//    }  
     
//    class Circle{  
//     Operation op;//aggregation  
//     double pi=3.14;  
       
//     double area(int radius){  
//       op=new Operation();  
//       int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
//       return pi*rsquare;  
//     }  
     
        
       
//     public static void main(String args[]){  
//       Circle c=new Circle();  
//       double result=c.area(5);  
//       System.out.println(result);  
//     }  
//    }  

// method overloading :-  same name with different parameter
// class raj{
//     static int add(int a, int b){
//         return a+b;
//     }
//     static int add(int a, int b,int c){
//         return a+b+c;
//     }
//     public static void main(String[] args) {
//         System.out.println(raj.add(1, 2));
//         System.out.println(raj.add(2, 3, 4));
//     }
// }

// class raj{
//     static int add(int a, int b){
//         return a+b;
//     }
//     static double add(double a, double b){
//         return a+b;
//     }
//     public static void main(String[] args) {
//         System.out.println(raj.add(1, 2));
//         System.out.println(raj.add(2.3, 3.3));
//     }
// }

// class java{
//     void abc(){
//         System.out.println("vj is java trainer");
//     }
// }
// class child extends java{
//     void abc(){
//         System.out.println("vijendra is java trainer");
//     }
//     public static void main(String[] args) {
//         child obj = new child();
//         obj.abc();
//     }
// }

// Dynamic binding 
// characteristics 
// Linking 
// resolve mechanism

// class Animal{
//     public void move(){
//         System.out.println("Animal can move");
//     }
// }
// class Dog extends Animal{
//     public void move(){
//         super.move();
//         System.out.println("Dog can walk and run");
//     }

//     public static void main(String[] args) {
//         Animal obj = new Animal();

//         //Dynamic binding
//         Animal obj1 = new Dog();
// // obj.move();
// obj1.move();

    
//     }
// }

// characteristics of static binding

// linking
// resolve mechanism


// class abc {
//     public static int add(int x, int y){
//         return x+y;
//     }
//     public static int add(int x, int y , int z){
//         return x+y+z;
//     }
//     public static void main(String[] args) {
        
//         System.out.println(abc.add(2, 3));
//         System.out.println(abc.add(3, 4, 5));
//     }
// }

// instance Initializer block 
// class block{
//     int x;
//     {
//         x = 12;
//     }
//     public static void main(String[] args) {
//         vj obj = new vj();
//         System.out.println(obj.x);
//     }
// }


// class ghi{
    
//     ghi(){
//         System.out.println(" inside constructor");
//     }
//     {
//         System.out.println(" Inside initializer block");
//     }
//     public static void main(String[] args) {
//         ghi obj = new ghi();
//     }
// }


// Abstraction 
// abstract class employee{
//     private String name;
//     private String address;
//     private int number;

//     public employee(String name, String address, int number){
//         System.out.println("constructing a z");
//         this.address=address;
//         this.name=name;
//         this.number = number;

//     }
//     public double computepay(){
//         System.out.println("inside employee computepay");
//         return 0.0;
//     }
//     public void mailcheck(){
//         System.out.println("mailing a check to " + this.name + " " + this.address);

//     }

//     public String toString(){
//         return name + " " + address + " " + number;
//     }
//     public String getname(){
//         return name;
//     }
//     public String getAddress(){
//         return address;
//     }
//     public int getNumber(){
//         return number;
//     }
//     public static void main(String[] args) {
        

//     }
  
// }

// abstract class motor{
//     abstract void bike();

// }

// class rider extends motor{
//     void bike(){
//         System.out.println("running safe");
//     }
//     public static void main(String[] args) {
//         motor obj = new rider();
//         obj.bike();
        
//     }
// }

//  class Main{
//     public void msg(){
//         System.out.println(" hello vj");
//     }
// }

// access modifire 
// non-access modifire 

// private 
// default 
// protected 
// public

// class Account {  
//     //private data members  
//     private long acc_no;  
//     private String name,email;  
//     private float amount;  
//     //public getter and setter methods  
//     public long getAcc_no() {  
//         return acc_no;  
//     }  
//     public void setAcc_no(long acc_no) {  
//         this.acc_no = acc_no;  
//     }  
//     public String getName() {  
//         return name;  
//     }  
//     public void setName(String name) {  
//         this.name = name;  
//     }  
//     public String getEmail() {  
//         return email;  
//     }  
//     public void setEmail(String email) {  
//         this.email = email;  
//     }  
//     public float getAmount() {  
//         return amount;  
//     }  
//     public void setAmount(float amount) {  
//         this.amount = amount;  
//     }  
      
//     }  

//     public class TestEncapsulation {  
//         public static void main(String[] args) {  
//             //creating instance of Account class  
//             Account acc=new Account();  
//             //setting values through setter methods  
//             acc.setAcc_no(7560504000L);  
//             acc.setName("Sonoo Jaiswal");  
//             acc.setEmail("sonoojaiswal@javatpoint.com");  
//             acc.setAmount(500000f);  
//             //getting values through getter methods  
//             System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
//         }  
//         }  


// Java Program to demonstrate
// Java Encapsulation
 
// // Person Class
// class Person {
//     // Encapsulating the name and age
//     // only approachable and used using
//     // methods defined
//     private String name;
//     private int age;
 
//     public String getName() { return name; }
 
//     public void setName(String name) { this.name = name; }
 
//     public int getAge() { return age; }
 
//     public void setAge(int age) { this.age = age; }
// }
 
// // Driver Class
// public class Main {
//     // main function
//     public static void main(String[] args)
//     {
//         // person object created
//         Person person = new Person();
//         person.setName("John");
//         person.setAge(30);
 
//         // Using methods to get the values from the
//         // variables
//         System.out.println("Name: " + person.getName());
//         System.out.println("Age: " + person.getAge());
//     }
// } 

class vj{
    // public static void main(String[] args) {
        // int x[]  = {1,2,3,4,5,6};
        // // for(int i =0;i<x.length;i++){
        // //     System.out.println(x[i]);
        // // }

        // for(int i : x){
        //     System.out.println(i);
        // }

        // int x[] = new int[5];

        //  x[0] = 1;
        //  x[1] = 2;
        //  x[2] = 3;
        //  x[3] = 4;
        //  x[4] = 5;
        //  x[5] = 6;


        //    for(int i : x){
        //     System.out.println(i);
        // }

       static void min(int arr[]){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];

                System.out.println(min);
            }
            
        }
        
       }
       public static void main(String[] args) {
        int a[] = {12,45,1,6};
        min(a);
       } 
    }

