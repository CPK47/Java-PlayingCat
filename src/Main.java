import java.io.PipedOutputStream;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Test Data");
        System.out.println(PlayingCat.isCatPlaying(true, 10));
        System.out.println(PlayingCat.isCatPlaying(false, 36));
        System.out.println(PlayingCat.isCatPlaying(false, 35));
    }

    public static class PlayingCat
    {
        public static boolean isCatPlaying(boolean summer, int temperature)
        {
            if((summer) && temperature < 46 && temperature > 24) return true;
            if((!summer) && temperature < 36 && temperature > 24) return true;
            else return false;
        }
    }
}