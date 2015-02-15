package eu.codearte.jfairy.producer.person;

import javax.inject.Singleton;

/**
 * @author omaciaszek
 * @since 15.02.15
 */
@Singleton
public interface AddressStringProvider {

	String addressString(Address address);

}
