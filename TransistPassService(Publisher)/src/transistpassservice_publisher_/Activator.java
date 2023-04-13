package transistpassservice_publisher_;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {

	private static BundleContext context;
	ServiceRegistration registration;


	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		System.out.println("TransistPass Server Start");
		PublisherTransit transist = new PublisherTransitImpl();
		registration = context.registerService(PublisherTransit.class.getName(),transist,null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Stop TransistPass Server");
		registration.unregister();	
	}

}
