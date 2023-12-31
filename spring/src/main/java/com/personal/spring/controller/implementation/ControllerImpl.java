package com.personal.spring.controller.implementation;

import com.personal.spring.controller.Controller;
import com.personal.spring.model.Response;
import com.personal.spring.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@Slf4j
public class ControllerImpl implements Controller {
  @Override
  @ResponseStatus(HttpStatus.OK)
  @GetMapping("/test/{id}")
  public Response<User> getResponse(@PathVariable("id") Long id) {
    return Response.<User>builder()
        .response(User.builder().name("Name").age("18").email("ermail").build())
        .build();
  }
}
