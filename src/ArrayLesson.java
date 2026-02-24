import java.util.Arrays;
import java.util.Scanner;

public class ArrayLesson {
    void main(){
        Scanner scanner = new Scanner(System.in);
        String[] infy={"Sooraj","Seena","Sidharth","Adarsh","Greeshma","Saajid","Navneeth","Sreehari","Devika","Ashwin"};
        System.out.println(infy[3]);
        System.out.println("Friends from Infy");
        printList(infy);
        Arrays.sort(infy);
        System.out.println("Sorted");
        printList(infy);
        int broCount;
        String[] bros;
        System.out.println("How many bros outside infy?");
        broCount=scanner.nextInt();
        System.out.println("add bros outside infy");
        bros= new String[broCount];
        bros= getList(broCount);
        System.out.println("bros outside infy are:");
        Arrays.sort(bros);
        System.out.println("sorted");
        printList(bros);
    }

    static void printList(String[] names){
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
    static String[] getList(int broCount){
        String[] list =new String[broCount];
        Scanner scanner =new Scanner(System.in);
        for(int i=0;i<broCount;i++){
            list[i]=scanner.nextLine();
        }
        return list;
    }
}
