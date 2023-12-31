package com.personal.spring.controller;

import com.personal.spring.model.Response;
import com.personal.spring.model.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Api test", description = "Api test")
public interface Controller {
  @Operation(method = "Test Operation", description = "Test")
  @ApiResponses({
    @ApiResponse(responseCode = "200", description = "PDF Binary"),
  })
  Response<User> getResponse(Long id) throws Exception;
}
