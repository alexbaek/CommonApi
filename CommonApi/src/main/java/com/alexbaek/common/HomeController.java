/***************************************************************************************************
*   @클래스명  : HomeController.java
*   @패키지명  : com.alexbaek.common
*   @작성자	: 백우영
*   @작성일	: 2017. 5. 16. 오후 5:16:11
************************** @수정이력 ****************************************************************
*  수정일    수정자   수정내용
*     
***************************************************************************************************/
package com.alexbaek.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The Class HomeController.java.
 * 설명 :
 *
 * @author 백우영
 * @version 1.0
 */
@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String hello(Model model) {
		model.addAttribute("message", "Hello from the controller");
		return "resultPage";
	}
}
