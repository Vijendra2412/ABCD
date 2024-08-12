// public class index {
//     public static void main(String[] args) {
/* 
 unary Operator :-  ++ , -- | x++,++x |x--,--x|
 Arithmetic Operator :- + , - , / , *
 shift  :-  <<  >>
 relational Operator :- < > <= >= instanceOf
 Bitwise Operaor:- equality(== !=),bitwise exclusive OR(^),bitwise inclusive OR(^), Bitwise AND(&)
 Logical Operator:- AND(&&) ,OR(||), NOT(!)
 Ternary Operator: condtion?"expression1":"expression2"
 Assignment Operator:- = , +=, -=, *=, /=, %=,&=,^=,|=,<<=,>>=,>>>=
 */

// unary Operator :-  ++ , -- | x++,++x |x--,--x|
// increment/decrement a value by one 
// negating an expression
// inverting the value of boolean
// int x =12;
// System.out.println(x++);
// System.out.println(++x);
// System.out.println(x--);
// System.out.println(--x);

//  Arithmetic Operator :- + , - , / , *
// int x =12;
// int y=10;
// System.out.println(x+y);
// System.out.println(x-y);
// System.out.println(x*y);
// System.out.println(x/y);
// System.out.println(x%y);

// shift  :-  <<  >>
// System.out.println(10<<2);
// System.out.println(20<<2);
// System.out.println(20<<2);
// System.out.println(3<<2);

// System.out.println(3<<3);

// System.out.println(10>>2);
// System.out.println(20>>3);

// >>
// >>>
// System.out.println(10>>2);
// System.out.println(10>>>2);
// System.out.println(-10>>2);
// System.out.println(-10>>>2);

// relational Operator :- < > <= >= instanceOf
// int x= 10;
// int y=10;
// System.out.println(x<y);
// System.out.println(x>y);
// System.out.println(x<=y);

// Bitwise Operaor:- equality(== !=),bitwise exclusive OR(^),bitwise inclusive OR(^), Bitwise AND(&)
// Logical Operator:- AND(&&) ,OR(||), NOT(!)

// int a =3;
// int b= 4;
// int c=12;
// System.out.println(a<b && a>c);
// System.out.println(a>b & a<c);
// System.out.println(a<b & a++ <c);
// System.out.println(a);

// System.out.println(!(a<b && a>c));

// System.out.println(!(a<b || a<c));

// Assignment Operator:- = , +=, -=, *=, /=, %=,&=,^=,|=,<<=,>>=,>>>=

// int x= 9;
// // x = x+2;
// x+=3;
// System.out.println(x);
/* 
// Control Flow Statements 
1.Decision Making 
        if Statement
        Switch Satement
2.Loop Statements 
        for loop
        while loop
        do while loop
        Foreach loop
3.Jump Statements
        break Statement
        continue Statement
*/

// if Statement
// 1.Simple if Statement 
// 2.if-else statement 
// 3.if-else_if statement
// 4. nested if-statement

// Simple if Statement
// Syntax 
// if(conditions){
//     //code
// }

// class vj{
//     public static void main(String[] args) {
//         int x= 9;
//         int y=12;

//         if(x<y){
//             System.out.println("x is smaller than y");
//         }
//     }

// }

// 2.if-else statement 
// if(conditions){
//     //code
// }
// else{
//     //code
// }

// 3.if-else_if statement/ladders 
// if(conditions){
//     //code
// }
// else if(conditions){
//code
// }
// else if(condtions){
//code
// }
// . 
// .
// else{
//     //code
// }

// class vj{
//     public static void main(String[] args) {
//         int x= 9;
//                 int y=12;

//                 if(x>y){
//                     System.out.println("x is Greater than y");
//                 }
//                 else if(x<y){
//                     System.out.println("y is greater");
//                 }
//                 else{
//                     System.out.println("yes x is smaller");
//                 }
//     }
// }

