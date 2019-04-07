package com.Day1;

import java.util.Scanner;

/*
 * 입력 형식

3 줄의 입력이 있습니다.

첫 번째 줄에는 정수 가 포함 됩니다.
두 번째 줄에는 double이 들어 있습니다 .
세 번째 줄에는 문자열이 들어 있습니다 .
출력 형식

세 가지 출력이 있습니다.

첫 번째 행에서 print 명령 String:다음에 stdin에서 읽은 문자열을 읽습니다.
두 번째 줄에는 print Double:와 stdin에서 읽지 않은 double을 읽는다.
세 번째 줄에는 print Int:다음에 stdin에서 읽은 변경되지 않은 정수 가옵니다.

샘플 입력

42
3.1415
Welcome to HackerRank's Java tutorials!
샘플 출력

String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
 */

public class Scanner03 {

	public static void main(String[] args) {		
		 
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();
        
        if(scan.hasNextLine() || s.isEmpty()){
            s = scan.nextLine();
        }

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
	}
}
