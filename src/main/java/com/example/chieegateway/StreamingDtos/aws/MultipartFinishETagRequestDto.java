package com.example.chieegateway.StreamingDtos.aws;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class MultipartFinishETagRequestDto {
  private int partIndex;
  private String etag;
}
