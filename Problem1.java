import java.util.ArrayList;
public class Problem1 {
   
    
    public static void main(String[] args){
        
        // Initialize a new ArrayList using Java's built in ArrayList Library.
        ArrayList listOfNumbers = new ArrayList<>();
        
        // Create sum variable to hold final answer.
        int sum = 0;
        
        // Loop through all numbers 0 through 999, pick out numbers that are divisible by 3 or 5 using % modulo.
        // If divisible by 3 or 5, add to ArrayList to use later
        for (int i = 0; i < 1000; i++) {
            if((i % 3 ==0) || (i % 5 == 0))
            {
                listOfNumbers.add(i);
            }
        }
        
        // Second loop, go through the list that we generated of numbers that are divisible by 3 or 5 and sum all up.
        for (int i = 0; i < listOfNumbers.size(); i++) {
            sum += (int) listOfNumbers.get(i);
        }
        
        // Display final sum.
        System.out.println("Sum is " + sum);
    }
    
}
