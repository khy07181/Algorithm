package level2;

import java.util.PriorityQueue;

public class 더_맵게 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int temp : scoville) {
            heap.add(temp);
        }

        while (heap.peek() < K) {
            if (heap.size() == 1) {
                answer = -1;
                break;
            }
            heap.add(heap.poll() + 2 * heap.poll());
            answer++;
        }
        return answer;
    }
}
