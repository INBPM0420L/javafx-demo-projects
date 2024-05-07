package imageview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ImageViewApplication extends Application {

    @Override
    public void start(Stage stage) {
        // var image = new Image("http://cr.openjdk.java.net/~jeff/Duke/png/Hips.png");
        var image = new Image("/Hips.png");

        var imageView = new ImageView();
        imageView.setImage(image);
        imageView.setFitHeight(400);
        imageView.setPreserveRatio(true);
        imageView.setSmooth(true);

        var root = new StackPane();
        root.getChildren().add(imageView);

        var scene = new Scene(root, 400, 600);
        stage.setTitle("JavaFX ImageView Example");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

}
