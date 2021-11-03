import java.util.Scanner;


public class S3 {

    
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("add a int num");
        int m = input.nextInt();
        System.out.println("add a int num");
        int n = input.nextInt();
        
        System.out.println(AGH(m , n));
    }
    
    public static int AGH(int m , int n){
        
        if(n == 0){
            return m;
        }
        
        return AGH(n , m % n);
    }
}
