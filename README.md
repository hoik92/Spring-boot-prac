# 스프링 부트 연습
스프링 부트를 이용해서 처음부터 무언가를 만들어보는 게 의미가 있을 것 같아서 연습해보려는 프로젝트다.
그래서 스프링 부트에 대한 것 외에는 거의 신경쓰지 않았다.
Java는 8, IDE는 IntelliJ community, DB는 MySQL을 사용했다.

## 1. 프로젝트 생성
일단 스프링 부트 프로젝트를 생성할 수 있도록 플러그인을 설치한다.
* File - Settings - Plugins 탭에서 spring을 검색하여 Swip 플러그인을 설치한다.
* 추가적으로 Spring Assistant를 설치해도 좋다.

새로운 프로젝트를 생성한다.
* File - New - Project - Spring Assistant 탭을 클릭한다.
* SDK를 확인하고 Next를 클릭한다.
* 프로젝트명, 패키지 이름 등을 설정하고 Next를 클릭한다.
* dependency를 추가한다.(첫 프로젝트라 dev tools, web 정도만 추가했다.)
* 프로젝트 디렉토리 명을 설정해주면 프로젝트 생성이 완료된다.

사실 이 부분이 스프링 부트를 시작할 때 가장 어려웠다.
프로젝트 생성하는 것만 수십 번 한 것 같다.

## 2. mysql + mybatis 연동
pom.xml에 mysql과 연동하기 위한 dependency를 추가한다.
```
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.17</version>
</dependency>

<dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
    <version>2.1.0</version>
</dependency>
```

application.properties에 mysql 정보를 입력한다.
```
database = mysql
spring.datasource.url =jdbc:mysql://localhost:3306/haribo?useSSL=false&characterEncoding=UTF-8&serverTimezone=UTC
spring.datasource.username = haribo
spring.datasource.password = haribo
```
url의 haribo는 사용할 데이터베이스 이름을 넣으면 된다.
username과 password 역시 데이터베이스에 접속할 정보를 넣으면 된다.