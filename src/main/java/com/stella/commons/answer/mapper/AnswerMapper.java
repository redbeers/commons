package com.stella.commons.answer.mapper;

import com.stella.commons.answer.dto.AnswerDTO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 *  Mapper <br />
 * Explain :  <br />
 */
@Mapper
public interface AnswerMapper { 
    /** insert */
    int insertAnswer(AnswerDTO dto) throws Exception;

    /** update */
    int updateAnswer(AnswerDTO dto) throws Exception;

    /** delete */
    int deleteAnswer(AnswerDTO dto) throws Exception;

    /** totCnt select */
    int selectAnswerTotCnt(AnswerDTO dto) throws Exception;

    /** list select */
    List<AnswerDTO> selectAnswerList(AnswerDTO dto) throws Exception;

    /** detail select */
    AnswerDTO selectAnswer(AnswerDTO dto) throws Exception;
}
