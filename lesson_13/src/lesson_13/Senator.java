package lesson_13;

import java.util.Scanner;

public class Senator extends Human{
	
	private String name;
	private String surname;
	private int age;
	private boolean bribe_taker;
	private int bribe;
	
	
	public Senator(double weight, double height, String name, String surname, int age, boolean bribe_taker) {
		super(weight, height);
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.bribe_taker = bribe_taker;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public boolean isBribe_taker() {
		return bribe_taker;
	}
	public String bribe_takerToString() {
		if (this.bribe_taker) {
			return "хабарник";
		} else { return "не хабарник";
		}
	}

	public void setBribe_taker(boolean bribe_taker) {
		this.bribe_taker = bribe_taker;
	}


	public int getBribe() {
		return bribe;
	}


	public void setBribe(int bribe) {
		this.bribe = bribe;
	}

	public void bribe_action() {
		if (this.bribe_taker == false) {
			System.out.println(" Цей депутат не бере хабарів або мало дали.");
		}
		if (this.bribe_taker == true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Введіть суму хабаря");
			int money = scanner.nextInt();
			if (money >= 5000) {
				System.out.println("Поліція ув'язнить депутата");}
			if (money < 5000) {
				this.bribe = money;
			}
			}
		} 
		
	@Override
	public String toString() {
		return "Senator [name=" + name + ", surname=" + surname + ", age=" + age + ", bribe_taker=" + bribe_taker
				+ ", bribe=" + bribe + "]";
	}
	
}
