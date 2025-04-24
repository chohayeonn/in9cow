package in9cow.in9cow_spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in9cow.in9cow_spring.model.User;
import in9cow.in9cow_spring.repository.UserRepository;

import java.util.List; // 🔥 이거 꼭 필요해!

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // 모든 사용자 조회
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public boolean validateUser(String user_id, String password) {
        User user = userRepository.findByUserId(user_id);
        if (user == null) return false;
        return user.getUserpw().equals(password); //
    }
}
