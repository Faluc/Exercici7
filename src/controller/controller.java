package controller;
import java.util.Scanner;

import domain.User;
import domain.Video;

public class controller {

	public static void userMenu() {
		Scanner sc2 = new Scanner(System.in);
		boolean quit = false;
		int input;
		
		while (!quit) {
			System.out.println("Select one of the following options:");
			System.out.println("1 - CREATE A NEW USER");
			System.out.println("2 - LIST USERS");
			System.out.println("3 - VIDEO MENU");
			input = sc2.nextInt();
		switch (input) {
		case 1:
			System.out.println("New User");
			User.createUser();
			break;
		case 2:
			System.out.println("Users List:");
			User.printUsers();
			break;
		case 3:
			System.out.println("Video Menu:");
			controller.videoMenu();
		default:
			System.out.println("Please, select option 1, 2 or 3!");
		}
	}
	}
	
	public static void videoMenu() {
		Scanner sc2 = new Scanner(System.in);
		boolean quit = false;
		int input;
		
		while (!quit) {
			System.out.println("Select one of the following options:");
			System.out.println("1 - CREATE A NEW VIDEO");
			System.out.println("2 - LIST YOUR VIDEOS");
			System.out.println("3 - USER MENU");
			System.out.println("4 - EXIT PROGRAM");
			System.out.println("Select one of the options:");
			input = sc2.nextInt();
		switch (input) {
		case 1:
			System.out.println("New Video:");
			Video.createVideo();
			break;
		case 2:
			System.out.println("Video List:");
			Video.printVideos();
			break;
		case 3:
			controller.userMenu();
		case 4:
			System.out.println("Successfully quited!");
			quit = true;
			break;
		default:
			System.out.println("Please, select option 1, 2 or 3.");
		}
	}
	}
}
	