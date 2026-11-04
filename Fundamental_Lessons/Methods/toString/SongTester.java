public class SongTester {
    public static void main(String[] args) {
        Song a = new Song("Enter Sandman", "Metallica");
        Song b = new Song("Interstate Love Song", "Stone Temple Pilots");

        a.play();
        a.play();
        a.play();

        System.out.println(a.toString());

        a.getPlays();
        a.getStars();

        b.play();
        System.out.println(b);

    }
}
