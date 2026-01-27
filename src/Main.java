package src;

class Main {
    public static void main(String[] args) {
        
        AudioPlayer audioPlayer = new AudioPlayer("Song");
        audioPlayer.play();
        audioPlayer.pause();
        audioPlayer.stop();

        VideoPlayer videoPlayer = new VideoPlayer("Video");
        videoPlayer.play();
        videoPlayer.pause();
        videoPlayer.stop();

        StreamingPlayer streamingPlayer = new StreamingPlayer("Stream");
        streamingPlayer.play();
        streamingPlayer.pause();
        streamingPlayer.stop();
    }
}