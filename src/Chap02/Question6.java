package Chap02;

import java.util.Scanner;

/*CardConvRev���� �迭�� ���������� �޴°�...

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
  	
  	111011�� �ޱ�
 */
public class Question6 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];

		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ���� : ");
				no = stdIn.nextInt();
			} while (no < 0); // ������ ������ ������ �޵���...

			do {
				System.out.print("� ������ ��ȯ�ұ��? (2 ~ 36) : ");
				cd = stdIn.nextInt();
			} while (cd < 2 || cd > 36); // 2 ~ 36�� �޵���...

			dno = cardConvR(no, cd, cno);

			System.out.print(cd + "�����δ� ");
			for (int i = 0; i < dno; i++)
				System.out.print(cno[i]);
			System.out.println("�Դϴ�.");

			System.out.print("�� �� �� �ұ��? (1.��/0.�ƴϿ�); : ");
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