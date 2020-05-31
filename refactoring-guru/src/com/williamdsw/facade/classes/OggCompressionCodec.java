package com.williamdsw.facade.classes;

public class OggCompressionCodec implements ICodec {
	
	private String type = "ogg";

	@Override
	public String getType() {
		return this.type;
	}

}
