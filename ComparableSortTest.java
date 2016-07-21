/*Just add comment to check git workflow
*/

class Book implements Comparable {
    public int pageNum;
    public String author;
    public String name;

    Book(int pageNum, String name){
    	this.pageNum = pageNum;
    	this.name = name;
    }
    
    @Override
    public int compareTo(Object ob) {
	Book newBook = (Book) ob;
	if (newBook.pageNum != this.pageNum) {
	    if (this.pageNum < newBook.pageNum) {
	    	return -1;
	    } else {
	    	return 1;
	    }
	}
	return 0;
    }
}

class ComparableSortTest{

    static Comparable[] sort(Comparable[] elements){
    	Book tempBook, minbook, sortbook[] = ((Book[])elements).clone();
    	int mincount = -1;
    	
    	for(int i=0; i<sortbook.length; i++) {
    	    minbook = sortbook[i];
  	    for(int j=i; j<sortbook.length; j++) {
    	        if(minbook.compareTo(sortbook[j]) >= 0) {
    	            minbook = sortbook[j];
    	            mincount = j;
    	        }
    	    }
            tempBook = sortbook[mincount];
            sortbook[mincount] = sortbook[i];
            sortbook[i] = tempBook;
    	}
    	return sortbook;
    }

    public static void main(String args[]){
    	long start = System.currentTimeMillis(); 
    	Book books[] = new Book[7];

    	books[0] = new Book(100, "Hobbit");
    	books[1] = new Book(350, "Lord of the Rings");
    	books[2] = new Book(400, "Garry Potter.Secret room");
    	books[3] = new Book(100, "Garry Potter. Halfblooded prince");
    	books[4] = new Book(90, "Labirints of Eho");
    	books[5] = new Book(770, "Silmarillion");
    	books[6] = new Book(77, "Tales of Bidly bard");

    	Book sortedBooks[] = (Book[])sort(books);

    	System.out.println("Primary array: ");
    	for(int i=0; i<books.length; i++) {
    	    System.out.println("Book[" + i + "] pages number: " + books[i].pageNum + 
    	    		       " name: " + books[i].name);
    	}

    	System.out.println("\nSorted array: ");
    	for(int i=0; i<sortedBooks.length; i++) {
    	    System.out.println("Book[" + i + "] pages number: " + sortedBooks[i].pageNum + 
    	    		       " name: " + sortedBooks[i].name);
    	}
    	System.out.println("\Time of programm running: " + (System.currentTimeMillis() - start) + " msec");
    }
}
