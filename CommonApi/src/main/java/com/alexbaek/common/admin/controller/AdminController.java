/***************************************************************************************************
*   @클래스명  : AdminController.java
*   @패키지명  : com.alexbaek.common.admin.controller
*   @작성자	: 백우영
*   @작성일	: 2017. 5. 18. 오후 2:33:09
************************** @수정이력 ****************************************************************
*  수정일    수정자   수정내용
*     
***************************************************************************************************/
package com.alexbaek.common.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The Class AdminController.java.
 * 설명 :
 *
 * @author 백우영
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	/**
	 * Comment : Test 페이지.
	 * Date	: 2017. 5. 18.
	 * @return String
	 * @param model
	 * @return
	 */
	@RequestMapping("/test")
	public String test(Model model) {
		model.addAttribute("message", "Hello from the controller");
		return "admin/test";
	}
	
	/**
	 * Comment : Main 페이지.
	 * Date	: 2017. 5. 19.
	 * @return String
	 * @param model
	 * @return
	 */
	@RequestMapping("")
	public String main(Model model) {
		model.addAttribute("message", "Hello from the controller");
		return "admin/login";
	}
}
