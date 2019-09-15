package com.uee.boc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uee.boc.mapping.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>  {

	public User findByEmail(String email);

	public User findByPassword(String password);

	public User findByEmailAndPassword(String email, String password);
}
