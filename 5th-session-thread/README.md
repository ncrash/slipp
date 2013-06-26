# 5주차- 대규모트래픽 분산처리를 위한 자바 서버개발
* http://www.slipp.net/wiki/pages/viewpage.action?pageId=12189761&focusedCommentId=14549223#comment-14549223

## Thread
* Default, Daemon, Join
* volatile, synchronized 선언 꼭 
  * java에서 제공하는 concurrent만 써라. 
  * executor call 알아서 하니 thread start를 쓰지 말라
* Reactor Pattern

## JVM Memory
* Stack Area : main() Stack Frame, add() Stack frame
  * Operand Stack, Local Variable
* Heap Area : 변수를 담는 공간
  * `ex) 초기화가 완료된 Adder Instance`
* Method Area
  * 상수를 담는 공간, 굳이 상수로 선언하지 않아도 `String a = "Hello"` 같이 되어 있어도 상수 영역에 올라감
  * 자주 사용되는 primitive type(ex. 1~9)도 JVM에서 관리를 해줌

### Analysis
* javap -verbose 
  * 우롱 랭귀지? (절차적인 언어)
    * Groovy나 Scala도 우롱 랭귀지로 변환을 해서 JVM이 인식가능 하도록 변환 처리
  * ldc : load constant

### Call
* Call by Value
* Call by Reference


## 기타
* Stream 처리에 관련한 데코레이터 패턴
* 멀티쓰레드 상황에서 instance 공유 
* 웹서버 만들기 실습!!