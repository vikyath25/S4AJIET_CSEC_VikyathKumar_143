import java.util.Scanner;
public class qr{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of a and b");
        a = s.nextInt();
        b = s.nextInt();
        System.out.println("Quotient : "+a/b);
        System.out.println("Remainder : "+a%b);
    }
}
