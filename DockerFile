FROM openjdk:8
RUN mkdir -p /opt/
WORKDIR /opt/
ADD https://apurbaa10.jfrog.io/artifactory/default-maven-local/petclinic/jar/spring-petclinic-2.4.5.jar 
EXPOSE 8085
CMD ["java", "-jar", "spring-petclinic-2.4.5.jar"]
