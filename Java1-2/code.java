// public class code {
    // public class index {public static void main(String[] args) {System.out.println("hello World");}}

//  class index{
//     // instance variable 
//     // static variable
//     public static void main(String[] args) {
// Variable :- it is container which hold the value while the program is executed.
// a variable assigned with dataTypes
// types of variable:- 

// local Variable 
// instance variable
// static variable
// ---------------------------------------------------
// -- how to declare variable--

// dataTypes variable  = value
// int x,y,z;
// System.out.println(x+y+z);

// DataTypes 
// specify the different size and values that can be stored in the variable 

// there are two types of Data types 
// 1. Primitive dataTypes(single element) :-
// char , boolean, float, double, byte, long, short,int 

// 2. non-primitive datatypes(multimple elements)
//  classes, interface, Arrays
/* 

DataTypes      value             size  
char          '\u0000'           2byte
boolean         false             1 bit
float           0.0f             4byte
double          0.0d             8byte
byte            0                 1byte
long            0l                8byte
short            0                 2byte
int             0                   4byte

*/

// char a = 'a';
// System.out.println(a);
// boolean b = true;
// System.out.println(b);
// float c = 1.2f;
// System.out.println(c);
// double d = 1.2;
// System.out.println(d);
// byte e = 12;
// System.out.println(e);
// long f = 123l;
// System.out.println(f);
// short g = 129;
// System.out.println(g);
// int h = 1234;
// System.out.println(h);
/* 
// -----Operators----- 
Operator is a Symbol that is used to perform Operations 
ex:- + - / * %
there are many types of Operators 

Unary Operators                   postfix(x++ ,x--) prefix(--x, ++x)
Arthimetic Operators              + - / * %
Shift Operators                   >>  << >>>
relational operators              < > <= >= != ==
Bitwise Operators                 ^   |  , &    
Logical Operators                 && || !
Ternary Operators                  ? :    [  conditions?"true":"false"  ]
Assignment Operators              = += -= /= %= <<= >>= >>>=

*/

// int x =10;
// System.out.println(x++);
// System.out.println(++x);
// System.out.println(x--);
// System.out.println(--x);

// System.out.println(x++ + ++x);
// System.out.println(x++ + x++);


// }s
// }

//  class klm{
//     public static void main(String[] args) {
        
//         // System.out.println((x<y)|(x>y));
//         // System.out.println(!((x<y)|(x>y)));
//         // System.out.println(!((x<y)&(x>y)));


//     }
// }
// }

// 1.decision making 
// if statement 
// switch statement

//2. Loop statement 
// for loop 
// while loop 
// do while loop 
// for-each loop

// 3.jump statement 
// break 
// continue


import java.util.Scanner;

class code{
    public static void main(String[] args) {
        // Syntax:- 
        // if(codition){
        //     //code
        // }

        // if(4<5){
        //     System.out.println(" its true");
        // }

        // int x =9;
        // int y =12;
        // if(x+y<20){
        //     System.out.println("  21 is greater");
        // }
        // else if(y-x<20){
        //     System.out.println(" is greater");
        // }
        // else if(y+x>20){
        //     System.out.println("x+y is greater");

        // }
        // else{
        //     System.out.println(" all wrong ");
        // }

// String city = "Delhi";
// if(city == "merrut"){
//     System.out.println("city is merrut");
// }
// else if(city=="Noida"){
//     System.out.println("city is Noida");

// }
// else if(city == "Agra"){
//     System.out.println("City is Agra");
// }
// else{
//     System.out.println(city);
// }


// Syntax :- 
// if(codition){
//     if(codition){
    

//     }else if(){
    
//     }

// }else{

// }

// String  address = "Delhi,India";
// if(address.endsWith("India")){
//     if(address.contains("S")){
//         System.out.println("city is merrut");
//     }
//     else if(address.contains("Noida")){
//         System.out.println("city is Noida");
//     }
//     else{
//         System.out.println(address.split(",")[0]);
//     }
// }else{
//     System.out.println(" u r not living in india");
// }



Scanner sc = new Scanner(System.in);

// System.out.println("Enter Your Pin");
// int x = sc.nextInt();
// System.out.println("ur pin is: " + x);

// Check if a number is positive, negative, or zero.

// Determine if a person is eligible to vote based on their age.

// Check if a given year is a leap year or not. //(year%4==0)

// Find the largest of three numbers.

// Determine if a character entered by the user is a vowel or a consonant.

// Check if a given number is even or odd.

// Classify a student’s grade based on their marks (e.g., A, B, C, D, F).

// Check if a person is a child, teenager, adult, or senior citizen based on their age.

// Determine if a triangle is valid based on its angles (sum of angles should be 180°).

// Find if a given number is divisible by both 3 and 5, only by 3, only by 5, or by neither.





// Swit Statements:- 

// syntax:- 
// switch (expression) {
//     case value:
        
//         break;

//     default:
//         break;
// }

// int age = 18;
// switch (age) {
//     case 17:
//     System.out.println("its a eligible");
//         break;
//         case 19:
//         System.out.println("Its not eligible");
//         break;
//         case 12:
//         System.out.println("Its  eligible");
//         break;
//     default:
//     System.out.println("there is no case");
//         break;
// }















    }
}