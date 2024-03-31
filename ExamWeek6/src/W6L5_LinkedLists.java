import java.util.*;

public class W6L5_LinkedLists {
    public static void main(String[] args) {

        //make a linked list called primeElements, add all elements and print it out
        LinkedList<Integer> primeElements = new LinkedList<>();

        for(int z=0; z<24; z++){
            if(isPrime(z)){
                primeElements.add(z);
            }
        }

        System.out.println(primeElements);

        //remove 11 and print again
        int ind = primeElements.indexOf(11);
        primeElements.remove(ind);

        System.out.println(primeElements);

        //put 11 back in and print again

        primeElements.add(ind, 11);
        System.out.println(primeElements);

        // get 2 random numbers and multiply them by each other

        int prod = 1;

        for(int b =0; b<2; b++){
            int s = 1;
            int a = (int)(primeElements.get((int)(Math.random()*primeElements.size()+1)));
            System.out.println("Chosen Prime " + s + " = " + a);
            s++;
            prod *= a;
        }

        System.out.println("Prime calculation = " + prod);

    }

    public static boolean isPrime(int n){
        if(n<2) {
            return false;
        }

        for(int i=2; i<n; i++){
            //if n = 2 the loop does not do anything, the condition n<2 doesnt apply so it returns true
            //if n = 3 -> n%2 == 0 false, so return true
            //if n = 4 -> n%2 ==0 true, so return false
            //if n = 5 -> n%2 == 0 false, n%3 false, n%4 false, so return true
            if(n%i==0){
                return false;
            }
        }

        return true;
    }

}
