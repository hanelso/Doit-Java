package Chap02;

import java.util.Scanner;

/*CardConvRev에서 배열을 정방향으로 받는것...

r|	59
 +----------
2|	29 -> 1
 +----------
2|	14 -> 1
 +----------
2|	7 -> 0
 +----------
2|	3 -> 1
 +----------
2|	1 -> 1
 +----------
  	0 -> 1
  	
  	111011로 받기
 */
public class Question6 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];

		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수 : ");
				no = stdIn.nextInt();
			} while (no < 0); // 음수를 제외한 정수를 받도록...

			do {
				System.out.print("어떤 진수로 변환할까요? (2 ~ 36) : ");
				cd = stdIn.nextInt();
			} while (cd < 2 || cd > 36); // 2 ~ 36만 받도록...

			dno = cardConvR(no, cd, cno);

			System.out.print(cd + "진수로는 ");
			for (int i = 0; i < dno; i++)
				System.out.print(cno[i]);
			System.out.println("입니다.");

			System.out.print("한 번 더 할까요? (1.예/0.아니요); : ");
			retry = stdIn.nextInt();
		} while (retry == 1);

		stdIn.close();
	}

	static int cardConvR(int x, int r, char[] d) {

		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			for (int i = digits; i >= 0; i--) {
				d[i + 1] = d[i];
			}
			d[0] = dchar.charAt(x % r);
			x /= r;
			digits++;
		} while (x != 0);

		return digits;
	}
}
