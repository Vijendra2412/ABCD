// // // // // exceptions in java
// // // // it is unexpected event that our during program execution
// // // // invalid user input
// // // // device failure
// // // // loss of network connection 
// // // // physical limitation(out of disk memory)
// // // // code error
// // // // opening an unavilable file

// // // // class outer{
// // // //     private int outerVar = 10;
// // // //     class Inner{
// // // //         void display(){
// // // //             System.out.println(outerVar);
// // // //         }
// // // //     }
// // // // }

// // // // public class index1{
// // // //     public static void main(String[] args) {
// // // //         outer outer = new outer();
// // // //         outer.Inner inner = outer.new Inner();
// // // //         inner.display();

// // // //     }
// // // // // }

// // // // class Calculator{
// // // //     int add(int a, int b){
// // // //         return a+b;
// // // //     }
// // // //     double add(double a, double b){
// // // //         return a+b;
// // // //     }
// // // // }
// // // // public class index1{
// // // //     public static void main(String[] args) {
// // // //         Calculator obj = new Calculator();
// // // //         System.out.println(obj.add(10,20));
// // // //         System.out.println(obj.add(10.5,20.5));
// // // //     }
// // // // }

// // // // // try catch
// // // // // finally block
// // // // // thow and throws keyword

// // // // // try-catch:-
// // // // // its is used to handle exceptions in java
// // // // // syntax:-
// // // // // try{
// // // // //     // code
// // // // // }
// // // // // catch(Exception e){
// // // // //     // code
// // // // // }

// // // // // class vj{
// // // // //     public static void main(String[] args) {
// // // // //         try {
// // // // //             int x= 8/2;
// // // // //             System.out.println("hello vijendra" + x);
// // // // //         } catch (ArithmeticException vj) {
// // // // //             System.out.println(vj.getMessage());
// // // // //         }
// // // // //         finally{
// // // // //             System.out.println("finally block");
// // // // //         }
// // // // //     }
// // // // // }

// // // // // throw and throws keyword
// // // // // throw:- 
// // // // // its is excplicitly throw a single exception.

// // // // // when we throw an exception the flow of the program move from the try block to the catch block

// // // // // class vj{
// // // // //     public static void divideByZero(){
// // // // //         throw new ArithmeticException("its vj class");
// // // // //     }
// // // // //     public static void main(String[] args) {
// // // // //         divideByZero();
// // // // //     }
// // // // // }

// // // // // throws
// // // // // it is used to declare the type of exception that might occur within the method .it is used in th method declaration

// // // // import java.io.*;

// // // // // class vj{
// // // // //     public static void FindFile() throws IOException{
// // // // //         File newfile = new File("vj.txt");
// // // // //         FileInputStream stream = new FileInputStream(newfile);
// // // // //     }
// // // // //     public static void main(String[] args) {
// // // // //         try {
// // // // //             FindFile();
// // // // //         } catch (IOException vj) {
// // // // //             System.out.println(vj.getMessage());
// // // // //         }
// // // // //     }
// // // // // }

// // // // // class listofnum{
// // // // //     private int[] list = {1,2,3,4,5,6,7};
// // // // //     public void writeList(){
// // // // //         PrintWriter out = null;
// // // // //         try {
// // // // //             System.out.println("enter in the lobby");
// // // // //             out = new PrintWriter(new FileWriter("vj.txt"));
// // // // //             for(int i=0;i<7;i++){
// // // // //                 out.println(i+" "+list[i]);
// // // // //             }
// // // // //         } catch (Exception e) {
// // // // //             System.out.println(e.getMessage());
// // // // //         }
// // // // //         finally{
// // // // //             if(out!=null){
// // // // //                 System.out.println("closing printWriter");
// // // // //                 out.close();
// // // // //             }
// // // // //         }

// // // // //     }
// // // // // }

// // // // // class vijay{
// // // // //     public static void main(String[] args) {
// // // // //         listofnum obj = new listofnum();
// // // // //         obj.writeList();
// // // // //     }
// // // // // }

// // // // // multiple catch block
// // // // class listOfnum{
// // // //     public int[] arr = new int[10];
// // // //     public void writeList(){
// // // //         try {
// // // //             arr[9] = 5;
// // // //             System.out.println(arr[9]);
// // // //         } catch (NumberFormatException e1) {
// // // //             System.out.println("numberFormatExcetpion=> " + e1.getMessage());

// // // //         }
// // // //         catch (IndexOutOfBoundsException e) {
// // // //             System.out.println("IndexOutOfBoundsExcetpion=> " + e.getMessage());
// // // //         }
// // // //     }
// // // // }

// // // // class vj{
// // // //     public static void main(String[] args) {
// // // //         listOfnum obj = new listOfnum();
// // // //         obj.writeList();
// // // //     }
// // // // }
// // // // Method Overloading:-
// // // // two or more method may have same name but with different parameters
// // // // class vj{
// // // //     private static void display(int a){
// // // //         System.out.println("Arguments "+ a );
// // // //     }
// // // //     private static void display(int a, int b){
// // // //         System.out.println("Arguments "+ a + b );
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         display(34);
// // // //         display(34,56);
// // // //     }
// // // // }

// // // // class vj{
// // // //     private static void display(int a){
// // // //         System.out.println("Got Integer data");
// // // //     }
// // // //     private static void display(String a){
// // // //         System.out.println("Got String data");
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         display(34);
// // // //         display("vijendra");
// // // //     }
// // // // }

// // // // class vj{
// // // //     private String formatNumber(int value){
// // // //         return String.format("%d", value);
// // // //     }
// // // //     private String formatNumber(double value){
// // // //         return String.format("%.3f", value);
// // // //     }
// // // //     private String formatNumber(String value){
// // // //         return String.format("%.2f" ,Double.parseDouble(value));
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj();
// // // //         System.out.println(obj.formatNumber(34));
// // // //         System.out.println(obj.formatNumber(34.56));
// // // //         System.out.println(obj.formatNumber("345.6"));
// // // //     }
// // // // }

// // // // constructor:-
// // // // it is similar to a method that is invoked when an object of the class is created

// // // // class vj{
// // // //     vj(){
// // // //         // constructor
// // // //     }
// // // // }

// // // // why do constructor not return values?
// // // // constructor return an instance of a class ,so they can't have any return value.

// // // // class vj{
// // // //     private String name;

// // // //     vj(){
// // // //         System.out.println("Constructor is called");
// // // //         name = "vijendra";
// // // //     }

// // // //     public static void main(String[] args) {

// // // //         vj obj = new vj();
// // // //         System.out.println(obj.name);

// // // //     }
// // // // }

// // // // type of constructor:-
// // // // no-arg Constructor
// // // // Parametrized Constructor
// // // // Default Constructor

// // // // no-arg Constructor:-
// // // // Constructor may or may not have any parameter(Arguments)
// // // // private constructor(){
// // // //     // body of the contructor
// // // // }

// // // // class vj{
// // // //     int i;
// // // //    vj(){
// // // //        i =6;
// // // //        System.out.println("Constructor is called"); 
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj();
// // // //         System.out.println("value of i: "+ obj.i);

// // // //     }
// // // // }
// // // // class vj{
// // // //     String name;
// // // //     public vj(){
// // // //         name = "vijendra";
// // // //     }
// // // // }
// // // // class index{
// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj();
// // // //         System.out.println(obj.name);
// // // //     }
// // // // }

// // // // ----Parametrized Constructor---
// // // // constructor can also accept one or more parameter(arguments).
// // // // such constructor are known as parametrized constructor.

// // // // class vj{
// // // //     String name;
// // // //     vj(String naam){
// // // //         name = naam;
// // // //         System.out.println(naam+" is trainer");
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj("vijendra");
// // // //         vj obj1 = new vj("vijendra");
// // // //         vj obj2 = new vj("vijendra");

// // // //         // System.out.println(obj.name);

// // // //     }
// // // // }

// // // // Default Constructor
// // // // if we do not create any constructor,the compiler automatically creates a default constructor/no-arg constructor  during execution time

// // // // class vj{
// // // //     int a;
// // // //     boolean b;
// // // //     String c;
// // // //     short d;
// // // //     long e;
// // // //     float f;
// // // //     double g;
// // // //     char h;

// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj();
// // // //         System.out.println(obj.a);
// // // //         System.out.println(obj.b);
// // // //         System.out.println(obj.c);
// // // //         System.out.println(obj.d);
// // // //         System.out.println(obj.e);
// // // //         System.out.println(obj.f);
// // // //         System.out.println(obj.g);
// // // //         System.out.println(obj.h);

// // // //     }
// // // // }

// // // // class vj{
// // // //     int a;
// // // //     boolean b;
// // // //     vj(){
// // // //         a = 0;
// // // //         b = false;
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj();
// // // //         System.out.println("default value");
// // // //         System.out.println(obj.a);
// // // //         System.out.println(obj.b);
// // // //     }
// // // // }

// // // // constructor point:-
// // // // -> constructor is used to initialize the object
// // // //  constructor is called when an object is created
// // // // -> two rules for creating constructor are:
// // // // 1. constructor name must be same as the class name
// // // // 2. constructor must not have any return type
// // // // ->constructor can not be abstract or static or finally
// // // // ->constructor can be overloaded but can not be overriden

// // // // constructor Overloading:-
// // // // its similar to method overloading
// // // // we can also create two or more constructor with different parameters,
// // // // this is call constructor overloading

// // // // class vj{
// // // //     String name;
// // // //     int age;
// // // //     vj(){
// // // //         this.name = "vijendra";
// // // //     }
// // // //     vj(String name){
// // // //         this.name = name;
// // // //     }
// // // //     vj(int age){
// // // //         this.age = age;
// // // //     }
// // // //     public void getname(){
// // // //         System.out.println("ur name is :- "+this.name);
// // // //         System.out.println("ur age is :- "+this.age);
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj();
// // // //         vj obj1 = new vj("vijay");
// // // //         vj obj2 = new vj(30);
// // // //         obj.getname();
// // // //         obj1.getname();
// // // //         obj2.getname();
// // // //     }
// // // // }

// // // // // it is possible to call one contructor from another constructor
// // // // class vj{
// // // //     int sum;
// // // //     vj(){
// // // //         this(3,2);
// // // //     }
// // // //     vj(int a, int b){
// // // //         // sum = a + b;
// // // //         // System.out.println("sum of two number is "+sum);
// // // //         this.sum = a + b;
// // // //     }
// // // //     void display(){
// // // //         System.out.println("sum of two number is "+sum);
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj();
// // // //         obj.display();
// // // //     }
// // // // }

// // // // ?---call the constructor of the superclass from the subclass---?
// // // // class language{
// // // //     language(int v1,int v2){
// // // //         if(v1>v2){
// // // //             System.out.println("The largest number is"+v1);
// // // //         }
// // // //         else{
// // // //             System.out.println("The largest number is"+v2);
// // // //         }

// // // //     }
// // // // }
// // // // compare Two string
// // // // class vj{
// // // //     public static void main(String[] args) {
// // // //         // String s1 = "vijendra";
// // // //         // String s2 = "vijendra";
// // // //         // String s3 = "python";

