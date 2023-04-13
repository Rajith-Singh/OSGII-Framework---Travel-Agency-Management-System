package tourmasterservice_publisher_;

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
		System.out.println("TourMaster Server Start");
		PublisherTour tour = new PublisherTourImpl();
		registration = context.registerService(PublisherTour.class.getName(),tour,null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Stop TourMaster Server");
		registration.unregister();
	}

}
