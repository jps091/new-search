package com.news.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorType {
    EXTERNAL_API_ERROR("외부 API 호출 에러 입니다."),
    UNKNOWN("서버 에러 입니다. 잠시후 다시 시도해주세요."),
    INVALID_REQUEST("잘못된 요청입니다.");

    private final String description;
}