package com.akp.usermgmt.repo.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.akp.usermgmt.domain.DemoUser;

@Repository
public interface UserRepository extends MongoRepository<DemoUser, String>{
	@Query("{ 'userId' : ?0 }")
	public DemoUser findByUserId(String userId);
}
