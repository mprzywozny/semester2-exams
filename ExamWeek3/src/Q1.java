import java.util.Arrays;

public class Q1 {

    public static void split(int[] a){ //method to divide arrays into two halves and display them
        int[] firsthalf = Arrays.copyOfRange(a, 0, 10);
        int[] secondhalf = Arrays.copyOfRange(a, 10, 20);
        System.out.println("Full array: " + Arrays.toString(a));
        System.out.println("First half: " + Arrays.toString(firsthalf));
        System.out.println("Second half: " + Arrays.toString(secondhalf));
        sumCompare(firsthalf, secondhalf);
    }

    //  method to sum up the values in both arrays and compare them
    public static void sumCompare(int[] a, int[] b) {
        int sum1, sum2;
        sum1 = 0;
        sum2 = 0;
        for (int i = 0; i < a.length; i++) {
            sum1 += a[i];
        }
        for (int i = a.length+1; i < b.length; i++) {
            sum2 += a[i];
        }

        if (sum1 > sum2) {
            System.out.println("First half is bigger!");
        } else if (sum1 < sum2) {
            System.out.println("Second half is bigger!");
        } else {
            System.out.println("Both sums have the same sum.");
        }
    }

    public static void main(String[] args){
        //Create an array with 20 ints of random values from 0 to 100
        int[] full = new int[20];
        for(int i = 0; i<full.length; i++){
            Arrays.fill(full, i, i+1, (int)(Math.random()*101));
        }
        split(full);
    }

    
}
