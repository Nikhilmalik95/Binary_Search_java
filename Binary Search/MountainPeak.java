public class MountainPeak {
    
    static void peak(int [] arr){
        int size = arr.length-1;

        int s = 0;
        int e = size;
        int mid = s +(e-s)/2;

        while (s<e) {
            if(arr[mid] < arr[mid+1]){
                s = mid+1;
            }else{
                e = mid;
            }

            mid = s + (e-s)/2;
        }

        System.out.println("peak is : " + s);

    }
    public static void main(String[] args) {
        int [] arr = {1 , 2 , 3 , 4, 3, 2, 1};

        peak(arr);
    }
}
