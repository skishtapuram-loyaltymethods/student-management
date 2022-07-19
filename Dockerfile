FROM openjdk
COPY target/student-management-0.0.1.jar app.jar
#EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]





















#RUN java -jar app.jar

#RUN mkdir /Projects
#RUN mkdir /opt/Courses
#WORKDIR /opt/Courses
#RUN touch names.txt
#WORKDIR /Projects

#ARG JAR_FILE=./target/student-management-0.0.1.jar

#COPY ${JAR_FILE} app.jar


#ENTRYPOINT [ "/home/workspace/Student-administration/entry.sh" ]
#EXPOSE 9042
#FROM sudo -u postgres psql
#WORKDIR ./
#VOLUME /tmp

#ADD target/student-management-0.0.1.jar student.jar
#RUN echo 'we are running some # of cool things'
#
#USER root
#
## Install OpenJDK-11
#RUN apt update && \
#apt-get install -y openjdk-11-jdk && \
#apt-get install -y ant && \
#apt-get clean;
#
## Set JAVA_HOME
#ENV JAVA_HOME /usr/lib/jvm/java-11-openjdk-amd64/
#RUN export JAVA_HOME



#FROM adoptopenjdk/openjdk11:alpine-jre
