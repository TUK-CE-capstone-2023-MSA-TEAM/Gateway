package com.example.chieegateway.AccountDtos.member;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberUpdateRequest {
  private String nickname;
  private String address;
  private String addressDetail;
  private String introduce;
  private List<String> majors;
  private List<String> interests;
  private String role;
}
