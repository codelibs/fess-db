package org.codelibs.fess.db.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.codelibs.fess.db.allcommon.DBMetaInstanceHandler;
import org.codelibs.fess.db.exentity.*;

/**
 * The entity of WEB_CRAWLING_CONFIG as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ID
 * 
 * [column]
 *     ID, NAME, URLS, INCLUDED_URLS, EXCLUDED_URLS, INCLUDED_DOC_URLS, EXCLUDED_DOC_URLS, CONFIG_PARAMETER, DEPTH, MAX_ACCESS_COUNT, USER_AGENT, NUM_OF_THREAD, INTERVAL_TIME, BOOST, AVAILABLE, SORT_ORDER, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME, DELETED_BY, DELETED_TIME, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     ID
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     
 * 
 * [referrer table]
 *     REQUEST_HEADER, WEB_AUTHENTICATION, WEB_CONFIG_TO_LABEL_TYPE_MAPPING, WEB_CONFIG_TO_ROLE_TYPE_MAPPING
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     requestHeaderList, webAuthenticationList, webConfigToLabelTypeMappingList, webConfigToRoleTypeMappingList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long id = entity.getId();
 * String name = entity.getName();
 * String urls = entity.getUrls();
 * String includedUrls = entity.getIncludedUrls();
 * String excludedUrls = entity.getExcludedUrls();
 * String includedDocUrls = entity.getIncludedDocUrls();
 * String excludedDocUrls = entity.getExcludedDocUrls();
 * String configParameter = entity.getConfigParameter();
 * Integer depth = entity.getDepth();
 * Long maxAccessCount = entity.getMaxAccessCount();
 * String userAgent = entity.getUserAgent();
 * Integer numOfThread = entity.getNumOfThread();
 * Integer intervalTime = entity.getIntervalTime();
 * java.math.BigDecimal boost = entity.getBoost();
 * String available = entity.getAvailable();
 * Integer sortOrder = entity.getSortOrder();
 * String createdBy = entity.getCreatedBy();
 * java.time.LocalDateTime createdTime = entity.getCreatedTime();
 * String updatedBy = entity.getUpdatedBy();
 * java.time.LocalDateTime updatedTime = entity.getUpdatedTime();
 * String deletedBy = entity.getDeletedBy();
 * java.time.LocalDateTime deletedTime = entity.getDeletedTime();
 * Integer versionNo = entity.getVersionNo();
 * entity.setId(id);
 * entity.setName(name);
 * entity.setUrls(urls);
 * entity.setIncludedUrls(includedUrls);
 * entity.setExcludedUrls(excludedUrls);
 * entity.setIncludedDocUrls(includedDocUrls);
 * entity.setExcludedDocUrls(excludedDocUrls);
 * entity.setConfigParameter(configParameter);
 * entity.setDepth(depth);
 * entity.setMaxAccessCount(maxAccessCount);
 * entity.setUserAgent(userAgent);
 * entity.setNumOfThread(numOfThread);
 * entity.setIntervalTime(intervalTime);
 * entity.setBoost(boost);
 * entity.setAvailable(available);
 * entity.setSortOrder(sortOrder);
 * entity.setCreatedBy(createdBy);
 * entity.setCreatedTime(createdTime);
 * entity.setUpdatedBy(updatedBy);
 * entity.setUpdatedTime(updatedTime);
 * entity.setDeletedBy(deletedBy);
 * entity.setDeletedTime(deletedTime);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWebCrawlingConfig extends AbstractEntity implements DomainEntity {

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

    /** NAME: {NotNull, VARCHAR(200)} */
    protected String _name;

    /** URLS: {NotNull, TEXT(65535)} */
    protected String _urls;

    /** INCLUDED_URLS: {TEXT(65535)} */
    protected String _includedUrls;

    /** EXCLUDED_URLS: {TEXT(65535)} */
    protected String _excludedUrls;

    /** INCLUDED_DOC_URLS: {TEXT(65535)} */
    protected String _includedDocUrls;

    /** EXCLUDED_DOC_URLS: {TEXT(65535)} */
    protected String _excludedDocUrls;

    /** CONFIG_PARAMETER: {TEXT(65535)} */
    protected String _configParameter;

    /** DEPTH: {INT(10)} */
    protected Integer _depth;

    /** MAX_ACCESS_COUNT: {BIGINT(19)} */
    protected Long _maxAccessCount;

    /** USER_AGENT: {NotNull, VARCHAR(200)} */
    protected String _userAgent;

    /** NUM_OF_THREAD: {NotNull, INT(10)} */
    protected Integer _numOfThread;

    /** INTERVAL_TIME: {NotNull, INT(10)} */
    protected Integer _intervalTime;

    /** BOOST: {NotNull, FLOAT(12)} */
    protected java.math.BigDecimal _boost;

    /** AVAILABLE: {NotNull, VARCHAR(1)} */
    protected String _available;

    /** SORT_ORDER: {NotNull, INT(10)} */
    protected Integer _sortOrder;

    /** CREATED_BY: {NotNull, VARCHAR(255)} */
    protected String _createdBy;

    /** CREATED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} */
    protected java.time.LocalDateTime _createdTime;

    /** UPDATED_BY: {VARCHAR(255)} */
    protected String _updatedBy;

    /** UPDATED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]} */
    protected java.time.LocalDateTime _updatedTime;

    /** DELETED_BY: {VARCHAR(255)} */
    protected String _deletedBy;

    /** DELETED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]} */
    protected java.time.LocalDateTime _deletedTime;

    /** VERSION_NO: {NotNull, INT(10)} */
    protected Integer _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WEB_CRAWLING_CONFIG";
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
    /** REQUEST_HEADER by WEB_CRAWLING_CONFIG_ID, named 'requestHeaderList'. */
    protected List<RequestHeader> _requestHeaderList;

    /**
     * [get] REQUEST_HEADER by WEB_CRAWLING_CONFIG_ID, named 'requestHeaderList'.
     * @return The entity list of referrer property 'requestHeaderList'. (NotNull: even if no loading, returns empty list)
     */
    public List<RequestHeader> getRequestHeaderList() {
        if (_requestHeaderList == null) { _requestHeaderList = newReferrerList(); }
        return _requestHeaderList;
    }

    /**
     * [set] REQUEST_HEADER by WEB_CRAWLING_CONFIG_ID, named 'requestHeaderList'.
     * @param requestHeaderList The entity list of referrer property 'requestHeaderList'. (NullAllowed)
     */
    public void setRequestHeaderList(List<RequestHeader> requestHeaderList) {
        _requestHeaderList = requestHeaderList;
    }

    /** WEB_AUTHENTICATION by WEB_CRAWLING_CONFIG_ID, named 'webAuthenticationList'. */
    protected List<WebAuthentication> _webAuthenticationList;

    /**
     * [get] WEB_AUTHENTICATION by WEB_CRAWLING_CONFIG_ID, named 'webAuthenticationList'.
     * @return The entity list of referrer property 'webAuthenticationList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WebAuthentication> getWebAuthenticationList() {
        if (_webAuthenticationList == null) { _webAuthenticationList = newReferrerList(); }
        return _webAuthenticationList;
    }

    /**
     * [set] WEB_AUTHENTICATION by WEB_CRAWLING_CONFIG_ID, named 'webAuthenticationList'.
     * @param webAuthenticationList The entity list of referrer property 'webAuthenticationList'. (NullAllowed)
     */
    public void setWebAuthenticationList(List<WebAuthentication> webAuthenticationList) {
        _webAuthenticationList = webAuthenticationList;
    }

    /** WEB_CONFIG_TO_LABEL_TYPE_MAPPING by WEB_CONFIG_ID, named 'webConfigToLabelTypeMappingList'. */
    protected List<WebConfigToLabelTypeMapping> _webConfigToLabelTypeMappingList;

    /**
     * [get] WEB_CONFIG_TO_LABEL_TYPE_MAPPING by WEB_CONFIG_ID, named 'webConfigToLabelTypeMappingList'.
     * @return The entity list of referrer property 'webConfigToLabelTypeMappingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WebConfigToLabelTypeMapping> getWebConfigToLabelTypeMappingList() {
        if (_webConfigToLabelTypeMappingList == null) { _webConfigToLabelTypeMappingList = newReferrerList(); }
        return _webConfigToLabelTypeMappingList;
    }

    /**
     * [set] WEB_CONFIG_TO_LABEL_TYPE_MAPPING by WEB_CONFIG_ID, named 'webConfigToLabelTypeMappingList'.
     * @param webConfigToLabelTypeMappingList The entity list of referrer property 'webConfigToLabelTypeMappingList'. (NullAllowed)
     */
    public void setWebConfigToLabelTypeMappingList(List<WebConfigToLabelTypeMapping> webConfigToLabelTypeMappingList) {
        _webConfigToLabelTypeMappingList = webConfigToLabelTypeMappingList;
    }

    /** WEB_CONFIG_TO_ROLE_TYPE_MAPPING by WEB_CONFIG_ID, named 'webConfigToRoleTypeMappingList'. */
    protected List<WebConfigToRoleTypeMapping> _webConfigToRoleTypeMappingList;

    /**
     * [get] WEB_CONFIG_TO_ROLE_TYPE_MAPPING by WEB_CONFIG_ID, named 'webConfigToRoleTypeMappingList'.
     * @return The entity list of referrer property 'webConfigToRoleTypeMappingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WebConfigToRoleTypeMapping> getWebConfigToRoleTypeMappingList() {
        if (_webConfigToRoleTypeMappingList == null) { _webConfigToRoleTypeMappingList = newReferrerList(); }
        return _webConfigToRoleTypeMappingList;
    }

    /**
     * [set] WEB_CONFIG_TO_ROLE_TYPE_MAPPING by WEB_CONFIG_ID, named 'webConfigToRoleTypeMappingList'.
     * @param webConfigToRoleTypeMappingList The entity list of referrer property 'webConfigToRoleTypeMappingList'. (NullAllowed)
     */
    public void setWebConfigToRoleTypeMappingList(List<WebConfigToRoleTypeMapping> webConfigToRoleTypeMappingList) {
        _webConfigToRoleTypeMappingList = webConfigToRoleTypeMappingList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWebCrawlingConfig) {
            BsWebCrawlingConfig other = (BsWebCrawlingConfig)obj;
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
        if (_requestHeaderList != null) { for (RequestHeader et : _requestHeaderList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "requestHeaderList")); } } }
        if (_webAuthenticationList != null) { for (WebAuthentication et : _webAuthenticationList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "webAuthenticationList")); } } }
        if (_webConfigToLabelTypeMappingList != null) { for (WebConfigToLabelTypeMapping et : _webConfigToLabelTypeMappingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "webConfigToLabelTypeMappingList")); } } }
        if (_webConfigToRoleTypeMappingList != null) { for (WebConfigToRoleTypeMapping et : _webConfigToRoleTypeMappingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "webConfigToRoleTypeMappingList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_urls));
        sb.append(dm).append(xfND(_includedUrls));
        sb.append(dm).append(xfND(_excludedUrls));
        sb.append(dm).append(xfND(_includedDocUrls));
        sb.append(dm).append(xfND(_excludedDocUrls));
        sb.append(dm).append(xfND(_configParameter));
        sb.append(dm).append(xfND(_depth));
        sb.append(dm).append(xfND(_maxAccessCount));
        sb.append(dm).append(xfND(_userAgent));
        sb.append(dm).append(xfND(_numOfThread));
        sb.append(dm).append(xfND(_intervalTime));
        sb.append(dm).append(xfND(_boost));
        sb.append(dm).append(xfND(_available));
        sb.append(dm).append(xfND(_sortOrder));
        sb.append(dm).append(xfND(_createdBy));
        sb.append(dm).append(xfND(_createdTime));
        sb.append(dm).append(xfND(_updatedBy));
        sb.append(dm).append(xfND(_updatedTime));
        sb.append(dm).append(xfND(_deletedBy));
        sb.append(dm).append(xfND(_deletedTime));
        sb.append(dm).append(xfND(_versionNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_requestHeaderList != null && !_requestHeaderList.isEmpty())
        { sb.append(dm).append("requestHeaderList"); }
        if (_webAuthenticationList != null && !_webAuthenticationList.isEmpty())
        { sb.append(dm).append("webAuthenticationList"); }
        if (_webConfigToLabelTypeMappingList != null && !_webConfigToLabelTypeMappingList.isEmpty())
        { sb.append(dm).append("webConfigToLabelTypeMappingList"); }
        if (_webConfigToRoleTypeMappingList != null && !_webConfigToRoleTypeMappingList.isEmpty())
        { sb.append(dm).append("webConfigToRoleTypeMappingList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WebCrawlingConfig clone() {
        return (WebCrawlingConfig)super.clone();
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
     * [get] NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return _name;
    }

    /**
     * [set] NAME: {NotNull, VARCHAR(200)} <br>
     * @param name The value of the column 'NAME'. (basically NotNull if update: for the constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
    }

    /**
     * [get] URLS: {NotNull, TEXT(65535)} <br>
     * @return The value of the column 'URLS'. (basically NotNull if selected: for the constraint)
     */
    public String getUrls() {
        checkSpecifiedProperty("urls");
        return _urls;
    }

    /**
     * [set] URLS: {NotNull, TEXT(65535)} <br>
     * @param urls The value of the column 'URLS'. (basically NotNull if update: for the constraint)
     */
    public void setUrls(String urls) {
        registerModifiedProperty("urls");
        _urls = urls;
    }

    /**
     * [get] INCLUDED_URLS: {TEXT(65535)} <br>
     * @return The value of the column 'INCLUDED_URLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getIncludedUrls() {
        checkSpecifiedProperty("includedUrls");
        return _includedUrls;
    }

    /**
     * [set] INCLUDED_URLS: {TEXT(65535)} <br>
     * @param includedUrls The value of the column 'INCLUDED_URLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIncludedUrls(String includedUrls) {
        registerModifiedProperty("includedUrls");
        _includedUrls = includedUrls;
    }

    /**
     * [get] EXCLUDED_URLS: {TEXT(65535)} <br>
     * @return The value of the column 'EXCLUDED_URLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getExcludedUrls() {
        checkSpecifiedProperty("excludedUrls");
        return _excludedUrls;
    }

    /**
     * [set] EXCLUDED_URLS: {TEXT(65535)} <br>
     * @param excludedUrls The value of the column 'EXCLUDED_URLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExcludedUrls(String excludedUrls) {
        registerModifiedProperty("excludedUrls");
        _excludedUrls = excludedUrls;
    }

    /**
     * [get] INCLUDED_DOC_URLS: {TEXT(65535)} <br>
     * @return The value of the column 'INCLUDED_DOC_URLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getIncludedDocUrls() {
        checkSpecifiedProperty("includedDocUrls");
        return _includedDocUrls;
    }

    /**
     * [set] INCLUDED_DOC_URLS: {TEXT(65535)} <br>
     * @param includedDocUrls The value of the column 'INCLUDED_DOC_URLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIncludedDocUrls(String includedDocUrls) {
        registerModifiedProperty("includedDocUrls");
        _includedDocUrls = includedDocUrls;
    }

    /**
     * [get] EXCLUDED_DOC_URLS: {TEXT(65535)} <br>
     * @return The value of the column 'EXCLUDED_DOC_URLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getExcludedDocUrls() {
        checkSpecifiedProperty("excludedDocUrls");
        return _excludedDocUrls;
    }

    /**
     * [set] EXCLUDED_DOC_URLS: {TEXT(65535)} <br>
     * @param excludedDocUrls The value of the column 'EXCLUDED_DOC_URLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExcludedDocUrls(String excludedDocUrls) {
        registerModifiedProperty("excludedDocUrls");
        _excludedDocUrls = excludedDocUrls;
    }

    /**
     * [get] CONFIG_PARAMETER: {TEXT(65535)} <br>
     * @return The value of the column 'CONFIG_PARAMETER'. (NullAllowed even if selected: for no constraint)
     */
    public String getConfigParameter() {
        checkSpecifiedProperty("configParameter");
        return _configParameter;
    }

    /**
     * [set] CONFIG_PARAMETER: {TEXT(65535)} <br>
     * @param configParameter The value of the column 'CONFIG_PARAMETER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setConfigParameter(String configParameter) {
        registerModifiedProperty("configParameter");
        _configParameter = configParameter;
    }

    /**
     * [get] DEPTH: {INT(10)} <br>
     * @return The value of the column 'DEPTH'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getDepth() {
        checkSpecifiedProperty("depth");
        return _depth;
    }

    /**
     * [set] DEPTH: {INT(10)} <br>
     * @param depth The value of the column 'DEPTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepth(Integer depth) {
        registerModifiedProperty("depth");
        _depth = depth;
    }

    /**
     * [get] MAX_ACCESS_COUNT: {BIGINT(19)} <br>
     * @return The value of the column 'MAX_ACCESS_COUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMaxAccessCount() {
        checkSpecifiedProperty("maxAccessCount");
        return _maxAccessCount;
    }

    /**
     * [set] MAX_ACCESS_COUNT: {BIGINT(19)} <br>
     * @param maxAccessCount The value of the column 'MAX_ACCESS_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMaxAccessCount(Long maxAccessCount) {
        registerModifiedProperty("maxAccessCount");
        _maxAccessCount = maxAccessCount;
    }

    /**
     * [get] USER_AGENT: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'USER_AGENT'. (basically NotNull if selected: for the constraint)
     */
    public String getUserAgent() {
        checkSpecifiedProperty("userAgent");
        return _userAgent;
    }

    /**
     * [set] USER_AGENT: {NotNull, VARCHAR(200)} <br>
     * @param userAgent The value of the column 'USER_AGENT'. (basically NotNull if update: for the constraint)
     */
    public void setUserAgent(String userAgent) {
        registerModifiedProperty("userAgent");
        _userAgent = userAgent;
    }

    /**
     * [get] NUM_OF_THREAD: {NotNull, INT(10)} <br>
     * @return The value of the column 'NUM_OF_THREAD'. (basically NotNull if selected: for the constraint)
     */
    public Integer getNumOfThread() {
        checkSpecifiedProperty("numOfThread");
        return _numOfThread;
    }

    /**
     * [set] NUM_OF_THREAD: {NotNull, INT(10)} <br>
     * @param numOfThread The value of the column 'NUM_OF_THREAD'. (basically NotNull if update: for the constraint)
     */
    public void setNumOfThread(Integer numOfThread) {
        registerModifiedProperty("numOfThread");
        _numOfThread = numOfThread;
    }

    /**
     * [get] INTERVAL_TIME: {NotNull, INT(10)} <br>
     * @return The value of the column 'INTERVAL_TIME'. (basically NotNull if selected: for the constraint)
     */
    public Integer getIntervalTime() {
        checkSpecifiedProperty("intervalTime");
        return _intervalTime;
    }

    /**
     * [set] INTERVAL_TIME: {NotNull, INT(10)} <br>
     * @param intervalTime The value of the column 'INTERVAL_TIME'. (basically NotNull if update: for the constraint)
     */
    public void setIntervalTime(Integer intervalTime) {
        registerModifiedProperty("intervalTime");
        _intervalTime = intervalTime;
    }

    /**
     * [get] BOOST: {NotNull, FLOAT(12)} <br>
     * @return The value of the column 'BOOST'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getBoost() {
        checkSpecifiedProperty("boost");
        return _boost;
    }

    /**
     * [set] BOOST: {NotNull, FLOAT(12)} <br>
     * @param boost The value of the column 'BOOST'. (basically NotNull if update: for the constraint)
     */
    public void setBoost(java.math.BigDecimal boost) {
        registerModifiedProperty("boost");
        _boost = boost;
    }

    /**
     * [get] AVAILABLE: {NotNull, VARCHAR(1)} <br>
     * @return The value of the column 'AVAILABLE'. (basically NotNull if selected: for the constraint)
     */
    public String getAvailable() {
        checkSpecifiedProperty("available");
        return _available;
    }

    /**
     * [set] AVAILABLE: {NotNull, VARCHAR(1)} <br>
     * @param available The value of the column 'AVAILABLE'. (basically NotNull if update: for the constraint)
     */
    public void setAvailable(String available) {
        registerModifiedProperty("available");
        _available = available;
    }

    /**
     * [get] SORT_ORDER: {NotNull, INT(10)} <br>
     * @return The value of the column 'SORT_ORDER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSortOrder() {
        checkSpecifiedProperty("sortOrder");
        return _sortOrder;
    }

    /**
     * [set] SORT_ORDER: {NotNull, INT(10)} <br>
     * @param sortOrder The value of the column 'SORT_ORDER'. (basically NotNull if update: for the constraint)
     */
    public void setSortOrder(Integer sortOrder) {
        registerModifiedProperty("sortOrder");
        _sortOrder = sortOrder;
    }

    /**
     * [get] CREATED_BY: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'CREATED_BY'. (basically NotNull if selected: for the constraint)
     */
    public String getCreatedBy() {
        checkSpecifiedProperty("createdBy");
        return _createdBy;
    }

    /**
     * [set] CREATED_BY: {NotNull, VARCHAR(255)} <br>
     * @param createdBy The value of the column 'CREATED_BY'. (basically NotNull if update: for the constraint)
     */
    public void setCreatedBy(String createdBy) {
        registerModifiedProperty("createdBy");
        _createdBy = createdBy;
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

    /**
     * [get] UPDATED_BY: {VARCHAR(255)} <br>
     * @return The value of the column 'UPDATED_BY'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdatedBy() {
        checkSpecifiedProperty("updatedBy");
        return _updatedBy;
    }

    /**
     * [set] UPDATED_BY: {VARCHAR(255)} <br>
     * @param updatedBy The value of the column 'UPDATED_BY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdatedBy(String updatedBy) {
        registerModifiedProperty("updatedBy");
        _updatedBy = updatedBy;
    }

    /**
     * [get] UPDATED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]} <br>
     * @return The value of the column 'UPDATED_TIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdatedTime() {
        checkSpecifiedProperty("updatedTime");
        return _updatedTime;
    }

    /**
     * [set] UPDATED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]} <br>
     * @param updatedTime The value of the column 'UPDATED_TIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdatedTime(java.time.LocalDateTime updatedTime) {
        registerModifiedProperty("updatedTime");
        _updatedTime = updatedTime;
    }

    /**
     * [get] DELETED_BY: {VARCHAR(255)} <br>
     * @return The value of the column 'DELETED_BY'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeletedBy() {
        checkSpecifiedProperty("deletedBy");
        return _deletedBy;
    }

    /**
     * [set] DELETED_BY: {VARCHAR(255)} <br>
     * @param deletedBy The value of the column 'DELETED_BY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeletedBy(String deletedBy) {
        registerModifiedProperty("deletedBy");
        _deletedBy = deletedBy;
    }

    /**
     * [get] DELETED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]} <br>
     * @return The value of the column 'DELETED_TIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getDeletedTime() {
        checkSpecifiedProperty("deletedTime");
        return _deletedTime;
    }

    /**
     * [set] DELETED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]} <br>
     * @param deletedTime The value of the column 'DELETED_TIME'. (basically NotNull if update: for the constraint)
     */
    public void setDeletedTime(java.time.LocalDateTime deletedTime) {
        registerModifiedProperty("deletedTime");
        _deletedTime = deletedTime;
    }

    /**
     * [get] VERSION_NO: {NotNull, INT(10)} <br>
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Integer getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, INT(10)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Integer versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }
}
