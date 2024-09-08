// Array 

// array are defined as the collections of similar types 
// properties :- 
//              each element in an arra is of the same data type and carries the same size 
            //  at contigious memory location
            // 

import java.util.Scanner;

class dsa{
                public static void main(String[] args) {
                    // int x [] = {1,2,3,4,5,6};
                    // base address of the array 
                    // size of an elements in bytes
                    // types of indexing

                    // traversal :
                    // insertion :
                    // Deletion :
                    // search :
                    // Update :

                    // int arr[] = {1,2,3,4,5,6};
                    // for(int i=0;i<arr.length;i++){
                    //     System.out.println(arr[i]);
                    // }
                    // for(int i:arr){
                    //     System.out.println(i);
                    // }

                    // int x[] = {1,2,3,4,5};
                    // x[0] = 7;
                    //  for(int i:x){
                    //     System.out.println(i);
                    // }
                    // int arr[] = {1,2,3,4,5,6};
                    // int n=5;

                    // System.out.println("Array of elements before the insetion:- ");
                    // for(int i:arr){
                    //     System.out.println(i);
                    // }

                    // int x= 7;
                    // int pos = 4;
                    // n++;

                    // for(int i=n-1;i>=pos;i--){
                    //     arr[i] = arr[i-1];
                    // }
                    // arr[pos-1] =x;
                    // System.out.println("Array of elements After the insetion:- ");
                    // for(int i =0;i<=n;i++){
                    //     System.out.print(arr[i] + " ");
                    // }
                    // System.out.println();

                    // Acccess   O(1)     O(1)
                    // Search       O(n)     O(n) 

                    // 2D array is organised as matrix which can be represent as the collection of rows and column
                     

                    // int x[] ={}
                    // int x[][] = {
                    //     {1,2,3},
                    //     {4,5,6}
                    // };
                    // System.out.println(x[1][1]);

                  


    //     int arr[][] = new int[3][3];  // Changed to 3x3 to match the loop bounds
    //     Scanner sc = new Scanner(System.in);
        
    //     // Input
    //     for(int i = 0; i < 3; i++) {
    //         for(int j = 0; j < 3; j++) {
    //             System.out.print("Enter the element: ");
    //             arr[i][j] = sc.nextInt();
    //         }
    //     }
        
    //     // Output
    //     System.out.println("Print the elements:");
    //     for(int i = 0; i < 3; i++) {
    //         for(int j = 0; j < 3; j++) {
    //             System.out.print(arr[i][j] + "\t");
    //         }
    //         System.out.println();  // Move to next line after each row
    //     }
        
    //     sc.close();  // Close the scanner

 //find max
                // int x[] =  {1,2,3,7,8,9,4,5,6};
                // int max = x[0];
                // for(int i =1;i<x.length; i++ ){
                //     if(x[i]>max){
                //         max=x[i];
                //     }
                // }
                // System.out.println("max element is:- " + max);


                // reverse 
                int arr[] = {1,2,3,4,5,6,7,8,9};
                int n = arr.length;
                for(int i =0;i<n/2;i++){
                    int temp = arr[i];
                    arr[i] = arr[n-i-1];
                    arr[n-i-1] = temp;
                }
                System.out.println("Reversed Array");
                for(int i : arr){
                    System.out.print(i +" ");

                }



    }
                }
            