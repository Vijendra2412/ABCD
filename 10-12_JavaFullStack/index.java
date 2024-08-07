// class vj{
//     public static void main(String[] args) {
//     int x=6;
//   for(int i=1;i<=x;i++){
//     for(int j=x;j<=i;j--){
//         System.out.print("* ");
//     }
//     System.out.println();
//   }

// int rows  = 4;
// int num  = 1;
// for(int i=1;i<=rows;i++){
//     for(int j=1;j<=i;j++){
//         System.out.println(num+" ");
//         num++;

// }
// System.out.println();

// }

// int rows = 5;
// for(int i=0;i<rows;i++){
//     int number = 1;
//     System.out.printf("%"+(rows - i)*2+ "s", "");
//     for(int j=0;j<=i;j++){
//         System.out.printf("%4d", number);
//         number = number * (i - j) / (j + 1);
//     }
//     System.out.println();
// }

// int arr[] =  {1, 2, 3, 4,5};

// for(int i=0;i<arr.length;i++){
//     System.out.println(arr[i]);
// }

// for(int  i: arr){
//     System.out.println(i);
// }

//     }
// }

// class vj{
//     public static void main(String[] args) {
//         for(int i =0; i<=5; i++){
//             System.out.println("hello");
//         }
//     }
// }

// Labeled for loop

// Labelname:
// for(initialization; condition ; i/d){

// }

// class vj{
//     public static void main(String[] args) {
//         outer:
//         for(int i =0;i<=5;i++){
//             System.out.println("outer: " + i);

//             inner:
//             for(int j=0;j<=5;j++){
//                 if(i==2 && j==2){
//                     break inner;
//                 }
//                 System.out.println(i + " " + j);

//             }

//         }
//     }
// }

// class vj{
//     public static void main(String[] args) {
// for(int i = 0; i>=5; i++){
//     System.out.println(i);
// }
// for(;;){
//     System.out.print("hello");
// }

//     }
// }

// while loop
// while(condition){
//     i/d;
// }

// class vj {
//     public static void main(String[] args) {
// while(3>2){
//     System.out.println("hello");
//     break;
// }

// int x= 1;
// while (x<=5) {
//     System.out.println(x);
//     x++;
// 
// while(true){
//     System.out.print("vj");
// }

// do{
//     // code
//     // i/d 
// }while(codition);

// do{
//     System.out.println("vj");
//      break;
// }while(false);

// int x =8;
// do{
//     System.out.print("vj");
//     x--;
// }while(x>4);
// for(int i =0;i<=10;i++){
//     if(i==5){
//         // break;
//         continue;
//     }
//     System.out.println(i);
// }

// aa:

// for(int i =1;i<=3;i++){
//     System.out.println("outer: " + i);

//     bb:

//     for(int j=1;j<=3;j++){

//         if(i==2 && j==2){

//             // break aa;
//             continue aa;

// }

// System.out.println(i + " " + j);

//     }
// }

// Switch statement:- 

// int x = 3;
// switch(x){

//     case 1:
//         System.out.println("1");
//         break;
//     case 2:
//         System.out.println("2");
//         break;
//     case 3:
// System.out.println("3");
// break;
// }

// }
// }

// Oops concept (Object Oriented Programming system)

// object 
// class 
// inheritence
// polymorphism
// abstraction 
// encapsulation

// class 
// interface 
// method 
// variable 
// package 
// constant

// state: represent the data(value) of an object

// behaviour:-   represent the behaviour(functionality) of object such as deposit,withdraw

// indentity:- an object indentity is typically implemnted via a unique id

// object:- it is a real wolrd entity
// it is a runtime entity 
// it is an entity which has state and behaviour
// it is an instance of class

// class:- field,method,constructor, blocks, nested class and interface 

// class <classname>{
//     // field
//     // method
//     // constructor
//     // blocks
//     // nested class
//     // interface
// }

// instance variable :-  A variable which is created inside the class but outside the method

// class vj{
//     int x= 10;
//     public static void main(String[] args) {
//         int x =10
//     }
// }

// methods :-

// new  keyword:-  

// class vj{
//     int x =100;
//     String name = "vj";
//     float y = 12.3f;
// }

// public class index{

//     public static void main(String[] args) {
//         vj v = new vj();
//         System.out.println(v.x + v.y);
//         System.out.println(v.name);

//     }
// }

// write a program to input an int and check whether it is three digit num or not

// import java.util.*;
// class vj{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number");
//         int x = sc.nextInt();
//         if(x>99 && x<1000){
//             System.out.println("three digit number");
//         }
//         else{
//             System.out.println("not a three digit number");
//         }
//     }
// }

// class vj{
//         int rollno;
//         String name;
//         void display(int r, String n){
//                 rollno = r;
//                 name = n;
//         }
//         void display1(){
//                 System.out.println(rollno + " " + name);
//         }
// }
// class index{
//         public static void main(String[] args) {
//                 vj v = new vj();
//                 v.display(1, "vj");
//                 v.display1();
//         }
// }

// class vj{

// public static void abc(){
//         int x= 12;
//         int y=12;
//          int sum = x+y;
//          System.out.println(sum);
// }
// public static void main(String[] args) {
//         vj v = new vj();
//         v.abc();
// }
// }

// import java.util.*;
// class vj{
//         public static void findEvenOdd(int num){
//                 if(num%2==0){
//                         System.out.println("number is even");
//                 }
//                 else{
//                         System.out.println("number is odd");
//                 }

//         }
// }

// class index{
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("enter a number");
//                 int num = sc.nextInt();
//                 vj v = new vj();
//                 v.findEvenOdd(num);
//         }
// }

// // program to illustrate the working of labelled continue statement in a nested loop it prints a tringular multiplication table for 0 through 9
// class vj{
//         public static void main(String[] args) {
//                 outerLoop:
//                 for(int i =0;i<10;i++){
//                         System.out.println("multiplication of :- " + i + ":");
//                         for(int j=1;j<=10;j++){
//                                 if(j>i){
//                                         System.out.println();
//                                         continue outerLoop;
//                                 }
//                                 System.out.println(i + " * " + j + " = " + i*j+" ");
//                         }
//                         System.out.println();
//                 }
//         }
// }

