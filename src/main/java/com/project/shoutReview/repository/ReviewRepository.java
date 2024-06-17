package com.project.shoutReview.repository;

import com.project.shoutReview.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

    @Query(value = "select avg(rating) from review_table where movie_id=?", nativeQuery = true)
    Double getReviewAverage(Long id);


}
