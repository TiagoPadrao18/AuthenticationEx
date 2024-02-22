package com.authorizationEx.authorzationEx.service;

import com.authorizationEx.authorzationEx.dto.UserDto;
import com.authorizationEx.authorzationEx.enums.Roles;
import com.authorizationEx.authorzationEx.exception.UserCreationException;
import com.authorizationEx.authorzationEx.model.User;
import com.authorizationEx.authorzationEx.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public User createUser(UserDto userDto) {
        if (userDto.getUsername() == null || userDto.getPassword() == null) throw new UserCreationException();
        if (userDto.getUsername().equals("admin") && userDto.getPassword().equals("admin")) {
            User user = new User();
            user.setUsername(userDto.getUsername());
            user.setPassword(userDto.getPassword());
            user.setRole(Roles.ADMIN);
            return this.userRepository.save(user);
        }
            User user = new User();
            user.setUsername(userDto.getUsername());
            user.setPassword(userDto.getPassword());
            user.setRole(Roles.USER);
            return this.userRepository.save(user);

    }


    public List<User> getAllUsers() {
        return this.userRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

}
