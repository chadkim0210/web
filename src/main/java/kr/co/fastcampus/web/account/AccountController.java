package kr.co.fastcampus.web.account;

import kr.co.fastcampus.web.account.dto.AccountDto;
import kr.co.fastcampus.web.account.model.AccountModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping("/account")
    public ModelAndView account() {
        ModelAndView mv = new ModelAndView("account/list");
        // accountService.list().var 하면 아래처럼 만들어줌
        List<AccountDto> list = accountService.list();
        mv.addObject("accounts", list);
        return mv;
    }

    // post로 account에 던졌을때 받아서 처리해주는 영역
    @PostMapping("/account")
    public ModelAndView create(AccountDto dto) {
        ModelAndView mv = new ModelAndView("redirect:/account");
        accountService.create(dto);
        return mv;
    }
}
