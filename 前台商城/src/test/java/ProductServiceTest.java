

import static org.junit.Assert.*;

import java.util.List;

import org.fkit.domain.Product;
import org.fkit.service.ProductService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceTest  extends BaseJunitTest{
@Autowired
private ProductService productService;
//测试遍历输出
	@Test
	public void testall()throws Exception{
		List<Product> products=productService.selectProducts();
		System.out.println(products);
	  }
//根据pID输出商品
	@Test
	public void testProduct() throws Exception{
		Product product =productService.selctProductbYId(1);
		System.out.println(product);
	}

}
