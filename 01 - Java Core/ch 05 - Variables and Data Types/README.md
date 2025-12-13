## Variables & Data Types — Overview (seedha)

Data type batata hai ki variable kis type ka data rakh raha hai (numbers, characters, objects).

Variable ek naam hai jisme aap value store karte ho.

Java me broadly do categories:

Primitive types (8) — direct value store (fast, simple)

Reference types — objects, arrays, strings (references store karte hain)

## Primitive Data Types (8) — short + ranges + use-cases

byte

Size: 8-bit signed

Range: -128 to 127

Use: memory-sensitive code, raw bytes, IO buffers

short

Size: 16-bit signed

Range: -32768 to 32767

Rarely used, legacy/space constrained.

int (default integer)

Size: 32-bit signed

Range: -2,147,483,648 to 2,147,483,647

Use: most integer math, default for integer literals.

long

Size: 64-bit signed

Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

Literal suffix: L or l (prefer L).

Use: big counts, timestamps.

float

Size: 32-bit IEEE 754

Suffix: f or F for literals (3.14f)

Approximate decimal, less precision.

double (default floating)

Size: 64-bit IEEE 754

Default for decimal literals. Use d optional.

Use: most floating calculations.

char

Size: 16-bit unsigned (UTF-16 code unit)

Range: \u0000 (0) to \uFFFF (65535)

Literals: 'a', '\n', '\u0905'

Note: Java char represents UTF-16 code unit; some Unicode codepoints need surrogate pairs.

boolean

Values: true / false

Use: logical conditions. Not convertible to/from other primitives.

### Default values (for fields, NOT local variables)

byte, short, int → 0

long → 0L

float → 0.0f

double → 0.0d

char → '\u0000' (null char)

boolean → false

reference → null

Local variables must be explicitly initialized before use (compiler error otherwise).

### Literals & Notations (practical)

Integer literals default to int. Use suffix L for long.

int x = 100; long y = 100L;

Binary, Octal, Hex:

Binary: 0b1010 (Java 7+)

Octal: 012 (leading zero) — avoid due to confusion

Hex: 0xFF

Floating: 3.14 (double), 3.14f (float)

Char: 'A', '\u0041'

String: "hello" (double quotes)

Underscores allowed in numeric literals (readability): 1_000_000

Boolean: true, false

null literal for references

### Common Tricky Bugs & Interview Traps

Local variable not initialized — compile-time error. Fields get defaults, locals don’t.

b = b + 1; with byte — needs cast. But b += 1; works (implicit cast).

Integer overflow — wraps around silently (no exception for int/long).

Floating division by zero — yields Infinity/NaN instead of exception.

== vs equals() — for references, == checks reference equality.

String immutability — s.replace() returns new String.

Autoboxing null — Integer x = null; int y = x; -> NPE.

char vs String — use single quotes for char, double for String.

Octal literal surprises — leading zero means octal (010 = 8).

Long literal without L if exceeds int range -> compile error.

```
// example1: byte arithmetic
byte b = 10;
b = (byte)(b + 5); // b+5 is int so explicit cast

// example2: autoboxing trap
Integer x = null;
int y = x; // NullPointerException

// example3: integer overflow
int a = Integer.MAX_VALUE;
a = a + 1; // becomes Integer.MIN_VALUE (overflow wrap)

// example4: string pool
String s1 = "hello";
String s2 = "hello";
System.out.println(s1 == s2); // true

String s3 = new String("hello");
System.out.println(s1 == s3); // false
System.out.println(s1.equals(s3)); // true

```

```
1️⃣ Q5: Which literal is invalid?
a) 10L
b) 10.5F
c) 0b1010
d) 078

2️⃣ Q8: Which of the following can store Unicode values?
a) char
b) int
c) String
d) All of the above

3️⃣ Q10: What happens when integer overflows?
a) Exception
b) Becomes zero
c) Wraps around
d) JVM crashes

4️⃣ Q13: Which will compile without error?
a) byte b = 200;
b) byte b = (byte) 200;
c) byte b = 128;
d) byte b = -200;

5️⃣ Q15: float f = 10.5; gives?
a) compiles
b) runtime error
c) compile-time error
d) stores 10.5 as double

6️⃣ Q35: String pool stores:
a) all strings
b) only interned strings
c) only new Strings
d) only references

7️⃣ Q38: Immutable object advantage:
a) thread safety
b) fast concatenation
c) low memory
d) mutable behavior

8️⃣ Q40: Which creates only 1 object?
a) String s1 = new String("A");
b) String s1 = "A";
c) String s1 = new String("A").intern();
d) Both b & c

9️⃣ Q42: int[] arr = new int[5]; default element value:
a) garbage
b) null
c) 0
d) undefined

🔟 Q46: Which is NOT allowed?
a) final int x;
b) final int x = 10;
c) final int x; x = 10;
d) final int x; x = x + 1;

1️⃣1️⃣ Q47: Array length is:
a) method
b) variable
c) static field
d) final field

1️⃣2️⃣ Q50: Which is true?
a) boolean can be converted to int
b) char can be used in arithmetic
c) boolean is 1-bit internally
d) boolean has numeric values 1/0
```












