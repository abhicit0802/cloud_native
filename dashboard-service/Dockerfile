FROM alpine-jdk:base
MAINTAINER javaonfly
RUN apk --no-cache add netcat-openbsd
COPY build/libs/dashboard-service-0.0.1-SNAPSHOT.jar /opt/lib/
COPY dashboardservice-entrypoint.sh /opt/bin/dashboard-service-entrypoint.sh
RUN chmod 755 /opt/bin/dashboard-service-entrypoint.sh
EXPOSE 8081