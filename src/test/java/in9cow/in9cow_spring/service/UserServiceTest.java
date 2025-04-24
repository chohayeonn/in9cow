package in9cow.in9cow_spring.service;

import in9cow.in9cow_spring.service.UserService;
import in9cow.in9cow_spring.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List; // 🔥 이거 추가!

@SpringBootTest(classes = in9cow.in9cow_spring.In9cowSpringApplication.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void printAllUsers() {
        // 모든 사용자 가져오기
        List<User> users = userService.getAllUsers();

        // 각 사용자 출력
        for (User user : users) {
            System.out.println(user);
        }
    }
}
