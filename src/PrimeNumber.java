import java.util.*;
public class PrimeNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean bool=false;
//         O(n)
//        for(int i=2;i<num;i++){
//            if(num%i==0){
//                bool=true;
//                break;
//            }
//        }

//        O(n/2)
//        for(int i=2;i<(num/2);i++){
//            if(num%i==0){
//                bool=true;
//                break;
//            }
//        }

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
