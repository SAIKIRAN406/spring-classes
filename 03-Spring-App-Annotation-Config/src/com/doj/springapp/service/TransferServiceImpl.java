/**
 * 
 */
package com.doj.springapp.service;

import org.springframework.stereotype.Service;

import com.doj.springapp.model.Account;
import com.doj.springapp.repository.AccountRepository;

/**
 * @author Dinesh.Rajput
 *
 */
@Service("transferService")
public class TransferServiceImpl implements TransferService{
	
	AccountRepository accountRepository;
	
	public TransferServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}
	
	@Override
	public void transfer(Long amount, Long a, Long b){
		Account accountA = accountRepository.findAccountById(a);
		Account accountB = accountRepository.findAccountById(b);
		System.out.println("Amount has been transfered from "+accountA +" to "+accountB);
	}
}
