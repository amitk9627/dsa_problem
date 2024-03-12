import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=2;i*i<num;i++){
            while(num%i==0){
                System.out.println(i);
                num=num/i;
            }
        }
        if(num!=1){
            System.out.println(num);
        }
        sc.close();
    }
}
