package springboot.angular.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.angular.demo.entity.User;
import springboot.angular.demo.service.UserService;

import java.util.List;

@RestController()
@RequestMapping("users")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    UserService userService;

    @GetMapping()
    public ResponseEntity<List<User>> getAll(){
        List<User> result = userService.findAll();
        return ResponseEntity.ok(result);
    }

}
