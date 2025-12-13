package prahar.ExceptionalHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); // Pass message to parent Exception class
    }
}

public class ExceptionalHandling {
	
	//level 1
	
	//Q1. Write a Java program to demonstrate try-catch block by dividing a number by zero.
	public static int q1() {
		try {
			return 10/0;
		}
		catch(Exception e) {
			System.out.println("Error: Cannot divide by zero!");
			//e.printStackTrace();
			}
		return 0;
	}
	
	//Q2. Write a program that takes an array of 5 integers and tries to print the 10th element.
	public static void q2(int[] arr) {
		try {
			System.out.println(arr[10]);
		}
		catch(Exception e) {
			System.out.println("array out of length");
			//e.printStackTrace();
		}
	}
	
	//Q3. Write a program to demonstrate multiple catch blocks (e.g., Arithmetic + NullPointer + Generic Exception).
	public static void q3() {
		try {
			//case1
//			System.out.println(10/0);
			
//			case2
            String s = null;
            System.out.println(s.length());
		}
		catch(ArithmeticException a) {
			System.out.println("arithmetic exception");
		}
		catch(NullPointerException n) {
			System.out.println("null pointer exception");
		}
		catch(Exception e) {
		    System.out.println("Some other exception occurred: " + e);
		}
	}
	
//	Interview Tip 🧩:
//		Order of catch blocks matters!
//
//		Always keep specific → general
//
//		Agar tu catch(Exception e) pehle likh dega, to compiler error dega:
//		👉 “Unreachable catch block for ArithmeticException”
	
		//Write a program to demonstrate finally block — even when an exception occurs, the finally block should always execute.
		public static void q4() {
			try {
				System.out.println(10/0);
			}
			catch(ArithmeticException a) {
				System.out.println("Arithmetic Exception");
			}
			finally {
				System.out.println("finally");
			}
		}
		
//		💡 Extra Interview Knowledge (for bhai like you 🤓)
//
//		finally block kab skip hota hai?
//		Sirf do cases me:
//
//		JVM shuts down forcibly (System.exit(0))
//
//		Power failure / hardware crash 😅
//
//		finally with return:
//		Even if you return from try/catch, finally still executes before returning.
//		(We’ll do that in Q9 😉)
//
//		Best Practice Tip:
//		finally ka use — for cleanup operations like:
//
//		Closing DB connections
//
//		Releasing file handles
//
//		Releasing network resources
//		
		
//		Q5: Write a Java program where you throw your own exception using throw keyword (for example, throw exception if age < 18).
		public static void q5(int age) {
			try {
				if(age<18) {
					throw new ArithmeticException("you cannot vote");
				}
				else {
					System.out.println("you can vote");
				}
			}
			finally {
				System.out.println("q5");
			}
		}

		/*
		 * 💡 Why “q5” prints before the exception message?
           Because finally executes before the method actually throws the exception to JVM.
           Interview Tip:
           
           throw → used to manually throw exception
           throws → used to declare exception in method signature (compiler-level warning avoid karne ke liye)
           👀 (Next Q6 me yehi dono compare karenge!)

           Pro Tip:
           Instead of ArithmeticException, tu custom exception bana sakta hai — e.g., UnderAgeException (we’ll do that in Q8 😎).
		 */
		
//		Q6: Write a Java program to demonstrate the difference between throw and throws with an example.
//		Isme tu ek method me throws use karega, aur main me try-catch se handle karega.
		
		public static void checkAge(int age) throws ArithmeticException {
		    if (age < 18) {
		        // This actually throws the exception
		        throw new ArithmeticException("You are not eligible to vote!");
		    } else {
		        System.out.println("You can vote!");
		    }
		}

		public static void q6() {
		    try {
		        checkAge(17);   // call the method that can throw exception
		    } catch (ArithmeticException e) {
		        System.out.println("Exception caught: " + e.getMessage());
		    } finally {
		        System.out.println("q6 completed");
		    }
		}
		
//		Q7: Write a Java program to handle checked exception (like FileNotFoundException) using try-catch.
//		Yani file open karni hai jo exist nahi karti, aur handle karni hai exception.
		public static void q7() {
			try {
				FileReader f = new FileReader("s.txt");
			}
			catch(FileNotFoundException f) {
				System.out.println("file not found");
			}
		}
		
		//Q8: Write a program to create your own custom exception class (like InvalidAgeException) and handle it in main.
		public static Exception InvalidAgeException(int age) {
			Exception e = new Exception("invalid age");
			return e;
		}
		
		public static void q8(int age) {
			try {
				if(age<18) {
					throw InvalidAgeException(age);
				}
				else {
					System.out.println("valid age");
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
		}
		
		public static void q82(int age) {
			try {
				if(age<18) {
					throw new InvalidAgeException("invalid age");
				}
				else {
					System.out.println("valid age");
				}
			}
			catch(InvalidAgeException e) {
				System.out.println(e);
			}
			
		}
		
//		Q9: Write a program to show that finally block executes even if return statement is present in try or catch.
		public static void q9() {
			try {
				System.out.println(10/0);
				return;
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			finally {
				System.out.println("q9");
			}
		}
		
//		Write a program to demonstrate nested try-catch blocks (one try inside another).
		public static int q10() {
			try {
				try {
					return 11;
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				finally {
					System.out.println("inside");
				}
			}
			finally {
				System.out.println("10");
			}
			return 5;
		}
		
		
		//level 2
		
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
		
		public static int q12() {
		    try {
		        System.out.println("try");
		        return 10;
		    } 
		    catch(Exception e) {
		        System.out.println("catch");
		        return 20;
		    } 
		    finally {
		        System.out.println("finally");
		        return 30;
		    }
		}
		
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

		public static int getValue() {
		    System.out.println("inside getValue");
		    return 10;
		}
		
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
		
		/*
		 * ⚡ Golden Rule #2 (Interview Fav 💀)

          Agar finally block me return likha ho,
          to pehle ke saare returns ignore ho jaate hain.
          Sirf finally ka return hi consider hota hai.
		 */
		
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
		
		class MyResource implements AutoCloseable {
		    public void use() {
		        System.out.println("using resource");
		        throw new RuntimeException("error in use");
		    }
		    public void close() {
		        System.out.println("closing resource");
		        throw new RuntimeException("error in close");
		    }
		}
		
//		public static void q18() {
//			 try (MyResource r = new MyResource()) {
//		            r.use();
//		        } catch (Exception e) {
//		            System.out.println("catch: " + e.getMessage());
//		        } finally {
//		            System.out.println("finally");
//		        }
//		}
		
		class MyRes implements AutoCloseable {
		    public void close() {
		        System.out.println("closing");
		    }
		}
		
//		public static int q19() {
//	        try (MyRes r = new MyRes()) {
//	            System.out.println("try");
//	            return 10;
//	        } catch (Exception e) {
//	            System.out.println("catch");
//	        } finally {
//	            System.out.println("finally");
//	            return 20;
//	        }
//	    }

		
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


		
		
		
		
	public static void main(String[] args){
	  // System.out.println(q1());
   //q2(new int[] {1,2,3,4,5});
//	   q3();
//	   q4();
//		System.out.println(q11());
//		System.out.println(q12());
//		System.out.println(q13());
//		System.out.println(q14());
//		System.out.println(q15());
		  //q20();
		q20();
		 
		  
		 
	}
	    
	}


