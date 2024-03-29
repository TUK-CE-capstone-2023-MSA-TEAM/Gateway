package com.example.chieegateway.AccountDtos.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCode {

  // Global
  TOKEN_REFRESH_SUCCESS("G001", "토큰 갱신 성공"),
  TOKEN_VALIDATE_SUCCESS("G002", "토큰 유효성 검사 성공"),

  // Member
  MEMBER_REGISTRATION_SUCCESS("M001", "사용자 등록 성공"),
  MEMBER_ACCOUNT_NOT_DUPLICATED("M002", "회원 아이디 중복되지않음"),
  MEMBER_LOGIN_SUCCESS("M003", "회원 로그인 성공"),
  MEMBER_LOGOUT_SUCCESS("M004", "회원 로그아웃 성공"),
  MEMBER_UPDATE_SUCCESS("M005", "회원 프로필 업데이트 성공"),
  MEMBER_FIND_SUCCESS("M006", "회원 조회 성공"),
  MEMBER_LIST_REQUEST_SUCCESS("M007", "회원 리스트 조회 성공"),
  MEMBER_DELETE_SUCCESS("M008", "회원 삭제 성공"),

  // Role
  ROLE_REGISTRATION_SUCCESS("R001", "역할 등록 성공"),
  ROLE_UPDATE_SUCCESS("R002", "역할 수정 성공"),
  ROLE_DELETE_SUCCESS("R003", "역할 삭제 성공"),
  ROLE_FIND_SUCCESS("R004", "역할 조회 성공"),
  ROLE_LIST_REQUEST_SUCCESS("R005", "역할 리스트 조회 성공"),

  // keyword
  KEYWORD_REGISTRATION_SUCCESS("K001", "키워드 등록 성공"),
  KEYWORD_UPDATE_SUCCESS("K002", "키워드 수정 성공"),
  KEYWORD_DELETE_SUCCESS("K003", "키워드 삭제 성공"),
  KEYWORD_FIND_SUCCESS("K004", "키워드 조회 성공"),
  KEYWORD_LIST_REQUEST_SUCCESS("K005", "키워드 리스트 조회 성공"),

  //VODGroup
  VODGROUP_REGISTRATION_SUCCESS("V001", "VOD 그룹 등록 성공"),
  VODGROUP_UPDATE_SUCCESS("V002", "VOD 그룹 수정 성공"),
  VODGROUP_SEARCH_SUCCESS("V003", "VOD 그룹 조회 성공"),
  VODGROUP_DELETE_SUCCESS("V004", "VOD 그룹 삭제 성공"),
  VODGROUP_LIST_REQUEST_SUCCESS("V005", "VOD 그룹 리스트 조회 성공"),

  //VOD
  VOD_REGISTRATION_INIT_SUCCESS("V006", "VOD 등록 초기화 성공"),
  VOD_MULTIPART_UPLOAD_SUCCESS("V007", "VOD 멀티파트 업로드 성공"),
  VOD_UPLOAD_COMPLATE("V007", "VOD 업로드 완료"),
  VOD_UPLOAD_FINISH_SUCCESS("V008", "VOD 업로드 완료 요청 성공")
  ;

  private final String code;
  private final String message;

}
