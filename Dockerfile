FROM registry.access.redhat.com/ubi8/openjdk-11:1.11 AS MAVEN_TOOL_CHAIN
WORKDIR /tmp/
COPY pom.xml /tmp/
COPY src /tmp/src/
RUN mvn clean package -Dmaven.test.skip=true


FROM registry.access.redhat.com/ubi8/openjdk-11:1.11
COPY --from=MAVEN_TOOL_CHAIN /tmp/target/quarkus-app/lib/ /deployments/lib/
COPY --from=MAVEN_TOOL_CHAIN /tmp/target/quarkus-app/*.jar /deployments/
COPY --from=MAVEN_TOOL_CHAIN /tmp/target/quarkus-app/app/ /deployments/app/
COPY --from=MAVEN_TOOL_CHAIN /tmp/target/quarkus-app/quarkus/ /deployments/quarkus/

EXPOSE 80
ENV AB_OFF=disabled

