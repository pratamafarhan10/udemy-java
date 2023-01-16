package service;

import java.math.BigDecimal;

import pojo.Credit;
import repository.AccountRepository;

public class CreditService implements AccountService {

    private AccountRepository accountRepository;

    public CreditService(AccountRepository repository){
        this.accountRepository = repository;
    }

    public void createAccount(Credit account) {
        this.accountRepository.createAccount(account);
    }

    public Credit retrieveAccount(String id) {
        return (Credit) this.accountRepository.retrieveAccount(id).clone();
    }

    public void updateAccount(Credit account) {
        this.accountRepository.updateAccount(account);
    }

    public void deleteAccount(String id) {
        this.accountRepository.deleteAccount(id);
    }

    @Override
    public void deposit(String id, BigDecimal amount) {
        Credit credit = this.retrieveAccount(id);
        credit.setCredit(credit.getCredit().subtract(amount));
        this.updateAccount(credit);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        Credit credit = this.retrieveAccount(id);
        credit.setCredit(credit.getCredit().add(amount));
        this.updateAccount(credit);
    }

}
