package com.stella.commons.image.dto;

import lombok.Getter;
import lombok.Setter;

/**
 *  DTO <br />
 * Explain :  <br />
 */
@Getter
@Setter
public class ImageDTO {

    // 일련번호
    private Integer id;

    // 이미지 경로(URL)
    private String imageUrl;

    // 등록일
    private String createdAt;

}
