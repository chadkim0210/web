package kr.co.fastcampus.web.account;

import kr.co.fastcampus.web.account.model.AccountModel;

import java.util.List;

/**
 *
 */
public interface AccountRepository {
    // crud + list

    /**
     *
     *
     * @return the list
     */
    List<AccountModel> list();

    /**
     * Find by id account model.
     *
     * @param id the id
     * @return the account model
     */
    AccountModel findById(Long id);

    /**
     * Create.
     *
     * @param m the m
     */
    void create(AccountModel m);

    /**
     * Update.
     *
     * @param m the m
     */
    void update(AccountModel m);

    /**
     * Delete.
     *
     * @param id the id
     */
    void delete(Long id);

}