// s= a+n/n^2

// import java.util.*;
// class vj{
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("enter the value of a:- ");
//                 double a = sc.nextDouble();

//                 System.out.println("enter the value of n:- ");
//                 int n = sc.nextInt();

//                 double sum = 0;

//                 for(int i=1,j= 1; i<=n;i++,j+=2){
//                         sum += (a+j)/(double)(j*1);
//                 }
//                 System.out.println(sum);

//         }
// }

// method 

// access_specifire  return_type  method_name(parameter){

// }

// import java.util.*;
// class vj{
//         public static void even_odd(int num){
//                 if(num%2==0){
//                         System.out.println("number is even");
//                 }
//                 else{
//                         System.out.println("number is odd");
//                 }
//         }

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 // System.out.println("enter a number");
//                 int num = sc.nextInt();
//                 even_odd(num);

//         }
// }

// class vj{
//         public static void main(String[] args) {
//                 int a =9;
//                 int b = 9;

//                 int c = add(a,b);

//                 System.out.println(c);
//         }
//         public static int add(int a, int b){
//                 int c = a+b;
//                 return c;
//         }
// }

// import java.util.*;
// class InstaceMethodex{
//         int x;
//         public static void main(String[] args) {

//                 InstaceMethodex obj =  new InstaceMethodex();

//                 System.out.println(obj.x);
//         }

//         public int add(int a, int b){
//                 int x = a+b;
//                 return x;

//         }

// }

// Accessor method 
// mutator method
// class vj{
//         private int x;
//         private String name;

//         public int getRoll(){
//                 return x;
//         }
//         public void setRoll(int x){
//                 this.x = x;
//         }
//         public void display(){
//                 System.out.println(x + " " + name);

//         }

//         public static void main(String[] args) {
//                 vj v = new vj();

//                 v.setRoll(1);

//                 v.name = "vj";
//                 v.display();
//         }
// }

//Constructor------
// class vj{
//         int x;
//         vj(){

//         }
// }

// class vj{
//         int x;
//         public void vj1(){
//                System.out.println(x); 
//         }
//         public static void main(String[] args) {
//                 vj obj = new vj();
//                 obj.vj1();

//         }
// }

// class vj{
//         int id;
//         String name;
//         void display(){
//                 System.out.println(id + " " + name);
//         }
//         public static void main(String[] args) {
//                 vj v = new vj();
//                 vj v1 = new vj();
//                 v.display();
//                 v1.display();

//         }
// }

// class vj{
//         int id;
//         String name;
//         vj(int i , String n){
//                 id=i;
//                 name =n;
//         }
//         void display(){
//                 System.out.println(id + " " + name);
//         }
//         public static void main(String[] args) {
//                 vj v = new vj(1,"vj");
//                 vj v1 = new vj(111,"vijay");

//                 v.display();
//                 v1.display();  
//         }
// }

// //Constructor Overloading
// class vj{
//         int id;
//         String name;
//         int age;

//         vj(int i, String n){
//                 id= i;
//                 name = n;
//         }

//         vj(int i, String n, int a){
//                 id=i;
//                 name = n;
//                 age = a;
//         }

//         void display(){
//                 System.out.println(id + " " + name + " " + age);
//         }
//         public static void main(String[] args) {
//                 vj v = new vj(1,"vj");
//                 vj v1 = new vj(1,"vj", 22);
//                 v.display();
//                 v1.display();

//         }
// }

// class vj{
//         int id;
//         String name;

//         vj(int i,String n){
//                 id=i;
//                 name=n;
//         }

//         vj(vj s){
//                 id =s.id;
//                 name = s.name;
//         }

//         void display(){
//                 System.out.println(id + " " + name);
//         }

//         public static void main(String[] args) {
//                 vj v = new vj(1,"vj");
//                 vj v1 = new vj(v);
//                 v.display();
//                 v1.display();
//         }
// }

//----copy value without constructor---
// class vj{
//         int id;
//         String name;

//         vj(int i,String n){
//                 id=i;
//                 name=n;
//         }
//         vj(){

//         }
//         void display(){
//                 System.out.println(id + " " + name);
//         }

//         public static void main(String[] args) {
//                 vj v = new vj(1,"vj");
//                 vj v1 = new vj();

//                 v1.id=v.id;
//                 v1.name = v.name;
//                 v.display();
//                 v1.display();

//         }
// }

// class vj{
//         int rollno;
//         String name;
//         static String college = "vit";

//         vj(int r, String n){
//                 rollno = r;
//                 name = n;
//         }

//         void display(){
//                 System.out.println(rollno + " " + name + " " + college);
//         }

// }

// class index{
//         public static void main(String[] args) {
//                 vj v = new vj(1,"vj");
//                 vj v1=  new vj(12, "vijay");

//                 v.display();
//                 v1.display();
//         }
// }

// // counter without static 
// class counter{
//         int count =0;
//         counter(){
//                 count++;
//                 System.out.println(count);
//         }
//         public static void main(String[] args) {
//                 counter c = new counter();
//                 counter c1 = new counter();
//                 counter c2 = new counter();
//         }
// }

// // counter with static 
// class counter{
//       static  int count =0;
//         counter(){
//                 count++;
//                 System.out.println(count);
//         }
//         public static void main(String[] args) {
//                 counter c = new counter();
//                 counter c1 = new counter();
//                 counter c2 = new counter();
//         }
// }

// static maethod belong t the class not the object of class
// static method can be invoked without the need for creating an insatcne of class
// static method can access static datamember and can change the value of it 

// class vj{
//         int rollno;
//         String name;
//         static String college = "vit";

//         static void change(){
//                 college = "vjit";
//         }
//         vj(int r, String n){
//                 rollno = r;
//                 name = n;

