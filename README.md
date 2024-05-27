# 프로젝트 제목

## 📅개발기간
2023.02~2023.05

## 👥팀원소개
### UMC 시설물 관리 프로젝트

1. **이름:** 하태욱
   - **학교:** 🏫울산대학교
   - **역할:** 🌐백엔드
2. **이름:** 지승현
   - **학교:** 🏫울산대학교
   - **역할:** 🌐백엔드

## 📜 프로젝트 소개
이 프로젝트는 학교 시설 예약 서비스의 컨트롤러 클래스입니다. 사용자는 시설을 예약하고, 예약을 확인하고, 예약을 취소할 수 있습니다. 또한 사용자의 예약 현황 및 이용 내역을 조회할 수 있습니다.

## 🚀 실행 방법
1. 이 프로젝트를 클론합니다.
2. 이클립스 또는 인텔리제이와 같은 IDE에서 프로젝트를 엽니다.
3. 컨트롤러 클래스를 실행합니다.

## ✨ 핵심 기능
- 사용자 ID, 시설 ID, 예약 일자 및 시간대를 요청 본문에 포함하여 시설을 예약합니다.
- 특정 예약을 확인합니다.
- 예약을 취소합니다.
- 사용자의 예약 현황을 조회합니다.
- 사용자의 이용 내역을 조회합니다.

## 🛠️기술 스택
![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/Spring_Framework-6DB33F?style=for-the-badge&logo=spring&logoColor=white)

## 📄 사용법
이 프로젝트는 학교 시설 예약 서비스의 컨트롤러 클래스로, 사용자는 시설을 예약, 예약을 확인, 예약을 취소할 수 있습니다. 또한 사용자의 예약 현황 및 이용 내역을 조회할 수 있습니다. 각 기능은 다음과 같이 작동합니다.
1. 시설 예약: POST /api/v1/facility/reservations 엔드포인트로 사용자 ID, 시설 ID, 예약 일자 및 시간대를 요청 본문에 포함하여 시설을 예약합니다.
2. 예약 확인: GET /api/v1/facility/reservations/{reservationId} 엔드포인트로 예약 ID를 전달하여 특정 예약을 확인합니다.
3. 예약 취소: PUT /api/v1/facility/reservations/{reservationId}/cancel 엔드포인트로 예약 ID를 전달하여 예약을 취소합니다.
4. 예약 현황 조회: GET /api/v1/facility/reservations 엔드포인트으로 사용자 ID를 쿼리 파라미터로 전달하여 사용자의 예약 현황을 조회합니다.
5. 이용 내역 조회: GET /api/v1/facility/reservations/history 엔드포인트으로 사용자 ID를 쿼리 파라미터로 전달하여 사용자의 이용 내역을 조회합니다.

이와 같이 컨트롤러 클래스를 사용하여 학교 시설 예약 서비스의 기능을 수행할 수 있습니다.