// // // //         // boolean result = s1.equals(s2);
// // // //         // System.out.println(result);

// // // //         // boolean result1 = s1.equals(s3);
// // // //         // System.out.println(result1);

// // // //         // boolean result = (s1 == s2);
// // // //         // System.out.println(result);

// // // //         // Differentiate between == and equals

// // // //         // String n1= new String("vj class");
// // // //         // String n2= n1;
// // // //         // System.out.println("check if two string are eqaul");
// // // //         // boolean result = n1 == n2;
// // // //         // System.out.println(result);

// // // //         // boolean result1 = n1.equals(n2);
// // // //         // System.out.println(result1);
// // // // // String x = "hello vj";
// // // // // x = "hello vijendra";
// // // // // System.out.println(x);

// // // // // methods of String
// // // // // contain()
// // // // // substring()
// // // // // join()
// // // // // replace()
// // // // // replaceAll()
// // // // // replaceFirst()
// // // // // charAt()
// // // // // getBytes()
// // // // // indexOf()
// // // // // compareTo()
// // // // // CompareToIgnoreCase()
// // // // // Trim()
// // // // // fromat()
// // // // // split()
// // // // // toLowerCase()
// // // // // toUpperCase()
// // // // // valueOf()
// // // // // toCharArray()
// // // // // matches()
// // // // // startWith()
// // // // // endWith()
// // // // // length()

// // // // // Access Modifiers
// // // // // access Modifiers are used to set the accessibility(visibility) of classes, interface, vsriable, methods, constructors and the setter methods.
// // // // // class vj{
// // // // //     public void method(){..}
// // // // //     private void method1(){..}
// // // // // }

// // // // // Types of access modifire
// // // // // default:- declaration are visible only within the package 
// // // // // private:- declaration are visible only within the class
// // // // // protected:- declaration are visible only within the class and subclasses
// // // // // public:- declaration are visible everywhere

// // // //     }
// // // // }

// // // // package defaultPackage;
// // // // class vj{
// // // //     void message(){

// // // //     }
// // // // }

// // // // class vj{
// // // //     private String name;
// // // // }

// // // // class index1{
// // // // public static void main(String[] args) {
// // // //     vj obj = new vj();
// // // //     obj.name = "vijendra";
// // // // }
// // // // }

// // // // class vj{
// // // //     private String name;

// // // //     public String getName(){
// // // //         return this.name;
// // // //     }
// // // //     public void setName(String name){
// // // //         this.name = name;
// // // //     }
// // // // }

// // // // class index{
// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj();
// // // //         obj.setName("vijendra");
// // // //         System.out.println(obj.getName());
// // // //     }
// // // // }

// // // // ---this Keyword---
// // // // it is used to refer to the current object inside a method or constructor.

// // // // class vj{
// // // //     int x;
// // // //     vj(int x){
// // // //         this.x=x;
// // // //         System.out.println("this reference = " + this);
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj(9);
// // // //         System.out.println(obj);
// // // //     }
// // // // }

// // // // using this for ambiguity variable

// // // // class vj{
// // // //     int x;
// // // //     vj(int x){
// // // //        this.x=x;
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj(9);
// // // //         System.out.println(obj.x);
// // // //     }
// // // // }

// // // // class vj{
// // // //     // int x;
// // // //     // vj(int y){
// // // //     //    x=y;
// // // //     // }

// // // //     // is equivalent to
// // // //     int x;
// // // //     vj(int y){
// // // //        this.x=y;
// // // //     }

// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj(9);
// // // //         System.out.println(obj.x);
// // // //     }
// // // // }

// // // // class vj{
// // // //     String name;
// // // //     void setName(String name){
// // // //         this.name =name;
// // // //     }

// // // //     String getName(){
// // // //         return this.name;
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj();
// // // //         obj.setName("vijendra");
// // // //         System.out.println(obj.getName());
// // // //     }
// // // // }

// // // // // Using this in Constructor overloading
// // // // class vj{
// // // //     private int a,b;
// // // //     private vj(int i, int j){
// // // //         this.a=i;
// // // //         this.b=j;
// // // //     }
// // // //         private vj(int i){
// // // // this(i,i);
// // // //     }
// // // //     private vj(){
// // // //         this(0);
// // // //     }
// // // //     @Override
// // // //     public String toString(){
// // // //         return this.a + " " + this.b + "i";
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj(10,20);
// // // //         vj obj1 = new vj(10);
// // // //         vj obj2 = new vj();
// // // //         System.out.println(obj);
// // // //         System.out.println(obj1);
// // // //         System.out.println(obj2);
// // // //     }
// // // // }

// // // // class vj{
// // // //     int x;
// // // //     int y;
// // // //     vj(int x, int y){
// // // //         this.x=x;
// // // //         this.y=y;
// // // //         System.out.println("before passing this to addTwo() method");
// // // //         System.out.println("x= " + this.x + " , y= " + this.y);

// // // //         add(this);
// // // //         System.out.println("after passing this to addTwo() method");
// // // //         System.out.println("x= " + this.x + " , y= " + this.y);
// // // //     }
// // // //     void add(vj obj){
// // // //         obj.x+=2;
// // // //         obj.y+=2;
// // // //     }
// // // // }
// // // // class vijay{
// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj(1,-2);
// // // //     }
// // // // }

// // // // ---final keyword---
// // // // it is used to denote constant. it can be used with variable, class , method , package and interface.

// // // // once any entity(variable, method or class) is declare final, it can be assigned only once.
// // // // that is:-
// // // //--> the final variable cannot be reinitialized with another value
// // // // --> the final method cannot be overridden
// // // // --> the final class cannot be extended

// // // // class vj{
// // // //     public static void main(String[] args) {
// // // //         final int x = 40;
// // // //         x=89;
// // // //         System.out.println(x);
// // // //     }
// // // // }

// // // // class vj{
// // // //     public final void display(){
// // // //         System.out.println("Hello vj");
// // // //     }
// // // // }
// // // // class vijay extends vj{
// // // //     public final void display(){
// // // //         System.out.println("Hello soheb");
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         vijay obj = new vijay();
// // // //         obj.display();
// // // //     }
// // // // }

// // // // final class vj{
// // // //     public void display(){
// // // //         System.out.println("Hello vj");
// // // //     }
// // // // }
// // // // class vijay extends vj{
// // // //     public void display(){
// // // //         System.out.println("Hello soheb");
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         vijay obj = new vijay();
// // // //         obj.display();
// // // //     }
// // // // }

// // // // ---recurision:---
// // // // it is a process in which a method calls itself.

// // // // class vj{
// // // //     static int fact(int n){
// // // //         if(n!=0){
// // // //             return n*fact(n-1);
// // // //         }
// // // //         else{
// // // //             return 1;
// // // //         }

// // // //         }
// // // //         public static void main(String[] args) {
// // // //             int num  = 5,result;
// // // //             result= fact(num);
// // // //           System.out.println(num + "factorial is" + result);
// // // //         }
// // // //     }

// // // // instanceof operator
// // // // it is used to check whether an object is an instance of a particular class or not 
// // // // Syntax:-
// // // // objname instanceof classname;

// // // // class vj{
// // // //     public static void main(String[] args) {
// // // //         String name = "Vijendra";
// // // //         boolean result = name instanceof String;
// // // //         System.out.println(result);

// // // //         vj obj = new vj();
// // // //         boolean result1 = obj instanceof vj;
// // // //         System.out.println(result1);
// // // //     }
// // // // }

// // // // class vj{ //superclass

// // // // }
// // // // class vijay extends vj{ //subclass

// // // // }
// // // // class xyz{
// // // //     public static void main(String[] args) {
// // // //         vijay obj = new vijay();
// // // //         System.out.println(obj instanceof vijay);
// // // //         System.out.println(obj instanceof vj);
// // // //     }
// // // // }

// // // // instanceof interface
// // // // it is used to check whether an object is an instance of a particular interface or not 
// // // // Syntax:-
// // // // objname instanceof interface;

// // // // instanceof in interface

// // // // interface vj{

// // // // }
// // // // class vijay implements vj{

// // // // }
// // // // class xyz{
// // // //     public static void main(String[] args) {
// // // //         vijay obj = new vijay();
// // // //         System.out.println(obj instanceof vijay);
// // // //         System.out.println(obj instanceof vj);

// // // //     }
// // // // }

// // // // ------Inheritence-----

// // // // it is one of the key features of oop that allow us to create a new class from an existing class.

// // // // new class that is created known as subclass(child or derived) and the existing class from where the child class is derived is known as superclass(parent or base). 

// // // // class vj{
// // // //     // method and field
// // // // }
// // // // // use of extend keyword
// // // // // to perform inheritence

// // // // class vijay extends vj{
// // // //     // method and field of vj
// // // //     // method and field of vijay
// // // // }

// // // // class vj{
// // // //     String name;
// // // //     public void eat(){
// // // //         System.out.println("vj is Eating");
// // // //     }
// // // // }

// // // // class vijay extends vj{
// // // //     public void display(){
// // // //         System.out.println("vijay is eating" + name);
// // // //     }
// // // // }

// // // // class main{
// // // //     public static void main(String[] args) {
// // // //         vijay obj = new vijay();
// // // //         obj.name = " vijendra";
// // // //         obj.eat();
// // // //         obj.display();
// // // //     }
// // // // }

// // // // is-a relationship
// // // // inheritence is an is-a relationship between two classes.
// // // // car is vechile
// // // // Orange is a fruit

// // // // method overridding
// // // // class vj{
// // // //     String name;
// // // //     public void eat(){
// // // //         System.out.println("vj is Eating");
// // // //     }
// // // // }

// // // // class vijay extends vj{
// // // //     @Override
// // // //     public void eat(){
// // // //         super.eat();
// // // //         System.out.println("vijay is eating");
// // // //     }
// // // //     public void display(){
// // // //         System.out.println("vijay is eating" + name);
// // // //     }
// // // // }

// // // // class main{
// // // //     public static void main(String[] args) {
// // // //         vijay obj = new vijay();
// // // //         obj.name = " apple";
// // // //         obj.eat();
// // // //         obj.display();
// // // //     }
// // // // }

// // // // class vj{
// // // //     protected String name;
// // // //     protected void display(){
// // // //         System.out.println("hello vijendra");
// // // //     }
// // // // }
// // // // class vijay extends vj{
// // // //     public void getinfo(){
// // // //         System.out.println("hello " + name);
// // // //     }
// // // // }

// // // // class main{
// // // //     public static void main(String[] args) {
// // // //         vijay obj = new vijay();
// // // //         obj.name = "apple";
// // // //         obj.display();
// // // //         obj.getinfo();

// // // //     }
// // // // }

// // // // Types of inheritence
// // // // Single Inheritance
// // // // class Parent{
// // // //     // parent class methods and fields
// // // // }

// // // // class Child extends Parent{
// // // //     // child class methods and fields
// // // // }

// // // // // Multilevel Inheritance
// // // // class Grandparent{
// // // //     // grandparent class methods and fields
// // // // }

// // // // class Parent extends Grandparent{
// // // //     // parent class methods and fields
// // // // }

