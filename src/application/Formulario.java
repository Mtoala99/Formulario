package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class Formulario extends Application{
	@Override
    public void start(Stage primaryStage) {
        // Crear el GridPane
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        // Crear los controles
        Button button = new Button("Button");
        CheckBox checkBox = new CheckBox("CheckBox");
        Hyperlink hyperlink = new Hyperlink("Hyperlink");
        ToggleButton toggleButton = new ToggleButton("ToggleButton");
        RadioButton radioButton = new RadioButton("RadioButton");
        Label label = new Label("Label");
        TextField textField = new TextField("some text...");
        PasswordField passwordField = new PasswordField();
        passwordField.setText("password");
        TextArea textArea = new TextArea("This is very long text that will wrap to several lines.");
        textArea.setWrapText(true);
        ProgressIndicator progressIndicator = new ProgressIndicator(0.49);
        ProgressBar progressBar = new ProgressBar(0.49);
        Slider slider = new Slider(0, 1, 0.49);
        Label sliderValueLabel = new Label(String.format("%.0f%%", slider.getValue() * 100));

        // Configurar el Slider para que actualice el ProgressIndicator y el ProgressBar
        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            progressIndicator.setProgress(newValue.doubleValue());
            progressBar.setProgress(newValue.doubleValue());
            sliderValueLabel.setText(String.format("%.0f%%", newValue.doubleValue() * 100));
        });
        // Añadir controles al GridPane
        grid.add(new Label("Button:"), 0, 0);
        grid.add(button, 1, 0);
        grid.add(new Label("CheckBox:"), 0, 1);
        grid.add(checkBox, 1, 1);
        grid.add(new Label("Hyperlink:"), 0, 2);
        grid.add(hyperlink, 1, 2);
        grid.add(new Label("ToggleButton:"), 0, 3);
        grid.add(toggleButton, 1, 3);
        grid.add(new Label("RadioButton:"), 0, 4);
        grid.add(radioButton, 1, 4);
        grid.add(new Label("Label:"), 0, 5);
        grid.add(label, 1, 5);
        grid.add(new Label("TextField:"), 0, 6);
        grid.add(textField, 1, 6);
        grid.add(new Label("PasswordField:"), 0, 7);
        grid.add(passwordField, 1, 7);
        grid.add(new Label("TextArea:"), 0, 8);
        grid.add(textArea, 1, 8);
        grid.add(new Label("ProgressIndicator:"), 0, 9);
        grid.add(progressIndicator, 1, 9);
        grid.add(new Label("ProgressBar:"), 0, 10);
        grid.add(progressBar, 1, 10);
        grid.add(new Label("Slider:"), 0, 11);
        grid.add(slider, 1, 11);

        Scene scene = new Scene(grid, 600, 600);

        primaryStage.setTitle("JavaFX Controls Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
