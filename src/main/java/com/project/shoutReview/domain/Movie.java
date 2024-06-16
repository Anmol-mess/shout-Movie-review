package com.project.shoutReview.domain;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;


@Entity
@Table(name= "movie_table")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class Movie implements Serializable {


    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String title;

    @Enumerated(EnumType.STRING)
    private Genre genre;


    private Double rating;


    private List<Review> reviews;

//    public MovieResponse toMovieResponse(){
//
//        return MovieResponse.builder().genre(this.genre).title(this.title)
//                .rating(this.rating).reviews(Review.toReviewResponse(this.review)).build();
//
//
//    }











}



