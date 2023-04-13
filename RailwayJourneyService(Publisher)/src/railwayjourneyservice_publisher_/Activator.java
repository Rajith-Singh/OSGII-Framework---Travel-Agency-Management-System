package railwayjourneyservice_publisher_;

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
		System.out.println("RailwayJourney Server Start");
		PublisherRailway train = new PublisherRailwayImpl();
		registration = context.registerService(PublisherRailway.class.getName(),train,null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Stop RailwayJoureny Server");
		registration.unregister();
	}

}
