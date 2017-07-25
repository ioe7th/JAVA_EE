import static org.junit.Assert.*;

import java.util.List;

import org.fkit.domain.Collection;
import org.fkit.service.CollectionService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CollectionServiceTest extends BaseJunitTest{
	@Autowired
	private CollectionService collectionService;
@Test
public void testSelect()throws Exception{
	    List<Collection> collections=collectionService.selectAllcollect(20);
	    System.out.println(collections);
}
@Test
public void testremovecollect() throws Exception{
	collectionService.removeCollection(20, 1);
	System.out.println("本条记录已删除");
}

}
