package railwayjourney_consumer_;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import railwayjourneyservice_publisher_.PublisherRailway;



public class Activator implements BundleActivator {

	private static BundleContext context;
	ServiceReference serviceReference;


	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		System.out.println(" --- WELCOME TO SeethawakaTravels Train Joureny ---");
		serviceReference = context.getServiceReference(PublisherRailway.class.getName());
		
		PublisherRailway train = (PublisherRailway) context.getService(serviceReference);
		
		Scanner input  = new Scanner(System.in);
		train.viewTrainJourneyCharges();
		train.calculateTrainTicket();
		train.reachingTime();
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("service Stop");
	}

}
