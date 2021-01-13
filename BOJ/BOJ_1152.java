import java.util.Scanner;

public class BOJ_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(" ");

        int result = strArr.length;
        for(int i = 0 ; i < strArr.length; i++) {
            if(strArr[i].equals("")) {
                result--;
            }
        }
        System.out.println(result);
    }
}
