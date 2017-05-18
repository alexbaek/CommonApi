/***************************************************************************************************
*   @클래스명  : AppServiceInfoRepository.java
*   @패키지명  : com.alexbaek.common.domain.repository
*   @작성자	: 백우영
*   @작성일	: 2017. 5. 18. 오후 2:33:58
************************** @수정이력 ****************************************************************
*  수정일    수정자   수정내용
*     
***************************************************************************************************/
package com.alexbaek.common.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alexbaek.common.domain.model.AppServiceInfo;

/**
 * The Class AppServiceInfoRepository.java.
 * 설명 : 
 *
 * @author 백우영
 * @version 1.0
 */
@Repository
public interface AppServiceInfoRepository extends CrudRepository<AppServiceInfo, Integer> {

}
