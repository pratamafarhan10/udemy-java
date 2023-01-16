package service;

import java.math.BigDecimal;

import pojo.Checking;
import repository.AccountRepository;

public class CheckingService implements AccountService{
        
    private AccountRepository accountRepository;

    public CheckingService(AccountRepository repository){
        this.accountRepository = repository;
    }

    public void createAccount(Checking account) {
        this.accountRepository.createAccount(account);
    }

    public Checking retrieveAccount(String id) {
        return (Checking) this.accountRepository.retrieveAccount(id).clone();
    }

    public void updateAccount(Checking account) {
        this.accountRepository.updateAccount(account);
    }

    public void deleteAccount(String id) {
        this.accountRepository.deleteAccount(id);
    }

    @Override
    public void deposit(String id, BigDecimal amount) {
        Checking check = this.retrieveAccount(id);
        check.setBalance(check.getBalance().add(amount));
        this.updateAccount(check);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        Checking check = this.retrieveAccount(id);
        check.setBalance(check.getBalance().subtract(amount));
        this.updateAccount(check);
    }

}
