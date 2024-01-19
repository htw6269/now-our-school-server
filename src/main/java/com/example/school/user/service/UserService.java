package com.example.school.user.service;

import com.example.school.domain.Member;
import com.example.school.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public Member findById(Long id){
        return userRepository.findById(id).get();
    }
}
