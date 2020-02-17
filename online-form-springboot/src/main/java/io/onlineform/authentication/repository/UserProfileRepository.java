package io.onlineform.authentication.repository;

import org.springframework.data.repository.CrudRepository;

import io.onlineform.authentication.entity.UserProfile;

public interface UserProfileRepository extends CrudRepository<UserProfile, Integer> {

}
