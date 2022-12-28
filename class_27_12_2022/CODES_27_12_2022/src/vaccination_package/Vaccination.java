package vaccination_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

abstract class Vaccine {
	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in)); 
	Scanner sc2 =new Scanner(System.in);
	String citizen, name;
	int age, price;

	public void firstDose() throws IOException {
		System.out.println("Name: ");	
		name = sc.readLine();
		System.out.println("Citizenship: ");
		citizen = sc.readLine();

		if (citizen.equalsIgnoreCase("Indian")) {
			System.out.println("AGE: ");
			age = sc2.nextInt();
			if (age >= 18) {
				System.out.println("Enter the price: ");
				price = sc2.nextInt();
				if (price == 250) {
					System.out.println("First dose vaccinated succesfully.");
				} else {
					System.out.println("Amount Should be 250.");
				}

			} else {
				System.out.println("Age must be above 18.");
			}
		} else {
			System.out.println("Only of Indian cityzen.");
		}
	}

	public void secendDose() throws IOException {
		System.out.println("First does done: y/n");
		char c = sc2.next().charAt(0);
		if ((c == 'y') || (c == 'Y')) {
			System.out.println("Has it been 90 days since your first dose.");
			c = sc2.next().charAt(0);
			if ((c == 'y') || (c == 'Y')) {
				System.out.println("Name: ");
				name = sc.readLine();
				System.out.println("Citizenship: ");
				citizen = sc.readLine();

				if (citizen.equalsIgnoreCase("Indian")) {
					System.out.println("AGE: ");
					age = sc2.nextInt();
					if (age >= 18) {
						System.out.println("Enter the price: ");
						price = sc2.nextInt();
						if (price == 250) {
							System.out.println("Second dose vaccinated succesfully.");
						} else {
							System.out.println("Amount Should be 250.");
						}

					} else {
						System.out.println("Age must be above 18.");
					}
				} else {
					System.out.println("Only of Indian cityzen.");
				}
			} else {
				System.out.println("Plese come after 90 days after first dose.");
			}

		} else {
			System.out.println("Plese recive the first dose and come.");
		}
	}

	abstract public void booster();

}

class VaccinationSuccess extends Vaccine {

	@Override
	public void booster() {

		System.out.println("First does and Second both done? : y/n");
		char c = sc2.next().charAt(0);
		if ((c == 'y') || (c == 'Y')) {
			System.out.println("Has it been 180 days since your Second dose.");
			c = sc2.next().charAt(0);
			if ((c == 'y') || (c == 'Y')) {
//				sc.nextLine();
				System.out.println("Name: ");
				try {
					name = sc.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Citizenship: ");
				try {
					citizen = sc.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (citizen.equalsIgnoreCase("Indian")) {
					System.out.println("AGE: ");
					age = sc2.nextInt();
					if (age >= 18) {
						System.out.println("Enter the price: ");
						price = sc2.nextInt();
						if (price == 250) {
							System.out.println("Booster dose vaccinated succesfully.");
						} else {
							System.out.println("Amount Should be 250.");
						}

					} else {
						System.out.println("Age must be above 18.");
					}
				} else {
					System.out.println("Only of Indian cityzen.");
				}
			} else {
				System.out.println("Plese come after 180 days after Seconde dose.");
			}

		} else {
			System.out.println("Plese recive the first dose and come.");
		}

	}

}

public class Vaccination {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		VaccinationSuccess vac = new VaccinationSuccess();

		do {
			System.out.println("Welcome to covid 19 vaccination center...");
			System.out.println(
					"Press 1 for first dose.\nPress 2 for second dose. \nPress 3 for booster. \nPress 4 to exit.");
			int c = sc.nextInt();

			switch (c) {
			case 1: {
				vac.firstDose();
				break;
			}

			case 2: {
				vac.secendDose();
				break;
			}
			case 3: {
				vac.booster();
				break;
			}
			case 4: {
				System.out.println("System exited.");
				System.exit(0);
			}
			default: {
				System.out.println("Invalid input try again!");
			}

			}

		} while (true);

	}

}
