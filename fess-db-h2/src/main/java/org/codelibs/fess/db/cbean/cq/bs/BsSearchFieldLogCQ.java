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
 * The base condition-query of SEARCH_FIELD_LOG.
 * @author DBFlute(AutoGenerator)
 */
public class BsSearchFieldLogCQ extends AbstractBsSearchFieldLogCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SearchFieldLogCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSearchFieldLogCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from SEARCH_FIELD_LOG) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SearchFieldLogCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SearchFieldLogCIQ xcreateCIQ() {
        SearchFieldLogCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SearchFieldLogCIQ xnewCIQ() {
        return new SearchFieldLogCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join SEARCH_FIELD_LOG on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SearchFieldLogCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SearchFieldLogCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
    public BsSearchFieldLogCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsSearchFieldLogCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

    protected ConditionValue _searchId;
    public ConditionValue xdfgetSearchId()
    { if (_searchId == null) { _searchId = nCV(); }
      return _searchId; }
    protected ConditionValue xgetCValueSearchId() { return xdfgetSearchId(); }

    /** 
     * Add order-by as ascend. <br>
     * SEARCH_ID: {IX, NotNull, BIGINT(19), FK to SEARCH_LOG}
     * @return this. (NotNull)
     */
    public BsSearchFieldLogCQ addOrderBy_SearchId_Asc() { regOBA("SEARCH_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEARCH_ID: {IX, NotNull, BIGINT(19), FK to SEARCH_LOG}
     * @return this. (NotNull)
     */
    public BsSearchFieldLogCQ addOrderBy_SearchId_Desc() { regOBD("SEARCH_ID"); return this; }

    protected ConditionValue _name;
    public ConditionValue xdfgetName()
    { if (_name == null) { _name = nCV(); }
      return _name; }
    protected ConditionValue xgetCValueName() { return xdfgetName(); }

    /** 
     * Add order-by as ascend. <br>
     * NAME: {IX, NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsSearchFieldLogCQ addOrderBy_Name_Asc() { regOBA("NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * NAME: {IX, NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsSearchFieldLogCQ addOrderBy_Name_Desc() { regOBD("NAME"); return this; }

    protected ConditionValue _value;
    public ConditionValue xdfgetValue()
    { if (_value == null) { _value = nCV(); }
      return _value; }
    protected ConditionValue xgetCValueValue() { return xdfgetValue(); }

    /** 
     * Add order-by as ascend. <br>
     * VALUE: {NotNull, VARCHAR(1000)}
     * @return this. (NotNull)
     */
    public BsSearchFieldLogCQ addOrderBy_Value_Asc() { regOBA("VALUE"); return this; }

    /**
     * Add order-by as descend. <br>
     * VALUE: {NotNull, VARCHAR(1000)}
     * @return this. (NotNull)
     */
    public BsSearchFieldLogCQ addOrderBy_Value_Desc() { regOBD("VALUE"); return this; }

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
    public BsSearchFieldLogCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsSearchFieldLogCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        SearchFieldLogCQ bq = (SearchFieldLogCQ)bqs;
        SearchFieldLogCQ uq = (SearchFieldLogCQ)uqs;
        if (bq.hasConditionQuerySearchLog()) {
            uq.querySearchLog().reflectRelationOnUnionQuery(bq.querySearchLog(), uq.querySearchLog());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * SEARCH_LOG by my SEARCH_ID, named 'searchLog'.
     * @return The instance of condition-query. (NotNull)
     */
    public SearchLogCQ querySearchLog() {
        return xdfgetConditionQuerySearchLog();
    }
    public SearchLogCQ xdfgetConditionQuerySearchLog() {
        String prop = "searchLog";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQuerySearchLog()); xsetupOuterJoinSearchLog(); }
        return xgetQueRlMap(prop);
    }
    protected SearchLogCQ xcreateQuerySearchLog() {
        String nrp = xresolveNRP("SEARCH_FIELD_LOG", "searchLog"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new SearchLogCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "searchLog", nrp);
    }
    protected void xsetupOuterJoinSearchLog() { xregOutJo("searchLog"); }
    public boolean hasConditionQuerySearchLog() { return xhasQueRlMap("searchLog"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, SearchFieldLogCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(SearchFieldLogCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, SearchFieldLogCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(SearchFieldLogCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, SearchFieldLogCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(SearchFieldLogCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, SearchFieldLogCQ> _myselfExistsMap;
    public Map<String, SearchFieldLogCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(SearchFieldLogCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, SearchFieldLogCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(SearchFieldLogCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SearchFieldLogCB.class.getName(); }
    protected String xCQ() { return SearchFieldLogCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
