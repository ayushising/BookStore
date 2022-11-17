package com.bookUtil;

import java.util.Scanner;

import com.book.Book;
import com.book.InvalidBookException;

public class BookUtil {

	public static void main(String[] args) throws InvalidBookException  {
		Scanner sc =new Scanner(System.in);
		System.out.println("Let's Start");
		Book ob1=new Book("B111","Ikagai","Ayushi","Science",1567);
		Book ob2=new Book("B112","Brick","yashi","Fiction",1562);
		Book ob3=new Book("B113","Positive","robert","Others",15663);
		
		com.book.BookStore.addBook(ob1);
		com.book.BookStore.addBook(ob2);
		com.book.BookStore.addBook(ob3);
		
//-----------Menu Driven program---------------
		
//		System.out.println("Enter 3 book details to continue");
//		for (int i=0;i<3;i++) {
//			
//			com.book.BookStore.addBook(ob3);
//			
//		}
//		com.book.BookStore.displayAll();
		
		System.out.println("1.Add Book \n2.Modify Book \n3.Delete Book \n4.Display All Books \n5.Display Specific Book"
				+ "\n6.Search Book by Title \n7.Search Book by Author\n8.Exit"
				);
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		
		while(choice <9) {
			
		
		switch(choice) {
		case 1 : Book object= new Book();
		         com.book.BookStore.addBook(object);
		         break;
		         
		case 2 : //modify
			     System.out.println("Enter book id");
			     String modifybookID=sc.next();
			     System.out.println("Enter new book id");
				 String bookset=sc.next();
				 com.book.BookStore.modifyBook(modifybookID,bookset);
				 com.book.BookStore.displayAll();
				 break;
			     
		case 3 : //delete a book
			    System.out.println("Enter book id");
			     String deletebookID=sc.next();
			     com.book.BookStore.deleteBook(deletebookID);
			     break;
		case 4 ://display all
			     com.book.BookStore.displayAll();
			     break;
		case 5 ://display specific book
			     System.out.println("Enter book id");
			     String specificbookID=sc.nextLine();
			     com.book.BookStore.displayBook(specificbookID);
			     break;
		case 6 ://search title
			System.out.println("Enter book title");
			String title=sc.next();
			com.book.BookStore.searchByTitle(title);
			break;
			
		case 7 ://search author
			System.out.println("Enter book author");
			String author=sc.next();
			com.book.BookStore.searchByAuthor(author);
			break;
			
		case 8 : //exit
			System.out.println("Thanks !!");
			System.exit(0);
	}
	
		System.out.println("1.Add Book \n 2.Modify Book \n 3.Delete Book \n 4.Display All Books \n 5.Display Specific Book"
				+ "6.Search Book by Title \n 7.Search Book by Author\n 8.Exit"
				);
		System.out.println("process completed -enter choice");
		int ch=sc.nextInt();
		choice=ch;	
		
		}
	}

}