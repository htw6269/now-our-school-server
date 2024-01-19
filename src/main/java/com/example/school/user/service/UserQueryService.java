package com.example.school.user.service;

import com.example.school.domain.Member;
import com.example.school.domain.Review;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface UserQueryService {

    Optional<Member> findMember(Long id);
    Page<Review> getReviewList(Long StoreId, Integer page);

}