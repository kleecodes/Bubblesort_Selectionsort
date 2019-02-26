import java.util.Scanner;
public class SelectionSorter extends Sorter{
    @Override
    public <E extends Comparable<E>> void sort(E[] array){
      int i, j, k;
      for(i = 0; i < array.length - 1; i++){
        int minimum_index = i;//assume minimum is the first element to begin comparison
        for(j = i + 1; j < array.length; j++){
          if(array[j].compareTo(array[minimum_index]) < 0) minimum_index = j;//found new minimum and store index
        }
        if(minimum_index != i){
          E smaller_number = array[minimum_index];
          array[minimum_index] = array[i];
          array[i] = smaller_number;
        }
      }
    }

  	public static void main(String[] args){
      Scanner calledScanner = new Scanner(System.in);
      System.out.println("Welcome!");
      String input;
      boolean try_again;
      int size = 0;
      do{
        try_again = false;
        System.out.println("Please enter a positive integer to selections sort: ");
        input = calledScanner.nextLine();
        try{
          size = Integer.parseInt(input);
        }
        catch(NumberFormatException e){
          System.out.println("that was not a positive number");
          try_again = true;
        }
        if(size <= 0) try_again = true;
      } while(try_again);

  		SelectionSorter ss = new SelectionSorter();

      System.out.println("time took to sort selection: " + ss.timeSort(size) + "ms");
  	}
}
