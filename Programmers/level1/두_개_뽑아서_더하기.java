package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class 두_개_뽑아서_더하기 {
	public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet();
        
        for(int i = 0; i < numbers.length - 1; i++) {
        	for(int j = i + 1; j < numbers.length; j++) {
        		set.add(numbers[i] + numbers[j]);
        	}
        }
        int[] answer = new int[set.size()];
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
	public static void main(String[] args) {
		
	}
}
