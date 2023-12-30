package com.personal.spring.controller.implementation;

import com.personal.spring.controller.Controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@RestController
@RequestMapping
@Slf4j
public class ControllerImpl implements Controller {
  @Override
  @GetMapping("/test/{id}")
  public Long getResponse(@PathVariable("id") Long id, WebRequest request) {
    return 3L;
  }
}
