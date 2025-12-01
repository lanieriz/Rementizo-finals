
/**
 * Write a description of class lanie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class lanie
{
    public static void main(String[] args){
          Scanner input = new Scanner (System.in);
          
          while(true){
                  System.out.println("please input a number Between (1 to 100): ");
                  int userInput=input.nextInt();
                  if(userInput>=1 && userInput<=100){
                      break;
                  }
          }
    }
}