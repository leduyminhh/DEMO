package springboot.angular.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.angular.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
