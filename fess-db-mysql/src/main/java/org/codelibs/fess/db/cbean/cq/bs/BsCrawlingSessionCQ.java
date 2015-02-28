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
 * The base condition-query of CRAWLING_SESSION.
 * @author DBFlute(AutoGenerator)
 */
public class BsCrawlingSessionCQ extends AbstractBsCrawlingSessionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected CrawlingSessionCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsCrawlingSessionCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from CRAWLING_SESSION) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public CrawlingSessionCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected CrawlingSessionCIQ xcreateCIQ() {
        CrawlingSessionCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected CrawlingSessionCIQ xnewCIQ() {
        return new CrawlingSessionCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join CRAWLING_SESSION on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public CrawlingSessionCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        CrawlingSessionCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    public Map<String, CrawlingSessionInfoCQ> xdfgetId_ExistsReferrer_CrawlingSessionInfoList() { return xgetSQueMap("id_ExistsReferrer_CrawlingSessionInfoList"); }
    public String keepId_ExistsReferrer_CrawlingSessionInfoList(CrawlingSessionInfoCQ sq) { return xkeepSQue("id_ExistsReferrer_CrawlingSessionInfoList", sq); }

    public Map<String, CrawlingSessionInfoCQ> xdfgetId_NotExistsReferrer_CrawlingSessionInfoList() { return xgetSQueMap("id_NotExistsReferrer_CrawlingSessionInfoList"); }
    public String keepId_NotExistsReferrer_CrawlingSessionInfoList(CrawlingSessionInfoCQ sq) { return xkeepSQue("id_NotExistsReferrer_CrawlingSessionInfoList", sq); }

    public Map<String, CrawlingSessionInfoCQ> xdfgetId_SpecifyDerivedReferrer_CrawlingSessionInfoList() { return xgetSQueMap("id_SpecifyDerivedReferrer_CrawlingSessionInfoList"); }
    public String keepId_SpecifyDerivedReferrer_CrawlingSessionInfoList(CrawlingSessionInfoCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_CrawlingSessionInfoList", sq); }

    public Map<String, CrawlingSessionInfoCQ> xdfgetId_QueryDerivedReferrer_CrawlingSessionInfoList() { return xgetSQueMap("id_QueryDerivedReferrer_CrawlingSessionInfoList"); }
    public String keepId_QueryDerivedReferrer_CrawlingSessionInfoList(CrawlingSessionInfoCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_CrawlingSessionInfoList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_CrawlingSessionInfoListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_CrawlingSessionInfoList"); }
    public String keepId_QueryDerivedReferrer_CrawlingSessionInfoListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_CrawlingSessionInfoList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsCrawlingSessionCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsCrawlingSessionCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

    protected ConditionValue _sessionId;
    public ConditionValue xdfgetSessionId()
    { if (_sessionId == null) { _sessionId = nCV(); }
      return _sessionId; }
    protected ConditionValue xgetCValueSessionId() { return xdfgetSessionId(); }

    /** 
     * Add order-by as ascend. <br>
     * SESSION_ID: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsCrawlingSessionCQ addOrderBy_SessionId_Asc() { regOBA("SESSION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SESSION_ID: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsCrawlingSessionCQ addOrderBy_SessionId_Desc() { regOBD("SESSION_ID"); return this; }

    protected ConditionValue _name;
    public ConditionValue xdfgetName()
    { if (_name == null) { _name = nCV(); }
      return _name; }
    protected ConditionValue xgetCValueName() { return xdfgetName(); }

    /** 
     * Add order-by as ascend. <br>
     * NAME: {VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsCrawlingSessionCQ addOrderBy_Name_Asc() { regOBA("NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * NAME: {VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsCrawlingSessionCQ addOrderBy_Name_Desc() { regOBD("NAME"); return this; }

    protected ConditionValue _expiredTime;
    public ConditionValue xdfgetExpiredTime()
    { if (_expiredTime == null) { _expiredTime = nCV(); }
      return _expiredTime; }
    protected ConditionValue xgetCValueExpiredTime() { return xdfgetExpiredTime(); }

    /** 
     * Add order-by as ascend. <br>
     * EXPIRED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsCrawlingSessionCQ addOrderBy_ExpiredTime_Asc() { regOBA("EXPIRED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPIRED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsCrawlingSessionCQ addOrderBy_ExpiredTime_Desc() { regOBD("EXPIRED_TIME"); return this; }

    protected ConditionValue _createdTime;
    public ConditionValue xdfgetCreatedTime()
    { if (_createdTime == null) { _createdTime = nCV(); }
      return _createdTime; }
    protected ConditionValue xgetCValueCreatedTime() { return xdfgetCreatedTime(); }

    /** 
     * Add order-by as ascend. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @return this. (NotNull)
     */
    public BsCrawlingSessionCQ addOrderBy_CreatedTime_Asc() { regOBA("CREATED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @return this. (NotNull)
     */
    public BsCrawlingSessionCQ addOrderBy_CreatedTime_Desc() { regOBD("CREATED_TIME"); return this; }

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
    public BsCrawlingSessionCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsCrawlingSessionCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, CrawlingSessionCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(CrawlingSessionCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, CrawlingSessionCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(CrawlingSessionCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, CrawlingSessionCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(CrawlingSessionCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, CrawlingSessionCQ> _myselfExistsMap;
    public Map<String, CrawlingSessionCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(CrawlingSessionCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, CrawlingSessionCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(CrawlingSessionCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return CrawlingSessionCB.class.getName(); }
    protected String xCQ() { return CrawlingSessionCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
