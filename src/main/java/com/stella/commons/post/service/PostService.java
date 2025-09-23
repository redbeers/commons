package com.stella.commons.post.service;

import com.stella.commons.post.dto.PostDTO;
import com.stella.commons.post.mapper.PostMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 *  Service <br />
 * Explain :  <br />
 */
@Service
@RequiredArgsConstructor
public class PostService {
    private final PostMapper postMapper;

    /** insert
     * @param dto
     * @return
     * @throws Exception
    */
    public int insertPost(PostDTO dto) throws Exception {
        return postMapper.insertPost(dto);
    }

    /** update
     * @param dto
     * @return
     * @throws Exception
    */
    public int updatePost(PostDTO dto) throws Exception {
        return postMapper.updatePost(dto);
    }

    /** delete
     * @param dto
     * @return
     * @throws Exception
    */
    public int deletePost(PostDTO dto) throws Exception {
        return postMapper.deletePost(dto);
    }

    /** totcnt select
     * @param dto
     * @return
     * @throws Exception
    */
    public int selectPostTotCnt(PostDTO dto) throws Exception {
        return postMapper.selectPostTotCnt(dto);
    }

    /** list select
     * @param dto
     * @return
     * @throws Exception
    */
    public List<PostDTO> selectPostList(PostDTO dto) throws Exception {
        return postMapper.selectPostList(dto);
    }

    /** detail select
     * @param dto
     * @return
     * @throws Exception
    */
    public PostDTO selectPost(PostDTO dto) throws Exception {
        return postMapper.selectPost(dto);
    }
}
