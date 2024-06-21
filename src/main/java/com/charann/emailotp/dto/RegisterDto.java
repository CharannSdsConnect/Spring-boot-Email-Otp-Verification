package com.charann.emailotp.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class RegisterDto {

  private String name;
  private String email;
  private String password;

}
