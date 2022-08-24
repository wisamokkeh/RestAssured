import java.util.ArrayList;
import java.util.List;

public class Shelf {
	List<String> Books;
	public Shelf() {
		Books = new ArrayList<String>();
	}

	public void addBook(String Book) {
		this.Books.add(Book);
	}

	public void removeBook(String Book) {
		try {
			this.Books.remove(Book);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void DeleteAll() {
		this.Books.removeAll(Books);
	}

	public List<String> getBooks() {
		return Books;
	}
}
