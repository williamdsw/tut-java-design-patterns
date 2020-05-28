package com.williamdsw.abstract_factory.factories;

import com.williamdsw.abstract_factory.buttons.IButton;
import com.williamdsw.abstract_factory.checkboxes.ICheckbox;

public interface IGUIFactory {
	
	public IButton createButton ();
	public ICheckbox createCheckbox ();
	
}