// // // // class Child extends Parent{
// // // //     // child class methods and fields
// // // // }

// // // // // Hierarchical Inheritance
// // // // class Parent{
// // // //     // parent class methods and fields
// // // // }

// // // // class Child1 extends Parent{
// // // //     // child1 class methods and fields
// // // // }

// // // // class Child2 extends Parent{
// // // //     // child2 class methods and fields
// // // // }

// // // // // Multiple Inheritance (Not supported in Java)
// // // // // Java supports multiple inheritance through interfaces
// // // // interface Interface1{
// // // //     // interface1 methods
// // // // }

// // // // interface Interface2{
// // // //     // interface2 methods
// // // // }

// // // // class MyClass implements Interface1, Interface2{
// // // //     // class methods and fields
// // // // }

// // // // Super:- it is used to access the parent class members(attribute,constructor,methods)

// // // // uses of super keyword
// // // // 1. To call methods of the parent class that is overriddien in the sub class.
// // // // 2. To access attribute of the parent class if both class super and sub class have same attribute with the same name.
// // // //3. to explicitly call superclass no-arg(default) or parameterized constructor from subclass constructor

// // // // class vijay{
// // // //     public void display(){
// // // //         System.out.println("hello");
// // // //     }
// // // // }
// // // // class XYZ extends vijay{
// // // //     @Override
// // // //     public void display(){
// // // //         System.out.println("hello vijendra");
// // // //     }
// // // //     public void mno(){
// // // //         super.display();
// // // //     }

// // // // }

// // // // class main{
// // // //     public static void main(String[] args) {
// // // //         XYZ obj = new XYZ();
// // // //         obj.mno();
// // // //     }
// // // // }

// // // // class vijay{
// // // //     protected String type = "animal";
// // // // }

// // // // class xyz extends vijay{
// // // //    public String type = "mammal";
// // // //    public void printype(){
// // // //        System.out.println("its a " + type);
// // // //        System.out.println("its a " + super.type);

// // // //    }
// // // // }

// // // // class main{
// // // //     public static void main(String[] args) {
// // // //         xyz obj = new xyz();
// // // //         obj.printype();
// // // //     }
// // // // }

// // // // class animal{
// // // //     animal(){
// // // //         System.out.println("animal");
// // // //     }
// // // // }
// // // // class cat extends animal{
// // // //     cat(){
// // // //         super();
// // // //         System.out.println("cat");
// // // //     }
// // // // }

// // // // class main{
// // // //     public static void main(String[] args) {
// // // //         cat obj = new cat();
// // // //     }
// // // // }

// // // // Abstract Class and Abstract Method
// // // // syntax:-
// // // // abstract class xyz{
// // // //     // field and method
// // // // }

// // // // abstract class xyz{
// // // //     abstract void method;

// // // //     void method2{
// // // //         System.out.println("hello");
// // // //     }
// // // // }

// // // // abstract class xyz{
// // // //     public void display(){
// // // //         System.out.println(" its a java");
// // // //     }
// // // // }

// // // // class vijay extends xyz{
// // // //     public static void main(String[] args) {
// // // //         vijay obj = new vijay();
// // // //         obj.display();
// // // //     }
// // // // }

// // // // abstract class xyz{
// // // //     abstract void sound();
// // // //     public void display(){
// // // //         System.out.println("hello");
// // // //     }

// // // // }
// // // // class vijay extends xyz{
// // // //     public void sound(){
// // // //         System.out.println("meow");
// // // //     }
// // // // }
// // // // class main{
// // // //     public static void main(String[] args) {
// // // //         vijay obj = new vijay();
// // // //         obj.sound();
// // // //         obj.display();
// // // //     }
// // // // }

// // // // Interface
// // // // interface xyz{
// // // //     public void getType();
// // // //     public void getVersion();
// // // // }

// // // // interface polygon{
// // // //     void getArea(int length,int breadth);

// // // // }
// // // // class rectangle implements polygon{
// // // //     public void getArea(int length,int breadth){
// // // //         System.out.println("area of rectangle is "+(length*breadth));
// // // //     }
// // // // }
// // // // class vijay{
// // // // public static void main(String[] args) {
// // // //     rectangle obj = new rectangle();
// // // //     obj.getArea(10,20);
// // // // }
// // // // }

// // // /*  Multiple Interface:-
// // //  interface A{

// // // }
// // // interface B{

// // // }
// // // class C implements A,B{

// // // }

// // // */
// // // // Extending an Interface
// // // // similar to class , interface can extend other interface,the extends keyword is used for extending interface

// // // // interface xyz{
// // // //     // member
// // // // }
// // // // interface vijayd extends xyz{

// // // // }

// // // // extend  Multiple Interface:-
// // // //  interface A{

// // // // }
// // // // interface B{

// // // // }
// // // // interface C extends A,B{

// // // // }

// // // // interface polygon{
// // // //     void getArea();

// // // //     default void getSides(){
// // // //         System.out.println("i can get sies of a polygon");
// // // //     }
// // // // }
// // // // class rectangle implements polygon {
// // // //     public void getArea(){
// // // //         int length = 9;
// // // //         int breadth = 4;
// // // //         int area = length*breadth;
// // // //         System.out.println("area of rectangle is "+area);
// // // //     }
// // // //     // overrides the getsides()
// // // //     public void getSides(){
// // // //         System.out.println("i have 4 sides");
// // // //     }
// // // // }
// // // // class square implements polygon{
// // // //     public void getArea(){
// // // //         int length = 9;
// // // //         int area = length*length;
// // // //         System.out.println("area of square is "+area);
// // // //     }
// // // // }
// // // // class vijay{
// // // //     public static void main(String[] args) {
// // // //         rectangle obj = new rectangle();
// // // //         obj.getArea();
// // // //         obj.getSides();

// // // //         square sqr = new square();
// // // //         sqr.getArea();
// // // //         sqr.getSides();

// // // //     }
// // // // }

// // // // // ----Method overriding----
// // // // class vj{
// // // //     public void displayinfo(){
// // // //         System.out.println("its vj class");
// // // //     }
// // // // }
// // // // class vijay extends vj{
// // // //     public void displayinfo(){
// // // //         super.displayinfo();
// // // //         System.out.println("its vijay class");
// // // //     }
// // // // }
// // // // class xyz{
// // // //     public static void main(String[] args) {
// // // //         vijay obj = new vijay();
// // // //         obj.displayinfo();
// // // //     }
// // // // }

// // // // class vj{
// // // //     protected void displayinfo(){
// // // //         System.out.println("its vj class");
// // // //     }
// // // // }
// // // // class vijay extends vj{
// // // //     public void displayinfo(){
// // // //         super.displayinfo();
// // // //         System.out.println("its vijay class");
// // // //     }
// // // // }
// // // // class xyz{
// // // //     public static void main(String[] args) {
// // // //         vijay obj = new vijay();
// // // //         obj.displayinfo();
// // // //     }
// // // // }

// // // // super:- it is used to access superclass members(attribute,constructor,methods)
// // // /* 
// // // 1. TO call mathod of the super class that is overridden in subclass
// // // 2. to acces attribute of the super class if both super class and subclass have attribute with same name
// // // 3.to explicitly call superclass no-arg(default) pr parameterized construcotr from the subclass constructor
// // // */

// // // // class vj{
// // // //     public void display(){
// // // //         System.out.println("its vj class");
// // // //     }
// // // // }
// // // // class vijay extends vj{

// // // //     public void display(){
// // // //         System.out.println("its vijay class");
// // // //     }
// // // //     public void getinfo(){
// // // //         super.display();
// // // //         display();
// // // //     }
// // // // }

// // // // class xyz{
// // // //     public static void main(String[] args) {
// // // //         vijay obj = new vijay();
// // // //         obj.getinfo();
// // // //     }
// // // // }

// // // // class vj{
// // // //     protected String type = "animal";
// // // // }
// // // // class vijay extends vj{
// // // //     public String type = "mammal";
// // // //     public void display(){
// // // //         System.out.println("bat is " + type);
// // // //         System.out.println("dog is " + super.type);
// // // //     }
// // // // }
// // // // class xyz{
// // // //     public static void main(String[] args) {
// // // //         vijay obj = new vijay();
// // // //         obj.display();
// // // //     }
// // // // }

// // // // class vijay{
// // // //     vijay(){
// // // //         System.out.println("hello vijay");
// // // //     }
// // // //     vijay(String name){
// // // //         System.out.println("hello "+name);
// // // //     }
// // // // }

// // // // class xyz extends vijay{
// // // //      xyz(){
// // // //          super("vijendra");
// // // //          System.out.println("hello ak");
// // // //      }
// // // // }
// // // // class index{
// // // //     public static void main(String[] args) {
// // // //         xyz obj = new xyz();
// // // //     }
// // // // }

// // // // abstract class vj{
// // // //     // field and methods
// // // // }

// // // // abstract class abc {
// // // //     abstract void display();
// // // //     void display2(){
// // // //         System.out.println("hello");
// // // //     }
// // // // }

// // // // class vijay{
// // // //     abstract void display();
// // // // }

// // // // abstract class vj{
// // // //     public void display(){
// // // //         System.out.println("hello");
// // // //     }
// // // // }class vijay extends vj{
// // // //     public static void main(String[] args) {
// // // //         vijay obj = new vijay();
// // // //         obj.display();
// // // //     }
// // // // }

// // // // abstract class animal{
// // // //     abstract void sound();
// // // //     public void eat(){
// // // //         System.out.println("eating");
// // // //     }
// // // // }
// // // // class cat extends animal{
// // // //     public void sound(){
// // // //         System.out.println("meow");
// // // //     }
// // // // }
// // // // class index{
// // // //     public static void main(String[] args) {
// // // //         cat obj = new cat();
// // // //         obj.sound();
// // // //         obj.eat();
// // // //     }
// // // // }

// // // // interface vj{
// // // //     void display();
// // // //     void display2();

// // // // }

// // // // interface vijay{
// // // //     void getArea(int length,int breadth);
// // // // }

// // // // class rectangle implements vijay{
// // // //     public void getArea(int length,int breadth){
// // // //         System.out.println("area of rectangle is "+(length*breadth));
// // // //     }
// // // // }
// // // // class abc{
// // // //     public static void main(String[] args) {
// // // //         rectangle obj = new rectangle();
// // // //         obj.getArea(10,20);
// // // //     }
// // // // }

// // // // interface A{
// // // //     // code
// // // // }
// // // // interface B{
// // // //     // code
// // // // }
// // // // class c implements A,B{

// // // // }

// // // // interface line{
// // // //     // code
// // // // }

// // // // interface rectangle extends line{
// // // //     // code
// // // // }

// // // // interface A{
// // // //     // code
// // // // }
// // // // interface B{
// // // //     // code
// // // // }
// // // // class c implements A,B{

// // // // }

// // // // class vj{
// // // //     public static void main(String[] args) {
// // // //         for(;;){
// // // //     System.out.println("hello");
// // // //         }
// // // //     }
// // // // }

// // // // class vj{
// // // //      void sum(int a,int b){
// // // //         System.out.println("sum is "+(a-b));
// // // //     }

