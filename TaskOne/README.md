# Java Assignment #1 Part 1

Simple overview of use/purpose.

This is taskOne of our assignment 1 and this is the book part of the project. We have a book class with multiple methods created 
for use and we have a runner to test if these methods work free of errors.

## Description

An in-depth paragraph about your project and overview of use.

The book class has methods that allow us to set the author, title and state(if borrowed or not) of each book. We also have accessor methods that allow us to get this information and use these accessors in other methods in the class. We have methods that allow us to return the book if it is borrowed, return the books title if the book is available, and return the books author and title using the toString method. We then use the runner to double check if the methods we have used work properly by testing dufferent test cases as well as using all methods we have created on five different books.

## Getting Started

things we needed to do to get started with this project was to launch the docker container for the course in order to use scioer start, and scioer shell. We then launched up VScode and used the scioer commands to use our program effectively.

### Dependencies

* Describe any prerequisites, libraries, OS version, etc., needed before installing and running your program.

We needed docker container launched before installing and running our program. 


### Executing program

* How to build and run the program
* Step-by-step bullets
```
use code blocks for commands
```

1. we first to gradle build
2. we then do gradle echo to get our command to run the program
3. to run the program we use the command: java -cp build/classes/java/main book.Runner

* include the expected output

Case 1: 
Title of book is: JJK volume 6
Author of book is: Gege Akutami
is the book borrowed or not? true
Checking to see if the book we want is borrowed or not.if it is well get title, it not then we will get nothing: 
Has the book been given back: true
is the book borrowed? false
the details of the books are: JJK volume 6: Gege Akutami
Case 2: 
Title of book is: JJK volume 11
Author of book is: Gege Akutami
is the book borrowed or not? false
Checking to see if the book we want is borrowed or not.if it is well get title, it not then we will get nothing: JJK volume 11
Has the book been given back: true
is the book borrowed? false
the details of the books are: JJK volume 11: Gege Akutami
Case 3: 
Title of book is: Death Note Volume 1
Author of book is: Tsugumi Ohba
is the book borrowed or not? true
Checking to see if the book we want is borrowed or not.if it is well get title, it not then we will get nothing: 
Has the book been given back: true
is the book borrowed? false
the details of the books are: Death Note Volume 1: Tsugumi Ohba
Case 4: 
Title of book is: Black Clover
Author of book is: Yuki Tabata
is the book borrowed or not? true
Checking to see if the book we want is borrowed or not.if it is well get title, it not then we will get nothing: 
was the book borrowed: true
is the book borrowed? false
the details of the books are: Black Clover: Yuki Tabata
Case 5: 
Title of book is: One Piece Vol. 1
Author of book is: Eiichiro Oda
is the book borrowed or not? false
Checking to see if the book we want is borrowed or not.if it is well get title, it not then we will get nothing: One Piece Vol. 1
Has the book been given back: true
is the book borrowed? false
the details of the books are: One Piece Vol. 1: Eiichiro Oda

## Limitations

What isn't done? What things cause errors? 

Everything for the taskOne part of the assingment has been complete. This part is free of errors and checkstyle erorrs. The program 
builds successfully.

## Author Information

Your name and contact information including your email address

Name: Kaif Ahmed 
Student ID: 1233607
Email: kaif@uoguelph.ca

## Development History

Keep a log of what things you accomplish when.  You can use git's tagging feature to tag the versions or you can reference commits.

* 0.2
    * Various bug fixes and optimizations
    * See [commit change]() or See [release history]()
* 0.1
    * Initial Release

commit 7b36161f34ea0ab04c817e10d632f94c57901cc4 (HEAD -> master, origin/master)
Author: Kaif Ahmed <kaif@uoguelph.ca>
Date:   Sun Sep 24 23:38:43 2023 -0400

    Delete Book.java

commit 3959871c19f0c3091f10c96db495673553a81e4a
Author: Kaif Ahmed <kaif@uoguelph.ca>
Date:   Sun Sep 24 23:37:34 2023 -0400

    Delete Runner.java

commit 0c08747de454a9ea6ec8b54063a7185ba9583be7
Merge: 0265628 cf7fa02
Author: Kaif Ahmed <kaif@uoguelph.ca>
Date:   Mon Sep 25 03:27:20 2023 +0000

    Merge branch 'master' of https://gitlab.socs.uoguelph.ca/2430F23/kaif/GP1

commit 02656285b69e13ac45bce15c3129f5ccb3aa9296
Author: Kaif Ahmed <kaif@uoguelph.ca>
Date:   Mon Sep 25 03:25:03 2023 +0000

    initial push

commit cf7fa023d3f81fc6b3d6e684bd607b3870d0d0b3
Author: Kaif Ahmed <kaif@uoguelph.ca>
Date:   Sun Sep 24 19:12:56 2023 -0400

    Delete .DS_Store

commit 0982d9195b167f7656069e8af214d9d0f5dd7a87
Author: Kaif Ahmed <kaif@uoguelph.ca>
Date:   Sun Sep 24 21:48:28 2023 +0000

    Initial commit

## Acknowledgments

Inspiration, code snippets, etc.
* [awesome-readme](https://github.com/matiassingers/awesome-readme)
* [simple-readme] (https://gist.githubusercontent.com/DomPizzie/7a5ff55ffa9081f2de27c315f5018afc/raw/d59043abbb123089ad6602aba571121b71d91d7f/README-Template.md)



