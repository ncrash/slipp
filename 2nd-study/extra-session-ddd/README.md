# Rich Domain Model #

* 영화는 meta 정보이고 실제 activity는 영화상영(showing)
* 할인의 영역에서 정책과 규칙의 차이
* anemic domain model
* 데이터 중심의 중앙 집중식 구조(Transaction Script 패턴)
    * 참고 : Service Design Patterns: Fundamental Design Solutions for SOAP/WSDL and RESTful Web Services
* 객체지향은 프로세스나 데이터에 집중이 아니라 "책임"에 집중
* 책임주도설계
    * CRC(Cadidate, Responsibility, 협력자 collaborator)
    * 객체지향적으로 설계할때는 데이터에 대한 걱정은 잠시 꺼둬야...
    * 객체와 객체간에 협력하는 형태 완성
        * 위임식, 분산식, 제어 스타일(슬라이드 참고)
    * Domain Model 패턴
        * 참고 서적 : Patterns of enterprise application architecture
* Transaction Script의 단점
    * 기존 코드를 열어서 if문을 추가하거나 새로운 기능을 추가하도록 강요
    * 이로 인해서 오동작할 즉 버그가 심겨질 가능성이 매우 높아짐
* Rich Domain Model의 장점
    * 새로운 할인정책이 생겼을때 유연하게 대응
    * 객체지향 코드는 이해하기 어렵지만 구조가 머릿속에 잡히면 그림을 그리고 변경을 하기 쉬운 구조로 바뀜.. 
* OCP(Open Closed Principle)를 만족하는 설계가 좋은 설계
* 관심사의 분리... 
    * 도메인 레이어는 가능하면 강제해서 캡슐화를 
    * 사용하는 레이어에 대한 타 레이어로 스며들지 않도록 하는것이 중요
* POJO의 3대 요소
    * di, aop, annotation
    * domain 객체에 annotation으로 db 연결에 대한 부분을 덜어내 주니 pojo라 봐도 무방??
* Rich Domain 설계 방법...
    * legacy가 있는 DB를 분석하고 요소를 뽑아내는 방식으로 진행
    * 새로운 시스템이면 고객의 요구사항 분석으로 요소를 뽑아내는 형식으로 진행
* in-out 방식 or out-in 방식... 
    * 즉 UI에서 DB, 모델에서 UI로 방식인데.. 갠적으론 in-out이 더 땡김