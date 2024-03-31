import java.util.Arrays;

public class ExamComparisonSorts {
    public static void main(String[] args){
        int[] numbers = new int[10];
        for(int i=0; i<numbers.length; i++){
            numbers[i]=(int)(Math.random()*100 + 1);
        }
        System.out.println("Original array: " + Arrays.toString(numbers));
        shuffle(numbers);
        System.out.println("Shuffled array: " + Arrays.toString(numbers));
    }

    public static void shuffle(int[] collection){ // [4,7,5,8,3]
        int temp;                                  //[7,3,5,4,8]
        for(int i=collection.length-1; i>0; i--){
            //if the number at the last index is smaller than the number at the first index, swap them
            if(collection[i] < collection [0]){
                temp = collection[i];
                collection[i] = collection[0];
                collection[0] = temp;
            }
        }
    }
}
