import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> sortedNumbers = new ArrayList<>();
        for (int number: numbers) {
           if (number > 0 && number % 2 == 0){
               sortedNumbers.add(number);
           }
        }
        sortedNumbers.sort(Integer::compareTo);
        System.out.println(sortedNumbers);
    }
}
