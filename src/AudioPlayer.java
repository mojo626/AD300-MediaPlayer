package src;

public class AudioPlayer implements MediaPlayer {
    String playing = "";

    public AudioPlayer(String playing) {
        this.playing = playing;
    }

    @Override
    public void play() {
        System.out.println("Audio player is playing " + playing);
    }

    @Override
    public void pause() {
        System.out.println("Audio player paused " + playing);
    }

    @Override
    public void stop() {
        System.out.println("Audio player stopped playing " + playing);
    }
    
}
