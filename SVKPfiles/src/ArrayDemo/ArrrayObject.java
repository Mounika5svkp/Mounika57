package ArrayDemo;
class Book
{
	String title;
	String author;
	double price;
	public Book(String title,String author,double price)
	{
		this.title=title;
		this.author=author;
		this.price=price;
	}
	void display()
	{
		System.out.println("Title:"+title+"Author:  " +"price:  "+price);
	}
}
public class ArrrayObject {

	public static void main(String[] args) {
		Book[] books=new Book[3];
		books[0]=new Book("java","mouni",12000);
		books[1]=new Book("python","kanchu",2500);
		books[2]=new Book("java","navya",3400);
		for(Book book:books)
		{
			book.display();
		}
	}
}
		
	
		
	


