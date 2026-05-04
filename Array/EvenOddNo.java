//Java program to display even & odd values from an array.

// class EvenOddNo {
//     public static void main(String[] args) {

//         int[] arr = {11, 20, 33, 42, 55, 60};

//         System.out.print("Even Values = ");
//         for (int num : arr) {
//             if (num % 2 == 0)
//                 System.out.print(num + " ");
//         }

//         System.out.print("\nOdd Values = ");
//         for (int num : arr) {
//             if (num % 2 != 0)
//                 System.out.print(num + " ");
//         }
//     }
// }




//Java program to display even & odd index values from an array.

class EvenOddNo {
    public static void main(String[] args) {

        int[] arr = {5 ,10, 15 ,20, 25, 30};

        System.out.print("Values at Even Index= ");
        for (int i=0; i<arr.length; i++) {
            if (i % 2 == 0)
                System.out.print(arr[i] + " ");
        }

        System.out.print("\n Values at Odd Index = ");
        for (int i=0; i<arr.length; i++) {
            if (i % 2 != 0)
                System.out.print(arr[i] + " ");
        }
    }
}