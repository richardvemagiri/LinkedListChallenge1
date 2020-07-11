import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;


public class Album {
	
	private String AlbumName;
	private ArrayList<Song> songs = new ArrayList<Song>();


	public String getAlbumName() {
		return AlbumName;
	}

	public void setAlbumName(String albumName) {
		AlbumName = albumName;
	}
	
	public ArrayList<Song> getSongs() {
		return songs;
	}
	
	public void addSongToAlbum(String title, String duration){
		Song song = new Song();
		song.setTitle(title);
		song.setDuration(duration);
		songs.add(song);
	}
	
	public void deleteSongFromAlbum(String title){
		ListIterator<Song> i = songs.listIterator();
		while(i.hasNext()){
			
		}
	}
	

}
