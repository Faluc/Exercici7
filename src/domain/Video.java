package domain;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Video {
	
	public Video (String url, String title, List <String> tags) {
		
		ruta=url;
		titulo=title;
		lista_claves=tags;
	}
	
	public String getURL() {
		return ruta;
	}
	public String getTitle() {
		return titulo;
	}
	
		
	private String ruta;
	private String titulo;
	private List <String> lista_claves = new ArrayList();
	static ArrayList<Video> video_list = new ArrayList<Video>();
	
	public static void createVideo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Add a title to the video:");
		String title = sc.nextLine();
		while (title == null || title.isEmpty() || title == " ") {
			System.out.println("No blank titles allowed!");
			System.out.println("Please introduce the title:");
			title = sc.nextLine();}
		
		System.out.println("Add the URL to the video:");
		String url = sc.nextLine();
		while (url == null || url.isEmpty() || url == " ") {
			System.out.println("No blank URL's allowed!");
			System.out.println("Please introduce the URL:");
			url = sc.nextLine();}
		
		System.out.println("Add tags to the video: (separated by commas)");
		String data = sc.nextLine();
		while (data == null || data.isEmpty() || data == " ") {
			System.out.println("No blank tags allowed!");
			System.out.println("Please introduce some tag:");
			data = sc.nextLine();}
		String str[] = data.split(",");
		List <String> tags = new ArrayList<String>();
		tags = Arrays.asList(str);
		video_list.add(new Video(url, title, tags));
		System.out.println("You've created a new video:");
		}
	
		
	public static void printVideos() {
		System.out.println(video_list);
		System.out.println("-----------------------------");
		
	}
	public String toString() {
        return  "\n Title ='" + getTitle() +
                "\n URL ='" + getURL() +
                "\n Tags =" + lista_claves +
                '}';
    }
	
	
	
}
