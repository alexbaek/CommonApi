/***************************************************************************************************
*   @클래스명  : SampleService.java
*   @패키지명  : com.alexbaek.common.sample.service
*   @작성자	: 백우영
*   @작성일	: 2017. 5. 17. 오후 4:07:16
************************** @수정이력 ****************************************************************
*  수정일    수정자   수정내용
*     
***************************************************************************************************/
package com.alexbaek.common.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alexbaek.common.domain.model.Customer;
import com.alexbaek.common.domain.repository.CustomerRepository;

/**
 * The Class SampleService.java.
 * 설명 :
 *
 * @author 백우영
 * @version 1.0
 */
@Service
public class SampleService {
	
	@Autowired
	private CustomerRepository userRepository;
	
	@Transactional
	public List<Customer> findAllByOrderByUserNoAsc() {
		return userRepository.findAllByOrderByUserNoAsc();
	}
	
	@Transactional
	public void addUser(Customer user) {
		userRepository.save(user);
	}
	
}
