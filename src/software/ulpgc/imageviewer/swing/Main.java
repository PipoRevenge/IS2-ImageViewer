package software.ulpgc.imageviewer.swing;

import software.ulpgc.imageviewer.Image;
import software.ulpgc.imageviewer.ImagePresenter;
import software.ulpgc.imageviewer.mocks.MockImageLoader;

public class Main {
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        ImagePresenter presenter = new ImagePresenter(frame.getImageDisplay());
        presenter.show(image());
        frame.setVisible(true);
    }

    private static Image image() {
        return new MockImageLoader().load();
    }
}
