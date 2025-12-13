# MultiThreading

before going on MultiThreading , let try to understand what actually **MultiTasking** is and how it is related to multithreading ?

## MultiTasking - 

Executing multiple task simultaneously . achieved by -

1. **MultiProcessing** - Executing multiple process simultaneously .
  
2. **MultiThreading** - Execution of Multiple Threads .

   Where , **Threads** are lightweight Process which run concurrently with other parts of process (Known as Threads).

## Life Cycle of Thread -

```
new -> runnable -> running -> Terminating
                     |             ^
              Blocked / Waiting -> |
```

## Ways to Use multitherads - 

1. Using Thread Class
   
   ```java
   public class MyThread extends Thread{
   public void run(){
      System.out.println("Thread running")
   }
   }
   ```
   
2. Using Runnable Interface
   
   ```java
   public class MyRunnable implements Runnable{
   @Override
   public void run(){
      System.out.pritnln("Runnable Thread Running");
   }
   }
   ```

   inside main method -

   for Thread of Thread  class -

   ```java
   public static void main(String args[]){
   MyThread t1 = new MyThread();
   t1.start()
   }
   ```

   for Thread of Runnable Interface -

   ```java
   public static void main(String args[]){
   Thread t1 = new Thread();
   MyRunnable r1 = new MyRunnable(t1)
   r1.start()
   }
   ```

---

## imp methods to remember -

1. start() - used to start run

2. run - actual code of thread

3. sleep(ms) - pause the thread

4. join() - thread will wait for another

5. isAlive() - thread is active or not to check

6. setName() / getName()

7. setPriority()

**Thread Scheduler** is used to set schedule of a thread .... mainly cpu decides scheduling of thread .

**Thread Priority** min(1) , max(10) , normal(5)

---

now let's practice these Questions - 

// Level 1 -

```
Q8. Java me ek program me minimum kitne thread hote hain?
A. 0
B. 1
C. 2
D. Depends

Q9. Main thread ka naam kya hota hai?
A. system
B. main
C. primary
D. default

Q19. Java me thread scheduling kaun karta hai?
A. Compiler
B. JVM
C. OS
D. Programmer

Q18. Thread life cycle me sabse important state?
A. New
B. Runnable
C. Running
D. Dead

Q13. Thread kab Running state me jata hai?
A. start() par
B. JVM choice se
C. sleep() par
D. yield() par

Q22. yield() method kis class ka hai?
A. Object
B. Runnable
C. Thread
D. System

Q26. sleep() lock release karta hai?
A. Yes
B. No
C. Depends
D. JVM decide

Q24. join() kis type ka method hai?
A. static
B. final
C. non-static
D. private

Q31. Synchronization ka main aim?
A. Speed badhana
B. Data consistency
C. Memory save
D. Deadlock

32. Synchronization kis problem ko solve karta hai?
A. Deadlock
B. Starvation
C. Race condition
D. Livelock

Q34. synchronized method lock kis par lagata hai?
A. Method
B. Class
C. Object
D. Thread

Q38. Deadlock ka solution?
A. sleep
B. yield
C. Lock ordering
D. stop

Q42. wait() method kis block me call hota hai?
A. try
B. catch
C. synchronized
D. finally

Q41. wait(), notify(), notifyAll() kis class ke methods hain?
A. Thread
B. Runnable
C. Object
D. System

Q48. Starvation ka matlab?
A. Deadlock
B. Thread ko CPU na milna
C. Infinite loop
D. Crash

Q49. Livelock kya hota hai?
A. Thread dead
B. Thread busy but no progress
C. Deadlock
D. Starvation

```


   

   

   