//         }
//         void display(){
//                 System.out.println(rollno + " " + name + " " + college);
//         }
//         public static void main(String[] args) {
//                 vj v = new vj(1,"vj");
//                 vj v1=  new vj(12, "vijay");
//                 vj v2 = new vj(13, "vijendra");
//                 v.display();
//                 v1.display();
//                 v2.display();
//         }
// }

// class vj{
//         static int cube(int x){
//                 return x*x*x;
//         }
//         public static void main(String[] args) {
//                 System.out.println(cube(5));
//         }
// }

// class vj{
//         int a= 30;

//         public static void main(String[] args) {
//                 System.out.println(a);

//         }
// }

// import java.security.PublicKey;

/**
 * index
 */
// public class index {

// public static void main(String[] args) {

// }
// }

// class vj{

// public static void main(String[] args) {
// System.out.println("hello vj");
// }
// }

// class vj{
// static{
// System.out.println("hello vj");
// System.exit(0);
// }
// }

// // ----this keyword ---
// this can be used to refer current class insatance variable
// this can be used to invoke current class method
// this() can be used to invoke current class constructor
// this can be passed as an argument in method call
// this can be passed as an argument in constructor call
// this can be used to return the class instance from the method

// // this is a refrence variable that refer to the current obj
// class vj{
// int rollno;
// String name;
// vj(int rollno, String name){
// this.rollno = rollno;
// this. name = name;
// }
// void display(){
// System.out.println(rollno + " " + name);
// }
// public static void main(String[] args) {
// vj v = new vj(1,"vj");
// vj v1 = new vj(12, "vijay");
// v.display();
// v1.display();
// }
// }

// class vj{
// int rollno;
// String name;
// vj(int r, String n){
// rollno = r;
// name = n;
// }
// void display(){
// System.out.println(rollno + " " + name);
// }
// public static void main(String[] args) {
// vj v = new vj(1,"vj");
// vj v1 = new vj(12, "vijay");
// v.display();
// v1.display();
// }
// }

// class vj{
// void display(){
// System.out.println("hello vj");
// }
// void display1(){
// this.display();
// System.out.println("hello vj1");

// }

// public static void main(String[] args) {
// vj v = new vj();
// v.display1();

// }

// }

// class vj{
// vj(){
// System.out.println("hello vj");
// }
// vj(int x){
// this();
// System.out.println(x);
// }
// public static void main(String[] args) {
// vj v = new vj(1);
// }
// }

// class vj{
// vj(){
// this(4);
// System.out.println("hello vj");
// }
// vj(int x){

// System.out.println(x);
// }
// public static void main(String[] args) {
// vj v = new vj();
// }
// }

// class vj{
// int rollno;
// String name,course;
// float fee;
// vj(int rollno, String name, String course){
// this.rollno = rollno;
// this.name = name;
// this.course = course;

// }
// vj(int rollno, String name, String course, float fee){
// this(rollno, name, course);
// this.fee = fee;
// }
// void display(){
// System.out.println(rollno + " " + name + " " + course + " " + fee);
// }

// public static void main(String[] args) {
// vj v = new vj(1, "vj", "java", 5000);
// vj v1 = new vj(12, "vijay", "java", 5000);
// v.display();
// v1.display();

// }
// }

// this: to pass as an argument in the method
// class vj{
// void display(vj obj){
// System.out.println("hello vj");
// }
// void display1(){
// display(this);

// }
// public static void main(String[] args) {
// vj v = new vj();
// v.display1();

// }

// }

// class vj{
// int a;
// String y;
// }

// // it can be used to refer current class instacne variable
// it can be used to invoke current class method

// this() can be used to invoke current class constructor

// it cna be passed as an argument in method call

// it cna be passed as an argument in constructor call

// it can be used to return the current class instance from the method

// class vj{
// int rollno;
// String name;
// float fee;
// vj(int rollno, String name, float fee){
// this. rollno = rollno;
// this. name = name;
// this.fee = fee;
// }
// void display(){
// System.out.println(rollno + " " + name + " " + fee);
// }

// }

// class index{
// public static void main(String[] args) {
// vj v = new vj(1, "vj", 5000);
// vj v1 = new vj(11, "vjj", 51000);
// v.display();
// v1.display();

// }
// }

// class vj{
// int rollno;
// String name;
// float fee;
// vj(int r, String n, float f){
// rollno = r;
// name = n;
// fee = f;
// }
// void display(){
// System.out.println(rollno + " " + name + " " + fee);
// }

// }

// class index{
// public static void main(String[] args) {
// vj v = new vj(1, "vj", 5000);
// vj v1 = new vj(11, "vjj", 51000);
// v.display();
// v1.display();

// }
// }

// class vj{
// void display(){
// System.out.println("hello vj");
// }
// void n(){
// System.out.println("hello vijay");
// this.display();
// }
// public static void main(String[] args) {
// vj v = new vj();
// // v.display();
// v.n();
// }
// }

// class vj{
// vj(){
// System.out.println("hello vj");
// }
// vj(int x){
// this();
// System.out.println(x);
// }
// public static void main(String[] args) {
// vj v = new vj(12);
// }
// }

// class vj {
// vj(){
// this(12);
// System.out.println("hello vj");

// }
// vj(int x){
// System.out.println(x);
// }
// public static void main(String[] args) {
// vj v = new vj();
// }

// }

// class vj{
// int rollno;
// String name,course;
// float fee;
// vj(int rollno, String name, String course){
// this.rollno = rollno;
// this.name = name;
// this.course = course;
// }
// vj(int rollno, String name, String course, float fee){
// this(rollno, name, course);
// this.fee=fee;
// }
// void display(){
// System.out.println(rollno + " " + name + " " + course + " " + fee);
// }
// }

// class index{
// public static void main(String[] args) {
// vj v = new vj(1, "vj", "java", 5000);
// vj v1 = new vj(11, "vijay", "java", 51000);
// v.display();
// v1.display();
// }
// }

// class vj{
// void abc(vj v){
// System.out.println("hello vj");
// }
// void p(){
// abc(this);

// }
// public static void main(String[] args) {
// vj v = new vj();
// v.p();
// }
// }

