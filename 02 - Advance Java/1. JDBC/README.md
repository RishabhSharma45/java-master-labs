# JDBC (JAVA DATABASE CONNECTIVITY)

Before going towards concept let talks about java editions . as in learning modules java basically divided into two - 

- Java Core and ,
- Advance Java.

but actually at vendors level (the inventors Sun Microsystems and Oracle) Java having **Editions**

- (J2SE | JAVA STANDARD EDITION)
- (J2EE | JAVA ENTERPRISE EDITION)
- (J2ME | JAVA MICRO EDITION)

basically JDBC came under the concept of Advance Java but at Vendors Level **JDBC** belongs to **(J2SE | JAVA STANDARD EDITION)** 

> Now, Comes to the Topic **What do you mean Why JDBC**

### JDBC Stands for java database connectivity. it is a mechanism used to communicate with database via java application .

let list out agenda what we will do and understand how actuallt things work

1.Introduction to JDBC

2. JDBC architecture

3. Drivers and it's Type

4. Working with Type 3 and Type 4 Drivers

5. programs to create and drop tables

6. how to read dynamic inputs from the keyboard

7. how to create dynamic queries from keyboard

8. program for basic crud application

9. life cycle of sql query executor

10. prepared statement v/s statement

11. stored procedures

12. collable statement

13. cursors

14. functions

15. batch update

16. executeQuery() v/s executeUpdate() v/s execute() v/s executeBatch()

17. Blob and Clob

18. Connection Pooling

19. ResultSet

20. RowSet

21. ETC........

---

## Introduction To JDBC -

Java database connectivity is a java api that allows java application to connect with data base , send queries and get result set back.

**Why Jdbc ?**

java program cannot talk directly with dtabase hence jdbc act as a bridge between java application and database .

---

## JDBC Architecture
```
java -> Driver -> database.
```

Steps to connect with database -

1. Load and Register Driver
2. Establish Connection
3. Create Statement
4. Execute Query
5. resultSet
6. Close Connection....

> let see in depth

So , let try to understand it like a story - you want to go Chennai from Bhopal . so as by taking care of Language difference you have to arrange a translator who can help you in communication . similarly **java** and **database** are two different entity which cannot talk to each another hence need a Translator called ad - **Driver** . here , driver is a translator between java and database which took sql queries from java app and transmit it towards the db and take resultset back from there . 

now , next thing you need a road to go chennai from bhopal hence you used - NH - 44 . so , similarly you need to establish a **Connection** between java app to database . 

now next you need a vehicle . Similarly **Statement** is a Vehicle which carry Sql Queries from java app and send it to db and get back resultset towards java app.

**ResultSet** is like a container which put inside a vehicle known as **Statement** containing results gets after execution of Quries .

in the end need to **Close the Connection** .

**Why do we need to close the JDBC Connection?**

when you are connecting db using jdbc , you are using resources such as - *Memory* , *Network Socket , *Database Server* etc . 

These resources are limited.

hence you need to free them to avoid - *memory leakage* , *Security Risk* , *Database Performance Down* etc.....

---

## Drivers And It's Types -

Drivers are Translator in jdbc which translate metadata of java which contains information reagarding db (Quries to be executed) which is not directly understable to data base hence need to translated first according to Database Firms . Hence , this is done by **Driver**

### Types Of Drivers

there are majorly four types of Drivers -

**1. Type 1 (Jdbc-Odbc Driver / Bridge Driver)**

```
java -> jdbc (Driver) -> Odbc (Driver) -> Data Base
```

here , Odbc stands for Open database connectivity . languages such as c/c++ uses odbc as for database connectivity . java just modify odbc as add one more step before odbc driver jdbc driver will translate java data into odbc specifics than odbc will work as it . thus they increases speed .

but still it is slow and only Windows Specific beacause odbc is only window supported. hence intoduced type 2 -

**2. Type 2 (Native-API Driver)**

similar to odbc but having differnce as instead of odbc driver here native api drivers used which are built by different vendors .

```
java -> jdbc(Driver) -> Native-API (Driver) - data base
```
thus it is now paltform independent but still Slow.

**3. Type 3 (Network Protocol Driver)**

hence a network based type 3 driver introduced which connect directly with db servers .

it is reliavble , fast and used for large web applications where multiple databases connected .

**4. Type 4 (Thin/Direct Driver)**

```
java -> (Driver) -> data base
```

it is faster among all above . as here translation took place within a single step .

---

## Now Let Code and establish a connection -

