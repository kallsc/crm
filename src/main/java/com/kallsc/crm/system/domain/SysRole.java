package com.kallsc.crm.system.domain;

import java.util.Date;

/**
 * 角色实体类
 */
public class SysRole {
    /** 角色ID*/
    private Integer role_id;
    /** 角色名称*/
    private String role_name;
    /** 角色权限字符串*/
    private String role_key;
    /** 权限范围（0：所有权限 1：自定义权限）*/
    private String data_scope;
    /** 角色状态（0正常 1停用）*/
    private Integer status;
    /** 删除标志（0代表存在 2代表删除）*/
    private Integer del_flag;
    /** 创建者*/
    private String create_by;
    /** 创建时间*/
    private Date create_time;
    /** 更新者*/
    private String update_by;
    /** 更新时间*/
    private Date update_time;
    /** 备注*/
    private String remark;

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRole_key() {
        return role_key;
    }

    public void setRole_key(String role_key) {
        this.role_key = role_key;
    }

    public String getData_scope() {
        return data_scope;
    }

    public void setData_scope(String data_scope) {
        this.data_scope = data_scope;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDel_flag() {
        return del_flag;
    }

    public void setDel_flag(Integer del_flag) {
        this.del_flag = del_flag;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
