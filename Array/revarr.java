public class revarr
{
    public static void main(String []MJ)
    {
        int []arr={1,2,3,4,5};

        int s=0;
        int e=(arr.length-1);

        while(s<e)
        {
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;

        }
        for (int num: arr)
        {
            System.out.println(num);
        }
    }
}




















// public class revarr
// {
//     public static void main(String[] args) {
        
//         int[] arr={0,2,0,3,12};

//         int j=0; 
//         for(int i=0; i<arr.length; i++)
//         {
//             if(arr[i] !=0)
//             {
//                 int temp=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;
//                 j++;

//             }



//         }

//         for(int num:arr)
//         {
//             System.out.println(num);
//         }
//     }
// }