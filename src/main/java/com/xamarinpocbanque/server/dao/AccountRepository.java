package com.xamarinpocbanque.server.dao;

import org.springframework.data.repository.CrudRepository;

import com.xamarinpocbanque.server.entity.Account;

public interface AccountRepository extends CrudRepository<Account, Long>  {

}
