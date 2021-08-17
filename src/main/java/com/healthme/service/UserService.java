package com.healthme.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.healthme.dao.UserRepository;
import com.healthme.entity.User;
import com.healthme.log.SystemLog;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author root
 */
@Service(value="userService")
@Transactional
public class UserService {

    @Resource(name="userRepository")
    private UserRepository userRepository;

    @SystemLog(event = "测试TestLock")
    public String TestLock() throws JsonProcessingException {
        add(new User());
        List<User> users = getAll();

        if (1 == 1){
            throw new RuntimeException("TestLock");
        }
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(users);
    }

    public void add(User user){
        userRepository.save(user);
    }

    public void update(User user){
        userRepository.save(user);
    }

    public List<User> getAll(){
        return userRepository.getAll();
    }
}