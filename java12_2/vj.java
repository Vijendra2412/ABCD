
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

//Method 
// Modifire datatypes method_name(parameters){

// }

// type of method 
// class a{
//     public static void main(String[] args) {
//         System.out.println("maximum number " + Math.max(4, 6));
//     }
// }

// class a{
//     public static void findeven(int num){
//         if(num%2==0){
//             System.out.println("even");
//         }
//         else{
//             System.out.println("odd");
//         }
//     }
//     public static void main(String[] args) {
//         findeven(34);
//         findeven(67);
//     }
// }

// import java.util.Scanner;
// class evenOdd{
//     public static void findeven(int num){
//         if(num%2==0){
//             System.out.println("even");
//         }
//         else{
//             System.out.println("odd");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your number:- ");
//         int num = sc.nextInt();
//         findeven(num);

//     }
// }

// class instancemethod{
//     int s;
//     public void add(){
//         System.out.println("vj class");
//     }
//     public static void main(String[] args) {
//         instancemethod obj =new instancemethod();
//         obj.s=2;
//         System.out.println(obj.s);
//         // System.out.println(obj.add());
//         obj.add();
//     }
// }

// class instancemethod{
//     int s;
//     public int add(int a, int b){
//         return a*b;
//     }
//     public static void main(String[] args) {
//         instancemethod obj =new instancemethod();
//         obj.s=5;
//         System.out.println(obj.s);
//         System.out.println(obj.add(12,12));
//     }
// }

// there are two types of instancemethod 
// Accessor method 
// Mutator method 

// Absatract 
// abstract class l {
//     abstract void display();
// }

// public class vj extends l {
//     public void display() {
//         System.out.println("its vj class");
//     }

//     public static void main(String[] args) {
//         l obj = new vj();
//         obj.display(); 
//     }
// }

// class w{
//     w(){
//         System.out.println(" its vj class");
//     }
//     public static void main(String[] args) {
//         w obj = new W();

//     }
// }

// class w{
//     int x;
//     String y;
//     int z;
//     w(int a , String b){
//         x = a;
//         y = b;
//     }
//     w(int a , String b, int c){
//         x = a;
//         y = b;
//         z=c;
//     }
//     void display(){
//         System.out.println(x + " " + y + " "+ z);
//     }
//     public static void main(String[] args) {
//         w obj = new W(1,"vj");
//         w obj1 = new W(1,"vijay",234);

//         obj.display();
//         obj1.display();
//     }
// }

// class jkl{
//     int x;
//     String y;

//     jkl(int a, String b){
//         x=a;
//         y=b;
//     }
//     jkl(jkl j){
//         x=j.x;
//         y=j.y;
//     }

//     void display(){
//         System.out.println(x + " " + y);
//     }
//     public static void main(String[] args) {
//         jkl obj = new jkl(1234, "vj");
//         jkl obj1 = new jkl(obj);
//         obj.display();
//         obj1.display();
//     }
// }

// class jkl{
//     int x;
//     String y;

//     jkl(int a, String b){
//         x=a;
//         y=b;
//     }
//     jkl(){

//     }

//     void display(){
//         System.out.println(x + " " + y);
//     }
//     public static void main(String[] args) {
//         jkl obj = new jkl(1234, "vj");
//         jkl obj1 = new jkl();
//         obj1.x = obj.x;
//         obj1.y = obj.y;
//         obj.display();
//         obj1.display();
//     }
// }

//Static Keyword

// class jkl{
//    int pin; // instance variable
//    String name;// instance variable
//    static int  age = 40; //static variable

//    jkl(int p, String n){
//     pin = p;
//     name = n;
//    }
//    void display(){
//     System.out.println(pin +" " +age+" "+name);
//    }
//    public static void main(String[] args) {
//     jkl obj = new jkl(123, "vijendra");
//     obj.display();
//    }
// }

// class counter{
//     static int count = 0;

//     counter(){
//         count++;
//         System.out.println(count);
//     }
//     public static void main(String[] args) {
//         counter obj =new counter();
//         counter obj1 =new counter();
//         counter obj2 =new counter();
//         counter obj3 =new counter();

//     }
// }

// class av{
//     int rollno;
//     String name;
//     static String age = "40";

//     static void change(){
//         age ="25";
//     }

//     av(int r,String n){
//         rollno = r;
//         name = n;
//     }

//     void display(){
//         System.out.println(rollno +" " + name +" " + age);
//     }

//     public static void main(String[] args) {
//         av.change();
//         av obj = new av(123, "vijendra");
//         av obj1 = new av(1234, "vijay");
//         av obj2 = new av(12345, "vj");
//         obj.display();
//         obj1.display();
//         obj2.display();
//     }
// }

// class calculation {
//     static int cube(int x) {
//         return x * x * x;
//     }
//     public static void main(String[] args) {
//        int x= calculation.cube(4);
//        System.out.println(x);
//     }
// }

