class BookInventory{
    String title;
    String author;
    int copies;
    public BookInventory(String title, String author, int copies){
        this.title = title;
        this.author = author;
        this.copies = copies;
    }
    public void printEntry(){
        System.out.println("Title: " + title + ", Author: " + author + ", Copies: " + copies);

    }
    public static void main(String[] args){
        BookInventory[] invent= new BookInventory[3];
        invent[0] = new BookInventory("The Great Gatsby", "F. Scott Fitzgerald", 5);
        invent[1] = new BookInventory("To Kill a Mockingbird", "Harper Lee", 3);
        invent[2] = new BookInventory("1984", "George Orwell", 7);
        for(int i = 0; i < invent.length; i++){
            invent[i].printEntry();
        }
    }

}