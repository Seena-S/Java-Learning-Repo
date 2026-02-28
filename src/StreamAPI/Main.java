package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args){
        System.out.println("Hey Seena");
        List<Integer> num =Arrays.asList(6,5,2,8,1,7);
       // Stream<Integer> data = num.stream();
        /*(In future even if you change the value of stream it won't affect the list.
        Once you consume the stream, you can't reuse it.)
        */
        /*Stream<Integer> sortedData = data.sorted();
        Stream<Integer> mappedData = sortedData.map(n -> n*2);
        mappedData.forEach(System.out::println);*/

        /*num.stream()
                .filter(e -> e % 2 == 0)
                .sorted()
                .map(n -> n*3)
                .forEach(System.out::println);*/

        int result= num.parallelStream()
                .filter(e -> e % 2 == 1)
                .map(n -> n*2)
                .reduce(0,(c,e) -> c + e);

        System.out.println(result);


    }
}