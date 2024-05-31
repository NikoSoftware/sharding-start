package www.xiaomotou.sharding.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import www.xiaomotou.sharding.service.PermissionService;
import www.xiaomotou.sharding.domain.*;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @desc：
 * @name：chenzq
 * @Date：2024/5/31 下午3:02
 */
@RestController
@RequestMapping("permission")
public class PermissionController {

    @Resource
    private PermissionService permissionService;


    @GetMapping("add")
    public Boolean add(Long id) {
        Permission permission = new Permission();
        permission.setId(id);
        permission.setName("权限名称：" + UUID.randomUUID());
        permission.setCreateTime(LocalDateTime.now());
        permission.setUpdateTime(LocalDateTime.now());
        return permissionService.save(permission);
    }
}