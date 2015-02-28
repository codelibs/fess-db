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
 * The base condition-query of SCHEDULED_JOB.
 * @author DBFlute(AutoGenerator)
 */
public class BsScheduledJobCQ extends AbstractBsScheduledJobCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ScheduledJobCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsScheduledJobCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from SCHEDULED_JOB) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ScheduledJobCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ScheduledJobCIQ xcreateCIQ() {
        ScheduledJobCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ScheduledJobCIQ xnewCIQ() {
        return new ScheduledJobCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join SCHEDULED_JOB on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ScheduledJobCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ScheduledJobCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
    public BsScheduledJobCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsScheduledJobCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

    protected ConditionValue _name;
    public ConditionValue xdfgetName()
    { if (_name == null) { _name = nCV(); }
      return _name; }
    protected ConditionValue xgetCValueName() { return xdfgetName(); }

    /** 
     * Add order-by as ascend. <br>
     * NAME: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsScheduledJobCQ addOrderBy_Name_Asc() { regOBA("NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * NAME: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsScheduledJobCQ addOrderBy_Name_Desc() { regOBD("NAME"); return this; }

    protected ConditionValue _target;
    public ConditionValue xdfgetTarget()
    { if (_target == null) { _target = nCV(); }
      return _target; }
    protected ConditionValue xgetCValueTarget() { return xdfgetTarget(); }

    /** 
     * Add order-by as ascend. <br>
     * TARGET: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsScheduledJobCQ addOrderBy_Target_Asc() { regOBA("TARGET"); return this; }

    /**
     * Add order-by as descend. <br>
     * TARGET: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsScheduledJobCQ addOrderBy_Target_Desc() { regOBD("TARGET"); return this; }

    protected ConditionValue _cronExpression;
    public ConditionValue xdfgetCronExpression()
    { if (_cronExpression == null) { _cronExpression = nCV(); }
      return _cronExpression; }
    protected ConditionValue xgetCValueCronExpression() { return xdfgetCronExpression(); }

    /** 
     * Add order-by as ascend. <br>
     * CRON_EXPRESSION: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsScheduledJobCQ addOrderBy_CronExpression_Asc() { regOBA("CRON_EXPRESSION"); return this; }

    /**
     * Add order-by as descend. <br>
     * CRON_EXPRESSION: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsScheduledJobCQ addOrderBy_CronExpression_Desc() { regOBD("CRON_EXPRESSION"); return this; }

    protected ConditionValue _scriptType;
    public ConditionValue xdfgetScriptType()
    { if (_scriptType == null) { _scriptType = nCV(); }
      return _scriptType; }
    protected ConditionValue xgetCValueScriptType() { return xdfgetScriptType(); }

    /** 
     * Add order-by as ascend. <br>
     * SCRIPT_TYPE: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsScheduledJobCQ addOrderBy_ScriptType_Asc() { regOBA("SCRIPT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCRIPT_TYPE: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsScheduledJobCQ addOrderBy_ScriptType_Desc() { regOBD("SCRIPT_TYPE"); return this; }

    protected ConditionValue _scriptData;
    public ConditionValue xdfgetScriptData()
    { if (_scriptData == null) { _scriptData = nCV(); }
      return _scriptData; }
    protected ConditionValue xgetCValueScriptData() { return xdfgetScriptData(); }

    /** 
     * Add order-by as ascend. <br>
     * SCRIPT_DATA: {VARCHAR(4000)}
     * @return this. (NotNull)
     */
    public BsScheduledJobCQ addOrderBy_ScriptData_Asc() { regOBA("SCRIPT_DATA"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCRIPT_DATA: {VARCHAR(4000)}
     * @return this. (NotNull)
     */
    public BsScheduledJobCQ addOrderBy_ScriptData_Desc() { regOBD("SCRIPT_DATA"); return this; }

    protected ConditionValue _crawler;
    public ConditionValue xdfgetCrawler()
    { if (_crawler == null) { _crawler = nCV(); }
      return _crawler; }
    protected ConditionValue xgetCValueCrawler() { return xdfgetCrawler(); }

    /** 
     * Add order-by as ascend. <br>
     * CRAWLER: {NotNull, VARCHAR(1)}
     * @return this. (NotNull)
     */
    public BsScheduledJobCQ addOrderBy_Crawler_Asc() { regOBA("CRAWLER"); return this; }

    /**
     * Add order-by as descend. <br>
     * CRAWLER: {NotNull, VARCHAR(1)}
     * @return this. (NotNull)
     */
    public BsScheduledJobCQ addOrderBy_Crawler_Desc() { regOBD("CRAWLER"); return this; }

    protected ConditionValue _jobLogging;
    public ConditionValue xdfgetJobLogging()
    { if (_jobLogging == null) { _jobLogging = nCV(); }
      return _jobLogging; }
    protected ConditionValue xgetCValueJobLogging() { return xdfgetJobLogging(); }

    /** 
     * Add order-by as ascend. <br>
     * JOB_LOGGING: {NotNull, VARCHAR(1)}
     * @return this. (NotNull)
     */
    public BsScheduledJobCQ addOrderBy_JobLogging_Asc() { regOBA("JOB_LOGGING"); return this; }

    /**
     * Add order-by as descend. <br>
     * JOB_LOGGING: {NotNull, VARCHAR(1)}
     * @return this. (NotNull)
     */
    public BsScheduledJobCQ addOrderBy_JobLogging_Desc() { regOBD("JOB_LOGGING"); return this; }

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
    public BsScheduledJobCQ addOrderBy_Available_Asc() { regOBA("AVAILABLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * AVAILABLE: {NotNull, VARCHAR(1)}
     * @return this. (NotNull)
     */
    public BsScheduledJobCQ addOrderBy_Available_Desc() { regOBD("AVAILABLE"); return this; }

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
    public BsScheduledJobCQ addOrderBy_SortOrder_Asc() { regOBA("SORT_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORT_ORDER: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsScheduledJobCQ addOrderBy_SortOrder_Desc() { regOBD("SORT_ORDER"); return this; }

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
    public BsScheduledJobCQ addOrderBy_CreatedBy_Asc() { regOBA("CREATED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATED_BY: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsScheduledJobCQ addOrderBy_CreatedBy_Desc() { regOBD("CREATED_BY"); return this; }

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
    public BsScheduledJobCQ addOrderBy_CreatedTime_Asc() { regOBA("CREATED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsScheduledJobCQ addOrderBy_CreatedTime_Desc() { regOBD("CREATED_TIME"); return this; }

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
    public BsScheduledJobCQ addOrderBy_UpdatedBy_Asc() { regOBA("UPDATED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATED_BY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsScheduledJobCQ addOrderBy_UpdatedBy_Desc() { regOBD("UPDATED_BY"); return this; }

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
    public BsScheduledJobCQ addOrderBy_UpdatedTime_Asc() { regOBA("UPDATED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATED_TIME: {TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsScheduledJobCQ addOrderBy_UpdatedTime_Desc() { regOBD("UPDATED_TIME"); return this; }

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
    public BsScheduledJobCQ addOrderBy_DeletedBy_Asc() { regOBA("DELETED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELETED_BY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsScheduledJobCQ addOrderBy_DeletedBy_Desc() { regOBD("DELETED_BY"); return this; }

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
    public BsScheduledJobCQ addOrderBy_DeletedTime_Asc() { regOBA("DELETED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELETED_TIME: {TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsScheduledJobCQ addOrderBy_DeletedTime_Desc() { regOBD("DELETED_TIME"); return this; }

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
    public BsScheduledJobCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsScheduledJobCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsScheduledJobCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsScheduledJobCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, ScheduledJobCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ScheduledJobCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ScheduledJobCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ScheduledJobCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ScheduledJobCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ScheduledJobCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ScheduledJobCQ> _myselfExistsMap;
    public Map<String, ScheduledJobCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ScheduledJobCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ScheduledJobCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ScheduledJobCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ScheduledJobCB.class.getName(); }
    protected String xCQ() { return ScheduledJobCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
