/**
 *
 */
package com.payment.service;

import com.payment.entity.Customer;
import com.payment.entity.CustomerBillingInformation;
import java.util.List;
/**
 *
 * @author Suryakanta Sahoo
 */
public interface CustomerService {

    List<Customer> getCustomerDetails();

    List<CustomerBillingInformation> getCustomerBillingInformation();

}
