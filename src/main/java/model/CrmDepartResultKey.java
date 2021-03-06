package model;

import java.io.Serializable;

/**
 * CrmDepartResultKey definition.
 * 
 * This file was generated by Ignite Web Console (10/14/2020, 16:49)
 **/
public class CrmDepartResultKey implements Serializable {
    /** */
    private static final long serialVersionUID = 0L;

    /** Value for departId. */
    private int departId;

    /** Value for year. */
    private int year;

    /** Value for month. */
    private int month;

    /** Empty constructor. **/
    public CrmDepartResultKey() {
        // No-op.
    }

    /** Full constructor. **/
    public CrmDepartResultKey(int departId,
                              int year,
                              int month) {
        this.departId = departId;
        this.year = year;
        this.month = month;
    }

    /**
     * Gets departId
     * 
     * @return Value for departId.
     **/
    public int getDepartId() {
        return departId;
    }

    /**
     * Sets departId
     * 
     * @param departId New value for departId.
     **/
    public void setDepartId(int departId) {
        this.departId = departId;
    }

    /**
     * Gets year
     * 
     * @return Value for year.
     **/
    public int getYear() {
        return year;
    }

    /**
     * Sets year
     * 
     * @param year New value for year.
     **/
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Gets month
     * 
     * @return Value for month.
     **/
    public int getMonth() {
        return month;
    }

    /**
     * Sets month
     * 
     * @param month New value for month.
     **/
    public void setMonth(int month) {
        this.month = month;
    }

    /** {@inheritDoc} **/
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        
        if (!(o instanceof CrmDepartResultKey))
            return false;
        
        CrmDepartResultKey that = (CrmDepartResultKey)o;

        if (departId != that.departId)
            return false;
        

        if (year != that.year)
            return false;
        

        if (month != that.month)
            return false;
        
        return true;
    }

    /** {@inheritDoc} **/
    @Override
    public int hashCode() {
        int res = departId;

        res = 31 * res + (year);

        res = 31 * res + (month);

        return res;
    }

    /** {@inheritDoc} **/
    @Override
    public String toString() {
        return "CrmDepartResultKey [" + 
            "departId=" + departId + ", " + 
            "year=" + year + ", " + 
            "month=" + month +
        "]";
    }
}