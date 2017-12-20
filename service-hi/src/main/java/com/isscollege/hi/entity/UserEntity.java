package com.isscollege.hi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

/**
 * 用户信息(SYS_USER)
 *
 * @author bianj
 * @version 1.0.0 2016-09-14
 */
@Entity
@Table(name = "sys_user")
public class UserEntity {
    /**
     * 版本号
     */
    private static final long serialVersionUID = -7994628530701952803L;

    /**  */
    @Id
    @Column(name = "id", unique = true, nullable = false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户登陆名
     */
    @Column(name = "account", nullable = false, length = 40)
    private String account;

    /**  */
    @Column(name = "password", nullable = false, length = 60)
    @JsonIgnore
    private String password;

    /**
     * 用户真实姓名
     */
    @Column(name = "realname", nullable = true, length = 50)
    private String realname;

    /**
     * 办公电话
     */
    @Column(name = "telphone", nullable = true, length = 20)
    private String telphone;

    /**
     * 个人电话
     */
    @Column(name = "mobphone", nullable = false, length = 20)
    private String mobphone;

    /**
     * 电子邮箱
     */
    @Column(name = "email", nullable = true, length = 150)
    private String email;

    /**  */
    @Column(name = "identity_flag", nullable = true, length = 20)
    private String identityFlag;

    /**  */
    @Column(name = "survival_flag", nullable = true, length = 20)
    private String survivalFlag;

    /**
     * 家庭住址
     */
    @Column(name = "area", nullable = true, length = 100)
    private String area;

    /**  */
    @Column(name = "head_url", nullable = true, length = 255)
    private String headUrl;

    /**
     * 注册通道
     * 1、前台注册  2、IPsa注册  3、后台注册
     */
    @Column(name = "channels", nullable = true, length = 20)
    private String channels;

    /**
     * 所在公司
     */
    @Column(name = "company", nullable = true, length = 255)
    private String company;

    /**  */
    @Column(name = "dept", nullable = true, length = 32)
    private String dept;

    /**  */
    @Column(name = "iscertified", nullable = true, length = 10)
    private Integer iscertified;

    /**  */
    @Column(name = "commit_account", nullable = true, length = 32)
    private String commitAccount;

    /**  */
    @Column(name = "commit_date", nullable = true)
    private Date commitDate;

    /**  */
    @Column(name = "delete_date", nullable = true)
    private Date deleteDate;

    /**  */
    @Column(name = "update_date", nullable = true)
    private Date updateDate;

    @Column(name = "type", nullable = true)
    private Integer type;

    @Column(name = "uid", nullable = true, length = 100)
    private String uid;

    @Column(name = "space_depart_id", nullable = true, length = 11)
    private Integer spaceDepartId;

    @Column(name = "space_depart_name", nullable = true, length = 64)
    private String spaceDepartName;

    public Integer getSpaceDepartId() {
        return spaceDepartId;
    }

    public void setSpaceDepartId(Integer spaceDepartId) {
        this.spaceDepartId = spaceDepartId;
    }

    public String getSpaceDepartName() {
        return spaceDepartName;
    }

    public void setSpaceDepartName(String spaceDepartName) {
        this.spaceDepartName = spaceDepartName;
    }

    /**
     * 获取
     *
     * @return
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户登陆名
     *
     * @return 用户登陆名
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * 设置用户登陆名
     *
     * @param account 用户登陆名
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * 设置
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户真实姓名
     *
     * @return 用户真实姓名
     */
    public String getRealname() {
        return this.realname;
    }

    /**
     * 设置用户真实姓名
     *
     * @param realname 用户真实姓名
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * 获取办公电话
     *
     * @return 办公电话
     */
    public String getTelphone() {
        return this.telphone;
    }

    /**
     * 设置办公电话
     *
     * @param telphone 办公电话
     */
    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    /**
     * 获取个人电话
     *
     * @return 个人电话
     */
    public String getMobphone() {
        return this.mobphone;
    }

    /**
     * 设置个人电话
     *
     * @param mobphone 个人电话
     */
    public void setMobphone(String mobphone) {
        this.mobphone = mobphone;
    }

    /**
     * 获取电子邮箱
     *
     * @return 电子邮箱
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * 设置电子邮箱
     *
     * @param email 电子邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getIdentityFlag() {
        return this.identityFlag;
    }

    /**
     * 设置
     *
     * @param identityFlag
     */
    public void setIdentityFlag(String identityFlag) {
        this.identityFlag = identityFlag;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getSurvivalFlag() {
        return this.survivalFlag;
    }

    /**
     * 设置
     *
     * @param survivalFlag
     */
    public void setSurvivalFlag(String survivalFlag) {
        this.survivalFlag = survivalFlag;
    }

    /**
     * 获取家庭住址
     *
     * @return 家庭住址
     */
    public String getArea() {
        return this.area;
    }

    /**
     * 设置家庭住址
     *
     * @param area 家庭住址
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getHeadUrl() {
        return this.headUrl;
    }

    /**
     * 设置
     *
     * @param headUrl
     */
    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    /**
     * 获取注册通道
     * 1、前台注册  2、IPsa注册  3、后台注册
     *
     * @return 注册通道
     * 1、前台注册  2、IPsa注册  3、后台注册
     */
    public String getChannels() {
        return this.channels;
    }

    /**
     * 设置注册通道
     * 1、前台注册  2、IPsa注册  3、后台注册
     *
     * @param channels 注册通道
     *                 1、前台注册  2、IPsa注册  3、后台注册
     */
    public void setChannels(String channels) {
        this.channels = channels;
    }

    /**
     * 获取所在公司
     *
     * @return 所在公司
     */
    public String getCompany() {
        return this.company;
    }

    /**
     * 设置所在公司
     *
     * @param company 所在公司
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getDept() {
        return this.dept;
    }

    /**
     * 设置
     *
     * @param dept
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * 获取
     *
     * @return
     */
    public Integer getIscertified() {
        return this.iscertified;
    }

    /**
     * 设置
     *
     * @param iscertified
     */
    public void setIscertified(Integer iscertified) {
        this.iscertified = iscertified;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getCommitAccount() {
        return this.commitAccount;
    }

    /**
     * 设置
     *
     * @param commitAccount
     */
    public void setCommitAccount(String commitAccount) {
        this.commitAccount = commitAccount;
    }

    /**
     * 获取
     *
     * @return
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+08:00")
    public Date getCommitDate() {
        return this.commitDate;
    }

    /**
     * 设置
     *
     * @param commitDate
     */
    public void setCommitDate(Date commitDate) {
        this.commitDate = commitDate;
    }

    /**
     * 获取
     *
     * @return
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+08:00")
    public Date getDeleteDate() {
        return this.deleteDate;
    }

    /**
     * 设置
     *
     * @param deleteDate
     */
    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }

    /**
     * 获取
     *
     * @return
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+08:00")
    public Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置
     *
     * @param updateDate
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}