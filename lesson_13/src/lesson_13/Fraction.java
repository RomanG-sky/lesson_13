package lesson_13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Fraction {

	private String Fraction;

	public Fraction(String fraction) {
		super();
		Fraction = fraction;

	}

	public String getFraction() {
		return Fraction;
	}

	public void setFraction(String fraction) {
		Fraction = fraction;
	}

	ArrayList<Senator> GGG = new ArrayList<Senator>();

	public void addSenator() {

		Scanner sc = new Scanner(System.in);
		System.out.println("������ ��'� ��������");
		String name = sc.next();

		Scanner sca = new Scanner(System.in);
		System.out.println("������ ������� ��������");
		String surname = sca.next();

		Scanner scan = new Scanner(System.in);
		System.out.println("������ �� ��������");
		int age = scan.nextInt();

		Scanner scann = new Scanner(System.in);
		System.out.println("������ ���� ��������");
		double weight = scann.nextDouble();

		Scanner scanne = new Scanner(System.in);
		System.out.println("������ ���� ��������");
		double height = scanne.nextDouble();

		Scanner scanner = new Scanner(System.in);
		System.out.println("�� ����� �������� �������� (true/false)");
		boolean bribe_taker = scanner.nextBoolean();

		Senator senator = new Senator(weight, height, name, surname, age, bribe_taker);
		GGG.add(senator);
		System.out.println("�������" + senator.toString() + "������� � �������" + getFraction());
	}

	public void removeSenator() {

		Scanner scanner1 = new Scanner(System.in);
		System.out.println("������ ��'� ��������");
		String name = scanner1.next();

		Scanner scanner2 = new Scanner(System.in);
		System.out.println("������ ������� ��������");
		String surname = scanner2.next();

		if (GGG.contains(name) && GGG.contains(surname)) {
			if (true) {

				Iterator<Senator> iterator = GGG.iterator();
				while (iterator.hasNext()) {
					Senator XSenator = iterator.next();
					if (XSenator.getName().equalsIgnoreCase(name) && XSenator.getSurname().equalsIgnoreCase(surname))
						;
					{
						iterator.remove();
						System.out.println("�������� �e����� ��������� �� �������.");
					}
				}
			} else {
				System.out.println("�������� �e����� �� ���������.");
			}
		}
	}

	public void BribeSenator() {
		Iterator<Senator> iterator = GGG.iterator();
		while (iterator.hasNext()) {
			Senator XSenator = iterator.next();
			if (XSenator.isBribe_taker()) {
				if (true) {
					System.out.println("�e������ �� ������ �����" + XSenator.toString());
				}
				if (false) {
					System.out.println("�e������ � ��� ����");
				}
			}
		}
	}

	public void BribeMaxSenator() {
		int bribe = 0;
		int senatori = -1;

		for (int i = 0; i < GGG.size(); i++) {
			if (GGG.get(i).isBribe_taker()) {
				if (GGG.get(i).getBribe() > bribe) {
					bribe = GGG.get(i).getBribe();
					senatori = GGG.indexOf(GGG.get(i));
				}
			}
		}

		if (senatori >= 0) {
			System.out.println("����������� #1:" + GGG.get(senatori).toString());
		} else {
			System.out.println("�e������ � ��� ����");
		}
	}

	public void AllSenators() {
		System.out.println("�� �������� �������:");
		for (Senator senator : GGG) {
			System.out.println(senator.toString());
		}
	}

	public void RemoveSenators() {
		GGG.clear();
		System.out.println("�� �������� ���������");

	}

	@Override
	public String toString() {
		return "Fraction [Fraction=" + Fraction + ", GGG=" + GGG + "]";
	}

}
