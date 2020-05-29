package com.williamdsw;

import com.williamdsw.abstract_factory.app.AbstractFactoryApp;
import com.williamdsw.abstract_factory.app.AbstractFactoryDemo;
import com.williamdsw.adapter.app.AdapterDemo;
import com.williamdsw.bridge.app.BridgeDemo;
import com.williamdsw.builder.app.BuilderDemo;
import com.williamdsw.composite.app.CompositeDemo;
import com.williamdsw.prototype.app.PrototypeDemo;
import com.williamdsw.singleton.app.NaiveSingletonDemo;

public class JavaDesignPatternsMain {

	public static void main (String[] args) {
		AbstractFactoryApp abstractFactoryApp = AbstractFactoryDemo.configureApplication ();
		abstractFactoryApp.triggerEvents (true);
		
		BuilderDemo.builderDemo ();
		
		PrototypeDemo.prototypeDemo ();
		
		NaiveSingletonDemo.naiveSingletonSingleThreadDemo ();
		NaiveSingletonDemo.nativeSingletonMultithreadDemo ();
		NaiveSingletonDemo.safeSingletonMultithreadDemo ();
		
		AdapterDemo.adapterDemo();
		
		BridgeDemo.bridgeDemo ();
		
		CompositeDemo.compositeDemo ();
	}

}
