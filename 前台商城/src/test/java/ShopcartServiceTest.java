

import static org.junit.Assert.*;

import java.util.List;

import org.fkit.domain.CartItem;
import org.fkit.service.ShopcartService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ShopcartServiceTest  extends BaseJunitTest {
	@Autowired
	private ShopcartService shopcartService;
	//根据pid进行筛选
	@Test
	public void testselectCartpid()throws Exception{
		CartItem cartItem =shopcartService.selectCart(1);
		System.out.println(cartItem);
	}
  //根据uid进行查询
	  @Test
		public void testselectuid()throws Exception{
	List<CartItem> cartItems=shopcartService.selectcartitem(20);
	System.out.println(cartItems);  
	  }
 //删除购物车记录
	  @Test
	  public void testRemove()throws Exception{
		    shopcartService.remove(2,20);
			System.out.println("成功删除");  
	  }
}
