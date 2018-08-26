FROM alpine-jdk:base
MAINTAINER javaonfly
COPY build/libs/discoveryserver-1.0-SNAPSHOT.jar /opt/lib/
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/lib/discoveryserver-1.0-SNAPSHOT.jar"]
EXPOSE 8761