public class RegularBehavior implements UserBehavior {
    private int playingLimit = 5;

    @Override
    public void createPlaylist (String Title, User Owner) {
        throw new InvalidOperationException("کاربر عادی امکان ایجاد پلی لیست را ندارد!");
    }

    @Override
    public void playMusic (Music music) {
        if (playingLimit <= 0) {
            throw new InvalidOperationException("کاربر گرامی به حد مجاز استفاده روزانه خود رسیدهد اید!");
        }
        music.play();
        playingLimit--;
    }

    @Override
    public void buyPremium (User owner, int month) {}
}
