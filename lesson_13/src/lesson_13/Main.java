package lesson_13;

import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println();
		System.out.println("Натисніть 1, для добавання фракції в Раду");
		System.out.println("Натисніть 2, для видалення фракції з Ради");
		System.out.println("Натисніть 3, для виведення всіх фракцій в Раді");
		System.out.println("Натисніть 4, для видалити введенну фракцію");
		System.out.println("Натисніть 5, для виведення введенну фракцію");
		System.out.println("Натисніть 6, для додавання депутата в введену фракцію");
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