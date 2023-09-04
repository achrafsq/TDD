package controller;

import exception.BalanceException;
import exception.DuplicataAccountException;
import lombok.Builder;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Builder
public class Account {

    private String cin;
    @Builder.Default
    private Double balance = 0d ;

    @Builder.Default
    private boolean isRich = false;

//    public Double addAmount(String cin , Integer amount) {
//        Set<Account> setaccount = new HashSet<>();
//        Account account =  Account.builder().cin(cin).balance(balance + amount).build();
//
//        if (setaccount.contains(account)) { throw  new DuplicataAccountException("Acount duplicate");
//        }else{setaccount.add(account); }
//
//
//        return account.getBalance();
//    }

    public Boolean addAmount(String cin , Integer amount) {
        Set<Account> setaccount = new HashSet<>();
        Account account =  Account.builder().cin(cin).balance(balance + amount).build();

        if (setaccount.contains(account)) { throw  new DuplicataAccountException("Acount duplicate");
        }else{setaccount.add(account); }

        if(account.getBalance()>10000) {
            account.isRich = true;
        }

        return account.isRich;
    }


    public void withdrawal(String cin, double amount) throws BalanceException {
        Set<Account> setaccount = new HashSet<>();
        Account account = new Account("cin123",5000d , true);
        if(account.getBalance() < amount){
            throw new BalanceException("amount is bigger balance") ;
        }else{
            Account.builder().cin(cin).balance(balance - amount).build();
        }



    }
}
