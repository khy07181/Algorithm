import java.util.Scanner;

public class BOJ_1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strNum = "";

        while (true) {
            strNum = sc.nextLine();
            if (strNum.equals("0")) {
                break;
            }
            int num = Integer.valueOf(strNum);
            StringBuffer sb = new StringBuffer();
            sb.append(strNum);
            int num2 = Integer.valueOf(String.valueOf(sb.reverse()));
            if (num == num2) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
