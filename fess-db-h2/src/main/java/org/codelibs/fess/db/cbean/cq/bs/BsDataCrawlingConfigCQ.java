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
 * The base condition-query of DATA_CRAWLING_CONFIG.
 * @author DBFlute(AutoGenerator)
 */
public class BsDataCrawlingConfigCQ extends AbstractBsDataCrawlingConfigCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DataCrawlingConfigCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsDataCrawlingConfigCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from DATA_CRAWLING_CONFIG) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DataCrawlingConfigCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DataCrawlingConfigCIQ xcreateCIQ() {
        DataCrawlingConfigCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DataCrawlingConfigCIQ xnewCIQ() {
        return new DataCrawlingConfigCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join DATA_CRAWLING_CONFIG on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DataCrawlingConfigCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DataCrawlingConfigCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    public Map<String, DataConfigToLabelTypeMappingCQ> xdfgetId_ExistsReferrer_DataConfigToLabelTypeMappingList() { return xgetSQueMap("id_ExistsReferrer_DataConfigToLabelTypeMappingList"); }
    public String keepId_ExistsReferrer_DataConfigToLabelTypeMappingList(DataConfigToLabelTypeMappingCQ sq) { return xkeepSQue("id_ExistsReferrer_DataConfigToLabelTypeMappingList", sq); }

    public Map<String, DataConfigToRoleTypeMappingCQ> xdfgetId_ExistsReferrer_DataConfigToRoleTypeMappingList() { return xgetSQueMap("id_ExistsReferrer_DataConfigToRoleTypeMappingList"); }
    public String keepId_ExistsReferrer_DataConfigToRoleTypeMappingList(DataConfigToRoleTypeMappingCQ sq) { return xkeepSQue("id_ExistsReferrer_DataConfigToRoleTypeMappingList", sq); }

    public Map<String, DataConfigToLabelTypeMappingCQ> xdfgetId_NotExistsReferrer_DataConfigToLabelTypeMappingList() { return xgetSQueMap("id_NotExistsReferrer_DataConfigToLabelTypeMappingList"); }
    public String keepId_NotExistsReferrer_DataConfigToLabelTypeMappingList(DataConfigToLabelTypeMappingCQ sq) { return xkeepSQue("id_NotExistsReferrer_DataConfigToLabelTypeMappingList", sq); }

    public Map<String, DataConfigToRoleTypeMappingCQ> xdfgetId_NotExistsReferrer_DataConfigToRoleTypeMappingList() { return xgetSQueMap("id_NotExistsReferrer_DataConfigToRoleTypeMappingList"); }
    public String keepId_NotExistsReferrer_DataConfigToRoleTypeMappingList(DataConfigToRoleTypeMappingCQ sq) { return xkeepSQue("id_NotExistsReferrer_DataConfigToRoleTypeMappingList", sq); }

    public Map<String, DataConfigToLabelTypeMappingCQ> xdfgetId_SpecifyDerivedReferrer_DataConfigToLabelTypeMappingList() { return xgetSQueMap("id_SpecifyDerivedReferrer_DataConfigToLabelTypeMappingList"); }
    public String keepId_SpecifyDerivedReferrer_DataConfigToLabelTypeMappingList(DataConfigToLabelTypeMappingCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_DataConfigToLabelTypeMappingList", sq); }

    public Map<String, DataConfigToRoleTypeMappingCQ> xdfgetId_SpecifyDerivedReferrer_DataConfigToRoleTypeMappingList() { return xgetSQueMap("id_SpecifyDerivedReferrer_DataConfigToRoleTypeMappingList"); }
    public String keepId_SpecifyDerivedReferrer_DataConfigToRoleTypeMappingList(DataConfigToRoleTypeMappingCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_DataConfigToRoleTypeMappingList", sq); }

    public Map<String, DataConfigToLabelTypeMappingCQ> xdfgetId_QueryDerivedReferrer_DataConfigToLabelTypeMappingList() { return xgetSQueMap("id_QueryDerivedReferrer_DataConfigToLabelTypeMappingList"); }
    public String keepId_QueryDerivedReferrer_DataConfigToLabelTypeMappingList(DataConfigToLabelTypeMappingCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_DataConfigToLabelTypeMappingList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_DataConfigToLabelTypeMappingListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_DataConfigToLabelTypeMappingList"); }
    public String keepId_QueryDerivedReferrer_DataConfigToLabelTypeMappingListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_DataConfigToLabelTypeMappingList", pm); }

    public Map<String, DataConfigToRoleTypeMappingCQ> xdfgetId_QueryDerivedReferrer_DataConfigToRoleTypeMappingList() { return xgetSQueMap("id_QueryDerivedReferrer_DataConfigToRoleTypeMappingList"); }
    public String keepId_QueryDerivedReferrer_DataConfigToRoleTypeMappingList(DataConfigToRoleTypeMappingCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_DataConfigToRoleTypeMappingList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_DataConfigToRoleTypeMappingListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_DataConfigToRoleTypeMappingList"); }
    public String keepId_QueryDerivedReferrer_DataConfigToRoleTypeMappingListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_DataConfigToRoleTypeMappingList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsDataCrawlingConfigCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsDataCrawlingConfigCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

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
    public BsDataCrawlingConfigCQ addOrderBy_Name_Asc() { regOBA("NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsDataCrawlingConfigCQ addOrderBy_Name_Desc() { regOBD("NAME"); return this; }

    protected ConditionValue _handlerName;
    public ConditionValue xdfgetHandlerName()
    { if (_handlerName == null) { _handlerName = nCV(); }
      return _handlerName; }
    protected ConditionValue xgetCValueHandlerName() { return xdfgetHandlerName(); }

    /** 
     * Add order-by as ascend. <br>
     * HANDLER_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsDataCrawlingConfigCQ addOrderBy_HandlerName_Asc() { regOBA("HANDLER_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * HANDLER_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsDataCrawlingConfigCQ addOrderBy_HandlerName_Desc() { regOBD("HANDLER_NAME"); return this; }

    protected ConditionValue _handlerParameter;
    public ConditionValue xdfgetHandlerParameter()
    { if (_handlerParameter == null) { _handlerParameter = nCV(); }
      return _handlerParameter; }
    protected ConditionValue xgetCValueHandlerParameter() { return xdfgetHandlerParameter(); }

    /** 
     * Add order-by as ascend. <br>
     * HANDLER_PARAMETER: {VARCHAR(4000)}
     * @return this. (NotNull)
     */
    public BsDataCrawlingConfigCQ addOrderBy_HandlerParameter_Asc() { regOBA("HANDLER_PARAMETER"); return this; }

    /**
     * Add order-by as descend. <br>
     * HANDLER_PARAMETER: {VARCHAR(4000)}
     * @return this. (NotNull)
     */
    public BsDataCrawlingConfigCQ addOrderBy_HandlerParameter_Desc() { regOBD("HANDLER_PARAMETER"); return this; }

    protected ConditionValue _handlerScript;
    public ConditionValue xdfgetHandlerScript()
    { if (_handlerScript == null) { _handlerScript = nCV(); }
      return _handlerScript; }
    protected ConditionValue xgetCValueHandlerScript() { return xdfgetHandlerScript(); }

    /** 
     * Add order-by as ascend. <br>
     * HANDLER_SCRIPT: {VARCHAR(4000)}
     * @return this. (NotNull)
     */
    public BsDataCrawlingConfigCQ addOrderBy_HandlerScript_Asc() { regOBA("HANDLER_SCRIPT"); return this; }

    /**
     * Add order-by as descend. <br>
     * HANDLER_SCRIPT: {VARCHAR(4000)}
     * @return this. (NotNull)
     */
    public BsDataCrawlingConfigCQ addOrderBy_HandlerScript_Desc() { regOBD("HANDLER_SCRIPT"); return this; }

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
    public BsDataCrawlingConfigCQ addOrderBy_Boost_Asc() { regOBA("BOOST"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOOST: {NotNull, DOUBLE(17)}
     * @return this. (NotNull)
     */
    public BsDataCrawlingConfigCQ addOrderBy_Boost_Desc() { regOBD("BOOST"); return this; }

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
    public BsDataCrawlingConfigCQ addOrderBy_Available_Asc() { regOBA("AVAILABLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * AVAILABLE: {NotNull, VARCHAR(1)}
     * @return this. (NotNull)
     */
    public BsDataCrawlingConfigCQ addOrderBy_Available_Desc() { regOBD("AVAILABLE"); return this; }

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
    public BsDataCrawlingConfigCQ addOrderBy_SortOrder_Asc() { regOBA("SORT_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORT_ORDER: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsDataCrawlingConfigCQ addOrderBy_SortOrder_Desc() { regOBD("SORT_ORDER"); return this; }

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
    public BsDataCrawlingConfigCQ addOrderBy_CreatedBy_Asc() { regOBA("CREATED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATED_BY: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsDataCrawlingConfigCQ addOrderBy_CreatedBy_Desc() { regOBD("CREATED_BY"); return this; }

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
    public BsDataCrawlingConfigCQ addOrderBy_CreatedTime_Asc() { regOBA("CREATED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsDataCrawlingConfigCQ addOrderBy_CreatedTime_Desc() { regOBD("CREATED_TIME"); return this; }

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
    public BsDataCrawlingConfigCQ addOrderBy_UpdatedBy_Asc() { regOBA("UPDATED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATED_BY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsDataCrawlingConfigCQ addOrderBy_UpdatedBy_Desc() { regOBD("UPDATED_BY"); return this; }

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
    public BsDataCrawlingConfigCQ addOrderBy_UpdatedTime_Asc() { regOBA("UPDATED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATED_TIME: {TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsDataCrawlingConfigCQ addOrderBy_UpdatedTime_Desc() { regOBD("UPDATED_TIME"); return this; }

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
    public BsDataCrawlingConfigCQ addOrderBy_DeletedBy_Asc() { regOBA("DELETED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELETED_BY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsDataCrawlingConfigCQ addOrderBy_DeletedBy_Desc() { regOBD("DELETED_BY"); return this; }

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
    public BsDataCrawlingConfigCQ addOrderBy_DeletedTime_Asc() { regOBA("DELETED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELETED_TIME: {TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsDataCrawlingConfigCQ addOrderBy_DeletedTime_Desc() { regOBD("DELETED_TIME"); return this; }

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
    public BsDataCrawlingConfigCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsDataCrawlingConfigCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsDataCrawlingConfigCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsDataCrawlingConfigCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, DataCrawlingConfigCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DataCrawlingConfigCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, DataCrawlingConfigCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(DataCrawlingConfigCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, DataCrawlingConfigCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(DataCrawlingConfigCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, DataCrawlingConfigCQ> _myselfExistsMap;
    public Map<String, DataCrawlingConfigCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(DataCrawlingConfigCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, DataCrawlingConfigCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(DataCrawlingConfigCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DataCrawlingConfigCB.class.getName(); }
    protected String xCQ() { return DataCrawlingConfigCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
