// 1) Java Program to copy all elements of one array into another array
// public class Array{
//     public static void main(String[] args) {

//         int [] arr1 = new int[] {1,2,6,4,5};

//         int [] arr2 = new int[arr1.length];

//         for(int i=0;i<arr1.length;i++){
//             arr2[i] = arr1[i];
//         }  
//         System.out.println("Element of original array: ");
//         for(int i=0;i<arr1.length;i++){
//             System.out.print(arr1[i] + " ");
//         }
//         System.out.println();

//         System.out.println("Element of new Array: ");
//         for(int i=0;i<arr2.length;i++){
//             System.out.print(arr2[i] + " ");
//         }


//     }
// }

//--------------------------------------------------
// 2) Java Program to find the frequency(repeat element) of each element in the array
// public class Array{
//     public static void main(String[] args) {
//         int [] arr = new int[] {1,1,2,2,3,4,5,1};
//         int [] fr = new int[arr.length];
//         int visited = -1;
//         for(int i=0;i<arr.length;i++){
//             int count=1;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i] == arr[j]){
//                     count++;
//                     fr[j] = visited;
//                 }
//             }
//             if(fr[i] != visited){
//                 fr[i] = count;
//             }
//             System.out.println("--------------------------------");
//             System.out.println("Element | Frequency");
//             System.out.println("--------------------------------");
//             for(int k=0;k<arr.length;k++){
//                 if(fr[k] != visited){
//                     System.out.println("  " + arr[i] + "    |    " + fr[i]);
//                 }
//                 System.out.println("------------------------------------------------");
//             }
            

//         }
//     }
// }


//-------------------------------------------------------
// 3) Java Program to left rotate the elements of an array
// public class Array{
//     public static void main(String[] args) {
//         int[] arr = new int[]{1,2,3,4,5};
        
//         int n=3; //n determine the number of times an array should be rotated  
//         System.out.println("Original array");
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i] + " ");
//         }
//          //Rotate the given array by n times toward left  
//          for(int i=0;i<n;i++){
//              int j,first;
//               //Stores the first element of the array  
//               first = arr[0];
//               for(j=0;j<arr.length-1;j++){
//                 arr[j] = arr[j+1];
//               }
//                 //First element of array will be added to the end
//               arr[j] = first;
//          }
//          System.out.println();
//          System.out.println("Array after left rotation: ");
//          for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i] + " ");
//          }
//     }
// }

//---------------------------------------------------
// 4) Java Program to print the duplicate elements of an array
// public class Array{
//   public static void main(String[] args) {
//     int [] arr = new int[] {1,2,3,4,5,6,7,8,7};
//     // search duplicate element
//     for(int i= 0;i<arr.length;i++){
//       for(int j=i+1;j<arr.length;j++){
//         if(arr[i] == arr[j]){
//           System.out.println(arr[i]);
//         }
//       }
//     }
//   }
// }

//----------------------------------------------------
// 5) Java Program to print the elements of an array
// public class Array{
//   public static void main(String[] args) {
//     int [] arr = new int[] {1,2,3,4,5,6};
//     System.out.println("Elements of given array");
//     for(int i = 0;i<arr.length;i++){
//       System.out.println(arr[i] + " ");
//     }
//   }
// }

//---------------------------------------------------------------------
// 7) Java Program to print the elements of an array present on even position
// public class Array{
//   public static void main(String[] args) {
//     int [] arr = new int [] {1,2,3,4,5,4,6,7,4,7,8};
//     System.out.println("Elements of given array present on even position");
//   for(int i =1;i<arr.length;i+=2){
//     System.out.println(arr[i] + " ");
//   }
  
//   }
// }

//---------------------------------------------------------------------
// 8) Java Program to print the elements of an array present on odd position
// public class Array{
//   public static void main(String[] args) {
//     int [] arr = new int [] {1,2,3,4,5,4,6,7,4,7,8};
//     System.out.println("Elements of given array present on even position");
//     for(int i=0;i<arr.length;i+=2){
//         System.out.println(arr[i] + " ");
//     }

//   }
// }
//---------------------------------------------------------------------
// 9) Java Program to print the largest element in an array
// public class Array{
//   public static void main(String[] args) {
// int[] arr = new int[]{1,2,2,3,9,4,5,6};
// int max = arr[0];
// for(int i =0;i<arr.length;i++){
//   if(arr[i]>max){
//     max = arr[i];
//   }
// }
//   System.out.println("Largest element present in given array:-  " + max);
    
//   }
// }

//--------------------------------------------------------------------------------------
// // 10) Java Program to print the smallest element in an array
// public class Array{
//   public static void main(String[] args) {
// int[] arr = new int[]{1,2,2,3,9,4,5,6};
// int min = arr[0];
// for(int i=0;i<arr.length;i++){
//   if(min>arr[i]){
//     min = arr[i];
//   }
// }
//  System.out.println("smallest element present in given array:-  " + min);