```java
import java.sql.Connection;
import java.sql.DriverManager;

public class Connection1{

public static Connection getConnection(){
    Connection c = null;
    String url = "jdbc:mysql://localhost:3306/namaste2";
    String name = "root";
    String pass = "admin";
  try{
  c = DriverManager.getConnection(url,name,pass); 
}
catch(Exception e){
e.printStackTrace();
}
}
return c;

}
```
> this is a code to establish a connection

### Now let try to Execute Some queries - 

first  create a new class - 

```java
class Namaste{

public static void main(String args[]){

}

}
```

try to code inside main method -

```
Connection c = Connection1.getConnection();
```

connection established .....

now create try-catch-finally...

```java
try{
 //create a statement -

Statement st = c.createStatement();
String createTable = "CREATE TABLE IF NOT EXISTS students (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(100), age INT)";
int a = st.executeUpdate(createTable);
	        System.out.println("table created" + a);
//creating a table
}
catch(Exception e){
e.printStackTrace();
}
finally{
try{
c.close()
}
catch(Exception e){
e.printStackTrace();
}
}
```
now similarly can write a insert query and also can fetch records using resultset - 

complete code will we like this - 

```java
package namasteJdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Namaste {

	 public static void main(String[] args) {
	        Connection conn = Connection1.getConnection(); 
	        try {
	        Statement st = conn.createStatement();
	        String createTable = "CREATE TABLE IF NOT EXISTS students (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(100), age INT)";
	        int a = st.executeUpdate(createTable);
	        System.out.println("table created" + a);
	        
	        String insert = "insert into students( name,age) values('hitman',21)";
	        int b = st.executeUpdate(insert);
            System.out.println("inserted"+b);
	        
	        String select = "select * from students";
	        ResultSet rs = st.executeQuery(select);
	        while(rs.next()) {
	        	System.out.print(rs.getInt("id")+rs.getString("name")+rs.getInt("age"));
	        }
	        System.out.println();
	        st.close();
	        }
	        catch(Exception e) {
	        	e.printStackTrace();
	        }
	        finally{
	        	try {
	        	conn.close();
	        	}
	        	catch(Exception e) {
	        		e.printStackTrace();
	        	}
	        }
	    }

}


```
## CRUD -

