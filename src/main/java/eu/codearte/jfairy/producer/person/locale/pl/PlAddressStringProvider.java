package eu.codearte.jfairy.producer.person.locale.pl;

import eu.codearte.jfairy.producer.person.Address;
import eu.codearte.jfairy.producer.person.AddressStringProvider;

/**
 * @author omaciaszek
 * @since 15.02.15
 */
public class PlAddressStringProvider implements AddressStringProvider {

	@Override
	public String addressString(Address address) {
		return
				"ul. " + address.street() + " " + address.streetNumber() + apartmentString(
						address) + ", " + address.getPostalCode()
						+ " " + address.getCity();
	}

	private String apartmentString(Address address) {
		String apartmentString;
		if (address.apartmentNumber().equals("")) {
			apartmentString = "";
		} else {
			apartmentString = " lok. " + address.apartmentNumber();
		}
		return apartmentString;
	}
}
