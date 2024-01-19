package com.example.school.user.service;

import com.example.school.domain.Review;
import com.example.school.user.dto.UserRequestDTO;

public interface UserCommandService {
    Review createReview(Long memberId, Long facilityId, UserRequestDTO.ReviewDTO request);

}
