// // // // // public class index {
// // // // //     public static void main(String[] args) {

// // // // // // boolean x = false;
// // // // // // System.out.println(x);
// // // // // // short x = -129;
// // // // // // System.out.println(x);

// // // // // // // types of operator
// // // // // // // Arithmetic operator:-     + - / * %
// // // // // // int x  = 91;
// // // // // // int y = 10;
// // // // // // System.out.println(x%y);

// // // // // // // Assignment operator:-        = += -= *= /= %=
// // // // // // int x = 10;
// // // // // // // x= x+3;
// // // // // // x+=3;
// // // // // // System.out.println(x);

// // // // // // // Relational/comparision operator:-    > < >= <= == !=
// // // // // // int x  = 91;
// // // // // // int y = 10;
// // // // // // System.out.println(x<y);

// // // // // // Logical operator:-     &&         ||          !
// // // // // // System.out.println((5>7)&&(8<9));
// // // // // // System.out.println((5>7)||(8<9));
// // // // // // System.out.println(!((5>7)&&(8<9)));

// // // // // // unary operator:- + -  ++  --  !
// // // // // // int x = 10 , y = 20;
// // // // // // int result1,result2;
// // // // // // System.out.println(x);
// // // // // // result1 = ++x;
// // // // // // System.out.println(x);

// // // // // // result2  = --y;
// // // // // // System.out.println(y);

// // // // // // instanceof operator:-
// // // // // // check instanceof whether an obect is an instance of a class

// // // // // // String s = "hello";
// // // // // // boolean result;
// // // // // // result = s instanceof String;
// // // // // // System.out.println(result);

// // // // // // ternary operator
// // // // // // if then else
// // // // // // variable  = expression ? value1 : value2;

// // // // // // int feb  = 28;
// // // // // // String result;
// // // // // // result = (feb == 29) ? "Leap year" : "Not a leap year";
// // // // // // System.out.println(result);

// // // // // // System.out.print("hello");
// // // // // // System.out.println("vj");
// // // // // // System.out.printf("1234567");

// // // // //     }
// // // // // }
// // // // // public class index{
// // // // //     public static void main(String[] args) {
// // // // //     int x,y,z;

// // // // //     System.out.println();

// // // // //     }
// // // // // }

// // // // // // flow control:-
// // // // // // if-else
// // // // // // switch
// // // // // // for-loop
// // // // // // while-loop
// // // // // // do-while-loop

// // // // // // 1.if,else if ,else

// // // // // // // syntax:- 
// // // // // // if(condition){
// // // // // //     //code
// // // // // // }
// // // // // public class index {
// // // // //     public static void main(String[] args) {
// // // // //     //    int x = 10;
// // // // //     //    if(x==1){
// // // // //     //        System.out.println("yes its equal to 10");
// // // // //     //    }
// // // // //     //    System.out.println("done");

// // // // //     // String language  = "java";
// // // // //     // if(language == "java"){
// // // // //     //     System.out.println("its java");
// // // // //     // }
// // // // // // if(3<2){
// // // // // //     System.out.println("true");
// // // // // //     }
// // // // // //     else{
// // // // // //         System.out.println("false");
// // // // // //     }

// // // // // int num = 10;
// // // // // if(num==10){
// // // // //     System.out.println("its 10");
// // // // // }
// // // // // else if(num==10){
// // // // //     System.out.println("its else if 10");
// // // // // }
// // // // // else{
// // // // //     System.out.println("its else 10");
// // // // // }
// // // // // }
// // // // // }

// // // // // loop are used to repeat a block of code multiple times
// // // // // there are three type of loops
// // // // // for loop
// // // // // while loop
// // // // // do-while loop

// // // // // for loop:-it is used to run a block of code for a certain number of times
// // // // // for(initialization;condition;increment/decrement){
// // // // //   code
// // // // // }

// // // public class index{
// // //     public static void main(String[] args) {

// // //         // for(int i=0;i<=10;i++){
// // //         //     System.out.println(i);
// // //         // }
// // // int x= 5;

// // // for(int i = 0;i<=x;i=i+2){
// // //     System.out.print(i);
// // //     }

// // // // int sum = 0;
// // // // int  n = 10;

// // // // for(int i = 0;i<=n;i++){
// // // //     sum +=i;
// // // // }

// // // // System.out.println(sum);
// // // // }
// // // }
// // // }

// // // // public class index {
// // // //     public static void main(String[] args) {

// // // // //         int range = -4250000;
// // // // //         System.out.println(range);

// // // // //     }
// // // // // }




// // // class vj{
// // //     /**
// // //      * @param args
// // //      */
// // //     public static void main(String[] args) {
 
// // //         //for-each loop syntax:- 
// // //         // for(datatype variable: ArrayName){
// // //         //     // code
// // //         // }

// // //         // int arr[] = {1,2,3,4,5};
// // //         // for(int i:arr){
// // //         //     System.out.println(i);
// // //         // }

// // //         // syntax:- 

