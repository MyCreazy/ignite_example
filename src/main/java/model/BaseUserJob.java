package model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * BaseUserJob definition.
 * 
 * This file was generated by Ignite Web Console (10/12/2020, 17:13)
 **/
public class BaseUserJob implements Serializable {
    /** */
    private static final long serialVersionUID = 0L;

    /** Value for userId. */
    private int userId;

    /** Value for jobId. */
    private int jobId;

    /** Value for departId. */
    private Integer departId;

    /** Value for orgId. */
    private Integer orgId;

    /** Value for subCompanyId. */
    private Integer subCompanyId;

    /** Value for defaultFlg. */
    private Byte defaultFlg;

    /** Value for createTime. */
    private Timestamp createTime;

    /** Value for createUser. */
    private Integer createUser;

    /** Value for updateTime. */
    private Timestamp updateTime;

    /** Value for updateUser. */
    private Integer updateUser;

    /** Value for delFlg. */
    private Boolean delFlg;

    /** Empty constructor. **/
    public BaseUserJob() {
        // No-op.
    }

    /** Full constructor. **/
    public BaseUserJob(int userId,
        int jobId,
        Integer departId,
        Integer orgId,
        Integer subCompanyId,
        Byte defaultFlg,
        Timestamp createTime,
        Integer createUser,
        Timestamp updateTime,
        Integer updateUser,
        Boolean delFlg) {
        this.userId = userId;
        this.jobId = jobId;
        this.departId = departId;
        this.orgId = orgId;
        this.subCompanyId = subCompanyId;
        this.defaultFlg = defaultFlg;
        this.createTime = createTime;
        this.createUser = createUser;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
        this.delFlg = delFlg;
    }

    /**
     * Gets userId
     * 
     * @return Value for userId.
     **/
    public int getUserId() {
        return userId;
    }

    /**
     * Sets userId
     * 
     * @param userId New value for userId.
     **/
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Gets jobId
     * 
     * @return Value for jobId.
     **/
    public int getJobId() {
        return jobId;
    }

    /**
     * Sets jobId
     * 
     * @param jobId New value for jobId.
     **/
    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    /**
     * Gets departId
     * 
     * @return Value for departId.
     **/
    public Integer getDepartId() {
        return departId;
    }

    /**
     * Sets departId
     * 
     * @param departId New value for departId.
     **/
    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    /**
     * Gets orgId
     * 
     * @return Value for orgId.
     **/
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * Sets orgId
     * 
     * @param orgId New value for orgId.
     **/
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * Gets subCompanyId
     * 
     * @return Value for subCompanyId.
     **/
    public Integer getSubCompanyId() {
        return subCompanyId;
    }

    /**
     * Sets subCompanyId
     * 
     * @param subCompanyId New value for subCompanyId.
     **/
    public void setSubCompanyId(Integer subCompanyId) {
        this.subCompanyId = subCompanyId;
    }

    /**
     * Gets defaultFlg
     * 
     * @return Value for defaultFlg.
     **/
    public Byte getDefaultFlg() {
        return defaultFlg;
    }

    /**
     * Sets defaultFlg
     * 
     * @param defaultFlg New value for defaultFlg.
     **/
    public void setDefaultFlg(Byte defaultFlg) {
        this.defaultFlg = defaultFlg;
    }

    /**
     * Gets createTime
     * 
     * @return Value for createTime.
     **/
    public Timestamp getCreateTime() {
        return createTime;
    }

    /**
     * Sets createTime
     * 
     * @param createTime New value for createTime.
     **/
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    /**
     * Gets createUser
     * 
     * @return Value for createUser.
     **/
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * Sets createUser
     * 
     * @param createUser New value for createUser.
     **/
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * Gets updateTime
     * 
     * @return Value for updateTime.
     **/
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets updateTime
     * 
     * @param updateTime New value for updateTime.
     **/
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * Gets updateUser
     * 
     * @return Value for updateUser.
     **/
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     * Sets updateUser
     * 
     * @param updateUser New value for updateUser.
     **/
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * Gets delFlg
     * 
     * @return Value for delFlg.
     **/
    public Boolean getDelFlg() {
        return delFlg;
    }

    /**
     * Sets delFlg
     * 
     * @param delFlg New value for delFlg.
     **/
    public void setDelFlg(Boolean delFlg) {
        this.delFlg = delFlg;
    }

    /** {@inheritDoc} **/
    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        
        if (!(o instanceof BaseUserJob))
            return false;
        
        BaseUserJob that = (BaseUserJob)o;

        if (userId != that.userId)
            return false;
        

        if (jobId != that.jobId)
            return false;
        

        if (departId != null ? !departId.equals(that.departId) : that.departId != null)
            return false;
        

        if (orgId != null ? !orgId.equals(that.orgId) : that.orgId != null)
            return false;
        

        if (subCompanyId != null ? !subCompanyId.equals(that.subCompanyId) : that.subCompanyId != null)
            return false;
        

        if (defaultFlg != null ? !defaultFlg.equals(that.defaultFlg) : that.defaultFlg != null)
            return false;
        

        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null)
            return false;
        

        if (createUser != null ? !createUser.equals(that.createUser) : that.createUser != null)
            return false;
        

        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null)
            return false;
        

        if (updateUser != null ? !updateUser.equals(that.updateUser) : that.updateUser != null)
            return false;
        

        if (delFlg != null ? !delFlg.equals(that.delFlg) : that.delFlg != null)
            return false;
        
        return true;
    }

    /** {@inheritDoc} **/
    @Override public int hashCode() {
        int res = userId;

        res = 31 * res + (jobId);

        res = 31 * res + (departId != null ? departId.hashCode() : 0);

        res = 31 * res + (orgId != null ? orgId.hashCode() : 0);

        res = 31 * res + (subCompanyId != null ? subCompanyId.hashCode() : 0);

        res = 31 * res + (defaultFlg != null ? defaultFlg.hashCode() : 0);

        res = 31 * res + (createTime != null ? createTime.hashCode() : 0);

        res = 31 * res + (createUser != null ? createUser.hashCode() : 0);

        res = 31 * res + (updateTime != null ? updateTime.hashCode() : 0);

        res = 31 * res + (updateUser != null ? updateUser.hashCode() : 0);

        res = 31 * res + (delFlg != null ? delFlg.hashCode() : 0);

        return res;
    }

    /** {@inheritDoc} **/
    @Override public String toString() {
        return "BaseUserJob [" + 
            "userId=" + userId + ", " + 
            "jobId=" + jobId + ", " + 
            "departId=" + departId + ", " + 
            "orgId=" + orgId + ", " + 
            "subCompanyId=" + subCompanyId + ", " + 
            "defaultFlg=" + defaultFlg + ", " + 
            "createTime=" + createTime + ", " + 
            "createUser=" + createUser + ", " + 
            "updateTime=" + updateTime + ", " + 
            "updateUser=" + updateUser + ", " + 
            "delFlg=" + delFlg +
        "]";
    }
}