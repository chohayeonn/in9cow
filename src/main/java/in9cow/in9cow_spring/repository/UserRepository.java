package in9cow.in9cow_spring.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import in9cow.in9cow_spring.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserId(String userId);
}

