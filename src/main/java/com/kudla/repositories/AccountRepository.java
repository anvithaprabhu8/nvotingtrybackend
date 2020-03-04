package com.kudla.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kudla.entities.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

	@Query("Select a from Account a where a.username = ?1")
	public Account getAccount(String username);
}
