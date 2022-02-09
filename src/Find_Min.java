public class Find_Min {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,0};
        int i = Min(arr);
        System.out.println("The smallest element in the array is: " + arr[i]);
    }

    public static int Min(int[] array){
        int i = 0;
        for (int j = 0 ; j < array.length ; j++ ){
            if (array[j] < array[i]){
                i = j;
            }
        }
        return i;
    }
}
