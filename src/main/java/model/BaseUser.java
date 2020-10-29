package model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * BaseUser definition.
 * 
 * This file was generated by Ignite Web Console (10/12/2020, 17:13)
 **/
public class BaseUser implements Serializable {
    /** */
    private static final long serialVersionUID = 0L;

    /** Value for account. */
    private String account;

    /** Value for password. */
    private String password;

    /** Value for userNo. */
    private String userNo;

    /** Value for name. */
    private String name;

    /** Value for sex. */
    private String sex;

    /** Value for idCard. */
    private String idCard;

    /** Value for userEducation. */
    private String userEducation;

    /** Value for userWork. */
    private String userWork;

    /** Value for maxCustomerNum. */
    private Integer maxCustomerNum;

    /** Value for subCompanyId. */
    private Integer subCompanyId;

    /** Value for departId. */
    private Integer departId;

    /** Value for jobId. */
    private Integer jobId;

    /** Value for mobile. */
    private String mobile;

    /** Value for telephone. */
    private String telephone;

    /** Value for email. */
    private String email;

    /** Value for weixin. */
    private String weixin;

    /** Value for dingding. */
    private String dingding;

    /** Value for userState. */
    private int userState;

    /** Value for userType. */
    private String userType;

    /** Value for delFlg. */
    private boolean delFlg;

    /** Value for createTime. */
    private Timestamp createTime;

    /** Value for createUser. */
    private int createUser;

    /** Value for updateTime. */
    private Timestamp updateTime;

    /** Value for updateUser. */
    private Integer updateUser;

    /** Value for sendPwdFlag. */
    private boolean sendPwdFlag;

    /** Value for workBase. */
    private String workBase;

    /** Value for isWhite. */
    private Boolean isWhite;

    /** Empty constructor. **/
    public BaseUser() {
        // No-op.
    }

    /** Full constructor. **/
    public BaseUser(String account,
        String password,
        String userNo,
        String name,
        String sex,
        String idCard,
        String userEducation,
        String userWork,
        Integer maxCustomerNum,
        Integer subCompanyId,
        Integer departId,
        Integer jobId,
        String mobile,
        String telephone,
        String email,
        String weixin,
        String dingding,
        int userState,
        String userType,
        boolean delFlg,
        Timestamp createTime,
        int createUser,
        Timestamp updateTime,
        Integer updateUser,
        boolean sendPwdFlag,
        String workBase,
        Boolean isWhite) {
        this.account = account;
        this.password = password;
        this.userNo = userNo;
        this.name = name;
        this.sex = sex;
        this.idCard = idCard;
        this.userEducation = userEducation;
        this.userWork = userWork;
        this.maxCustomerNum = maxCustomerNum;
        this.subCompanyId = subCompanyId;
        this.departId = departId;
        this.jobId = jobId;
        this.mobile = mobile;
        this.telephone = telephone;
        this.email = email;
        this.weixin = weixin;
        this.dingding = dingding;
        this.userState = userState;
        this.userType = userType;
        this.delFlg = delFlg;
        this.createTime = createTime;
        this.createUser = createUser;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
        this.sendPwdFlag = sendPwdFlag;
        this.workBase = workBase;
        this.isWhite = isWhite;
    }

    /**
     * Gets account
     * 
     * @return Value for account.
     **/
    public String getAccount() {
        return account;
    }

    /**
     * Sets account
     * 
     * @param account New value for account.
     **/
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * Gets password
     * 
     * @return Value for password.
     **/
    public String getPassword() {
        return password;
    }

    /**
     * Sets password
     * 
     * @param password New value for password.
     **/
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets userNo
     * 
     * @return Value for userNo.
     **/
    public String getUserNo() {
        return userNo;
    }

    /**
     * Sets userNo
     * 
     * @param userNo New value for userNo.
     **/
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    /**
     * Gets name
     * 
     * @return Value for name.
     **/
    public String getName() {
        return name;
    }

    /**
     * Sets name
     * 
     * @param name New value for name.
     **/
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets sex
     * 
     * @return Value for sex.
     **/
    public String getSex() {
        return sex;
    }

    /**
     * Sets sex
     * 
     * @param sex New value for sex.
     **/
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * Gets idCard
     * 
     * @return Value for idCard.
     **/
    public String getIdCard() {
        return idCard;
    }

    /**
     * Sets idCard
     * 
     * @param idCard New value for idCard.
     **/
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * Gets userEducation
     * 
     * @return Value for userEducation.
     **/
    public String getUserEducation() {
        return userEducation;
    }

    /**
     * Sets userEducation
     * 
     * @param userEducation New value for userEducation.
     **/
    public void setUserEducation(String userEducation) {
        this.userEducation = userEducation;
    }

    /**
     * Gets userWork
     * 
     * @return Value for userWork.
     **/
    public String getUserWork() {
        return userWork;
    }

