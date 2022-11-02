# Introduction to Spring Boot [Day 1]

- What is Spring Boot?
    
    Spring Boot is a spring based Parent Project Defined by Pivotal Team that reduces common setup and code[common things] is called as AutoConfiguration.
    
    - Spring Boot is a Parent Project, our project is child Project
    - AutoConfiguration reduces programmer work, Programmer project is called as Child Project
- What is the auto-configuration?
    
    Suppose you want to Connect JDBC to Java program. You have to configure it in you java program
    
    ```java
    Class.forName(”________”);
    Drivermanager. getconnection (,,);
    Statement
    ResultSet
    ```
    
    In Spring There are template provided like JdbcTemplate. But you have to manually add jar files. and then configure it In AppConfig .Create a Bean and pass it. etc
    
    - **Spring :**
        
        
        ****                       HAS-A
                   JdbcTemplate    ---<> DataSource(I)
                                                           I IS-A
                                                    DriverManagerDataSource
        
        ```java
        // Developer has to write this code
        @Configuration
        public class AppConfig {
        @Bean
        public DriverManagerDataSource ds(){
        DriverManagerDataSource ds= new DriverManagerDataSource();
        ds.setDriverC1assName("______");
        ds.setUrl("______");
        ds.setUsername("______");
        ds.setPassword("______");
        return ds;
        }
        
        @Bean
        public JdbcTemp1ate jt(){
        JdbcTemp1ate jt= new JdbcTemp1ate();
        jt.setDataSource(ds());
        return jt;
        }
        ```
        
        spring-Jdbc.jar
        spring-context.jar
        .. etc
        Download and Install Database.
        
    - **In Spring Boot:**
        
        Autoconfiguration (classes, configuration, jars, embedded support/ install DB..etc.)
        
        Maven/Gradle
        spring-boot-starter-jdbc (line)
        code,
        
        ### inputs :
        
        [properties] (key=val) [Given by programmer]
        
        ```java
        spring. datasource.driver-class-name=
        spring. datasource. url=
        spring. datasource. username=
        spring. datasource. password=
        ```
        
        Predefined Key List: [https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html](https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html)
        
    
- FAQ: **Q) What is starter (or) Autoconfiguration in Spring Boot? With Example?**
    
    A) Spring Boot has provided common setup and code files that reduces programmer work, it is called as starter (or) Autoconfiguration.
    
    - Spring Boot also provide supports for **IN memory database || Embedded Database**
    This database works on Ram. We can use it for development only not for production. We have all types of option in these types of Databas**e**
        
        **Example For SQL:** H2 Database,  HSQL ,Hyper SQL ,Apache Derby
        
        **Example For NO-SQL:** Redis
        
    - Spring Boot also provide supports for Embedded Servers: Tomcat (Apache), Jetty(Eclipse),Undertow(JBoss)
    
- Spring Boot in an Image
    
    ![Untitled](Introduction%20to%20Spring%20Boot%20%5BDay%201%5D%20fcd93acdc2d847f5a329c24e98536611/Untitled.png)
    

---