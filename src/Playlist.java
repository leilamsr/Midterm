import java.util.ArrayList;
import java.util.Collections;

public class Playlist {

    private String title;
    private ArrayList<Music> playlist;
    private User Owner;

    public Playlist(String title, ArrayList<Music> playlist, User owner) {
        this.title = title;
        this.playlist = new ArrayList<>();
        this.Owner = owner;
    }

    public void editPlaylist(String title, String password, User owner) {
        if (!owner.getPassword().equals(password)){
            throw new InvalidOperationException("رمز عبور اشتباه است!");
        }
        this.title = title;
    }

    public void addMusic(Music music, User owner, String password) {
        if (!owner.getPassword().equals(password)){
            throw new InvalidOperationException("رمز عبور اشتباه است!");
        }
        if (playlist.contains(music)){
            throw new InvalidOperationException("این اهنگ قبلا در پلی لیست شما قرار داده شده است!");
        }
        playlist.add(music);
    }

    public void removeMusic(Music music, User owner, String password) {
        if (!owner.getPassword().equals(password)){
            throw new InvalidOperationException("رمز عبور اشتباه است!");
        }
        if (!playlist.contains(music)){
            throw new InvalidOperationException("این اهنگ قبلا در پلی لیست شما قرار داده نشده است!");
        }
        playlist.remove(music);
    }

    public ArrayList<Music> searchInPlaylist(String title) {
        ArrayList<Music> musics = new ArrayList<>();
        for (Music music : playlist) {
            if (music.getTitle().equals(title)){
                musics.add(music);
            }
        }
        if (musics.isEmpty()) {
            return null;
        }
        return musics;
    }

    public Music searchInPlaylist(String title, String singer) {
        for (Music music : playlist){
            if (music.getTitle().equals(title) && music.getSinger().equals(singer)){
                return music;
            }
        }
        return null;
    }

    public void playPlaylist() {
        for (Music music : playlist){
            music.play();
        }
    }

    public void shufflePlay() {
        ArrayList<Music> musics = new ArrayList<>();
        Collections.shuffle(musics);
        for (Music music : playlist){
            music.play();
        }
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Music> getPlaylist() {
        return playlist;
    }

    public User getOwner() {
        return Owner;
    }
}
