import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArList forray storing the file names of music files.
    private ArrayList<MusicDetails> files;
    // A player for the music files.
    private MusicPlayer player;
        
    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        files = new ArrayList<MusicDetails>();
    }
    
    /**
     * Add a file to the collection.
     * @param fName The file to be added.
     * @param aName The Music artist.
     * @param year year of music produce.
     */
    public void addFile(String fName, String aName, String year) {
    MusicDetails temp = new MusicDetails();
    temp.setMusicName(fName);
    temp.setArtist(aName);
    temp.setYear(year);
    files.add(temp);

    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        System.out.println(files.get(index));
    }
    
    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        Iterator<MusicDetails> it = files.iterator();

        while (it.hasNext()){
            System.out.println(it.next().getMusicName() + "-" + it.next().getArtist());

        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        files.remove(index);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        player.startPlaying(files.get(index).getMusicName());
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index) {
        if (index >= 0 && index < files.size()) {
            return true;
        } else {
            return false;
        }
    }
    private void showLiked(){
        Iterator<MusicDetails> it = files.iterator();
        int count = 1;
        while(it.hasNext()){
            if(it.next().isItLiked() == true){
                System.out.println(count + ":" + it.next().getMusicName() + "-" + it.next().getArtist() + "-" + it.next().getYear());
                count++;
            }
        }
    }
    private void likeMusic(int index){
        files.get(index).like();
    }
}