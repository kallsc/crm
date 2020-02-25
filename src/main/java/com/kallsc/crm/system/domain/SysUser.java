package com.kallsc.crm.system.domain;

import java.util.Date;

/**   
  * 
  * 类名称:   SysUser  
  * 类描述:   用户实体类
  * 创建人:   ks  
  * 创建时间:  2020/2/10
  * 修改人:   ks   
  * 修改时间:  2020/2/20 
  * 修改备注:  编辑SysUser实体类
  * 版本:    [v1.0]   
  *    
  */

public class SysUser {
    private static final long serialVersionUID = 1L;

    /** 用户ID */
    private String user_id;

    /** 部门ID */
    private Long dept_id;

    /** 登录名称 */
    private String login_name;

    /** 用户名称 */
    private String user_name;

    /** 用户邮箱 */
    private String email;

    /** 密码 */
    private String password;

    /** 盐加密 */
    private String salt;

    /** 手机号码 */
    private String phonenumber;

    /** 帐号类型（00测试用户 10管理员） */
    private String user_type;

    /** 帐号状态（0正常 1停用） */
    private String status;

    /** 用户性别 */
    private String sex;

    /** 用户头像 */
    private String avatar;

    /** 创建者 */
    private String create_by;

    /** 创建时间 */
    private Date create_date;

    /** 更新者 */
    private String update_by;

    /** 更新时间 */
    private Date update_date;

    /** 最后登陆IP */
    private String login_ip;

    /** 最后登陆时间 */
    private Date login_date;

    /** 删除标志（0代表存在 2代表删除） */
    private String del_flag;

    /** 备注 */
    private String remark;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Long getDept_id() {
        return dept_id;
    }

    public void setDept_id(Long dept_id) {
        this.dept_id = dept_id;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public String getLogin_ip() {
        return login_ip;
    }

    public void setLogin_ip(String login_ip) {
        this.login_ip = login_ip;
    }

    public Date getLogin_date() {
        return login_date;
    }

    public void setLogin_date(Date login_date) {
        this.login_date = login_date;
    }

    public String getDel_flag() {
        return del_flag;
    }

    public void setDel_flag(String del_flag) {
        this.del_flag = del_flag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
