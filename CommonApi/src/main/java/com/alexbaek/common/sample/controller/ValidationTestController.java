/***************************************************************************************************
*   @클래스명  : ValidationTestController.java
*   @패키지명  : com.alexbaek.common.sample.controller
*   @작성자	: 백우영
*   @작성일	: 2017. 5. 22. 오전 9:41:02
************************** @수정이력 ****************************************************************
*  수정일    수정자   수정내용
*     
***************************************************************************************************/
package com.alexbaek.common.sample.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alexbaek.common.sample.vo.ValidationTestVO;

/**
 * The Class ValidationTestController.java.
 * 설명 : Validation TEST Controller.
 *
 * @author 백우영
 * @version 1.0
 */
@Controller
@RequestMapping("/validationTest")
public class ValidationTestController {
	
	@GetMapping("")
    public String showForm(ValidationTestVO validationTestVO) {
        return "sample/validationTestForm";
    }
	
	@PostMapping("")
    public String checkPersonInfo(@Valid ValidationTestVO validationTestVO, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "sample/validationTestForm";
        }

        return "sample/validationTestResult";
    }
}
