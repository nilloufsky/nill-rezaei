
import java.util.Scanner;

public class S5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("add number of indexes");
        int num = input.nextInt();

        int[] arrey = new int[num];
        for (int i = 0; i < num; i++) {
            arrey[i] = input.nextInt();
        }

        plus(arrey);
    }

    public static void plus(int arrey[]) {

        if (arrey.length == 1) {
            System.out.println("[" + arrey[0] + "]");
        }else{

        int[] b = new int[arrey.length - 1];

        for (int i = 0; i < b.length; i++) {
            b[i] = arrey[i] + arrey[i + 1];
        }

        plus(b);

        System.out.print("[");
        for (int i = 0; i < arrey.length; i++) {
            System.out.print(" " + arrey[i] + ",");
        }
        System.out.println("]");
        }
    }
}