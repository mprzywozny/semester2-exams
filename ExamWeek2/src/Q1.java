public class Q1 {
    public static void main(String[] args){
        //Fibonacci sequence = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
        //Every number after the first two is the sum of the two preceding ones
        int X = (int)(Math.random()*8 + 5);
        System.out.printf("Random number = %d\n", X);

        int prev, curr, next;
        prev = 0;
        curr = 1;
        next = 1;
        System.out.print("0, 1, 1, ");

        for(int i=3; i<X; i++){
            prev = curr;
            curr = next;
            next = prev + curr;
            if(i==X-1){
                System.out.printf("%d ", next);
            } else {
                System.out.printf("%d, ", next);
            }
        }
    }
}
