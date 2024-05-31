package www.xiaomotou.sharding.mapper;

import www.xiaomotou.sharding.domain.Company;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author niko
* @description 针对表【company】的数据库操作Mapper
* @createDate 2024-05-31 15:00:30
* @Entity www.xiaomotou.dynamicstart.domain.Company
*/
public interface CompanyMapper extends BaseMapper<Company> {

    List<Company> selectList();

}




