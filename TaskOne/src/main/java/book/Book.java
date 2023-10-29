// package private mutator methods
package book;

public class Book{
    private String bookName;
    private String author;
    private boolean isBorrowed;

void setTitle(String title){
    bookName = title;
} 
void setAuthor(String name){
    author = name;
} 
void setBorrowed(boolean yesOrNot){
    isBorrowed = yesOrNot;
}

// public methods

// accessors
public String getTitle(){
    return bookName;
}
public String getAuthor(){
    return author;
}
// conventionally boolean accessors start with is instead of get 
public boolean isBorrowed(){
    return isBorrowed;
}

/* returns the title of the book if it is available and 
sets the state of the book to borrowed.
Returns the empty string if the book is not available . */ 
public String borrow(){
    if(!isBorrowed()){
        setBorrowed(true);
        return getTitle();
    }else{
        String empty = "";
        return empty;
    }
}

/* returns true if the book state is borrowed, sets the book state 
to available . Returns false if the book was already available . */
public boolean giveBack(){
    if(isBorrowed()){
        setBorrowed(false);
        return true;
    }
    return false;
}

/* returns a string consisting of the title of the book
followed by a colon and a space followed by the name of the author. 
*/
@Override
public String toString(){
    String bookAndAuthor = "";
    bookAndAuthor = getTitle() + ": " + getAuthor();
    return bookAndAuthor;
}

}