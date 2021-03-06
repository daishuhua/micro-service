package com.entity;

import java.io.Serializable;
import java.util.Date;

public class UserRoleRelation implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_role_relation
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    private static final long serialVersionUID = 1L;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role_relation.user_role_id
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    private Integer userRoleId;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role_relation.role_id
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    private Integer roleId;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role_relation.user_id
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    private Integer userId;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role_relation.create_time
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    private Date createTime;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role_relation.update_time
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role_relation.user_role_id
     *
     * @return the value of user_role_relation.user_role_id
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public Integer getUserRoleId() {
        return userRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role_relation.user_role_id
     *
     * @param userRoleId the value for user_role_relation.user_role_id
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role_relation.role_id
     *
     * @return the value of user_role_relation.role_id
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role_relation.role_id
     *
     * @param roleId the value for user_role_relation.role_id
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role_relation.user_id
     *
     * @return the value of user_role_relation.user_id
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role_relation.user_id
     *
     * @param userId the value for user_role_relation.user_id
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role_relation.create_time
     *
     * @return the value of user_role_relation.create_time
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role_relation.create_time
     *
     * @param createTime the value for user_role_relation.create_time
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role_relation.update_time
     *
     * @return the value of user_role_relation.update_time
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role_relation.update_time
     *
     * @param updateTime the value for user_role_relation.update_time
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}