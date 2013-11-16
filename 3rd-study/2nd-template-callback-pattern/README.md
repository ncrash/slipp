# jsoup을 이용한 템플릿/콜백 패턴실습

## 목적
* 책을 통해 템플릿/콜백에 대해 배운 내용을 실습해보면서 몸으로 체득하기

## 목표
* 국내 대표 소셜 사이트 Top 3 메인페이지에 뜨는 5가지 상품 목록 가져오기
    * 쿠팡 : 오늘의 추천
    * 위메프 : 오늘의 위메프 추천
    * 티몬 : 오늘의 추천

## 작업진행 계획
* 위 3가지 페이지를 HTML로 아카이브
* HTML 파일을 읽어서 목록을 추출하는 심플 메소드 구현
	* SocialProduct 객체 생성
	* 각 사이트별로 상품 목록 가져오는 코드 중복되도록 구현
* 각 클래스별로 각각 "Load a Document from a File" 처리 및 결과 List<String> 리턴
	* 한 클래스에서 각 사이트별로 구현로직 작성
* 반복되는 부분과 반복되지 않는 부분 추출
* 반복되는 부분 템플릿 생성
* 콜백으로 실제 처리해야하는 로직 전달

## 프로젝트 구성
* gradle base
    * 권남님의 gradle-tutorial을 활용해서 진행
    * 이 문서를 좀 더 발전시킨 [Rocking the gradle](https://github.com/ihoneymon/rocking-the-gradle) 참조.
	* 프로젝트 인코딩과 profile 설정을 위해 [DEV용식](http://devyongsik.tistory.com)님의 [spring-data-jpa-project-template](https://github.com/need4spd/spring-data-jpa-project-template/blob/master/build.gradle) 참고