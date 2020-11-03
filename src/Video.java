import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Video {
	
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
		if(title.isEmpty()){
            throw new StringIndexOutOfBoundsException("This is a mandatory field.");}
		System.out.println("Add the URL to the video:");
		String url = sc.nextLine();
		if(url.isEmpty()){
            throw new StringIndexOutOfBoundsException("This is a mandatory field.");}
		System.out.println("Add tags to the video: (separated by commas)");
		String data = sc.nextLine();
		if(data.isEmpty()){
            throw new StringIndexOutOfBoundsException("This is a mandatory field.");}
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
