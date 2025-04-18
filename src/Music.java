import java.util.ArrayList;
import java.util.List;

public class Music {
    private String title;
    private User singer;
    private int numberOfStream = 0;
    public static ArrayList<Music> allMusics;

    public Music(String title, User singer) {
        this.title = title;
        this.singer = singer;
        allMusics.add(this);
    }

    public void play() {
        System.out.println("اهنگ " + title + " با خواننده " + singer + "در حال پخش است.");
        numberOfStream++;
    }

    public static List<Music> Search(String title) {
        List<Music> musics = new ArrayList<>();
        for (Music music : allMusics) {
            if (music.title.equals(title)) {
                musics.add(music);
            }
        }
        if (musics.isEmpty()) {
            return null;
        }
        return musics;
    }

    public static Music Search(String title, String singer) {
        for (Music music : allMusics) {
            if (music.title.equals(title) && music.singer.equals(singer)) {
                return music;
            }
        }
        return null;
    }

    public String getTitle() {
        return title;
    }

    public String getSinger() {
        return singer.toString();
    }

    public int getNumberOfStream() {
        return numberOfStream;
    }

}
