
import java.util.Scanner;
public class lanie15
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int[] numbers = new int[5];
            
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
  
        
            System.out.println("Numbers greater than 50:");
        for (int num : numbers) { 
            if (num > 50) {
                System.out.println(num);
            }
}
}
}
}