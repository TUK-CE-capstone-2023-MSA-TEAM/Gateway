package com.example.chieegateway.StreamingDtos;


import lombok.Data;

@Data
public class VODGroupRegistrationRequestDto {
  private String vodGroupName;   // VOD 그룹 이름
  private String ownerId;        // 소유자 ID
  private String keyword;         // 검색 키워드
}
