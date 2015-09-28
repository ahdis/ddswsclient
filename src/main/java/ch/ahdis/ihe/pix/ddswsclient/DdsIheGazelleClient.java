/*******************************************************************************
 *
 * The authorship of this code is held by ahdis gmbh, Switzerland.
 * All rights reserved. http://ahdis.ch
 *
 * This code is made available under the terms of the Eclipse Public License v1.0.
 *
 * Year of publication: 2015
 *
 *******************************************************************************/
package ch.ahdis.ihe.pix.ddswsclient;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Random;

import ch.ahdis.ihe.pix.ddswsclient.ws.DemographicDataServer;
import ch.ahdis.ihe.pix.ddswsclient.ws.DemographicDataServerService;
import ch.ahdis.ihe.pix.ddswsclient.ws.Patient;

//  wsimport -s ./src/main/java -p ch.ahdis.ihe.pix.ddswsclient.ws  ./src/main/resources/DemographicDataServerService.wsdl

public class DdsIheGazelleClient {

	/**
	 * @param args
	 * @throws RemoteException
	 */
	public static void main(String[] args) {

		DemographicDataServer demographicDataServer = new DemographicDataServerService().getDemographicDataServerPort();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		Random rand = new Random();

		// BindingProvider bp = (BindingProvider) demographicDataServer;
		// http://gazelle.ihe.net/DDS-prod-DemographicDataServer-ejb/DemographicDataServerBean
		// bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
		//		"http://localhost:8300/DDS-prod-DemographicDataServer-ejb/DemographicDataServerBean");

		for (int i = 1; i < 2500; ++i) {
			try {
				Patient patient = demographicDataServer.returnPatient("CH", true, true, false, false, true, true,
						"", "", "", "", "");
				try {
					GregorianCalendar dateOfBirth = patient.getPerson().getDateOfBirth().toGregorianCalendar();
					formatter.setTimeZone(dateOfBirth.getTimeZone());
					String dateString = formatter.format(dateOfBirth.getTime());
					if (patient.getPerson().getOtherFirstNameSexList() != null
							&& patient.getPerson().getOtherFirstNameSexList().size() > 0) {
						System.out.println("" + i + ","
								+ patient.getPerson().getOtherFirstNameSexList().get(0).getFirstName() + ","
								+ patient.getPerson().getLastName().getValue() + ","
								+ patient.getAddress().get(0).getStreet().getValue() + " " + (rand.nextInt(100) + 1)
								+ "," + patient.getAddress().get(0).getCity().getValue() + ","
								+ patient.getAddress().get(0).getPostalCode() + "," + "" + "," + dateString
								+ ",9,10,11,"
								+ patient.getPerson().getOtherFirstNameSexList().get(0).getGender().getDescription()
								+ "," + patient.getDdsPatientIdentifier() + "," + patient.getAddress().get(0).getLattitude() + ","
								+ patient.getAddress().get(0).getLongitude());
					} else {
						--i;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				Thread.sleep(1900);
			}

			catch (Exception e) {
				try {
					e.printStackTrace();
					Thread.sleep(1900);
				} catch (InterruptedException e1) {
					e.printStackTrace();
				}
			}
		}

	}

}
