package com.HUFS19.backend.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    INTER_SERVER_EROR(HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.INTERNAL_SERVER_ERROR.value(), "서버 장애가 발생했습니다."),
    USER_ID_CONFLICT(HttpStatus.CONFLICT, HttpStatus.CONFLICT.value(), "이미 존재하는 아이디입니다.");

    private HttpStatus status;
    private int code;
    private String message;
}