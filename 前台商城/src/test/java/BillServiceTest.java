import static org.junit.Assert.*;

import org.fkit.domain.Bill;
import org.fkit.service.BillService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BillServiceTest extends BaseJunitTest{
	@Autowired
	private BillService billService;

	@Test
	public void testnew() throws Exception {
	 Bill bill=billService.selectnew() ;
		System.out.println(bill);
	}

}
