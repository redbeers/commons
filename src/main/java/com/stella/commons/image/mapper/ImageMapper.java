package com.stella.commons.image.mapper;

import com.stella.commons.image.dto.ImageDTO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 *  Mapper <br />
 * Explain :  <br />
 */
@Mapper
public interface ImageMapper { 
    /** insert */
    int insertImage(ImageDTO dto) throws Exception;

    /** update */
    int updateImage(ImageDTO dto) throws Exception;

    /** delete */
    int deleteImage(ImageDTO dto) throws Exception;

    /** totCnt select */
    int selectImageTotCnt(ImageDTO dto) throws Exception;

    /** list select */
    List<ImageDTO> selectImageList(ImageDTO dto) throws Exception;

    /** detail select */
    ImageDTO selectImage(ImageDTO dto) throws Exception;
}
