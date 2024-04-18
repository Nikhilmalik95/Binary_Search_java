/**
 * BinarySearch
 * Time complexity :- O(log n)
 */
import java.util.Scanner;

public class BinarySearch {

    public static Boolean binarySearch(int[] arr , int key){

        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        
        while (start<=end) {
            if(arr[mid] == key){
                System.out.println("Index of value is "+ mid);
                return true;
            }else if(arr[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }

            mid = (start+end)/2;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 5 , 7 , 10};
        Scanner sc = new Scanner(System.in);
        int key = Integer.parseInt(sc.nextLine());
        System.out.println(key);
        sc.close();
        if(binarySearch(arr , key)){
            System.out.print("value present");
        }else{
            System.out.print("Value not present");
        }
    }
}