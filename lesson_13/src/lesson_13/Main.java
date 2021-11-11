package lesson_13;

import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println();
		System.out.println("�������� 1, ��� ��������� ������� � ����");
		System.out.println("�������� 2, ��� ��������� ������� � ����");
		System.out.println("�������� 3, ��� ��������� ��� ������� � ���");
		System.out.println("�������� 4, ��� �������� �������� �������");
		System.out.println("�������� 5, ��� ��������� �������� �������");
		System.out.println("�������� 6, ��� ��������� �������� � ������� �������");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();
			switch (sc.nextInt()) {
			case 1: {
				Rada.getInstance().addFraction();
				break;
			}

			case 2: {
				Rada.getInstance().removeAllFraction();
				break;
			}

			case 3: {
				Rada.getInstance().showAllFraction();
				break;
			}

			case 4: {
				Rada.getInstance().removeFraction();
				break;
			}

			case 5: {
				Rada.getInstance().showFraction();
				break;
			}

			case 6: {
				Rada.getInstance().addSenatortoFraction();
				break;
			}
			}
		}
	}
}