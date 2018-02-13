import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class BaseAlimentaire {

	// private static Scanner console = new Scanner(System.in);
	static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// * Mini application de base de donnée alimentaire
		System.out.println("Bonjour et bienvenue dans l'application de base de donnée des aliments");
		// Création de l'objet Scanner qui permet de lire les entrées clavier depuis la
		// console.
		Scanner scanner = new Scanner(System.in);
		String menuChoice;
		do {
			// Affichage du menu dans la console.
			System.out.println("------------------- Menu -------------------");
			System.out.println("1) Rentrer un nouvel aliment");
			System.out.println("2) Supprimer un aliment");
			System.out.println("3) Lister tous les aliments");
			System.out.println("0) Quitter l'application");

			// Récupération de l'entrée clavier qui sera utilisée pour définir l'action à
			// faire.
			menuChoice = scanner.nextLine();
			switch (menuChoice) {
			case "1":
				// cas non détaillé pour ne pas surcharger
				writeNewAlimentToFile();
				break;
			case "2":
				// cas non détaillé pour ne pas surcharger
				writeSupAlimentToFile();
				break;
			case "3":
				// cas non détaillé pour ne pas surcharger
				listAlimentFile();
				break;
			default:
				break;
			}
		} while (menuChoice != "0");

		// On ferme l'objet scanner car il ne servira plus (obligatoire pour les objets
		// qui manipulent les Streams).
		scanner.close();
	}

	public static void writeNewAlimentToFile() throws IOException {

		String ligne = "";

		ligne = ligne + readFromConsole("Nom du nouvel aliment : ") + "; ";
		ligne = ligne + readFromConsole("Entrer la catégorie  : ") + "; ";
		ligne = ligne + readFromConsole("Entrer la valeur énergéique  : ") + "; ";
		ligne = ligne + readFromConsole("Entrer le taux de glucide : ") + " ;";
		ligne = ligne + readFromConsole("Entrer le taux de lipide : ") + " ;";

		// Création de l'objet writer qui écrira dans aliments.txt.
		BufferedWriter writer = new BufferedWriter(new FileWriter("aliments.txt", true));
		// On écrit la chaîne de caractères passées en argument de la fonction.
		writer.write(ligne);
		// On ferme notre objet writer.
		writer.close();
	}

	public static String readFromConsole(String Question) {
		// Création de l'objet Scanner (pour lire les entrées clavier)
		Scanner scanner = new Scanner(System.in);
		System.out.println(Question);
		// On ferme l'objet scanner (obligatoire !)
		scanner.close();
		return scanner.nextLine();

	}

	public static void writeSupAlimentToFile() throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("menu choix 2");
		// On ferme l'objet scanner (obligatoire !)
		scanner.close();

	}

	public static void listAlimentFile() throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("menu choix 2");
		// On ferme l'objet scanner (obligatoire !)
		scanner.close();
	}
}
