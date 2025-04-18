import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private ArrayList<User> followerList;
    private ArrayList<User> followingList;
    private UserBehavior behavior;
    private ArrayList<Playlist> playlists;
    private static ArrayList<User> allUsers = new ArrayList<>();

    public User(String username, String password) {
        for (User user : allUsers) {
            if (user.username.equals(username)) {
                throw new IllegalArgumentException("این نام کاربری قبلا ثبت شده است!");
            }
        }
        this.username = username;
        this.password = password;
        this.followerList = new ArrayList<>();
        this.followingList = new ArrayList<>();
        this.playlists = new ArrayList<>();
        this.behavior = new RegularBehavior();
        allUsers.add(this);
    }

    public void follow (User user){
        this.followerList.add(user);
        user.followingList.add(this);
    }

    public void createPlaylist (String Title, User Owner){
        this.behavior.createPlaylist(Title, Owner);
    }

    public void playMusic (Music music){
        this.behavior.playMusic(music);
    }

    public void buyPremium (User owner, int month){
        this.behavior.buyPremium(owner, month);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<User> getFollowerList() {
        return followerList;
    }

    public ArrayList<User> getFollowingList() {
        return followingList;
    }

    public UserBehavior getBehavior() {
        return behavior;
    }

    public void setBehavior(UserBehavior behavior) {
        this.behavior = behavior;
    }

    public void addPlaylist (Playlist playlist){
        this.playlists.add(playlist);
    }
}
