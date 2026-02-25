package DigitalCom_ass;

import java.util.List;
import java.util.Scanner;

public class DigitalcomProcess {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		User u = new User();
		GameService gs = new GameService();

		while (true) {

			System.out.println("\nMain Menu - Choices");
			System.out.println("1) RegisterUser");
			System.out.println("2) Login");
			System.out.println("3) Exit");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter UserID and Password:");

				u.addUser(sc.next(), sc.next());
				System.out.println("User Registered Successfully!");
				break;

			case 2:
				System.out.println("Enter UserID and Password:");

				if (u.isAuthenticated(sc.next(), sc.next())) {

					while (true) {
						System.out.println("1) ViewGames");
						System.out.println("2) searchByName");
						System.out.println("3) Exit");
						int ch = sc.nextInt();

						switch (ch) {
						case 1:
							List<Game> games = gs.viewAll();

							for (Game g : games) {
								System.out.println(g);
							}
							break;
						case 2:
							System.out.println("Enter author name:");
							String author = sc.next();

							String gameName = gs.AuthorSearch(author);
							System.out.println(gameName);
							break;
						case 3:
							System.out.println("Exiting...");
							sc.close();
							System.exit(0);
						default:
							System.out.println("Invalid choice!");
						}
					}

				} else {
					System.out.println("Invalid Credentials!");
				}
				break;

			case 3:
				System.out.println("Exiting...");
				sc.close();
				System.exit(0);

			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}