// // //         // while(testExpression){
// // //         //     //code
// // //         // }
// // //         // int i = 1;
// // //         // int n=5;
// // //         // while(i<=n){
// // //         //     System.out.println(i);
// // //         //     i++;
// // //         // }
// // //         }
// // //     }



// // import java.util.Scanner;
// // class vj{
// //     public static void main(String[] args) {
// //            int sum =0;
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("enter the number");
// //         int number = sc.nextInt();

// //         while (number>=0){
// //             sum+=number;
// //             System.out.println("sum is "+sum);
// //             System.out.println("enter the number");
// //             number = sc.nextInt();
           
// //         }
// // System.out.println("sum is "+sum);
// // sc.close();
// //     }
// // }

// // public class index{
// //     public static void main(String[] args) {
// //         int x = 2;
// //         String y = "2";
// //         System.out.println(x+y);
// //     }
// // }

// // do-while loop
// // it is similar to while loop
// // syntax:
// // do{
    
// // }
// // while(condition);

// // import java.util.Scanner;

// // class vj{
// // public static void main(String[] args) {
//     // int i=1,n=5;
//     // do{
//     //     System.out.println(i);
//     //     i++;
//     // }
//     // while(i>=n);

// //     int sum =0;
// //     int number = 0;
// //     Scanner sc = new Scanner(System.in);
// //     do{
// // sum+=number;
// // System.out.println("enter the number");
// // number = sc.nextInt();
// //     }while(number>=0);
// //     System.out.println("sum is "+sum);
// //     sc.close();

// // int x=1;
// // do{
// // System.out.println(x);
// // x++;
// // }while(x==2);

// // breakstatement:-
// // it is used to terminate the loop
// // syntax:
// // for(int i =1;i<=10;i++){
// //     if(i==6){
// //         break;
// //     }
// //     System.out.println(i);
// // }

// // for(int i =1;i<=10;i++){
// //     if(i==6){
// //         continue;
// //     }
// //     System.out.println(i);
// // }
// // Scanner input = new Scanner(System.in);
// // double number ,sum = 5.0;
// // while (true) {
// //     System.out.println("Enter a number");
// //     number = input.nextDouble();
// //     if(number<=0.0){
// //         continue;
// //     }
// //     sum+=number;
// // }
// // System.out.println("Sum of the number is "+sum);
// // input.close();

// // for (int i=1; i<=10;i++){
// //     if(i==6){
// //         continue;
// //     }
// //     System.out.println(i);
        
// // }
// // }
// // }

// // import java.util.*;
// // class index{
// //     public static void main(String[] args) {
// //         double number ,sum = 0.0;
// //         Scanner input = new Scanner(System.in);
// //         for(int i=1;i<=10;i++){
// //             System.out.println("Enter a number");
// //             number = input.nextDouble();
// //             if(number<=0.0){
// //                 continue;
// //             }
// //             sum+=number;
// //         }
// //         System.out.println("Sum of the number is "+sum);
// //         input.close();
// //     }
// // }


// // Patterns
// public class index {

//     public static void main(String[] args) {
//         // right angle * triangle
//     //     int row  =5;
//     //     for(int i=1;i<=row;i++){
//     //         for(int j=1;j<=i;j++){
//     //             System.out.print(j+ " ");
//     //     }
//     //     System.out.println();
//     // }

//     // right angle number triangle
//     // int row  =5;
//     // for(int i=1;i<=row;i++){
//     //     for(int j=1;j<=i;j++){
//     //         System.out.print(j+ " ");
//     // }
//     // System.out.println();
// // }

// // pattern 3
// //     int row  =5;
// //     for(int i=1;i<=row;i++){
// //         for(int j=1;j<=i;j++){
// //             System.out.print(i + " ");
// //     }
// //     System.out.println();
// // }

// // pattern 4
// //     int row  =5;
// //     for(int i=1;i<=row;i++){
// //         char ch = (char)(i + 64);  // 65 = A, 64='A'-1

// //         for(int j=1;j<=i;j++){
// //             System.out.print(ch + " ");
// //     }
// //     System.out.println();
// // }
// // pattern 5

// // int row  =5;
// // for(int i=row;i>=1;i--){
// //     char ch = (char)(i + 64);  // 65 = A, 64='A'-1
// //     for(int j= i;j>=1;j--){

// //         System.out.print(ch + " ");
// //     }
// //     System.out.println();
// // }

// // praymid triangle
// // int row =5;
// // for(int i=1;i<=row;i++){
// //     for(int j=1;j<=row -i; j++){
// //         System.out.print(" ");
// //     }
// // for(int k = 1;k<=2*i-1;k++){
// //     System.out.print("* ");
// // }
// // System.out.println();

// // }

// // oops
// // core concept of the object oriented approach is to break complex problem into smaller object
// // object:- it is an entity that has a state and behavior
// // why?
// // it is faster and easier to execute
// // they provide a clear structure for the programming
// }
// }

// public class index{
//     int marks= 12;
//     public static void main(String[] args) {
//         index vj = new index();
//         index vj1 = new index();
     
//         System.out.println(vj.marks);
//         System.out.println(vj1.marks);

