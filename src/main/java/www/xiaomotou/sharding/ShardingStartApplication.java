package www.xiaomotou.sharding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("www.xiaomotou.sharding.mapper")
@EnableTransactionManagement
public class ShardingStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingStartApplication.class, args);
    }

}
