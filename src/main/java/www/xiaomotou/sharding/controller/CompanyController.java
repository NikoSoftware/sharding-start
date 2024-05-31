package www.xiaomotou.sharding.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import www.xiaomotou.sharding.mapper.CompanyMapper;
import www.xiaomotou.sharding.service.CompanyService;
import www.xiaomotou.sharding.domain.*;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * @desc：
 * @name：chenzq
 * @Date：2024/5/31 下午3:01
 */
@RestController
@RequestMapping("company")
public class CompanyController {

    @Resource
    private CompanyService companyService;

    @Resource
    CompanyMapper companyMapper;


    @GetMapping("add")
    public Boolean add(Long id) {
        Company company = new Company();
        company.setId(id);
        company.setName("企业名称；" + UUID.randomUUID());
        company.setCreateTime(LocalDateTime.now());
        company.setUpdateTime(LocalDateTime.now());
        return companyService.save(company);
    }

    @GetMapping("all")
    public List<Company> getAll() {

        return companyMapper.selectList();

    }


}