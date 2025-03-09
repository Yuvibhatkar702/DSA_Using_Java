class Sample{
    public static void main(String[] args){


    }
}

class Book {
    int bookId;
    String bookName, author;
    boolean isAvailable;

    public void borrowBook(){
        if(isAvailable){
            isAvailable = false;
            System.out.println("Book borrowed successfully");
        }else{
            System.out.println("Book not available");
        }
    }

    public void returnBook(){
        if(!isAvailable){
            isAvailable = true;
            System.out.println("Book returned successfully");
        }else{
            System.out.println("Book already available");
        }
    }

    public void displayBook(){
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
}

class Member{
    int memberId;
    String name;
    Book[] books = new Book[5];

    public void borrowBook(Book book){
        for(int i=0; i<books.length; i++){
            if(books[i] == null){
                books[i] = book;
                return;
            }
        }
    }

    public void returnBook(Book book){
        for(int i=0; i<books.length; i++){
            if(books[i] == book){
                books[i]= null;
                return;
            }
        }
    }

    public void displayMemberDispaly(){
        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + name);
        System.out.println("Books borrowed: ");
        for(int i=0; i<books.length; i++){
            if(books[i] != null){
                books[i].displayBook();
            }
        }
    }

    

}