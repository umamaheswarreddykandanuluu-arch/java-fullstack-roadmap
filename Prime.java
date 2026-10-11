import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Even a number:");
        int n = sc.nextInt();
        boolean isPrime = n>=2;
        for(int i = 2;i < n;i++){
            if(n % i==0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ?"Prime":"Not prime");
        sc.close();
    }
}
    

