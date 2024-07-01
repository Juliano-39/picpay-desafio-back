package com.picpaysimplificado.service;

import com.picpaysimplificado.entities.dto.UserDto;
import com.picpaysimplificado.entities.model.User;
import com.picpaysimplificado.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public User createUser(UserDto userDto){

        User user = new User();
        BeanUtils.copyProperties(userDto, user);

        repository.save(user);

        return user;
    }
}
