import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MiniCalculator extends Application {
    public void start(Stage stage) {
        TextField n1 = new TextField(), n2 = new TextField();
        ComboBox<String> op = new ComboBox<>();
        op.getItems().addAll("+", "-", "*", "/");
        Button calc = new Button("=");
        Label result = new Label();

        calc.setOnAction(e -> {
            try {
                double a = Double.parseDouble(n1.getText());
                double b = Double.parseDouble(n2.getText());
                String o = op.getValue();
                double r = switch (o) {
                    case "+" -> a + b;
                    case "-" -> a - b;
                    case "*" -> a * b;
                    case "/" -> b != 0 ? a / b : Double.NaN;
                    default -> 0;
                };
                result.setText("Result: " + r);
            } catch (Exception ex) {
                result.setText("Error!");
            }
        });

        VBox root = new VBox(10, n1, n2, op, calc, result);
        stage.setScene(new Scene(root, 250, 200));
        stage.setTitle("Mini Calculator");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
