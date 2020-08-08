# CSE 017 - Final Exam

Due by: 8/10 by end of day

## Ethics Contract

**FIRST**: Please read the following carefully:

-	I have not received, I have not given, nor will I give or receive, any assistance to another student taking this exam, including discussing the exam with students in another section of the course. Do not discuss the exam after you are finished until final grades are submitted.
- If I use any resource (including text books and online references and websites), I will cite them in my assignment.
- I will not ask question about how to debug my exam code on Piazza or any other platform.
-	I will not plagiarize someone else's work and turn it in as my own. If I use someone else's work in this exam, I will cite that work. Failure to cite work I used is plagiarism.
-	I understand that acts of academic dishonesty may be penalized to the full extent allowed by the Lehigh University Code of Conduct, including receiving a failing grade for the course. I recognize that I am responsible for understanding the provisions of the Lehigh University Code of Conduct as they relate to this academic exercise.

If you agree with the above, type your full name in the following space along with the date. Your exam **will not be graded** without this assent. When you are done, make your first commit with the commit message: "I, <your name>, agree to the ethics contract".

*** Write name and date below ***

Satyam Patel 

August 8th, 2020

*** Write name and date above ***

-----------------------------------------------------------------------------------------------------

Implement the following classes. You can add any additional classes, fields, or methods you deem necessary to complete this assignment.

**For each method that you implement, you must make at least 1 commit.**

## BST.java

You are to implement a binary search tree in Java. We talked about several options for implementing tree data structures this semester, so you are free to represent your binary tree using any of them:

- Adjacency matrix. We used this in the Graph.java homework.
- Adjacency list. We didn't use this but what you would do is use your LinkedList.java class from homework 1 to implement this.
- A binary tree class. You can implement a binary tree class with a node that has left and right children. This will be almost identical to the LinkedList except instead of having a `next` it has `left` and `right`.
- A list - Technically you already implemented a binary tree in `heapify()`. The heap is a binary tree, and we can store it in the list using the equations `left = 2 * ix + 1` and `right = 2 * ix + 2`

### Question 1

Whichever one you choose, write a paragraph about how you made this decision. To do this, write about the pros and cons of your choice with respect to the other options mentioned above. (min 100 words).

### Question 2 - 5

For this assignment I'm not going to tell you how to architect your class. You have to figure this out on your own, but it gives you freedom to do whatever you want.

But you do need at least the following methods:

```java
boolean find(int item)    // Q2. Finds the item in the tree. Returns true if it's there, false if it's not.
boolean insert(int item)  // Q3. Insert an item in the tree. Returns true if the insert was successful, false if the item already existed in the tree
boolean delete(int item)  // Q4. Delete an item from the tree. Returns true if the item was deleted, false if it wasn't there to delete.
void rebalance()          // Q5. Rebalance the tree
```

**You need to implement 3/4 of these to get an A on this exam.** I would suggest starting with find and insert. They are the easiest. You can tackle `delete()` or `rebalance()` next. We talked about one strategy to `rebalance()` in the lecture, and you can try that one.

For the last one you still have to try to implement it. To get an A without getting it right, you will have to write a paragraph explaining what the function should ideally work, how in theory you would implement it (talk about data structures and algorithms you might use), and why you think you are having trouble wrangling your code into doing so (100 words minimum).

Do the above for any others you can't get and you'll still get points (but not an A). So if you can only implement 2/4, then do the above for both of the ones you can't get.

## Main.java

### Question 6

For each method that you successfully implemented above, write a test that demonstrates it working in Main.java. To do this, you might want to write a `print()` method for the BST class. You don't get any points for that though. For instance you might have code like this:

```java
BST tree = new BST(int[][] initial_tree);
tree.print();   // Show before
tree.insert(6);
tree.print();   // Show after
```
