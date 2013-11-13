# 6주차 - node.js #
* http://slipp.net/wiki/pages/viewpage.action?pageId=12878024

## Header Text ##
* node는 기본적으로 1개의 이벤트 쓰레드와 3개의 워킹 쓰레드가 한조로 구성
    * Client 요청을 받게 되면 이벤트 쓰레드가 큐에 Request를 등록 시키는 역활
    * 이후 워킹 쓰레드가 이벤트 작업을 진행하고 작업이 끝나면 이벤트를 큐 쪽에다 콜백 처리
* 라이언달이 얘기한 Reverse Proxy 처리.. 보안적인 면에서 좋다고.. 
    * Nginx
        * Rails
        * Rails
        * Node
* nginx -> express를 통해 간단한 웹 개발 셋팅
    * 성능도 매우 좋은편이나 테스트는 어렵고.. 그래서 간단한 로직처리를 하는 TCP 소켓 처리는 아주 좋은 용도로 보인다고
* vagrant chef 설정은 꼭 배워야 함
* [mocha test framework](http://visionmedia.github.io/mocha/).. bdd/tdd 둘다 지원