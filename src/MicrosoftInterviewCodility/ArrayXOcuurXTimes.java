package MicrosoftInterviewCodility;

import java.util.HashMap;
import java.util.Map;

public class ArrayXOcuurXTimes {

    public static void main(String[] args) {
//        int[] A = {1,1,3,4,4,4};
//        int[] A = {1,1,1,1,3,3,4,4,4,4,4};
//        int[] A = {10,10,10};
        int[] A = {1,2,2,2,5,5,5,8};
        System.out.print(getSum(A, A.length));
    }

    public static int abs(int k){
        return k < 0? -k : k;
    }

    public static int getSum(int a[], int n)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i < n; ++i){
            map.putIfAbsent(a[i], 0);
            map.put(a[i], map.get(a[i]) + 1);
        }
        int sum = 0 ;
        for(Integer key: map.keySet()){
            int actualNumber = key;
            int count = map.get(key);
            int diff = abs(count - actualNumber);


            sum+= count < diff ? count: diff;
        }
        return sum;
    }
}
