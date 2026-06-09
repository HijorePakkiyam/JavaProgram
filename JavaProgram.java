import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaProgram{

    public static void main(String[] args){

        //find the duplicate elements
        int[] arr = {1, 2, 3, 2, 4, 1, 5};
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicates = Arrays.stream(arr).boxed().filter(e-> ! unique.add(e)).collect(Collectors.toSet());
//        System.out.println(duplicates);

        // find the first non-repeated character
        String s = "swiss";

       Character ch =  s.chars().mapToObj(c -> (char) c)
                 .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                 .entrySet().stream()
                 .filter(k -> k.getValue() == 1).map(Map.Entry::getKey)
                 .findFirst()
                 .orElse(null);
//        System.out.println(ch);


        String str = "swiss";




    }
}