// // // //     void sum(long a,long b){
// // // //         System.out.println("sum is "+(a+b));
// // // //     }

// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj();
// // // //         obj.sum(2, 2);

// // // //     }
// // // // }

// // // // class vj{
// // // //     int x =10;
// // // // }
// // // // class index{
// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj();
// // // //         System.out.println(obj.x);
// // // //     }
// // // // }

// // // // class vj{
// // // //     int age;
// // // //     vj(){

// // // //         System.out.println("age is " + age);
// // // //     }
// // // //     {
// // // //         age =10;
// // // //     }

// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj();
// // // //         // obj.age = 34;
// // // //         // System.out.println("age is " + obj.age);

// // // // }
// // // // }

// // // // class vj{
// // // //     int age;
// // // //     {
// // // //         System.out.println("instance initiailizer block invoked");
// // // //             }

// // // //    vj(){
// // // //     System.out.println("constructor is invoked");
// // // //    }

// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj();
// // // //         vj obj2 = new vj();
// // // //     }
// // // // }

// // // // class vj{
// // // //     vj(){
// // // //         System.out.println("parent class constructor invoked");
// // // //     }
// // // //     class abc extends vj{
// // // //         abc(){
// // // //             super();
// // // //             System.out.println("child class constructor invoked");
// // // //         }
// // // //         {
// // // //             System.out.println("child class instance initializer block invoked");
// // // //         }
// // // //     }

// // // // }

// // // // class index{
// // // //     public static void main(String[] args) {
// // // //         abc obj = new abc();
// // // //     }
// // // // }

// // // // class A{
// // // //     A(){
// // // //         System.out.println("parent class constructor invoked");
// // // //     }
// // // // }

// // // // class B extends A{
// // // //     B(){
// // // //         super();
// // // //         System.out.println("child class constructor invoked");
// // // //     }
// // // //     B(int a){
// // // //         super();
// // // //         System.out.println("child class constructor invoked" + a);

// // // //     }

// // // //     {
// // // //         System.out.println("child class instance initializer block invoked");
// // // //     }

// // // // }

// // // // class index{
// // // //     public static void main(String[] args) {
// // // //         B obj1 = new B();
// // // //         B obj = new B(10);

// // // //     }
// // // // }

// // // // class vj{
// // // //     final int x =10;
// // // //     void display(){
// // // //         x = 8;
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj();
// // // //         obj.display();
// // // //     }

// // // // }

// // // // final class vj{
// // // //     void display(){
// // // //         System.out.println("Hello vj");
// // // //     }
// // // // }
// // // // class vijay extends vj{
// // // //     void display(){
// // // //         System.out.println("Hello soheb");
// // // //     }
// // // // }

// // // // final class vj{
// // // // int x =10;
// // // // }

// // // // class vijay extends vj{

// // // // }

// // // // class vj{
// // // //     final void abc(){
// // // //         System.out.println("hello vijendra");
// // // //     }
// // // // }
// // // // class vijay extends vj{

// // // //     public static void main(String[] args) {
// // // //         // vijay obj = new vijay();
// // // //         // obj.abc();
// // // //         new vijay().abc();
// // // //     }
// // // // }

// // // // class vj{
// // // //  int x;
// // // //  String name;
// // // //  final String abc;
// // // // }

// // // // class vj{
// // // //     final int x;
// // // //     vj(){
// // // //         x=10;
// // // //         System.out.println(x);
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj();
// // // //     }
// // // // }

// // // // class vj{
// // // //     static final int x; 
// // // //     static{
// // // //         x=10;
// // // //     }
// // // // public static void main(String[] args) {
// // // //     System.out.println(vj.x);
// // // // }
// // // // }

// // // // class vj{
// // // //     int age(final int x){
// // // //         x+=2;
// // // //       return  x*x;
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj();
// // // //         obj.age(3);
// // // //     }
// // // // }

// // // // class vj{
// // // //     int x=10;
// // // // }
// // // // class abc extends vj{
// // // //     int x=20;

// // // //     public static void main(String[] args) {
// // // //         // vj obj = new abc();
// // // //         abc obj = new abc();
// // // //         System.out.println(obj.x);
// // // //     }
// // // // }

// // // // int x =20;

// // // // class vj{
// // // //     public static void main(String[] args) {
// // // //         abc obj;
// // // //     }
// // // // }

// // // // class vj{

// // // // }
// // // // class abc extends vj{
// // // //     public static void main(String[] args) {
// // // //         abc obj = new abc();
// // // //     }
// // // // }

// // // // class vj{
// // // //     private void eat(){

// // // //     }

// // // //     {
// // // //         System.out.println("instance initializer block");
// // // //     }

// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj();
// // // //         obj.eat();
// // // //     }
// // // // }

// // // // class  vj{
// // // //     void eat (){
// // // //         System.out.println("eating");
// // // //     }
// // // // }

// // // // class abc extends vj{
// // // //     void eat(){
// // // //         System.out.println("eat");
// // // //     }

// // // //     public static void main(String[] args) {
// // // //         vj obj = new abc();
// // // //         obj.eat();
// // // //     }
// // // // }

// // // // class vj{
// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj();
// // // //         System.out.println(obj instanceof vj);
// // // //     }
// // // // }

// // // // class vj{

// // // // }

// // // // class abc extends vj{

// // // //     public static void main(String[] args) {
// // // //         abc obj = new abc();
// // // //         System.out.println(obj instanceof vj);
// // // //     }
// // // // }

// // // // class vj{
// // // //     public static void main(String[] args) {
// // // //         vj obj = null;
// // // //         System.out.println(obj instanceof vj);
// // // //     }
// // // // }\

// // // // class vj{

// // // // }

// // // // class  abc extends vj{
// // // //     static void method(vj a){
// // // //         if(a instanceof abc){
// // // //             System.out.println("hello");
// // // //         }
// // // //     }

// // // //     public static void main(String[] args) {
// // // //         vj obj = new abc();
// // // //         abc.method(a);
// // // //     }
// // // // }

// // // // package vj;
// // // // class abc{
// // // //     public static void main(String[] args) {
// // // //         System.out.println("hello");
// // // //     }
// // // // }

// // // // class vj{
// // // //     private String name;
// // // //     public String get(){
// // // //         return name;
// // // //     }
// // // //     public void set(String name){
// // // //         this.name = name;
// // // //     }
// // // // }

// // // // class abc{
// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj();
// // // //         obj.set("vijendra");
// // // //         System.out.println(obj.get());

// // // //     }
// // // // }

// // // // class vj{
// // // //     private String name ="vijendra";

// // // //     public String get(){
// // // //         return name;
// // // //     }
// // // // }
// // // // class abc{
// // // //     public static void main(String[] args) {
// // // //         vj obj = new vj();
// // // //         System.out.println(obj.get());
// // // //     }
// // // // }

// // // // dataType[] arrayname = value
// // // // arrayRefVar = new dataType[size]

// // // // class vj{
// // // //     public static void main(String[] args) {
// // // //     //     int a[] = new int[5];
// // // //     //     a[0]=10;
// // // //     //     a[1]=20;
// // // //     //     a[2]=30;
// // // //     //     a[3]=40;
// // // //     //     a[4]=50;

// // // //     //     // System.out.println(a[3]);
// // // //     //     for(int i =0; i<=a.length; i++){
// // // //     //         System.out.println(a[i]);
// // // //     // }

// // // //     int [] a = {1,2,3,4};
// // // //     // for(int i =0; i<a.length; i++){
// // // //     //     System.out.println(a[i]);
// // // //     // }

// // // //     for(int i : a){
// // // //         System.out.println(i);
// // // //     }
// // // // }
// // // // }

// // // // class vj{
// // // //     static void abc(int arr[]){
// // // // int abc = arr[0];
// // // // for(int i =1;i<arr.length;i++){
// // // //     if(abc>arr[i]){
// // // //         abc = arr[i];
// // // //         System.out.println(abc);
// // // //     }

// // // // }
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         int arr[] = {1,2,3,4};
// // // //         abc(arr);
// // // //     }
// // // // }

// // // // class vj{
// // // //     static void min(int arr[]){
// // // //         int min  = arr[0];
// // // //         for(int i=1;i<arr.length;i++){
// // // //             if(min>arr[i]){
// // // //                 min = arr[i];        
// // // //             }

// // // //         }
// // // //         System.out.println(min);
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         int a[] = {4,6,8,9,64,1,2,3,4};
// // // //         min(a);
// // // //     }
// // // // }

// // // // class anonymous{
// // // //     static void printarr(int arr[]){
// // // //         for(int i=0;i<arr.length;i++){
// // // //             System.out.println(arr[i]);
// // // //         }
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         printarr(new int[] { 1, 2, 3, 4, 5 });
// // // //     }
// // // // }

// // // // class vj{
// // // //     static int[] get(){
// // // //         return new int[] {1,2,3,4,5,6,7,8,9,10};
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         int arr[] = get();
// // // //         for(int i=0;i<arr.length;i++){
// // // //             System.out.println(arr[i]);
// // // //         }
// // // //     }
// // // // }

// // // // class vj{
// // // //     public static void main(String[] args) {
// // // //         int arr[] = {1,2,3,4,5,6,7,8,9,10};
// // // //         for(int i=0;i<=arr.length;i++){
// // // //             System.out.println(arr[i]);
// // // //         }
// // // //     }
// // // // }

// // // // dataType[][] arrayname;
// // // // dataType [][]arrayname;
// // // // dataType arrayname[][];
// // // // dataType []arrayname[];

// // // // class vj {
// // // //     public static void main(String[] args) {
// // // //         int arr[][] = {
// // // //                 { 1, 2, 3 },
// // // //                 { 4, 5, 6 }
// // // //         };
// // // //         for(int i =0;i<arr.length;i++){
// // // //             for(int j =0;j<arr[i].length;j++){
// // // //                 System.out.print(arr[i][j] + " ");
// // // //             }
// // // //             System.out.println();
// // // //     }

// // // // }}

// // // // jagged Array
// // // // if we r creating odd number of colūmn in a 2d array, it is known as jaged array.

// // // // class vj{
// // // //     public static void main(String[] args) {
// // // //         int arr[][] = new int[3][];
// // // //         arr[0] = new int[2];
// // // //         arr[1] = new int[3];
// // // //         arr[2] = new int[4];

// // // //         int count =0;
// // // //         for(int i=0;i<arr.length;i++){
// // // //             for(int j=0;j<arr[i].length;j++){
// // // //                 arr[i][j] = count++;
// // // //             }
// // // //         }

// // // // for(int i=0;i<arr.length;i++){
// // // //     for(int j=0;j<arr[i].length;j++){
// // // //         System.out.print(arr[i][j] + " ");
// // // //     }
// // // //     System.out.println();

// // // //     }
// // // // }
// // // // }

// // // // class vj{
// // // //     public static void main(String[] args) {
// // // //         int arr[] = {1,2,3,4,5};

// // // //         Class x  = arr.getClass();
// // // //         String name = x.getName();
// // // //         System.out.println(name);

// // // //     }
// // // // }

// // // // class vj{
// // // //     public static void main(String[] args) {
// // // //         int a[][] = {{1,2,3},{4,5,6}};
// // // //         int b[][] = {{1,2,3},{4,5,6}};