//   }
// }

//-----------------------------------------------------------------------------------
// 11) Java Program to print the number of elements present in an array
// public class Array{
//   public static void main(String[] args) {
// int[] arr = new int[]{1,2,2,3,9,4,5,6};

//     System.out.println("Numner of element present in array is: - " + arr.length);
//   }
// }
//-------------------------------------------------------------------------------------------
// 12) Java Program to print the sum of all the items of the array
// public class Array{
//   public static void main(String[] args) {
// int[] arr = new int[]{1,2,2,3,9,4,5,6};
// int sum=0;
// for(int i=0;i<arr.length;i++){
//   sum+=arr[i];
// }
// System.out.println("Sum of all the element of an array: "+ sum);
//   }
// }


//-------------------------------------------------------------------------------
// // 14) Java Program to sort the elements of an array in ascending order 
// public class Array{
//   public static void main(String[] args) {
//     int[] arr = new int[]{1,2,3,9,4,5,6};
//     int  temp = 0;

//     System.out.println("Original Array");
//     for(int i=0;i<arr.length;i++){
//       System.out.print(arr[i] + " " + "\n");
//     }

//     for(int i=0;i<arr.length;i++){
//       for(int j=i+1;j<arr.length;j++){
//         if(arr[i]>arr[j]){
//           temp = arr[i];
//           arr[i]=arr[j];
//           arr[j]=temp;
//         }
//       }
//     }

//     System.out.println("Sorted Array");
//     for(int i=0;i<arr.length;i++){
//       System.out.print(arr[i] + " ");
//     }
//   }
// }

//-----------------------------------------------------------------------------------
// //15) Java Program to sort the elements of an array in descending order
// public class Array{
//   public static void main(String[] args) {
//     int[] arr = new int[]{1,2,3,9,4,5,6};
//     int temp = 0;

//     System.out.println("Original Array");
//     for(int i=0;i<arr.length;i++){
//       System.out.print(arr[i] + " ");
//     }
//     System.out.println();
//     System.out.println("Decending Order");
//     for(int i=0;i<arr.length;i++){
//       for(int j=i+1;j<arr.length;j++){
//         if(arr[i]<arr[j]){
//            temp = arr[i];
//            arr[i]= arr[j];
//            arr[j] = temp;
//         }
//       }
//     }

//     for(int i=0;i<arr.length;i++){
//       System.out.print(arr[i] + " ");
//     }
//   }
// }


//---------------------------------------------------------------
// 16) Find 3rd Largest Number in an Array

// public class Array{  
//   public static int getThirdLargest(int[] a, int total){  
//   int temp;  
//   for (int i = 0; i < total; i++)   
//           {  
//               for (int j = i + 1; j < total; j++)   
//               {  
//                   if (a[i] > a[j])   
//                   {  
//                       temp = a[i];  
//                       a[i] = a[j];  
//                       a[j] = temp;  
//                   }  
//               }  
//           }  
//          return a[total-3];  
//   }  
//   public static void main(String args[]){  
//   int a[]={1,2,5,6,3,2};  
//   int b[]={44,66,99,77,33,22,55};  
//   System.out.println("Third Largest: "+getThirdLargest(a,6));  
//   System.out.println("Third Largest: "+getThirdLargest(b,7));  
//   }} 

  //---or---

  // Find 3rd Largest Number in Array using Arrays
  
  
  // import java.util.*;  
  // public class Array{  
  // public static int getThirdLargest(int[] a, int total){  
  // Arrays.sort(a);  
  // return a[total-3];  
  // }  
  // public static void main(String args[]){  
  // int a[]={1,2,5,6,3,2};  
  // int b[]={44,66,99,77,33,22,55};  
  // System.out.println("Third Largest: "+getThirdLargest(a,6));  
  // System.out.println("Third Largest: "+getThirdLargest(b,7));  
  // }}  

//--or--

// // Find 3rd Largest Number in Array using Collections
// import java.util.*;  
// public class Array{  
// public static int getThirdLargest(Integer[] a, int total){  
// List<Integer> list=Arrays.asList(a);  
// Collections.sort(list);  
// int element=list.get(total-3);  
// return element;  
// }  
// public static void main(String args[]){  
// Integer a[]={1,2,5,6,3,2};  
// Integer b[]={44,66,99,77,33,22,55};  
// System.out.println("Third Largest: "+getThirdLargest(a,6));  
// System.out.println("Third Largest: "+getThirdLargest(b,7));  
// }}  
//------------------------------------------------------------------------------
// // 17) Find 2nd Largest Number in an Array 
// public class Array{
//   public static int getSecondLargest(int[] a, int total){
//     int temp;
//     for(int i=0;i<total;i++){
//       for(int j=i+1;j<total;j++){

