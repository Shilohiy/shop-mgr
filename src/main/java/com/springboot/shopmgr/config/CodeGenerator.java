package com.springboot.shopmgr.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;

public class CodeGenerator {

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        // String projectPath = System.getProperty("user.dir");
        // gc.setOutputDir(projectPath + "/src/main/java");
        String projectPath = "D://mybatisCode";
        gc.setOutputDir(projectPath);
        gc.setAuthor("sdx2009");
        //设置完之后是否打开资源管理器
        gc.setOpen(false);
        gc.setSwagger2(false);
        gc.setIdType(IdType.AUTO);
        //设置是否覆盖原始生成的文件
        gc.setFileOverride(true);
        gc.setActiveRecord(false);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList
        //去掉service的i前缀
        gc.setServiceName("%sService");
        mpg.setGlobalConfig(gc);
        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("H2002L1003Y");
        dsc.setUrl(
                "jdbc:mysql://127.0.0.1:3306/shop_db?useUnicode=true&characterEncoding=utf8&useSSL=false");
        mpg.setDataSource(dsc);
        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("userinfo");// 模块名
        pc.setParent("com.springboot.shopmgr");
        mpg.setPackageInfo(pc);
        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {

            @Override
            public void initMap() {
                // to do nothing
            }
        };
        List<FileOutConfig> focList = new ArrayList<>();
        focList.add(new FileOutConfig("/templates/mapper.xml.ftl") {

            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输入文件名称
                return projectPath + "/src/main/resources/mapper/" + pc.getModuleName() + "/"
                        + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);
        mpg.setTemplate(new TemplateConfig().setXml(null));
        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        //数据表前缀:t_  sys_  vms_
        strategy.setTablePrefix(new String[]{""});// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);
        // strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        // strategy.setSuperEntityClass("com.baomidou.ant.common.BaseEntity");
        //在Controller类上添加@RestController注解
        strategy.setRestControllerStyle(true);
        // strategy.setSuperControllerClass("com.baomidou.ant.common.BaseController");
        strategy.setInclude("user_info");// 设置表名，根据表名生成java文件
        // strategy.setSuperEntityColumns("id");
        // strategy.setControllerMappingHyphenStyle(true);
        // strategy.setTablePrefix(pc.getModuleName() + "_");
        //在entity实体类上添加字段注解
        strategy.setEntityTableFieldAnnotationEnable(true);
//        strategy.setLogicDeleteFieldName("del_flag");
        //设置是否启用Lombok，@Data
        strategy.setEntityLombokModel(true);
        //字段自动填充
        List<TableFill> tableFillList = new ArrayList<TableFill>();
        TableFill tableFill1 = new TableFill("create_time", FieldFill.INSERT);
        TableFill tableFill2 = new TableFill("creator", FieldFill.INSERT);
        TableFill tableFill3 = new TableFill("update_time", FieldFill.UPDATE);
        TableFill tableFill4 = new TableFill("operator", FieldFill.UPDATE);
        tableFillList.add(tableFill1);
        tableFillList.add(tableFill2);
        tableFillList.add(tableFill3);
        tableFillList.add(tableFill4);
        strategy.setTableFillList(tableFillList);
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }
}
