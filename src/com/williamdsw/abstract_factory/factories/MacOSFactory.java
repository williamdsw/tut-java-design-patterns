package com.williamdsw.abstract_factory.factories;

import com.williamdsw.abstract_factory.buttons.IButton;
import com.williamdsw.abstract_factory.buttons.MacOSButton;
import com.williamdsw.abstract_factory.checkboxes.ICheckbox;
import com.williamdsw.abstract_factory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements IGUIFactory {

	@Override
	public IButton createButton () {
		return new MacOSButton ();
	}

	@Override
	public ICheckbox createCheckbox () {
		return new MacOSCheckbox ();
	}

}
