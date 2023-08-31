package com.example.chieegateway.AccountDtos.error.exception;

import com.example.chieegateway.AccountDtos.error.ErrorCode;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException{
  private final ErrorCode errorCode;

  public BusinessException(ErrorCode errorCode) {
    super(errorCode.getMessage());
    this.errorCode = errorCode;
  }
}
