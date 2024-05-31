package www.xiaomotou.sharding.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import www.xiaomotou.sharding.domain.Permission;
import www.xiaomotou.sharding.service.PermissionService;
import www.xiaomotou.sharding.mapper.PermissionMapper;
import org.springframework.stereotype.Service;

/**
* @author niko
* @description 针对表【permission】的数据库操作Service实现
* @createDate 2024-05-31 15:00:30
*/
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission>
    implements PermissionService{

}




