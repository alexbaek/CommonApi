/***************************************************************************************************
*   @클래스명  : AppInfoService.java
*   @패키지명  : com.alexbaek.common.api.appinfo.service
*   @작성자	: 백우영
*   @작성일	: 2017. 5. 16. 오후 5:07:26
************************** @수정이력 ****************************************************************
*  수정일    수정자   수정내용
*     
***************************************************************************************************/
package com.alexbaek.common.api.appinfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexbaek.common.domain.model.AppServiceInfo;
import com.alexbaek.common.domain.repository.AppServiceInfoRepository;

/**
 * The Class AppInfoService.java.
 * 설명 :
 *
 * @author 백우영
 * @version 1.0
 */
@Service
public class AppInfoService {
	
	@Autowired
	private AppServiceInfoRepository appServiceInfoRepository;
	
	/**
	 * Comment : 서비스 정보 조회 TEST
	 * Date	: 2017. 5. 18.
	 * @return AppServiceInfo
	 * @param serviceId
	 * @return
	 */
	public AppServiceInfo getServiceInfoTest(int serviceId) {
		return appServiceInfoRepository.findOne(serviceId);
	}
}
