package application;

import java.util.Timer;
import java.util.TimerTask;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class SliderRKeyPressedEvent implements EventHandler<KeyEvent>{
	GameController controller;
	
	SliderRKeyPressedEvent(GameController controller){
		super();
		this.controller = controller;
	}
	
	@Override
	public void handle(KeyEvent event) {
		if (event.getCode().equals(KeyCode.K)){
			controller.setMoveSliderR(true);
			controller.setMoveSliderRUp(false);
		}
		if (event.getCode().equals(KeyCode.I)){
			controller.setMoveSliderR(true);
			controller.setMoveSliderRUp(true);
		}
	}
}
