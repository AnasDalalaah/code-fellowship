package com.example.codefellowship.codefellowship.controllers;

import com.example.codefellowship.codefellowship.models.ApplicationUser;
import com.example.codefellowship.codefellowship.models.Post;
import com.example.codefellowship.codefellowship.repos.ApplicationUserRepository;
import com.example.codefellowship.codefellowship.repos.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;
@Controller
public class PostController {

    @Autowired
    ApplicationUserRepository applicationUserRepository;

    @Autowired
    PostRepository postRepository;

}