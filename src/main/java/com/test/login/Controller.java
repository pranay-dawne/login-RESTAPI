package com.test.login;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private Repository repository;
	
	@GetMapping("/getLoginRecords")
	public ResponseEntity<?> getLoginRecords(@QueryParam(value = "userId") String userId){
		try {
			LoginModel loginData = repository.getLoginInfo(userId);
			return ResponseEntity.ok(loginData);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}

}
