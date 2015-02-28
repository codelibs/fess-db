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
 * The base condition-query of JOB_LOG.
 * @author DBFlute(AutoGenerator)
 */
public class BsJobLogCQ extends AbstractBsJobLogCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected JobLogCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsJobLogCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from JOB_LOG) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public JobLogCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected JobLogCIQ xcreateCIQ() {
        JobLogCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected JobLogCIQ xnewCIQ() {
        return new JobLogCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join JOB_LOG on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public JobLogCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        JobLogCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
    public BsJobLogCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsJobLogCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

    protected ConditionValue _jobName;
    public ConditionValue xdfgetJobName()
    { if (_jobName == null) { _jobName = nCV(); }
      return _jobName; }
    protected ConditionValue xgetCValueJobName() { return xdfgetJobName(); }

    /** 
     * Add order-by as ascend. <br>
     * JOB_NAME: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsJobLogCQ addOrderBy_JobName_Asc() { regOBA("JOB_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * JOB_NAME: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsJobLogCQ addOrderBy_JobName_Desc() { regOBD("JOB_NAME"); return this; }

    protected ConditionValue _jobStatus;
    public ConditionValue xdfgetJobStatus()
    { if (_jobStatus == null) { _jobStatus = nCV(); }
      return _jobStatus; }
    protected ConditionValue xgetCValueJobStatus() { return xdfgetJobStatus(); }

    /** 
     * Add order-by as ascend. <br>
     * JOB_STATUS: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsJobLogCQ addOrderBy_JobStatus_Asc() { regOBA("JOB_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * JOB_STATUS: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsJobLogCQ addOrderBy_JobStatus_Desc() { regOBD("JOB_STATUS"); return this; }

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
    public BsJobLogCQ addOrderBy_Target_Asc() { regOBA("TARGET"); return this; }

    /**
     * Add order-by as descend. <br>
     * TARGET: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsJobLogCQ addOrderBy_Target_Desc() { regOBD("TARGET"); return this; }

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
    public BsJobLogCQ addOrderBy_ScriptType_Asc() { regOBA("SCRIPT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCRIPT_TYPE: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsJobLogCQ addOrderBy_ScriptType_Desc() { regOBD("SCRIPT_TYPE"); return this; }

    protected ConditionValue _scriptData;
    public ConditionValue xdfgetScriptData()
    { if (_scriptData == null) { _scriptData = nCV(); }
      return _scriptData; }
    protected ConditionValue xgetCValueScriptData() { return xdfgetScriptData(); }

    /** 
     * Add order-by as ascend. <br>
     * SCRIPT_DATA: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsJobLogCQ addOrderBy_ScriptData_Asc() { regOBA("SCRIPT_DATA"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCRIPT_DATA: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsJobLogCQ addOrderBy_ScriptData_Desc() { regOBD("SCRIPT_DATA"); return this; }

    protected ConditionValue _scriptResult;
    public ConditionValue xdfgetScriptResult()
    { if (_scriptResult == null) { _scriptResult = nCV(); }
      return _scriptResult; }
    protected ConditionValue xgetCValueScriptResult() { return xdfgetScriptResult(); }

    /** 
     * Add order-by as ascend. <br>
     * SCRIPT_RESULT: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsJobLogCQ addOrderBy_ScriptResult_Asc() { regOBA("SCRIPT_RESULT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCRIPT_RESULT: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsJobLogCQ addOrderBy_ScriptResult_Desc() { regOBD("SCRIPT_RESULT"); return this; }

    protected ConditionValue _startTime;
    public ConditionValue xdfgetStartTime()
    { if (_startTime == null) { _startTime = nCV(); }
      return _startTime; }
    protected ConditionValue xgetCValueStartTime() { return xdfgetStartTime(); }

    /** 
     * Add order-by as ascend. <br>
     * START_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsJobLogCQ addOrderBy_StartTime_Asc() { regOBA("START_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * START_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsJobLogCQ addOrderBy_StartTime_Desc() { regOBD("START_TIME"); return this; }

    protected ConditionValue _endTime;
    public ConditionValue xdfgetEndTime()
    { if (_endTime == null) { _endTime = nCV(); }
      return _endTime; }
    protected ConditionValue xgetCValueEndTime() { return xdfgetEndTime(); }

    /** 
     * Add order-by as ascend. <br>
     * END_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @return this. (NotNull)
     */
    public BsJobLogCQ addOrderBy_EndTime_Asc() { regOBA("END_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * END_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @return this. (NotNull)
     */
    public BsJobLogCQ addOrderBy_EndTime_Desc() { regOBD("END_TIME"); return this; }

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
    public BsJobLogCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsJobLogCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, JobLogCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(JobLogCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, JobLogCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(JobLogCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, JobLogCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(JobLogCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, JobLogCQ> _myselfExistsMap;
    public Map<String, JobLogCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(JobLogCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, JobLogCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(JobLogCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return JobLogCB.class.getName(); }
    protected String xCQ() { return JobLogCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
