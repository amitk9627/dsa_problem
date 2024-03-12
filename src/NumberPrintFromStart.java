import java.util.Scanner;
public class NumberPrintFromStart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int digit=0;
        while(temp!=0){
            digit++;
            temp=temp/10;
        }
        while(digit>0){
            int d=(int)Math.pow(10,digit-1);
            System.out.println(num/d);
            num=num%d;
            digit--;
        }
    }
}
