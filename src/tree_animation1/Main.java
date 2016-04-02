
package tree_animation1;

import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

import static java.lang.Math.random;


public class Main extends Ellipse {

    public Color AUTUMN_COLOR;

    public Main (Branch parentBranch) {
        super(0, parentBranch.length / 2., 2, parentBranch.length / 2.);
        setScaleX(0); //trick to hide leaves
        setScaleY(0);

        double rand = random() * 0.5 + 0.3;
        AUTUMN_COLOR = Color.color(random() * 0.1 + 0.8, rand, rand / 2);

        Color color = new Color(random() * 0.5, random() * 0.5 + 0.5, 0, 1);
        if (parentBranch.globalH < 400 && random() < 0.8) { //bottom leaf is darker
            color = color.darker();
        }
        setFill(color);
    }
}
