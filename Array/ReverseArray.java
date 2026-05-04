// java program to display the reverse array.


class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] rev = new int[arr.length];

        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            rev[j] = arr[i];
            j++;
        }

        System.out.print("Reverse array = { ");
        for (int num : rev) {
            System.out.print(num + " ");
        }
        System.out.println("}");
    }
}