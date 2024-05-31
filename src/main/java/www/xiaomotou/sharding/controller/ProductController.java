package www.xiaomotou.sharding.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import www.xiaomotou.sharding.domain.Product;
import www.xiaomotou.sharding.service.ProductService;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @desc：
 * @name：chenzq
 * @Date：2024/5/31 下午3:02
 */
@RestController
@RequestMapping("product")
public class ProductController {

    @Resource
    private ProductService productService;


    @GetMapping("add")
    public Boolean add(@RequestParam Long id) {
        Product product = new Product();
        product.setId(id);
        product.setName("商品名称：" + UUID.randomUUID());
        product.setCreateTime(LocalDateTime.now());
        product.setUpdateTime(LocalDateTime.now());
        return productService.save(product);
    }
}