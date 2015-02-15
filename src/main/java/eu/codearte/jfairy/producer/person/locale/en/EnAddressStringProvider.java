package eu.codearte.jfairy.producer.person.locale.en;

import eu.codearte.jfairy.producer.person.Address;
import eu.codearte.jfairy.producer.person.AddressStringProvider;

/**
 * @author omaciaszek
 * @since 15.02.15
 */
public class EnAddressStringProvider implements AddressStringProvider {

	@Override
	public String addressString(Address address) {
		return address.streetNumber() + " " + address.street() + " Str." + apartmentString(address)
				+ ", " + address.getPostalCode() + " " + address.getCity();
	}

	private String apartmentString(Address address) {
		String apartmentString;
		if (address.apartmentNumber().equals("")) {
			apartmentString = "";
		} else {
			apartmentString = " No. " + address.apartmentNumber();
		}
		return apartmentString;
	}
}
