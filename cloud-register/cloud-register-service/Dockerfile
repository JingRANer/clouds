# 使用官方的OpenJDK 8作为基础镜像
FROM java:openjdk-8u111-jre

# 定义维护者信息
LABEL maintainer="JingRANrrr@gmail.com"

# 环境变量
ENV JAVA_OPTS=""
#
## 安装Tomcat 9
ENV CATALINA_HOME /usr/local/tomcat
ENV PATH $CATALINA_HOME/bin:$PATH

#RUN mkdir /opt/tomcat \
#    && cd /opt \
#    && curl -fSL http://www-us.apache.org/dist/tomcat/tomcat-9/v9.0.37/bin/apache-tomcat-9.0.37.tar.gz | tar -xz \
#    && mv apache-tomcat-9.0.37 $CATALINA_HOME \
#    && rm -rf apache-tomcat-* \
#    && chmod +x $CATALINA_HOME/bin/*.sh


# 下载Tomcat并解压到指定目录
RUN wget https://downloads.apache.org/tomcat/tomcat-9/v9.0.94/bin/apache-tomcat-9.0.94.tar.gz && \
    tar -xvf apache-tomcat-9.0.94.tar.gz && \
    mv apache-tomcat-9.0.94 $CATALINA_HOME && \
    rm apache-tomcat-*.tar.gz && \
    chmod +x $CATALINA_HOME/bin/*.sh



# 复制Spring项目的WAR文件到Tomcat的webapps目录
COPY target/cloud-register-service-0.0.1-SNAPSHOT.war $CATALINA_HOME/webapps/cloud_register.war

# 暴露8080端口
EXPOSE 8080

# 启动Tomcat服务器
CMD ["catalina.sh", "run"]