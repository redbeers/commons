package com.stella.commons.image.controller;

import com.stella.commons.image.service.ImageService;
import com.stella.commons.image.dto.ImageDTO;
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
@RequestMapping("/image")
public class ImageController {

    private final ImageService imageService;

    /** list view */
    @GetMapping("/")
    public String selectImageList(HttpServletRequest request, HttpServletResponse response, Model model, @ModelAttribute("imageDTO") ImageDTO imageDTO) throws Exception {
        return "image/list";
    }

    /** detail view */
    @GetMapping("/{id}")
    public String selectImage(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable("id") int id) throws Exception {
        return "image/detail";
    }

    /** insert view */
    @GetMapping("/insert")
    public String insertImageView(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
        return "image/register";
    }

    /** update view */
    @GetMapping("/{id}/update")
    public String updateImageView(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable("id") int id) throws Exception {
        return "image/register";
    }

}
