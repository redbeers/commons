package com.stella.commons.image.controller;

import com.stella.commons.image.dto.ImageDTO;
import com.stella.commons.image.service.ImageService;
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
@RequestMapping("/image")
public class ImageRestController {

    private final ImageService imageService;

    /** insert */
    @PostMapping
    public ResponseEntity<?> insertImage(HttpServletRequest request, @ModelAttribute("imageDTO") ImageDTO dto) throws Exception {
        return ResponseEntity.ok().build();
    }

    /** update */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateImage(HttpServletRequest request, @ModelAttribute("imageDTO") ImageDTO dto) throws Exception {
        return ResponseEntity.ok().build();
    }

    /** delete */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteImage(HttpServletRequest request, @ModelAttribute("imageDTO") ImageDTO dto) throws Exception {
        return ResponseEntity.ok().build();
    }

}
