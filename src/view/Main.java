package view;
import domain.User;
import domain.Video;
import controller.controller;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to our video storage system:");
		System.out.println("------------------------------------------");
		System.out.println("Let's create your account!");
		
		
		controller.userMenu();
		controller.videoMenu();

	}	
}
