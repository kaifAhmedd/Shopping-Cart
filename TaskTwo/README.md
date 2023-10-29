# Java Assignment #1 Part 2

Simple overview of use/purpose.

This is taskTwo of our assignment 1 and this is the Ecommerce part of the project.

## Description

An in-depth paragraph about your project and overview of use.

We have a product class with multiple methods created which help define the products description and information such as price, ID and name of the product. We then have a shoppingCart class that uses the product methods to deal with things such as adding/removing products from the cart, calculating total cost with and without tax, clearing the cart after checout, calculating the size of products in the cart, and printing hte contents of the cart. We then have a Runner to test if these methods work free of errors with multiple test cases.

## Getting Started

things we needed to do to get started with this project was to launch the docker container for the course in order to use scioer start, and scioer shell. We then launched up VScode and used the scioer commands to use our program effectively.

### Dependencies

* Describe any prerequisites, libraries, OS version, etc., needed before installing and running your program.

We needed docker container launched before installing and running our program.
we inported the decimalFormat liabrary in order to round the retail price in the toString method up to two decimal spots from the 
Product class.

### Executing program

* How to build and run the program
* Step-by-step bullets
```
use code blocks for commands
```

1. we first to gradle build
2. we then do gradle echo to get our command to run the program
3. to run the program we use the command: java -cp build/classes/java/main ecommerce.Runner

* include the expected output

Item #1
The ID of the product is: 1
The name of the product is: Toothbrush
The cost of the product is: 2.99
The markup rate for item is: 0.5
Retail price of item is: 5.0680499999999995
name and retail price of item are: Toothbrush: 5.07
Item #2
The ID of the product is: 2
The name of the product is: Comb
The cost of the product is: 3.0
The markup rate for item is: 0.25
Retail price of item is: 4.2375
name and retail price of item are: Comb: 4.24
Item #3
The ID of the product is: 3
The name of the product is: Manga
The cost of the product is: 13.99
The markup rate for item is: 0.65
Retail price of item is: 26.084355
name and retail price of item are: Manga: 26.08
Item #4
The ID of the product is: 4
The name of the product is: IPhone
The cost of the product is: 600.99
The markup rate for item is: 0.25
Retail price of item is: 848.8983749999999
name and retail price of item are: IPhone: 848.90
Item #5
The ID of the product is: 5
The name of the product is: Calogne
The cost of the product is: 169.65
The markup rate for item is: 0.25
Retail price of item is: 239.63062499999998
name and retail price of item are: Calogne: 239.63
Tax Rate Info
The taxRate is: 0.13
The taxRate after change is: 0.13
is this product already in the cart? true
is this product already in the cart? false
The total cost of the items in the cart is: 1119.6814049999998
The total cost of the items in the cart before tax is: 990.8684999999999
Here are the items currently in the cart: 
Toothbrush: 5.07
Manga: 26.08
IPhone: 848.90
Calogne: 239.63

the size of the cart is: 4
You are now checking out and your total cart price with tax is: 1119.6814049999998
The cart is now cleared
The size of the cart is now: 0
The total cost of the items in the cart is: 0.0
The total cost of the items in the cart before tax is: 0.0
is this product already in the cart? false
Here are the items currently in the cart: 

Item #1
The ID of the product is: 1
The name of the product is: Toothbrush
The cost of the product is: 2.99
The markup rate for item is: 0.5
Retail price of item is: 5.0680499999999995
name and retail price of item are: Toothbrush: 5.07
The size of the cart is now: 1
The total cost of the items in the cart is: 5.0680499999999995
The total cost of the items in the cart before tax is: 4.485
is this product already in the cart? true
Here are the items currently in the cart: 
Toothbrush: 5.07

## Limitations

What isn't done? What things cause errors?

Everything for the taskTwo part of the assingment has been complete. This part is free of errors and checkstyle erorrs. The program 
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



