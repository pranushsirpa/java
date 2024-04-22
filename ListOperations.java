import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    public static void removeEverySecondElement(List<Integer> list) {
        for (int i = 1; i < list.size(); i += 2) {
            list.remove(i);
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        
        System.out.println("Original List: " + numbers);
        
        removeEverySecondElement(numbers);
        
        System.out.println("List after removing every second element: " + numbers);
    }
}
