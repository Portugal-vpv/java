package com.personal.spring.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.context.request.WebRequest;

@Tag(name = "Api test", description = "Api test")
public interface Controller {
  @Operation(method = "Test Operation", description = "Test")
  Long getResponse(Long id, WebRequest request) throws Exception;
}
