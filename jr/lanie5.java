

public class lanie5
{
    public static void main(String[] args){
     int[] numbers= {3,7,12,5,9};
     int target = 12;
     
     for(int i = 0; i < numbers.length; i++){
     if (numbers[i] == target){
         System.out.println("Found " + target + " at index" + i);
         break;         
     }
     }
}
}