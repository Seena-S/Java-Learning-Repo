package com.engineeringdigest.collectionframework;

import java.util.*;
import java.util.function.*;
import java.util.function.Consumer;

public class FunctionalInterfacesDemo {

    public static void main(String[] args) {

        // ================= Predicate =================
        Predicate<Integer> isEven = x -> x % 2 == 0;
        Predicate<String> startsWithA = s -> s.startsWith("A");

        System.out.println("Predicate (Integer): " + isEven.test(10));
        System.out.println("Predicate (String): " + startsWithA.test("Apple"));

        // ================= Consumer =================
        Consumer<Integer> printSquare = x -> System.out.println("Square: " + (x * x));
        Consumer<String> printUpper = s -> System.out.println("Upper: " + s.toUpperCase());

        printSquare.accept(5);
        printUpper.accept("seena");

        // ================= Function =================
        Function<Integer, Integer> square = x -> x * x;
        Function<String, Integer> length = s -> s.length();

        System.out.println("Function (Square): " + square.apply(4));
        System.out.println("Function (Length): " + length.apply("Java"));

        // ================= Supplier =================
        Supplier<Integer> random = () -> (int)(Math.random() * 100);
        Supplier<String> greeting = () -> "Hello Seena";

        System.out.println("Supplier (Random): " + random.get());
        System.out.println("Supplier (Greeting): " + greeting.get());

        // ================= BiPredicate =================
        BiPredicate<Integer, Integer> isSumEven = (a, b) -> (a + b) % 2 == 0;
        BiPredicate<String, String> sameLength = (s1, s2) -> s1.length() == s2.length();

        System.out.println("BiPredicate (Sum Even): " + isSumEven.test(2, 4));
        System.out.println("BiPredicate (Same Length): " + sameLength.test("Java", "Code"));

        // ================= BiConsumer =================
        BiConsumer<String, Integer> printData = (name, age) ->
                System.out.println(name + " is " + age + " years old");

        printData.accept("Seena", 25);

        // ================= BiFunction =================
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        BiFunction<String, String, String> concat = (s1, s2) -> s1 + s2;

        System.out.println("BiFunction (Add): " + add.apply(5, 3));
        System.out.println("BiFunction (Concat): " + concat.apply("Hello ", "World"));

        // ================= Combined Example =================
        Supplier<Integer> supplier = () -> (int)(Math.random() * 50);

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(supplier.get());
        }

        System.out.println("\nGenerated Numbers: " + numbers);

        Predicate<Integer> evenFilter = n -> n % 2 == 0;
        Function<Integer, Integer> squareFunc = n -> n * n;
        Consumer<Integer> print = n -> System.out.println("Processed: " + n);

        List<Integer> processed = new ArrayList<>();

        for (Integer num : numbers) {
            if (evenFilter.test(num)) {
                int sq = squareFunc.apply(num);
                print.accept(sq);
                processed.add(sq);
            }
        }

        if (processed.size() >= 2) {
            int a = processed.get(0);
            int b = processed.get(1);

            BiConsumer<Integer, Integer> printTwo =
                    (x, y) -> System.out.println("Values: " + x + ", " + y);

            printTwo.accept(a, b);

            int sum = add.apply(a, b);
            System.out.println("Sum: " + sum);

            BiPredicate<Integer, Integer> greater = (x, y) -> x > y;
            System.out.println("Is A > B: " + greater.test(a, b));
            System.out.println("Is A > B: " + ((BiPredicate<Integer, Integer>) (x, y) -> x > y).test(a, b));
        }

        // ================= Stream Example =================
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toList();

        System.out.println("\nStream Result:");
        result.forEach(n -> System.out.println(n));
    }
}