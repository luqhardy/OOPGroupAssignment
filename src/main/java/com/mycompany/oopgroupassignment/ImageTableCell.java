package com.mycompany.oopgroupassignment;
import javafx.scene.control.TableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class ImageTableCell<S> extends TableCell<S, String> {
    private final ImageView imageView = new ImageView();

    public ImageTableCell() {
        imageView.setFitWidth(20); // Adjust the size of the image
        imageView.setFitHeight(20);
        setGraphic(imageView);
    }

    @Override
    protected void updateItem(String filepath, boolean empty) {
        super.updateItem(filepath, empty);
        if (empty || filepath == null) {
            imageView.setImage(null);
        } else {
            Image image = new Image("file:" + filepath);
            imageView.setImage(image);
        }
    }
}