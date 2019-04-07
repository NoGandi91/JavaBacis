package com.Day1;
/*1~100사이의 정수 입력
Weird출력 = 홀수 or 6<=a<=20
Not Werid출력 = 짝수이고, a>=2 a<=5, a>20
*/

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("1~100사이의 숫자입력:");
		int a = sc.nextInt();

		if (a % 2 == 1 || a>=6 && a<=20) {
            System.out.println("Weird");
        }else if(a %2 ==0 && a>=2 && a<=5 || a>20) {
            System.out.println("Not Weird");
        }

	}

}
