package CompositeDesignPattern.FileSystem;

public class MainClass {

    public static void main(String[] args) {
        Directory movie = new Directory("Movies");
        FileSystem mp4Txt = new File("MP4.txt");
        movie.addFileSystem(mp4Txt);
        Directory bollywood = new Directory("Bollywood");
        movie.addFileSystem(bollywood);
        bollywood.addFileSystem(new File("kabir.mp4"));
        bollywood.addFileSystem(new File("shaadi.mp4"));
        bollywood.addFileSystem(new File("3idiot.mp4"));
        Directory horror = new Directory("Horror");
        horror.addFileSystem(new File("thunderBolt.mp4"));
        horror.addFileSystem(new File("kala.mp4"));
        horror.addFileSystem(new File("luckyBhaskar.mp4"));
        bollywood.addFileSystem(horror);
        movie.ls();
    }

}
