package com.example.chieegateway.StreamingDtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VOD {
  private int idx;
  private String title;       // VOD 제목
//  private String vodType;       // VOD 동영상 파일 확장자
  private String description;   // VOD 설명
  private String vodURL;        // VOD 스토리지 URL
  private String thumbnailURL;  // VOD 썸네일 스토리지 URL
  private String key;           // 저장된 스토리지 경로
//  private int vodLength;        // VOD 길이 (초)
}
