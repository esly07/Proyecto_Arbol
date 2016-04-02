
package tree_animation1;

import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Node;


public class Util {

    public static void addChildToParent(final Group parent, final Node child) {
        Platform.runLater(() -> parent.getChildren().add(child));
        //Platform.runLater(() -> parent.getChildren().add(child));
    }
}
