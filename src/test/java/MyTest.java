import com.edu.pojo.Books;
import com.edu.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) ac.getBean("BookServiceImpl");
        for (Books books : bookServiceImpl.queryAllBook()) {
            System.out.println(books.getBookName());
        }
    }
}
