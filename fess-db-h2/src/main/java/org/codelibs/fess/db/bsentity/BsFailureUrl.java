package org.codelibs.fess.db.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.codelibs.fess.db.allcommon.DBMetaInstanceHandler;
import org.codelibs.fess.db.exentity.*;

/**
 * The entity of FAILURE_URL as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ID
 * 
 * [column]
 *     ID, URL, THREAD_NAME, ERROR_NAME, ERROR_LOG, ERROR_COUNT, LAST_ACCESS_TIME, CONFIG_ID
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long id = entity.getId();
 * String url = entity.getUrl();
 * String threadName = entity.getThreadName();
 * String errorName = entity.getErrorName();
 * String errorLog = entity.getErrorLog();
 * Integer errorCount = entity.getErrorCount();
 * java.time.LocalDateTime lastAccessTime = entity.getLastAccessTime();
 * String configId = entity.getConfigId();
 * entity.setId(id);
 * entity.setUrl(url);
 * entity.setThreadName(threadName);
 * entity.setErrorName(errorName);
 * entity.setErrorLog(errorLog);
 * entity.setErrorCount(errorCount);
 * entity.setLastAccessTime(lastAccessTime);
 * entity.setConfigId(configId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsFailureUrl extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _id;

    /** URL: {IX+, NotNull, VARCHAR(4000)} */
    protected String _url;

    /** THREAD_NAME: {NotNull, VARCHAR(30)} */
    protected String _threadName;

    /** ERROR_NAME: {VARCHAR(255)} */
    protected String _errorName;

    /** ERROR_LOG: {VARCHAR(4000)} */
    protected String _errorLog;

    /** ERROR_COUNT: {NotNull, INTEGER(10)} */
    protected Integer _errorCount;

    /** LAST_ACCESS_TIME: {NotNull, TIMESTAMP(23, 10)} */
    protected java.time.LocalDateTime _lastAccessTime;

    /** CONFIG_ID: {IX, VARCHAR(100)} */
    protected String _configId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "FAILURE_URL";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsFailureUrl) {
            BsFailureUrl other = (BsFailureUrl)obj;
            if (!xSV(_id, other._id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_url));
        sb.append(dm).append(xfND(_threadName));
        sb.append(dm).append(xfND(_errorName));
        sb.append(dm).append(xfND(_errorLog));
        sb.append(dm).append(xfND(_errorCount));
        sb.append(dm).append(xfND(_lastAccessTime));
        sb.append(dm).append(xfND(_configId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public FailureUrl clone() {
        return (FailureUrl)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getId() {
        checkSpecifiedProperty("id");
        return _id;
    }

    /**
     * [set] ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param id The value of the column 'ID'. (basically NotNull if update: for the constraint)
     */
    public void setId(Long id) {
        registerModifiedProperty("id");
        _id = id;
    }

    /**
     * [get] URL: {IX+, NotNull, VARCHAR(4000)} <br>
     * @return The value of the column 'URL'. (basically NotNull if selected: for the constraint)
     */
    public String getUrl() {
        checkSpecifiedProperty("url");
        return _url;
    }

    /**
     * [set] URL: {IX+, NotNull, VARCHAR(4000)} <br>
     * @param url The value of the column 'URL'. (basically NotNull if update: for the constraint)
     */
    public void setUrl(String url) {
        registerModifiedProperty("url");
        _url = url;
    }

    /**
     * [get] THREAD_NAME: {NotNull, VARCHAR(30)} <br>
     * @return The value of the column 'THREAD_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getThreadName() {
        checkSpecifiedProperty("threadName");
        return _threadName;
    }

    /**
     * [set] THREAD_NAME: {NotNull, VARCHAR(30)} <br>
     * @param threadName The value of the column 'THREAD_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setThreadName(String threadName) {
        registerModifiedProperty("threadName");
        _threadName = threadName;
    }

    /**
     * [get] ERROR_NAME: {VARCHAR(255)} <br>
     * @return The value of the column 'ERROR_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorName() {
        checkSpecifiedProperty("errorName");
        return _errorName;
    }

    /**
     * [set] ERROR_NAME: {VARCHAR(255)} <br>
     * @param errorName The value of the column 'ERROR_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorName(String errorName) {
        registerModifiedProperty("errorName");
        _errorName = errorName;
    }

    /**
     * [get] ERROR_LOG: {VARCHAR(4000)} <br>
     * @return The value of the column 'ERROR_LOG'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorLog() {
        checkSpecifiedProperty("errorLog");
        return _errorLog;
    }

    /**
     * [set] ERROR_LOG: {VARCHAR(4000)} <br>
     * @param errorLog The value of the column 'ERROR_LOG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorLog(String errorLog) {
        registerModifiedProperty("errorLog");
        _errorLog = errorLog;
    }

    /**
     * [get] ERROR_COUNT: {NotNull, INTEGER(10)} <br>
     * @return The value of the column 'ERROR_COUNT'. (basically NotNull if selected: for the constraint)
     */
    public Integer getErrorCount() {
        checkSpecifiedProperty("errorCount");
        return _errorCount;
    }

    /**
     * [set] ERROR_COUNT: {NotNull, INTEGER(10)} <br>
     * @param errorCount The value of the column 'ERROR_COUNT'. (basically NotNull if update: for the constraint)
     */
    public void setErrorCount(Integer errorCount) {
        registerModifiedProperty("errorCount");
        _errorCount = errorCount;
    }

    /**
     * [get] LAST_ACCESS_TIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @return The value of the column 'LAST_ACCESS_TIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getLastAccessTime() {
        checkSpecifiedProperty("lastAccessTime");
        return _lastAccessTime;
    }

    /**
     * [set] LAST_ACCESS_TIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @param lastAccessTime The value of the column 'LAST_ACCESS_TIME'. (basically NotNull if update: for the constraint)
     */
    public void setLastAccessTime(java.time.LocalDateTime lastAccessTime) {
        registerModifiedProperty("lastAccessTime");
        _lastAccessTime = lastAccessTime;
    }

    /**
     * [get] CONFIG_ID: {IX, VARCHAR(100)} <br>
     * @return The value of the column 'CONFIG_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getConfigId() {
        checkSpecifiedProperty("configId");
        return _configId;
    }

    /**
     * [set] CONFIG_ID: {IX, VARCHAR(100)} <br>
     * @param configId The value of the column 'CONFIG_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setConfigId(String configId) {
        registerModifiedProperty("configId");
        _configId = configId;
    }
}