    /**
     * Sets userWork
     * 
     * @param userWork New value for userWork.
     **/
    public void setUserWork(String userWork) {
        this.userWork = userWork;
    }

    /**
     * Gets maxCustomerNum
     * 
     * @return Value for maxCustomerNum.
     **/
    public Integer getMaxCustomerNum() {
        return maxCustomerNum;
    }

    /**
     * Sets maxCustomerNum
     * 
     * @param maxCustomerNum New value for maxCustomerNum.
     **/
    public void setMaxCustomerNum(Integer maxCustomerNum) {
        this.maxCustomerNum = maxCustomerNum;
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
     * Gets jobId
     * 
     * @return Value for jobId.
     **/
    public Integer getJobId() {
        return jobId;
    }

    /**
     * Sets jobId
     * 
     * @param jobId New value for jobId.
     **/
    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    /**
     * Gets mobile
     * 
     * @return Value for mobile.
     **/
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets mobile
     * 
     * @param mobile New value for mobile.
     **/
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * Gets telephone
     * 
     * @return Value for telephone.
     **/
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets telephone
     * 
     * @param telephone New value for telephone.
     **/
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * Gets email
     * 
     * @return Value for email.
     **/
    public String getEmail() {
        return email;
    }

    /**
     * Sets email
     * 
     * @param email New value for email.
     **/
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets weixin
     * 
     * @return Value for weixin.
     **/
    public String getWeixin() {
        return weixin;
    }

    /**
     * Sets weixin
     * 
     * @param weixin New value for weixin.
     **/
    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    /**
     * Gets dingding
     * 
     * @return Value for dingding.
     **/
    public String getDingding() {
        return dingding;
    }

    /**
     * Sets dingding
     * 
     * @param dingding New value for dingding.
     **/
    public void setDingding(String dingding) {
        this.dingding = dingding;
    }

    /**
     * Gets userState
     * 
     * @return Value for userState.
     **/
    public int getUserState() {
        return userState;
    }

    /**
     * Sets userState
     * 
     * @param userState New value for userState.
     **/
    public void setUserState(int userState) {
        this.userState = userState;
    }

    /**
     * Gets userType
     * 
     * @return Value for userType.
     **/
    public String getUserType() {
        return userType;
    }

    /**
     * Sets userType
     * 
     * @param userType New value for userType.
     **/
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * Gets delFlg
     * 
     * @return Value for delFlg.
     **/
    public boolean getDelFlg() {
        return delFlg;
    }

    /**
     * Sets delFlg
     * 
     * @param delFlg New value for delFlg.
     **/
    public void setDelFlg(boolean delFlg) {
        this.delFlg = delFlg;
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
    public int getCreateUser() {
        return createUser;
    }

    /**
     * Sets createUser
     * 
     * @param createUser New value for createUser.
     **/
    public void setCreateUser(int createUser) {
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
     * Gets sendPwdFlag
     * 
     * @return Value for sendPwdFlag.
     **/
    public boolean getSendPwdFlag() {
        return sendPwdFlag;
    }

    /**
     * Sets sendPwdFlag
     * 
     * @param sendPwdFlag New value for sendPwdFlag.
     **/
    public void setSendPwdFlag(boolean sendPwdFlag) {
        this.sendPwdFlag = sendPwdFlag;
    }

    /**
     * Gets workBase
     * 
     * @return Value for workBase.
     **/
    public String getWorkBase() {
        return workBase;
    }

    /**
     * Sets workBase
     * 
     * @param workBase New value for workBase.
     **/
    public void setWorkBase(String workBase) {
        this.workBase = workBase;
    }

    /**
     * Gets isWhite
     * 
     * @return Value for isWhite.
     **/
    public Boolean getIsWhite() {
        return isWhite;
    }

    /**
     * Sets isWhite
     * 
     * @param isWhite New value for isWhite.
     **/
    public void setIsWhite(Boolean isWhite) {
        this.isWhite = isWhite;
    }

    /** {@inheritDoc} **/
    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        
        if (!(o instanceof BaseUser))
            return false;
        
        BaseUser that = (BaseUser)o;

        if (account != null ? !account.equals(that.account) : that.account != null)
            return false;
        

        if (password != null ? !password.equals(that.password) : that.password != null)
            return false;
        

        if (userNo != null ? !userNo.equals(that.userNo) : that.userNo != null)
            return false;
        

        if (name != null ? !name.equals(that.name) : that.name != null)
            return false;
        

        if (sex != null ? !sex.equals(that.sex) : that.sex != null)
            return false;
        

        if (idCard != null ? !idCard.equals(that.idCard) : that.idCard != null)
            return false;
        

        if (userEducation != null ? !userEducation.equals(that.userEducation) : that.userEducation != null)
            return false;
        

        if (userWork != null ? !userWork.equals(that.userWork) : that.userWork != null)
            return false;
        

        if (maxCustomerNum != null ? !maxCustomerNum.equals(that.maxCustomerNum) : that.maxCustomerNum != null)
            return false;
        

        if (subCompanyId != null ? !subCompanyId.equals(that.subCompanyId) : that.subCompanyId != null)
            return false;
        

        if (departId != null ? !departId.equals(that.departId) : that.departId != null)
            return false;
        

        if (jobId != null ? !jobId.equals(that.jobId) : that.jobId != null)
            return false;
        

        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null)
            return false;
        

        if (telephone != null ? !telephone.equals(that.telephone) : that.telephone != null)
            return false;
        

        if (email != null ? !email.equals(that.email) : that.email != null)
            return false;
        

        if (weixin != null ? !weixin.equals(that.weixin) : that.weixin != null)
            return false;
        

        if (dingding != null ? !dingding.equals(that.dingding) : that.dingding != null)
            return false;
        

        if (userState != that.userState)
            return false;
        

        if (userType != null ? !userType.equals(that.userType) : that.userType != null)
            return false;
        

        if (delFlg != that.delFlg)
            return false;
        

        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null)
            return false;
        

        if (createUser != that.createUser)
            return false;
        

        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null)
            return false;
        

