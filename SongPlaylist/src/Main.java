import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Album> albums = new ArrayList<Album>();
		
		//add albums and the songs in it
		addAlbumsinMemory(albums);
		printAlbumDetails(albums);
		

		

	}
	

	private static void printAlbumDetails(ArrayList<Album> albums) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<albums.size();i++){
			Album a = albums.get(i);
			System.out.println("Album#" + i + " Name: " + a.getAlbumName());
			for(int j=0;j<a.getSongs().size();j++){
				System.out.println("Song " + j +  " Title " + ": " + a.getSongs().get(j).getTitle());
				System.out.println("Song " + j + " Duration " + ": " + a.getSongs().get(j).getDuration());
			}
			
		}
		
	}


	private static void addAlbumsinMemory(ArrayList<Album> albums) {
		// TODO Auto-generated method stub
		
		System.out.println("How many albums do you want to add?: ");
		BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
		try {
			String input = reader.readLine();
			int albumNumber = Integer.parseInt(input);
			
			
			//take input of album name and songs in each album
			for(int i=0;i<albumNumber;i++){
				Album a = new Album();
				
				System.out.println("What is the Album Name of Album#" + i + " : ");
				
				reader = new BufferedReader(new InputStreamReader(System.in));
				String AlbumName = reader.readLine();
				a.setAlbumName(AlbumName);
				
				System.out.println("How many songs do you have in this album?: ");
				reader = new BufferedReader(new InputStreamReader(System.in));
				input = reader.readLine();
				int numberOfSongs = Integer.parseInt(input);
				
				for(int j=0;j<numberOfSongs;j++){
					
					System.out.println("Please enter name of song#" + j + " : ");
					reader = new BufferedReader(new InputStreamReader(System.in));
					String songName = reader.readLine();
					
					System.out.println("Please enter duration in minutes for song#" + j + " : ");
					reader = new BufferedReader(new InputStreamReader(System.in));
					String songDuration = reader.readLine();
					
					a.addSongToAlbum(songName, songDuration);					
					
				}
				
				albums.add(a);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
