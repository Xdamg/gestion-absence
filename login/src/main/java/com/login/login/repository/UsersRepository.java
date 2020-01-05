package com.login.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.login.model.Users;

public interface UsersRepository extends JpaRepository<Users , Integer> {

}
