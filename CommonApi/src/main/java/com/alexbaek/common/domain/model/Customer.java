/***************************************************************************************************
*   @클래스명  : User.java
*   @패키지명  : com.alexbaek.common.domain.model
*   @작성자	: 백우영
*   @작성일	: 2017. 5. 17. 오후 3:46:54
************************** @수정이력 ****************************************************************
*  수정일    수정자   수정내용
*     
***************************************************************************************************/
package com.alexbaek.common.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * The Class Customer.java.
 * 설명 :
 *
 * @author 백우영
 * @version 1.0
 */
@Data
@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_no")
    private Long userNo;

    @Column(name = "user_name", unique = true, length = 64)
    private String userName;
    
}
