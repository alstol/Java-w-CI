FROM gradle:5.1.1-jdk8-alpine
RUN gradle build --stacktrace --info

FROM openjdk:8-jdk-alpine
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
ADD build/libs/Java-w-Docker-0.1.jar java-w-docker.jar
EXPOSE 8080
ENTRYPOINT exec java $JAVA_OPTS -jar java-w-docker.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar java-w-docker.jar
