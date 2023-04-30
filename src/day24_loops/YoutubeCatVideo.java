package day24_loops;

public class YoutubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting: World's smallest cat \u083D\uDC08 - BBC");
        int seconds = 0;
        while (seconds <= 157){
            System.out.println("You're watching Youtube video seconds: " + seconds);
            seconds++;
            Thread.sleep(100);
        }
        System.out.println("Finished watching cat video");
    }
}