// class vj{
// abc obj;
// vj(abc obj){
// this.obj = obj;

// }
// void display(){
// System.out.println(obj.data);
// }
// }

// class abc{
// int data = 10;
// abc(){
// vj x = new vj(this) ;
// x.display();
// }
// public static void main(String[] args) {

// abc a = new abc();
// }
// }

// return_type method_name(){
// return this;
// }

// class vj{
// vj getVj(){
// return this;

// }
// void display(){
// System.out.println("hello vj");
// }
// public static void main(String[] args) {
// new vj().getVj().display();
// }
// }

// class vj{
// void display(){
// System.out.println(this);
// }
// public static void main(String[] args) {
// vj obj = new vj();
// System.out.println(obj);
// obj.display();

// }
// }

// class parent{
// int hair;
// String color;

// void display(){

// }
// }
// class abc extends parent{

// }

// class parent{
// float income = 50000;

// }

// class abc extends parent{
// int bonus = 10000;
// public static void main(String[] args) {
// // abc obj = new abc();
// // System.out.println(obj.income);
// // System.out.println(obj.bonus);
// parent obj = new abc();
// System.out.println(obj.income);
// }
// }

// class parent{
// void display(){
// System.out.println("hello vj");
// }
// }

// class child extends parent{
// void display1(){
// System.out.println("hello child");
// }
// }

// class index{
// public static void main(String[] args) {
// child c = new child();
// c.display();
// c.display1();
// }
// }

// class parent{
// void display(){
// System.out.println("hello vj");
// }
// }

// class child extends parent{
// void display1(){
// System.out.println("hello child");
// }
// }
// class child1 extends child{
// void display2(){
// System.out.println("hello child1");
// }
// }

// class index{
// public static void main(String[] args) {
// child1 c = new child1();
// c.display();
// c.display1();
// c.display2();
// }
// }

// class parent{
// void display(){
// System.out.println("hello vj");
// }
// }

// class child extends parent{
// void display1(){
// System.out.println("hello child");
// }
// }
// class child1 extends parent{
// void display2(){
// System.out.println("hello child1");
// }
// }

// class index{
// public static void main(String[] args) {
// child1 c = new child1();
// c.display();
// // c.display1();
// c.display2();
// }
// }

// class A{
// void display(){
// System.out.println("hello vj");
// }
// }
// class B{
// void display1(){
// System.out.println("hello child");
// }
// }

// class C extends A,B{
// void display2(){
// }
// public static void main(String[] args) {
// C c = new C();
// c.display();
// c.display1();
// c.display2();
// }
// }

// // Aggregation

// class operation{
// int square(int n){
// return n*n;
// }
// }

// class circle{
// operation op;
// double pi = 3.14;

// double area(int r){
// op = new operation();
// int sqr = op.square(r);
// return pi*sqr;
// }

// }

// class index{
// public static void main(String[] args) {
// circle c = new circle();
// double result = c.area(5);
// System.out.println(result);
// }
// }

// class Address{
// String city,state,country;

// public Address(String city, String state, String country) {
// this.city = city;
// this.state = state;
// this.country = country;
// }
// }

// class emp{
// int id;
// String name;

// Address address;

// public emp(int id, String name, Address address) {
// this.id = id;
// this.name = name;
// this.address = address;
// }

// void display(){
// System.out.println(id + " " + name + " " + address.city + " " + address.state
// + " " + address.country);
// }
// public static void main(String[] args) {
// Address address = new Address("vijayawada", "ap", "india");
// Address address1 = new Address("vijay", "dp", "ind");
// emp e = new emp(1, "vj", address);
// emp e1 = new emp(2, "vijay", address1);
// e.display();
// e1.display();
// }
// }

// METHOD OVERLOADING---

// class vj{
// static int add(int a, int b){
// return a+b;
// }
// static int add(int a, int b, int c){
// return a+b+c;
// }
// public static void main(String[] args) {
// System.out.println(add(1,2));
// System.out.println(add(1,2,3));
// }
// }

// class vj{
// static int add(int a, int b){
// return a+b;
// }
// static double add(double a, double b, double c){
// return a+b+c;
// }
// public static void main(String[] args) {
// System.out.println(add(1,2));
// System.out.println(add(1.2,1.3,1.4));
// }
// }

// class vj{
// static int add(int a, int b){
// return a+b;
// }
// static double add(double a, double b){
// return a+b;
// }
// public static void main(String[] args) {
// System.out.println(add(1,2));
// }
// }

// class vj{
// public static void main(String[] args) {
// System.out.println("hello vj");
// }
// public static void main(String args) {
// System.out.println("helli vijay");
// }
// public static void main() {
// System.out.println("hello");

// }
// }

// class vj{
// void sum(int a, long b){
// System.out.println("invoked");
// }
// void sum(long a, int b){
// System.out.println("long invoked");
// }
// public static void main(String[] args) {
// vj v = new vj();
// v.sum(1,2);

// }
// }

// ----------Method Overriding-----------

// class vj{
// void display(int x,int y){
// System.out.println(x+y);
// }
// }

// class vijay extends vj{
// void display(int x, int y){
// System.out.println(x+y);
// }

// public static void main(String[] args) {
// vijay v = new vijay();
// v.display(1,2);
// }
// }

// class vj{
// vj get(){
// return this;
// }
// }

// class vijay extends vj{
// vijay get(){
// return this;
// }

// void display(){
// System.out.println("hello vijay");
// }
// public static void main(String[] args) {
// new vijay().get().display();
// }
// }

// // Super keyword
// class vj{
// String color = "blue";
// void rang(){
// System.out.println(" its vj class");
// }
// }
// class vijay extends vj{
// String color = "red";
// void rang(){
// // System.out.println(color);
// // System.out.println(super.color);
// super.rang();
// System.out.println("its java class");
// }
// public static void main(String[] args) {
// vijay obj = new vijay();
// obj.rang();
// }
// }

// class abc{
// abc(){
// System.out.println("its vj class");
// }
// }

