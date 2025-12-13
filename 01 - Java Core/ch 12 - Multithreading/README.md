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


   

   

   


