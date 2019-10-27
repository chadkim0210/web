package kr.co.fastcampus.web.account.model;

import kr.co.fastcampus.web.account.dto.AccountDto;
import lombok.*;


@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountModel {
    private Long id;
    private String username;
    private String password;
    public AccountDto toDto() {
        return new AccountDto(id, username, password);
    }
}

