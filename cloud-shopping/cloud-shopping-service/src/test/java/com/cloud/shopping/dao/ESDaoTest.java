package com.cloud.shopping.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ESDaoTest {

    @Resource
    ESDao esDao;

    @Test
    public void findByTitle() {
    }

    @Test
    public void findByTitleOrContext() {
    }

    @Test
    public void testFindByTitleOrContext() {
    }


    //通过springboot es向elasticsearch数据库储存一条数据
    @Test
    public void testSave() {
        //创建文档
        Article article = new Article();
        article.setId(1);
        article.setTitle("es搜索");
        article.setContext("成功了耶");
        //保存文档
        esDao.save(article);

        Iterable<Article> all = esDao.findAll();
        for (Article articlenew : all) {
            System.out.println(articlenew);
        }
    }


    //查询所有
    @Test
    public void findAll(){
        Iterable<Article> all = esDao.findAll();
        for (Article article : all) {
            System.out.println(article);
        }
    }

}