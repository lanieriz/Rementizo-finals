
import java.util.Scanner;
public class lanie9
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;
        
        System.out.print("Enter numbers (0 to stop):");
        
        while (true){ 
            num = sc.nextInt();
            if(num == 0){
                break;
                
            }
            sum  += num;
    }
    System.out.println("Sum = " + sum);
}
}