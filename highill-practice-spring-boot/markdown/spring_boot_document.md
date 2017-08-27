
# spring_boot_document.md  

http://projects.spring.io/spring-boot/  

http://docs.spring.io/spring-boot/docs/1.5.6.RELEASE/reference/htmlsingle/  


http://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test  

Excluding resources  
/META-INF/maven, /META-INF/resources ,/resources ,/static ,/public or /templates  

https://docs.spring.io/spring/docs/4.3.10.RELEASE/spring-framework-reference/htmlsingle/#mvc-config  



# 常用注解  

```  
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan  



```  

# 测试组件  

Firefox 安装 HttpRequester  

```  
http://127.0.0.1:10001/practice/normal?name=DemoName&info=GoodMessage  


http://127.0.0.1:10001/practice/json?name=JsonName&info=JsonInfo  
Content-Type: application/json;charset=UTF-8


http://127.0.0.1:10001/practice/jsonbody  
POST PUT PATCH  PROPFIND  
Content-Type:  application/json;charset=UTF-8  
{
    "name": "JsonBodyName",
    "info": "JsonBodyInfo"
}

{
}




```  

# 部署  
```  
$ scp target/highill-practice-spring-boot-0.0.0.1-SNAPSHOT.jar root@192.168.1.108:/var/highill-practice-spring-boot/

$ cd /var/highill-practice-spring-boot/
$ sudo cp highill-practice-spring-boot-0.0.0.1-SNAPSHOT.jar highill-practice-spring-boot-10001.jar

$ sudo vim highill-practice-spring-boot-10001.conf
JAVA_OPTS="-Xmx128M -Dfile.encoding=utf-8 -Djava.security.egd=file:/dev/./urandom -Dspring.application.name=highill-practice-spring-boot-10001 -Dserver.port=10001"




$ sudo chmod +x highill-practice-spring-boot-10001.jar
$ sudo ln -s /var/highill-practice-spring-boot/highill-practice-spring-boot-10001.jar /etc/init.d/highill-practice-spring-boot-10001

$ sudo service highill-practice-spring-boot-10001 start


-- logs 
$ sudo tail -n 500 -f /root/logs/highill-practicepring-boot-10001/highill-practice-spring-boot-10001.log
$ tail -n 500 -f /var/log/highill-practice-spring-boot-10001.log

$ curl "http://127.0.0.1:10001/practice/normal?name=MyName&info=GoodMessage"


```  




