package com.williamdsw;

import com.williamdsw.abstract_factory.app.AbstractFactoryApp;
import com.williamdsw.abstract_factory.app.AbstractFactoryDemo;
import com.williamdsw.builder.app.BuilderDemo;

public class JavaDesignPatternsMain {

	public static void main (String[] args) {
		AbstractFactoryApp abstractFactoryApp = AbstractFactoryDemo.configureApplication ();
		abstractFactoryApp.triggerEvents (true);
		
		BuilderDemo.builderDemo ();
	}

}
