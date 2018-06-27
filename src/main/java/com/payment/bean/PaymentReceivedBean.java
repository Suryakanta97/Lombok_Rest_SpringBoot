/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payment.bean;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Suryakanta Sahoo
 */
@Data
@Getter 
@Setter
public class PaymentReceivedBean {

	
    private String customerId;
	
    private Date customerBillingDate;
	
    private BigDecimal payAmount;

}
