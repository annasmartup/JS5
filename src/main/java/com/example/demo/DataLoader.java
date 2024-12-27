package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataLoader {

    private final UserRepository userRepository;

    @Autowired
    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void init() {

        User entity1 = new User(1L,"Joe", "aaa");
        User entity2 = new User(2L,"Emm", "bbb");
        User entity3 = new User(3L,"Egor", "ccc");


        userRepository.save(entity1);
        userRepository.save(entity2);
        userRepository.save(entity3);
    }
}
