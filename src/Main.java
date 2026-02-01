package src;

class Main {
    public static void main(String[] args) {
        
        AudioPlayer audioPlayer = new AudioPlayer("Song Title");
        audioPlayer.play();
        audioPlayer.pause();
        audioPlayer.stop();

        VideoPlayer videoPlayer = new VideoPlayer("Video Title");
        videoPlayer.play();
        videoPlayer.pause();
        videoPlayer.stop();

        StreamingPlayer streamingPlayer = new StreamingPlayer("Stream TItle");
        streamingPlayer.play();
        streamingPlayer.pause();
        streamingPlayer.stop();
    }
}