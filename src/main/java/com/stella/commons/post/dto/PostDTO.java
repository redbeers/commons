package com.stella.commons.post.dto;

import lombok.Getter;
import lombok.Setter;

/**
 *  DTO <br />
 * Explain :  <br />
 */
@Getter
@Setter
public class PostDTO {

    // 일련번호
    private Integer id;

    // 앱 URL
    private String appUrl;

    // 웹 URL
    private String webUrl;

    // 작성자 이메일
    private String email;

    // 등록일
    private String createdAt;

    // 앱종류
    private String appKind;

}
