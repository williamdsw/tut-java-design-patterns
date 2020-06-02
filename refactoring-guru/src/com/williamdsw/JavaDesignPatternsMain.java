package com.williamdsw;

import com.williamdsw.adapter.app.AdapterDemo;
import com.williamdsw.behavioral.chain_of_responsibility.app.ChainOfResponsibilityDemo;
import com.williamdsw.bridge.app.BridgeDemo;
import com.williamdsw.composite.app.CompositeDemo;
import com.williamdsw.creational.abstract_factory.app.AbstractFactoryApp;
import com.williamdsw.creational.abstract_factory.app.AbstractFactoryDemo;
import com.williamdsw.creational.builder.app.BuilderDemo;
import com.williamdsw.creational.prototype.app.PrototypeDemo;
import com.williamdsw.creational.singleton.app.NaiveSingletonDemo;
import com.williamdsw.decorator.app.DecoratorDemo;
import com.williamdsw.facade.app.FacadeDemo;
import com.williamdsw.flyweight.app.FlyweightDemo;
import com.williamdsw.proxy.app.ProxyDemo;

public class JavaDesignPatternsMain {

	public static void main (String[] args) {
		//AbstractFactoryApp abstractFactoryApp = AbstractFactoryDemo.configureApplication ();
		//abstractFactoryApp.triggerEvents (true);
		
		//BuilderDemo.builderDemo ();
		
		//PrototypeDemo.prototypeDemo ();
		
		//NaiveSingletonDemo.naiveSingletonSingleThreadDemo ();
		//NaiveSingletonDemo.nativeSingletonMultithreadDemo ();
		//NaiveSingletonDemo.safeSingletonMultithreadDemo ();
		
		//AdapterDemo.adapterDemo();
		
		//BridgeDemo.bridgeDemo ();
		
		//CompositeDemo.compositeDemo ();
		
		//DecoratorDemo.decoratorDemo ();
		
		//FacadeDemo.facadeDemo();
		
		//FlyweightDemo.flyweightDemo ();
		
		//ProxyDemo.proxyDemo ();
		
		ChainOfResponsibilityDemo.chainOfResponsibilityDemo ();
	}

}
