package com.test.login;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<LoginModel, String> {
	
	@Query(value = "select * from login l where l.user_id=?1", nativeQuery = true)
	public LoginModel getLoginInfo(String userId);

}
