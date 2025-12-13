# Exception Handling -

let start journey towards Exception Handling what it is , why we need it and how it actually works .

## What is Exception Handling ?- 

before it you have to know - **What is Exception?**

Exception is a unwanted or unexpected even occur between a flow of program . eg. you want to write a program to divide a no. but as we know a no. cannot divide by zero than it will we a exception which will terminate the flow of program .

thus you have to handle it with as if divider = 0 than do not try to divide the divisor and move on next . thus you save the program via unwanted termination and now , program will complete it's flow.

**thus an Exceptional Handling is a alternate way or idea to handle the Exception , as there will be no in beetween termination of program , program should completes it's flow and developer will get desired output as he want's.**

---

## Hierarchy of Exception - 

```
     Throwable
       /   \
   Error  Exception
            /    \
       Checked  Unchecked
```

**Throwable is root Class for Error and Exception**

where , **Error** is a special type of Exception occured in beetween of the flow of the program which is out of hand of developer . as developer could not handle it . it will be concern of jvm as an eg. - StackOverflow , jvm running out of memory etc

while **Exception is classified into two**

- 1. Checked or Compile Time Exception

  Exception which occured at the time of Compilation such as - FileNotFoundException , I/o Exception , sqlException etc. checked exception must be handled
 
-  2. UnChecked or Runtime Exception

   Exception which occured at the time of Runtime such as - nullPointerException , arrayIndexOutOfBoundsException etc. to handle this exception not necessary , compiler will not say anything if you not handled. 

---

## Working of Exception 

basically jvm takes care of exception in two ways -

first when there is no exceptional handling did by developer and second when there is a proper Exception handling done by the proggrammer .

as if a programmer handles execption than in stack memory it will be saved inside the jvm and whenever exception occured the jvm will see that Exception handling in stack memory and will handle Exceprion as programmer want to dealt it with . but , if there is nothing in stack or there is no Exception Hnadles by the programmer than Jvm by default handles it and identify what type of Exception it is than will throw that Exception Explicitly.

---

## Ways to Identify and Handle exception -

1. **Try Block** -

   ```
   try{

       ## Program
   
   }
   ```

   try block is used to test a program whether it Exception occur or not . if not than it is known as gracefull termination of program and program will execute as Expected .

   but if it contain any Exception , let say you use a file to do some changes , but this file actually not present at the place where you gave it's address . than it will be a exception , which will be identify by the try catch and now you have to handle it . and it will be handled by catch block...

**Note** try block will never be used individual it must be followed by the catch or finally . beacause the main work of try is to test wheather the program having exception or not .if it having than there will bw two option - 1. handle it using **catch** or 2. or leave from the program and free the resource using finally .

2. **Catch Block**

   ```
   catch(Exception e)
      e.printStackTrace();
   ```

   thus, if any exception occured than it will be handled there

   **note** catch must have to followed by try .

3. **finally Block**

   ```
   finally{
   }
   ```

   finally used to free resources it will always executes no matters there is exception or not ....

   **note** finally must have to followed by try or catch .
   
4. **Throw**

   ```
   throw new Exception(Exception e);
   ```
   throw is used to throw an Exception Explicitly .

5. **Throws**

   throws throw exception from the method call . basically throws used to indicate that this method may contain exception hence have to handle .

---

## Let's talk it in depth - 

as you know - try catch is used to test program wheather it have exception or not . but without try as well jvm throw exzception it have than why needed try ? 

answer is simple try is used because of catch and finally , because jvm will throw handle but catch will not handle error until where actually exception is . hence , always catch block is followed by try catch to make known that the exception is for above try and catch block have to handle for it .

similar next question is that if jvm will throw exception by it own as well than why need throw ? answer is again simple that - how will you throw your own exception ? becuase that exception or message is not in jvm . thus to throw are own exception manually throw is used ...

similar , throws is used as an sign for a method that it may contain exception than now it is your headache to handle it .

## Now let Answer these 20 Questions after that you wuill be full ready -

//level 1

//Q1. Write a Java program to demonstrate try-catch block by dividing a number by zero.

//Q2. Write a program that takes an array of 5 integers and tries to print the 10th element.

//Q3. Write a program to demonstrate multiple catch blocks (e.g., Arithmetic + NullPointer + Generic Exception).

         //	Interview Tip 🧩:
		 
        //  Order of catch blocks matters
		
       //		Always keep specific → general
	   
      //		Agar tu catch(Exception e) pehle likh dega, to compiler error dega:
	  
     //		👉 “Unreachable catch block for ArithmeticException”

//Q4. Write a program to demonstrate finally block — even when an exception occurs, the finally block should always execute.

//Q5: Write a Java program where you throw your own exception using throw keyword (for example, throw exception if age < 18).

           finally executes before the method actually throws the exception to JVM.
		   
           Interview Tip:
           
           throw → used to manually throw exception
		   
           throws → used to declare exception in method signature (compiler-level warning avoid karne ke liye)
		   
           👀 (Next Q6 me yehi dono compare karenge!)

           Pro Tip:
		   
           Instead of ArithmeticException, tu custom exception bana sakta hai — e.g., UnderAgeException (we’ll do that in Q8 😎).
		 

//Q6: Write a Java program to demonstrate the difference between throw and throws with an example.

