package com.example.notes.services.Impl;

import com.example.notes.services.SignupService;
import com.example.notes.services.UserService;
import com.example.notes.transfer.UserRegDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class SignupServiceImpl implements SignupService {
    private static final Logger logger = LoggerFactory.getLogger(SignupServiceImpl.class);

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void signup(UserRegDto userRegDto) {
        userService.create(userRegDto);
        logger.info("New user is saved: {}", userRegDto.getUsername());
    }
}
