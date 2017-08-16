
# spring_boot_document.md  

http://projects.spring.io/spring-boot/  

http://docs.spring.io/spring-boot/docs/1.5.6.RELEASE/reference/htmlsingle/  


http://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test  

Excluding resources  
/META-INF/maven, /META-INF/resources ,/resources ,/static ,/public or /templates  



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


