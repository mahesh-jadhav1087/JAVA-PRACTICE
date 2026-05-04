// program to calculate the sum of all elements in an array.


public class sumofarr {
    public static void main(String[] args) {
        
        // declare array with values 
        int[] arr={10,20,30,40,50};

        // Declare sum variable for strore sum of array

        int sum=0;
        for (int i = 0; i < arr.length; i++) {

            sum=sum+arr[i];
        }

        // Display sum of array
        System.out.println("Sum of Array:- "+sum);
    }
    
}
