public class Logaritm {
    public static void main(String args[]){
        int arr [] = new int[]{2,4,60,7,40};

        var startTime = System.nanoTime();
//        Task- To find 40 in the given array
        for (int i = 0; i< arr.length;i++){ // T.C -> O(n)
            if (arr[i] == 40){
                System.out.println("Found 40 at index " + i);

            }
        }
        var endTime = System.nanoTime();
        System.out.println("Linear Search took " + (endTime-startTime));

        int start = 0;
        int end = arr.length-1;
        startTime = System.nanoTime();
         while (start<=end){
             int mid =(start+end)/2;
             while (start<=end){
                 if(arr[mid]== 40){
                     System.out.println(" (B.S) Found 40 at index " +mid);
                 } else if (arr[mid] < 40) {
                     start= mid +1;
                 }
                 else {
                     end = end-1;
                 }
             }
             endTime = System.nanoTime();
             System.out.println("Binary Search took " + (endTime-startTime));

         }



    }
}
