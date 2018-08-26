FROM alpine:edge
MAINTAINER javaonfly
RUN apk add --no-cache openjdk8
COPY build/libs/configservice-1.0-SNAPSHOT.jar /opt/lib/
RUN apk add --no-cache openjdk8
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/lib/configservice-1.0-SNAPSHOT.jar"]
EXPOSE 8888