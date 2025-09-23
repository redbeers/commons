package com.stella.commons.post.controller;

import com.stella.commons.post.dto.PostDTO;
import com.stella.commons.post.service.PostService;
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
@RequestMapping("/post")
public class PostRestController {

    private final PostService postService;

    /** insert */
    @PostMapping
    public ResponseEntity<?> insertPost(HttpServletRequest request, @ModelAttribute("postDTO") PostDTO dto) throws Exception {
        return ResponseEntity.ok().build();
    }

    /** update */
    @PutMapping("/{id}")
    public ResponseEntity<?> updatePost(HttpServletRequest request, @ModelAttribute("postDTO") PostDTO dto) throws Exception {
        return ResponseEntity.ok().build();
    }

    /** delete */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePost(HttpServletRequest request, @ModelAttribute("postDTO") PostDTO dto) throws Exception {
        return ResponseEntity.ok().build();
    }

}
