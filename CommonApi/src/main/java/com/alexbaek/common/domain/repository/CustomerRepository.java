/***************************************************************************************************
*   @클래스명  : UserRepository.java
*   @패키지명  : com.alexbaek.common.jpa.repository
*   @작성자	: 백우영
*   @작성일	: 2017. 5. 17. 오후 2:16:43
************************** @수정이력 ****************************************************************
*  수정일    수정자   수정내용
*     
***************************************************************************************************/
package com.alexbaek.common.domain.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alexbaek.common.domain.model.Customer;

/**
 * The Class CustomerRepository.java.
 * 설명 :
 *
 * @author 백우영
 * @version 1.0
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{
	
	public List<Customer> findAllByOrderByUserNoAsc();
}
