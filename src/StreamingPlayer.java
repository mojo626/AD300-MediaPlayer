package src;

public class StreamingPlayer implements MediaPlayer {
    String playing = "";

    public StreamingPlayer(String playing) {
        this.playing = playing;
    }

    @Override
    public void play() {
        System.out.println("Streaming player is playing " + playing);
    }

    @Override
    public void pause() {
        System.out.println("Streaming player paused " + playing);
    }

    @Override
    public void stop() {
        System.out.println("Streaming player stopped playing " + playing);
    }
    
}