//import java.util.*;
//
//class Solution {
//    public int[] solution(int[] temps){
//        int[] ans = new int[temps.length];
//        Deque<Integer> stack = new Stack<>();
//
//        for(int day =0; day < temps.length; day++){
//            while(!stack.isEmpty() && temps[stack.peek()] < temps[day]){
//                int prevDay = stack.pop();
//                ans[prevDay] = day - prevDay;
//            }
//            stack.push(day);
//        }
//        return ans;
//    }
//}