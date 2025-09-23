package com.stella.commons.post.mapper;

import com.stella.commons.post.dto.PostDTO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 *  Mapper <br />
 * Explain :  <br />
 */
@Mapper
public interface PostMapper { 
    /** insert */
    int insertPost(PostDTO dto) throws Exception;

    /** update */
    int updatePost(PostDTO dto) throws Exception;

    /** delete */
    int deletePost(PostDTO dto) throws Exception;

    /** totCnt select */
    int selectPostTotCnt(PostDTO dto) throws Exception;

    /** list select */
    List<PostDTO> selectPostList(PostDTO dto) throws Exception;

    /** detail select */
    PostDTO selectPost(PostDTO dto) throws Exception;
}
