
## Introduction to Spring Boot [Day 1]

## What is Spring boot?
* Spring boot is a spring based framework which is open source and developed by Pivotal Team.       
* It provides an easier and faster way to set up, configure, and run both simple and web-based applications.      
* It is a Spring module that provides the `RAD (Rapid Application Development)` feature to the Spring Framework.    
* Spring Boot provides `AutoConfiguration` which means reduce Common lines of code in Application which is written by Programmers and handles Jars with version 
management.
* Spring Boot is a Parent Project, our project is child Project

## What is auto-configuration?

Spring Boot auto-configuration automatically configures the Spring application based on the jar dependencies that we have added.               		

For example, if the `Oracle/Mysql/H2 database` Jar is present in the classpath and we have not configured any beans related to the database manually, the Spring Boot's auto-configuration feature automatically configures it in the project.

Let's take and Example with Core Java, Spring , Spring Boot.
### JDBC with Core java

We are using `Oracle Database` in this example

#### Step 1: Create a Table

```sql
create table emp(id number(10),name varchar2(40),age number(3),addr varchar2(40));  
```

#### Step 2: Add `ojdbc6.jar` file in the src folder and click on `Build path > Add to build path`

#### Step 3: Connect Java Application with Oracle database
    There are again 5 small steps   
    1. Load the driver class
    2. create  the connection object  
    3. create the Statement/PreparedStatement object.
    4. Execute query  
    5. close the connection object 
---
```java
import java.sql.*;  
class OracleCon{  
	public static void main(String args[]){  
		try{  
			//step 1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  

			//step 2 create  the connection object  
			Connection con=DriverManager.getConnection(  
					"jdbc:oracle:thin:@localhost:1521:xe","system","manager");  

			//step 3 create the statement object  
			Statement stmt=con.createStatement();  

			//step 4 execute query  
			ResultSet rs=stmt.executeQuery("select * from emp");  
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+" " +rs.getString(2));  

			//step 5 close the connection object  
			con.close();  

		}catch(Exception e){ System.out.println(e);}  

	}  
} 
```  

### JDBC with Spring
#### Step 1: (Create Spring JDBC project using Maven)

#### Step 2 : (Add Spring JDBC and Oracle dependencies)

<<<<<<< HEAD
=======
<details>
<summary>What is Spring Boot?</summary>
<p>Spring Boot is a spring based Parent Project Defined by Pivotal Team that reduces common setup and code[common things] is called as AutoConfiguration.
    
    - Spring Boot is a Parent Project, our project is child Project
    - AutoConfiguration reduces programmer work, Programmer project is called as Child Project
</details>
- What is the auto-configuration?
    
    Suppose you want to Connect JDBC to Java program. You have to configure it in you java program
    
    ```java
    Class.forName(”________”);
    Drivermanager. getconnection (,,);
    Statement
    ResultSet
    ```
    
    In Spring There are template provided like JdbcTemplate. But you have to manually add jar files. and then configure it In AppConfig .Create a Bean and pass it. etc
    
    - **JDBC Configuration in Spring :**
        
        <img src="https://user-images.githubusercontent.com/67812755/199768466-9afdca5a-9220-4d3d-b47e-3669507cc6df.png" style="width:400px;">
       
        
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
        
    - **JDBC Configuration in Spring Boot:**
        
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
        
    <details>
  <summary><strong>Q) What is starter (or) Autoconfiguration in Spring Boot? With Example? </strong> </summary>
        A) Spring Boot has provided common setup and code files that reduces programmer work, it is called as starter (or) Autoconfiguration.
    
  - Spring Boot also provide supports for <b>IN memory database || Embedded Database</b>
    This database works on Ram. We can use it for development only not for production. We have all types of option in these types of Database
        
        > Example For SQL    : H2 Database,  HSQL ,Hyper SQL ,Apache Derby
        > Example For NO-SQL : Redis
        
    - Spring Boot also provide supports for Embedded Servers: Tomcat (Apache), Jetty(Eclipse),Undertow(JBoss)
