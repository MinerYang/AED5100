/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.*;
/**
 *
 * @author cestdrama
 */
public class AccountDirectory {
   private ArrayList<Account> accountList;

   public AccountDirectory() {
        this.accountList = new ArrayList<Account>();
    }

   //
   public ArrayList<Account> getAccountList() {
        return accountList;
    }

   public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }
   
   
   //
   public Account addAcc(){
       Account account = new Account();
       accountList.add(account);
       return account;
   }
   
   public void deleteAcc(Account account){
       accountList.remove(account);
   }
   
   public Account accSearch(String accountnumber){
       for(Account account:accountList){
           if(account.getAccnum().equals(accountnumber)){
               return account;
           }
       }
       return null;  //no match return null
   }
}
