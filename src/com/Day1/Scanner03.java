package com.Day1;

import java.util.Scanner;

/*
 * �Է� ����

3 ���� �Է��� �ֽ��ϴ�.

ù ��° �ٿ��� ���� �� ���� �˴ϴ�.
�� ��° �ٿ��� double�� ��� �ֽ��ϴ� .
�� ��° �ٿ��� ���ڿ��� ��� �ֽ��ϴ� .
��� ����

�� ���� ����� �ֽ��ϴ�.

ù ��° �࿡�� print ��� String:������ stdin���� ���� ���ڿ��� �н��ϴ�.
�� ��° �ٿ��� print Double:�� stdin���� ���� ���� double�� �д´�.
�� ��° �ٿ��� print Int:������ stdin���� ���� ������� ���� ���� ���ɴϴ�.

���� �Է�

42
3.1415
Welcome to HackerRank's Java tutorials!
���� ���

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
