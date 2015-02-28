package org.codelibs.fess.db.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.codelibs.fess.db.allcommon.DBMetaInstanceHandler;
import org.codelibs.fess.db.allcommon.CDef;
import org.codelibs.fess.db.exentity.*;

/**
 * The entity of SEARCH_LOG as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ID
 * 
 * [column]
 *     ID, SEARCH_WORD, REQUESTED_TIME, RESPONSE_TIME, HIT_COUNT, QUERY_OFFSET, QUERY_PAGE_SIZE, USER_AGENT, REFERER, CLIENT_IP, USER_SESSION_ID, ACCESS_TYPE, USER_ID
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
 *     USER_INFO
 * 
 * [referrer table]
 *     CLICK_LOG, SEARCH_FIELD_LOG
 * 
 * [foreign property]
 *     userInfo
 * 
 * [referrer property]
 *     clickLogList, searchFieldLogList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long id = entity.getId();
 * String searchWord = entity.getSearchWord();
 * java.time.LocalDateTime requestedTime = entity.getRequestedTime();
 * Integer responseTime = entity.getResponseTime();
 * Long hitCount = entity.getHitCount();
 * Integer queryOffset = entity.getQueryOffset();
 * Integer queryPageSize = entity.getQueryPageSize();
 * String userAgent = entity.getUserAgent();
 * String referer = entity.getReferer();
 * String clientIp = entity.getClientIp();
 * String userSessionId = entity.getUserSessionId();
 * String accessType = entity.getAccessType();
 * Long userId = entity.getUserId();
 * entity.setId(id);
 * entity.setSearchWord(searchWord);
 * entity.setRequestedTime(requestedTime);
 * entity.setResponseTime(responseTime);
 * entity.setHitCount(hitCount);
 * entity.setQueryOffset(queryOffset);
 * entity.setQueryPageSize(queryPageSize);
 * entity.setUserAgent(userAgent);
 * entity.setReferer(referer);
 * entity.setClientIp(clientIp);
 * entity.setUserSessionId(userSessionId);
 * entity.setAccessType(accessType);
 * entity.setUserId(userId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSearchLog extends AbstractEntity implements DomainEntity {

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

    /** SEARCH_WORD: {TEXT(65535)} */
    protected String _searchWord;

    /** REQUESTED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} */
    protected java.time.LocalDateTime _requestedTime;

    /** RESPONSE_TIME: {NotNull, INT(10)} */
    protected Integer _responseTime;

    /** HIT_COUNT: {NotNull, BIGINT(19)} */
    protected Long _hitCount;

    /** QUERY_OFFSET: {NotNull, INT(10)} */
    protected Integer _queryOffset;

    /** QUERY_PAGE_SIZE: {NotNull, INT(10)} */
    protected Integer _queryPageSize;

    /** USER_AGENT: {VARCHAR(255)} */
    protected String _userAgent;

    /** REFERER: {TEXT(65535)} */
    protected String _referer;

    /** CLIENT_IP: {VARCHAR(50)} */
    protected String _clientIp;

    /** USER_SESSION_ID: {VARCHAR(100)} */
    protected String _userSessionId;

    /** ACCESS_TYPE: {NotNull, VARCHAR(1), classification=AccessType} */
    protected String _accessType;

    /** USER_ID: {IX, BIGINT(19), FK to USER_INFO} */
    protected Long _userId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SEARCH_LOG";
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
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of accessType as the classification of AccessType. <br>
     * ACCESS_TYPE: {NotNull, VARCHAR(1), classification=AccessType} <br>
     * Access Type
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.AccessType getAccessTypeAsAccessType() {
        return CDef.AccessType.codeOf(getAccessType());
    }

    /**
     * Set the value of accessType as the classification of AccessType. <br>
     * ACCESS_TYPE: {NotNull, VARCHAR(1), classification=AccessType} <br>
     * Access Type
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setAccessTypeAsAccessType(CDef.AccessType cdef) {
        setAccessType(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of accessType as Web (W). <br>
     * Web: Web
     */
    public void setAccessType_Web() {
        setAccessTypeAsAccessType(CDef.AccessType.Web);
    }

    /**
     * Set the value of accessType as Xml (X). <br>
     * Xml: Xml
     */
    public void setAccessType_Xml() {
        setAccessTypeAsAccessType(CDef.AccessType.Xml);
    }

    /**
     * Set the value of accessType as Json (J). <br>
     * Json: Json
     */
    public void setAccessType_Json() {
        setAccessTypeAsAccessType(CDef.AccessType.Json);
    }

    /**
     * Set the value of accessType as Others (O). <br>
     * Others: Others
     */
    public void setAccessType_Others() {
        setAccessTypeAsAccessType(CDef.AccessType.Others);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of accessType Web? <br>
     * Web: Web
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAccessTypeWeb() {
        CDef.AccessType cdef = getAccessTypeAsAccessType();
        return cdef != null ? cdef.equals(CDef.AccessType.Web) : false;
    }

    /**
     * Is the value of accessType Xml? <br>
     * Xml: Xml
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAccessTypeXml() {
        CDef.AccessType cdef = getAccessTypeAsAccessType();
        return cdef != null ? cdef.equals(CDef.AccessType.Xml) : false;
    }

    /**
     * Is the value of accessType Json? <br>
     * Json: Json
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAccessTypeJson() {
        CDef.AccessType cdef = getAccessTypeAsAccessType();
        return cdef != null ? cdef.equals(CDef.AccessType.Json) : false;
    }

    /**
     * Is the value of accessType Others? <br>
     * Others: Others
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAccessTypeOthers() {
        CDef.AccessType cdef = getAccessTypeAsAccessType();
        return cdef != null ? cdef.equals(CDef.AccessType.Others) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'accessType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getAccessTypeName() {
        CDef.AccessType cdef = getAccessTypeAsAccessType();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** USER_INFO by my USER_ID, named 'userInfo'. */
    protected OptionalEntity<UserInfo> _userInfo;

    /**
     * [get] USER_INFO by my USER_ID, named 'userInfo'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'userInfo'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<UserInfo> getUserInfo() {
        if (_userInfo == null) { _userInfo = OptionalEntity.relationEmpty(this, "userInfo"); }
        return _userInfo;
    }

    /**
     * [set] USER_INFO by my USER_ID, named 'userInfo'.
     * @param userInfo The entity of foreign property 'userInfo'. (NullAllowed)
     */
    public void setUserInfo(OptionalEntity<UserInfo> userInfo) {
        _userInfo = userInfo;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** CLICK_LOG by SEARCH_ID, named 'clickLogList'. */
    protected List<ClickLog> _clickLogList;

    /**
     * [get] CLICK_LOG by SEARCH_ID, named 'clickLogList'.
     * @return The entity list of referrer property 'clickLogList'. (NotNull: even if no loading, returns empty list)
     */
    public List<ClickLog> getClickLogList() {
        if (_clickLogList == null) { _clickLogList = newReferrerList(); }
        return _clickLogList;
    }

    /**
     * [set] CLICK_LOG by SEARCH_ID, named 'clickLogList'.
     * @param clickLogList The entity list of referrer property 'clickLogList'. (NullAllowed)
     */
    public void setClickLogList(List<ClickLog> clickLogList) {
        _clickLogList = clickLogList;
    }

    /** SEARCH_FIELD_LOG by SEARCH_ID, named 'searchFieldLogList'. */
    protected List<SearchFieldLog> _searchFieldLogList;

    /**
     * [get] SEARCH_FIELD_LOG by SEARCH_ID, named 'searchFieldLogList'.
     * @return The entity list of referrer property 'searchFieldLogList'. (NotNull: even if no loading, returns empty list)
     */
    public List<SearchFieldLog> getSearchFieldLogList() {
        if (_searchFieldLogList == null) { _searchFieldLogList = newReferrerList(); }
        return _searchFieldLogList;
    }

    /**
     * [set] SEARCH_FIELD_LOG by SEARCH_ID, named 'searchFieldLogList'.
     * @param searchFieldLogList The entity list of referrer property 'searchFieldLogList'. (NullAllowed)
     */
    public void setSearchFieldLogList(List<SearchFieldLog> searchFieldLogList) {
        _searchFieldLogList = searchFieldLogList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSearchLog) {
            BsSearchLog other = (BsSearchLog)obj;
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
        if (_userInfo != null && _userInfo.isPresent())
        { sb.append(li).append(xbRDS(_userInfo, "userInfo")); }
        if (_clickLogList != null) { for (ClickLog et : _clickLogList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "clickLogList")); } } }
        if (_searchFieldLogList != null) { for (SearchFieldLog et : _searchFieldLogList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "searchFieldLogList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_searchWord));
        sb.append(dm).append(xfND(_requestedTime));
        sb.append(dm).append(xfND(_responseTime));
        sb.append(dm).append(xfND(_hitCount));
        sb.append(dm).append(xfND(_queryOffset));
        sb.append(dm).append(xfND(_queryPageSize));
        sb.append(dm).append(xfND(_userAgent));
        sb.append(dm).append(xfND(_referer));
        sb.append(dm).append(xfND(_clientIp));
        sb.append(dm).append(xfND(_userSessionId));
        sb.append(dm).append(xfND(_accessType));
        sb.append(dm).append(xfND(_userId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_userInfo != null && _userInfo.isPresent())
        { sb.append(dm).append("userInfo"); }
        if (_clickLogList != null && !_clickLogList.isEmpty())
        { sb.append(dm).append("clickLogList"); }
        if (_searchFieldLogList != null && !_searchFieldLogList.isEmpty())
        { sb.append(dm).append("searchFieldLogList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public SearchLog clone() {
        return (SearchLog)super.clone();
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
     * [get] SEARCH_WORD: {TEXT(65535)} <br>
     * @return The value of the column 'SEARCH_WORD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSearchWord() {
        checkSpecifiedProperty("searchWord");
        return _searchWord;
    }

    /**
     * [set] SEARCH_WORD: {TEXT(65535)} <br>
     * @param searchWord The value of the column 'SEARCH_WORD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSearchWord(String searchWord) {
        registerModifiedProperty("searchWord");
        _searchWord = searchWord;
    }

    /**
     * [get] REQUESTED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br>
     * @return The value of the column 'REQUESTED_TIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRequestedTime() {
        checkSpecifiedProperty("requestedTime");
        return _requestedTime;
    }

    /**
     * [set] REQUESTED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br>
     * @param requestedTime The value of the column 'REQUESTED_TIME'. (basically NotNull if update: for the constraint)
     */
    public void setRequestedTime(java.time.LocalDateTime requestedTime) {
        registerModifiedProperty("requestedTime");
        _requestedTime = requestedTime;
    }

    /**
     * [get] RESPONSE_TIME: {NotNull, INT(10)} <br>
     * @return The value of the column 'RESPONSE_TIME'. (basically NotNull if selected: for the constraint)
     */
    public Integer getResponseTime() {
        checkSpecifiedProperty("responseTime");
        return _responseTime;
    }

    /**
     * [set] RESPONSE_TIME: {NotNull, INT(10)} <br>
     * @param responseTime The value of the column 'RESPONSE_TIME'. (basically NotNull if update: for the constraint)
     */
    public void setResponseTime(Integer responseTime) {
        registerModifiedProperty("responseTime");
        _responseTime = responseTime;
    }

    /**
     * [get] HIT_COUNT: {NotNull, BIGINT(19)} <br>
     * @return The value of the column 'HIT_COUNT'. (basically NotNull if selected: for the constraint)
     */
    public Long getHitCount() {
        checkSpecifiedProperty("hitCount");
        return _hitCount;
    }

    /**
     * [set] HIT_COUNT: {NotNull, BIGINT(19)} <br>
     * @param hitCount The value of the column 'HIT_COUNT'. (basically NotNull if update: for the constraint)
     */
    public void setHitCount(Long hitCount) {
        registerModifiedProperty("hitCount");
        _hitCount = hitCount;
    }

    /**
     * [get] QUERY_OFFSET: {NotNull, INT(10)} <br>
     * @return The value of the column 'QUERY_OFFSET'. (basically NotNull if selected: for the constraint)
     */
    public Integer getQueryOffset() {
        checkSpecifiedProperty("queryOffset");
        return _queryOffset;
    }

    /**
     * [set] QUERY_OFFSET: {NotNull, INT(10)} <br>
     * @param queryOffset The value of the column 'QUERY_OFFSET'. (basically NotNull if update: for the constraint)
     */
    public void setQueryOffset(Integer queryOffset) {
        registerModifiedProperty("queryOffset");
        _queryOffset = queryOffset;
    }

    /**
     * [get] QUERY_PAGE_SIZE: {NotNull, INT(10)} <br>
     * @return The value of the column 'QUERY_PAGE_SIZE'. (basically NotNull if selected: for the constraint)
     */
    public Integer getQueryPageSize() {
        checkSpecifiedProperty("queryPageSize");
        return _queryPageSize;
    }

    /**
     * [set] QUERY_PAGE_SIZE: {NotNull, INT(10)} <br>
     * @param queryPageSize The value of the column 'QUERY_PAGE_SIZE'. (basically NotNull if update: for the constraint)
     */
    public void setQueryPageSize(Integer queryPageSize) {
        registerModifiedProperty("queryPageSize");
        _queryPageSize = queryPageSize;
    }

    /**
     * [get] USER_AGENT: {VARCHAR(255)} <br>
     * @return The value of the column 'USER_AGENT'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserAgent() {
        checkSpecifiedProperty("userAgent");
        return _userAgent;
    }

    /**
     * [set] USER_AGENT: {VARCHAR(255)} <br>
     * @param userAgent The value of the column 'USER_AGENT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserAgent(String userAgent) {
        registerModifiedProperty("userAgent");
        _userAgent = userAgent;
    }

    /**
     * [get] REFERER: {TEXT(65535)} <br>
     * @return The value of the column 'REFERER'. (NullAllowed even if selected: for no constraint)
     */
    public String getReferer() {
        checkSpecifiedProperty("referer");
        return _referer;
    }

    /**
     * [set] REFERER: {TEXT(65535)} <br>
     * @param referer The value of the column 'REFERER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReferer(String referer) {
        registerModifiedProperty("referer");
        _referer = referer;
    }

    /**
     * [get] CLIENT_IP: {VARCHAR(50)} <br>
     * @return The value of the column 'CLIENT_IP'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientIp() {
        checkSpecifiedProperty("clientIp");
        return _clientIp;
    }

    /**
     * [set] CLIENT_IP: {VARCHAR(50)} <br>
     * @param clientIp The value of the column 'CLIENT_IP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientIp(String clientIp) {
        registerModifiedProperty("clientIp");
        _clientIp = clientIp;
    }

    /**
     * [get] USER_SESSION_ID: {VARCHAR(100)} <br>
     * @return The value of the column 'USER_SESSION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserSessionId() {
        checkSpecifiedProperty("userSessionId");
        return _userSessionId;
    }

    /**
     * [set] USER_SESSION_ID: {VARCHAR(100)} <br>
     * @param userSessionId The value of the column 'USER_SESSION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserSessionId(String userSessionId) {
        registerModifiedProperty("userSessionId");
        _userSessionId = userSessionId;
    }

    /**
     * [get] ACCESS_TYPE: {NotNull, VARCHAR(1), classification=AccessType} <br>
     * @return The value of the column 'ACCESS_TYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getAccessType() {
        checkSpecifiedProperty("accessType");
        return _accessType;
    }

    /**
     * [set] ACCESS_TYPE: {NotNull, VARCHAR(1), classification=AccessType} <br>
     * @param accessType The value of the column 'ACCESS_TYPE'. (basically NotNull if update: for the constraint)
     */
    protected void setAccessType(String accessType) {
        checkClassificationCode("ACCESS_TYPE", CDef.DefMeta.AccessType, accessType);
        registerModifiedProperty("accessType");
        _accessType = accessType;
    }

    /**
     * [get] USER_ID: {IX, BIGINT(19), FK to USER_INFO} <br>
     * @return The value of the column 'USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] USER_ID: {IX, BIGINT(19), FK to USER_INFO} <br>
     * @param userId The value of the column 'USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserId(Long userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param accessType The value of the column 'ACCESS_TYPE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingAccessType(String accessType) {
        setAccessType(accessType);
    }
}
