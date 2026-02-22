public class AbstractionExample {
    public static void main(String[] args){
        // abstract class example "Shape"
        // child class "Square"

        // Shape shape = new Shape(); 'Shape' is abstract; cannot be instantiated

        Square square = new Square(5);

        System.out.println("Area of the square: " + square.area()); // calling the abstract method
        square.display(); // calling the concrete method
    }
}
