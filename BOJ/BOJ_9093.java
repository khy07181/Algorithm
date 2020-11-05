import java.util.Scanner;

public class BOJ_9093 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < T; i++) {
			String str = sc.nextLine();
			String[] strArr = str.split(" ");
			String str2 = "";
			
			for (int j = 0; j < strArr.length; j++) {
				StringBuffer strBuf = new StringBuffer();
				strBuf.append(strArr[j]);
				str2 += strBuf.reverse();
				str2 += " "; 
			}
			System.out.println(str2);
		}
	}
}
