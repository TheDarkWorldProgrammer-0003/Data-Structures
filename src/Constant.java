public class Constant {
    public static void main(String agrs[]){
        int[] arr = new int[]{1,2,3,4,5};
        arr [0]= arr[0]+10;  // Time C.->O(1)
        int num = arr[arr.length-1]; //S.C - int (4 bytes) -> O(1)
        System.out.println(arr[0]); // Time.C -> O(1)

        // O(1) +O(1)=O()-> O(1) // Constant Time Complexity
        // O(4 bytes) = O(1) // Constant space Complexity

    }
}
