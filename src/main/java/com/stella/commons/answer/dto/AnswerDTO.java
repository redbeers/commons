package com.stella.commons.answer.dto;

import lombok.Getter;
import lombok.Setter;

/**
 *  DTO <br />
 * Explain :  <br />
 */
@Getter
@Setter
public class AnswerDTO {

    // 일련번호
    private Integer id;

    // 어떤 게시물에 대한 답변인지
    private Integer postId;

    // 답변 모드2: 이미지 참조
    private Integer imageId;

    // 답변 모드1: 앱 URL
    private String appUrl;

    // 답변 모드1: 웹 URL
    private String webUrl;

    // 답변 모드2: 답변 작성자 이메일
    private String email;

    // 답변 모드2: 글 내용
    private String content;

    // 등록일
    private String createdAt;

}
