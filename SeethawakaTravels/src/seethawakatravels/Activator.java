package seethawakatravels;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import entranceproservice_publisher_.PublisherEntrance;


public class Activator implements BundleActivator {
	ServiceReference serviceReference;

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		System.out.println(" --- WELCOME TO SeethawakaTravels Agency ---");
		serviceReference = context.getServiceReference(PublisherEntrance.class.getName());
		PublisherEntrance entrance = (PublisherEntrance) context.getService(serviceReference);
		
		Scanner input  = new Scanner(System.in);
		entrance.viewEntranceCharges();
		entrance.calculateEntrenceTicket();
		}


	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("service Stop");
	}

}