        if (updateUser != null ? !updateUser.equals(that.updateUser) : that.updateUser != null)
            return false;
        

        if (sendPwdFlag != that.sendPwdFlag)
            return false;
        

        if (workBase != null ? !workBase.equals(that.workBase) : that.workBase != null)
            return false;
        

        if (isWhite != null ? !isWhite.equals(that.isWhite) : that.isWhite != null)
            return false;
        
        return true;
    }

    /** {@inheritDoc} **/
    @Override public int hashCode() {
        int res = account != null ? account.hashCode() : 0;

        res = 31 * res + (password != null ? password.hashCode() : 0);

        res = 31 * res + (userNo != null ? userNo.hashCode() : 0);

        res = 31 * res + (name != null ? name.hashCode() : 0);

        res = 31 * res + (sex != null ? sex.hashCode() : 0);

        res = 31 * res + (idCard != null ? idCard.hashCode() : 0);

        res = 31 * res + (userEducation != null ? userEducation.hashCode() : 0);

        res = 31 * res + (userWork != null ? userWork.hashCode() : 0);

        res = 31 * res + (maxCustomerNum != null ? maxCustomerNum.hashCode() : 0);

        res = 31 * res + (subCompanyId != null ? subCompanyId.hashCode() : 0);

        res = 31 * res + (departId != null ? departId.hashCode() : 0);

        res = 31 * res + (jobId != null ? jobId.hashCode() : 0);

        res = 31 * res + (mobile != null ? mobile.hashCode() : 0);

        res = 31 * res + (telephone != null ? telephone.hashCode() : 0);

        res = 31 * res + (email != null ? email.hashCode() : 0);

        res = 31 * res + (weixin != null ? weixin.hashCode() : 0);

        res = 31 * res + (dingding != null ? dingding.hashCode() : 0);

        res = 31 * res + (userState);

        res = 31 * res + (userType != null ? userType.hashCode() : 0);

        res = 31 * res + (delFlg ? 1 : 0);

        res = 31 * res + (createTime != null ? createTime.hashCode() : 0);

        res = 31 * res + (createUser);

        res = 31 * res + (updateTime != null ? updateTime.hashCode() : 0);

        res = 31 * res + (updateUser != null ? updateUser.hashCode() : 0);

        res = 31 * res + (sendPwdFlag ? 1 : 0);

        res = 31 * res + (workBase != null ? workBase.hashCode() : 0);

        res = 31 * res + (isWhite != null ? isWhite.hashCode() : 0);

        return res;
    }

    /** {@inheritDoc} **/
    @Override public String toString() {
        return "BaseUser [" + 
            "account=" + account + ", " + 
            "password=" + password + ", " + 
            "userNo=" + userNo + ", " + 
            "name=" + name + ", " + 
            "sex=" + sex + ", " + 
            "idCard=" + idCard + ", " + 
            "userEducation=" + userEducation + ", " + 
            "userWork=" + userWork + ", " + 
            "maxCustomerNum=" + maxCustomerNum + ", " + 
            "subCompanyId=" + subCompanyId + ", " + 
            "departId=" + departId + ", " + 
            "jobId=" + jobId + ", " + 
            "mobile=" + mobile + ", " + 
            "telephone=" + telephone + ", " + 
            "email=" + email + ", " + 
            "weixin=" + weixin + ", " + 
            "dingding=" + dingding + ", " + 
            "userState=" + userState + ", " + 
            "userType=" + userType + ", " + 
            "delFlg=" + delFlg + ", " + 
            "createTime=" + createTime + ", " + 
            "createUser=" + createUser + ", " + 
            "updateTime=" + updateTime + ", " + 
            "updateUser=" + updateUser + ", " + 
            "sendPwdFlag=" + sendPwdFlag + ", " + 
            "workBase=" + workBase + ", " + 
            "isWhite=" + isWhite +
        "]";
    }
}