package com.huahcoding.bundles;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	public static BundleContext bc = null;
	private HelloWorldThread thread = null;

	@Override
	public void start(BundleContext bc) throws Exception {
		Activator.bc = bc;
		System.out.println("SimpleBundle starting...");
		thread = new HelloWorldThread();
		thread.start();

	}

	@Override
	public void stop(BundleContext arg0) throws Exception {
		Activator.bc = null;
		System.out.println("SimpleBundle stopping...");
		thread.stopThread();
		thread.join();

	}

}
