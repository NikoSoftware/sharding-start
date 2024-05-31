package www.xiaomotou.sharding.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import www.xiaomotou.sharding.domain.Company;
import www.xiaomotou.sharding.service.CompanyService;
import www.xiaomotou.sharding.mapper.CompanyMapper;
import org.springframework.stereotype.Service;

/**
* @author niko
* @description 针对表【company】的数据库操作Service实现
* @createDate 2024-05-31 15:00:30
*/
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company>
    implements CompanyService{

}




