package com.example.school.user.converter;

import com.example.school.entity.Inquiry;
import com.example.school.entity.Member;
import com.example.school.entity.Review;
import com.example.school.user.dto.UserRequestDTO;
import com.example.school.user.dto.UserResponseDTO;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class UserConverter {
    public static Review toReview(UserRequestDTO.ReviewDTO request){
        return Review.builder()
                .title(request.getTitle())
                .score(request.getScore())
                .body(request.getBody())
                .build();
    }

    public static UserResponseDTO.CreateReviewResultDTO toCreateReviewResultDTO(Review review){
        return UserResponseDTO.CreateReviewResultDTO.builder()
                .reviewId(review.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static UserResponseDTO.UpdateReviewResultDTO toUpdateReviewResultDTO(Review updatedReview) {
        return UserResponseDTO.UpdateReviewResultDTO.builder()
                .updatedReviewId(updatedReview.getId())
                .updatedAt(LocalDateTime.now())
                .build();
    }
    public static UserResponseDTO.ReviewPreViewDTO reviewPreViewDTO(Review review){
        return UserResponseDTO.ReviewPreViewDTO.builder()
                .title(review.getTitle())
                .ownerNickname(review.getMember().getName())
                .score(review.getScore())
                .createdAt(review.getCreatedAt().toLocalDate())
                .body(review.getBody())
                .build();
    }   public static UserResponseDTO.ReviewPreViewListDTO reviewPreViewListDTO(Page<Review> reviewList){

        List<UserResponseDTO.ReviewPreViewDTO> reviewPreViewDTOList = reviewList.stream()
                .map(UserConverter::reviewPreViewDTO).collect(Collectors.toList());

        return UserResponseDTO.ReviewPreViewListDTO.builder()
                .isLast(reviewList.isLast())
                .isFirst(reviewList.isFirst())
                .totalPage(reviewList.getTotalPages())
                .totalElements(reviewList.getTotalElements())
                .listSize(reviewPreViewDTOList.size())
                .reviewList(reviewPreViewDTOList)
                .build();
    }

    public static Inquiry toInquiry(UserRequestDTO.InquiryDTO request){
        return Inquiry.builder()
                .title(request.getTitle())
                .body(request.getBody())
                .build();
    }
    public static UserResponseDTO.CreateInquiryResultDTO toCreateInquiryResultDTO(Inquiry inquiry){
        return UserResponseDTO.CreateInquiryResultDTO.builder()
                .inquiryId(inquiry.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }
    public static UserResponseDTO.UpdateProfileResultDTO toUpdateProfileResultDTO(Member member) {
        return UserResponseDTO.UpdateProfileResultDTO.builder()
                .nickname(member.getNickname())
                .profilePicture(member.getProfileImg())
                .updatedAt(LocalDateTime.now())
                .build();
    }

}
