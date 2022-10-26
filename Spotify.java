import java.util.*;
public class Spotify<E extends Comparable<? super E>>{
  private Node head;
  private int songNum = 0;

  public Spotify(){
    head = null;
    songNum = 0;
  }


  public void insertSong(String userTrack, String userArtist, String userAlbum, int userLength){
    Node newSong = new Node(userTrack, userArtist, userAlbum, userLength);
    newSong.setNext(head);
    head.setPrev(newSong);
    head = newSong;
    songNum += 1;
  }

  public boolean isEmpty(){
    if (songNum == 0){
      return true;
    }
    return false;
  }

  public String playlistTime(){
    int time = 0;
    Node curr = head;
    while(curr != null){
      time += curr.getSongLength();
      curr = curr.getNext();
    }

    if (time > 3600){
        return "Total Playlist Time: " + time/3600 + " hour(s) " +
        (time%3600)/60 + " minute(s) " +
        ((time%3600)%60) + " second(s)\n\n";
    }else if (time > 60){
        return "Total Playlist Time: " + (time/60) + " minute(s) " +
        (time%60) + " second(s)\n\n";
    }else{
        return "Total Playlist Time: " + time + " second(s)\n\n";
    }
  }

  public void removeFirst(){
    Node curr = head;
    while(curr.getNext() != null){
      curr = curr.getNext();
    }
    Node prev = curr.getPrev();
    prev.setNext(null);

  }

  public String getShortestTrack(){
    Node shortest = head;
    Node curr = head;

    while(curr != null){
      if (curr.getSongLength() < shortest.getSongLength()){
        shortest = curr;
      }
      curr = curr.getNext();
    }
    return "Shortest track: " + shortest;
  }

  public void removeLast(){
    Node curr = head;
    if(!isEmpty && curr != null){
      head = curr.getNext();
      

    }
  }


  public void removeSong(String song){
    Node curr = head;
    while(curr != null){
      if(curr.getSongName().equals(song)){

      }
    }

  }
  // public string getSongName();
  // public string getArtistName();
  // public string getAlbumName();
  // public int getSongLength();
  // public boolean search(E data);

  public String toString(){
    String display = "Playlist:\n----------------------------------\n";

    Node curr = head;
    while(curr != null){
      display += curr;
      curr = curr.getNext();
    }
    return display;

  }


}
