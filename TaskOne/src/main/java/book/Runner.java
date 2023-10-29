package book;
public class Runner{
    public static void main(String[] args){
        Book novel = new Book();
        
        System.out.println("Testing the book class with the various test cases: ");
        System.out.println("Case 1: ");

        String title = "JJK volume 6";
        String author = "Gege Akutami";
        boolean state = true;

        novel.setTitle(title);
        novel.setAuthor(author);
        novel.setBorrowed(state);

        //testing getters
        System.out.println("Title of book is: " + novel.getTitle());
        System.out.println("Author of book is: " + novel.getAuthor());
        System.out.println("is the book borrowed or not? " + novel.isBorrowed());

        // testing methods
        String borrow = novel.borrow();
        System.out.println("Checking to see if the book we want is borrowed or not." 
        + "if it is well get title, it not then we will get nothing: " + borrow);
        boolean returnBook = novel.giveBack();
        System.out.println("Has the book been given back: " + returnBook);
        returnBook = novel.giveBack();
        System.out.println("is the book borrowed? " + returnBook);
        String details = novel.toString();
        System.out.println("the details of the books are: " + details);

        System.out.println("Case 2: ");

        title = "JJK volume 11";
        author = "Gege Akutami";
        state = false;

        novel.setTitle(title);
        novel.setAuthor(author);
        novel.setBorrowed(state);

        //testing getters
        System.out.println("Title of book is: " + novel.getTitle());
        System.out.println("Author of book is: " + novel.getAuthor());
        System.out.println("is the book borrowed or not? " + novel.isBorrowed());

        // testing methods
        borrow = novel.borrow();
        System.out.println("Checking to see if the book we want is borrowed or not."
        + "if it is well get title, it not then we will get nothing: " + borrow);
        returnBook = novel.giveBack();
        System.out.println("Has the book been given back: " + returnBook);
        returnBook = novel.giveBack();
        System.out.println("is the book borrowed? " + returnBook);
        details = novel.toString();
        System.out.println("the details of the books are: " + details);

         System.out.println("Case 3: ");

        title = "Death Note Volume 1";
        author = "Tsugumi Ohba";
        state = true;

        novel.setTitle(title);
        novel.setAuthor(author);
        novel.setBorrowed(state);

        //testing getters
        System.out.println("Title of book is: " + novel.getTitle());
        System.out.println("Author of book is: " + novel.getAuthor());
        System.out.println("is the book borrowed or not? " + novel.isBorrowed());

        // testing methods
        borrow = novel.borrow();
        System.out.println("Checking to see if the book we want is borrowed or not."
        + "if it is well get title, it not then we will get nothing: " + borrow);
        returnBook = novel.giveBack();
        System.out.println("Has the book been given back: " + returnBook);
        returnBook = novel.giveBack();
        System.out.println("is the book borrowed? " + returnBook);
        details = novel.toString();
        System.out.println("the details of the books are: " + details);

         System.out.println("Case 4: ");

        title = "Black Clover";
        author = "Yuki Tabata";
        state = true;

        novel.setTitle(title);
        novel.setAuthor(author);
        novel.setBorrowed(state);

        //testing getters
        System.out.println("Title of book is: " + novel.getTitle());
        System.out.println("Author of book is: " + novel.getAuthor());
        System.out.println("is the book borrowed or not? " + novel.isBorrowed());

        // testing methods
        borrow = novel.borrow();
        System.out.println("Checking to see if the book we want is borrowed or not."
        + "if it is well get title, it not then we will get nothing: " + borrow);
        returnBook = novel.giveBack();
        System.out.println("was the book borrowed: " + returnBook);
        returnBook = novel.giveBack();
        System.out.println("is the book borrowed? " + returnBook);
        details = novel.toString();
        System.out.println("the details of the books are: " + details);

         System.out.println("Case 5: ");

        title = "One Piece Vol. 1";
        author = "Eiichiro Oda";
        state = false;

        novel.setTitle(title);
        novel.setAuthor(author);
        novel.setBorrowed(state);

        //testing getters
        System.out.println("Title of book is: " + novel.getTitle());
        System.out.println("Author of book is: " + novel.getAuthor());
        System.out.println("is the book borrowed or not? " + novel.isBorrowed());

        // testing methods
        borrow = novel.borrow();
        System.out.println("Checking to see if the book we want is borrowed or not."
        + "if it is well get title, it not then we will get nothing: " + borrow);
        returnBook = novel.giveBack();
        System.out.println("Has the book been given back: " + returnBook);
        returnBook = novel.giveBack();
        System.out.println("is the book borrowed? " + returnBook);
        details = novel.toString();
        System.out.println("the details of the books are: " + details);
    }
}
