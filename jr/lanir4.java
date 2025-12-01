
/**
 * Write a description of class lanir4 here.
 *
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lanir4
{
    public static void main(String[] args){
          int numbers[]={34,43,2,6,3,76,73,45,54,89,52};
          int smallest=0;
          int largest=0;
          for(int i=0;i<numbers.length;i++){
              
              if(numbers[i]<smallest){
                  smallest=numbers[i];
              }
              if(numbers[i]>largest){
                  largest=numbers[i];
              }
          }
          System.out.println("Smallest: "+smallest);
          System.out.println("largest: "+largest);
    }
}