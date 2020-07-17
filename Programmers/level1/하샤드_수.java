package level1;

public class 하샤드_수 {
	public static boolean solution(int x) {
        boolean answer = true;
        int temp = x;
        int hap = 0;
        while(temp / 10 != 0) {
        	int rem = temp%10;
        	hap += rem;
        	temp /= 10;
        }
        hap += temp;
        
        if(x % hap != 0) {
        	answer = false;
        }
        return answer;
    }
	public static void main(String[] args) {
		int x = 18;
		하샤드_수 test = new 하샤드_수();
		System.out.println(test.solution(x));
	}
}
