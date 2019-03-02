package com.akp.usermgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akp.usermgmt.domain.DemoUser;
import com.akp.usermgmt.repo.mongo.UserRepository;

@Service
public class UserMgmtServiceImpl implements UserMgmtService{
	@Autowired
	UserRepository userRepo;
	
	@Override
	public void saveUser(DemoUser user) {
		userRepo.save(user);
	}

	@Override
	public DemoUser findByUserId(String userId) {
		return userRepo.findByUserId(userId);
	}

	@Override
	public void deleteUser(String userId) {
		DemoUser user = userRepo.findByUserId(userId);
		userRepo.delete(user);
	}

}
