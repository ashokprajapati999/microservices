package com.akp.usermgmt.service;

import com.akp.usermgmt.domain.DemoUser;

public interface UserMgmtService {
	public void saveUser(DemoUser user);
	public DemoUser findByUserId(String userId);
	public void deleteUser(String userId);
}
