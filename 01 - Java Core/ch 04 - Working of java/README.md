# Have you ever think ?

ki java code likhne ke baad hota kya hai ?

```java
class Rishabh {
    public static void main(String[] args){
        System.out.println("Ram Ram");
    }
}
```

Is stage ko bolte hain Source Code.

Yeh human-friendly hota hai. Machine ko kuch samajh nhi aata.

Industry me koi bhi language ka code directly machine samajh nahi sakti.

### Compiler ka entry (javac)

Ab aata hai hamara first hero → javac compiler

Iska kaam:

(1) Syntax check

Bhai koi spelling mistake, brackets ka panga, semicolon ka atyachar — sab yeh pakad lega.

(2) Convert to BYTECODE

Compiler kahin machine code nahi banata, processor-specific code nahi banata…

Yeh banata hai → .class file (BYTECODE)

Bytecode = Java ki superpower

Platform independent code.

Iska matlab:

Windows pe compile karo

Linux pe chala lo

Mac pe chala lo

Isliye Java = WORA → Write Once Run Anywhere 🔥

### JVM (Java Virtual Machine) – Real Hero

Ab asli kaam JVM karega.

JVM ka kaam:

✔ 1) Bytecode Load karna

Class Loader yeh karta hai.

✔ 2) Bytecode Verification

Agar code me virus ho, hacking attempt ho, invalid bytecode ho → JVM reject kar dega.

✔ 3) Execution

JVM ke paas 2 engines hote hain:

(i) Interpreter

Line-by-line execute karta hai.
Slow hota hai.

(ii) JIT Compiler (Just-In-Time)

Repeated code ko machine code me convert kar deta hai… taaki next baar fast chale.

Performance rocket ho jaati hai 🚀

### JRE vs JDK

✔ JRE (Java Runtime Environment)

Code run karne ka environment.

Isme hota hai:

JVM

Libraries

Runtime files

✔ JDK (Java Development Kit)

Java banana + chalana, dono ka full package.

Isme hota hai:

JRE

Compiler (javac)

Development tools

### Ab poori journey ek flow me samajh

📌 Step 1: Tu .java file likhta hai

↓

📌 Step 2: Compiler (javac) syntax check + bytecode banata hai

↓

📌 Step 3: Bytecode class file JVM ko diya jata hai

↓

📌 Step 4: JVM → Class Loader, Bytecode Verifier, Interpreter/JIT

↓

📌 Step 5: Output aata hai

Bas yeh hai working of Java.

### Important tools inside JDK

- javac — compiler.

        Job: source → bytecode (.class).

        Internals: lexing → parsing → AST → semantic checks (type checking) → flow analysis → generate bytecode (.class).

        Useful flags: -d (output dir), -classpath/--class-path, -source -target, -Xlint, -g (debug info), -proc (annotation processing).

- java — launcher that starts JVM and runs class bytecode. (JRE part but present in bin)

- jar — package multiple .class and resources into a single .jar (ZIP format with manifest).

        jar cf app.jar -C out/ .

        META-INF/MANIFEST.MF important (Main-Class etc).

        Interview: difference between jar vs war vs ear.

  - javadoc — generate HTML docs from source comments (/** */).
 
  - jshell — REPL since Java 9. Quick experiments, prototypes.

  - jlink — create custom runtime image containing only required modules (Java 9+ module system).

  - javap — bytecode disassembler. javap -c MyClass decompiles to bytecode instructions (good for understanding what compiler generated).

### Compilation flow (javac) — step by step, technical

Preprocessing (not like C, but annotation processing occurs here).

Lexical analysis (tokenization) — source to tokens.

Parsing — tokens → AST (abstract syntax tree).

Semantic analysis / Type checking — bindings, symbol table, generics checks.

Annotation processing — Annotation Processors (APT) can generate new source files. Happens during compile.

Bytecode generation — AST → JVM bytecode (.class).

Writing .class files — includes constant pool, method bytecode, attributes (LineNumberTable if -g).

### Bytecode & class file — kya hota hai inside .class

.class file contains:

Magic number 0xCAFEBABE

Version (minor/major)

Constant pool (literals, method refs, class refs)

Access flags (public, final)

This class / super class / interfaces

Fields, Methods (with code attribute)

Attributes (SourceFile, LineNumberTable, LocalVariableTable, RuntimeVisibleAnnotations)

javap -v se inspect kar sakte ho.

### Practical commands cheat-sheet

```
# check version
java -version
javac -version

# compile
javac -d out src/com/example/*.java

# run
java -cp out com.example.Main

# create runnable jar
jar cfm app.jar MANIFEST.MF -C out/ .

# inspect bytecode
javap -c -v com.example.Main

# jshell quick test
jshell

# create custom runtime (example)
jlink --module-path $JAVA_HOME/jmods --add-modules java.base,java.sql --output custom-runtime

# generate docs
javadoc -d docs src/com/example/*.java
```
### JDk , JRE and JVM

**Java development kit** is a toolbox for developer which used to develop and run java app

jdk consist of jre + tools .

tools for compiler , debugger , testing such as - Javac , javadoc , javap , jlink , jshell , jdb etc. it converts source code into bytecode.

**Java Runtime Environment** provides a environment to run a java application .

it consists of Jvm + libraries which helps to run a java app.

**Java Virtual Machine** it is a engine which loads , links and execute bytecode . 

JVM Architecture (Sabse important ❤️)

JVM 4 bada parts me divide hota hai: 

A) Class Loader System

Yeh bytecode ko laakar JVM ke andar load karta hai.

Class loaders ke types:

Bootstrap Loader → Java core libs load karta hai

Extension Loader → ext libraries

Application/System Loader → aapka code load karta hai

❗Interview Googlie:
“ClassLoader parent delegation model kya hota hai?”

Jawab:
Load karne se pehle har loader apne parent ko chance deta hai.

🔥 B) Runtime Data Areas (JVM Memory)

Ye poori memory hoti hai jaha JVM ka data store hota hai.

1) Heap (SABSE IMPORTANT)

Objects store hote hain

Garbage Collector yahi kaam karta

Teen region:

Young Generation

Old Generation

Permanent/Metaspace

2) Stack

Har thread ka alag stack

Methods ke local variables

Method call push/pop hota

3) Method Area / Metaspace

Class metadata:
methods, fields, constants store hote

Java 8 se Metaspace (native memory)

4) PC Register

Each thread ka current instruction pointer

5) Native Method Stack

C/C++ native methods ke liye

C) Execution Engine

Ye JVM ka dil + brain dono hai.

✔ 1) Interpreter

Bytecode line-by-line chalata
Fast startup 🌟
Slow performance ❗

✔ 2) JIT (Just-In-Time) Compiler

Ye hota beast 🦁
Repeated code ko machine code me convert karta
SUPER FAST performance ⚡

JIT optimizations:

Inlining

Loop unrolling

Dead code elimination

Escape analysis

Interview me JIT ka example dena → plus point.

D) Native Interface + Libraries

JNI → Java ko C/C++ code se interact karne deta hai.

Native Libraries (.dll, .so) bhi use karta hai.
























