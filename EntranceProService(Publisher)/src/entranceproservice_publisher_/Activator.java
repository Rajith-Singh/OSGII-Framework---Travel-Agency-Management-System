package entranceproservice_publisher_;

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
		System.out.println("Start Server");
		PublisherEntrance reg = new PublisherEntranceImpl();
		registration = context.registerService(PublisherEntrance.class.getName(),reg,null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Stop Server");
		registration.unregister();	}

}
