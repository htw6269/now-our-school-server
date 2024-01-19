package com.example.school.domain;

import com.example.school.domain.common.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reservation extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="member_id")
    private Member member;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="facility_id")
    private Facility facility;
    private String year;
    private String month;
    private String day;

    private Integer start_time;
    private Integer end_time;
    private Integer duration;


    public void setMember(Member member){
        this.member = member;
        member.getReservationList().add(this);
    }
    public void setFacility(Facility facility){
        this.facility = facility;
        facility.getReservationList().add(this);
    }




}
