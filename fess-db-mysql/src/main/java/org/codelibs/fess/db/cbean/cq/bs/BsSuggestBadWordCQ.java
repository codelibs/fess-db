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
 * The base condition-query of SUGGEST_BAD_WORD.
 * @author DBFlute(AutoGenerator)
 */
public class BsSuggestBadWordCQ extends AbstractBsSuggestBadWordCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SuggestBadWordCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSuggestBadWordCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from SUGGEST_BAD_WORD) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SuggestBadWordCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SuggestBadWordCIQ xcreateCIQ() {
        SuggestBadWordCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SuggestBadWordCIQ xnewCIQ() {
        return new SuggestBadWordCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join SUGGEST_BAD_WORD on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SuggestBadWordCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SuggestBadWordCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
    public BsSuggestBadWordCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsSuggestBadWordCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

    protected ConditionValue _suggestWord;
    public ConditionValue xdfgetSuggestWord()
    { if (_suggestWord == null) { _suggestWord = nCV(); }
      return _suggestWord; }
    protected ConditionValue xgetCValueSuggestWord() { return xdfgetSuggestWord(); }

    /** 
     * Add order-by as ascend. <br>
     * SUGGEST_WORD: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsSuggestBadWordCQ addOrderBy_SuggestWord_Asc() { regOBA("SUGGEST_WORD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUGGEST_WORD: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsSuggestBadWordCQ addOrderBy_SuggestWord_Desc() { regOBD("SUGGEST_WORD"); return this; }

    protected ConditionValue _targetRole;
    public ConditionValue xdfgetTargetRole()
    { if (_targetRole == null) { _targetRole = nCV(); }
      return _targetRole; }
    protected ConditionValue xgetCValueTargetRole() { return xdfgetTargetRole(); }

    /** 
     * Add order-by as ascend. <br>
     * TARGET_ROLE: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsSuggestBadWordCQ addOrderBy_TargetRole_Asc() { regOBA("TARGET_ROLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TARGET_ROLE: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsSuggestBadWordCQ addOrderBy_TargetRole_Desc() { regOBD("TARGET_ROLE"); return this; }

    protected ConditionValue _targetLabel;
    public ConditionValue xdfgetTargetLabel()
    { if (_targetLabel == null) { _targetLabel = nCV(); }
      return _targetLabel; }
    protected ConditionValue xgetCValueTargetLabel() { return xdfgetTargetLabel(); }

    /** 
     * Add order-by as ascend. <br>
     * TARGET_LABEL: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsSuggestBadWordCQ addOrderBy_TargetLabel_Asc() { regOBA("TARGET_LABEL"); return this; }

    /**
     * Add order-by as descend. <br>
     * TARGET_LABEL: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsSuggestBadWordCQ addOrderBy_TargetLabel_Desc() { regOBD("TARGET_LABEL"); return this; }

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
    public BsSuggestBadWordCQ addOrderBy_CreatedBy_Asc() { regOBA("CREATED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATED_BY: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsSuggestBadWordCQ addOrderBy_CreatedBy_Desc() { regOBD("CREATED_BY"); return this; }

    protected ConditionValue _createdTime;
    public ConditionValue xdfgetCreatedTime()
    { if (_createdTime == null) { _createdTime = nCV(); }
      return _createdTime; }
    protected ConditionValue xgetCValueCreatedTime() { return xdfgetCreatedTime(); }

    /** 
     * Add order-by as ascend. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsSuggestBadWordCQ addOrderBy_CreatedTime_Asc() { regOBA("CREATED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsSuggestBadWordCQ addOrderBy_CreatedTime_Desc() { regOBD("CREATED_TIME"); return this; }

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
    public BsSuggestBadWordCQ addOrderBy_UpdatedBy_Asc() { regOBA("UPDATED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATED_BY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsSuggestBadWordCQ addOrderBy_UpdatedBy_Desc() { regOBD("UPDATED_BY"); return this; }

    protected ConditionValue _updatedTime;
    public ConditionValue xdfgetUpdatedTime()
    { if (_updatedTime == null) { _updatedTime = nCV(); }
      return _updatedTime; }
    protected ConditionValue xgetCValueUpdatedTime() { return xdfgetUpdatedTime(); }

    /** 
     * Add order-by as ascend. <br>
     * UPDATED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @return this. (NotNull)
     */
    public BsSuggestBadWordCQ addOrderBy_UpdatedTime_Asc() { regOBA("UPDATED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @return this. (NotNull)
     */
    public BsSuggestBadWordCQ addOrderBy_UpdatedTime_Desc() { regOBD("UPDATED_TIME"); return this; }

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
    public BsSuggestBadWordCQ addOrderBy_DeletedBy_Asc() { regOBA("DELETED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELETED_BY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsSuggestBadWordCQ addOrderBy_DeletedBy_Desc() { regOBD("DELETED_BY"); return this; }

    protected ConditionValue _deletedTime;
    public ConditionValue xdfgetDeletedTime()
    { if (_deletedTime == null) { _deletedTime = nCV(); }
      return _deletedTime; }
    protected ConditionValue xgetCValueDeletedTime() { return xdfgetDeletedTime(); }

    /** 
     * Add order-by as ascend. <br>
     * DELETED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @return this. (NotNull)
     */
    public BsSuggestBadWordCQ addOrderBy_DeletedTime_Asc() { regOBA("DELETED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELETED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @return this. (NotNull)
     */
    public BsSuggestBadWordCQ addOrderBy_DeletedTime_Desc() { regOBD("DELETED_TIME"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /** 
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsSuggestBadWordCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsSuggestBadWordCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsSuggestBadWordCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsSuggestBadWordCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, SuggestBadWordCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(SuggestBadWordCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, SuggestBadWordCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(SuggestBadWordCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, SuggestBadWordCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(SuggestBadWordCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, SuggestBadWordCQ> _myselfExistsMap;
    public Map<String, SuggestBadWordCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(SuggestBadWordCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, SuggestBadWordCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(SuggestBadWordCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SuggestBadWordCB.class.getName(); }
    protected String xCQ() { return SuggestBadWordCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
