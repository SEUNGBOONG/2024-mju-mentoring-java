## 세션1 To do list

### 이론

- 깃허브 학습 (사용법, 사용 이유 등등...)
- MVC 패턴 학습
- 자바 구글 컨벤션 익히기
- 객체 구조로 학습하기
- `객체지향의 사실과 오해` 책 읽어보기
- 테스트 코드가 필요한 이유와 어떻게 작성하는지 학습하기

- static, final, 생성자, 일급컬렉션

### 실습

- example 패키지
    - example 패키지 안에 클래스 확인 후 테스트 코드 완성하기
    - 테스트 코드의 Todo를 보고 Person 클래스 변경 및 테스트 완성하기

- 슬랙으로 문제 확인 후 racing 미션 구현하기
    - 테스트 코드 할 수 있는만큼 최대한 작성하고 고민하기 (ex. private 접근제어자의 테스트는 어떻게 할지 등등..)
    - 캡슐화 신경쓰기
    - setter 사용은 지양하기

- CAR
    - [x] 자동차가 숫자 3보다 크면 움직인다.
- Cars
    - [x] 승자 구하기
    - [x] 자동차 움직이기

- InputView 
  - [x]자동차 쉼표로 구분하기
  - [x] 시도할 횟수입력받기

-OutputView
  - [x] 자동차 움직임 인트값 변환
  - [x] 승자출력


- RacingController
  - [x] 레이싱 조립 


- 공부할 내용 
  - Stream
  - https://jamie95.tistory.com/99 //생활체조
  - OutputView에서 스트링 빌더를 굳이 사용했던이유 다시 고민하기 
  - 정확하게 StringBuilder와 String 차이 알기 https://ssj9902.tistory.com/entry/%EC%9E%90%EB%B0%94-%EC%8A%A4%ED%8A%B8%EB%A7%81-String-%EC%8A%A4%ED%8A%B8%EB%A7%81%EB%B2%84%ED%8D%BCString-Buffer-%EC%8A%A4%ED%8A%B8%EB%A7%81%EB%B9%8C%EB%8D%94String-Builder-%EC%A0%95%EB%A6%AC
  - 

  String
- String 은 불변 자료형이라고 불린다. 
- 초기 공간과 다르게 많은 시간과 자연을 사용함.
- 불변하게 설계한 이유는 캐싱,보안, 동기화, 성능 측면 이점을 얻기위해서다
  -String pool에 각 리터럴 문자열 하남나 저장 ( 캐싱)
  - 데이터베이스에 연결 수신하기 위해 문자열로 전달된다. 만약 해커가 참조값을 변경하여 보안 문제일으킬수 있다.

StringBuffer/StringBuilder
- 이것들은 변할 수 있다. 
- 객체의 공간이 부족해지는 경우 버퍼의 크기를 유연하게 늘려준다.
- String은 한번 생성되면 불변적인 특징 때문에 값을 업데이트하면, 새로운 인스턴스가 생겨 메모리공간을 차지한다.
- 

Steram:
- 스트림은 데이터의 흐름이다. 
- 배열에서 여러 개를 조합해서 원하는 결과를 필터링하고, 가공된 결과를 얻는다.
- 또한 람다를 이용해서 코드의 양을 줄이고 간결해진다.
- 병렬처리가 가능하다.
  - 하나의 작업을 둘 이상의 작업으로 잘게 나눠서 동시에 진행하는 것
  - 쓰레드를 이용해 많은 요소들을 빠르게 처리한다.
  - String[] arr = new String[]{"a","b","c"};
  - Stream<String> stream = Arrays.stream(arr);
- 기본형태이다.
- 컬렉션에서도 가능하다 .
- 빌더(Builder)를 사용하면 스트림에 직접적으로 원하는 값을 넣을 수 있습니다.
- 마지막에 build 메소드로 스트림을 리턴합니다.
- 