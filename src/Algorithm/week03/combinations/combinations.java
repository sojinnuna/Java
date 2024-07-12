package Algorithm.week03.combinations;

//모든걸 우선 import해옴
import java.util.*;

public class combinations {
//    정수 n, k 값을 가져옴
    public List<List<Integer>> combin(int n, int k){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, k, new ArrayList<>(), result);
        return result;
    }
    private void backtrack(int start, int k, List<Integer> curr, List<List<Integer>> result){
        //basecase
        if(curr.size() == k){
            result.add(new ArrayList<>(curr));
            return;
        }

        //recursive call
        for(int i = start; i <= n; i++){
            curr.add(i);
            backtrack(i+1, k, curr, result);
//            가장 마지막에 넣은 것을 빼려면? path.size()-1
            curr.remove(curr.size()-1);
        }
    }

    public static void main(String[] args) {
        combinations combinations = new combinations();

    }
}
