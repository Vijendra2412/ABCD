import java.util.Arrays;

public class two {
    public static void main(String[] args) {
        TwoDimensionalArray sda = new TwoDimensionalArray(3, 3);
        sda.insertValueInTheArray(0, 0, 10);
        sda.insertValueInTheArray(0, 1, 20);
        sda.insertValueInTheArray(1,0,30);
        sda.insertValueInTheArray(2,0,40);

        System.out.println(Arrays.deepToString(sda.arr));
        sda.deleteValuefromArray(0, 0);
        System.out.println(Arrays.deepToString(sda.arr));
    }
}
