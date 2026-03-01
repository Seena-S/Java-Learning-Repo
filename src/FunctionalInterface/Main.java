package FunctionalInterface;

@FunctionalInterface
interface A
{
    void show();
}
/*class B implements A{

    public void show() {
        System.out.println("Hey");
    }
}*/
public class Main {
    public static void main(String[] args){

        /*
        A b =new A(){
            public void show()
            {
                System.out.println("Hey");
            }
        };
        b.show();
        */
        /*
        Java 8 - Lamda expression
        */
        A obj = () -> System.out.println("In show()....");
        obj.show();
    }
}

