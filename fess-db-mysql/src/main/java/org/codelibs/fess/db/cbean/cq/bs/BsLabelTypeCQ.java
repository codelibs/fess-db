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
 * The base condition-query of LABEL_TYPE.
 * @author DBFlute(AutoGenerator)
 */
public class BsLabelTypeCQ extends AbstractBsLabelTypeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LabelTypeCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsLabelTypeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from LABEL_TYPE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LabelTypeCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LabelTypeCIQ xcreateCIQ() {
        LabelTypeCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LabelTypeCIQ xnewCIQ() {
        return new LabelTypeCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join LABEL_TYPE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LabelTypeCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LabelTypeCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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

    public Map<String, FileConfigToLabelTypeMappingCQ> xdfgetId_ExistsReferrer_FileConfigToLabelTypeMappingList() { return xgetSQueMap("id_ExistsReferrer_FileConfigToLabelTypeMappingList"); }
    public String keepId_ExistsReferrer_FileConfigToLabelTypeMappingList(FileConfigToLabelTypeMappingCQ sq) { return xkeepSQue("id_ExistsReferrer_FileConfigToLabelTypeMappingList", sq); }

    public Map<String, LabelTypeToRoleTypeMappingCQ> xdfgetId_ExistsReferrer_LabelTypeToRoleTypeMappingList() { return xgetSQueMap("id_ExistsReferrer_LabelTypeToRoleTypeMappingList"); }
    public String keepId_ExistsReferrer_LabelTypeToRoleTypeMappingList(LabelTypeToRoleTypeMappingCQ sq) { return xkeepSQue("id_ExistsReferrer_LabelTypeToRoleTypeMappingList", sq); }

    public Map<String, WebConfigToLabelTypeMappingCQ> xdfgetId_ExistsReferrer_WebConfigToLabelTypeMappingList() { return xgetSQueMap("id_ExistsReferrer_WebConfigToLabelTypeMappingList"); }
    public String keepId_ExistsReferrer_WebConfigToLabelTypeMappingList(WebConfigToLabelTypeMappingCQ sq) { return xkeepSQue("id_ExistsReferrer_WebConfigToLabelTypeMappingList", sq); }

    public Map<String, DataConfigToLabelTypeMappingCQ> xdfgetId_NotExistsReferrer_DataConfigToLabelTypeMappingList() { return xgetSQueMap("id_NotExistsReferrer_DataConfigToLabelTypeMappingList"); }
    public String keepId_NotExistsReferrer_DataConfigToLabelTypeMappingList(DataConfigToLabelTypeMappingCQ sq) { return xkeepSQue("id_NotExistsReferrer_DataConfigToLabelTypeMappingList", sq); }

    public Map<String, FileConfigToLabelTypeMappingCQ> xdfgetId_NotExistsReferrer_FileConfigToLabelTypeMappingList() { return xgetSQueMap("id_NotExistsReferrer_FileConfigToLabelTypeMappingList"); }
    public String keepId_NotExistsReferrer_FileConfigToLabelTypeMappingList(FileConfigToLabelTypeMappingCQ sq) { return xkeepSQue("id_NotExistsReferrer_FileConfigToLabelTypeMappingList", sq); }

    public Map<String, LabelTypeToRoleTypeMappingCQ> xdfgetId_NotExistsReferrer_LabelTypeToRoleTypeMappingList() { return xgetSQueMap("id_NotExistsReferrer_LabelTypeToRoleTypeMappingList"); }
    public String keepId_NotExistsReferrer_LabelTypeToRoleTypeMappingList(LabelTypeToRoleTypeMappingCQ sq) { return xkeepSQue("id_NotExistsReferrer_LabelTypeToRoleTypeMappingList", sq); }

    public Map<String, WebConfigToLabelTypeMappingCQ> xdfgetId_NotExistsReferrer_WebConfigToLabelTypeMappingList() { return xgetSQueMap("id_NotExistsReferrer_WebConfigToLabelTypeMappingList"); }
    public String keepId_NotExistsReferrer_WebConfigToLabelTypeMappingList(WebConfigToLabelTypeMappingCQ sq) { return xkeepSQue("id_NotExistsReferrer_WebConfigToLabelTypeMappingList", sq); }

    public Map<String, DataConfigToLabelTypeMappingCQ> xdfgetId_SpecifyDerivedReferrer_DataConfigToLabelTypeMappingList() { return xgetSQueMap("id_SpecifyDerivedReferrer_DataConfigToLabelTypeMappingList"); }
    public String keepId_SpecifyDerivedReferrer_DataConfigToLabelTypeMappingList(DataConfigToLabelTypeMappingCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_DataConfigToLabelTypeMappingList", sq); }

    public Map<String, FileConfigToLabelTypeMappingCQ> xdfgetId_SpecifyDerivedReferrer_FileConfigToLabelTypeMappingList() { return xgetSQueMap("id_SpecifyDerivedReferrer_FileConfigToLabelTypeMappingList"); }
    public String keepId_SpecifyDerivedReferrer_FileConfigToLabelTypeMappingList(FileConfigToLabelTypeMappingCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_FileConfigToLabelTypeMappingList", sq); }

    public Map<String, LabelTypeToRoleTypeMappingCQ> xdfgetId_SpecifyDerivedReferrer_LabelTypeToRoleTypeMappingList() { return xgetSQueMap("id_SpecifyDerivedReferrer_LabelTypeToRoleTypeMappingList"); }
    public String keepId_SpecifyDerivedReferrer_LabelTypeToRoleTypeMappingList(LabelTypeToRoleTypeMappingCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_LabelTypeToRoleTypeMappingList", sq); }

    public Map<String, WebConfigToLabelTypeMappingCQ> xdfgetId_SpecifyDerivedReferrer_WebConfigToLabelTypeMappingList() { return xgetSQueMap("id_SpecifyDerivedReferrer_WebConfigToLabelTypeMappingList"); }
    public String keepId_SpecifyDerivedReferrer_WebConfigToLabelTypeMappingList(WebConfigToLabelTypeMappingCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_WebConfigToLabelTypeMappingList", sq); }

    public Map<String, DataConfigToLabelTypeMappingCQ> xdfgetId_QueryDerivedReferrer_DataConfigToLabelTypeMappingList() { return xgetSQueMap("id_QueryDerivedReferrer_DataConfigToLabelTypeMappingList"); }
    public String keepId_QueryDerivedReferrer_DataConfigToLabelTypeMappingList(DataConfigToLabelTypeMappingCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_DataConfigToLabelTypeMappingList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_DataConfigToLabelTypeMappingListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_DataConfigToLabelTypeMappingList"); }
    public String keepId_QueryDerivedReferrer_DataConfigToLabelTypeMappingListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_DataConfigToLabelTypeMappingList", pm); }

    public Map<String, FileConfigToLabelTypeMappingCQ> xdfgetId_QueryDerivedReferrer_FileConfigToLabelTypeMappingList() { return xgetSQueMap("id_QueryDerivedReferrer_FileConfigToLabelTypeMappingList"); }
    public String keepId_QueryDerivedReferrer_FileConfigToLabelTypeMappingList(FileConfigToLabelTypeMappingCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_FileConfigToLabelTypeMappingList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_FileConfigToLabelTypeMappingListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_FileConfigToLabelTypeMappingList"); }
    public String keepId_QueryDerivedReferrer_FileConfigToLabelTypeMappingListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_FileConfigToLabelTypeMappingList", pm); }

    public Map<String, LabelTypeToRoleTypeMappingCQ> xdfgetId_QueryDerivedReferrer_LabelTypeToRoleTypeMappingList() { return xgetSQueMap("id_QueryDerivedReferrer_LabelTypeToRoleTypeMappingList"); }
    public String keepId_QueryDerivedReferrer_LabelTypeToRoleTypeMappingList(LabelTypeToRoleTypeMappingCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_LabelTypeToRoleTypeMappingList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_LabelTypeToRoleTypeMappingListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_LabelTypeToRoleTypeMappingList"); }
    public String keepId_QueryDerivedReferrer_LabelTypeToRoleTypeMappingListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_LabelTypeToRoleTypeMappingList", pm); }

    public Map<String, WebConfigToLabelTypeMappingCQ> xdfgetId_QueryDerivedReferrer_WebConfigToLabelTypeMappingList() { return xgetSQueMap("id_QueryDerivedReferrer_WebConfigToLabelTypeMappingList"); }
    public String keepId_QueryDerivedReferrer_WebConfigToLabelTypeMappingList(WebConfigToLabelTypeMappingCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_WebConfigToLabelTypeMappingList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_WebConfigToLabelTypeMappingListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_WebConfigToLabelTypeMappingList"); }
    public String keepId_QueryDerivedReferrer_WebConfigToLabelTypeMappingListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_WebConfigToLabelTypeMappingList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsLabelTypeCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsLabelTypeCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

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
    public BsLabelTypeCQ addOrderBy_Name_Asc() { regOBA("NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * NAME: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsLabelTypeCQ addOrderBy_Name_Desc() { regOBD("NAME"); return this; }

    protected ConditionValue _value;
    public ConditionValue xdfgetValue()
    { if (_value == null) { _value = nCV(); }
      return _value; }
    protected ConditionValue xgetCValueValue() { return xdfgetValue(); }

    /** 
     * Add order-by as ascend. <br>
     * VALUE: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsLabelTypeCQ addOrderBy_Value_Asc() { regOBA("VALUE"); return this; }

    /**
     * Add order-by as descend. <br>
     * VALUE: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsLabelTypeCQ addOrderBy_Value_Desc() { regOBD("VALUE"); return this; }

    protected ConditionValue _includedPaths;
    public ConditionValue xdfgetIncludedPaths()
    { if (_includedPaths == null) { _includedPaths = nCV(); }
      return _includedPaths; }
    protected ConditionValue xgetCValueIncludedPaths() { return xdfgetIncludedPaths(); }

    /** 
     * Add order-by as ascend. <br>
     * INCLUDED_PATHS: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsLabelTypeCQ addOrderBy_IncludedPaths_Asc() { regOBA("INCLUDED_PATHS"); return this; }

    /**
     * Add order-by as descend. <br>
     * INCLUDED_PATHS: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsLabelTypeCQ addOrderBy_IncludedPaths_Desc() { regOBD("INCLUDED_PATHS"); return this; }

    protected ConditionValue _excludedPaths;
    public ConditionValue xdfgetExcludedPaths()
    { if (_excludedPaths == null) { _excludedPaths = nCV(); }
      return _excludedPaths; }
    protected ConditionValue xgetCValueExcludedPaths() { return xdfgetExcludedPaths(); }

    /** 
     * Add order-by as ascend. <br>
     * EXCLUDED_PATHS: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsLabelTypeCQ addOrderBy_ExcludedPaths_Asc() { regOBA("EXCLUDED_PATHS"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXCLUDED_PATHS: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsLabelTypeCQ addOrderBy_ExcludedPaths_Desc() { regOBD("EXCLUDED_PATHS"); return this; }

    protected ConditionValue _sortOrder;
    public ConditionValue xdfgetSortOrder()
    { if (_sortOrder == null) { _sortOrder = nCV(); }
      return _sortOrder; }
    protected ConditionValue xgetCValueSortOrder() { return xdfgetSortOrder(); }

    /** 
     * Add order-by as ascend. <br>
     * SORT_ORDER: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsLabelTypeCQ addOrderBy_SortOrder_Asc() { regOBA("SORT_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORT_ORDER: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsLabelTypeCQ addOrderBy_SortOrder_Desc() { regOBD("SORT_ORDER"); return this; }

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
    public BsLabelTypeCQ addOrderBy_CreatedBy_Asc() { regOBA("CREATED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATED_BY: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsLabelTypeCQ addOrderBy_CreatedBy_Desc() { regOBD("CREATED_BY"); return this; }

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
    public BsLabelTypeCQ addOrderBy_CreatedTime_Asc() { regOBA("CREATED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsLabelTypeCQ addOrderBy_CreatedTime_Desc() { regOBD("CREATED_TIME"); return this; }

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
    public BsLabelTypeCQ addOrderBy_UpdatedBy_Asc() { regOBA("UPDATED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATED_BY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsLabelTypeCQ addOrderBy_UpdatedBy_Desc() { regOBD("UPDATED_BY"); return this; }

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
    public BsLabelTypeCQ addOrderBy_UpdatedTime_Asc() { regOBA("UPDATED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @return this. (NotNull)
     */
    public BsLabelTypeCQ addOrderBy_UpdatedTime_Desc() { regOBD("UPDATED_TIME"); return this; }

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
    public BsLabelTypeCQ addOrderBy_DeletedBy_Asc() { regOBA("DELETED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELETED_BY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsLabelTypeCQ addOrderBy_DeletedBy_Desc() { regOBD("DELETED_BY"); return this; }

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
    public BsLabelTypeCQ addOrderBy_DeletedTime_Asc() { regOBA("DELETED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELETED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @return this. (NotNull)
     */
    public BsLabelTypeCQ addOrderBy_DeletedTime_Desc() { regOBD("DELETED_TIME"); return this; }

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
    public BsLabelTypeCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsLabelTypeCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsLabelTypeCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsLabelTypeCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, LabelTypeCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LabelTypeCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LabelTypeCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LabelTypeCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LabelTypeCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LabelTypeCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LabelTypeCQ> _myselfExistsMap;
    public Map<String, LabelTypeCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LabelTypeCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LabelTypeCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LabelTypeCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LabelTypeCB.class.getName(); }
    protected String xCQ() { return LabelTypeCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
