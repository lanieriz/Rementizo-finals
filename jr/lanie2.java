
/**
 * Write a description of class lanie2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lanie2
{
    public static void main(String[] args){
        int numbers[]={1,3,5,7,5,3,7,2,7,2};
        int count=0;
        System.out.println("list of Array\n");
        for(int i=0;i<numbers.length; i++){
            if(numbers[i]==7){
                count++;
            }
            System.out.print(numbers[i]+", ");
        }
        System.out.print("\n\nThe count of numbers 7 in array is "+count);
    }
}    