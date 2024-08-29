package Service;

import Model.Account;
import DAO.AccountDAO;

public class AccountService {
    private AccountDAO accountDAO;

    public AccountService(){
        accountDAO = new AccountDAO();
    }

    public AccountService(AccountDAO accountDAO){
        this.accountDAO = accountDAO;
    }
    
    public Account registerAccount(Account account) {
        if (account.getUsername() != "" && account.getPassword().length() >=4) {
            return accountDAO.regiseterAccount(account);
        }
        return null;
    }

    public Account retrieveAccount(Account account){
        if (checkAccountExists(account) != null) {
            return accountDAO.verifyAccount(account);
        }
        return null;
    }

    public Account checkAccountExists(Account account){
        return accountDAO.checkAccountExists(account);
    }
}
