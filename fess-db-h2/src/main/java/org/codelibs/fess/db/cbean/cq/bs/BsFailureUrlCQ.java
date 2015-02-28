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
 * The base condition-query of FAILURE_URL.
 * @author DBFlute(AutoGenerator)
 */
public class BsFailureUrlCQ extends AbstractBsFailureUrlCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected FailureUrlCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsFailureUrlCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from FAILURE_URL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public FailureUrlCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected FailureUrlCIQ xcreateCIQ() {
        FailureUrlCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected FailureUrlCIQ xnewCIQ() {
        return new FailureUrlCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join FAILURE_URL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public FailureUrlCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        FailureUrlCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
    public BsFailureUrlCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsFailureUrlCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

    protected ConditionValue _url;
    public ConditionValue xdfgetUrl()
    { if (_url == null) { _url = nCV(); }
      return _url; }
    protected ConditionValue xgetCValueUrl() { return xdfgetUrl(); }

    /** 
     * Add order-by as ascend. <br>
     * URL: {IX+, NotNull, VARCHAR(4000)}
     * @return this. (NotNull)
     */
    public BsFailureUrlCQ addOrderBy_Url_Asc() { regOBA("URL"); return this; }

    /**
     * Add order-by as descend. <br>
     * URL: {IX+, NotNull, VARCHAR(4000)}
     * @return this. (NotNull)
     */
    public BsFailureUrlCQ addOrderBy_Url_Desc() { regOBD("URL"); return this; }

    protected ConditionValue _threadName;
    public ConditionValue xdfgetThreadName()
    { if (_threadName == null) { _threadName = nCV(); }
      return _threadName; }
    protected ConditionValue xgetCValueThreadName() { return xdfgetThreadName(); }

    /** 
     * Add order-by as ascend. <br>
     * THREAD_NAME: {NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsFailureUrlCQ addOrderBy_ThreadName_Asc() { regOBA("THREAD_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * THREAD_NAME: {NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsFailureUrlCQ addOrderBy_ThreadName_Desc() { regOBD("THREAD_NAME"); return this; }

    protected ConditionValue _errorName;
    public ConditionValue xdfgetErrorName()
    { if (_errorName == null) { _errorName = nCV(); }
      return _errorName; }
    protected ConditionValue xgetCValueErrorName() { return xdfgetErrorName(); }

    /** 
     * Add order-by as ascend. <br>
     * ERROR_NAME: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsFailureUrlCQ addOrderBy_ErrorName_Asc() { regOBA("ERROR_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_NAME: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsFailureUrlCQ addOrderBy_ErrorName_Desc() { regOBD("ERROR_NAME"); return this; }

    protected ConditionValue _errorLog;
    public ConditionValue xdfgetErrorLog()
    { if (_errorLog == null) { _errorLog = nCV(); }
      return _errorLog; }
    protected ConditionValue xgetCValueErrorLog() { return xdfgetErrorLog(); }

    /** 
     * Add order-by as ascend. <br>
     * ERROR_LOG: {VARCHAR(4000)}
     * @return this. (NotNull)
     */
    public BsFailureUrlCQ addOrderBy_ErrorLog_Asc() { regOBA("ERROR_LOG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_LOG: {VARCHAR(4000)}
     * @return this. (NotNull)
     */
    public BsFailureUrlCQ addOrderBy_ErrorLog_Desc() { regOBD("ERROR_LOG"); return this; }

    protected ConditionValue _errorCount;
    public ConditionValue xdfgetErrorCount()
    { if (_errorCount == null) { _errorCount = nCV(); }
      return _errorCount; }
    protected ConditionValue xgetCValueErrorCount() { return xdfgetErrorCount(); }

    /** 
     * Add order-by as ascend. <br>
     * ERROR_COUNT: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsFailureUrlCQ addOrderBy_ErrorCount_Asc() { regOBA("ERROR_COUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_COUNT: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsFailureUrlCQ addOrderBy_ErrorCount_Desc() { regOBD("ERROR_COUNT"); return this; }

    protected ConditionValue _lastAccessTime;
    public ConditionValue xdfgetLastAccessTime()
    { if (_lastAccessTime == null) { _lastAccessTime = nCV(); }
      return _lastAccessTime; }
    protected ConditionValue xgetCValueLastAccessTime() { return xdfgetLastAccessTime(); }

    /** 
     * Add order-by as ascend. <br>
     * LAST_ACCESS_TIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsFailureUrlCQ addOrderBy_LastAccessTime_Asc() { regOBA("LAST_ACCESS_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * LAST_ACCESS_TIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsFailureUrlCQ addOrderBy_LastAccessTime_Desc() { regOBD("LAST_ACCESS_TIME"); return this; }

    protected ConditionValue _configId;
    public ConditionValue xdfgetConfigId()
    { if (_configId == null) { _configId = nCV(); }
      return _configId; }
    protected ConditionValue xgetCValueConfigId() { return xdfgetConfigId(); }

    /** 
     * Add order-by as ascend. <br>
     * CONFIG_ID: {IX, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsFailureUrlCQ addOrderBy_ConfigId_Asc() { regOBA("CONFIG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONFIG_ID: {IX, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsFailureUrlCQ addOrderBy_ConfigId_Desc() { regOBD("CONFIG_ID"); return this; }

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
    public BsFailureUrlCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsFailureUrlCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, FailureUrlCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(FailureUrlCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, FailureUrlCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(FailureUrlCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, FailureUrlCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(FailureUrlCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, FailureUrlCQ> _myselfExistsMap;
    public Map<String, FailureUrlCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(FailureUrlCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, FailureUrlCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(FailureUrlCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return FailureUrlCB.class.getName(); }
    protected String xCQ() { return FailureUrlCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
