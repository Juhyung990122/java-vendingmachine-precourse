# 자판기(3주차 미션) - 이주형

## 🚀 구현 기능 목록
반환되는 동전이 최소한이 되는 자판기를 구현한다.

- 자판기 보유 금액 입력
  - `camp.nextstep.edu.missionutils.Console`의 `readLine()` 활용

- 자판기 보유 동전 생성
  - `camp.nextstep.edu.missionutils.Randoms`의 `pickNumberInList()` 활용
  - 투입 금액으로는 동전을 생성하지 않는다.
  
- 상품 등록
  - 상품명, 가격, 수량을 입력하여 상품 추가(형식 : [콜라,1500,20];[사이다,1000,10])
  - 상품 가격은 100원부터 시작하며, 10원으로 나누어떨어져야 한다.
  - [예외] 입력 형식이 다른경우
  - [예외] 가격이 100원 이하인 경우
  - [예외] 가격이 10원으로 나누어떨어지지 않는 경우
  
- 사용자 금액 입력
  - 투입 금액 입력 문구 출력
  - `camp.nextstep.edu.missionutils.Console`의 `readLine()` 활용
  - [예외] 투입 금액이 숫자가 아닌 경우
  - [예외] 투입 금액이 음수인 경우
  
- 구매할 상품명 입력
  - 현재 투입 금액 출력
  - 구매 상품명 입력 문구 출력
  - `camp.nextstep.edu.missionutils.Console`의 `readLine()` 활용
  - [예외] 상품명이 등록되어 있지 않은 경우
  
- 구매
  - 투입 금액에서 구매할 상품 가격을 뺌
    - [예외] 투입 금액보다 상품가격이 비쌀 경우(투입 금액 - 구매할 상품가격 이 음수인 경우)
  - 남은 금액이 입력된 상품들의 최저 가격보다 적거나, 모든 상품이 소진됐는지 확인
    - 조건 미성립시 다시 구매할 상품명 입력
    - 조건 성립시 잔돈계산 단계로 넘어감

- 잔돈 계산
  - 현재 보유한 동전들에서 최소 개수의 동전으로 구성
  - 잔돈이 자판기 내 금액보다 큰경우 반환할 수 있는 금액만 반환
  
- 잔돈 반환
  -반환 문구 출력
  
## 🎱 프로그래밍 요구사항

- 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`를 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 해당 부분부터 다시 입력을 받는다.
- indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현한다. 2까지만 허용한다.
- 3항 연산자를 쓰지 않는다.
- 함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.
- else 예약어를 쓰지 않는다.
- 프로그래밍 요구사항에서 별도로 변경 불가 안내가 없는 경우 파일 수정과 패키지 이동을 자유롭게 할 수 있다.

### 프로그래밍 요구사항 - Coin

- Coin 클래스를 활용해 구현해야 한다.
- 필드(인스턴스 변수)인 `amount`의 접근 제어자 private을 변경할 수 없다.


### 프로그래밍 요구사항 - Randoms, Console

- JDK에서 기본 제공하는 Random, Scanner API 대신 `camp.nextstep.edu.missionutils`에서 제공하는 `Randoms`, `Console` API를 활용해 구현해야 한다.
   - Random 값 추출은 `camp.nextstep.edu.missionutils.Randoms`의 `pickNumberInList()`를 활용한다.
   - 사용자가 입력하는 값은 `camp.nextstep.edu.missionutils.Console`의 `readLine()`을 활용한다.
- 프로그램 구현을 완료했을 때 `src/test/java` 디렉터리의 `ApplicationTest`에 있는 모든 테스트 케이스가 성공해야 한다. **테스트가 실패할 경우 0점 처리한다.**
