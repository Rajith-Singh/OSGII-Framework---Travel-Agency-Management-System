package transistpass_consumer_;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;


import transistpassservice_publisher_.PublisherTransit;

public class Activator implements BundleActivator {
	ServiceReference serviceReference;

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
	
		System.out.println(" --- WELCOME TO SeethawakaTravels Bus Service ---");
		serviceReference = context.getServiceReference(PublisherTransit.class.getName());
		PublisherTransit transist = (PublisherTransit) context.getService(serviceReference);
		
		Scanner input  = new Scanner(System.in);
		transist.viewTransistCharges();
		transist.createBusTicket();
	
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("service Stop");
	}

}
