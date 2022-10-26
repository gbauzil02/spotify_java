public class Node {
  private String songName;
  private String artistName;
  private String albumName;
  private int songLength;
  private Node next;
  private Node prev;

  public Node(){
    songName = null;
    artistName = null;
    albumName = null;
    songLength = 0;
    next = null;
    prev = null;

  }

  public Node(String song, String artist, String album, int length) {
      songName = song;
      artistName = artist;
      albumName = album;
      songLength = length;
      next = null;
      prev = null;
  }

  public void setSongName(String song){
    songName = song;
  }

  public void setArtistName(String artist){
    artistName = artist;
  }

  public void setAlbumName(String album){
    albumName = album;
  }

  public void setsongLength(int length){
    songLength = length;
  }

  public void setNext(Node next){
    this.next = next;
  }

  public void setNext(Node prev){
    this.prev = prev;
  }

  public String getSongName(){
    return songName;
  }

  public String getArtistName(){
    return artistName;
  }

  public String getAlbumName(){
    return albumName;
  }

  public int getSongLength(){
    return songLength;
  }

  public Node getNext(){
    return next;
  }

  public Node getPrev(){
    return prev;
  }

  public String secToMin(int seconds){
    if (seconds > 3600){
        return seconds/3600 + " hour(s) " +
        (seconds%3600)/60 + " minute(s) " +
        ((seconds%3600)%60) + " second(s)\n\n";
    }else if (seconds > 60){
        return (seconds/60) + " minute(s) " +
        (seconds%60) + " second(s)\n\n";
    }else{
        return seconds + " second(s)\n\n";
    }
  }

  public String toString(){
    return "Song: " + songName + "\n" +
    "Artist: " + artistName + "\n" +
    "Album: " + albumName + "\n" +
    "Length: " + secToMin(songLength);
  }



}
