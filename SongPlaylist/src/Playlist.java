import java.util.LinkedList;
import java.util.ListIterator;


public class Playlist {
	
	LinkedList<Song> songs = new LinkedList<Song>();
	
	public LinkedList<Song> getSongs() {
		return songs;
	}

	public void setSong(Song songName) {
		//if "song" exists in any album, then add the song to playlist
		this.songs.add(songName);
	}
	
	public void removeSong(Song songName){
		ListIterator<Song> i = songs.listIterator();
		//logic to remove 'songName' goes below
		
	}

	public void printSongList(){
		//logic to print all the song names in the playlist
	}

	
	

}
