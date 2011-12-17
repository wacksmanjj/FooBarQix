package com.valtech.foobarqix;

import com.vaadin.Application;
import com.vaadin.ui.*;

public class FooBarQixApplication extends Application {
	@Override
	public void init() {
		
		setTheme("runo");
		
		Window mainWindow = new Window("Foobarqix Application");
		mainWindow.addComponent(new FooBarQixView());
		setMainWindow(mainWindow);
	}

}
