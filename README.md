
## What is Spring boot?
* Spring boot is a spring based framework which is open source and developed by Pivotal Team.       
* It provides an easier and faster way to set up, configure, and run both simple and web-based applications.      
* It is a Spring module that provides the `RAD (Rapid Application Development)` feature to the Spring Framework.    
* Spring Boot provides `AutoConfiguration` which means reduce Common lines of code in Application which is written by Programmers and handles Jars with version 
management.
* Spring Boot is a Parent Project, our project is child Project

## What is auto-configuration?
Let's take and Example with Core Java, Spring , Spring Boot.
## JDBC Code in Core java

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

## JDBC Code in Spring 
