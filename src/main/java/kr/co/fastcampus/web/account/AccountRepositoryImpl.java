package kr.co.fastcampus.web.account;

import kr.co.fastcampus.web.account.model.AccountModel;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
@Component
public class AccountRepositoryImpl implements AccountRepository {
    private List<AccountModel> list = new ArrayList<>();

    @Override
    public List<AccountModel> list() {
//        return Collections.emptyList(); // new ArrayList() 로 해도됨
        return list;
    }

    @Override
    public AccountModel findById(Long id) {
        return null;
    }

    @Override
    public void create(AccountModel m) {
        this.list.add(m);
    }

    @Override
    public void update(AccountModel m) {

    }

    @Override
    public void delete(Long id) {

    }
}