//     }
// }

// class vj{
//     int x=34;
//     public void breaking(){
//         System.out.println("working of break");
//     }
// }


// public class index {
// public static void main(String[] args) {
//     vj obj = new vj();
//     // obj.x = 45;
//     System.out.println(obj.x);
//     obj.breaking();
// }
// }

// Method is a bock of code which is executed when it is called



// public class index{
// // attribute
// int x= 8;
// // method
// public static void main(String[] args) {
//     index obj = new index();
//     index obj1 = new index();

//     System.out.println(obj.x);
//     System.out.println(obj1.x);


// }
// }

// class abc{
//    int x=10;
// }

// class xyz{
//     int x=20;
//     public static void main(String[] args) {
//         abc obj = new abc();
//         abc obj1 = new abc();
//         xyz obj2 = new xyz();
//         System.out.println(obj.x);
//         System.out.println(obj1.x);
//         System.out.println(obj2.x);
        
//     }
// }

// public class index{
//    final int x =90;
//     public static void main(String[] args) {
//         index obj = new index();
//         obj.x = 900;
//         System.out.println(obj.x);
//     }
// }

// public class index{
// String fname = "vijendra";
// String lname = "Sharma";
// int age = 30;
// public static void main(String[] args) {
//     index obj = new index();
//     System.out.println(obj.fname);
//     System.out.println(obj.lname);
//     System.out.println(obj.age);
// }
// }

// Methods
// it is a block of code that perform a specific task
// types:-
// user-defined Method:-
// we can create own method based on our requirement


// Standard Library Method:- these are built in methods in java that are available to use
// returntype method(){
//     // method body
// }

// returnType- it specifies what type of value a method return
// methodName- it specifies the name of the method
// methodBody-it include the programming statements that are used to perform some task.the method body is enclosed by curly braces {}

// int add(){
//     // code
// }

// modifier static return nameofMethod(para1,para2,...){

// }
// modifier:- it define access types whether the method is public or private
// static:- if we use the static keyword it can be accessed without creating an object of the class

// public class index{
//    static void abc(){
//         System.out.println("hello vijendra");
//     }

//     public static void main(String[] args) {
//         abc();
//         abc();
//         abc();
//         abc();

//     }
// }

// public class index{
//        static void abc(){
//         System.out.println("hello soheb");
//     }
// public void soheb(){
//     System.out.println("hello daud");
// }

// public static void main(String[] args) {
//     abc();
//     index obj = new index();
//     obj.soheb();
// }
// }

// public class index{
//     public void abc(){
//         System.out.println("hello vijendra");
//     }
//     public void
// }

// Parameter and Arguments:-
// parameters are the variables that are used in the method
// arguments are the values that are passed to the method

// public class index{
//     static void abc(int x){
//         System.out.println("ur age is:- " + x);
//     }
//     public static void main(String[] args) {
//         abc(34);
//         abc(34);
//         abc(34);
//     }
// }
// public class index {
//     public static void main(String[] args) {
//         String x = "hello";
//         String y = " VIJENDRA Shamra";
//         int z = 34;
//         // System.out.println(x.toUpperCase());
//         // System.out.println(y.toLowerCase());
//         // System.out.println(y.indexOf("E"));
//         // ---Concatination--
//         // System.out.print(x.concat(x));
//         // System.out.print(x.concat(z)); // error
//         // System.out.println(x + y + " ur age is " + z);
//     }
// }

// public class index{
//     static void abc(int x , String y){
//         System.out.println("ur age is:- " + x);
//     }
//     public static void main(String[] args) {
//     abc(34,"vijendra");

//     }
// }

// public class index{
//     static int vj(int x , int y){
//         return x +y ; 
//         // System.out.println(x);
//     }
//     public static void main(String[] args) {
//         int sum = vj(10,20);
//         System.out.println(sum);
//     }
// }

// public class index{
//     static void abc(int age ){
//         if(age>18){
//             System.out.println("eligible");
//         }
//         else{
//             System.out.println("not eligible");
//         }
//     }
//     public static void main(String[] args) {
//         abc(34);
//         abc(65);
//     }
// }

// class vj{
//     public static int square(int x){
//         return x*x;
//     }
//     public static void main(String[] args) {
//         int result;
//         result = square(5);
//         System.out.println(result);
//     }
// }

// class vj{
//     public void display1(){
//         System.out.println("without parameter");
//     }
//     public void display2(int x){
//         System.out.println("with parameter"+x);
//     }
//     public static void display3(int x,int y){
//         System.out.println("with two parameter"+ x + y);
//     }
// }

// class xyz{
//     public static void main(String[] args) {
//         vj obj = new vj();
//         obj.display1();
//         obj.display2(34);

//         vj.display3(34,56);

//     }
// }


// public class index{
//     private static int sqr(int x){
//         return x*x;
//     }
//     public static void main(String[] args) {
//   for(int i = 1 ; i <= 10 ; i++){
//     int result = sqr(i);
//     System.out.println(result);
//   }
        
//     }
// }










