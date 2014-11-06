/****************************************************************
 *  系统名称  ：  'TODO'
 *  文件名    ： Version.java
 *  (C) Copyright Green Shore Network Technology Co.,Ltd.2012
 *           	All Rights Reserved.
 * **************************************************************
 *  注意： 本内容仅限于上海绿岸网络科技有限公司内部使用，禁止转发
 ****************************************************************/
package jjwu.xdeveloper.app.unit;


/**
 * 类说明
 * @简述： XXX
 * @作者： 吴君杰
 * @版本： 1.0.0
 * @时间： 2013-4-14 下午7:28:06
 * @邮箱： wujunjie@iwgame.com
 */
public class Users {
    
    private String name;
    
    private String sex;
    
    private int age;
    
    
    public Users(){
        System.out.println("-----Users init-----");
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getSex() {
        return sex;
    }

    
    public void setSex(String sex) {
        this.sex = sex;
    }

    
    public int getAge() {
        return age;
    }

    
    public void setAge(int age) {
        this.age = age;
    }
}
