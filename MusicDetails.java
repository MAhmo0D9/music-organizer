public class MusicDetails {
    private String musicName;
    private String artist;
    private String year;
    private boolean liked;



    public MusicDetails(){

        liked = false;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public boolean isItLiked(){
        if(liked == true) {
            return true;
        }
        else{
            return false;
            }
    }



    public String getMusicName(){
        return musicName;
    }
    public String getArtist(){
        return artist;
    }
    public String getYear(){
        return year;
    }
    public void like(){
        liked = true;
    }
}
