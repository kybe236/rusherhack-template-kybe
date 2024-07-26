package org.kybe;

import org.rusherhack.client.api.plugin.Plugin;

/**
 * Example rusherhack plugin
 *
 * @author John200410
 */
public class ExamplePlugin extends Plugin {
	
	@Override
	public void onLoad() {
		
		//logger
		this.getLogger().info("[KYBE's PLUGIN] STARTED");
	}
	
	@Override
	public void onUnload() {
		this.getLogger().info("[KYBE's PLUGIN] STOPPED");
	}
	
}