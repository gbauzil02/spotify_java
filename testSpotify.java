import java.util. *;

public class TestSpotify{
  public static void main(String[] args){
    int userChoice;
    int frequency;
    String userTrack;
    String userArtist;
    String userAlbum;
    int userLength;
    Scanner scan = new Scanner(System.in);
    Spotify<String> playlist = new Spotify<String>();
    boolean check = true;
    while(check == true){
      System.out.print("----------------------------------\n" +
       "Choose an option from the menu: \n" +
      "1 - Add track to playlist \n" +
      "2 - Remove first track\n" +
      "3 - Get shortest track\n" +
      "4 - Display playlist time\n" +
       "5 - Display tracks\n" +
       "6 - Remove song from playlist\n" +
       "7 - Search for artist\n" +
       "8 - Remove last track\n" +
       "9 - Sort playlist by name (a-z)\n" +
       "10 - Sort playlist by name (z-a)\n" +
       "11 - CHECK FALSE\n" +
       "----------------------------------\n" +
       "Your choice: ");
       userChoice = scan.nextInt();

       switch(userChoice)
         {
           case 1:
           System.out.print("Song to be added: ");
           scan.nextLine();
           userTrack = scan.nextLine();

           System.out.print("Song artist: ");
           userArtist = scan.nextLine();

           System.out.print("Album name: ");
           userAlbum = scan.nextLine();

           System.out.print("Song length (in seconds): ");
           userLength = scan.nextInt();

           if (userLength <= 0)
           {
               System.out.println("ERROR: Song length must be greater than 0 seconds");
               break;
           }

           playlist.insertSong(userTrack, userArtist, userAlbum, userLength);
               break;
           case 5:
            System.out.println(playlist);
               break;
           case 4:
           System.out.println(playlist.playlistTime());
               break;
           case 2:
           playlist.removeFirst();
               break;
           case 8:
           playlist.removeLast();
               break;
           case 6:
           System.out.println("6");
               break;
           case 3:
           System.out.println(playlist.getShortestTrack());
               break;
           case 7:
           System.out.println("7");
               break;
           case 9:
           System.out.println("9");
               break;
           case 10:
           System.out.println("10");
               break;
           case 11:
           check = false;
           break;
           default:
               System.out.println("Error - The number entered is not a valid choice");
        }
    }




  }
}
