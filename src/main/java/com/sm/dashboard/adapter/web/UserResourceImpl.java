package com.sm.dashboard.adapter.web;

import com.sm.dashboard.adapter.mongo.MongoUserRepository;
import com.sm.dashboard.domain.LoadUsersUseCase;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserResourceImpl {

    private final LoadUsersUseCase loadUsersUseCase = new MongoUserRepository();

    @GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    ModelAndView findAll() {
        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.addObject("users", loadUsersUseCase.get());
        return modelAndView;
    }
}