//         if(a[i]>a[j]){
//           temp = a[i];
//           a[i] = a[j];
//           a[j] = temp;
//         }
//       }
//     }
//     return a[total-2];
//   }
//   public static void main(String[] args) {
//     int a[] = {1,2,3,4,5,6,7,8};
//     System.out.println(getSecondLargest(a, 8));
//   }
// }
//--------------------------------------------------------------

// 18) Find Largest Number in an Array 
// public class Array{
//   public static int getLargest(int [] a , int total){
//     int temp;
//     for(int i=0;i<total;i++){
//       for(int j=i+1;j<total;j++){
//         if(a[i]>a[j]){
//           temp = a[i];
//           a[i] = a[j];
//           a[j] = temp;
//         }
//       }
//     }
//     return a[total-1];
//   }
//   public static void main(String[] args) {
//     int a[] = {1,2,3,4,5,6,7,8};
//     System.out.println(getLargest(a, 8));
//   }
// }

//-------------------------------------------
//// 19) Find 2nd Smallest Number in an Array 
// public class Array{
//   public static int getSecondSmallest(int[] a, int total){
//     int temp;
//     for(int i=0;i<total;i++){
//       for(int j=i+1;j<total;j++){

//         if(a[i]>a[j]){
//           temp = a[i];
//           a[i] = a[j];
//           a[j] = temp;
//         }
//       }
//     }
//     return a[1];
//   }
//   public static void main(String[] args) {
//     int a[] = {1,3,4,5,6,7,2,8};
//     System.out.println(getSecondSmallest(a, 8));
//   }
// }

//--------------------------------------------
// 20) Find Smallest Number in an Array
// public class Array{
//   public static int getSecondSmallest(int[] a, int total){
//     int temp;
//     for(int i=0;i<total;i++){
//       for(int j=i+1;j<total;j++){

//         if(a[i]>a[j]){
//           temp = a[i];
//           a[i] = a[j];
//           a[j] = temp;
//         }
//       }
//     }
//     return a[0];
//   }
//   public static void main(String[] args) {
//     int a[] = {1,3,4,5,6,7,2,8};
//     System.out.println(getSecondSmallest(a, 8));
//   }
// }


//----------------------------------------------------------------
// // 21) Remove Duplicate Element in an Array 
// public class Array{

//   public static int removeDuplicate(int arr[], int n){
//     if(n==0||n==1){
//       return n;
//     }
//     int[] temp = new int[n];
//     int j=0;
//     for(int i=0;i<n-1;i++){
//       if(arr[i]!=arr[i+1]){
//         temp[j++] =arr[i];
//       }
//     }
//     temp[j++] = arr[n-1];
//     for(int i=0;i<j;i++){
//       arr[i] = temp[i];
//     }
//     return j;
//   }
//   public static void main(String[] args) {
//     int arr[] = {10,20,20,30,30,40,50,50};  
//     int length = arr.length;  
//     length = removeDuplicate(arr, length);  
//     //printing array elements  
//     for (int i=0; i<length; i++)  
//        System.out.print(arr[i]+" ");  
//   }
// }


//---------------------------------------------------------------
// 22) Add Two Matrices
// public class Array{
//   public static void main(String[] args) {
//     int a[][] = {{1,3,4},{2,4,3},{3,4,5}};
//     int b[][] = {{1,3,4},{2,4,3},{1,2,4}};

//     int c[][] = new int[3][3];
//     for(int i=0;i<3;i++){
//       for(int j=0;j<3;j++){
//         c[i][j]  = a[i][j] + b[i][j];
//         System.out.print(c[i][j] + " ");
//       }
//       System.out.println();
//     }
//   }
// }
//----------------------------------------------------------------------
// 23) Multiply Two Matrices
// public class Array{
//   public static void main(String[] args) {
//     int a[][] = {{1,1,1},{2,2,2},{3,3,3}};
//     int b[][] = {{1,1,1},{2,2,2},{3,3,3}};

//     int c[][] = new int[3][3];

//     for(int i=0;i<3;i++){
//       for(int j=0;j<3;j++){
//         c[i][j] = 0;
//         for(int k=0;k<3;k++){
//           c[i][j] = a[i][j]*b[k][j];
//         }
//         System.out.print(c[i][j] + " ");
//       }
//       System.out.println();
//     }
//   }
// }

