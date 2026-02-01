package src;

class Main {
    public static void main(String[] args) {
        
        AudioPlayer audioPlayer = new AudioPlayer("Song Title");
        audioPlayer.play();
        audioPlayer.pause();
        audioPlayer.stop();

        System.out.println("");

        VideoPlayer videoPlayer = new VideoPlayer("Video Title");
        videoPlayer.play();
        videoPlayer.pause();
        videoPlayer.stop();

        System.out.println("");

        StreamingPlayer streamingPlayer = new StreamingPlayer("Stream TItle");
        streamingPlayer.play();
        streamingPlayer.pause();
        streamingPlayer.stop();
    }
}