// // // //         int c[][] = new int[2][3];

// // // //         for(int i =0;i<2;i++){
// // // //             for(int j=0;j<3;j++){
// // // //                 c[i][j] = a[i][j] + b[i][j];
// // // //                 System.out.print(c[i][j] + " ");
// // // //             }
// // // //             System.out.println();
// // // //         }

// // // //     }
// // // // }

// // // // class vj{
// // // //     public static void main(String[] args) {
// // // //  String x= "vijendra";
// // // //  x=x.concat("Sharma");
// // // //  System.out.println(x);

// // // //     }
// // // // }

// // // // // equal():- it is used to compare the original content of the string
// // // // class vj{
// // // //     public static void main(String[] args) {
// // //         // String x = "vijendra";
// // //         // String y = "vijendra";

// // //         // String z = new String("vijendra");
// // //         // String a = "vj";
// // //         // System.out.println(x.equals(y));
// // //         // System.out.println(x.equals(z));
// // //         // System.out.println(x.equals(a));

// // //         // String x = "vijendra";
// // //         // String y =  "VIJENDRA";
// // //         // System.out.println(x.equals(y));
// // //         // System.out.println(x.equalsIgnoreCase(y));

// // //         // System.out.println(x==y);
// // //         // System.out.println(x==z);

// // //         // System.out.println(x.compareTo(y));
// // //         // System.out.println(x.compareTo(z));
// // //         // System.out.println(x.compareTo(a));
// // //         // System.out.println(y.compareTo(a));

// // //         // String x = 30+40+"vijendra"+100;
// // //         // System.out.println(x);
// // //         // After a String literals, all the + will be treated as String operator 

// // //         // StringBuilder x = new StringBuilder("hello");
// // //         // StringBuilder y = new StringBuilder(" vj");
// // //         // StringBuilder z = x.append(y);
// // //         // // System.out.println(z);
// // //         // System.out.println(z.toString());

// // //         // // String.format() method allows to concatenate multiple string using format specifier like %s followed by th string values or object
// // //         // String x= new String("hello");
// // //         // String y= new String(" vj");
// // //         // String a = new String("234");
// // //         // String z = String.format("%s%s%s",x,y,a);
// // //         // System.out.println(z.toString());

// // //         // String.join() 
// // //         // it is available in java version 8 and all the above version 
// // //         // String.join() method accept arguments first seperator and an array of String objects.

// // // //     }
// // // // }
// // // // ==   :-  
// // // // compareTo()

// // // // StringBuilder is class provide append() method to perform concatenation operations. 

// // // // SubString:-

// // // // class vj{
// // // //     public static void main(String[] args) {
// // // //         String x = "my name is vijendra";
// // // //         System.out.println(x.substring(5,10));
// // // //     }
// // // // }

// // // import java.util.regex.*;
// // //  class vj{
// // //     public static void main(String[] args) {
// // //         // Pattern p = Pattern.compile(".s");
// // //         // Matcher m = p.matcher("as");
// // //         // boolean b = m.matches();

// // //         // boolean b2 = Pattern.compile(".s").matcher("as").matches();

// // //         // boolean b3 = Pattern.matches(".s","as");

// // //         // System.out.println(b + " " + b2 + " " + b3);

// // //         // [abc] - a,b,c (simple class)
// // //         // [^abc] - anything except a,b,c
// // //         // [a-zA-Z] - a to z or A to Z
// // //         // [a-d[m-p]] - a to d or m to p
// // //         // [a-z&&[def]] - d e f (intersection)
// // //         // [a-z&&[^bc]] - anything except b and c
// // //         // [a-z&&[^m-p]] - anything except m to p

// // //         // System.out.println(Pattern.matches("[amn]","abcd"));

// // //         // System.out.println(Pattern.matches("[amn]","n"));

// // // // toString()

// // //     }
// // //  }

// // // class vj{
// // //     int rollno;
// // //     String name;
// // //     String city;

// // //     vj(int rollno, String name, String city){
// // //         this.rollno = rollno;
// // //         this.name = name;
// // //         this.city = city;    
// // //     }
// // //     public String toString(){
// // //         return this.rollno + " " + this.name + " " + this.city;
// // //     }

// // //     public static void main(String[] args) {
// // //         vj obj = new vj(1,"vijendra","delhi");
// // //         vj obj1 = new vj(2, "vj", "abc");
// // //         System.out.println(obj);
// // //         System.out.println(obj1);
// // //     }

// // // }

// // // class vj{
// // //     public static void main(String[] args) {
// // //         // String x = "vijendra";
// // //         // char y = x.charAt(0);
// // //         // System.out.println(y);
// // //         // System.out.println(x.charAt(0));

// // //         // String str = "its vj class";
// // //         // int strlngth = str.length();
// // //         // // System.out.println(strlngth);
// // //         // System.out.println(str.charAt(0));
// // //         // System.out.println(str.charAt(strlngth-1));

// // //         // String str = "its vj class";
// // //         // for(int i=0;i<str.length();i++){
// // //         //     if(i%2!=0){
// // //         //         System.out.println("Char at "+i+" place " + str.charAt(i));
// // //         //     }

// // //     // }

// // // //     String str = "iits vj class";
// // // //     int count = 0;
// // // //     for(int i =0;i<str.length();i++){
// // // //         if(str.charAt(i) =='i'){
// // // //             count++;
// // // //         }  
// // // // }

// // // // System.out.println("frewuency " + count);

// // // // public String concat(String anotherString)

// // // }
// // // }

// // // class vj{
// // //     public static void main(String[] args) {
// // //         // String x = "vj";
// // //         // x.concat(" Sharma");
// // //         // System.out.println(x);
// // //         // x = x.concat(" is a trainer");
// // //         // System.out.println(x);
// // //         // String name = "its vj class";
// // //         // System.out.println(name.contains("vj"));
// // //         String x = "its vjcoder class";
// // //         if(x.contains("vjcoder")){
// // //             System.out.println("its vjcoder");
// // //         }
// // //         else{
// // //             System.out.println("its not vjcoder");
// // //         }
// // //     }
// // // }

// // // class vj{

// // //     public static void main(String[] args) {
// // // %a  floating-point
// // // %b  any Type 
// // // %c character
// // // %d integer
// // // %e floating point
// // // %f floating point 
// // // %g floating point
// // // %h any Type
// // // %n none 
// // // %s any Type
// // // %t date/time 
// // // %x integer
// // // String x = String.format("%s", 101);
// // // System.out.println(x);
// // // String x = String.format("%c",'c' );
// // // System.out.println(x);
// // // return methodname(){
// // // }
// // // method()
// // //     }
// // // }

// // // class vj{
// // //     static void p(){
// // //         System.out.println("hello vj");
// // //         p();
// // //     }
// // //     public static void main(String[] args) {
// // //         p();
// // //     }
// // // }

// // // class vj{
// // //     public static void main(String[] args) {
// // //         p();
// // //     }

// // //     static int count = 0;
// // //     static void p(){
// // //         count++;
// // //         if(count<=5){
// // //             System.out.println("hello "+ count);
// // //             p();
// // //         }

// // //     }
// // // }

// // // class vj{
// // //     static int x= 0,y=1,z= 0;
// // //     static void printfibo(int count){
// // //         if(count>0){
// // //             z = x+y;
// // //             x= y;
// // //             y = z;
// // //             System.out.println(" "+z);
// // //             printfibo(count-1);
// // //         }
// // //     }
// // //     public static void main(String[] args) {
// // //         int count = 10;
// // //         System.out.println(x + " " + y);
// // //         printfibo(count);
// // //     }
// // // }

// // //  class print_permutation {
// // //     public static void printPerm(String str, String permutation) {
// // //         if (str.length() == 0) {
// // //             System.out.println(permutation);
// // //             return;
// // //         }
// // //         for (int i = 0; i < str.length(); i++) {
// // //             char currChar = str.charAt(i);
// // //             // abc--->(ab)
// // //             String newstr = str.substring(0, i) + str.substring(i + 1);
// // //             printPerm(newstr, permutation + currChar);
// // //         }
// // //     }

// // //     public static void main(String[] args) {
// // //         String str = "abc";
// // //         printPerm(str, "");
// // //     }

// // // }

// // // import java.io.FileNotFoundException;
// // // import java.io.PrintWriter;
// // // import java.util.HashSet;

// // //  class unique_subsequences {
// // //     public static void Subsecuences1(String str, int idx, String newString, HashSet<String> set) {  //print all unique subsequences of a string aaa......
// // //         if (idx == str.length()) {
// // //             if (set.contains(newString)) {
// // //                 return;
// // //             } else {
// // //                 System.out.println(newString);
// // //                 set.add(newString);
// // //                 return;
// // //             }
// // //         }

// // //     char currchar = str.charAt(idx);

// // //     // to be.......
// // //     Subsecuences1(str, idx + 1, newString + currchar, set);

// // //         // or not to be
// // //         Subsecuences1(str, idx + 1, newString, set);

// // //     }

// // //     public static void main(String[] args) {
// // //         String str = "aaa";
// // // HashSet<String> set=new HashSet<>();
// // //         Subsecuences1(str, 0, "", set);
// // //     }
// // // }

// // // int x= 9/0
// // // sout 
// // // throw

// // // throws

// // // class vj{
// // //     public static void main(String[] args) {
// // // try {
// // //     // int x= 9/0;
// // //     String name = null;
// // //     System.out.println(name.length());
// // // } catch (Exception e) {
// // //     System.out.println(e.getMessage());
// // // }

// // // String x = "1234567";
// // // int y = Integer.parseInt(x);
// // // System.out.println(y);

// // // int i = 50;
// // // int j = 0;
// // // int data ;
// // // data = i/j;
// // // System.out.println(data);

// // // try {
// // //     data = i/j;
// // // } catch (Exception e) {
// // //     System.out.println(i/(j+2));
// // // }

// // // try {
// // //     int arr[] = {1,3,4,5};
// // //     System.out.println(arr[5]);
// // // } catch (ArrayIndexOutOfBoundsException e) {
// // //     System.out.println(e);
// // // }
// // // System.out.println("hello vj");

// // // PrintWriter pw;
// // // try {
// // //     pw = new PrintWriter("hello.txt");
// // //     pw.println("saved");
// // // } catch (FileNotFoundException e) {
// // //     System.out.println(e);
// // // }
// // // System.out.println("successfully upload");

// // // try {
// // //     int x[] = new int[5];
// // //     x[5] = 10/2;
// // //     System.out.println(x[6]);
// // // } catch (ArithmeticException e) {
// // //     System.out.println("arithmetic exception");
// // // }
// // // catch(ArrayIndexOutOfBoundsException e){
// // //     System.out.println("array index out of bound");
// // // }
// // // catch(Exception e){
// // //     System.out.println("exception occur");
// // // }

// // // System.out.println("complete");

// // //     }
// // // }

