package me.olafgoud;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import me.olafgoud.utils.screen.ScreenTransform;

public class TIHarbourMain extends Application{

	
	public static void main(String[] args) {
		/*try {
			String system = System.getProperty("os.name");
			System.out.println(system);
			if (system.equalsIgnoreCase("Windows 11")) {
				Runtime.getRuntime().exec("cmd /c start cmd.exe");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Hello World");
		*/
        launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(ScreenTransform.createContent(), 300, 300, Color.GRAY));
        stage.show();
        stage.setResizable(false);
        stage.setFullScreenExitHint(null);
        stage.setTitle("THIS IS A TEST");
		return;
	}
	
	

}
