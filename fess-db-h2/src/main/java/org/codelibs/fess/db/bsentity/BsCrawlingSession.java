package org.codelibs.fess.db.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.codelibs.fess.db.allcommon.DBMetaInstanceHandler;
import org.codelibs.fess.db.exentity.*;

/**
 * The entity of CRAWLING_SESSION as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ID
 * 
 * [column]
 *     ID, SESSION_ID, NAME, EXPIRED_TIME, CREATED_TIME
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
 *     CRAWLING_SESSION_INFO
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     crawlingSessionInfoList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long id = entity.getId();
 * String sessionId = entity.getSessionId();
 * String name = entity.getName();
 * java.time.LocalDateTime expiredTime = entity.getExpiredTime();
 * java.time.LocalDateTime createdTime = entity.getCreatedTime();
 * entity.setId(id);
 * entity.setSessionId(sessionId);
 * entity.setName(name);
 * entity.setExpiredTime(expiredTime);
 * entity.setCreatedTime(createdTime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsCrawlingSession extends AbstractEntity implements DomainEntity {

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

    /** SESSION_ID: {NotNull, VARCHAR(20)} */
    protected String _sessionId;

    /** NAME: {IX+, VARCHAR(20)} */
    protected String _name;

    /** EXPIRED_TIME: {TIMESTAMP(23, 10)} */
    protected java.time.LocalDateTime _expiredTime;

    /** CREATED_TIME: {NotNull, TIMESTAMP(23, 10)} */
    protected java.time.LocalDateTime _createdTime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "CRAWLING_SESSION";
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
    /** CRAWLING_SESSION_INFO by CRAWLING_SESSION_ID, named 'crawlingSessionInfoList'. */
    protected List<CrawlingSessionInfo> _crawlingSessionInfoList;

    /**
     * [get] CRAWLING_SESSION_INFO by CRAWLING_SESSION_ID, named 'crawlingSessionInfoList'.
     * @return The entity list of referrer property 'crawlingSessionInfoList'. (NotNull: even if no loading, returns empty list)
     */
    public List<CrawlingSessionInfo> getCrawlingSessionInfoList() {
        if (_crawlingSessionInfoList == null) { _crawlingSessionInfoList = newReferrerList(); }
        return _crawlingSessionInfoList;
    }

    /**
     * [set] CRAWLING_SESSION_INFO by CRAWLING_SESSION_ID, named 'crawlingSessionInfoList'.
     * @param crawlingSessionInfoList The entity list of referrer property 'crawlingSessionInfoList'. (NullAllowed)
     */
    public void setCrawlingSessionInfoList(List<CrawlingSessionInfo> crawlingSessionInfoList) {
        _crawlingSessionInfoList = crawlingSessionInfoList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsCrawlingSession) {
            BsCrawlingSession other = (BsCrawlingSession)obj;
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
        StringBuilder sb = new StringBuilder();
        if (_crawlingSessionInfoList != null) { for (CrawlingSessionInfo et : _crawlingSessionInfoList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "crawlingSessionInfoList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_sessionId));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_expiredTime));
        sb.append(dm).append(xfND(_createdTime));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_crawlingSessionInfoList != null && !_crawlingSessionInfoList.isEmpty())
        { sb.append(dm).append("crawlingSessionInfoList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public CrawlingSession clone() {
        return (CrawlingSession)super.clone();
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
     * [get] SESSION_ID: {NotNull, VARCHAR(20)} <br>
     * @return The value of the column 'SESSION_ID'. (basically NotNull if selected: for the constraint)
     */
    public String getSessionId() {
        checkSpecifiedProperty("sessionId");
        return _sessionId;
    }

    /**
     * [set] SESSION_ID: {NotNull, VARCHAR(20)} <br>
     * @param sessionId The value of the column 'SESSION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSessionId(String sessionId) {
        registerModifiedProperty("sessionId");
        _sessionId = sessionId;
    }

    /**
     * [get] NAME: {IX+, VARCHAR(20)} <br>
     * @return The value of the column 'NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return _name;
    }

    /**
     * [set] NAME: {IX+, VARCHAR(20)} <br>
     * @param name The value of the column 'NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
    }

    /**
     * [get] EXPIRED_TIME: {TIMESTAMP(23, 10)} <br>
     * @return The value of the column 'EXPIRED_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getExpiredTime() {
        checkSpecifiedProperty("expiredTime");
        return _expiredTime;
    }

    /**
     * [set] EXPIRED_TIME: {TIMESTAMP(23, 10)} <br>
     * @param expiredTime The value of the column 'EXPIRED_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExpiredTime(java.time.LocalDateTime expiredTime) {
        registerModifiedProperty("expiredTime");
        _expiredTime = expiredTime;
    }

    /**
     * [get] CREATED_TIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @return The value of the column 'CREATED_TIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getCreatedTime() {
        checkSpecifiedProperty("createdTime");
        return _createdTime;
    }

    /**
     * [set] CREATED_TIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @param createdTime The value of the column 'CREATED_TIME'. (basically NotNull if update: for the constraint)
     */
    public void setCreatedTime(java.time.LocalDateTime createdTime) {
        registerModifiedProperty("createdTime");
        _createdTime = createdTime;
    }
}
