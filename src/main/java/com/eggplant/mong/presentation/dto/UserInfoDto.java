package com.eggplant.mong.presentation.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfoDto {

    private String email;
    private String password;

    private String auth;
}
