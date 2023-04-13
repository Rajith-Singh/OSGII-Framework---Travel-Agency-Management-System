package tourmaster_consumer_;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import tourmasterservice_publisher_.PublisherTour;


public class Activator implements BundleActivator {

	private static BundleContext context;
	ServiceReference serviceReference;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		System.out.println(" --- WELCOME TO SeethawakaTravels Beautiful Tour ---");
		serviceReference = context.getServiceReference(PublisherTour.class.getName());
		PublisherTour tour = (PublisherTour) context.getService(serviceReference);
		
		Scanner input  = new Scanner(System.in);
		tour.viewTourCharges();
		tour.calculateTourTicket();
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("service Stop");
	}

}
