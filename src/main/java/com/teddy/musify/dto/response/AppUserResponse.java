package com.teddy.musify.dto.response;

import com.teddy.musify.entity.AppUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUserResponse {

    private Long id;
    private String name;
    private String role;
    private String email;
    private String accessToken;
    private String refreshToken;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static AppUserResponse fromEntity(AppUser appUser, String accessToken, String refreshToken) {
        AppUserResponse response =  new AppUserResponse();
        response.setId(appUser.getId());
        response.setName(appUser.getName());
        response.setRole(appUser.getRole());
        response.setEmail(appUser.getEmail());
        response.setAccessToken(accessToken);
        response.setRefreshToken(refreshToken);
        response.setCreatedAt(appUser.getCreatedAt());
        response.setUpdatedAt(appUser.getUpdatedAt());

        return response;
    }
}
