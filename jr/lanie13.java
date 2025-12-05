
public class lanie13
{
     public static void main(String[] args) {
      int[] grades = {80,72, 95, 60, 88, 74, 90};
      int passed = 0, failed = 0;
     
      for (int grade : grades){
         if (grade >= 75) {
              passed++;
      } else {
      failed++;
     }
}
System.out.println("Passed: " + passed);
System.out.println("Failed: " + failed);
}  
} 