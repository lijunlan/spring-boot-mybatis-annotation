import com.junlanli.spring_boot_mybatis_annotation.mapper.RnAddressMapper;
import com.junlanli.spring_boot_mybatis_annotation.model.RnAddress;
import com.junlanli.spring_boot_mybatis_annotation.starter.Application;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Copyright (C) 2015 - 2017 SOHU FOCUS Inc., All Rights Reserved.
 *
 * @Author: junlanli@sohu-inc.com
 * @Date: 2017-01-04
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class Test {

    @Autowired
    private RnAddressMapper rnAddressMapper;

    @org.junit.Test
    public void pr(){
        System.out.println("ssssssssssssssss");
    }

    @org.junit.Test
    public void test() {
        RnAddress rnAddress = rnAddressMapper.findyById(1);
        System.out.println(rnAddress);
    }
}
