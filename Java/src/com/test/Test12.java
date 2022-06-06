//import java.io.*;
//import java.util.*;
//
//
//public class TestClass {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter wr = new PrintWriter(System.out);
//        int T = Integer.parseInt(br.readLine().trim());
//        for(int t_i = 0; t_i < T; t_i++)
//        {
//
//            String[] str = br.readLine().split(" ");
//            int l = Integer.parseInt(str[0]);
//            int r = Integer.parseInt(str[1]);
//
//            long out_ = solve(l, r);
//            System.out.println(out_);
//
//        }
//
//        wr.close();
//        br.close();
//    }
//
//    static int sumDigitSquare(int n){
//        int sq=0;
//        while(n > 0){
//            int digit = n % 10;
//            sq+= digit * digit;
//            n=n/10;
//        }
//        return sq;
//    }
//
//    static boolean isBeautiful(int n){
//        HashSet<Integer> s= new HashSet<>();
//        s.add(n);
//        while(true){
//            if(n==1){
//                return true;
//            }
//            n= sumDigitSquare(n);
//            if((s.contains(n) && n != (int) s.toArray()[s.size()-1])){
//                return false;
//            }
//            s.add(n);
//        }
//
//    }
//
//    static long solve(int l, int r){
//        // Your code goes here
//        int i;
//        long sum=0;
//        for (i=l;i<=r;i++){
//            if(isBeautiful(i)){
//                sum+=i;
//            }
//        }
//        return sum;
//    }
//
//
//}


/*
 * Click `Run` to execute the snippet below!
 */
//
//import java.io.*;
//import java.util.*;
//
///*
// * To execute Java, please define "static void main" on a class
// * named Solution.
// *
// * If you need more classes, simply define them inline.
//
// Given an unsorted integer array containing many duplicate elements, rearrange it such that the same element appears together and the relative order of the first occurrence of each element remains unchanged.
// Example :
//  Input:  { 5, 4, 5, 5, 3, 1, 2, 2, 4 }
//Output: { 5, 5, 5, 4, 4, 3, 1, 6,2, 2 }
//
// */
//
//class Solution {
//    public static void main(String[] args) {
//        int[] input = new int[]{6, 5, 4, 5, 5, 3, 1, 2, 2, 4 , 6};
//        Map<Integer, Integer> map = new LinkedHashMap<>();
//        int[] result = new int[input.length];
//        int k=0;
//        for (int i=0; i< input.length; i++){
//            if(map.containsKey(input[i])){
//                map.put(input[i], map.get(input[i])+ 1);
//            } else {
//                map.put(input[i], 1);
//            }
//        }
//        for(Map.Entry entry: map.entrySet()){
//            for(int i =0;i < (int) entry.getValue(); i++){
//                result[k] = (int) entry.getKey();
//                k++;
//            }
//        }
//        for (int i=0; i< input.length; i++){
//            System.out.print(result[i]+" ");
//        }
//    }
//}
// Your previous Plain Text content is preserved below:

// This is just a simple shared plaintext pad, with no execution capabilities.

// When you know what language you'd like to use for your interview,
// simply choose it from the dropdown in the top bar.

// You can also change the default language your pads are created with
// in your account settings: https://app.coderpad.io/settings

// Enjoy your interview!