// class vj{
//     public static void main(String[] args) {
//         String name= "Vijendra Sharma";
//         if(name == "Varun"){
//             System.out.println("name is varun");
//         }
//         else if(name == "Pintu"){
//             System.out.println("name is Pintu");
//         }
//         else if(name == "Vijendra Sharma"){
//             System.out.println("Name is Vijendra Sharma");
//         }
//         else{
//             System.out.println("there is no Name");
//         }
//     }
// }

// 4. nested if-statement 
/*
 if(conditions){
        //code
        if(coditions){
                 
            if(coditions){
            //code
            }
            else{
            //code
            }
        }
        else{
        //code
        }
 }
 else{
    //code
 }
 */

//  class vj{
//     public static void main(String[] args) {
//         String address = "Delhi,India";
//         if(address.endsWith("India")){
//                 if(address.contains("noida")){
//                     System.out.println("city is noida");
//                 }
//                 else if(address.contains("merrut")){
//                     System.out.println("city is merrut");
//                 }
//                 else if(address.contains("Delhi")){
//                     System.out.println("city is delhi");
//                 }
//         }
//         else{
//             System.out.println("there is no city");
//         }
//     }
//  }

// Switch Statement 

// switch(expression){
//     case value 1:
//         statement;
//         break;
//         . 
//         .

//     case valueN:
//     statementN;
//     break;

//     default:
//     statement;
// }

// class vj{
//     public static void main(String[] args) {
//         int age= 20;
//         switch (age) {

//             case 2:
//             System.out.println("age is 20");
//                 break;

//             case 12:
//             System.out.println("age is 12");
//                 break;

//             case 18:
//             System.out.println("age is 18");
//                 break;

//             default:
//             System.out.println("age not found");
//                 break;
//         }

//     }
// }

// class vj{
//     public static void main(String[] args) {
//         int number = -5;
//         if(number >0){
//             System.out.println("number is +ve");
//         }
//         else if(number <0){
//             System.out.println("number is -ve");
//         }
//         else{
//             System.out.println("number is zero");
//         }
//     }

// }

// class vj{
//     public static void main(String[] args) {
//         int a = 10, b =20,c=15;
//         if(a>=b && a>=c){
//             System.out.println("largest number is:- " + a);
//         }
//         else if(b>=a && b>=c){
//             System.out.println("largest number is:- " + b);
//         }
//         else{
//             System.out.println("largest number is:- " + c);
//         }
//     }
// }

// class vj{
//     public static void main(String[] args) {
//         int marks = 85;
//         if(marks>=90){
//             System.out.println("Grade A+");
//         }
//         else if(marks>=80){
//             System.out.println("Grade A");
//         }
//         else if(marks>=70){
//             System.out.println("Grade B+");
//         }
//         else if(marks>=60){
//             System.out.println("Grade B");
//         }
//         else if(marks>=50){
//             System.out.println("Grade C");
//         }
//         else{
//             System.out.println("F");
//         }

//     }
// }

// class vj{
//     public static void main(String[] args) {
//         int year = 2024;
//         if(year % 400 == 0){
//             System.out.println(" its a leap year");
//         }
//         else if(year%100 ==0){
//             System.out.println(" not a leap year");
//         }
//         else if(year%4 ==0){
//             System.out.println(" is a leap year");
//         }
//         else{
//             System.out.println(" not a leap year");
//         }
//     }
// }

// class vj {
//     public static void main(String[] args) {
//         int day = 3;
//         switch (day) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thruday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;

//             default:
//                 break;
//         }
//     }
// }

// import java.util.Scanner;

// class vj{
//     public static void main(String[] args) {
//         Scanner sc  = new Scanner(System.in);
//         System.out.println("Enter ur pin");
//         int x = sc.nextInt();
//         System.out.println("ur number is " + x);
//     }
// }
// import java.util.Scanner;

// class vj{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter ur first number:- ");
//         int n1 = sc.nextInt();

//         System.out.println(" Enter your Second number:- ");
//         int n2 = sc.nextInt();

//         // System.out.println(" Enter your third number:- ");
//         // double n3 = sc.nextDouble();

//         System.out.println("enter ur operator(+,-,*,/): ");
//         char Operaor = sc.next().charAt(0);

//         int result;

