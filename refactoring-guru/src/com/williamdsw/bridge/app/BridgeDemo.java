package com.williamdsw.bridge.app;

import com.williamdsw.bridge.classes.AdvanceRemote;
import com.williamdsw.bridge.classes.BasicRemote;
import com.williamdsw.bridge.classes.Device;
import com.williamdsw.bridge.classes.Radio;
import com.williamdsw.bridge.classes.Television;

public class BridgeDemo {
	
	private static void testDevice (Device device) {
		System.out.println ("Tests with basic remote");
		BasicRemote basicRemote = new BasicRemote (device);
		basicRemote.power ();
		device.printStatus ();
		
		System.out.println ("Tests with advanced remote");
		AdvanceRemote advanceRemote = new AdvanceRemote (device);
		advanceRemote.power ();
		advanceRemote.mute ();
		device.printStatus ();
	}
	
	public static void bridgeDemo () {
		testDevice (new Television ());
		testDevice (new Radio ());
	}

}
