package com.williamdsw.abstract_factory.factories;

import com.williamdsw.abstract_factory.buttons.IButton;
import com.williamdsw.abstract_factory.buttons.WindowsButton;
import com.williamdsw.abstract_factory.checkboxes.ICheckbox;
import com.williamdsw.abstract_factory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements IGUIFactory {

	@Override
	public IButton createButton () {
		return new WindowsButton ();
	}

	@Override
	public ICheckbox createCheckbox () {
		return new WindowsCheckbox ();
	}

}
