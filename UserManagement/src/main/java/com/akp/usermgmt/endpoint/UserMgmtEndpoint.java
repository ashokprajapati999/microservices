package com.akp.usermgmt.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.akp.usermgmt.domain.DemoUser;
import com.akp.usermgmt.service.UserMgmtService;

@RestController
@RequestMapping("/users")
public class UserMgmtEndpoint {
	
	@Autowired
	UserMgmtService userMgmtService;
	
	@RequestMapping(value="/{userId}", method = RequestMethod.GET, produces = "application/json")
	public DemoUser findUserById(@PathVariable("userId") String userId) {
		DemoUser user = userMgmtService.findByUserId(userId);
		return user;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = "application/json")
	public String createUser(@RequestBody DemoUser user) {
		userMgmtService.saveUser(user);
		return "UserId: "+user.getId();
	}
}
