package com.teddy.musify.dto.response;

import com.teddy.musify.entity.Song;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SongResponse {
    private Long id;
    private String title;
    private String artist;
    private String songUrl;
    private String imageUrl;
    private LocalDateTime createdAt;
    private Long appUserId;
    private String appUserName;

    public static SongResponse fromEntity(Song song, String baseUrl){
        SongResponse respone = new SongResponse();
        respone.setId(song.getId());
        respone.setTitle(song.getTitle());
        respone.setArtist(song.getArtist());

        respone.setSongUrl(song.getSongUrl() != null ? baseUrl + song.getSongUrl() : null);
        respone.setImageUrl(song.getImageUrl() != null ? baseUrl + song.getImageUrl() : null);

        respone.setCreatedAt(song.getCreatedAt());
        respone.setAppUserId(song.getAppUser().getId());
        respone.setAppUserName(song.getAppUser().getName());
        return respone;

    }

}
