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
 * The base condition-query of CRAWLING_SESSION_INFO.
 * @author DBFlute(AutoGenerator)
 */
public class BsCrawlingSessionInfoCQ extends AbstractBsCrawlingSessionInfoCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected CrawlingSessionInfoCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsCrawlingSessionInfoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from CRAWLING_SESSION_INFO) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public CrawlingSessionInfoCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected CrawlingSessionInfoCIQ xcreateCIQ() {
        CrawlingSessionInfoCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected CrawlingSessionInfoCIQ xnewCIQ() {
        return new CrawlingSessionInfoCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join CRAWLING_SESSION_INFO on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public CrawlingSessionInfoCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        CrawlingSessionInfoCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    /** 
     * Add order-by as ascend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsCrawlingSessionInfoCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsCrawlingSessionInfoCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

    protected ConditionValue _crawlingSessionId;
    public ConditionValue xdfgetCrawlingSessionId()
    { if (_crawlingSessionId == null) { _crawlingSessionId = nCV(); }
      return _crawlingSessionId; }
    protected ConditionValue xgetCValueCrawlingSessionId() { return xdfgetCrawlingSessionId(); }

    /** 
     * Add order-by as ascend. <br>
     * CRAWLING_SESSION_ID: {IX, NotNull, BIGINT(19), FK to CRAWLING_SESSION}
     * @return this. (NotNull)
     */
    public BsCrawlingSessionInfoCQ addOrderBy_CrawlingSessionId_Asc() { regOBA("CRAWLING_SESSION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CRAWLING_SESSION_ID: {IX, NotNull, BIGINT(19), FK to CRAWLING_SESSION}
     * @return this. (NotNull)
     */
    public BsCrawlingSessionInfoCQ addOrderBy_CrawlingSessionId_Desc() { regOBD("CRAWLING_SESSION_ID"); return this; }

    protected ConditionValue _key;
    public ConditionValue xdfgetKey()
    { if (_key == null) { _key = nCV(); }
      return _key; }
    protected ConditionValue xgetCValueKey() { return xdfgetKey(); }

    /** 
     * Add order-by as ascend. <br>
     * KEY: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsCrawlingSessionInfoCQ addOrderBy_Key_Asc() { regOBA("KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * KEY: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsCrawlingSessionInfoCQ addOrderBy_Key_Desc() { regOBD("KEY"); return this; }

    protected ConditionValue _value;
    public ConditionValue xdfgetValue()
    { if (_value == null) { _value = nCV(); }
      return _value; }
    protected ConditionValue xgetCValueValue() { return xdfgetValue(); }

    /** 
     * Add order-by as ascend. <br>
     * VALUE: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsCrawlingSessionInfoCQ addOrderBy_Value_Asc() { regOBA("VALUE"); return this; }

    /**
     * Add order-by as descend. <br>
     * VALUE: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsCrawlingSessionInfoCQ addOrderBy_Value_Desc() { regOBD("VALUE"); return this; }

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
    public BsCrawlingSessionInfoCQ addOrderBy_CreatedTime_Asc() { regOBA("CREATED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsCrawlingSessionInfoCQ addOrderBy_CreatedTime_Desc() { regOBD("CREATED_TIME"); return this; }

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
    public BsCrawlingSessionInfoCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsCrawlingSessionInfoCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        CrawlingSessionInfoCQ bq = (CrawlingSessionInfoCQ)bqs;
        CrawlingSessionInfoCQ uq = (CrawlingSessionInfoCQ)uqs;
        if (bq.hasConditionQueryCrawlingSession()) {
            uq.queryCrawlingSession().reflectRelationOnUnionQuery(bq.queryCrawlingSession(), uq.queryCrawlingSession());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * CRAWLING_SESSION by my CRAWLING_SESSION_ID, named 'crawlingSession'.
     * @return The instance of condition-query. (NotNull)
     */
    public CrawlingSessionCQ queryCrawlingSession() {
        return xdfgetConditionQueryCrawlingSession();
    }
    public CrawlingSessionCQ xdfgetConditionQueryCrawlingSession() {
        String prop = "crawlingSession";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryCrawlingSession()); xsetupOuterJoinCrawlingSession(); }
        return xgetQueRlMap(prop);
    }
    protected CrawlingSessionCQ xcreateQueryCrawlingSession() {
        String nrp = xresolveNRP("CRAWLING_SESSION_INFO", "crawlingSession"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new CrawlingSessionCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "crawlingSession", nrp);
    }
    protected void xsetupOuterJoinCrawlingSession() { xregOutJo("crawlingSession"); }
    public boolean hasConditionQueryCrawlingSession() { return xhasQueRlMap("crawlingSession"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, CrawlingSessionInfoCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(CrawlingSessionInfoCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, CrawlingSessionInfoCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(CrawlingSessionInfoCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, CrawlingSessionInfoCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(CrawlingSessionInfoCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, CrawlingSessionInfoCQ> _myselfExistsMap;
    public Map<String, CrawlingSessionInfoCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(CrawlingSessionInfoCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, CrawlingSessionInfoCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(CrawlingSessionInfoCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return CrawlingSessionInfoCB.class.getName(); }
    protected String xCQ() { return CrawlingSessionInfoCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