</details> 
<details>
  <summary><strong>Spring Boot in an Image <strong> </summary>
    <img src="https://user-images.githubusercontent.com/67812755/199768384-1cbbf52a-a098-4505-a52e-d5413c560ce7.png" style="width:400px;">
</details> 
>>>>>>> 90ff149d215459cf3f99f99c3564cc5709c6b610
 
```
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-jdbc</artifactId>
      <version>4.0.5.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context</artifactId>
      <version>4.0.5.RELEASE</version>
    </dependency>
```
> Since we are using Oracle Driver, we will add corresponding driver dependency as well:
```
<dependency>
    <groupId>com.oracle.database.jdbc</groupId>
    <artifactId>ojdbc10</artifactId>
    <version>19.16.0.0</version>
</dependency>
```
#### Step 3: (Create Employee table in Oracle Database) 
```sql
CREATE TABLE `employee` (
  `id` Number(11) ,
  `age` Number(11),
  `name` varchar(255),
  address varchar(255),
  PRIMARY KEY (`id`)
) 
```
> Lets insert some record into the employee table 

```sql
insert into employee values(101,22,'Hritik','Gadchiroli');
insert into employee values(102,22,'Laxmi','Balaghat');
insert into employee values(103,22,'Atharva','Nagpur');
```
#### Step 4: (Create Data Transfer Object)
> Create an entity(Model) class
```java
package com.codeheist.model;

public class Employee {

  private int id;
  private String name;
  private int age;
  private String address;
  
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
    public int getAddress() {
    return address;
  }
  public void setAge(int address) {
    this.address = address;
  }
  
}
```

#### Step 5: (Create configuration class)
> We will create a configuration class for obtaining the DataSource details and JDBCTemplate.
```java
package com.codeheist.bean;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringJDBCConfiguration {
  @Bean
  public DataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    //MySQL database we are using
    dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
    dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");//change url if required
    dataSource.setUsername("System");//change username if required
    dataSource.setPassword("password");//change pwd
   
    return dataSource;
  }

  @Bean
  public JdbcTemplate jdbcTemplate() {
    JdbcTemplate jdbcTemplate = new JdbcTemplate();
    jdbcTemplate.setDataSource(dataSource());
    return jdbcTemplate;
  }

  @Bean
  public EmployeeDAO employeeDAO(){
    EmployeeDAOImpl empDao = new EmployeeDAOImpl();
    empDao.setJdbcTemplate(jdbcTemplate());
    return empDao;
  }

}
```

#### Step 6: (Create DAO classes)

> Let’s create the EmployeeDAO interface and implementation class for the db operations. 
> We are using JdbcTemplate for the db operations here.
```java
package com.codeheist.dao;

public interface EmployeeDAO {
  public String getEmployeeName(int id);
}
```
```java
package com.codeheist.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

  private JdbcTemplate jdbcTemplate;
  
  public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
    this.jdbcTemplate = jdbcTemplate;
  }

  public String getEmployeeName(int id) {
    String sql = "select name from employee where id = ?";
    String name = jdbcTemplate.queryForObject(sql,new Object[]{id},String.class);
    return name;
  }

}
```

> In the DAO class, we have provided implementation for reading name for an employee using the ID.

#### Step 7: (Main App class)

```
package com.codeheist.main;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
  public static void main(String[] args) throws SQLException {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
        SpringJDBCConfiguration.class);

    EmployeeDAO empDAO = applicationContext.getBean(EmployeeDAO.class);

    String empName = empDAO.getEmployeeName(1);

    System.out.println("Employee name is " + empName);

    applicationContext.close();
  }
}
```

### JDBC with Spring Boot

#### Step 1: Create Spring Boot Project

