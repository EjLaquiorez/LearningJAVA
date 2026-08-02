# The Developer's Debugging Cheat Sheet

## How to Think Through Any Bug Like a Senior Engineer

> **Golden Rule:** Never guess. Verify.

A senior developer doesn't magically know the answer—they ask the right questions until the bug reveals itself.

---

# 1. Understand the Problem

### Ask Yourself

* What **should** happen?
* What **actually** happened?
* What is different?
* Can I reproduce the bug every time?
* When did the bug first appear?
* What changed recently?

### Goal

Clearly define the problem before writing a single line of code.

---

# 2. Narrow Down the Problem

Instead of looking at the entire project, shrink the search area.

### Ask Yourself

* Which method produces the wrong result?
* Where does the incorrect value first appear?
* Which file or function is responsible?

### Mental Model

```
Input
   ↓
Method A
   ↓
Method B
   ↓
Method C
   ↓
Output
```

If the output is wrong, trace backward until you find where it first becomes wrong.

---

# 3. Trace the Data

Data doesn't magically change.

### Ask Yourself

* What is the value of this variable right now?
* Where was it last correct?
* When did it change?
* Who changed it?
* Should it have changed?

### Example

```
balance = 500 ✔
      ↓
deposit()
balance = 700 ✔
      ↓
withdraw()
balance = -100 ❌
```

The bug is likely inside `withdraw()`.

---

# 4. Verify Your Assumptions

Never assume.

### Ask Yourself

* Is this method actually being called?
* Is the condition actually true?
* Does the loop actually execute?
* Is the object initialized?
* Is the variable null?
* Is the array empty?
* Did the Scanner receive the expected input?
* Did the API return valid data?
* Does the file actually exist?

Always prove your assumptions.

---

# 5. Read the Error Message Carefully

Error messages are clues.

### Ask Yourself

* What exception occurred?
* What line number caused it?
* Which object is null?
* What does the message actually say?

### Example

```
NullPointerException
at Main.java:42
```

Go directly to line 42.

Ask:

* Which object is null?
* Why wasn't it initialized?

---

# 6. Isolate the Bug

Reduce the problem.

Instead of debugging the entire application, test only the failing method.

Example

Instead of:

```
Entire Banking Application
```

Test only:

```
deposit()
```

Smaller problems are easier to solve.

---

# 7. Follow the Execution Flow

Java executes code line by line.

### Ask Yourself

* What executes first?
* What executes next?
* Does execution ever reach this line?
* Does execution stop early?

### Example

```
main()
   ↓
createAccount()
   ↓
deposit()
   ↓
printBalance()
```

Walk through the execution one step at a time.

---

# 8. Verify Inputs

Bad input creates bad output.

### Ask Yourself

* Is the input what I expected?
* Are there extra spaces?
* Is the data type correct?
* Did the Scanner actually read the value?

Example

Expected

```
25
```

Actual

```
"25 "
```

That extra space may change the result.

---

# 9. Check Conditions

Many bugs come from incorrect conditions.

### Ask Yourself

* Should this be `>` or `>=`?
* Should it be `&&` or `||`?
* Is the condition always false?
* Is the condition always true?

Example

```
if (age > 18)
```

Should it actually be

```
if (age >= 18)
```

---

# 10. Check Loops

### Ask Yourself

* Does the loop start?
* Does it stop?
* Does it skip?
* Does it run forever?
* Is the increment missing?
* Is the condition correct?

Example

```
for(int i = 0; i < array.length; i++)
```

Verify:

* Initial value
* Condition
* Increment

---

# 11. Check Variables

Variables don't change by themselves.

### Ask Yourself

* Who modified this variable?
* Was it accidentally overwritten?
* Is there another variable with the same name?
* Is the variable inside the correct scope?

Search for:

```
balance =
```

Find every place where the variable changes.

---

# 12. Verify Method Calls

### Ask Yourself

* Is this method actually called?
* Is the correct overload being used?
* Are the arguments correct?
* Does the method return the expected value?

Quick test:

```
System.out.println("Entered deposit()");
```

If it never prints, the method never executed.

---

# 13. Think Like the Computer

Don't think:

> "I wanted it to do this."

Think:

> "What instructions did I actually give Java?"

Java executes exactly what you wrote—not what you intended.

---

# 14. Change One Thing at a Time

Avoid changing multiple things simultaneously.

Instead:

1. Change one thing.
2. Test.
3. Observe.
4. Repeat.

Otherwise, you'll never know what actually fixed the issue.

---

# 15. Confirm the Root Cause

A disappearing bug doesn't always mean it's fixed.

### Ask Yourself

* Did I fix the actual cause?
* Or did I hide the symptom?

Bad Fix

```
try {
    ...
} catch(Exception e) {
}
```

Good Fix

Understand why the exception occurred and solve the underlying issue.

---

# Debugging Checklist

## When Code Doesn't Compile

Ask yourself:

* What is the **first** compiler error?
* Which line is highlighted?
* Missing semicolon?
* Missing bracket?
* Wrong variable name?
* Wrong method name?
* Wrong parameter type?
* Misspelled keyword?

---

## When the Program Crashes

Ask yourself:

* Which exception occurred?
* Which line caused it?
* Which object is null?
* Is the array index valid?
* Does the file exist?
* Is the object initialized?

---

## When the Output Is Wrong

Ask yourself:

* Where did the wrong value first appear?
* Which method created it?
* Is the formula correct?
* Is the input correct?
* Did another method overwrite it?

---

## When Nothing Happens

Ask yourself:

* Did the program execute this code?
* Is the method called?
* Is the condition false?
* Did the loop skip?
* Did the program return early?

---

## When a Loop Misbehaves

Ask yourself:

* Is the initial value correct?
* Is the condition correct?
* Is the increment present?
* Is there an infinite loop?
* Is there an off-by-one error?

---

## When Working with Objects

Ask yourself:

* Did I create the object using `new`?
* Is it null?
* Am I modifying the correct object?
* Is the reference pointing to the expected object?

---

## When Working with Arrays

Ask yourself:

* Is the array initialized?
* Is the index within bounds?
* Is the array empty?
* Am I accessing the correct element?

---

## When Working with Strings

Ask yourself:

* Should I use `equals()` instead of `==`?
* Are there extra spaces?
* Should I trim the string?
* Is it uppercase or lowercase?
* Is the string null?
* Is it empty?

---

## When Working with Methods

Ask yourself:

* Is the return value correct?
* Am I ignoring the returned value?
* Are the parameters correct?
* Does execution reach the `return` statement?

---

# The Senior Engineer's Debugging Workflow

```
1. What should happen?
        ↓
2. What actually happened?
        ↓
3. Where do they first differ?
        ↓
4. What data changed?
        ↓
5. Who changed it?
        ↓
6. Why did it change?
        ↓
7. Can I prove it?
        ↓
8. Fix one thing.
        ↓
9. Test again.
        ↓
10. Repeat until resolved.
```

---

# The Golden Rules of Debugging

* Never guess—verify.
* Read the error message completely.
* Follow the data, not your assumptions.
* Reproduce the bug consistently.
* Use print statements or a debugger to observe reality.
* Change one thing at a time.
* Simplify the problem whenever possible.
* Fix the root cause, not just the symptom.
* If you're stuck, step away briefly and return with fresh eyes.
* Every bug teaches you something—learn from it.

---

# Final Mindset

> **"The best debugger isn't the person who knows the most syntax. It's the person who asks the best questions."**

Every bug is simply a mystery waiting to be solved. Think like a detective, gather evidence, verify every assumption, and let the facts lead you to the answer.
