import java.util.Scanner;

public class EnumExample {
    public static void main(String[] args) {
        /* Enums (Enumerations) are a special kind of class
        * They Represent a fixed set of constants
        * They improve code reliability and are easy to maintain
        * More efficient with switches when comparing strings */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try{
            Day day = Day.valueOf(response);

            System.out.println(day);
            System.out.println(day.getDayNumber());

            switch(day){
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It's a weekday");
                case SATURDAY, SUNDAY -> System.out.println("It's a Weekend");
            }

        }catch (IllegalArgumentException e){
            System.out.println(response+ " is not a day");
        }

        scanner.close();
    }
}
