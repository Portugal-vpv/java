package com.personal.spring.model;

import com.personal.spring.enums.Gender;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class User {
    private String name;
    private String lastName;
    private String email;
    private String age;
    private Gender gender;
}
