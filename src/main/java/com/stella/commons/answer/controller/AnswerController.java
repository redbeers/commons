package com.stella.commons.answer.controller;

import com.stella.commons.answer.service.AnswerService;
import com.stella.commons.answer.dto.AnswerDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *  Controller <br />
 * Explain :  <br />
 */
@Controller
@RequiredArgsConstructor
@RequestMapping("/answer")
public class AnswerController {

    private final AnswerService answerService;

    /** list view */
    @GetMapping("/")
    public String selectAnswerList(HttpServletRequest request, HttpServletResponse response, Model model, @ModelAttribute("answerDTO") AnswerDTO answerDTO) throws Exception {
        return "answer/list";
    }

    /** detail view */
    @GetMapping("/{id}")
    public String selectAnswer(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable("id") int id) throws Exception {
        return "answer/detail";
    }

    /** insert view */
    @GetMapping("/insert")
    public String insertAnswerView(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
        return "answer/register";
    }

    /** update view */
    @GetMapping("/{id}/update")
    public String updateAnswerView(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable("id") int id) throws Exception {
        return "answer/register";
    }

}
