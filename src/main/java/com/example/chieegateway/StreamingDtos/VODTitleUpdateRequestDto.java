package com.example.chieegateway.StreamingDtos;

import lombok.Data;

@Data
public class VODTitleUpdateRequestDto {
    private String vodGroupId;
    private int vodIndex;
    private String newTitle;
}
