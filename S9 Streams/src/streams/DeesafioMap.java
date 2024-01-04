package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class DeesafioMap {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        
        UnaryOperator<String> rs = s -> new StringBuilder(s).reverse().toString();

        nums.stream()
            .map(Integer::toBinaryString)
            .map(rs)
            .map(s -> Integer.parseInt(s, 2))
            .forEach(System.out::println);
        
    }
}