//         switch (Operaor) {
//             case '+':
//             result = n1+n2;
//             System.out.println("result is:- " + result);
//                 break;
//                 case '-':
//             result = n1-n2;
//             System.out.println("result is:- " + result);
//                 break;
//                 case '*':
//             result = n1*n2;
//             System.out.println("result is:- " + result);
//                 break;
//                 case '/':
//             result = n1/n2;
//             System.out.println("result is:- " + result);
//                 break;
        
//             default:
//                 break;
//         }
//     }
// }

// import java.util.Scanner;
// class vj{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println(" Enter ur months");
//         int month =sc.nextInt();
//         switch (month) {
//             case 12:
//             case 1:
//             case 2:
//             System.out.println("winter");
//             break;

//             case 3:
//             case 4:
//             case 5:
//             System.out.println("Spring");
//             break;

//             case 6:
//             case 7:
//             case 8:
//             System.out.println("summer");
//             break;

//             case 9:
//             case 10:
//             case 11:
//             System.out.println("Autunm");
//             break;

//             default:
//             System.out.println(" invalid months");
                
//         }
//     }
// }

// import java.util.*;
// class vj{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println(" Enter ur character: ");
//         char ch = sc.next().charAt(0);

//         switch (ch) {
//             case 'a':
//             case 'e':
//             case 'i':
//             case 'o':
//             case 'u':
//             case 'A':
//             case 'E':
//             case 'I':
//             case 'O':
//             case 'U':
//             System.out.println(ch + " is a vowel");
//             break;

//             default :
//             System.out.println(ch + " consonant");

//         }
//     }
// }

// class vj{
//     public static void main(String[] args) {
//         int month = 2;
//         switch (month) {
//             case 1:case 3: case 5: case 7: case 8: case 10: case 12:
//             System.out.println("31 days");
//             break;
//             case 4:case 6: case 9: case 11: 
//             System.out.println("30 days");
//             break;
//             case 2:
//             System.out.println("29 days");
//             break;

//             default:
//             System.out.println(" invalid months");
//         }
//     }
// }


// Syntax:- 
// for(initilization, conditions, I/D){

// }

// class vj{
//         public static void main(String[] args) {
//                 int sum =0;
//                 for(int i =0;i<=10;i++){
//                         sum+=i;
//                 }
//                 System.out.println("the sum of first natural numberm is:- "+ sum);
//         }
// }
// Syntax 
// for(dataTypes var : arrayname){
//         //code
// }

// public class index {

//         public static void main(String[] args) {
//                 String [] names = {"1","2","3","4"};
//                 System.out.println("Printing the all element of names");
//                 for( String i : names){
//                         System.out.println(i);
//                 }
//         }
// }

//while loop
// while(conditions){
//         //code
// }

// class vj{
//         public static void main(String[] args) {
//                 int i =0;
//                 System.out.println("print 1st 10 even number");
//                 while (i<=10) {
//                         System.out.println(i);
//                         i+=2;
//                 }
//         }
// }


// Syntax:- 
// do{
//         //code
//         // i/d 
// }
// while(conditions); 

// class vj{
//         public static void main(String[] args) {
//                 int i=0;
//                 System.out.println(" print even number");
//                 do{
//                         System.out.println(i);
//                         i+=2;
//                 }while(i>=10);
//         }
// }

// class vj{
//         public static void main(String[] args) {
//                 for(int i =0;i<=10;i++){
//                         // System.out.print(i);
//                         if(i==6){
//                                continue;
//                         }
//                         System.out.print(i);
//                 }
//         }
// }
// class vj{
//         public static void main(String[] args) {
//                 a:
//                 for(int i=0;i<=10;i++){
//                         b:
//                         for(int j=0;j<=15;j++){
//                                 c:
//                                 for(int k=0; k<=20;k++){
//                                         System.out.println(k);
//                                         if(k==5){
//                                                 break a;
//                                         }
//                                 }
//                         }
//                 }
//         }
// }
// Oops :- 
// Object Oriented Programming
/* 
class 
inheritence
Polymorphism 
Abstraction
Encapsulation
coupling
*/