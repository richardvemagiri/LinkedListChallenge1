import java.util.LinkedList;
import java.util.ListIterator;


public class Album {
	
	private LinkedList<Song> songs = new LinkedList<Song>();
	
	public void addSongToAlbum(String title, String duration){
		Song song = new Song();
		song.setTitle(title);
		song.setDuration(duration);
		songs.add(song);
	}
	
	public void deleteSongFromAlbum(String title){
		ListIterator<Song> i = songs.listIterator();
		while(i.hasNext()){
			if()
		}
	}
	

}