```
  <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-jdbc</artifactId>
        </dependency>
      	<dependency>
    	    <groupId>com.oracle.database.jdbc</groupId>
    	    <artifactId>ojdbc10</artifactId>
	</dependency>
  </dependencies>
```

#### Step 2: (Create Employee table in Oracle Database) 
```sql
CREATE TABLE `employee` (
  `id` Number(11) ,
  `age` Number(11),
  `name` varchar(255),
  address varchar(255),
  PRIMARY KEY (`id`)
) 
```

#### Step 3. Configure Database Connection Properties
> Create the application.properties file under the src/main/resources 
```
spring.datasource.driver=oracle.jdbc.OracleDriver
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:xe
spring.datasource.username=system
spring.datasource.password=password
```
> Here, we specify database connection information

#### Step 4. Code Java Model class
```java
package com.codeheist.model;

public class Employee {

  private int id;
  private String name;
  private int age;
  private String address;
  
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
    public int getAddress() {
    return address;
  }
  public void setAge(int address) {
    this.address = address;
  }
  
}
```
> Note that this model class has field names exactly match the column names in the corresponding table.

#### Step 5. Code Spring Boot JDBC Application

```java
package com.codeheist.main
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
 
@SpringBootApplication
public class SpringBootJdbcExample implements CommandLineRunner {
 
    @Autowired
    JdbcTemplate jdbcTemplate;
     
    public static void main(String[] args) {
        SpringApplication.run(SpringBootJdbcExample.class, args);
    }
 
    @Override
    public void run(String... args) throws Exception {
         
        String sql = "INSERT INTO books (id, name,age, address) VALUES (?, ?, ?)";
        int result = jdbcTemplate.update(101, "Hritik", 22, "nagpur");
         
        if (result > 0) {
            System.out.println("Insert successfully.");
        }      
    }
}

```

> ### Summary
As you scroll down from Jdbc In Core java to Spring JDBC to SpringBoot code get's less and easier.

### FAQ
<details>
	<summary>Q) What is starter (or) Autoconfiguration in Spring Boot? With Example?</summary>
	A) Spring Boot has provided common setup and code files that reduces programmer work, it is called as starter (or) Autoconfiguration.

- Spring Boot also provide supports for **IN memory database || Embedded Database**
This database works on Ram. We can use it for development only not for production. We have all types of option in these types of Databas**e**
    
    **Example For SQL:** H2 Database,  HSQL ,Hyper SQL ,Apache Derby
    
    **Example For NO-SQL:** Redis
    
- Spring Boot also provide supports for Embedded Servers: Tomcat (Apache), Jetty(Eclipse),Undertow(JBoss)
</details>
	
<details>
	<summary>Spring Boot in an Image</summary>
	<img src="https://user-images.githubusercontent.com/67812755/200310916-eaf7cc24-4641-4c04-a802-2b8165b279f3.png" alt="Spring Boot in an Image"/>
</details>

---
## Spring Boot Starter Files[Day 2]


- We learned in the introducton that Spring Boot provide RAD(Rapid Application Development).
- Spring Boor uses `Starter Project` to provide RAD

### Starter Project contains 3 files in project Structure    
`1. Starter Class aka BootStrap class aka main() class`    
  - In this part there will be a normal java class with the project name as class Name.    
  - This class is responsible for creating Spring Container and Start the application.    
  - It is located inside `src/main/package_name/project_name.java`    
	    
`2. appliation.properties`    
  - We use this file to provide inputs to our application.   
  - It provides inputs in `key-value` format    
  - It is located inside `src/main/resources/application.properties`    
	    
`3.  Build Information File`     
  - It allows you to package executable jar or war archives, run Spring Boot applications, generate build information and start your Spring Boot application               prior to running integration tests.     
  - We can any one of the below build files     
    1. Gradle (build.gradle)    
    2. Maven (pom.xml)    
	      
