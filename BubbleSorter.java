import java.util.Scanner;
public class BubbleSorter extends Sorter{

  @Override
  public <E extends Comparable<E>> void sort(E[] array){
    E temp;
    for(int i = 0; i < array.length; i++){
      for(int j = i+1; j < array.length; j++){
        if(array[i].compareTo(array[j]) > 0){
          temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
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

    BubbleSorter bs = new BubbleSorter();

    System.out.println("time took to bubble sort: " + bs.timeSort(size) + "ms");
  }

}
