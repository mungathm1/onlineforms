package io.onlineform.authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.onlineform.authentication.entity.UserProfile;
import io.onlineform.authentication.repository.UserProfileRepository;

@RestController
@RequestMapping("/v1/rest/auth")
public class AuthenticationController {

	@Autowired
	private UserProfileRepository userProfileRepository;

	@SuppressWarnings("rawtypes")
	@CrossOrigin(origins = "*")
	@RequestMapping(method = RequestMethod.GET, value = "/findAllProfiles")
	public ResponseEntity findAllUsers() {
		HttpHeaders responseHeaders = new HttpHeaders();
		return ResponseEntity.ok().headers(responseHeaders).body(userProfileRepository.findAll());
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(method = RequestMethod.POST, value = "/userregistration")
	public ResponseEntity<UserProfile> selfRegistration(@RequestBody UserProfile userProfile) {
		HttpHeaders responseHeaders = new HttpHeaders();
		return ResponseEntity.ok().headers(responseHeaders).body(userProfileRepository.save(userProfile));

	}

}
