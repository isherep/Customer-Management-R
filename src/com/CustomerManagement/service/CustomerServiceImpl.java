package com.CustomerManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.CustomerManagement.dao.CustomerDAO;
import com.CustomerManagement.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	//inject the customer DAO
	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		customerDAO.saveCustomer(theCustomer);		
	}

	@Override
	@Transactional
	public Customer getCustomer(int theCustomerId) {
		
		return customerDAO.getCustomer(theCustomerId);
	}

	@Override
	@Transactional
	public void DeleteCustomer(int theCustomerId) {
		customerDAO.DeleteCustomer(theCustomerId);
		
	}

}
