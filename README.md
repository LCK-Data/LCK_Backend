# LCK_Data_Analys_SpringBoot
SPRING BOOT 실행법

- 폴더위치 : member/ -> TERMINAL -> mvn spring-boot:run


```
test
├─ .vscode
│  ├─ launch.json
│  └─ settings.json
└─ member
   ├─ .mvn
   │  └─ wrapper
   │     └─ maven-wrapper.properties
   ├─ .vscode
   │  └─ NEWLY_CREATED_BY_SPRING_INITIALIZR
   ├─ HELP.md
   ├─ mvnw
   ├─ mvnw.cmd
   ├─ pom.xml
   ├─ src
   │  ├─ main
   │  │  ├─ java
   │  │  │  └─ com
   │  │  │     └─ example
   │  │  │        └─ member
   │  │  │           ├─ controller
   │  │  │           │  ├─ MatchController.java
   │  │  │           │  └─ TableController.java
   │  │  │           ├─ MemberApplication.java
   │  │  │           ├─ model
   │  │  │           │  └─ Match.java
   │  │  │           ├─ repository
   │  │  │           │  ├─ DatabaseMetadataRepository.java
   │  │  │           │  └─ MatchRepository.java
   │  │  │           └─ service
   │  │  │              ├─ MatchService.java
   │  │  │              └─ TableService.java
   │  │  └─ resources
   │  │     ├─ application.properties
   │  │     ├─ static
   │  │     │  ├─ audio
   │  │     │  │  └─ BGM.mp3
   │  │     │  ├─ css
   │  │     │  │  ├─ main.css
   │  │     │  │  └─ match.css
   │  │     │  ├─ images
   │  │     │  │  ├─ back.png
   │  │     │  │  ├─ BRO_background.jpg
   │  │     │  │  ├─ DK_background.jpg
   │  │     │  │  ├─ DRX_background.jpg
   │  │     │  │  ├─ FOX_background.jpg
   │  │     │  │  ├─ GENG_background.jpg
   │  │     │  │  ├─ half-star.svg
   │  │     │  │  ├─ HLE_background.jpg
   │  │     │  │  ├─ KDF_background.jpg
   │  │     │  │  ├─ KT_background.jpg
   │  │     │  │  ├─ NS_background.jpg
   │  │     │  │  ├─ star.svg
   │  │     │  │  ├─ T1_background.jpg
   │  │     │  │  └─ teams
   │  │     │  │     ├─ BRO.png
   │  │     │  │     ├─ DK.png
   │  │     │  │     ├─ DRX.png
   │  │     │  │     ├─ FOX.png
   │  │     │  │     ├─ GENG.png
   │  │     │  │     ├─ HLE.png
   │  │     │  │     ├─ KDF.png
   │  │     │  │     ├─ KT.png
   │  │     │  │     ├─ NS.png
   │  │     │  │     └─ T1.png
   │  │     │  └─ js
   │  │     │     ├─ main.js
   │  │     │     └─ match.js
   │  │     └─ templates
   │  │        ├─ main.html
   │  │        ├─ match.html
   │  │        ├─ tableData.html
   │  │        ├─ tables.html
   │  │        └─ teams.html
   │  └─ test
   │     └─ java
   │        └─ com
   │           └─ example
   │              └─ member
   │                 └─ MemberApplicationTests.java
   └─ target
      ├─ classes
      │  ├─ application.properties
      │  ├─ com
      │  │  └─ example
      │  │     └─ member
      │  │        ├─ controller
      │  │        │  ├─ MatchController.class
      │  │        │  └─ TableController.class
      │  │        ├─ MemberApplication.class
      │  │        ├─ model
      │  │        │  └─ Match.class
      │  │        ├─ repository
      │  │        │  ├─ DatabaseMetadataRepository.class
      │  │        │  └─ MatchRepository.class
      │  │        └─ service
      │  │           ├─ MatchService.class
      │  │           └─ TableService.class
      │  ├─ static
      │  │  ├─ audio
      │  │  │  └─ BGM.mp3
      │  │  ├─ css
      │  │  │  ├─ main.css
      │  │  │  └─ match.css
      │  │  ├─ images
      │  │  │  ├─ back.png
      │  │  │  ├─ BRO_background.jpg
      │  │  │  ├─ DK_background.jpg
      │  │  │  ├─ DRX_background.jpg
      │  │  │  ├─ FOX_background.jpg
      │  │  │  ├─ GENG_background.jpg
      │  │  │  ├─ half-star.svg
      │  │  │  ├─ HLE_background.jpg
      │  │  │  ├─ KDF_background.jpg
      │  │  │  ├─ KT_background.jpg
      │  │  │  ├─ NS_background.jpg
      │  │  │  ├─ star.svg
      │  │  │  ├─ T1_background.jpg
      │  │  │  └─ teams
      │  │  │     ├─ BRO.png
      │  │  │     ├─ DK.png
      │  │  │     ├─ DRX.png
      │  │  │     ├─ FOX.png
      │  │  │     ├─ GENG.png
      │  │  │     ├─ HLE.png
      │  │  │     ├─ KDF.png
      │  │  │     ├─ KT.png
      │  │  │     ├─ NS.png
      │  │  │     └─ T1.png
      │  │  └─ js
      │  │     ├─ main.js
      │  │     └─ match.js
      │  └─ templates
      │     ├─ main.html
      │     ├─ match.html
      │     ├─ tableData.html
      │     ├─ tables.html
      │     └─ teams.html
      ├─ generated-sources
      │  └─ annotations
      ├─ generated-test-sources
      │  └─ test-annotations
      ├─ maven-status
      │  └─ maven-compiler-plugin
      │     ├─ compile
      │     │  └─ default-compile
      │     │     ├─ createdFiles.lst
      │     │     └─ inputFiles.lst
      │     └─ testCompile
      │        └─ default-testCompile
      │           ├─ createdFiles.lst
      │           └─ inputFiles.lst
      └─ test-classes
         └─ com
            └─ example
               └─ member
                  └─ MemberApplicationTests.class

```