/***************************************************************************************************
*   @클래스명  : SampleController.java
*   @패키지명  : com.alexbaek.common.sample.controller
*   @작성자	: 백우영
*   @작성일	: 2017. 5. 17. 오후 4:07:04
************************** @수정이력 ****************************************************************
*  수정일    수정자   수정내용
*     
***************************************************************************************************/
package com.alexbaek.common.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alexbaek.common.domain.model.Customer;
import com.alexbaek.common.sample.service.SampleService;

/**
 * The Class SampleController.java.
 * 설명 :
 *
 * @author 백우영
 * @version 1.0
 */
@RequestMapping("/sample/user")
@Controller
public class SampleController {
	
	@Autowired
	private SampleService sampleService;

	@RequestMapping("/sample/user/list")
	public String getUserList(Model model) {
		model.addAttribute("message", "Hello from the controller");
		return "resultPage";
	}
	
	/**
	 * Comment : Sample
	 * Date	: 2017. 5. 17.
	 * @return List<User>
	 * @param _sName
	 * @return
	 */
	@RequestMapping(value="/add", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
    public List<Customer> addUser(@RequestParam(value="name", required=false, defaultValue="") String name) {
        Customer user = new Customer();
        user.setUserName(name);
        
        sampleService.addUser(user);
        
        return sampleService.findAllByOrderByUserNoAsc();
    }
	
	
	
//    @RequestMapping(value="/find", method = RequestMethod.GET)
//    public User findUser(@RequestParam(value="userNo", required=false, defaultValue="0") long _userNo) {
//        User user = userRepository.findOne(_userNo);
//        return user;
//    }
    
}
