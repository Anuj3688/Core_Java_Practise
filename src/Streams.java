import java.util.*;
import java.util.stream.*;

public class Streams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill", "John", "Anuj", "Ram", "Hanuman");

        names.stream()
                .filter(n -> n.startsWith("J"))
                .map(String::toLowerCase)
                .limit(5)
                .skip(2)
                .forEach(System.out::println);

        String concatenated = List.of("a", "b", "c")
                .stream()
                .reduce("", String::concat);
//        System.out.println(concatenated);
        List<String> people = List.of("Amy", "Alex", "Al", "Adam", "John");
//        people.stream().filter(n -> n.startsWith("A")).filter(n -> n.length() > 3).map(String::toUpperCase).forEach(System.out::println);
        Map<String, Integer> values = people.stream()
                .filter(n -> n.startsWith("A")
                ).filter(n -> n.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.toMap(
                        n -> n,
                        n -> (n.length()*2)-1
                ));
//        System.out.println(values);
        Map<Integer, List<String>> grouped = people.stream()
                .filter(n -> n.length()>2)
                .collect(Collectors.groupingBy(String::length));

        Map<Boolean, List<String>> partition = people.stream()
                .filter(n -> n.length()>3)
                .collect(Collectors.partitioningBy(n->n.startsWith("A")));
        System.out.println(partition);

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);

        Map<Integer,String> val1 =nums.stream().collect(
                Collectors.toMap(
                        n -> n,
                        n -> n%2==0? "Even":"Odd"
                )
        );
        System.out.println(val1);

        Map<String,List<Integer>> val2 = nums.stream()
                .collect(Collectors.groupingBy(n -> n%2==0? "Even":"Odd"));

        System.out.println(val2);

    }
}
