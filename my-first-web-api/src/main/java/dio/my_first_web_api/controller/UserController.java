package dio.my_first_web_api.controller;

import dio.my_first_web_api.model.User;
import dio.my_first_web_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping()
    public List<User>getUsers(){
        return userRepository.findAll();
    }
    @GetMapping("{username}")
    public User getOne(@PathVariable("username") String username){
        return userRepository.findByLogin(username);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        userRepository.deleteById(id);
    }
    @PostMapping()
    public void postUser(@RequestBody User user){
        userRepository.save(user);
    }
}
