package software.ulpgc.imageviewer;

public interface Image {
    String id();
    Image next();
    Image prev();

}
