package com.williamdsw;

import com.williamdsw.abstract_factory.app.AbstractFactoryApp;
import com.williamdsw.abstract_factory.app.AbstractFactoryDemo;

public class JavaDesignPatternsMain {

	public static void main (String[] args) {
		AbstractFactoryApp abstractFactoryApp = AbstractFactoryDemo.configureApplication ();
		abstractFactoryApp.triggerEvents (true);
	}

}
