# Quick-Compute--Treeset
Practice program: Quick Compute - TreeSet

Daniel is a Maths teacher. He often throws puzzles to his students to help them stay focused. One day he said, he will spell out a set of

numbers. The students should exclude all the numbers that are divisible by five and six and then calculate the average of the

remaining numbers and tell him. Help them to implement the above task.

Implement the above scenario using a TreeSet.

Component Specification: NumAvg

Type(Class) Attributes Methods Responsibilities

NumAvg TreeSet<Integer> numSet Include the getter and setter method.

Note: The class and methods should be declared as public and all the attributes should be declared as private.

Requirement 1: Add number to the TreeSet.

As per this requirement, the system should be able to add a number to the TreeSet

Component Name

Type

(Class)  Methods Responsibilities

Add a number to the

TreeSet

NumAvg

public void addNum(int

num)

This method should add the number to the TreeSet only if it is not

divisible by 5 and 6.

Requirement 2: Find the average of the numbers in the TreeSet.

As per this requirement, the system should be able to calculate the average of the numbers present in the TreeSet.

Component Specification: NumAvg

Component Name

Type

(Class)  Methods Responsibilities

Find the average of the numbers in the

TreeSet.

NumAvg

public double

calAvg()

This method is used to find the average of the numbers in

the TreeSet.

In the UserInterface class,

1. Create a main method with the menu as described in the sample Input and Output.

2. When the user selects option 1.Add number, add the number into numSet.

3. When the user selects option 2.Find Average, it should display the average of the numbers of the numSet. If the set is empty, it

should display "The set is empty".

4. When the user selects option 3.Exit, display the message "Thank you for using the application" and terminate the program.

5. Option can take only values 1 to 3.

Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user and the rest of the text

represents the output.

Ensure to follow the object-oriented specifications provided in the question.

Ensure to provide the names for classes, attributes, and methods as specified in the question.

Adhere to the code template, if provided.

Please don't use System.exit(0) to terminate the program.

Sample Input / Output 1:

1.Add number

2.Find average

3.Exit

Enter your choice

1

Enter the number

7

1.Add number

2.Find average

3.Exit

Enter your choice

1

Enter the number

12

1.Add number

2.Find average

3.Exit

Enter your choice

1

Enter the number

13

1.Add number

2.Find average

3.Exit

Enter your choice

1

Enter the number

24

1.Add number

2.Find a

verage

3.Exit

Enter your choice 2

10.0

1.Add number

2.Find a

verage

3.Exit

Enter your choice 3

Thank you for using the application

Sample Input / Output 2:

1.Add number

2.Find a

verage

3.Exit

Enter your choice 2

The set is empty

1.Add number

2.Find a

verage

3.Exit

Enter your choice 3

Thank you for using the application

Sample Input / Output 3:

1.Add number

2.Find a

verage

3.Exit

Enter your choice 3

Thank you for using the application

