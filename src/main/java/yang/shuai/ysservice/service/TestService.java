package yang.shuai.ysservice.service;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import yang.shuai.ysservice.entity.TestBean;

/**
 * 数据接口协议
 * **/
@Service//解决controller中引用service爆红
@Mapper
public interface TestService {
    //判断表是否存在
    @Select("SELECT table_name FROM information_schema.TABLES WHERE table_name ='AppComment'")
    String isHaveTable();

    //创建
    @Insert("CREATE TABLE IF NOT EXISTS `runoob_bbb`(" +
            "`runoob_id` INT UNSIGNED AUTO_INCREMENT," +//定义自增长
            "`runoob_title` VARCHAR(100) NOT NULL," +//不为空
            "PRIMARY KEY(`runoob_id`)" +//定义主键值对
            ")ENGINE=InnoDB DEFAULT CHARSET=utf8")
    int createComment(TestBean bean);//成功返回0

    //插入数据
    @Insert("INSERT INTO `runoob_bbb`(" +
            "`runoob_title`" +
            ")VALUES(" +
            "'不错'" +//注意字符串单引号不同
            ")")
    int addComment(TestBean bean);

    //删除数据
    @Delete("DELETE FROM `bingo_comment` WHERE `app_id`=-1")
    int deleteComment(TestBean bean);

    //修改数据
    @Update("UPDATE `runoob_bbb` SET `runoob_title`='我不服' WHERE `runoob_id`=1")
    int updateComment(TestBean bean);

    //查询数据#{userName}
    @Select("SELECT * FROM `runoob_bbb` where `runoob_id`=5")
    TestBean selectComment(TestBean bean);


    //更改表结构添加字段
    @Update("ALTER TABLE `runoob_bbb` ADD COLUMN `runoob_test` INT NOT NULL DEFAULT 0 AFTER `runoob_title`")
    int updateTableColumn();

    //更改表结构删除字段
    @Delete("ALTER TABLE `runoob_bbb` DROP COLUMN `GATEWAYID`")
    int deleteTableColumn();

    //更改表结构调整字段顺序（只能用after）
    @Update("ALTER TABLE `runoob_bbb` CHANGE `runoob_title` `runoob_title` VARCHAR(100) NOT NULL  AFTER `runoob_test`")
    int updateTableColumnOrder();

    //更改表结构删除主键自增长（先删除自增长，再删除主键，再添加）
    @Update("Alter table `runoob_bbb` change `runoob_test` `runoob_test` int(10)")
    int updateTableDeleteKeyAuto();
    //更改表结构删除主键（先删除自增长，再删除主键，再添加）
    @Delete("alter table `runoob_bbb` drop primary key")
    int updateTableDeleteKey();
    //更改表结构修改主键（先删除自增长，再删除主键，再添加）
    @Update("ALTER TABLE `runoob_bbb` add primary key (runoob_id)")
    int updateTableUpdateKey();

    //更改键的类型
//    alter table t1 change b b bigint not null;
//    alter table infos change list list tinyint not null default ‘0′;
    @Update("alter table `bingo_reply` change `reply_time` `reply_time` VARCHAR(100) NOT NULL")
    int updateTableType();

    //修改字段名 -- 正常，能修改字段类型、类型长度、默认值、注释
    @Update("alter  table bingo_comment change conment_time comment_time int(10) DEFAULT 0 COMMENT '评论时间'")
    int renameComment();


    //删除表
    @Delete("DROP TABLE `runoob_aaa`")
    int deleteTable();
    //删除表
    @Delete("DROP TABLE `runoob_bbb`")
    int deleteTable1();
    //删除表
    @Delete("DROP TABLE `runoob_tbl`")
    int deleteTable2();







}
