package com.service.higoDB.controller;

import java.util.HashMap;

import org.springframework.stereotype.Component;
@Component
public class DiscountImlp implements Discount{

	HashMap<String, String> DiscountInfo = new HashMap<String, String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			put("beijing","9.0");
			put("shanghai","8.0");
		}
	};
	@Override
	public String getDiscount(String location) {
		return DiscountInfo.get(location);
	}

}
