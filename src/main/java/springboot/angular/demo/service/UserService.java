package springboot.angular.demo.service;

import springboot.angular.demo.entity.User;
import java.util.List;

public interface UserService {
    List<User> findAll();
}
