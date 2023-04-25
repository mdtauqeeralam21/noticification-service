FROM openjdk:17

EXPOSE 9008

ADD /target/g2-notification-service.jar g2-notification-service.jar

ENTRYPOINT [ "java","-jar","/g2-notification-service.jar"]