// class mno extends abc{
// mno(){
// super();
// System.out.println("its java class");
// }
// public static void main(String[] args) {
// mno obj = new mno();

// }
// }

// class vj{
// int id;
// String name;
// vj(int id, String name){
// this.id = id;
// this.name = name;
// }
// }

// class emp extends vj{
// float salary;
// emp(int id, String name, float salary){
// super(id, name);
// this.salary = salary;
// }
// void display(){
// System.out.println(id + " " + name + " " + salary);
// }

// public static void main(String[] args) {
// emp e = new emp(1, "vj", 20000);
// e.display();
// }
// }

// insatance initializer block
// class vj{
// int speed;

// vj(){
// System.out.println(" Speed is:- 303kmph");
// }

// {
// System.out.println(" its vj class ");
// }

// public static void main(String[] args) {
// vj v = new vj();
// vj v1 = new vj();
// }
// }

// class vj{
// vj(){
// System.out.println("its vj class");
// }
// }

// class abc extends vj{
// abc(){
// super();
// System.out.println(" its constructor");
// }

// {
// System.out.println("its abc class");
// }

// public static void main(String[] args) {
// abc a = new abc();
// }
// }

// final keyword is used to restrict the user.
// variable
// method
// class

// variable
// class vj{
// final int x = 10;
// void display(){
// x =10;

// }
// public static void main(String[] args) {
// vj v = new vj();
// v.display();
// }
// }

// class vj{
// final void display(){
// System.out.println(" its vj class");
// }

// class abc extends vj{
// void display(){
// System.out.println(" its abc class");
// }
// }
// public static void main(String[] args) {
// abc obj = new abc();
// obj.display();
// }
// }

// final class vj{
// int x= 10;
// }
// class abc extends vj{
// void display(){
// System.out.println(" its abc class");
// }
// public static void main(String[] args) {
// abc obj = new abc();
// obj.display();

// }
// }

// class vj{
// final void display(){
// System.out.println(" its vj class");
// }
// }

// class abc extends vj{
// void display(){
// System.out.println(" its abc class");
// }

// public static void main(String[] args) {
// abc obj = new abc();
// obj.display();
// }
// }

// class vj{
// final int x; // blank final variable
// vj(){
// x = 10;
// System.out.println(x);
// }
// public static void main(String[] args) {
// vj v = new vj();
// }

// }

// class vj{
// static final int x; // static final blank variable
// static{
// x = 10;
// }
// public static void main(String[] args) {
// System.out.println(vj.x);
// }
// }

// class vj{
// int display(final int x){
// x=x+2;
// return x*x;
// }
// public static void main(String[] args) {
// vj v = new vj();
// v.display(4);
// }
// }

// //----Polymorphism----
// class vj{}
// class abc extends vj{}
// A ovb = new abc()

// interface abc{

// }
// class mno{

// }

// class b extends mno implements abc{}
// class vj{
// void display(){
// System.out.println(" its vj class");

// }
// }
// class abc extends vj{
// void display(){
// System.out.println(" its abc class");
// }
// public static void main(String[] args) {
// vj obj = new abc();
// obj.display();
// }
// }

// class bank{
// float getRateOfIntrest(){
// return 0;
// }
// }
// class SBI extends bank{
// float getRateOfIntrest(){
// return 1.2f;
// }
// }
// class ICICI extends bank{
// float getRateOfIntrest(){
// return 1.5f;
// }
// }

// class Punjab extends bank{
// float getRateOfIntrest(){
// return 1.8f;
// }
// }
// class vj{
// public static void main(String[] args) {
// bank b;
// b = new SBI();
// System.out.println("SBI Rate of Intrest: "+ b.getRateOfIntrest());
// b= new ICICI();
// System.out.println("Icici Rate of Intrest: "+ b.getRateOfIntrest());
// b= new Punjab();
// System.out.println("Punjab Rate of Intrest: "+ b.getRateOfIntrest());

// }
// }

// class bike {
// int Speedlimit = 20;
// }
// class honda extends bike{
// int Speedlimit = 123;

// public static void main(String[] args) {
// bike b = new honda();
// System.out.println(b.Speedlimit);
// }
// }

// class vj{
// void eat(){
// System.out.println("its vj class");
// }
// }
// class abc extends vj{
// void eat(){
// System.out.println("its abc class");
// }
// }
// class mno extends abc{
// void eat(){
// System.out.println("its mno class");
// }

// public static void main(String[] args) {
// vj v1,v2,v3;
// v1 = new vj();
// v2 = new abc();
// v3 = new mno();
// v1.eat();
// v1.eat();
// v3.eat();

// }
// }

// int x =10;

// class vj{
// public static void main(String[] args) {
// vj v1;
// }

// }

// class vj{

// }
// class abc extends vj{
// public static void main(String[] args) {
// abc a = new abc();
// }
// }

// class vj{
// private void eat(){
// System.out.println("its vj class");
// }
// public static void main(String[] args) {
// vj v = new vj();
// v.eat();
// }
// }

// class vj{
// void display(){
// System.out.println(" it vj class");
// }
// }
// class abc extends vj{
// void display(){
// System.out.println(" its abc class");
// }
// public static void main(String[] args) {
// vj obj = new abc();
// obj.display();
// }
// }

// ---insatanceOf-----

// class vj{
// public static void main(String[] args) {
// vj v = new vj();
// System.out.println(v instanceof vj);
// }
// }

// class vj{

// }
// class abc extends vj{

// public static void main(String[] args) {
// abc a = new abc();
// System.out.println(a instanceof vj);
// }
// }

// class vj{
// public static void main(String[] args) {
// vj v =null;
// System.out.println(v instanceof vj);
// }

// }

// class vj{

// }

// class abc extends vj{
// static void method(vj a){
// if (a instanceof abc){
// abc d = (abc)a;
// System.out.println("its abc ");
// }
// }
// public static void main(String[] args) {
// vj obj = new abc();
// abc.method(obj);
// }
// }

// class Animal{

