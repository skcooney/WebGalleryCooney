package view;

import java.util.List;
import java.util.Scanner;
import controller.ArtworkHelper;
import model.Artwork;

public class StartProgram {

	// private static final String title = null;
	static Scanner in = new Scanner(System.in);
	static ArtworkHelper awh = new ArtworkHelper();

	private static void addArtwork() {
		// TODO Auto-generated method stub
		System.out.print("Enter title of artwork: ");
		String title = in.nextLine();
		System.out.print("Enter artist name: ");
		String artistName = in.nextLine();
		System.out.print("Enter type of media: ");
		String media = in.nextLine();
		System.out.print("Enter year released: ");
		String year = in.nextLine();
		System.out.print("Enter value of artwork: ");
		double value = in.nextDouble();

		Artwork toAdd = new Artwork(0, title, artistName, media, year, value);
		awh.insertArtwork(toAdd);
	}

	private static void deleteArtwork() {
		// TODO Auto-generated method stub
		System.out.print("Enter the title to delete: ");
		String title = in.nextLine();
		System.out.print("Enter the artistName to delete: ");
		String artistName = in.nextLine();

		Artwork toDelete = new Artwork(title, artistName);
		awh.deleteArtwork(toDelete);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runMenu();

	}

	public static void runMenu() {
		boolean goAgain = true;
		System.out.println("--- Welcome to our Art Gallery! ---");
		while (goAgain) {
			System.out.println("*  Select a piece of artwork from the gallery:");
			System.out.println("*  1 -- Add a piece of artwork");
			System.out.println("*  2 -- Delete a piece of artwork");
			System.out.println("*  3 -- View list of artwork");
			System.out.println("*  4 -- Exit the awesome program");
			System.out.print("*  Your selection: ");
			int selection = in.nextInt();
			in.nextLine();

			if (selection == 1) {
				addArtwork();
				} else if (selection == 2) {
				viewGallery();
				deleteArtwork();
			} else if (selection == 3) {
				viewGallery();
			} else {
				//ah.cleanUp();
				System.out.println("   Goodbye!   ");
				goAgain = false;
			}

		}

	}

	private static void viewGallery() {
		// TODO Auto-generated method stub
		List<Artwork> allArtwork = awh.showAllArtwork();
		for (Artwork a : allArtwork) {
			System.out.println(a.returnArtworkDetails());
		}

	}

}
