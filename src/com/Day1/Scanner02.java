package com.Day1;
/*1~100������ ���� �Է�
Weird��� = Ȧ�� or 6<=a<=20
Not Werid��� = ¦���̰�, a>=2 a<=5, a>20
*/

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("1~100������ �����Է�:");
		int a = sc.nextInt();

		if (a % 2 == 1 || a>=6 && a<=20) {
            System.out.println("Weird");
        }else if(a %2 ==0 && a>=2 && a<=5 || a>20) {
            System.out.println("Not Weird");
        }

	}

}