// }
// class abc extends Animal{
// static void method(Animal a){
// abc d = (abc)a;
// System.out.println("its perfomed");
// }
// public static void main(String[] args) {
// // Animal obj = new abc();
// // abc.method(obj);
// // abc obj = new abc();
// // abc.method(obj);
// Animal obj = new Animal();
// abc.method(obj);
// }
// }

// interface vj{

// }

// class A implements vj{
// public void a(){
// System.out.println("a method");
// }
// }

// class B implements vj{
// public void b(){
// System.out.println("b method");
// }
// }

// class abc{
// void invoke(vj v){
// if(v instanceof A){
// A a = (A)v;
// a.a();
// }

// if(v instanceof B){
// B b = (B)v;
// b.b();
// }

// }
// }
// class imdex{
// public static void main(String[] args) {
// vj obj = new B();
// abc a = new abc();
// a.invoke(obj);
// }
// }

// abstract class vj{
// abstract void a();
// // abstract void b();
// }
// class abc extends vj{
// void a(){
// System.out.println("its abc class");
// }
// public static void main(String[] args) {
// vj v = new abc();
// v.a();
// }
// }

// abstract class Shape{
// abstract void draw();
// }

// class rectangle extends Shape{
// void draw(){
// System.out.println("its rectangle");
// }

// }

// class circle extends Shape{
// void draw(){
// System.out.println("its circle");
// }

// }

// class vj{
// public static void main(String[] args) {
// Shape s = new circle();
// s.draw();
// }
// }

// abstract class Bank{
// abstract int getRateOfIntrest();

// }
// class Sbi extends Bank{
// int getRateOfIntrest(){
// return 10;
// }
// }

// class PNB extends Bank{
// int getRateOfIntrest(){
// return 100;
// }
// }

// class vj{
// public static void main(String[] args) {
// Bank b;
// b = new Sbi();
// System.out.println("Rate of intrest is: " + b.getRateOfIntrest());
// b= new PNB();
// System.out.println("Rate of Intrest is: " + b.getRateOfIntrest());
// }
// }

// -- Abstract class having constructor, data member and method--

// abstract class bike{
// bike(){
// System.out.println("bike is created");
// }
// abstract void run();
// void changeGear(){
// System.out.println("gear changed");
// }
// }
// class Honda extends bike{
// void run(){
// System.out.println("running safely");
// }
// }
// class index{
// public static void main(String[] args) {
// bike obj = new Honda();
// obj.run();
// obj.changeGear();
// }
// }
// interface abc{
// void show();
// }
// class vj implements abc{
// public void show(){
// System.out.println("its vj class");
// }

// public static void main(String[] args) {
// vj obj = new vj();
// obj.show();
// }
// }

// interface abc{
// void draw();
// }

// class Rectangle implements abc{
// public void draw(){
// System.out.println("its rectangle");
// }
// }

// class Circle implements abc{
// public void draw(){
// System.out.println("its circle");
// }
// }
// class index{
// public static void main(String[] args) {
// abc obj = new Circle();
// abc obj1 = new Rectangle();
// obj.draw();
// obj1.draw();
// }
// }

// interface Bank{
// float RateOfIntrest();
// }
// class SBI implements Bank{
// public float RateOfIntrest(){
// return 1.2f;
// }
// }
// class PNB implements Bank{
// public float RateOfIntrest(){
// return 3.4f;
// }
// }
// class index{
// public static void main(String[] args) {
// Bank obj = new SBI();
// System.out.println(obj.RateOfIntrest());
// }
// }

// interface abc{
// void show();
// }

// interface mno{
// void print();
// }

// class xyz implements abc,mno{
// public void show(){
// System.out.println("its xyz class");
// }
// public void print(){
// System.out.println("its mno class");
// }

// public static void main(String[] args) {
// xyz obj = new xyz();
// obj.show();
// obj.print();
// }
// }

// interface ABC{
// void show();

// }
// interface show {
// void show();
// }
// class xyz implements ABC,show{
// public void show(){
// System.out.println("its print method");
// }
// public static void main(String[] args) {
// xyz obj = new xyz();
// obj.show();
// }
// }

// interface abc{
// void show();
// }

// interface xyz extends abc{
// void print();
// }

// class test implements xyz{
// public void show(){
// System.out.println("its show method");
// }
// public void print(){
// System.out.println("its print method");
// }
// public static void main(String[] args) {
// test obj = new test();
// obj.show();
// obj.print();
// }
// }

// interface drawable{
// void draw();
// default void msg(){
// System.out.println("default method");
// }
// }

// class rectangle implements drawable{
// public void draw(){
// System.out.println("its rectangle");
// }

// public static void main(String[] args) {
// drawable obj = new rectangle();
// obj.draw();
// obj.msg();
// }
// }

// ---------difference abstract class and interface ------

// interface A{
// void a();
// void b();
// void c();
// void d();
// }

// abstract class B implements A{
// public void c(){
// System.out.println("its c method");
// }
// }
// class m extends B{
// public void a(){
// System.out.println("its a method");
// }

// public void b(){
// System.out.println("its b method");
// }
// public void d(){
// System.out.println("its d method");
// }
// }

// class vj{
// public static void main(String[] args) {
// A obj = new m();
// obj.a();
// obj.b();
// obj.c();
// obj.d();
// }
// }

// package vj;
// public class index{
// public void msg(){
// System.out.println("hello vj");
// }

// }

// class A{
// private int data = 10;
// private void msg(){
// System.out.println("hello vj");
// }
// }

// class vj{
// public static void main(String[] args) {
// A obj = new A();
// System.out.println(obj.data);
// obj.msg();
// }
// }

// class A{
// private A(){

// }
// void msg(){
// System.out.println("hello vj");
// }
// }

// class vj{
// public static void main(String[] args) {
// A obj = new A();
// }
// }

// package mypack;
// import pack.*;
// class vj{
// public static void main(String[] args) {
// A obj = new A();

// obj.msg();
// }
// }

// class A{
// protected void msg(){
// System.out.println("hello vj");
// }
// }

// class B extends A{
// public static void main(String[] args) {
// B obj = new B();
// obj.msg();
// }
// }

