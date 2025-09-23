package com.stella.commons.post.controller;

import com.stella.commons.post.service.PostService;
import com.stella.commons.post.dto.PostDTO;
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
@RequestMapping("/post")
public class PostController {

    private final PostService postService;

    /** list view */
    @GetMapping("/")
    public String selectPostList(HttpServletRequest request, HttpServletResponse response, Model model, @ModelAttribute("postDTO") PostDTO postDTO) throws Exception {
        return "post/list";
    }

    /** detail view */
    @GetMapping("/{id}")
    public String selectPost(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable("id") int id) throws Exception {
        return "post/detail";
    }

    /** insert view */
    @GetMapping("/insert")
    public String insertPostView(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
        return "post/register";
    }

    /** update view */
    @GetMapping("/{id}/update")
    public String updatePostView(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable("id") int id) throws Exception {
        return "post/register";
    }

}
