import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;

import java.util.Collection;

public class java extends Application {
    public static void main(String[] args){
        Application.launch(args);
    }
    public void start (Stage stage) {
//        Stage stage =new Stage();
        int width=20;
        int height=20;
        Canvas canvas=new Canvas(width,height);
        Image icon =new Image("D:\\java\\bomberman-starter\\src");
        Group root=new Group((Collection<Node>) icon);
        Scene scene1=new Scene(root, Color.GRAY);
        stage.setScene(scene1);
        stage.setTitle("demo");
        stage.show();
    }
}
