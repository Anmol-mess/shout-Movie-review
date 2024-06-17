package com.project.shoutReview.controller;

import com.project.shoutReview.service.AdminService;
import com.project.shoutReview.service.request.MovieRequest;
import com.project.shoutReview.service.response.MovieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;


    public ResponseEntity<MovieResponse> addMovie(@RequestBody MovieRequest movieRequest){

        return new ResponseEntity<>(adminService
                .addMovie(movieRequest.toMovie()).toMovieResponse(),
                HttpStatus.CREATED);



    }

}
