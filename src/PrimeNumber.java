import java.util.*;
public class PrimeNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean bool=false;
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                bool=true;
                break;
            }
        }
        if(bool){
            System.out.print("not prime number");
        }else{
            System.out.print("prime number");
        }
    }
}
