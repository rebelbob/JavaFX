package rocket;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    private static Stage stage;

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        this.stage = stage;

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/HelloWindow.fxml"));
        Scene scene = new Scene(root);

        stage.setScene(scene);

        stage.setTitle("Выбор основных проектных параметров ракеты-носителя");

        stage.show();
    }

    public static void gotoSchemeChoose() {
        try {
            replaceSceneContent("/fxml/SchemeChoose.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void gotoHelloWindow() {
        try {
            replaceSceneContent("/fxml/HelloWindow.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void gotoComputeMass() {
        try {
            replaceSceneContent("/fxml/ComputeMass.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void replaceSceneContent(String fxml) throws Exception {
        Parent page = FXMLLoader.load(Main.class.getResource(fxml), null, new JavaFXBuilderFactory());
        Scene scene = stage.getScene();
        if (scene == null) {
            stage.setScene(scene);
        } else {
            stage.getScene().setRoot(page);
        }
        stage.show();
    }
}