//Q7: Write a Java program to handle checked exception (like FileNotFoundException) using try-catch.

//Q8: Write a program to create your own custom exception class (like InvalidAgeException) and handle it in main.

//Q9: Write a program to show that finally block executes even if return statement is present in try or catch.

//Q10: Write a program to demonstrate nested try-catch blocks (one try inside another).

//level 2

//Q11:
```java
public static int q11() {

		    try {
			
		        System.out.println("try");
				
		        return 10;
				
		    }
		    catch(Exception e) {
			
		        System.out.println("catch");
				
		    }
			
		    finally {
			
		        System.out.println("finally");
				
		    }
			
		    return 20;
			
		}
```

//Q12:
```java
 public static int q12() {
  
		    try {
			
		        System.out.println("try");
				
		        return 10;
				
		    } 
			
		    catch(Exception e) {
			
		        System.out.println("catch");
				
		        return 20;
				
		    } 
			
		    finally
			{
		        System.out.println("finally");
				
		        return 30;
		    }
		}
```

  //Q13: 
```java
public static int q13() {
		    int x = 10;
		    try {
		        System.out.println("try");
		        x = x / 0;
		    } 
		    catch (ArithmeticException e) {
		        System.out.println("catch");
		        return x + 10;
		    } 
		    finally {
		        System.out.println("finally");
		        x = 100;
		    }
		    return x;
		}
```

 //Q14: 
 ```java
public static int q14() {
		    try {
		        System.out.println("try");
		        return getValue();
		    } 
		    catch (Exception e) {
		        System.out.println("catch");
		    } 
		    finally {
		        System.out.println("finally");
		    }
		    return 100;
		}
```

  //Q15:
  ```java
  public static int q15() {
		    try {
		        System.out.println("try");
		        return 10;
		    } 
		    catch (Exception e) {
		        System.out.println("catch");
		        return 20;
		    } 
		    finally {
		        System.out.println("finally");
		        return 30;
		    }
		}
```

          Agar finally block me return likha ho,
		  
          to pehle ke saare returns ignore ho jaate hain.
		  
          Sirf finally ka return hi consider hota hai.

  //16:
  ```java
  public static void q16() {
		    try {
		        System.out.println("try");
		        int a = 10 / 0;
		    } 
		    catch (ArithmeticException e) {
		        System.out.println("catch");
		    } 
		    finally {
		        System.out.println("finally");
		        int x = 10 / 0;   // ⚠️ Exception in finally!
		    }
		    System.out.println("end");
		}
```

  //Q17: 
  ```java
  public static void q17() {
		    try {
		        System.out.println("try");
		        System.exit(0);
		    } 
		    catch (Exception e) {
		        System.out.println("catch");
		    } 
		    finally {
		        System.out.println("finally");
		    }
		    System.out.println("end");
		}
```

  //Q18: 
  ```java
  public static void q18() {
  			 try (MyResource r = new MyResource()) {
	            r.use();
	        } catch (Exception e) {
            System.out.println("catch: " + e.getMessage());
	        } finally {
		            System.out.println("finally");
		        }
		}
		
		class MyRes implements AutoCloseable {
		    public void close() {
		        System.out.println("closing");
		    }
		}
```

   //Q19: 
   ```java
   public static int q19() {
	        try (MyRes r = new MyRes()) {
	            System.out.println("try");
	            return 10;
	        } catch (Exception e) {
	            System.out.println("catch");
	        } finally {
	            System.out.println("finally");
	            return 20;
	        }
	    }
    ```

    //Q20: 
	```java
	public static void q20() {
		    try {
		        System.out.println("outer try");
		        try {
		            System.out.println("inner try");
		            int x = 10 / 0;
		        } catch (NullPointerException | NumberFormatException e) {
		            System.out.println("inner multi-catch");
		        } finally {
		            System.out.println("inner finally");
		        }
		    } catch (ArithmeticException e) {
		        System.out.println("outer catch");
		    } finally {
		        System.out.println("outer finally");
		    }}
```


Q1. Java me Exception kya hoti hai?

A. JVM instruction

B. Error message

C. Object

D. Method

Q2. Exception Handling ka package kaunsa hai?

A. java.io

B. java.util

C. java.lang

D. java.exception

Q3. finally block kaunsa nahi kar sakta?

A. resource close

B. exception handle

C. execute hona

D. JVM control lena

Q4.finally block me exception aaye to?

A. ignore

B. override hota

C. program crash

D. JVM handle

Q5. throw keyword ka use kya hai?

A. Exception catch karna

B. Exception create karna

C. Exception forward karna

D. JVM start karna

Q6. throw keyword kaunsa exception throw karta hai?

A. JVM generated

B. Programmer generated

C. OS generated

D. Compiler generated

Q7. throw ke baad code likhna?

A. allowed

B. allowed with try

C. unreachable

D. optional

Q8. catch block order ka rule kya hai?

A. Parent first

B. Child first

C. Random

D. JVM decide karta

Q9. Throwable class ka direct child kaunsa hai?

A. Error

B. Exception

C. RuntimeException

D. IOException

Q10. JVM exception ko kaise search karta hai?

A. top to bottom

B. bottom to top

C. left to right

D. random

* Multiple catch me same exception likhna?

A. allowed

B. warning

C. compile error

D. runtime error


		








   
