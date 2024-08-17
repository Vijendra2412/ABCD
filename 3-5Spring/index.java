// class vj{

//     int x =9;

//     public static void main(String[] args) {
        
//         System.out.println("hello");
//     }
// }

// class System{
//     public static void println(){
//         System.out.println("hello");
//     }
//     public static void main(String[] args) {
//         println();
//     }
// }

// class vj{
//     float x = 13.4f; 
// }
// class abc extends vj{
//     public void println(){
//         System.out.println("hello");
//     }
//     public static void main(String[] args) {
//         abc obj = new abc();
//         obj.println();
//         System.out.println(obj.x);
        
//     }
// }

// class A{
//     void msg(){
//         System.out.println("hello");
//     }
// }
// class B{
//     void msg(){
//         System.out.println("hello vj");
//     }
// }
// class c extends A{
    
//     public static void main(String[] args){
//         c obj = new c();
//         obj.msg();
//     }
// }

// interface vj{
//     void msg();
// }

// class c implements vj{
//     public void msg(){
//         System.out.println("hello");
//     }
// }

// class index{
//     public static void main(String[] args) {
//         c obj = new c();
//         obj.msg();
//     }
// }

// interface drawable{
//     void draw();
// }

// class rectangle implements drawable{
//     public void draw(){
//         System.out.println("drawing rectangle");
//     }
// }

// class Circle implements drawable{
//     public void draw(){
//     System.out.println("drawing circle");
//     }
// }

// class index{
//     public static void main(String[] args) {
//         drawable d = new rectangle();
//         d.draw();
//         d = new Circle();
//         d.draw();
//     }
// }


// interface printable{
//     void print();
//     void show();
// }
// // interface Showable{
// //     
// // }
// class A implements printable{
//     public void print(){
//         System.out.println("welcome");
//     }
  
//     public static void main(String[] args) {
//         A obj = new A();
//         obj.show();
//         obj.print();
//     }
// }


// interface vj{
//     void draw();
//     default void msg(){
//         System.out.println("hello");
//     }
// }

// class c implements vj{
//     public void draw(){
//         System.out.println("drwaing vj");
//     }
// }

// class index{
// public static void main(String[] args) {
//     c obj = new c();
//     obj.draw();
//     obj.msg();
// }
// }

// interface drawable {
//     void draw();
//     static int cube(int x){
//         return x*x*x;
//     }
// }
// class rectangle implements drawable{
//     public void draw(){
//         System.out.println("drawing rectangle");
//     }
// }

// class index{
//     public static void main(String[] args) {
//         drawable d = new rectangle();
//         d.draw();
//         System.out.println(drawable.cube(5));
//     }
// }


// class vj{
//     int x;
//     vj(){
//         x=9;
//         System.out.println(x);
//     }
// }
// class index{
//     public static void main(String[] args) {
//         vj obj = new vj();
//     }
// }

// Syntax:- 

// for(initialization; conditions ;Increment/Decrement){
//     //code
// }

// class vj{
//     public static void main(String[] args) {
//         for(int i =0;i<=2;i++){
//            System.out.println("Outer:- " + i);
           
//             for(int j=0;j<=2;j++){
                
//                 System.out.println(i+" " + j);
//             }
//         }
//     }
// }



// class vj{
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=5;j>=i;j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// for-each loop
// for(data_type : arrayName){

// }



// class vj{
//     public static void main(String[] args) {
        
// A:
// for(int i=0;i<=3;i++){

//     B:
//     for(int j=1;j<=3;j++){
//         if(i==2 && j==2){
//             break B;
//         }
//         System.out.println(i + " " + j);
//     }
// }
//     }
// }


