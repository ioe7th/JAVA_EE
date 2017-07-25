import static org.junit.Assert.*;

import java.util.List;

import org.fkit.domain.Comment;
import org.fkit.service.CommentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CommentServiceTest  extends BaseJunitTest {
 @Autowired
 private CommentService commentservice;
	@Test
	public void testSelectALL() throws Exception{
		List<Comment> comments= commentservice.SelectALL();
		System.out.println(comments);
	}

}
