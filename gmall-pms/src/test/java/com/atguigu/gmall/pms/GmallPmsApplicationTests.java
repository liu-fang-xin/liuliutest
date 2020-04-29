package com.atguigu.gmall.pms;

import com.atguigu.gmall.pms.entity.Brand;
import com.atguigu.gmall.pms.entity.Product;
import com.atguigu.gmall.pms.service.BrandService;
import com.atguigu.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


@SpringBootTest
class GmallPmsApplicationTests {
    @Autowired
    ProductService productService;
    @Autowired
    DataSource dataSource;
    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
       Product product = productService.getById(2 );
       System.out.println(product.getName());
    }
    @Test
    public void test1() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

    @Test
    public void saveBrand(){
        /*Brand brand = new Brand();
        brand.setName("骄傲佛面试");

        brandService.save(brand);

        System.out.println("保存成功");*/
        Brand brand = brandService.getById(53);
        System.out.println(brand.getName()+"-----------------");
    }
}