```java
package namasteJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Crud {
	
	public static Scanner sc = new Scanner(System.in);
	public static Connection c = Connection1.getConnection();
	
	public static void createStudent() {
		try {
		
		
		System.out.println("please enter roll no.");
		int rollNo = sc.nextInt();
		
		
		System.out.println("please enter Name");
		String name = sc.next();
	
		
		System.out.println("please enter Address");
		String address = sc.next();
		
		
		String query = "insert into students2 (rollNo , name , address) values (? , ? , ?)";
		PreparedStatement pr = c.prepareStatement(query);
		pr.setInt(1, rollNo);
		pr.setString(2, name);
		pr.setString(3, address);
		pr.executeUpdate();
		pr.close();
		System.out.println("Student successfully created with rollNo:- " + rollNo);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public static void readStudent() {
		System.out.println("enter 1 to read all");
		System.out.println("enter 2 to read by Roll No");
		int enter = sc.nextInt();
		try {
		switch(enter) {
		case 1:
			String Query = "select * from students2";
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery(Query);
			while(rs.next()) {
				System.out.println(rs.getInt("rollNo") + " " + rs.getString("name") + " " + rs.getString("address"));
			}
			s.close();
			break;
			
		case 2:
			System.out.println("please enter a rollNo");
			int rollNo = sc.nextInt();
			String Query2 = "select * from students2 where rollNo =" + rollNo;
			Statement s2 = c.createStatement();
			ResultSet rs2 = s2.executeQuery(Query2);
			if(rs2==null) {
				System.out.println("No student is present having roll no. " +rollNo);
				return;
			}
			while(rs2.next()) {
				System.out.println(rs2.getInt("rollNo") + " " + rs2.getString("name") + " " + rs2.getString("address"));
			}
			
			s2.close();
			break;
		default :
			System.out.println("wrong input");
			
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
	public static void updateStudent() {
		
		System.out.println("please enter a rollNo");
		int rollNo = sc.nextInt();
		
		try {
			String Query2 = "select * from students2 where rollNo =" + rollNo;
			Statement s2 = c.createStatement();
			ResultSet rs2 = s2.executeQuery(Query2);
			if(rs2!=null) {
				
				System.out.println("student is present with rollNo - " + rollNo + " having following details");
				while(rs2.next()) {
					System.out.println(rs2.getInt("rollNo") + " " + rs2.getString("name") + " " + rs2.getString("address"));
				}
				
				System.out.println("do you really want to edit Yes - press 1 / No - press 0 ?");
				int c = sc.nextInt();
				
				switch(c) {
				case 1 :
					System.out.println("please enter new details for student having roll no."  + rollNo);
					
					System.out.println("please enter new Name");
					String name = sc.next();
				
					
					System.out.println("please enter new Address");
					String address = sc.next();
					
					String Query = "update students2 set name ="+"'"+name+"'"+",address ="+"'"+address+"'"+"where rollNo ="+rollNo ;
					int a = s2.executeUpdate(Query);
					if(a!=0) {
						System.out.println("Successfully updated");
						s2.close();
					}
					else {
					 System.out.println("something went wrong");
					}
					break;
				case 0:
					System.out.println("Thank you");
					break;
				default:
					System.out.println("wrong input");
				}
				
			}
			else {
				System.out.println("no student is present with this rollNo" + rollNo);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public static void deleteStudent() {
		
		System.out.println("please enter a rollNo");
		int rollNo = sc.nextInt();
		
		try {
			String Query2 = "select * from students2 where rollNo =" + rollNo;
			Statement s2 = c.createStatement();
			ResultSet rs2 = s2.executeQuery(Query2);
			if(rs2!=null) {
				
				System.out.println("student is present with rollNo - " + rollNo + " having following details");
				while(rs2.next()) {
					System.out.println(rs2.getInt("rollNo") + " " + rs2.getString("name") + " " + rs2.getString("address"));
				}
				
				System.out.println("do you really want to delete Yes - press 1 / No - press 0 ?");
				int c = sc.nextInt();
				
				switch(c) {
				case 1 :
					
					String Query = "delete from students2 where rollNo="+rollNo;
					int a = s2.executeUpdate(Query);
					if(a!=0) {
						System.out.println("Successfully deleted");
						s2.close();
					}
					else {
					 System.out.println("something went wrong");
					}
					break;
				case 0:
					System.out.println("Thank you");
					break;
				default:
					System.out.println("wrong input");
				}
				
			}
			else {
				System.out.println("no student is present with this rollNo" + rollNo);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		
		try {
			
			Statement st = c.createStatement();
	        String createTable = "CREATE TABLE IF NOT EXISTS students2 (rollNo INT PRIMARY KEY , name VARCHAR(100), address VARCHAR(100))";
	        int a = st.executeUpdate(createTable);
	        System.out.println("table created" + a);
			
			boolean crud = true;
			while(crud) {
			System.out.println("Welcome to Student management System");
			System.out.println("enter 1 for create");
			System.out.println("enter 2 to read ");
			System.out.println("enter 3 for update");
			System.out.println("enter 4 for delete");
			System.out.println("enter 5 to exit");
			Scanner sc = new Scanner(System.in);
			int enter = sc.nextInt();
			switch(enter) {
			case 1 :
				createStudent();
				break;
			case 2 :
				readStudent();
				break;
			case 3 :
				updateStudent();
				break;
			case 4 :
				deleteStudent();
				break;
			case 5 :
				System.exit(0);
				break;
			default :
				System.out.println("please enter a valid no.");
			}
			}
			 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				c.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
```
## Statement vs PreparedStatement

(There are different two ways in jdbc to send query)

### Statement — "Raw Query Sender"

whenever you send query compiler will compile and execute again again 

```
String name = "Rohan";
String query = "SELECT * FROM students WHERE name = '" + name + "'";
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(query);
```

- everytime new query will form
- String Concatenation (chances of Errors high)
- SQL Injection (possibility of attack)
- perfermance slow

### PreparedStatement "Smart & Secure Query Sender"

Queries Compile once and Use Multiple times .
Only values get change . 
```
PreparedStatement ps = con.prepareStatement(
    "SELECT * FROM students WHERE name = ?"
);
ps.setString(1, "Rohan");
ResultSet rs = ps.executeQuery();
```
- Placeholders (?) for dynamic inputs
- SQL Injection se protection 🔐
- Performance (Fast)

| Feature              | Statement | PreparedStatement |
| -------------------- | --------- | ----------------- |
| Query compile        | Har baar  | Sirf pehli baar   |
| Dynamic data         | ❌ risky   | ✔ simple with `?` |
| SQL Injection safety | ❌ no      | ✔ yes             |
| Speed                | Slow      | Fast              |
| Reusability          | ❌         | ✔                 |
| Batch processing     | ❌         | ✔ best choice     |

**SQL Injection Example -**
User input
```
' or '1'='1
```
statement will -
```
SELECT * FROM students WHERE name='' OR '1'='1'
```





























