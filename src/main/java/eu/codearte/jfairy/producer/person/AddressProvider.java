package eu.codearte.jfairy.producer.person;

import com.google.inject.Provider;
import eu.codearte.jfairy.data.DataMaster;
import eu.codearte.jfairy.producer.BaseProducer;

import javax.inject.Inject;

class AddressProvider implements Provider<Address> {

	private static final String POSTAL_CODE_FORMAT = "postal_code";

	private static final String CITY = "city";

	private static final String STREET = "street";

	private final BaseProducer baseProducer;

	private final DataMaster dataMaster;

	@Inject
	public AddressProvider(DataMaster dataMaster, BaseProducer baseProducer) {
		this.baseProducer = baseProducer;
		this.dataMaster = dataMaster;
	}

	@Override
	public Address get() {
		String postalCodeFormat = dataMaster.getRandomValue(POSTAL_CODE_FORMAT);

		String city = dataMaster.getRandomValue(CITY);
		String street = dataMaster.getRandomValue(STREET);
		String postalCode = baseProducer.numerify(postalCodeFormat);
		String streetNumber = String.valueOf(baseProducer.randomInt(25));
		String apartmentNumber = baseProducer.trueOrFalse() ? String.valueOf(baseProducer.randomInt(350)) : "";

		return new Address(postalCode, city, street, streetNumber, apartmentNumber);
	}

}
