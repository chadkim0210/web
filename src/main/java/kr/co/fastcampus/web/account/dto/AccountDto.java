package kr.co.fastcampus.web.account.dto;

import kr.co.fastcampus.web.account.model.AccountModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
    private Long id;
    private String username;
    private String password;

    // dto로 받은 데이터를 model로 변환해줌
    public AccountModel toModel() {
        return new AccountModel(id, username, password);
    }
}