// // // class vj{
// // //     public static void main(String[] args) {
// // //     //  try {
// // //     //     String s =null;
// // //     //     System.out.println(s.length());
// // //     //  } catch (ArithmeticException e) {
// // //     //     System.out.println("arithmetic exception");
// // //     //  }
// // //     //  catch(ArrayIndexOutOfBoundsException e){
// // //     //     System.out.println("array index out of bound");
// // //     //  }
// // //     //  catch(Exception e){
// // //     //     System.out.println("exception occur");
// // //     //  }
// // //     //  System.out.println("complete");

// // //     // try {
// // //     //     int arr[] = new int[5];
// // //     //     arr[5] = 10/0;
// // //     // } 
// // //     // catch (Exception e) {
// // //     //     System.out.println("common task");
// // //     // }
// // //     // catch(ArithmeticException e){
// // //     //     System.out.println("arithmetic exception");
// // //     // }
// // //     // catch(ArrayIndexOutOfBoundsException e){
// // //     //     System.out.println("array index out of bound");
// // //     // }

// // // //   try{
// // // //     try{
// // // //         System.out.println("divide by zero");
// // // //         int x= 4/0;
// // // //     }
// // // //     catch(ArithmeticException e){
// // // //         System.out.println("divide by zero");
// // // //     }
// // // //     try{
// // // //         int arr[] = new int[5];
// // // //         arr[5] = 4;
// // // //     }
// // // //     catch(ArithmeticException e){
// // // //         System.out.println("divide by zero");
// // // //     }
// // // //     System.out.println("complete");

// // // //   }

// // // // catch(Exception e){
// // // //     System.out.println("common task");
// // // // }

// // // // try {
// // // //     int x = 3/0;
// // // //     System.out.println(x);
// // // // } catch (NullPointerException e) {
// // // //     System.out.println(e);
// // // // }
// // // // finally{
// // // //     System.out.println("finally block");
// // // // }
// // // // System.out.println("complete");

// // // // try {
// // // //     System.out.println("hello vj");
// // // //     int x= 10/0;
// // // //     System.out.println(x);
// // // // } catch (NullPointerException e) {
// // // //     System.out.println(e);
// // // // }
// // // // finally{
// // // //     System.out.println("finally block");
// // // // }
// // // // System.out.println("complete");

// // // // try {
// // // //     System.out.println("hello vj");
// // // //     int x= 10/0;
// // // //     System.out.println(x);
// // // // } catch (ArithmeticException e) {
// // // //     System.out.println(e);
// // // // }
// // // // finally{
// // // //     System.out.println("finally block");
// // // // }
// // // // System.out.println("complete");

// // //     }
// // // }

// // // class vj{
// // //     public static void valid(int age){
// // //         if(age<18){
// // //             throw new ArithmeticException("not eligible");
// // //         }
// // //         else{
// // //             System.out.println("eligible");
// // //         }
// // //     }
// // //     public static void main(String[] args) {
// // //         valid(15);
// // //         System.out.println();
// // //     }
// // // }

// // // class vj{
// // //     void x(){
// // //         int data = 2/0;
// // //     }
// // //     void y(){
// // //         x();
// // //     }

// // //     void z(){
// // //         try{
// // //             y();
// // //         }
// // //         catch(Exception e){
// // //             System.out.println("handle");
// // //         }

// // //     }
// // //     public static void main(String[] args) {
// // //         vj v = new vj();
// // //         v.z();
// // //         System.out.println("complete");
// // //     }
// // // }

// // // import java.io.IOException;

// // // class vj{
// // //     void m() throws IOException{
// // //         throw new IOException("device error");
// // //     }
// // //     void n() throws IOException{
// // //         m();
// // //     }
// // //     void p(){
// // //         try{
// // //             n();
// // //         }
// // //         catch(Exception e){
// // //             System.out.println(e);
// // //         }
// // //     }
// // //     public static void main(String[] args) {
// // //         vj v = new vj();
// // //         v.p();
// // //     }
// // // }

// // // class vj{
// // //     public static void main(String[] args) {
// // //         int x =034560;
// // //         while (x>0) {
// // //             int y = x%10;
// // //             System.out.print(y);
// // //             x = x/10;

// // //         }
// // //     }
// // // }

// // // for(int i = 0,i<10,i++){
// // // }

// // // ++i
// // // i++

// // // class vj{
// // //     public static void main(String[] args) {
// // //     int x=6;
// // //   for(int i=1;i<=x;i++){
// // //     for(int j=x;j<=i;j--){
// // //         System.out.print("* ");
// // //     }
// // //     System.out.println();
// // //   }

// // // int rows  = 4;
// // // int num  = 1;
// // // for(int i=1;i<=rows;i++){
// // //     for(int j=1;j<=i;j++){
// // //         System.out.println(num+" ");
// // //         num++;

// // // }
// // // System.out.println();

// // // }

// // // int rows = 5;
// // // for(int i=0;i<rows;i++){
// // //     int number = 1;
// // //     System.out.printf("%"+(rows - i)*2+ "s", "");
// // //     for(int j=0;j<=i;j++){
// // //         System.out.printf("%4d", number);
// // //         number = number * (i - j) / (j + 1);
// // //     }
// // //     System.out.println();
// // // }

// // //     }
// // // }

// // /*
// // final:-  1.  it is the keyword and access modifier 
// // which is used to apply restriction on a class , method , or variable 

// // 2. it is used with the classes ,method ,variables

// // finally :- it is the block in exception handling to execute the code whether the exception occurs or not.
 
// // finalize :-  it is the method in which is used to perform clean up processing 
// // just brfore object is garbage collected
// //  */

// // //  class vj{
// // // final int x = 12;
// // // void display(){
// // //     x= 20;
// // // }

// // // public static void main(String[] args) {
// // //     vj obj = new vj();
// // //     obj.display();
// // //     System.out.println(obj.x);

// // // }

// // //  }

// // // class vj{
// // //     public static void main(String[] args) {
// // //         try {
// // //             int x = 3/1;
// // //             System.out.println(x);
// // //         } catch (ArithmeticException e) {
// // //             System.out.println(e.getMessage());
// // //         }
// // //         finally{
// // //             System.out.println("its finally");
// // //         }
// // //     }
// // // }

// // // class Finalizevj{
// // //     public static void main(String[] args) {
// // //         Finalizevj obj = new Finalizevj();
// // //         System.out.println(("its hashcode:- " + obj.hashCode()));
// // //         obj = null;

// // //         System.gc(); 
// // //         System.out.println("End of the garbage collection");
// // //     }
// // //     protected void finalize(){
// // //         System.out.println("its finalize");
// // //     }
// // // }

// // // try-with-resource :- automaticalyy close the all resources at the end of the satement

// // // try(resource declaration){
// // //     // code 
// // // }
// // // catch(Exceptiontype e){

// // // }

// // // import java.io.*;
// // // class vj{
// // //     public static void main(String[] args) {
// // //         String line;
// // //         try(BufferedReader br = new BufferedReader(new FileReader("ab.txt"))){
// // //             while ((line=br.readLine())!=null) {
// // //                 System.out.println(line);

// // //             }
// // //         }catch (IOException e){
// // //             System.out.println("IOexcetion in try block" + e.getMessage());

// // //         }
// // //     }
// // // }

// // // Annotations
// // // they are metadata(data about data) for our program source
// // // they provide additional information about the program.

// // // @Annotationname 

// // // class vj{
// // //     public void display(){
// // //         System.out.println("hello vj");
// // //     }
// // // }

// // //     class abc extends vj{
// // //         @Override
// // //         public void display(){
// // //             System.out.println("hello vijay");
// // //         }

// // //     public static void main(String[] args) {
// // //       abc obj = new abc();
// // //       obj.display();

// // //     }

// // // }

// // // collection framework
// // // collection framework provide a set of interface and classes to implement various data structure and algorithm

// // /* 

// // List interface:- list interface is an ordered collection 
// // that allow us to add and remove element like an array 


// // set interface:- Allow us to store element in different sets 
// // similar to the set in mathematics. it cannot have duplicate elements

// // queue interface:- it is used when we want to store and 
// // access element in FIFO(first in first out).


// // interator interface:-  they provide method that can be used to
// //  access element of collections.



// //  why use collection framework

// //  provide various datastructure and algorithm that can be used directly.
 
// //  1.we do not have to write code to implement these datastructure and algorithm manually

// //  2.our code will much more efficient as the collection framework is highly optimized


// //  Arraylist class 
// //  Allow us to create resizeable array.The class impliments the list interface(in which we can add and remove element)

// //  import java.util.ArrayList;
// // class vj{
// //     public static void main(String[] args) {
// //         // int [] x = {1,2,3,4,5}
// //         ArrayList<String> list = new ArrayList<>();
// //         list.add("apple");
// //         list.add("banana");
// //         list.add("mango");
// //         list.add("Grapes");

// //         System.out.println(list);
// //     }
// // }

// // collection interface:-  is the root interface of collection framework 

// //            collection
// // list        set           queue
// //            sortedSet      Deque



// // methods of collections
// // add()
// // size()
// // remove()
// // iterator() :-  retrun an iterator to access element of collection
// // addAll() :-
// // removeAll():- 
// // clear():-

// // classes that implement List
// // list:- it is an interface we cannot create objects from it

// // Arraylist
// // linkedList
// // vector
// // stack

// // how to use
// // List<String> abc = new ArrayList<>();


// // methods of List:-

// // add()----------------------------------

// // addAll()
// // get()
// // iterator()
// // set()
// // remove()
// // removeAll()
// // crear()
// // size()
// // toArray()
// // contains()



// // */
// // // import java.util.*;

// // // class vj{
// // //     public static void main(String[] args) {
// // //         ArrayList<String> lang = new ArrayList<>();
// // //         lang.add("java");
// // //         lang.add("python");

// // //         lang.add("c++");

// // //         System.out.println(lang);  // [java, python, c++]

// // //         lang.add(1, "c");
// // //         System.out.println(lang);

// // //         ArrayList<String> lang1 = new ArrayList<>();
// // //         lang1.addAll(lang);
// // //         System.out.println(lang1);
// // //     }
// // // }

// // // class vj {
// // //     public static void main(String[] args) {
// // //         ArrayList<String> lang = new ArrayList<>();
// // //         lang.add("java");
// // //         lang.add("python");
// // //         lang.add("c++");

// // //         System.out.println(lang);

// // //         Iterator<String> itr = lang.iterator();
// // //         System.out.println("Element :- ");

// // //         while (itr.hasNext()) {
// // //             String element = itr.next();
// // //             System.out.print(element);
// // //             System.out.print(": ");

// // //             System.out.println(lang.indexOf(element));
// // //         }

// // //     }
// // // }


// // // class vj {
// // //     public static void main(String[] args) {
// // //         ArrayList<String> lang = new ArrayList<>();
// // //         lang.add("java");
// // //         lang.add("python");
// // //         lang.add("c++");

// // //         System.out.println(lang);

// // //         String element = lang.set(1,"javascript");

// // //         System.out.println(lang.size());
// // //         // System.out.println(element);
// // //         System.out.println(lang);
// // //     }
// // // }

// // // import java.util.ArrayList;

// // // class vj {
// // //     public static void main(String[] args) {
// // //         ArrayList<String> lang = new ArrayList<>();
// // //         lang.add("java");
// // //         lang.add("python");
// // //         lang.add("c++");

