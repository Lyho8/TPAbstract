package org.formation.tpinterface.test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainGraphicalTest extends Application{
	
	
	@Override
	public void start(Stage arg0) throws Exception {
		org.formation.tpinterface.Circle circle = new org.formation.tpinterface.Circle(100.0);
		circle.printMe("Bonjour");
		Pane pane = new Pane();
		pane.getChildren().add(circle.getShape());
		Scene scene = new Scene(pane, 250, 250);
		arg0.setScene(scene);
		arg0.show();
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
