// import java.util.*;
// class vj{
//     public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
// System.out.println("how many days temp?");
// int numdays = console.nextInt();
// int sum = 0;
// for(int i =1;i<=numdays; i++){
// System.out.println("days "+ i + "'s high temp: ");
// int next = console.nextInt();
// sum+=next;
// }
// double average = sum/numdays;
//     System.out.println();
//     System.out.println("Average Temp = " + average);

// }
// }




// ------------------------------------------------------------------------------
import java.util.*;
class vj{
    public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
System.out.println("how many days temp?");
int numdays = console.nextInt();
int[] temps = new int[numdays];
// record temperature and find average
int sum = 0;
for(int i =0;i<numdays; i++){
System.out.println("days "+ i + "'s high temp: ");
 temps[i] = console.nextInt();
sum+=temps[i];
}

double average = sum/numdays;
// count days above average
int above = 0;
for(int i =0;i<temps.length;i++){
    if(temps[i]>average){
        above++;
    }
}
    System.out.println();
    System.out.println("Average Temp = " + average);
    System.out.println(above + " days above average");
    
    
}
}