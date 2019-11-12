# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine
# copy WAR into image
WORKDIR /usr/share/@project.artifactId@

COPY @project.build.finalName@.jar /usr/share/@project.artifactId@/

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -Djava.security.egd=file:/dev/./urandom -jar @project.build.finalName@.jar" ]
