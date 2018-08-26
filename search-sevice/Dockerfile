FROM alpine-jdk:base
MAINTAINER javaonfly
RUN apk --no-cache add netcat-openbsd
COPY build/libs/search-sevice-0.0.1-SNAPSHOT.jar /opt/lib/
COPY searchservice-entrypoint.sh /opt/bin/searchservice-entrypoint.sh
RUN chmod 755 /opt/bin/searchservice-entrypoint.sh
EXPOSE 8080