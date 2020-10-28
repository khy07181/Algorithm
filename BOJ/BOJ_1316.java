import java.util.Scanner;

public class BOJ_1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = N;
		
		for (int i = 0; i < N; i++) {
			String word = sc.next();
			boolean[] check = new boolean[26];

			check[word.charAt(0) - 'a'] = true;

			for (int j = 1; j < word.length(); j++) {
				if (word.charAt(j) == word.charAt(j - 1)) {
					continue;
				} else {
					if(check[word.charAt(j) - 'a'] == true) {
						result--;
						break;
					} else {
						check[word.charAt(j) - 'a'] = true;
					}
					
				}
			}
		}
		System.out.println(result);
	}
}
