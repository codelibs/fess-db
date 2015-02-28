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
 * The base condition-query of SEARCH_LOG.
 * @author DBFlute(AutoGenerator)
 */
public class BsSearchLogCQ extends AbstractBsSearchLogCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SearchLogCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSearchLogCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from SEARCH_LOG) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SearchLogCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SearchLogCIQ xcreateCIQ() {
        SearchLogCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SearchLogCIQ xnewCIQ() {
        return new SearchLogCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join SEARCH_LOG on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SearchLogCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SearchLogCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    public Map<String, ClickLogCQ> xdfgetId_ExistsReferrer_ClickLogList() { return xgetSQueMap("id_ExistsReferrer_ClickLogList"); }
    public String keepId_ExistsReferrer_ClickLogList(ClickLogCQ sq) { return xkeepSQue("id_ExistsReferrer_ClickLogList", sq); }

    public Map<String, SearchFieldLogCQ> xdfgetId_ExistsReferrer_SearchFieldLogList() { return xgetSQueMap("id_ExistsReferrer_SearchFieldLogList"); }
    public String keepId_ExistsReferrer_SearchFieldLogList(SearchFieldLogCQ sq) { return xkeepSQue("id_ExistsReferrer_SearchFieldLogList", sq); }

    public Map<String, ClickLogCQ> xdfgetId_NotExistsReferrer_ClickLogList() { return xgetSQueMap("id_NotExistsReferrer_ClickLogList"); }
    public String keepId_NotExistsReferrer_ClickLogList(ClickLogCQ sq) { return xkeepSQue("id_NotExistsReferrer_ClickLogList", sq); }

    public Map<String, SearchFieldLogCQ> xdfgetId_NotExistsReferrer_SearchFieldLogList() { return xgetSQueMap("id_NotExistsReferrer_SearchFieldLogList"); }
    public String keepId_NotExistsReferrer_SearchFieldLogList(SearchFieldLogCQ sq) { return xkeepSQue("id_NotExistsReferrer_SearchFieldLogList", sq); }

    public Map<String, ClickLogCQ> xdfgetId_SpecifyDerivedReferrer_ClickLogList() { return xgetSQueMap("id_SpecifyDerivedReferrer_ClickLogList"); }
    public String keepId_SpecifyDerivedReferrer_ClickLogList(ClickLogCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_ClickLogList", sq); }

    public Map<String, SearchFieldLogCQ> xdfgetId_SpecifyDerivedReferrer_SearchFieldLogList() { return xgetSQueMap("id_SpecifyDerivedReferrer_SearchFieldLogList"); }
    public String keepId_SpecifyDerivedReferrer_SearchFieldLogList(SearchFieldLogCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_SearchFieldLogList", sq); }

    public Map<String, ClickLogCQ> xdfgetId_QueryDerivedReferrer_ClickLogList() { return xgetSQueMap("id_QueryDerivedReferrer_ClickLogList"); }
    public String keepId_QueryDerivedReferrer_ClickLogList(ClickLogCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_ClickLogList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_ClickLogListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_ClickLogList"); }
    public String keepId_QueryDerivedReferrer_ClickLogListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_ClickLogList", pm); }

    public Map<String, SearchFieldLogCQ> xdfgetId_QueryDerivedReferrer_SearchFieldLogList() { return xgetSQueMap("id_QueryDerivedReferrer_SearchFieldLogList"); }
    public String keepId_QueryDerivedReferrer_SearchFieldLogList(SearchFieldLogCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_SearchFieldLogList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_SearchFieldLogListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_SearchFieldLogList"); }
    public String keepId_QueryDerivedReferrer_SearchFieldLogListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_SearchFieldLogList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

    protected ConditionValue _searchWord;
    public ConditionValue xdfgetSearchWord()
    { if (_searchWord == null) { _searchWord = nCV(); }
      return _searchWord; }
    protected ConditionValue xgetCValueSearchWord() { return xdfgetSearchWord(); }

    /** 
     * Add order-by as ascend. <br>
     * SEARCH_WORD: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_SearchWord_Asc() { regOBA("SEARCH_WORD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEARCH_WORD: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_SearchWord_Desc() { regOBD("SEARCH_WORD"); return this; }

    protected ConditionValue _requestedTime;
    public ConditionValue xdfgetRequestedTime()
    { if (_requestedTime == null) { _requestedTime = nCV(); }
      return _requestedTime; }
    protected ConditionValue xgetCValueRequestedTime() { return xdfgetRequestedTime(); }

    /** 
     * Add order-by as ascend. <br>
     * REQUESTED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_RequestedTime_Asc() { regOBA("REQUESTED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REQUESTED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_RequestedTime_Desc() { regOBD("REQUESTED_TIME"); return this; }

    protected ConditionValue _responseTime;
    public ConditionValue xdfgetResponseTime()
    { if (_responseTime == null) { _responseTime = nCV(); }
      return _responseTime; }
    protected ConditionValue xgetCValueResponseTime() { return xdfgetResponseTime(); }

    /** 
     * Add order-by as ascend. <br>
     * RESPONSE_TIME: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_ResponseTime_Asc() { regOBA("RESPONSE_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESPONSE_TIME: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_ResponseTime_Desc() { regOBD("RESPONSE_TIME"); return this; }

    protected ConditionValue _hitCount;
    public ConditionValue xdfgetHitCount()
    { if (_hitCount == null) { _hitCount = nCV(); }
      return _hitCount; }
    protected ConditionValue xgetCValueHitCount() { return xdfgetHitCount(); }

    /** 
     * Add order-by as ascend. <br>
     * HIT_COUNT: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_HitCount_Asc() { regOBA("HIT_COUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * HIT_COUNT: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_HitCount_Desc() { regOBD("HIT_COUNT"); return this; }

    protected ConditionValue _queryOffset;
    public ConditionValue xdfgetQueryOffset()
    { if (_queryOffset == null) { _queryOffset = nCV(); }
      return _queryOffset; }
    protected ConditionValue xgetCValueQueryOffset() { return xdfgetQueryOffset(); }

    /** 
     * Add order-by as ascend. <br>
     * QUERY_OFFSET: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_QueryOffset_Asc() { regOBA("QUERY_OFFSET"); return this; }

    /**
     * Add order-by as descend. <br>
     * QUERY_OFFSET: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_QueryOffset_Desc() { regOBD("QUERY_OFFSET"); return this; }

    protected ConditionValue _queryPageSize;
    public ConditionValue xdfgetQueryPageSize()
    { if (_queryPageSize == null) { _queryPageSize = nCV(); }
      return _queryPageSize; }
    protected ConditionValue xgetCValueQueryPageSize() { return xdfgetQueryPageSize(); }

    /** 
     * Add order-by as ascend. <br>
     * QUERY_PAGE_SIZE: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_QueryPageSize_Asc() { regOBA("QUERY_PAGE_SIZE"); return this; }

    /**
     * Add order-by as descend. <br>
     * QUERY_PAGE_SIZE: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_QueryPageSize_Desc() { regOBD("QUERY_PAGE_SIZE"); return this; }

    protected ConditionValue _userAgent;
    public ConditionValue xdfgetUserAgent()
    { if (_userAgent == null) { _userAgent = nCV(); }
      return _userAgent; }
    protected ConditionValue xgetCValueUserAgent() { return xdfgetUserAgent(); }

    /** 
     * Add order-by as ascend. <br>
     * USER_AGENT: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_UserAgent_Asc() { regOBA("USER_AGENT"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_AGENT: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_UserAgent_Desc() { regOBD("USER_AGENT"); return this; }

    protected ConditionValue _referer;
    public ConditionValue xdfgetReferer()
    { if (_referer == null) { _referer = nCV(); }
      return _referer; }
    protected ConditionValue xgetCValueReferer() { return xdfgetReferer(); }

    /** 
     * Add order-by as ascend. <br>
     * REFERER: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_Referer_Asc() { regOBA("REFERER"); return this; }

    /**
     * Add order-by as descend. <br>
     * REFERER: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_Referer_Desc() { regOBD("REFERER"); return this; }

    protected ConditionValue _clientIp;
    public ConditionValue xdfgetClientIp()
    { if (_clientIp == null) { _clientIp = nCV(); }
      return _clientIp; }
    protected ConditionValue xgetCValueClientIp() { return xdfgetClientIp(); }

    /** 
     * Add order-by as ascend. <br>
     * CLIENT_IP: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_ClientIp_Asc() { regOBA("CLIENT_IP"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_IP: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_ClientIp_Desc() { regOBD("CLIENT_IP"); return this; }

    protected ConditionValue _userSessionId;
    public ConditionValue xdfgetUserSessionId()
    { if (_userSessionId == null) { _userSessionId = nCV(); }
      return _userSessionId; }
    protected ConditionValue xgetCValueUserSessionId() { return xdfgetUserSessionId(); }

    /** 
     * Add order-by as ascend. <br>
     * USER_SESSION_ID: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_UserSessionId_Asc() { regOBA("USER_SESSION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_SESSION_ID: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_UserSessionId_Desc() { regOBD("USER_SESSION_ID"); return this; }

    protected ConditionValue _accessType;
    public ConditionValue xdfgetAccessType()
    { if (_accessType == null) { _accessType = nCV(); }
      return _accessType; }
    protected ConditionValue xgetCValueAccessType() { return xdfgetAccessType(); }

    /** 
     * Add order-by as ascend. <br>
     * ACCESS_TYPE: {NotNull, VARCHAR(1), classification=AccessType}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_AccessType_Asc() { regOBA("ACCESS_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACCESS_TYPE: {NotNull, VARCHAR(1), classification=AccessType}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_AccessType_Desc() { regOBD("ACCESS_TYPE"); return this; }

    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    /** 
     * Add order-by as ascend. <br>
     * USER_ID: {IX, BIGINT(19), FK to USER_INFO}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_UserId_Asc() { regOBA("USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_ID: {IX, BIGINT(19), FK to USER_INFO}
     * @return this. (NotNull)
     */
    public BsSearchLogCQ addOrderBy_UserId_Desc() { regOBD("USER_ID"); return this; }

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
    public BsSearchLogCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsSearchLogCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        SearchLogCQ bq = (SearchLogCQ)bqs;
        SearchLogCQ uq = (SearchLogCQ)uqs;
        if (bq.hasConditionQueryUserInfo()) {
            uq.queryUserInfo().reflectRelationOnUnionQuery(bq.queryUserInfo(), uq.queryUserInfo());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * USER_INFO by my USER_ID, named 'userInfo'.
     * @return The instance of condition-query. (NotNull)
     */
    public UserInfoCQ queryUserInfo() {
        return xdfgetConditionQueryUserInfo();
    }
    public UserInfoCQ xdfgetConditionQueryUserInfo() {
        String prop = "userInfo";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryUserInfo()); xsetupOuterJoinUserInfo(); }
        return xgetQueRlMap(prop);
    }
    protected UserInfoCQ xcreateQueryUserInfo() {
        String nrp = xresolveNRP("SEARCH_LOG", "userInfo"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new UserInfoCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "userInfo", nrp);
    }
    protected void xsetupOuterJoinUserInfo() { xregOutJo("userInfo"); }
    public boolean hasConditionQueryUserInfo() { return xhasQueRlMap("userInfo"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, SearchLogCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(SearchLogCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, SearchLogCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(SearchLogCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, SearchLogCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(SearchLogCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, SearchLogCQ> _myselfExistsMap;
    public Map<String, SearchLogCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(SearchLogCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, SearchLogCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(SearchLogCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SearchLogCB.class.getName(); }
    protected String xCQ() { return SearchLogCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
