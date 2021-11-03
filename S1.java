import java.util.Scanner;


public class S1 {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("add a num");
        double x = input.nextDouble();
        System.out.println("add a int num");
        int n = input.nextInt();
        
        System.out.println(tavan(x , n));
        
    }
    
    public static double tavan(double x , int n){
        
        if(n == 1){
            return x;
        }
        
        return x * tavan(x , n-1);
    }
    
}