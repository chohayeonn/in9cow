package in9cow.in9cow_spring.controller;

import in9cow.in9cow_spring.model.User;
import in9cow.in9cow_spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        System.out.println("로그인 요청 받음: " + user.getUserid());
        boolean isLoginSuccess = userService.validateUser(user.getUserid(), user.getUserpw());
        if (!isLoginSuccess) {
            System.out.println("로그인 실패: " + user.getUserid() + ", 비밀번호: " + user.getUserpw());
        }

        return isLoginSuccess ? "로그인 성공" : "로그인 실패";
    }
}
