
import java.util.HashMap;

public class highestFrequency{
    // void frequency(int arr[]){
    //     HashMap<Integer><Integer> hm= new HashMap<Integer><Integer>();
    //     for(int i=0; i<arr.length; i++){
    //         if(hm.key()!=arr[i]){

    //         }
    //     }
    // }
    public static void main(String[] args){
        int maxi=0;
        int index=-1;
        int arr[]= {1,2,6,9,2,7,9,5,9};
        int temp[]= new int[arr.length+1];
        for(int i=0; i<arr.length; i++){
            temp[arr[i]]++;
            if(maxi<temp[arr[i]]){
                maxi=temp[arr[i]];
                index=arr[i];
            }
        }
        // for(int i=0; i<arr.length+1; i++){
        //     // maxi=Math.max(maxi,temp[i]);
        //     if(maxi<temp[i]){
        //         maxi=temp[i];
        //         index=i;
        //     }
        // }
        System.out.println(index);
    }
}