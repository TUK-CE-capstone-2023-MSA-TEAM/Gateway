package com.example.chieegateway.StreamingDtos;

import lombok.Data;

@Data
public class VODRegistrationRequestDto {
    private String title; // VOD 제목 (확장자 포함)
    private String description;
    private String VODGroupId;
    private int vodIndex;
}
