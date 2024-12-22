# Singleton
![singleton.webp](attachment/singleton.webp)

## 목적
지정한 클래스의 인스턴스가 반드시 1개만 존재한다는 것을 보증하고 싶을 때 사용한다.
1. 인스턴스의 유일성 보장을 통한 데이터 충돌 방지
   - 동일한 상태를 공유해야 하는 객체(로그, 설정 정보, 풀링 등)
2. 전역 상태를 쉽게 관리할 수 있다.
   - 애플리케이션 설정 정보 저장 객체
3. 시스템 자원의 효율적 사용
    - 인스턴스 생성 비용이 크거나 불필요한 객체 생성을 방지

## 관련 패턴
1. Abstract Factory
2. Builder
3. Facade
4. Flyweight
5. State
