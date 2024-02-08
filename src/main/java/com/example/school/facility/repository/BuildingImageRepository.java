package com.example.school.facility.repository;

import com.example.school.domain.BuildingImage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingImageRepository extends JpaRepository<BuildingImage, Long> {
    Page<BuildingImage> findByBuildingId(Long buildingId, Pageable page);
}
