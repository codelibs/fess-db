package org.codelibs.fess.db.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.codelibs.fess.db.allcommon.DBMetaInstanceHandler;
import org.codelibs.fess.db.exentity.*;

/**
 * The entity of CRAWLING_SESSION_INFO as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ID
 * 
 * [column]
 *     ID, CRAWLING_SESSION_ID, ID_KEY, VALUE, CREATED_TIME
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
 *     CRAWLING_SESSION
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     crawlingSession
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long id = entity.getId();
 * Long crawlingSessionId = entity.getCrawlingSessionId();
 * String idKey = entity.getIdKey();
 * String value = entity.getValue();
 * java.time.LocalDateTime createdTime = entity.getCreatedTime();
 * entity.setId(id);
 * entity.setCrawlingSessionId(crawlingSessionId);
 * entity.setIdKey(idKey);
 * entity.setValue(value);
 * entity.setCreatedTime(createdTime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsCrawlingSessionInfo extends AbstractEntity implements DomainEntity {

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

    /** CRAWLING_SESSION_ID: {IX, NotNull, BIGINT(19), FK to CRAWLING_SESSION} */
    protected Long _crawlingSessionId;

    /** ID_KEY: {NotNull, VARCHAR(20)} */
    protected String _idKey;

    /** VALUE: {NotNull, VARCHAR(100)} */
    protected String _value;

    /** CREATED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} */
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
        return "CRAWLING_SESSION_INFO";
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
    /** CRAWLING_SESSION by my CRAWLING_SESSION_ID, named 'crawlingSession'. */
    protected OptionalEntity<CrawlingSession> _crawlingSession;

    /**
     * [get] CRAWLING_SESSION by my CRAWLING_SESSION_ID, named 'crawlingSession'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'crawlingSession'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<CrawlingSession> getCrawlingSession() {
        if (_crawlingSession == null) { _crawlingSession = OptionalEntity.relationEmpty(this, "crawlingSession"); }
        return _crawlingSession;
    }

    /**
     * [set] CRAWLING_SESSION by my CRAWLING_SESSION_ID, named 'crawlingSession'.
     * @param crawlingSession The entity of foreign property 'crawlingSession'. (NullAllowed)
     */
    public void setCrawlingSession(OptionalEntity<CrawlingSession> crawlingSession) {
        _crawlingSession = crawlingSession;
    }

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
        if (obj instanceof BsCrawlingSessionInfo) {
            BsCrawlingSessionInfo other = (BsCrawlingSessionInfo)obj;
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
        if (_crawlingSession != null && _crawlingSession.isPresent())
        { sb.append(li).append(xbRDS(_crawlingSession, "crawlingSession")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_crawlingSessionId));
        sb.append(dm).append(xfND(_idKey));
        sb.append(dm).append(xfND(_value));
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
        if (_crawlingSession != null && _crawlingSession.isPresent())
        { sb.append(dm).append("crawlingSession"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public CrawlingSessionInfo clone() {
        return (CrawlingSessionInfo)super.clone();
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
     * [get] CRAWLING_SESSION_ID: {IX, NotNull, BIGINT(19), FK to CRAWLING_SESSION} <br>
     * @return The value of the column 'CRAWLING_SESSION_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCrawlingSessionId() {
        checkSpecifiedProperty("crawlingSessionId");
        return _crawlingSessionId;
    }

    /**
     * [set] CRAWLING_SESSION_ID: {IX, NotNull, BIGINT(19), FK to CRAWLING_SESSION} <br>
     * @param crawlingSessionId The value of the column 'CRAWLING_SESSION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCrawlingSessionId(Long crawlingSessionId) {
        registerModifiedProperty("crawlingSessionId");
        _crawlingSessionId = crawlingSessionId;
    }

    /**
     * [get] ID_KEY: {NotNull, VARCHAR(20)} <br>
     * @return The value of the column 'ID_KEY'. (basically NotNull if selected: for the constraint)
     */
    public String getIdKey() {
        checkSpecifiedProperty("idKey");
        return _idKey;
    }

    /**
     * [set] ID_KEY: {NotNull, VARCHAR(20)} <br>
     * @param idKey The value of the column 'ID_KEY'. (basically NotNull if update: for the constraint)
     */
    public void setIdKey(String idKey) {
        registerModifiedProperty("idKey");
        _idKey = idKey;
    }

    /**
     * [get] VALUE: {NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'VALUE'. (basically NotNull if selected: for the constraint)
     */
    public String getValue() {
        checkSpecifiedProperty("value");
        return _value;
    }

    /**
     * [set] VALUE: {NotNull, VARCHAR(100)} <br>
     * @param value The value of the column 'VALUE'. (basically NotNull if update: for the constraint)
     */
    public void setValue(String value) {
        registerModifiedProperty("value");
        _value = value;
    }

    /**
     * [get] CREATED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br>
     * @return The value of the column 'CREATED_TIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getCreatedTime() {
        checkSpecifiedProperty("createdTime");
        return _createdTime;
    }

    /**
     * [set] CREATED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br>
     * @param createdTime The value of the column 'CREATED_TIME'. (basically NotNull if update: for the constraint)
     */
    public void setCreatedTime(java.time.LocalDateTime createdTime) {
        registerModifiedProperty("createdTime");
        _createdTime = createdTime;
    }
}
