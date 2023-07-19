import java.util.Scanner;

public class ArrangeCoins {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int prefixSum=0;
        for(int i=1;i<=n;i++){
            prefixSum+=i;
            if(prefixSum>n){
                System.out.println(i-1);
                break;

            }


        }
    }
}
