package kr.co.fastcampus.web.account;

import kr.co.fastcampus.web.account.model.AccountModel;

import java.util.List;

public interface AccountRepository {
    // crud + list
    List<AccountModel> list();
    AccountModel findById(Long id);
    void create(AccountModel m);
    void update(AccountModel m);
    void delete(Long id);

}
