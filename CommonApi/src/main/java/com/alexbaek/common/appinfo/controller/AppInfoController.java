/***************************************************************************************************
*   @클래스명  : AppInfoController.java
*   @패키지명  : com.alexbaek.common.appinfo.controller
*   @작성자	: 백우영
*   @작성일	: 2017. 5. 16. 오전 10:20:34
************************** @수정이력 ****************************************************************
*  수정일    수정자   수정내용
*     
***************************************************************************************************/
package com.alexbaek.common.appinfo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alexbaek.common.appinfo.service.AppInfoService;
import com.alexbaek.common.domain.model.AppServiceInfo;

/**
 * The Class AppInfoController.java.
 * 설명 :
 *
 * @author 백우영
 * @version 1.0
 */
@RestController
public class AppInfoController {
	
	private static final Logger logger = LoggerFactory.getLogger(AppInfoController.class);
	
	@Autowired
	private AppInfoService appInfoService;
	
	/**
	 * Comment : App 서비스 정보 조회 TEST API.
	 * Date	: 2017. 5. 16.
	 * @return void
	 * @param serviceId
	 */
	@RequestMapping(value = "/getAppInfoTest/{serviceId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public AppServiceInfo getAppInfoTest(@PathVariable int serviceId) {
		
		logger.debug("==================== param :: {} ====================", serviceId);
		
		AppServiceInfo result = appInfoService.getServiceInfoTest(serviceId);
		
		logger.debug("==================== result :: {} ====================", result.toString());
		
		return result;
	}
	
	@RequestMapping("/test")
    public void greeting(@RequestParam(value="name", defaultValue="World") String name) {
        // return new Greeting(counter.incrementAndGet(),String.format(template, name));
    }
}
