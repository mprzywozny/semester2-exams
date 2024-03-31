import java.util.*;

public class W5L4_ArrayLists {
    public static void main(String[] args){
        //Make array list called animals
        ArrayList<String> animals = new ArrayList<String>();

        //add elements and print out list
        animals.add("Lions");
        animals.add("Tigers");
        animals.add("Bears");
        animals.add("Monkeys");
        System.out.println(animals);

        //create element "dog" and place it in the middle of the list, then print out list again
        //create integer midpoint which is the middle index;
        int midpoint = animals.size()/2;
        animals.add(midpoint, "Dog");
        System.out.println(animals);

        //print out tigers dog and bears only, therefore remove first and last element
        animals.removeFirst();
        animals.removeLast();

        //Alternatively, remove specific elements
        //animals.remove("Lions");
        //animals.remove("Monkeys");

        System.out.println(animals);

        //swap tigers with bears and print out new list
        //create integer which is the last index of the array list to make it easier to read
        int lastIndex = animals.size()-1;

        String temp = animals.getFirst();
        animals.set(0, animals.getLast());
        animals.set(lastIndex, temp);
        System.out.println(animals);

    }
}