// // //         System.out.println(lang);

// // //         // String arr[] = new String[lang.size()];
// // //         // lang.toArray(arr);
// // //         // System.out.println(" Array is:- ");

// // //         // for(String i: arr){
// // //         //     System.out.println(i);
// // //         // }

// // //         // String abc = lang.toString();
// // //         // System.out.println(abc);

// // //         System.out.println(lang.contains("java"));
// // //     }
// // // }


// // // Vector:- it is an implementation of list interface that allow us to create resizeable array similar to the ArrayList.

// // // synchronize each individaul operations. automatically applies a lock to that operations. 
// // // it is because one thread is accesss it, an exception called concurrentModificationException is thrown.

// // //  collection.synchronizedList() :- it will return a synchronized list.

// // //  it is recommended to use ArrayList in place of vector because vector less efficient
                                
// // // add(element)
// // // add(index, element)
// // // addAll(vector) 

// // import java.util.*;

// // // import javax.swing.text.html.HTMLDocument.Iterator;

// // class vj{
// //     public static void main(String[] args) {
// //         // Vector<String> list = new Vector<>();
// //         // list.add("apple");
// //         // list.add("banana");
// //         // list.add("orange");

// //         // list.add(2, "mango");
// //         // System.out.println(list);

// //         // Vector<String> list1 = new Vector<>();
// //         // list.add("potato");

// //         // list1.addAll(list);
// //         // System.out.println(list1);

// //         // // Access Element 
// //         // System.out.println(list1.get(1));

// //     //   Iterator() 
// //     //   Iterator<String> itr = list1.iterator();
// //     //   System.out.println("Element :- ");
// //     //   while (itr.hasNext()) {
// //     //     System.out.print(itr.next());
// //     //     System.out.print(", ");
        
// //     //   }

// //     // while (list1.hasNext()) {
// //     //     System.out.print(list1.next());
// //     //     System.out.print(", ");
        
// //     //   }

// //     // remove()
// //     // removeAll()
// //     // clear()


// //     // set()
// //     // size()
// //     // toArray()
// //     // toString()
// //     // contain()


// //     // Stack --- LIFO\

// //     // Stack<String> stack = new Stack<>();
// //     // stack.push("apple");
// //     // stack.push("banana");
// //     // stack.push("Orange");

// //     // System.out.println(stack);
// //     // // System.out.println(stack.peek());
// //     // // System.out.println(stack.pop());
// //     // // System.out.println(stack.search("apple"));
// //     // System.out.println(stack.isEmpty());



// //     // -----------Queue-----------
// //     // add()
// //     // offer()
// //     // element()
// //     // peek()
// //     // remove()
// //     // poll()
// //     // Queue <Integer> queue = new LinkedList<>();
// //     // queue.add(1);
// //     // queue.offer(2);
// //     // System.out.println(queue);

// //     // System.out.println(queue.peek());
// //     // System.out.println(queue.poll());
// //     // System.out.println(queue);




// //     }
// // }


// // import java.util.*;
// // // import java.lang.*;

// // class vj{
// //     public static void main(String[] args) {
// //         // Map<String, Integer> map = new HashMap<>();
// //         LinkedHashMap <String, Integer> map = new LinkedHashMap<>(8,0.7f);
// //         map.put("apple", 1);
// //         map.put("mango", 2);
// //         map.put("banana", 3);

// //         System.out.println(map);
// //         enterySet()


// //     }
// // }

// // package defaultPackage;
// // class vj{
// //     private int x;
// //     public static void main(String[] args) {
// //         vj obj = new vj();
        
// //     }
// // // }

// // import java.util.HashMap;

// // class vj{
// //     public static void main(String[] args) {
// //         HashMap <String, Integer> map = new HashMap<>();
// //         map.put("Age", 123);
// //     }
// // }


// // class vj{
// //     int x;
// //     int y;

// //     vj(int x, int y){
// //         this.x=x;
// //         this.y=y;

// //     }

// //     public void getArea(){
// //         int area = x*y;
// //         System.out.println(area);

// //     }
// // public static void main(String[] args) {
// //     vj obj = new vj(4,5);
// //     obj.getArea();
// // }
// // }



// // import java.util.*;

// // class vj{
// //     public static void main(String[] args) {
// //         TreeSet<Integer> tree = new TreeSet<>();

// //         tree.add(1);
// //         tree.add(2);
// //         System.out.println(tree);

// //         TreeSet<Integer> tree1 = new TreeSet<>(tree);
// //         tree1.add(4);

// //         tree1.addAll(tree);
// //         System.out.println(tree1);
        
// //     }
// // }


// // Write a method named isEven that accepts an int argument.
// // The method should return true if  the argument is even,or false otherwise.
// //  Also write a program to test your method

// class vj{
//     public static boolean isEven(int x){
//         return x%2==0;
//     }
//     public static void main(String[] args) {
//        int num = 10;
//     //    vj obj = new vj();
//     //    System.out.println(obj.isEven(num));
//     if(isEven(num)){
//         System.out.println("Even is " + num);
//     }else{
//         System.out.println("Odd is " + num);
//     }
//     }
// }

// import java.lang.Thread; 





//newState: when we create  an instance of the threads class, a thread is ina new state

// runnable state:- Runnable status is a state where the thread is ready to run.

// running state :- A thread is execute  where multi-Thread Programming is derived by hardware

// waiting or blocked thread / blocked/waitngstate: java thread can be blocked when a resource is expected.

//terminated/dead sate: a thread can be terminated , which stop is execution immediately at any time.Once a thread is finished, it cannot resumed


// import static java.lang.Thread.sleep;
// class counter{
//     private int threadNo;
//     public counter(int threadNo){
//         this.threadNo = threadNo;
        
//     }
//     public void countNo() throws InterruptedException{
//         for(int i=0;i<10;i++){
//             sleep(500);
//             System.out.println("thread no-  "+ threadNo + " and iteration is:-  " + i);
//         }
//     }
// }
// class vj{
// public static void main(String[] args) throws InterruptedException {
//     counter c1 = new counter(1);
//     counter c2 = new counter(2);
//     long starttime = System.currentTimeMillis();
//     c1.run();
//     // c2.countNo();
//     long endtime = System.currentTimeMillis();
//     System.out.println("time taken is:- " + (endtime-starttime));
    
// }
// }


// // creating thread by extending the thread class continues 

// import java.util.concurrent.TimeUnit;

// class MyCounter extends Thread{
//     private int threadNo;
//     public MyCounter(int threadNo){
//         this.threadNo = threadNo;
//     }
//     public void run(){
//         countMe();
//     }
//     public void countMe(){
//         for(int i=1;i<=9;i++){
//             try {
//                 sleep(500);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//             System.out.println("thread no-  "+ threadNo + " and iteration is:-  " + i);
//         }
//     }
// }

// class vj{
//     public static void main(String[] args) throws InterruptedException {
//         MyCounter c1 = new MyCounter(1);
//         MyCounter c2 = new MyCounter(2);
//         long starttime = System.currentTimeMillis();
//         c1.start(); // run should be called by jvm
//         System.out.println("---------------------------------------------------");
//         c2.start();
//         Thread.sleep(2000);
//         long endtime = System.currentTimeMillis();
//         System.out.println("time taken is:- " + (endtime-starttime));   
//     }
// }





// creating threads by implementing runnable interface


// import java.util.Random;

// class MyCounter implements Runnable{
//     private int threadNo;

//     public MyCounter(int threadNo){
//         this.threadNo = threadNo;
//     }

//     @Override
//     public void run() {
//         Random random = new Random();
//         for(int i =0;i<=9;i++){
//             try {
//                 Thread.sleep(random.nextInt(500));
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//             System.out.println("the value if i is :" + i+ "and the thrad number is :" + threadNo);
            
//         }

//     }
// public static void main(String[] args) {
//    /* 
   
//     Thread thread1 = new Thread(new MyCounter(1));
//     Thread thread2 = new Thread(new MyCounter(2));
//     thread1.start();
//     thread2.start();

//     */
//     Thread thread = new Thread(new Runnable() {
//         @Override
//         public void run() {
//             for(int i=1;i<10;i++){
                
//                 try {
//                     Thread.sleep(500);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//                 System.out.println("the value of i is " + i);
//             }
//         }
        
//     });
//     thread.start();
// }

// }


// --------------------------------------------------------------------

// import java.util.Random;

// class MyCounter implements Runnable{
//     private int threadNo;

//     public MyCounter(int threadNo){
//         this.threadNo = threadNo;
//     }

//     @Override
//     public void run() {
//         Random random = new Random();
//         for(int i =0;i<=9;i++){
//             try {
//                 Thread.sleep(random.nextInt(500));
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//             System.out.println("the value if i is :" + i+ "and the thrad number is :" + threadNo);
            
//         }

//     }
// public static void main(String[] args) {
//    /* 
   
//     Thread thread1 = new Thread(new MyCounter(1));
//     Thread thread2 = new Thread(new MyCounter(2));
//     thread1.start();
//     thread2.start();

//     */
//     Thread thread = new Thread(new Runnable() {
//         @Override
//         public void run() {
//             for(int i=1;i<10;i++){
                
//                 try {
//                     Thread.sleep(500);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//                 System.out.println("the value of i is " + i);
//             }
//         }
        
//     });
//     thread.start();
// }

// }



// // synchronization under concurrency control 
// class App{
// public static int counter = 0;
// public static void main(String[] args) throws InterruptedException {
//     Thread thread1 = new Thread(new Runnable() {
//         @Override
//         public void run() {
//             for(int i=1;i<=1000;i++){
//                 App.counter++;
//             }
//             System.out.println("the loops in thread1 is over");
//         }
//     });
//     Thread thread2 = new Thread(new Runnable() {
//         @Override
//         public void run() {
//             for(int i=1;i<=1000;i++){
//                 App.counter++;
//             }
//             System.out.println("the loops in thread2 is over :- " + App.counter);
//         }
//     });

//     thread1.start();
//     thread2.start();
    
// }
// }



// // Synchronized method 
// synchronization is the ability to control the access of mltiple threads to any shared resource.

// Type of synchronization
// 1.synchronized method
// 2.synchronized block
// 3.static synchronized 

// class Brakets{
//     public void generate(){
//         for(int i=1;i<=10;i++){
//             if(i<=5){
//                 System.out.print("[");
//             }
//             else{
//                 System.out.print("]");
//             }
//         }
//         System.out.println();
//     }
// }
// class App{
//     public static void main(String[] args) {
//         Brakets obj = new Brakets();
//         new Thread(new Runnable() {
//             @Override
//             public void run(){
//                 for(int i=1;i<=5;i++){
//                     obj.generate();
//                 }

//             }
//         }).start();

//         new Thread(new Runnable() {
//             @Override
//             public void run(){
//                 for(int i=1;i<=5;i++){
//                     obj.generate();
//                 }

//             }
//         }).start();
//     }
// }



