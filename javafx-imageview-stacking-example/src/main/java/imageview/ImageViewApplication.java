package imageview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.List;

public class ImageViewApplication extends Application {

    @Override
    public void start(Stage stage) {
        var root = new StackPane();
        for (var s : List.of("black-shoe.png", "red-shoe.png", "block.png")) {
            var image = new Image("/images/" + s);
            var imageView = new ImageView(image);
            root.getChildren().add(imageView);
        }
        var scene = new Scene(root, 400, 400);
        stage.setTitle("JavaFX ImageView Stacking Example");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

}
