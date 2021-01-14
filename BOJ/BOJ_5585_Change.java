import java.util.Scanner;

public class BOJ_5585_Change {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money = 1000 - scanner.nextInt();
		int currency[] = { 500, 100, 50, 10, 5, 1 };
		int count = 0;
		
		for (int i = 0; i < currency.length; i++) {
			count += money / currency[i];
			money %= currency[i];
			
			if(money == 0) {
				System.out.println(count);
				break;
			}
		}
	}

}
