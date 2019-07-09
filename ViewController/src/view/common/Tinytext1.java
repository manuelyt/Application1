package view.common;

import java.io.Serializable;

import oracle.jbo.JboException;
import oracle.jbo.Transaction;
import oracle.jbo.domain.DomainInterface;
import oracle.jbo.domain.DomainOwnerInterface;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jul 08 14:45:57 CEST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Tinytext1 implements DomainInterface, Serializable {
    public Tinytext1(String val) {
        mData = new String(val);
        validate();
    }
    private String mData;

    protected Tinytext1() {
        mData = "";
    }

    public Object getData() {
        return mData;
    }

    /**
     * <b>Internal:</b> <em>Applications should not use this method.</em>
     */
    public void setContext(DomainOwnerInterface owner, Transaction trans, Object obj) {
    }

    /**
     * Implements domain validation logic and throws a JboException on error.
     */
    protected void validate() {
        //  ### Implement custom domain validation logic here. ###
    }

    public String toString() {
        if (mData != null) {
            return mData.toString();
        }
        return "<null>";
    }

    public boolean equals(Object obj) {
        if (obj instanceof DomainInterface) {
            if (mData != null) {
                return mData.equals(((DomainInterface) obj).getData());
            }
            return ((DomainInterface) obj).getData() == null;
        }
        return false;
    }
}

