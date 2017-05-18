/***************************************************************************************************
*   @클래스명  : AppServiceInfo.java
*   @패키지명  : com.alexbaek.common.domain.model
*   @작성자	: 백우영
*   @작성일	: 2017. 5. 18. 오후 2:39:11
************************** @수정이력 ****************************************************************
*  수정일    수정자   수정내용
*     
***************************************************************************************************/
package com.alexbaek.common.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * The Class AppServiceInfo.java.
 * 설명 :
 *
 * @author 백우영
 * @version 1.0
 */
@Data
@Entity
@Table(name="APP_COMMON_SERVICE_INFO")
public class AppServiceInfo {
	
	@Id
    @Column(name = "SERVICE_ID", unique = true)
    private int serviceId;

    @Column(name = "SERVICE_TYPE")
    private String serviceType;
    
    @Column(name = "SERVICE_NAME")
    private String serviceName;
    
    @Column(name = "SERVICE_PACKAGE")
    private String servicePackage;
    
    @Column(name = "SERVICE_VERSION")
    private String serviceVersion;
    
    @Column(name = "SERVICE_UPDATE_URL")
    private String serviceUpdateUrl;
    
    @Column(name = "SERVICE_REG_DATE")
    private String serviceRegDate;
}
