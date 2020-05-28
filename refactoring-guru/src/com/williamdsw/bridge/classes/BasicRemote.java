package com.williamdsw.bridge.classes;

public class BasicRemote implements Remote {
	
	// FIELDS
	
	protected Device device;
	
	// CONSTRUCTORS
	
	public BasicRemote () {}
	public BasicRemote (Device device) {
		this.device = device;
	}
	
	// OVERRIDED FUNCTIONS

	@Override
	public void power () {
		System.out.println ("Remote: power toggle");
		if (device.isEnabled ()) {
			device.disabled ();
		}
		else {
			device.enable ();
		}
	}

	@Override
	public void volumeDown () {
		System.out.println ("Remote: volume down");
		device.setVolume (device.getVolume () - 10);
	}

	@Override
	public void volumeUp () {
		System.out.println ("Remote: volume up");
		device.setVolume (device.getVolume () + 10);
	}

	@Override
	public void channelDown () {
		System.out.println ("Remote: channel down");
		device.setChannel (device.getChannel () - 1);
	}

	@Override
	public void channelUp () {
		System.out.println ("Remote: channel up");
		device.setChannel (device.getChannel () + 1);
	}

}
