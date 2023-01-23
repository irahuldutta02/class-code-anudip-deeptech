package Test;

import java.util.*;

class Book {

public String name;

Book(String bk) {

name = bk;

}

}

public class MyIterator {

public static void main(String args[]) {

List <Book> b = new ArrayList<Book>();

Book b1 = new Book("Java Server Programming");

b.add(b1);

Iterator<Book> i = b.iterator();

while(i.hasNext()) {

Book b4 = i.next();

System.out.print(b4.name + " ");

}

}

}
