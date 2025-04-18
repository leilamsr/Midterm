public class Main {
    public static void main(String[] args) {
        try {
            User user1 = new User("Leila", "Leila.m");
            User user2 = new User("Faegheh", "Faegheh.shhh");

            User singer1 = new User("syh", "hfwhiq");
            User singer2 = new User("Daryoosh", "sfhqefhwk");
            User singer3 = new User("HANA", "ifehwoj");

            Music music1 = new Music("Umie", singer1);
            Music music2 = new Music("Talafi", singer2);
            Music music3 = new Music("ROZE", singer3);

            user1.playMusic(music1);
            user1.playMusic(music2);
            user1.playMusic(music3);
            user1.playMusic(music1);
            user1.playMusic(music2);
            user1.playMusic(music3);

            user2.playMusic(music2);

        } catch (InvalidOperationException e) {
            System.out.println("خطا: " + e.getMessage());
        }
    }
}
