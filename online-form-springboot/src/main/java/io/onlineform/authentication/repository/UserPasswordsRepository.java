package io.onlineform.authentication.repository;

import org.springframework.data.repository.CrudRepository;

import io.onlineform.authentication.entity.UserPasswords;

public interface UserPasswordsRepository extends CrudRepository<UserPasswords, Integer> {

}
