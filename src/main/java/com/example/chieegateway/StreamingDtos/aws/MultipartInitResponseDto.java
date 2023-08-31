package com.example.chieegateway.StreamingDtos.aws;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MultipartInitResponseDto {
    private String uploadId;
    private String URL;
}
