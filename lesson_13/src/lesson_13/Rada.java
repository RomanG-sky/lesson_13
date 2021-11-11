package lesson_13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Rada {

	private static volatile Rada instance;

	private Rada() {
	}

	public static Rada getInstance() {
		if (instance == null)
			synchronized (Rada.class) {
				if (instance == null)
					instance = new Rada();
			}

		return instance;
	}

	ArrayList<Fraction> Rada = new ArrayList<Fraction>();

	public void addFraction() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть назву фракції");
		String FractionName = scanner.next();
		Fraction fraction = new Fraction(FractionName);
		Rada.add(fraction);
		System.out.println("Нова фракція" + fraction.toString() + "створена");
	}

	public void removeAllFraction() {

		Rada.removeAll(Rada);
		System.out.println("Усі фракції ради видалені.");
	}

	public void removeFraction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть назву фракції");
		String FractionName = scanner.next();

		Iterator<Fraction> iterator = Rada.iterator();

		while (iterator.hasNext()) {
			Fraction nextFraction = iterator.next();

			if (nextFraction.getFraction().equalsIgnoreCase(FractionName)) {
				iterator.remove();
				System.out.println(nextFraction.toString() + " фракція видалена із Верховной Ради!");
			}

			else {
				System.out.println("Введеної фракції не існує!");
			}
		}
	}

	public void showAllFraction() {
		System.out.println("В раді присутні такі фракції:");
		for (Fraction fraction : Rada) {
			System.out.println(fraction.toString());
		}
	}

	public void showFraction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть назву фракції");
		String FractionName = scanner.next();
		Iterator<Fraction> iterator = Rada.iterator();

		while (iterator.hasNext()) {
			Fraction nextFraction = iterator.next();

		
				for(Fraction fr : Rada) {
					if (nextFraction.getFraction().equalsIgnoreCase(FractionName)) {
						System.out.println("Введена фракція включає:" + nextFraction.toString());
						fr.AllSenators();
				}
			}
		}
	}
				
	public void addSenatortoFraction() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть назву фракції");
		String FractionName = scanner.next();
		Iterator<Fraction> iterator = Rada.iterator();

		while (iterator.hasNext()) {
			Fraction nextFraction = iterator.next();

			if (nextFraction.getFraction().equalsIgnoreCase(FractionName)) {
				for (Fraction fraction : Rada) {
					fraction.addSenator();
				}
			} else {
				System.out.println("Введеної фракції не існує!");
			}
		}
	}

}
