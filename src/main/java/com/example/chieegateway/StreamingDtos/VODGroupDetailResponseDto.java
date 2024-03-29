package com.example.chieegateway.StreamingDtos;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class VODGroupDetailResponseDto {
  private String id;      // VOD 그룹 ID
  private String vodGroupName;   // VOD 그룹 이름
  private String ownerId;        // 소유자 ID
  private String thumbnailURL;    // 썸네일 URL
  private int vodCount;          // VOD 개수
  private List<VOD> VODList;     // VOD 리스트
  private String keyword;         // 검색 키워드
}