<details>
<summary>Folder Structure</summary>
<img src="https://user-images.githubusercontent.com/67812755/200368560-ac8a4eeb-655e-4cc8-b3ad-723a73eb91ed.png" width="500px"/>
</br>
<img src="https://user-images.githubusercontent.com/67812755/200368622-0041fc1f-16a9-4caa-b6ac-b6c6982b2e73.png" width="500px"/>
</details>

### Starter class || Bootstrap class || main() class

Spring Container:- [pre-defined application in Spring]
 1. Create object to detected classes [non abstract class, not a interface]
 2. Provide data to objects
 3. Link one object with another object (HAS-A Relation)
 4. Destroy the object (while stopping application/server) 
 
 <details>
 <summary>Two types of Spring Container</summary>
 a. BeanFactory (I) [Legacy-old container] works with XML.     
 
 b. ApplicationContext (I) [New container] works with XML /Java/Annotation Configuration
 </details>
    
---
#### Starter class code
```java
    @SpringBootApplication
     public class DemoApp{
	public static void main(String [] args){
	      SpringApplication.run(DemoApp.class,args);
     }
    }
```

---

### b. application.properties || application.yml

These are used to provide data to Spring container objects in key value format.(key=value).

There are two types of keys
 - Programmer Defined: This keys mean we have to provide our own key and values in application.properties 
 
   ```
   my.app.eid=101
   my.app.ename=Hritik
   my.app.esal=9000.0
   my.app.eaddr=Nagpur
   ```
 - Pre-Defined keys:  those keys who are  provided by Spring Boot Team. We just need to provide value to those keys.
 
    ```
    spring.datasource.driver-class-name= com.mysql.jdbc.driver.Driver
    spring.datasource.url= jdbc:mysql://localhost:3306/test
    spring.datasource.username= root
    spring.datasource.password= root
    ```
[Common Pre-Defined keys](https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html)

Alternative for application.properties is application.yml
- YAML is format used to store data in key-val (without duplicate words).
- Uses symbol (colon). In Spring Boot Snake YAML API is used that converts yml file to proprties file (Java understand only Properties).

Syntax Difference between application.properties and application.yml

`application.properties`
```
spring.datasource.driver-class-name= com.mysql.jdbc.driver.Driver
spring.datasource.url= jdbc:mysql://localhost:3306/test
spring.datasource.username= root
spring.datasource.password= root
```

`application.yml`

```yml
spring:
 datasource:
   driver-class-name: com.mysql.jdbc.driver.Driver
	 url: jdbc:mysql://localhost:3306/test
	 username: root
	 password: root
```
---

### c. Build Information File

Build Information File contains all the information of project. Which jars we required , plugins , jdk version , server details etc.

- We have 2 option of build information file.
  1. Maven (`pom.xml`)
  2. Gradle( `build.gradle`)
  
<details>
<summary>Why we need Build files</summary>

- jars of hibernate,Servlets,Spring,Spring Boot

- folder system

- plugins (Jar,War,compiler ..etc)

- phases and Goals

- code → compiled →tested → packed(.jar/.war) → deployed

</details>

<details>
<summary>Inside pom.xml</summary>

1. Parent Project details

2. Child Project Details

3. Properties (jdk version, cloud version.. etc)

4. Dependencies (JARS required for Project)

5. Dependency management (JARS with version management)

6. Build plugins etc.

</details>

---
# Spring Configurations: 

Spring Boot provides two types of Configurations

<details>

<summary>Annotation Configuration</summary>
We use Annotation Configuration for `Programmer Defined` only

It `doesn’t` support  for  `Pre-Defined classes`
<details>
<summary>Types of Annotations</summary>


<details>
<summary>1. Stereotype Annotation</summary>
</details>



<details>
<summary>2. Data/Value Annotation</summary>
</details>


<details>
<summary>3. Link/Wire Annotations</summary>
</details>


</details>



<details>

<summary>Java Based Configuration</summary>

</details>

---
