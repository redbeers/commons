package com.stella.commons.image.service;

import com.stella.commons.image.dto.ImageDTO;
import com.stella.commons.image.mapper.ImageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 *  Service <br />
 * Explain :  <br />
 */
@Service
@RequiredArgsConstructor
public class ImageService {
    private final ImageMapper imageMapper;

    /** insert
     * @param dto
     * @return
     * @throws Exception
    */
    public int insertImage(ImageDTO dto) throws Exception {
        return imageMapper.insertImage(dto);
    }

    /** update
     * @param dto
     * @return
     * @throws Exception
    */
    public int updateImage(ImageDTO dto) throws Exception {
        return imageMapper.updateImage(dto);
    }

    /** delete
     * @param dto
     * @return
     * @throws Exception
    */
    public int deleteImage(ImageDTO dto) throws Exception {
        return imageMapper.deleteImage(dto);
    }

    /** totcnt select
     * @param dto
     * @return
     * @throws Exception
    */
    public int selectImageTotCnt(ImageDTO dto) throws Exception {
        return imageMapper.selectImageTotCnt(dto);
    }

    /** list select
     * @param dto
     * @return
     * @throws Exception
    */
    public List<ImageDTO> selectImageList(ImageDTO dto) throws Exception {
        return imageMapper.selectImageList(dto);
    }

    /** detail select
     * @param dto
     * @return
     * @throws Exception
    */
    public ImageDTO selectImage(ImageDTO dto) throws Exception {
        return imageMapper.selectImage(dto);
    }
}
