package com.example.school.apiPayload.status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorStatus {

    BAD_REQUEST(HttpStatus.BAD_REQUEST,"COMMON400","잘못된 요청입니다."),
    PAGE_LT_ONE(HttpStatus.BAD_REQUEST,"COMMON401","잘못된 페이지입니다."),
    BAD_QUERY_STRING(HttpStatus.BAD_REQUEST,"COMMON402","잘못된 쿼리스트링입니다."),
    NO_CONTENT(HttpStatus.NO_CONTENT,"COMMON403","결과가 존재하지 않습니다."),
    EXPIRED_JWT(HttpStatus.OK, "3000", "만료된 토큰입니다."),
    INVALID_REFRESH_TOKEN(HttpStatus.BAD_REQUEST, "JWT_REFRESH", "RefreshToken이 일치하지 않습니다."),
    INTERNAL_SERVER_ERROR(HttpStatus.OK, "SERVER", "서버 에러"),
    BAD_JWT(HttpStatus.OK, "2000", "JWT 토큰이 잘못되었습니다."),

    // 멤버 관려 에러
    MEMBER_NOT_FOUND(HttpStatus.BAD_REQUEST, "MEMBER4001", "사용자가 없습니다."),
    REVIEW_NOT_FOUND(HttpStatus.NOT_FOUND, "REVIEW_4001","리뷰가 없습니다."),

    // 인증, 인가 관련 에러
    USER_FORMAT_ERROR(HttpStatus.BAD_REQUEST,"AUTH_4002","사용 불가능한 아이디입니다."),
    NICKNAME_DUPLICATE(HttpStatus.BAD_REQUEST,"AUTH_4003", "사용 불가능한 닉네임입니다."),
    PASSWORD_FORMAT_ERROR(HttpStatus.BAD_REQUEST, "AUTH_4004", "사용 불가능한 비밀번호입니다."),
    EMAIL_FORMAT_ERROR(HttpStatus.BAD_REQUEST, "AUTH_4005", "사용 불가능한 이메일입니다."),
    REDIS_ERROR(HttpStatus.BAD_REQUEST, "AUTH_4006", "Redis 오류."),
    EMAIL_ERROR(HttpStatus.BAD_REQUEST,"AUTH_4007", "이메일 인증 실패"),
    EMAIL_CODE_ERROR(HttpStatus.BAD_REQUEST,"AUTH_4008", "이메일 인증번호 불일치"),
    INVALID_CURRENT_PASSWORD(HttpStatus.BAD_REQUEST,"AUTH_4009", "현재 비밀번호 불일치"),
    USERID_MISMATCH(HttpStatus.BAD_REQUEST,"AUTH_4010", "유저 아이디와 이메일이 일치하지 않습니다."),
    FIND_PASSWORD_ERROR(HttpStatus.BAD_REQUEST,"AUTH_4011", "비밀번호 찾기 실패"),
    PASSWORD_ERROR(HttpStatus.BAD_REQUEST, "AUTH_4012", "비밀번호가 일치하지 않습니다."),
    USER_ID_ERROR(HttpStatus.BAD_REQUEST, "AUTH_4013", "ID를 정확하게 입력해 주세요."),
    EMAIL_DUPLICATE(HttpStatus.BAD_REQUEST,"AUTH_4014", "중복된 이메일입니다."),
    USERID_DUPLICATE(HttpStatus.BAD_REQUEST,"AUTH_4015", "중복된 아이디입니다."),


    FACILITY_NOT_FOUND(HttpStatus.NOT_FOUND, "STORE_4001","시설이 없습니다."),
    BUILDING_NOT_FOUND(HttpStatus.NOT_FOUND, "BUILDING_4001","건물이 존재하지 않습니다."),
    ANNOUNCE_NOT_FOUND(HttpStatus.NOT_FOUND, "ANNOUNCE_4001","공지사항이 존재하지 않습니다."),

    REFRESHTOKEN_NOT_FOUND(HttpStatus.NOT_FOUND, "TOKEN_4001", "해당 RefreshToken이 존재하지 않습니다."),
    SEARCH_CONDITION_ERROR(HttpStatus.BAD_REQUEST,"FAC_4001","잘못된 검색어입니다.");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;
}
