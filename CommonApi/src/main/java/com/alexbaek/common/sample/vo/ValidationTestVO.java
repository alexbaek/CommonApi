/***************************************************************************************************
*   @클래스명  : ValidationTestVO.java
*   @패키지명  : com.alexbaek.common.sample.vo
*   @작성자	: 백우영
*   @작성일	: 2017. 5. 22. 오전 9:58:51
************************** @수정이력 ****************************************************************
*  수정일    수정자   수정내용
*     
***************************************************************************************************/
package com.alexbaek.common.sample.vo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * The Class ValidationTestVO.java.
 * 설명 :
 *
 * @author 백우영
 * @version 1.0
 */
@Data
public class ValidationTestVO {
	
	@NotNull
	@Size(min=2, max=30)
	private String name;
	
	@NotNull
	@Min(18)
	private Integer age;
}
