package com.spr.socialtv.dto;

import com.spr.socialtv.entity.UserRoleEnum;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserProfileDto {
    private Long userId;
    private String username;
    private String email;
    private UserRoleEnum role;

    public UserProfileDto(Long userId, String username, String email, UserRoleEnum role) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.role = role;
    }
}