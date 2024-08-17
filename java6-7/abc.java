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

// Loops 
// for loop 
// for-each loop or enhanced for loop 
// labeled for loop  

// for(ini..,condition,I/D){
//         //code
// }


// class abc {
//         public static void main(String[] args) {
//                 for(int i =0; i<=10;i++){
//                         System.out.println(i);
//                 }
//         }
// }

class abc{
        public static void main(String[] args) {
                // for(int i =0; i<=3;i++){
                //         // System.out.println("Outer Loop " + i);
                //         for(int j =0;j<=3;j++){
                //                 System.out.println(i + j);
                //         }
                // }

                // for(int i =1;i<=5;i++){
                //         for(int j = 1;j<=i;j++){
                //                 System.out.print("* ");
                //         }
                //         System.out.println();
                // }

                // for(int i =1;i<=5;i++){
                //         for(int j = 5;j>=i;j--){
                //                 System.out.print("* ");
                //         }
                //         System.out.println();
                // }


                // for-each loop 
                // for(D.T V.N : A.N){
                //         //code
                // }

                // int [] x = {1,2,3,4,5,6,7};
                // for(int i=0;i<x.length;i++){
                //         System.out.println(x[i]);
                // }

                // for(int i : x){
                //         System.out.println(i);
                // }

                // lableName:
                // for(.........){

                // }

                // a:
                // for(int i = 1;i<=3;i++){
                //         b:
                //         for(int j =1;j<=3;j++){
                //                 if(i==1 && j==2){
                //                         break b;
                //                 }
                //                 System.out.println(i + " "  + j);
                //         }
                // }

                // for(;;){
                //         System.out.print("vj");
                // }

                //while loop 
                // while (condition) {
                //         //code
                // }

                // int i =1;
                // while (i<=10) {
                //         System.out.println(i);
                //         i++;
                // }

                // while (true) {
                //         System.out.print("vj");
                // }
                // do{

                // }while(conditions);

                // int i = 1;
                // do{
                //         System.out.println(i);
                //         i++;
                // }while(i>=10);

                // while (i<=5) {
                //         while (j<=i) {
                //                 System.out.print("*");
                                
                //         }
                //         System.out.println();
                // }

                // do{
                //         System.out.println("vj");
                // }while(true);



        }
}