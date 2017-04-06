package com.heitian.ssm.dao.entity;

import java.util.Date;

public class User {
    /**
     * t_user.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 用户名
     * t_user.user_name
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * 手机号
     * t_user.user_phone
     *
     * @mbggenerated
     */
    private String userPhone;

    /**
     * 邮箱地址
     * t_user.user_email
     *
     * @mbggenerated
     */
    private String userEmail;

    /**
     * 加盐后用户密码
     * t_user.user_pwd
     *
     * @mbggenerated
     */
    private String userPwd;

    /**
     * MD5盐
     * t_user.pwd_salt
     *
     * @mbggenerated
     */
    private String pwdSalt;

    /**
     * 创建时间
     * t_user.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 最后修改时间
     * t_user.modify_time
     *
     * @mbggenerated
     */
    private Date modifyTime;

    /**
     * 是否删除，0-未删除；1-已删除
     * t_user.is_delete
     *
     * @mbggenerated
     */
    private Byte isDelete;

    /**
     * This method returns the value of the database column t_user.id
     *
     * @return the value of t_user.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column t_user.id
     *
     * @param id the value for t_user.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 用户名
     * This method returns the value of the database column t_user.user_name
     *
     * @return the value of t_user.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名
     * This method sets the value of the database column t_user.user_name
     *
     * @param userName the value for t_user.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 手机号
     * This method returns the value of the database column t_user.user_phone
     *
     * @return the value of t_user.user_phone
     *
     * @mbggenerated
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 手机号
     * This method sets the value of the database column t_user.user_phone
     *
     * @param userPhone the value for t_user.user_phone
     *
     * @mbggenerated
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * 邮箱地址
     * This method returns the value of the database column t_user.user_email
     *
     * @return the value of t_user.user_email
     *
     * @mbggenerated
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 邮箱地址
     * This method sets the value of the database column t_user.user_email
     *
     * @param userEmail the value for t_user.user_email
     *
     * @mbggenerated
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * 加盐后用户密码
     * This method returns the value of the database column t_user.user_pwd
     *
     * @return the value of t_user.user_pwd
     *
     * @mbggenerated
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * 加盐后用户密码
     * This method sets the value of the database column t_user.user_pwd
     *
     * @param userPwd the value for t_user.user_pwd
     *
     * @mbggenerated
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    /**
     * MD5盐
     * This method returns the value of the database column t_user.pwd_salt
     *
     * @return the value of t_user.pwd_salt
     *
     * @mbggenerated
     */
    public String getPwdSalt() {
        return pwdSalt;
    }

    /**
     * MD5盐
     * This method sets the value of the database column t_user.pwd_salt
     *
     * @param pwdSalt the value for t_user.pwd_salt
     *
     * @mbggenerated
     */
    public void setPwdSalt(String pwdSalt) {
        this.pwdSalt = pwdSalt;
    }

    /**
     * 创建时间
     * This method returns the value of the database column t_user.create_time
     *
     * @return the value of t_user.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * This method sets the value of the database column t_user.create_time
     *
     * @param createTime the value for t_user.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 最后修改时间
     * This method returns the value of the database column t_user.modify_time
     *
     * @return the value of t_user.modify_time
     *
     * @mbggenerated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 最后修改时间
     * This method sets the value of the database column t_user.modify_time
     *
     * @param modifyTime the value for t_user.modify_time
     *
     * @mbggenerated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 是否删除，0-未删除；1-已删除
     * This method returns the value of the database column t_user.is_delete
     *
     * @return the value of t_user.is_delete
     *
     * @mbggenerated
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * 是否删除，0-未删除；1-已删除
     * This method sets the value of the database column t_user.is_delete
     *
     * @param isDelete the value for t_user.is_delete
     *
     * @mbggenerated
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}