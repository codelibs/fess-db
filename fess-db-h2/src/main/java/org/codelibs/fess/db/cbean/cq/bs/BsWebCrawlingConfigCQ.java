package org.codelibs.fess.db.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.codelibs.fess.db.cbean.cq.ciq.*;
import org.codelibs.fess.db.cbean.*;
import org.codelibs.fess.db.cbean.cq.*;

/**
 * The base condition-query of WEB_CRAWLING_CONFIG.
 * @author DBFlute(AutoGenerator)
 */
public class BsWebCrawlingConfigCQ extends AbstractBsWebCrawlingConfigCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WebCrawlingConfigCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWebCrawlingConfigCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WEB_CRAWLING_CONFIG) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WebCrawlingConfigCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WebCrawlingConfigCIQ xcreateCIQ() {
        WebCrawlingConfigCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WebCrawlingConfigCIQ xnewCIQ() {
        return new WebCrawlingConfigCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WEB_CRAWLING_CONFIG on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WebCrawlingConfigCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WebCrawlingConfigCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    public Map<String, RequestHeaderCQ> xdfgetId_ExistsReferrer_RequestHeaderList() { return xgetSQueMap("id_ExistsReferrer_RequestHeaderList"); }
    public String keepId_ExistsReferrer_RequestHeaderList(RequestHeaderCQ sq) { return xkeepSQue("id_ExistsReferrer_RequestHeaderList", sq); }

    public Map<String, WebAuthenticationCQ> xdfgetId_ExistsReferrer_WebAuthenticationList() { return xgetSQueMap("id_ExistsReferrer_WebAuthenticationList"); }
    public String keepId_ExistsReferrer_WebAuthenticationList(WebAuthenticationCQ sq) { return xkeepSQue("id_ExistsReferrer_WebAuthenticationList", sq); }

    public Map<String, WebConfigToLabelTypeMappingCQ> xdfgetId_ExistsReferrer_WebConfigToLabelTypeMappingList() { return xgetSQueMap("id_ExistsReferrer_WebConfigToLabelTypeMappingList"); }
    public String keepId_ExistsReferrer_WebConfigToLabelTypeMappingList(WebConfigToLabelTypeMappingCQ sq) { return xkeepSQue("id_ExistsReferrer_WebConfigToLabelTypeMappingList", sq); }

    public Map<String, WebConfigToRoleTypeMappingCQ> xdfgetId_ExistsReferrer_WebConfigToRoleTypeMappingList() { return xgetSQueMap("id_ExistsReferrer_WebConfigToRoleTypeMappingList"); }
    public String keepId_ExistsReferrer_WebConfigToRoleTypeMappingList(WebConfigToRoleTypeMappingCQ sq) { return xkeepSQue("id_ExistsReferrer_WebConfigToRoleTypeMappingList", sq); }

    public Map<String, RequestHeaderCQ> xdfgetId_NotExistsReferrer_RequestHeaderList() { return xgetSQueMap("id_NotExistsReferrer_RequestHeaderList"); }
    public String keepId_NotExistsReferrer_RequestHeaderList(RequestHeaderCQ sq) { return xkeepSQue("id_NotExistsReferrer_RequestHeaderList", sq); }

    public Map<String, WebAuthenticationCQ> xdfgetId_NotExistsReferrer_WebAuthenticationList() { return xgetSQueMap("id_NotExistsReferrer_WebAuthenticationList"); }
    public String keepId_NotExistsReferrer_WebAuthenticationList(WebAuthenticationCQ sq) { return xkeepSQue("id_NotExistsReferrer_WebAuthenticationList", sq); }

    public Map<String, WebConfigToLabelTypeMappingCQ> xdfgetId_NotExistsReferrer_WebConfigToLabelTypeMappingList() { return xgetSQueMap("id_NotExistsReferrer_WebConfigToLabelTypeMappingList"); }
    public String keepId_NotExistsReferrer_WebConfigToLabelTypeMappingList(WebConfigToLabelTypeMappingCQ sq) { return xkeepSQue("id_NotExistsReferrer_WebConfigToLabelTypeMappingList", sq); }

    public Map<String, WebConfigToRoleTypeMappingCQ> xdfgetId_NotExistsReferrer_WebConfigToRoleTypeMappingList() { return xgetSQueMap("id_NotExistsReferrer_WebConfigToRoleTypeMappingList"); }
    public String keepId_NotExistsReferrer_WebConfigToRoleTypeMappingList(WebConfigToRoleTypeMappingCQ sq) { return xkeepSQue("id_NotExistsReferrer_WebConfigToRoleTypeMappingList", sq); }

    public Map<String, RequestHeaderCQ> xdfgetId_SpecifyDerivedReferrer_RequestHeaderList() { return xgetSQueMap("id_SpecifyDerivedReferrer_RequestHeaderList"); }
    public String keepId_SpecifyDerivedReferrer_RequestHeaderList(RequestHeaderCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_RequestHeaderList", sq); }

    public Map<String, WebAuthenticationCQ> xdfgetId_SpecifyDerivedReferrer_WebAuthenticationList() { return xgetSQueMap("id_SpecifyDerivedReferrer_WebAuthenticationList"); }
    public String keepId_SpecifyDerivedReferrer_WebAuthenticationList(WebAuthenticationCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_WebAuthenticationList", sq); }

    public Map<String, WebConfigToLabelTypeMappingCQ> xdfgetId_SpecifyDerivedReferrer_WebConfigToLabelTypeMappingList() { return xgetSQueMap("id_SpecifyDerivedReferrer_WebConfigToLabelTypeMappingList"); }
    public String keepId_SpecifyDerivedReferrer_WebConfigToLabelTypeMappingList(WebConfigToLabelTypeMappingCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_WebConfigToLabelTypeMappingList", sq); }

    public Map<String, WebConfigToRoleTypeMappingCQ> xdfgetId_SpecifyDerivedReferrer_WebConfigToRoleTypeMappingList() { return xgetSQueMap("id_SpecifyDerivedReferrer_WebConfigToRoleTypeMappingList"); }
    public String keepId_SpecifyDerivedReferrer_WebConfigToRoleTypeMappingList(WebConfigToRoleTypeMappingCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_WebConfigToRoleTypeMappingList", sq); }

    public Map<String, RequestHeaderCQ> xdfgetId_QueryDerivedReferrer_RequestHeaderList() { return xgetSQueMap("id_QueryDerivedReferrer_RequestHeaderList"); }
    public String keepId_QueryDerivedReferrer_RequestHeaderList(RequestHeaderCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_RequestHeaderList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_RequestHeaderListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_RequestHeaderList"); }
    public String keepId_QueryDerivedReferrer_RequestHeaderListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_RequestHeaderList", pm); }

    public Map<String, WebAuthenticationCQ> xdfgetId_QueryDerivedReferrer_WebAuthenticationList() { return xgetSQueMap("id_QueryDerivedReferrer_WebAuthenticationList"); }
    public String keepId_QueryDerivedReferrer_WebAuthenticationList(WebAuthenticationCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_WebAuthenticationList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_WebAuthenticationListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_WebAuthenticationList"); }
    public String keepId_QueryDerivedReferrer_WebAuthenticationListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_WebAuthenticationList", pm); }

    public Map<String, WebConfigToLabelTypeMappingCQ> xdfgetId_QueryDerivedReferrer_WebConfigToLabelTypeMappingList() { return xgetSQueMap("id_QueryDerivedReferrer_WebConfigToLabelTypeMappingList"); }
    public String keepId_QueryDerivedReferrer_WebConfigToLabelTypeMappingList(WebConfigToLabelTypeMappingCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_WebConfigToLabelTypeMappingList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_WebConfigToLabelTypeMappingListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_WebConfigToLabelTypeMappingList"); }
    public String keepId_QueryDerivedReferrer_WebConfigToLabelTypeMappingListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_WebConfigToLabelTypeMappingList", pm); }

    public Map<String, WebConfigToRoleTypeMappingCQ> xdfgetId_QueryDerivedReferrer_WebConfigToRoleTypeMappingList() { return xgetSQueMap("id_QueryDerivedReferrer_WebConfigToRoleTypeMappingList"); }
    public String keepId_QueryDerivedReferrer_WebConfigToRoleTypeMappingList(WebConfigToRoleTypeMappingCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_WebConfigToRoleTypeMappingList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_WebConfigToRoleTypeMappingListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_WebConfigToRoleTypeMappingList"); }
    public String keepId_QueryDerivedReferrer_WebConfigToRoleTypeMappingListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_WebConfigToRoleTypeMappingList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

    protected ConditionValue _name;
    public ConditionValue xdfgetName()
    { if (_name == null) { _name = nCV(); }
      return _name; }
    protected ConditionValue xgetCValueName() { return xdfgetName(); }

    /** 
     * Add order-by as ascend. <br>
     * NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_Name_Asc() { regOBA("NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_Name_Desc() { regOBD("NAME"); return this; }

    protected ConditionValue _urls;
    public ConditionValue xdfgetUrls()
    { if (_urls == null) { _urls = nCV(); }
      return _urls; }
    protected ConditionValue xgetCValueUrls() { return xdfgetUrls(); }

    /** 
     * Add order-by as ascend. <br>
     * URLS: {NotNull, VARCHAR(4000)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_Urls_Asc() { regOBA("URLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * URLS: {NotNull, VARCHAR(4000)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_Urls_Desc() { regOBD("URLS"); return this; }

    protected ConditionValue _includedUrls;
    public ConditionValue xdfgetIncludedUrls()
    { if (_includedUrls == null) { _includedUrls = nCV(); }
      return _includedUrls; }
    protected ConditionValue xgetCValueIncludedUrls() { return xdfgetIncludedUrls(); }

    /** 
     * Add order-by as ascend. <br>
     * INCLUDED_URLS: {VARCHAR(4000)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_IncludedUrls_Asc() { regOBA("INCLUDED_URLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * INCLUDED_URLS: {VARCHAR(4000)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_IncludedUrls_Desc() { regOBD("INCLUDED_URLS"); return this; }

    protected ConditionValue _excludedUrls;
    public ConditionValue xdfgetExcludedUrls()
    { if (_excludedUrls == null) { _excludedUrls = nCV(); }
      return _excludedUrls; }
    protected ConditionValue xgetCValueExcludedUrls() { return xdfgetExcludedUrls(); }

    /** 
     * Add order-by as ascend. <br>
     * EXCLUDED_URLS: {VARCHAR(4000)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_ExcludedUrls_Asc() { regOBA("EXCLUDED_URLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXCLUDED_URLS: {VARCHAR(4000)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_ExcludedUrls_Desc() { regOBD("EXCLUDED_URLS"); return this; }

    protected ConditionValue _includedDocUrls;
    public ConditionValue xdfgetIncludedDocUrls()
    { if (_includedDocUrls == null) { _includedDocUrls = nCV(); }
      return _includedDocUrls; }
    protected ConditionValue xgetCValueIncludedDocUrls() { return xdfgetIncludedDocUrls(); }

    /** 
     * Add order-by as ascend. <br>
     * INCLUDED_DOC_URLS: {VARCHAR(4000)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_IncludedDocUrls_Asc() { regOBA("INCLUDED_DOC_URLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * INCLUDED_DOC_URLS: {VARCHAR(4000)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_IncludedDocUrls_Desc() { regOBD("INCLUDED_DOC_URLS"); return this; }

    protected ConditionValue _excludedDocUrls;
    public ConditionValue xdfgetExcludedDocUrls()
    { if (_excludedDocUrls == null) { _excludedDocUrls = nCV(); }
      return _excludedDocUrls; }
    protected ConditionValue xgetCValueExcludedDocUrls() { return xdfgetExcludedDocUrls(); }

    /** 
     * Add order-by as ascend. <br>
     * EXCLUDED_DOC_URLS: {VARCHAR(4000)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_ExcludedDocUrls_Asc() { regOBA("EXCLUDED_DOC_URLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXCLUDED_DOC_URLS: {VARCHAR(4000)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_ExcludedDocUrls_Desc() { regOBD("EXCLUDED_DOC_URLS"); return this; }

    protected ConditionValue _configParameter;
    public ConditionValue xdfgetConfigParameter()
    { if (_configParameter == null) { _configParameter = nCV(); }
      return _configParameter; }
    protected ConditionValue xgetCValueConfigParameter() { return xdfgetConfigParameter(); }

    /** 
     * Add order-by as ascend. <br>
     * CONFIG_PARAMETER: {VARCHAR(4000)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_ConfigParameter_Asc() { regOBA("CONFIG_PARAMETER"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONFIG_PARAMETER: {VARCHAR(4000)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_ConfigParameter_Desc() { regOBD("CONFIG_PARAMETER"); return this; }

    protected ConditionValue _depth;
    public ConditionValue xdfgetDepth()
    { if (_depth == null) { _depth = nCV(); }
      return _depth; }
    protected ConditionValue xgetCValueDepth() { return xdfgetDepth(); }

    /** 
     * Add order-by as ascend. <br>
     * DEPTH: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_Depth_Asc() { regOBA("DEPTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPTH: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_Depth_Desc() { regOBD("DEPTH"); return this; }

    protected ConditionValue _maxAccessCount;
    public ConditionValue xdfgetMaxAccessCount()
    { if (_maxAccessCount == null) { _maxAccessCount = nCV(); }
      return _maxAccessCount; }
    protected ConditionValue xgetCValueMaxAccessCount() { return xdfgetMaxAccessCount(); }

    /** 
     * Add order-by as ascend. <br>
     * MAX_ACCESS_COUNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_MaxAccessCount_Asc() { regOBA("MAX_ACCESS_COUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAX_ACCESS_COUNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_MaxAccessCount_Desc() { regOBD("MAX_ACCESS_COUNT"); return this; }

    protected ConditionValue _userAgent;
    public ConditionValue xdfgetUserAgent()
    { if (_userAgent == null) { _userAgent = nCV(); }
      return _userAgent; }
    protected ConditionValue xgetCValueUserAgent() { return xdfgetUserAgent(); }

    /** 
     * Add order-by as ascend. <br>
     * USER_AGENT: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_UserAgent_Asc() { regOBA("USER_AGENT"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_AGENT: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_UserAgent_Desc() { regOBD("USER_AGENT"); return this; }

    protected ConditionValue _numOfThread;
    public ConditionValue xdfgetNumOfThread()
    { if (_numOfThread == null) { _numOfThread = nCV(); }
      return _numOfThread; }
    protected ConditionValue xgetCValueNumOfThread() { return xdfgetNumOfThread(); }

    /** 
     * Add order-by as ascend. <br>
     * NUM_OF_THREAD: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_NumOfThread_Asc() { regOBA("NUM_OF_THREAD"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUM_OF_THREAD: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_NumOfThread_Desc() { regOBD("NUM_OF_THREAD"); return this; }

    protected ConditionValue _intervalTime;
    public ConditionValue xdfgetIntervalTime()
    { if (_intervalTime == null) { _intervalTime = nCV(); }
      return _intervalTime; }
    protected ConditionValue xgetCValueIntervalTime() { return xdfgetIntervalTime(); }

    /** 
     * Add order-by as ascend. <br>
     * INTERVAL_TIME: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_IntervalTime_Asc() { regOBA("INTERVAL_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * INTERVAL_TIME: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_IntervalTime_Desc() { regOBD("INTERVAL_TIME"); return this; }

    protected ConditionValue _boost;
    public ConditionValue xdfgetBoost()
    { if (_boost == null) { _boost = nCV(); }
      return _boost; }
    protected ConditionValue xgetCValueBoost() { return xdfgetBoost(); }

    /** 
     * Add order-by as ascend. <br>
     * BOOST: {NotNull, DOUBLE(17)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_Boost_Asc() { regOBA("BOOST"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOOST: {NotNull, DOUBLE(17)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_Boost_Desc() { regOBD("BOOST"); return this; }

    protected ConditionValue _available;
    public ConditionValue xdfgetAvailable()
    { if (_available == null) { _available = nCV(); }
      return _available; }
    protected ConditionValue xgetCValueAvailable() { return xdfgetAvailable(); }

    /** 
     * Add order-by as ascend. <br>
     * AVAILABLE: {NotNull, VARCHAR(1)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_Available_Asc() { regOBA("AVAILABLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * AVAILABLE: {NotNull, VARCHAR(1)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_Available_Desc() { regOBD("AVAILABLE"); return this; }

    protected ConditionValue _sortOrder;
    public ConditionValue xdfgetSortOrder()
    { if (_sortOrder == null) { _sortOrder = nCV(); }
      return _sortOrder; }
    protected ConditionValue xgetCValueSortOrder() { return xdfgetSortOrder(); }

    /** 
     * Add order-by as ascend. <br>
     * SORT_ORDER: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_SortOrder_Asc() { regOBA("SORT_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORT_ORDER: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_SortOrder_Desc() { regOBD("SORT_ORDER"); return this; }

    protected ConditionValue _createdBy;
    public ConditionValue xdfgetCreatedBy()
    { if (_createdBy == null) { _createdBy = nCV(); }
      return _createdBy; }
    protected ConditionValue xgetCValueCreatedBy() { return xdfgetCreatedBy(); }

    /** 
     * Add order-by as ascend. <br>
     * CREATED_BY: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_CreatedBy_Asc() { regOBA("CREATED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATED_BY: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_CreatedBy_Desc() { regOBD("CREATED_BY"); return this; }

    protected ConditionValue _createdTime;
    public ConditionValue xdfgetCreatedTime()
    { if (_createdTime == null) { _createdTime = nCV(); }
      return _createdTime; }
    protected ConditionValue xgetCValueCreatedTime() { return xdfgetCreatedTime(); }

    /** 
     * Add order-by as ascend. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_CreatedTime_Asc() { regOBA("CREATED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_CreatedTime_Desc() { regOBD("CREATED_TIME"); return this; }

    protected ConditionValue _updatedBy;
    public ConditionValue xdfgetUpdatedBy()
    { if (_updatedBy == null) { _updatedBy = nCV(); }
      return _updatedBy; }
    protected ConditionValue xgetCValueUpdatedBy() { return xdfgetUpdatedBy(); }

    /** 
     * Add order-by as ascend. <br>
     * UPDATED_BY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_UpdatedBy_Asc() { regOBA("UPDATED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATED_BY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_UpdatedBy_Desc() { regOBD("UPDATED_BY"); return this; }

    protected ConditionValue _updatedTime;
    public ConditionValue xdfgetUpdatedTime()
    { if (_updatedTime == null) { _updatedTime = nCV(); }
      return _updatedTime; }
    protected ConditionValue xgetCValueUpdatedTime() { return xdfgetUpdatedTime(); }

    /** 
     * Add order-by as ascend. <br>
     * UPDATED_TIME: {TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_UpdatedTime_Asc() { regOBA("UPDATED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATED_TIME: {TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_UpdatedTime_Desc() { regOBD("UPDATED_TIME"); return this; }

    protected ConditionValue _deletedBy;
    public ConditionValue xdfgetDeletedBy()
    { if (_deletedBy == null) { _deletedBy = nCV(); }
      return _deletedBy; }
    protected ConditionValue xgetCValueDeletedBy() { return xdfgetDeletedBy(); }

    /** 
     * Add order-by as ascend. <br>
     * DELETED_BY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_DeletedBy_Asc() { regOBA("DELETED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELETED_BY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_DeletedBy_Desc() { regOBD("DELETED_BY"); return this; }

    protected ConditionValue _deletedTime;
    public ConditionValue xdfgetDeletedTime()
    { if (_deletedTime == null) { _deletedTime = nCV(); }
      return _deletedTime; }
    protected ConditionValue xgetCValueDeletedTime() { return xdfgetDeletedTime(); }

    /** 
     * Add order-by as ascend. <br>
     * DELETED_TIME: {TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_DeletedTime_Asc() { regOBA("DELETED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELETED_TIME: {TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_DeletedTime_Desc() { regOBD("DELETED_TIME"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /** 
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWebCrawlingConfigCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WebCrawlingConfigCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WebCrawlingConfigCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WebCrawlingConfigCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WebCrawlingConfigCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WebCrawlingConfigCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WebCrawlingConfigCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WebCrawlingConfigCQ> _myselfExistsMap;
    public Map<String, WebCrawlingConfigCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WebCrawlingConfigCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WebCrawlingConfigCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WebCrawlingConfigCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WebCrawlingConfigCB.class.getName(); }
    protected String xCQ() { return WebCrawlingConfigCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