// class jk{
//     static int x =9;
//     public static void main(String[] args) {
//         System.out.println(x);
//     }
// }

// class jk{
//     static int x;
//     static {
//         x=9;
//      }
//     public static void main(String[] args) {
//         System.out.println(x);
//     }
// }

// class jk{
//     static{
//         System.out.println(" its vj class");
//     }
//     public static void main(String[] args) {
//         System.out.println(" hello vj");
//     }
// }

// class jk{
//     static{
//         System.out.println("hey vj");
//         System.exit(0);
//     }
    
// }
// class ghi{
//     int age;
//     String name;
//     String Address;
//     ghi(int age, String name,String Address){
// this.age = age;
// this.name = name;
// this.Address = Address;

//     }
//     void display(){
//         System.out.println(age + "  " + name + " "+ Address);
//     }
//     public static void main(String[] args) {
//         ghi obj = new ghi(40, "vijay", "noida");
//         obj.display();
//     }

// }

// class ghi{
//     void abc(){
//         System.out.println(" Its vj class");
//     }
//     void def(){
//         System.out.println("its dsa class");
//         this.abc();
//     }
//     public static void main(String[] args) {
//         ghi obj = new ghi();
//         obj.def();
//     }
// }

// class ghi{
//     ghi(){
//         this(5);
//         System.out.println(" its vj class");
//     }
//     ghi(int x){
       
//         System.out.println(x);
//     }
  
   
//     public static void main(String[] args) {
//         ghi obj = new ghi();
//     }
// }

// class ghi{
//     nm obj;
//     ghi(nm obj){
//         this.obj =obj;

//     }
//     void display(){
//         System.out.println(obj.x);
//     }
// }
// class nm{
//     int x = 678;
//     nm(){
//         ghi obj1 = new ghi(this);
//     obj1.display();
//     }
//     public static void main(String[] args) {
//         nm ob = new nm();
//     }
// }


// Interitence 

// class parent{
//     int age =9;
//     void vj(){
//         System.out.println("age is " + age);
//     }
// }

// class child extends parent{
//     void vjjj(){
//         System.out.println("its vj class");
//     }

//     public static void main(String[] args) {
//         child obj = new child();
//         obj.vj();
//         obj.vjjj();
//     }
// }


// class GF{
//     void eat(){
//         System.out.println("they like juice");
//     }
// }
// class F extends GF{
//     void talk(){
//         System.out.println(" talking");
//     }
// }
// class Child extends F{
//     void chocklate(){
//         System.out.println(" want chocklate");
//     }
// }

// class result{
//     public static void main(String[] args) {
//         Child obj = new Child();
//         obj.chocklate();
//         obj.eat();
//         obj.talk();
//     }
// }

// class GF{
//     void eat(){
//         System.out.println("they like juice");
//     }
// }
// class Child extends GF{
//     void talk(){
//         System.out.println(" talking");
//     }
// } 
// class Child1 extends GF{
//     void chocklate(){
//         System.out.println(" want chocklate");
//     }
// }
// class result{
//     public static void main(String[] args) {
//         Child1 obj = new Child1();
//         obj.chocklate();
//         obj.eat();
//         // obj.talk();
//     }
// }


// class GF{
//     void eat(){
//         System.out.println("they like juice");
//     }
// }
// class GF1 {
//     void talk(){
//         System.out.println(" talking");
//     }
// }
// class Child1 extends GF{
//     void chocklate(){
//         System.out.println(" want chocklate");
//     }
// }

// class result{
//     public static void main(String[] args) {
//         Child1 obj = new Child1();
//         obj.chocklate();
//         obj.eat();
//         // obj.talk();
//     }
// }

// method Overloading 

// class PK{
//     static int number(int x){
//         return x;
//     }
//     static int number(int x,int y){
//         return x + y;
//     }static int number(int x,int y,int z){
//         return x + y + z;
//     }
//     public static void main(String[] args) {
//         System.out.println(PK.number(2));
//         System.out.println(PK.number(2+3));
//         System.out.println(PK.number(2+3+4));

//     }
// }
// class PK{
//     static int number(int x){
//         return x;
//     }
//     static Double number(Double x){
//         return x ;
//     }static float number(float x){
//         return x ;
//     }
//     public static void main(String[] args) {
//       System.out.println(1);
//       System.out.println(1.2);
//       System.out.println(1.234);


//     }
// }

// class kl{
//     public static void main(String[] args) {
//         System.out.println("hey vj");
//     }
//     public static void main(String args) {
//         System.out.println("hello vj");
//     }
//     public static void main() {
//         System.out.println("yo yo vj");
//     }
// }

class kl{
   static void math(){
        System.out.println(" marks 12");
    }
}
class child extends kl{
  static  void math(){
        System.out.println(" marks 19");
    }

    public  void main(String[] args) {
        child obj = new child();
        obj.math();
    }
}
