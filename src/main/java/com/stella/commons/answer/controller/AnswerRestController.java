package com.stella.commons.answer.controller;

import com.stella.commons.answer.dto.AnswerDTO;
import com.stella.commons.answer.service.AnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpServletRequest;

/**
 * REST Controller <br />
 * Explain :  <br />
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/answer")
public class AnswerRestController {

    private final AnswerService answerService;

    /** insert */
    @PostMapping
    public ResponseEntity<?> insertAnswer(HttpServletRequest request, @ModelAttribute("answerDTO") AnswerDTO dto) throws Exception {
        return ResponseEntity.ok().build();
    }

    /** update */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateAnswer(HttpServletRequest request, @ModelAttribute("answerDTO") AnswerDTO dto) throws Exception {
        return ResponseEntity.ok().build();
    }

    /** delete */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAnswer(HttpServletRequest request, @ModelAttribute("answerDTO") AnswerDTO dto) throws Exception {
        return ResponseEntity.ok().build();
    }

}