// class A{
// protected void msg(){
// System.out.println("hello vj");
// }
// }
// public class index extends A{
// void msg(){
// System.out.println("hello vj");
// }
// public static void main(String[] args) {
// index obj = new index();
// obj.msg();
// }
// }

// class vj{
// private String name;
// public String getname(){
// return name;
// }
// public void setName(String name){
// this.name = name;
// }
// }
// class index{
// public static void main(String[] args) {
// vj v = new vj();
// v.setName("vj");
// System.out.println(v.getname());
// }
// }

// class Student{
// private String college = "abc";
// public String getcollege(){
// return college;
// }
// public static void main(String[] args) {
// Student s = new Student();
// // s.getcollege();
// // System.out.println(s.getcollege("def"));
// }
// }

// class Student {
//         private String college;

//         public void setcollege(String college) {
//                 this.college = college;
//         }

//         public static void main(String[] args) {
//                 Student s = new Student();
//                 // s.getcollege();
//                 // System.out.println(s.getcollege("def"));
//         }
// }

// protected object clone() throws CloneNotSupportedException 
 
// clone()

// class Student  implements Cloneable{
//         int rollno;
//         String name;
//         Student(int rollno, String name){
//                 this.rollno = rollno;
//                 this.name = name;
//         }
//         public Object clone() throws CloneNotSupportedException{
//                 return super.clone();
//         }

//         public static void main(String[] args) {
// try {
//         Student s = new Student(10, "abc");
//         Student s1 = (Student) s.clone();
//         System.out.println(s1.rollno + " " + s1.name);
//         System.out.println(s.rollno + " " + s.name);

// } catch (CloneNotSupportedException e) {
//         // TODO: handle exception
// }                
//         }
// }

// class vj{
//         public static void main(String[] args) {
//                 int x =10;

                
//                 Integer i  = Integer.valueOf(x); //convert int into integer explicitly
//                 Integer j = x; 

//                 System.out.println(x + " " + i + " " + j);
//         }
// }

// class vj{
//         public static void main(String[] args) {
//                 Integer a  = new Integer(4);
//                 int i = a.intvalue() ;
//                 int j = a;
//                 System.out.println(a + " " + i + " " + j);
//         }
// }

// class vj{
//         public static void main(String[] args) {
//                 byte b = 10;
//                 short s = 20;

//                 Byte bobj = b;
//                 Short sobj = s;
//                 System.out.println(bobj + " " + sobj);

//                 byte pvalue1 = bobj;
//                 short pvalue2 = sobj;
//                 System.out.println(pvalue1 + " " + pvalue2);    
//         }
// }

// class vj{
//         int x = 20;
//         void change(int data){
//                 x = data + 12;
//         }

//         public static void main(String[] args) {
//                 vj v = new vj();
//                 System.out.println(v.x);
//                 v.change(80);
//                 System.out.println(v.x);
//         }
// }

// class vj{
//         int x = 20;
//         void change(vj vjobj){
//                 vjobj.x = vjobj.x + 11;
//         }

//         public static void main(String[] args) {
//                 vj v = new vj();
//                 System.out.println(v.x);
//                 v.change(v);
//                 System.out.println(v.x);
//         }
// }

// strictfp class A{

// }

// strictfp interface B{

// }

// class vj{
//         strictfp void c(){

                
//         }
// }


// class vj{
//         public static void main(String args[]) {
//                 // System.out.println("Hello World " + args[0]);

//                 for(int i = 0; i<args.length;i++){
//                         System.out.println(args[i]);
//                 }
//         }
// }

// class vj{

//         static void min(int arr[]){
//                 int min = arr[0];
//                 for(int i =0;i<arr.length;i++){
//                         if(min > arr[i]){
//                                 min = arr[i];
//                         }
//                 }
//                 System.out.println(min);
//         }
//         public static void main(String[] args) {
                // int a[] = new int[4];
                // a[0] = 10;
                // a[1] = 20;
                // a[2] = 30;
                // a[3] = 40;
                // System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3]);

                // for(int i =0;i<a.length;i++){
                //         System.out.println(a[i]);

                // }

                // int a[] = {10,20,30,40}; // declaration,instantion, initialization
                //          for(int i =0;i<a.length;i++){
                //         System.out.println(a[i]);

                // }

                // int arr[] = {10,20,30,40,50};
                // min(arr);



//         }
// }

// // ---Anonymous Array-- 
// class anony{
//         static void printArray(int arr[]){
//                 for(int i =0; i<arr.length;i++){
//                         System.out.println(arr[i]);
//                 }
//         }
//         public static void main(String[] args) {
//                 printArray(new int[] {11,22,33,4,4});
//         }
// }

// class vj{
//         static int[] get(){
//                 return new int[]{1,2,3,4,5};
//         }
//         public static void main(String[] args) {
//                 int arr[] = get();
//                 for(int i =0;i<arr.length;i++){
//                         System.out.println(arr[i]);
//                 }
//         }
// }

// class vj{
// public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5};
//         for(int i =0;i<=arr.length;i++){
//                 System.out.println(arr[i]);
//         }
// }
// }

// class vj{
//         public static void main(String[] args) {
//                 int arr[][] = {
//                         {1,2,3},
//                         {4,5,6},
//                         {7,8,9}
//                 };

//                 for(int i=0;i<3;i++){
//                         for(int j=0;j<3;j++){
//                                 System.out.print(arr[i][j] + " ");
//                         }
//                         System.out.println();
//                 }
//         }

// }

// class vj{
//         public static void main(String[] args) {
//                 int arr[][]  = new int[3][];

//                 arr[0] = new int[3];
//                 arr[1] = new int[4];
//                 arr[2] = new int[2];

//                 int count =0 ;
//                 for(int i =0; i<arr.length ;i++){
//                         for(int j=0;j<arr[i].length;j++){
//                                 arr[i][j] = count++;
//                         }
//                 }
//                 for(int i =0;i<arr.length;i++){
//                         for(int j=0;j<arr[i].length;j++){
//                                 System.out.print(arr[i][j] + " ");
//                         }
//                         System.out.println();
//                 }
//         }
// }

