package src;

public class VideoPlayer implements MediaPlayer {
    String playing = "";

    public VideoPlayer(String playing) {
        this.playing = playing;
    }

    @Override
    public void play() {
        System.out.println("Video player is playing " + playing);
    }

    @Override
    public void pause() {
        System.out.println("Video player paused " + playing);
    }

    @Override
    public void stop() {
        System.out.println("Video player stopped playing " + playing);
    }
    
}