//-------------------------------------------------------------------
// // 24) Print Odd and Even Number from an Array
// public class Array{
//   public static void main(String[] args) {
//     int a[] = {1,2,4,6,5,4,3};
//     System.out.println("Odd Number");
//     for(int i =0 ;i<a.length;i++){
//       if(a[i]%2!=0){
//         System.out.print(a[i] + " ");
//       }
//     }
// System.out.println();
//     System.out.println("Even Number");
//     for(int i=0;i<a.length;i++){
//       if(a[i]%2==0){
//         System.out.print(a[i] + " ");
//       }
//     }
//   }
// }
//------------------------------------------------------------------------
// // 25) Transpose matrix
// public class Array{
//   public static void main(String[] args) {
//     int original[][] = {{1,3,4},{2,4,3},{3,4,5}}; 

//     int Transpose[][] = new int[3][3];
//     for(int i=0;i<3;i++){
//       for(int j=0;j<3;j++){
//         Transpose[i][j] = original[j][i];
//       }
//     }


//     System.out.println("print matrix without Transpose");
//     for(int i=0;i<3;i++){
//       for(int j=0;j<3;j++){
//         System.out.print(original[i][j] + " ");
//       }
//       System.out.println();
//     }

//     System.out.println("Transpose Matrix");
//     for(int i=0;i<3;i++){
//       for(int j=0;j<3;j++){
//         System.out.print(Transpose[i][j] + " ");
//       }
//       System.out.println();
//     }
//   }
// }
//-------------------------------------------------------------------
// 26) Java Program to subtract the two matrices
// public class Array{
//   public static void main(String[] args) {
//   int a[][] = { 
//   {4, 5, 6},  
//   {3, 4, 1},  
//   {1, 2, 3} };
//     int b[][] = {   
//     {2, 0, 3},  
//     {2, 3, 1},  
//     {1, 1, 1}};


// int c[][] = new int[3][3];

//     for(int i=0;i<3;i++){
//       for(int j=0;j<3;j++){
//         c[i][j]  = a[i][j] - b[i][j];
//         System.out.print(c[i][j] + " ");
//       }
//       System.out.println();
//     }
//   }
//   }
//------------------------------------------------------------------------
// // 27) Java Program to determine whether a given matrix is an identity matrix
// public class Array{
//   public static void main(String[] args) {
//     int rows, cols;
//     boolean flag = true;

//     int a[][] = {{1,0,0},
//                  {0,1,0},
//                  {0,0,1}
//                 };

// //Calculates the number of rows and columns present in the given matrix
// rows = a.length;
// cols = a[0].length;


// //Checks whether given matrix is a square matrix or not   
// if(rows!=cols){
//   System.out.println("matrix should be sqre mstrix");
// }
// else{
//   for(int i=0;i<rows;i++){
//     for(int j=0;j<cols;j++){
//       if(i==j && a[i][j]!=1){
//         flag = false;
//         break;
//       }
//       if(i!=j&&a[i][j]!=0){
//         flag = false;
//         break;
//       }
//     }
//   }
//   if(flag){
//     System.out.println("identity matrix");
//   }
//   else{
// System.out.println("not identity matrix");
//   }
// }
//   }
// }
 

// // 28) Java Program to determine whether a given matrix is a sparse matrix 
// public class Array{
//   public static void main(String[] args) {
//     int rows ,cols,size,count =0;

//     int a[][] = {
//       {4,0,0},
//       {0,5,0},
//       {0,0,6}
//     };

//     //calculate Rows and Column
//     rows = a.length;
//     cols = a[0].length;

//     //calculate the size of array
//     size = rows*cols;

//      //Count all zero element present in matrix 
//     for(int i=0;i<rows;i++){
//       for(int j=0;j<cols;j++){
//         if(a[i][j] == 0){
//           count++;
//         }
//       }
//       if(count > (size/2)){
//         System.out.println("sparse matrix");
//       }
//       else{
//         System.out.println("Not a sparse matrix");
//       }
//     }
//   }
// }


// //29) Java Program to determine whether two matrices are equal
// public class Array{
//   public static void main(String[] args) {
//     int row1,col1,row2,col2;
//     boolean flag =  true;

//     //initialize matrix
//     int a[][] = {
//       {1,2,3},
//       {8,4,6},
//       {4,5,6}
//     };

//     int b[][] = {
//       {1,2,3},
//       {8,4,6},
//       {4,5,6}
//     };

// //30.Calculates the number of rows and columns present in a[][]
//       row1 = a.length;
//       col1 = a[0].length;

//       row2 = b.length;
//       col2 = b[0].length;

//       if(row1 != row2 || col1 != col2){
//         System.out.println("Matrix are not equal");
//       }
//       else{
//         for(int i=0;i<row1;i++){
//           for(int j=0;i<col1;j++){
//             if(a[i][j] != b[i][j]){
//               flag = false;
//               break;
//             }
//           }
//         }
//         if(flag){
//           System.out.println("matrix are equal");
//         }
//         else{
//           System.out.println("matrix are not equal");
//         }
//       }

//   }
// }










































