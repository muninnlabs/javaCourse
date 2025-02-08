import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        for (String item : list) {
            System.out.println(item);
        }
        System.out.println("-------------------");
        list.add(2, "five"); // add "five" at index 2

        list.remove("three"); // remove the element with three value

        list.remove(0); // remove the element at index 0

        list.removeIf(x -> x.charAt(0) == 'S'); // remove all elements that start with 'S'


        for (String item : list) {
            System.out.println(item);
        }

        System.out.println("-------------------");
        System.out.println("Index of 'two': " + list.indexOf("two"));
        System.out.println("Index of 'Ten': " + list.indexOf("Ten"));

        System.out.println("-------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'f').findFirst().orElse(null); // find the first element that starts with 'f'
        System.out.println(name);
        System.out.println("-------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'f').toList(); // filter elements that start with 'f'

        for (String item : result) {
            System.out.println(item);
        }


    }
}