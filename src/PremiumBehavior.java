import java.util.ArrayList;

public class PremiumBehavior implements UserBehavior {
    private int month;

    @Override
    public void createPlaylist (String title, User owner) {
        Playlist playlist = new Playlist(title, new ArrayList<>(), owner);
        owner.addPlaylist(playlist);
        System.out.println("پلی لیست " + title + " برای " + owner.getUsername() + " درست شد!");
    }

    @Override
    public void playMusic (Music music){
        music.play();
    }

    @Override
    public void buyPremium (User owner, int month){
        this.month += month;
    }

    public int getMonth(){
        return month;
    }
}
