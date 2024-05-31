package www.xiaomotou.sharding.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import www.xiaomotou.sharding.domain.Product;
import www.xiaomotou.sharding.service.ProductService;
import www.xiaomotou.sharding.mapper.ProductMapper;
import org.springframework.stereotype.Service;

/**
* @author niko
* @description 针对表【product】的数据库操作Service实现
* @createDate 2024-05-31 15:00:31
*/
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
    implements ProductService{

}




