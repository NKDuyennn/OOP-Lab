package hust.soict.hedspi.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class PainterController {
	
	@FXML
	private RadioButton eraser;
	
	@FXML
	private RadioButton pen;
	
    @FXML
    private Pane drawingAreaPane;

    // add a ToggleGroup to group RadioButtons
    private ToggleGroup toggleGroup;
    
    @FXML
    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
    	Rectangle clipArea = new Rectangle(0, 0, drawingAreaPane.getWidth(), drawingAreaPane.getHeight());
    	drawingAreaPane.setClip(clipArea);
    	Color inkColor = Color.BLACK;
    	if (eraser.isSelected()) {
    		inkColor = Color.WHITE;
    	}
    	Circle newCircle = new Circle(event.getX(), event.getY(), 4, inkColor);
    	drawingAreaPane.getChildren().add(newCircle);
    }
    
    @FXML 
    void initialize() {
    	toggleGroup = new ToggleGroup();
    	pen.setToggleGroup(toggleGroup);
    	eraser.setToggleGroup(toggleGroup);
    	
    	pen.setSelected(true);
    }
}
