package Algorithm;

import java.util.ArrayList;
import java.util.List;
// 필생메 ??

class Solution{
    //nums를 넘겨줘야함
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // 마지막으로 방문을 기록하는 불린 리스트 생성*
        boolean[] visited = new boolean[nums.length];
        backtrack(new ArrayList<>(), nums, visited, result);
        return result;
    }

    //순열을 만들어서 result에 추가하는 함수
    void backtrack(List<Integer> curr, int[] nums, boolean[] visited, List<List<Integer>> result){
        //database
        if(curr.size() == nums.length){
//            왜 새로 만드나요?
            result.add(new ArrayList<>(curr));
            return;
        }

        //recursive call
        for(int i = 0; i < nums.length; i++){
            if(visited[i]) continue; //추가

            curr.add(nums[i]); // 추가
            visited[i] = true;
            backtrack(curr, nums, visited, result);
            curr.remove(curr.size() - 1);
            visited[i] = false; // 뽑은 값은 제외 → 어디서 삭제할거야? → 새로운 리스트 생성*
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
    }
}

