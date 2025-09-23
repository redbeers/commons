package com.stella.commons.answer.service;

import com.stella.commons.answer.dto.AnswerDTO;
import com.stella.commons.answer.mapper.AnswerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 *  Service <br />
 * Explain :  <br />
 */
@Service
@RequiredArgsConstructor
public class AnswerService {
    private final AnswerMapper answerMapper;

    /** insert
     * @param dto
     * @return
     * @throws Exception
    */
    public int insertAnswer(AnswerDTO dto) throws Exception {
        return answerMapper.insertAnswer(dto);
    }

    /** update
     * @param dto
     * @return
     * @throws Exception
    */
    public int updateAnswer(AnswerDTO dto) throws Exception {
        return answerMapper.updateAnswer(dto);
    }

    /** delete
     * @param dto
     * @return
     * @throws Exception
    */
    public int deleteAnswer(AnswerDTO dto) throws Exception {
        return answerMapper.deleteAnswer(dto);
    }

    /** totcnt select
     * @param dto
     * @return
     * @throws Exception
    */
    public int selectAnswerTotCnt(AnswerDTO dto) throws Exception {
        return answerMapper.selectAnswerTotCnt(dto);
    }

    /** list select
     * @param dto
     * @return
     * @throws Exception
    */
    public List<AnswerDTO> selectAnswerList(AnswerDTO dto) throws Exception {
        return answerMapper.selectAnswerList(dto);
    }

    /** detail select
     * @param dto
     * @return
     * @throws Exception
    */
    public AnswerDTO selectAnswer(AnswerDTO dto) throws Exception {
        return answerMapper.selectAnswer(dto);
    }
}
