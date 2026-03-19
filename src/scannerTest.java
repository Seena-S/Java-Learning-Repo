import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String name = scanner.nextLine();
//        System.out.println("Hi " + name);

        System.out.print("Enter width: ");
        int width = scanner.nextInt();
        System.out.print("Is it a Square or rectangle? ");
        String shape = scanner.next();
        if(shape.equals("square") || shape.equals("Square")){
            System.out.println(shape + " Area: " + width*width);
        }else{
            System.out.print("Enter height: ");
            int height = scanner.nextInt();
            System.out.println(shape + " Area: " + width*height);
        }
        scanner.close();
    }
}
