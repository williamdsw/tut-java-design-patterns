package com.williamdsw.abstract_factory.factories;

import com.williamdsw.abstract_factory.buttons.IButton;
import com.williamdsw.abstract_factory.buttons.LinuxButton;
import com.williamdsw.abstract_factory.checkboxes.ICheckbox;
import com.williamdsw.abstract_factory.checkboxes.LinuxCheckbox;

public class LinuxFactory implements IGUIFactory {

	@Override
	public IButton createButton () {
		return new LinuxButton ();
	}

	@Override
	public ICheckbox createCheckbox () {
		return new LinuxCheckbox ();
	}
	
}