// class Brakets{
//     synchronized public void generate(){
//         for(int i=1;i<=10;i++){
//             if(i<=5){
//                 System.out.print("[");
//             }
//             else{
//                 System.out.print("]");
//             }
//         }
//         System.out.println();
//     }
// }
// class App{
//     public static void main(String[] args) {
//         Brakets obj = new Brakets();
//         new Thread(new Runnable() {
//             @Override
//             public void run(){
//                 for(int i=1;i<=5;i++){
//                     obj.generate();
//                 }

//             }
//         }).start();

//         new Thread(new Runnable() {
//             @Override
//             public void run(){
//                 for(int i=1;i<=5;i++){
//                     obj.generate();
//                 }

//             }
//         }).start();
//     }
// }


// class Brakets{
//     public void generate(){
//         synchronized(this){
//             for(int i=1;i<=10;i++){
//                 try {
//                     Thread.sleep(10);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//                 if(i<=5){
//                     System.out.print("[");
//                 }
//                 else{
//                     System.out.print("]");
//                 }
//             }
//             System.out.println();
//         }
//         for(int j=0;j<=10;j++){
//             try {
//                 Thread.sleep(25);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class App{
//     public static void main(String[] args) {
//         Brakets obj = new Brakets();
//         new Thread(new Runnable(){
//             @Override
//             public void run(){
//                 long starttime = System.currentTimeMillis();
//                 for(int i=1;i<=5;i++){
//                     obj.generate();
//                 }
//                 long endtime = System.currentTimeMillis();
//                 System.out.println("Time required for thread 1 was : " + (endtime-starttime));
//             }
//         }).start();

//         new Thread(new Runnable(){
//             @Override
//             public void run(){
//                 long starttime = System.currentTimeMillis();
//                 for(int i=1;i<=5;i++){
//                     obj.generate();
//                 }
//                 long endtime = System.currentTimeMillis();
//                 System.out.println("Time required for thread 2 was : " + (endtime-starttime));
//             }
//         }).start();
//     }
// }


// class Brakets{
//     public void generate(){
//         synchronized(this){
//             for(int i=1;i<=10;i++){
//                 try {
//                     Thread.sleep(10);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//                 if(i<=5){
//                     System.out.print("[");
//                 }else{
//                     System.out.print("]");
//              }
//             }
//             System.out.println();
//         }
//         for(int j=0;j<=10;j++){
//             try {
//                 Thread.sleep(25);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }  
//         }
//     }
// }
// class app{
//     public static void main(String[] args) {
//         Brakets bracket = new Brakets();
//         new Thread(new Runnable(){
//             @Override
//             public void run(){
//                 long starttime = System.currentTimeMillis();
//                 for(int i=1;i<=5;i++){
//                     bracket.generate();
//                 }
//                 long endtime = System.currentTimeMillis();
//                 System.out.println("Time required for thread 1 was : " + (endtime-starttime));
//             }
//         }).start();
//         new Thread(new Runnable(){
//             @Override
//             public void run(){
//                 long starttime = System.currentTimeMillis();
//                 for(int i=1;i<=5;i++){
//                     bracket.generate();
//                 }
//                 long endtime = System.currentTimeMillis();
//                 System.out.println("Time required for thread 2 was : " + (endtime-starttime));
//             }
//         }).start();
//     }
// }




// //Static synchronization
// class Brakets{
//     synchronized public static void generate(String threadcode){
//         for(int i=1;i<=10;i++){
//             if(i<=5){
//                 System.out.print("[");
//             }else{
//                 System.out.print("]");
//             }
//         }
//         System.out.println("Generated by thread: "+ threadcode);
//     }
// }

// class App{
//     public static void main(String[] args) {
//         // Brakets brackets1 = new Brakets();
//         // Brakets brackets2 = new Brakets();
//         new Thread(new Runnable() {
//             @Override
//             public void run() {
//                 for(int i=1;i<=5;i++){
//                     Brakets.generate("Thread 1");
//                 }
//             }
//         }).start();

//         new Thread(new Runnable() {
//             @Override
//             public void run() {
//                 for(int i=1;i<=5;i++){
//                     Brakets.generate("Thread 2");
//                 }
//             }
//         }).start();


//     }
// }

// //usage of volatile keyword
// class App{
//    volatile public static int flag = 0;
//     public static void main(String[] args) {
//         new Thread(new Runnable() {
//             @Override
//             public void run() {
//                 while(true){
//                     if(App.flag == 0){
//                         System.out.println("Running");
//                     }else{
//                         break;
//                     }
//                 }
//             }
//         }).start();

//         new Thread(new Runnable() {
//             @Override
//             public void run() {
//                 try {
//                     Thread.sleep(5000);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//                 App.flag = 1;
//                 System.out.println("Flag value updated");
//             }
//         }).start();
//     }
// }



// // Wait and notify 
// class App{
//     static public int balance = 0;
//     public void withdraw(int amount){
//         synchronized(this){
//             if(balance<=0){
//                 try {
//                     System.out.println("waiting for balance updated");
//                     wait();
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//             }
//         }
//         balance = balance - amount;
//         System.out.println("withdrawal done"+ balance);
//     }
//     public void deposit (int amount){
//         System.out.println("we r depositing the amount");
//         balance = balance + amount;
//         synchronized(this){
//             notify();
//         }
//     }
//     public static void main(String[] args) {
//         App app = new App();
//         Thread t1 = new Thread(new Runnable() {
//             @Override
//             public void run() {
//                 app.withdraw(1000);
//             }
//         });
//     t1.setName("thread1");
//     t1.start();
//         Thread t2 = new Thread(new Runnable() {
//             @Override
//             public void run(){
//                 try {
//                     Thread.sleep(5000);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//                 app.deposit(2000);
//             }
//         });
//         t2.setName("thread2");
//         t2.start();
//     }
// }


// // Interrupt in multiThreading 
// class vj{
//     static public int balance = 5000;
//     public void withdraw(int amount){
//         synchronized(this){
//             if(balance<=0 || balance < amount){
//                 try {
//                     System.out.println("waiting for balance updated");
//                     wait();
//                 } catch (InterruptedException e) {
//                     System.out.println("Original balacne " + balance);
//                     System.out.println("Amount withdrawn " + amount);
//                     balance = balance-amount;
//                     System.out.println("Remaining balance " + balance);

//                 }
//             }else{
//                 System.out.println("We are inside else");
//             }
//         }
//         // balance = balance - amount;
//         // System.out.println("withdrawal done"+ balance);
//     }
//     public void deposit (int amount){
//         System.out.println("we r depositing the amount" + amount);
//         balance = balance + amount;
        
//     }
//     public static void main(String[] args) {
//         vj app = new vj();
//         Thread t1 = new Thread(new Runnable() {
//             @Override
//             public void run() {
//                 app.withdraw(1000);
//             }
//         });
//     // t1.setName("thread1");
//     t1.start();

    
//     Thread t2 = new Thread(new Runnable() {
//         @Override
//         public void run() {
//            try {
//             Thread.sleep(5000);
//            } catch (InterruptedException e) {
//             e.printStackTrace();
//            }
//            app.deposit(2000);
//            t1.interrupt();
//         }
//     });
// // t2.setName("thread");
// t2.start();

//     }
// }


// // join overview 
// class vj{
//     public int counter =0;
//     public static void main(String[] args) {
//         vj app = new vj();
//         Thread t1 = new Thread(new Runnable() {
//             @Override
//             public void run() {
//                 for(int i=1;i<=1000;i++){
//                     app.counter++;
//                 }

//             }
//         });

//         Thread t2 = new Thread(new Runnable() {
//             @Override
//             public void run() {
//                 try {
//                     t1.join(2000);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//                 for(int i=1;i<=1000;i++){
//                     app.counter++;
//                 }

//             }
//         });
//         t1.start();
//         t2.start();

//         try {
//             t2.join();
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//         System.out.println("the value of counter: " + app.counter);
//     }
// }

// import java.util.concurrent.ExecutorService;
// import java.util.concurrent.Executors;

// class vj extends Thread{
//     private String name;
//     public vj(String name){
//         this.name = name;
//     }
//     @Override
//     public void run() {
//         System.out.println("Starting thread: " + name);
//         try {
//             Thread.sleep(3000);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//         System.out.println("Ending thread: " + name);
//     }
// }

// class App{
//     public static void main(String[] args) {
//         ExecutorService executorService =  Executors.newFixedThreadPool(2);

//         vj t1 =  new vj("thread 1");
//         vj t2 =  new vj("thread 2");
//         vj t3 =  new vj("thread 3");
//         vj t4 =  new vj("thread 4");
//         vj t5 =  new vj("thread 5");
//         vj t6 = new vj("thread 6");
//         vj t7 =  new vj("thread 7");
//         vj t8 =  new vj("thread 8");
//         vj t9 =  new vj("thread 9");
//         vj t10 =  new vj("thread 10");
//         vj t11 =  new vj("thread 11");
//         vj t12 = new vj("thread 12");
//         executorService.execute(t1);
//         executorService.execute(t2);
//         executorService.execute(t3);
//         executorService.execute(t4);
//         executorService.execute(t5);
//         executorService.execute(t6);
//         executorService.execute(t7);
//         executorService.execute(t8);
//         executorService.execute(t9);
//         executorService.execute(t10);
//         executorService.execute(t11);
//         executorService.execute(t12);

//         executorService.shutdown();


//     }
// }

// // CountDown_latch 

// // import java.util.concurrent.CountDownLatch;

// // class vj{
// //     private CountDownLatch latch;
// //     public vj(CountDownLatch latch){
// //         this.latch = latch;
    
// //     }
// //     @Override
// //     public void run(){
// //         System.out.println("Thread running with thread name "+ Thread.currentThread().getName());
// //         System.out.println("thread execution completed");
// //         System.out.println("**************************");
// //         latch.countDown();
// //     }
// // }

// // class index{
// //     public static void main(String[] args) {
// //         CountDownLatch latch = new CountDownLatch(4);
// //         vj obj = new vj(latch);
// //         vj obj1 = new vj(latch);
// //         vj obj2 = new vj(latch);
// //         vj obj3 = new vj(latch);
// //         obj.start();
// //         obj1.start();
// //         obj2.start();
// //         obj3.start();
// //         System.out.println("i am in main thread");
// //     }
// // }

// class vj{
//     public static void main(String[] args) {
//         String lock1 = "lock1";
//         String lock2 = "lock2";

//         Thread thread1 = new Thread(new Runnable() {

//             @Override
//             public void run() {
//                 synchronized(lock1){
//                     System.out.println("inside thread 1 on lock 1");
//                     synchronized(lock2){
//                         System.out.println("inside thread 1 on lock 2");
//                     }
//                 }
//             }
//         });

//         Thread thread2 = new Thread(new Runnable() {

//             @Override
//             public void run() {
//                 synchronized(lock2){
//                     System.out.println("inside thread 2 on lock 2");
//                     synchronized(lock1){
//                         System.out.println("inside thread 2 on lock 1");
//                     }
//                 }
//             }
//         });

//         thread1.start();
//         thread2.start();

//         try {
//             thread1.join();
//             thread2.join();
//         } catch (Exception e) {
//            e.printStackTrace();
//         }
//         System.out.println("inside main method");
//     }

// }


thymeleaf















