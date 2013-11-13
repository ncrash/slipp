* gradle과 gradlew의 차이점
* gradle -i build
    * info 레벨로 빌드 실행
* gradle test -Dtest.single=LibraryTest 
    * 단일 테스트 지정하고 실행
* gradle -q task
    * gradle 내부 메시지 로깅
* alias cdgt='path'
    * 가볍게 cd 하는 부분 지정해두기... 서버에서 지정해두고 쓰면 편할듯
* Eclipse External Tools Configuration 기능을 이용해서 gradle 명령어를 등록해서 사용하는 것이 가능
    * 외부 프로그램을 eclipse에 등록하는 것 
    * refresh 체크 하고 favorite 메뉴에 추가
    * eclipse clean
* git checkout -- build.gradle
    * revert?
* git checkout step_04
    * 지정한 tag로 switch
* gradle에서 providedCompile는 웹 프로젝트에서만 쓸 수 있도록 제약을 두고 있는데 gradle의 유일한 단점이라고...
* eclipse에서 프로젝트 정보가 너무 많이 변경되면 기존 프로젝트를 날리고 import를 하는게 좋음
* eclipse kepler부터 멀티 프로젝트 import를 지원한다고... 단, search nested project 옵션을 활성화 하고..
* 웹프로젝트에서 plugin eclipse-wtp 관련 프로젝트에 설정하지 않으면 웹 서버가 뜨지 않는다고... 지금 딱 겪고 있는 문제이고 gradle 버그같다고...
* 멀티 프로젝트 구성의 핵심은 루트 프로젝트에 settings.gradle이며 gradle이 settings.gradle 파일이 있는것을 확인해야 멀티 프로젝트로 인식한다고..
    * 각 프로젝트에서 build.gradle내에 의존관계 프로젝트 명시는 아래와 같이 선언
    * compile project(':tutorial')