// class vj{
//         public static void main(String[] args) {
//                 int arr[] = {4,5,4};
//                 Class c  = arr.getClass();
//                 String name = c.getName();
//                 System.out.println(name);
//         }
// }

// copy Array 
// public static void arraycopy(
//     Object src, int srcPos, Object dest, int destPos, int length
// )

// class vj{
//         public static void main(String[] args) {
//                 char[] copyfrom = {'a','b','c','d','e','a','b','c','d','e'};


//                 char[] copyTo = new char[7];
//         System.arraycopy(copyfrom,2,copyTo,0,7);

//         System.out.println(String.valueOf(copyTo));
//         } 
// }

// class vj{
//         public static void main(String[] args) {
//                 int arr[] = {1,2,3,4};
//                 System.out.println("printing original");
//                 for(int i : arr){
//                         System.out.println(i);
//                 }
//                 System.out.println("printing CLONE");
//                 int carr[] = arr.clone();
//                 for(int i : carr){
//                         System.out.println(i);
//                 }
//                 System.out.println("are both equal");
//                 System.out.println(arr == carr);
//         }
// }

// --Adding of 2 matrics---

// class vj{
//     public static void main(String[] args) {
//         int x[][] = {
//             {1,2,3},
//             {4,5,6},
//         } ;
//         int y[][] = {
//             {7,8,9},
//             {10,11,12},
//         };

//         // creating another matrix to store sum of two matrix
//         int c[][] = new int[2][3];

//         for(int i=0;i<2;i++){
//             for(int j=0;j<3;j++){
//                 c[i][j] = x[i][j] + y[i][j];
//                 System.out.print(c[i][j] + " ");
//             }
//             System.out.println(); // new line
//         }
//     }
// }

// --------multiplication of two matrix ----

// class vj{
//     public static void main(String[] args) {
//         int x[][] = {{1,1,1},{2,2,2},{3,3,3}};
//         int y[][] = {{1,1,1},{2,2,2},{3,3,3}};

//         // creating another matrix to store multiply of two matrix
//         int z[][] = new int[3][3];

//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 z[i][j] = 0;
//                 for(int k=0;k<3;k++){
//                     z[i][j] += x[i][k] * y[k][j];
//                 }
//                 System.out.print(z[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// class vj{
//     public static void main(String[] args) {
// //Java Program to copy all elements of one array into another array
//         int [] arr1 = new int[] {1,2,3,4,5,6};
//         int [] arr2 = new int[arr1.length]; // declare array2 with same size as

//         for(int i=0;i<arr1.length;i++){
//             arr2[i] = arr1[i];
//         }
//         System.out.println("Element of Original array");


//         for(int i=0;i<arr1.length;i++){
//             System.out.println(arr1[i] + " ");
//         }
//         System.out.println();


//         System.out.println("Element of new Array");
//         for(int i =0;i<arr2.length;i++){
//         System.out.println(arr2[i] + " ");

//         }
//     }
// }


// class vj{
// //Java Program to find the frequency of each element in the array
// public static void main(String[] args) {
//     int [] arr = new int []{1,2,3,4,2,1,4,5,7,6,5,8};
//     int [] fr = new int[arr.length];
//     int visited = -1;
//     for(int i=0;i<arr.length;i++){
//         int count = 1;
//         for(int j=i+1;j<arr.length;j++){
//             if(arr[i] == arr[j]){
//                 count++;
//                 fr[j] = visited;
//             }
//         }
//         if(fr[i] != visited){
//             fr[i] = count;
//         }
//         System.out.println("-----------------------------");
//         System.out.println("Element Frequency");
//         System.out.println("------------------------------");

//         for(int k=0;k<arr.length;k++){
//             if(fr[k] != visited){
//                 System.out.println(" " + arr[i]  + "  |" + fr[i]);
//             }
//             System.out.println("------------------------");
//         }
//     }
// }

// }

// 3) Java Program to left rotate the elements of an array
class vj{
   public static void main(String[] args) {
    int[] arr = new int[] {1,2,3,4,5};

    int n =3;
    System.out.println("Original array");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i] + " ");
    }

    // rotate the given array by n times toward left
    for(int i=0;i<n;i++){
        int j,first;
        //Stores the first element of the array
        first = arr[0];
        for(j=0;j<arr.length;j++){
            
        }
    }
   }
    
}




// 4) Java Program to print the duplicate elements of an array
// 5) Java Program to print the elements of an array
// 6) Java Program to print the elements of an array in reverse order
// 7) Java Program to print the elements of an array present on even position
// 8) Java Program to print the elements of an array present on odd position
// 9) Java Program to print the largest element in an array
// 10) Java Program to print the smallest element in an array
// 11) Java Program to print the number of elements present in an array
// 12) Java Program to print the sum of all the items of the array
// 13) Java Program to right rotate the elements of an array
// 14) Java Program to sort the elements of an array in ascending order
// 15) Java Program to sort the elements of an array in descending order
// 16) Find 3rd Largest Number in an Array
// 17) Find 2nd Largest Number in an Array
// 18) Find Largest Number in an Array
// 19) Find 2nd Smallest Number in an Array
// 20) Find Smallest Number in an Array
// 21) Remove Duplicate Element in an Array
// 22) Add Two Matrices
// 23) Multiply Two Matrices
// 24) Print Odd and Even Number from an Array
// 25) Transpose matrix
// 26) Java Program to subtract the two matrices
// 27) Java Program to determine whether a given matrix is an identity matrix
// 28) Java Program to determine whether a given matrix is a sparse matrix
// 29) Java Program to determine whether two matrices are equal
// 30) Java Program to display the lower triangular matrix
// 31) Java Program to display the upper triangular matrix
// 32) Java Program to find the frequency of odd & even numbers in the given matrix
// 33) Java Program to find the product of two matrices
// 34) Java Program to find the sum of each row and each column of a matrix
// 35) Java Program to find the transpose of a given matrix