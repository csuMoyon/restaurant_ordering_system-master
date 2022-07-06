package com.work.restaurant_ordering_system;

import com.github.yitter.contract.IdGeneratorOptions;
import com.github.yitter.idgen.YitIdHelper;
import com.work.restaurant_ordering_system.Util.Util;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.work.restaurant_ordering_system.persistence")
public class RestaurantOrderingSystemApplication {

    public static void main(String[] args) {
        IdGeneratorOptions options = new IdGeneratorOptions((short) 1);
        options.WorkerIdBitLength = 10;
        YitIdHelper.setIdGenerator(options);

        Util util = new Util();

        SpringApplication.run(RestaurantOrderingSystemApplication.class, args);
    }

}
