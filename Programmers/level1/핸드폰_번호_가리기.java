package level1;

public class 핸드폰_번호_가리기 {

	public String solution(String phone_number) {
	     char [] phoneNum = phone_number.toCharArray();
	     for(int i = 0; i < phone_number.length() - 4; i++) {
	    	 phoneNum[i] = '*';
	     }
	     return String.valueOf(phoneNum);
	  }
	public static void main(String[] args) {
		String phone_number = "01076357181";
		핸드폰_번호_가리기 test = new 핸드폰_번호_가리기();
		System.out.println(test.solution(phone_number));
	}
}
