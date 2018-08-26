package com.ibank.models;

import java.util.Date;

public class Account {
    private Long id;
    private Long accountNo;
    private AccountType type;
    private Double balance;
    private Date dateOfOpening;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getDateOfOpening() {
        return dateOfOpening;
    }

    public void setDateOfOpening(Date dateOfOpening) {
        this.dateOfOpening = dateOfOpening;
    }
}
