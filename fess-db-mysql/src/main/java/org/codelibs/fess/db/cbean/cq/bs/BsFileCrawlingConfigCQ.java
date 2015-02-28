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
 * The base condition-query of FILE_CRAWLING_CONFIG.
 * @author DBFlute(AutoGenerator)
 */
public class BsFileCrawlingConfigCQ extends AbstractBsFileCrawlingConfigCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected FileCrawlingConfigCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsFileCrawlingConfigCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from FILE_CRAWLING_CONFIG) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public FileCrawlingConfigCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected FileCrawlingConfigCIQ xcreateCIQ() {
        FileCrawlingConfigCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected FileCrawlingConfigCIQ xnewCIQ() {
        return new FileCrawlingConfigCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join FILE_CRAWLING_CONFIG on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public FileCrawlingConfigCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        FileCrawlingConfigCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    public Map<String, FileAuthenticationCQ> xdfgetId_ExistsReferrer_FileAuthenticationList() { return xgetSQueMap("id_ExistsReferrer_FileAuthenticationList"); }
    public String keepId_ExistsReferrer_FileAuthenticationList(FileAuthenticationCQ sq) { return xkeepSQue("id_ExistsReferrer_FileAuthenticationList", sq); }

    public Map<String, FileConfigToLabelTypeMappingCQ> xdfgetId_ExistsReferrer_FileConfigToLabelTypeMappingList() { return xgetSQueMap("id_ExistsReferrer_FileConfigToLabelTypeMappingList"); }
    public String keepId_ExistsReferrer_FileConfigToLabelTypeMappingList(FileConfigToLabelTypeMappingCQ sq) { return xkeepSQue("id_ExistsReferrer_FileConfigToLabelTypeMappingList", sq); }

    public Map<String, FileConfigToRoleTypeMappingCQ> xdfgetId_ExistsReferrer_FileConfigToRoleTypeMappingList() { return xgetSQueMap("id_ExistsReferrer_FileConfigToRoleTypeMappingList"); }
    public String keepId_ExistsReferrer_FileConfigToRoleTypeMappingList(FileConfigToRoleTypeMappingCQ sq) { return xkeepSQue("id_ExistsReferrer_FileConfigToRoleTypeMappingList", sq); }

    public Map<String, FileAuthenticationCQ> xdfgetId_NotExistsReferrer_FileAuthenticationList() { return xgetSQueMap("id_NotExistsReferrer_FileAuthenticationList"); }
    public String keepId_NotExistsReferrer_FileAuthenticationList(FileAuthenticationCQ sq) { return xkeepSQue("id_NotExistsReferrer_FileAuthenticationList", sq); }

    public Map<String, FileConfigToLabelTypeMappingCQ> xdfgetId_NotExistsReferrer_FileConfigToLabelTypeMappingList() { return xgetSQueMap("id_NotExistsReferrer_FileConfigToLabelTypeMappingList"); }
    public String keepId_NotExistsReferrer_FileConfigToLabelTypeMappingList(FileConfigToLabelTypeMappingCQ sq) { return xkeepSQue("id_NotExistsReferrer_FileConfigToLabelTypeMappingList", sq); }

    public Map<String, FileConfigToRoleTypeMappingCQ> xdfgetId_NotExistsReferrer_FileConfigToRoleTypeMappingList() { return xgetSQueMap("id_NotExistsReferrer_FileConfigToRoleTypeMappingList"); }
    public String keepId_NotExistsReferrer_FileConfigToRoleTypeMappingList(FileConfigToRoleTypeMappingCQ sq) { return xkeepSQue("id_NotExistsReferrer_FileConfigToRoleTypeMappingList", sq); }

    public Map<String, FileAuthenticationCQ> xdfgetId_SpecifyDerivedReferrer_FileAuthenticationList() { return xgetSQueMap("id_SpecifyDerivedReferrer_FileAuthenticationList"); }
    public String keepId_SpecifyDerivedReferrer_FileAuthenticationList(FileAuthenticationCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_FileAuthenticationList", sq); }

    public Map<String, FileConfigToLabelTypeMappingCQ> xdfgetId_SpecifyDerivedReferrer_FileConfigToLabelTypeMappingList() { return xgetSQueMap("id_SpecifyDerivedReferrer_FileConfigToLabelTypeMappingList"); }
    public String keepId_SpecifyDerivedReferrer_FileConfigToLabelTypeMappingList(FileConfigToLabelTypeMappingCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_FileConfigToLabelTypeMappingList", sq); }

    public Map<String, FileConfigToRoleTypeMappingCQ> xdfgetId_SpecifyDerivedReferrer_FileConfigToRoleTypeMappingList() { return xgetSQueMap("id_SpecifyDerivedReferrer_FileConfigToRoleTypeMappingList"); }
    public String keepId_SpecifyDerivedReferrer_FileConfigToRoleTypeMappingList(FileConfigToRoleTypeMappingCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_FileConfigToRoleTypeMappingList", sq); }

    public Map<String, FileAuthenticationCQ> xdfgetId_QueryDerivedReferrer_FileAuthenticationList() { return xgetSQueMap("id_QueryDerivedReferrer_FileAuthenticationList"); }
    public String keepId_QueryDerivedReferrer_FileAuthenticationList(FileAuthenticationCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_FileAuthenticationList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_FileAuthenticationListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_FileAuthenticationList"); }
    public String keepId_QueryDerivedReferrer_FileAuthenticationListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_FileAuthenticationList", pm); }

    public Map<String, FileConfigToLabelTypeMappingCQ> xdfgetId_QueryDerivedReferrer_FileConfigToLabelTypeMappingList() { return xgetSQueMap("id_QueryDerivedReferrer_FileConfigToLabelTypeMappingList"); }
    public String keepId_QueryDerivedReferrer_FileConfigToLabelTypeMappingList(FileConfigToLabelTypeMappingCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_FileConfigToLabelTypeMappingList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_FileConfigToLabelTypeMappingListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_FileConfigToLabelTypeMappingList"); }
    public String keepId_QueryDerivedReferrer_FileConfigToLabelTypeMappingListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_FileConfigToLabelTypeMappingList", pm); }

    public Map<String, FileConfigToRoleTypeMappingCQ> xdfgetId_QueryDerivedReferrer_FileConfigToRoleTypeMappingList() { return xgetSQueMap("id_QueryDerivedReferrer_FileConfigToRoleTypeMappingList"); }
    public String keepId_QueryDerivedReferrer_FileConfigToRoleTypeMappingList(FileConfigToRoleTypeMappingCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_FileConfigToRoleTypeMappingList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_FileConfigToRoleTypeMappingListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_FileConfigToRoleTypeMappingList"); }
    public String keepId_QueryDerivedReferrer_FileConfigToRoleTypeMappingListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_FileConfigToRoleTypeMappingList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

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
    public BsFileCrawlingConfigCQ addOrderBy_Name_Asc() { regOBA("NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_Name_Desc() { regOBD("NAME"); return this; }

    protected ConditionValue _paths;
    public ConditionValue xdfgetPaths()
    { if (_paths == null) { _paths = nCV(); }
      return _paths; }
    protected ConditionValue xgetCValuePaths() { return xdfgetPaths(); }

    /** 
     * Add order-by as ascend. <br>
     * PATHS: {NotNull, TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_Paths_Asc() { regOBA("PATHS"); return this; }

    /**
     * Add order-by as descend. <br>
     * PATHS: {NotNull, TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_Paths_Desc() { regOBD("PATHS"); return this; }

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
    public BsFileCrawlingConfigCQ addOrderBy_IncludedPaths_Asc() { regOBA("INCLUDED_PATHS"); return this; }

    /**
     * Add order-by as descend. <br>
     * INCLUDED_PATHS: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_IncludedPaths_Desc() { regOBD("INCLUDED_PATHS"); return this; }

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
    public BsFileCrawlingConfigCQ addOrderBy_ExcludedPaths_Asc() { regOBA("EXCLUDED_PATHS"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXCLUDED_PATHS: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_ExcludedPaths_Desc() { regOBD("EXCLUDED_PATHS"); return this; }

    protected ConditionValue _includedDocPaths;
    public ConditionValue xdfgetIncludedDocPaths()
    { if (_includedDocPaths == null) { _includedDocPaths = nCV(); }
      return _includedDocPaths; }
    protected ConditionValue xgetCValueIncludedDocPaths() { return xdfgetIncludedDocPaths(); }

    /** 
     * Add order-by as ascend. <br>
     * INCLUDED_DOC_PATHS: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_IncludedDocPaths_Asc() { regOBA("INCLUDED_DOC_PATHS"); return this; }

    /**
     * Add order-by as descend. <br>
     * INCLUDED_DOC_PATHS: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_IncludedDocPaths_Desc() { regOBD("INCLUDED_DOC_PATHS"); return this; }

    protected ConditionValue _excludedDocPaths;
    public ConditionValue xdfgetExcludedDocPaths()
    { if (_excludedDocPaths == null) { _excludedDocPaths = nCV(); }
      return _excludedDocPaths; }
    protected ConditionValue xgetCValueExcludedDocPaths() { return xdfgetExcludedDocPaths(); }

    /** 
     * Add order-by as ascend. <br>
     * EXCLUDED_DOC_PATHS: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_ExcludedDocPaths_Asc() { regOBA("EXCLUDED_DOC_PATHS"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXCLUDED_DOC_PATHS: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_ExcludedDocPaths_Desc() { regOBD("EXCLUDED_DOC_PATHS"); return this; }

    protected ConditionValue _configParameter;
    public ConditionValue xdfgetConfigParameter()
    { if (_configParameter == null) { _configParameter = nCV(); }
      return _configParameter; }
    protected ConditionValue xgetCValueConfigParameter() { return xdfgetConfigParameter(); }

    /** 
     * Add order-by as ascend. <br>
     * CONFIG_PARAMETER: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_ConfigParameter_Asc() { regOBA("CONFIG_PARAMETER"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONFIG_PARAMETER: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_ConfigParameter_Desc() { regOBD("CONFIG_PARAMETER"); return this; }

    protected ConditionValue _depth;
    public ConditionValue xdfgetDepth()
    { if (_depth == null) { _depth = nCV(); }
      return _depth; }
    protected ConditionValue xgetCValueDepth() { return xdfgetDepth(); }

    /** 
     * Add order-by as ascend. <br>
     * DEPTH: {INT(10)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_Depth_Asc() { regOBA("DEPTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPTH: {INT(10)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_Depth_Desc() { regOBD("DEPTH"); return this; }

    protected ConditionValue _maxAccessCount;
    public ConditionValue xdfgetMaxAccessCount()
    { if (_maxAccessCount == null) { _maxAccessCount = nCV(); }
      return _maxAccessCount; }
    protected ConditionValue xgetCValueMaxAccessCount() { return xdfgetMaxAccessCount(); }

    /** 
     * Add order-by as ascend. <br>
     * MAX_ACCESS_COUNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_MaxAccessCount_Asc() { regOBA("MAX_ACCESS_COUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAX_ACCESS_COUNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_MaxAccessCount_Desc() { regOBD("MAX_ACCESS_COUNT"); return this; }

    protected ConditionValue _numOfThread;
    public ConditionValue xdfgetNumOfThread()
    { if (_numOfThread == null) { _numOfThread = nCV(); }
      return _numOfThread; }
    protected ConditionValue xgetCValueNumOfThread() { return xdfgetNumOfThread(); }

    /** 
     * Add order-by as ascend. <br>
     * NUM_OF_THREAD: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_NumOfThread_Asc() { regOBA("NUM_OF_THREAD"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUM_OF_THREAD: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_NumOfThread_Desc() { regOBD("NUM_OF_THREAD"); return this; }

    protected ConditionValue _intervalTime;
    public ConditionValue xdfgetIntervalTime()
    { if (_intervalTime == null) { _intervalTime = nCV(); }
      return _intervalTime; }
    protected ConditionValue xgetCValueIntervalTime() { return xdfgetIntervalTime(); }

    /** 
     * Add order-by as ascend. <br>
     * INTERVAL_TIME: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_IntervalTime_Asc() { regOBA("INTERVAL_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * INTERVAL_TIME: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_IntervalTime_Desc() { regOBD("INTERVAL_TIME"); return this; }

    protected ConditionValue _boost;
    public ConditionValue xdfgetBoost()
    { if (_boost == null) { _boost = nCV(); }
      return _boost; }
    protected ConditionValue xgetCValueBoost() { return xdfgetBoost(); }

    /** 
     * Add order-by as ascend. <br>
     * BOOST: {NotNull, FLOAT(12)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_Boost_Asc() { regOBA("BOOST"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOOST: {NotNull, FLOAT(12)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_Boost_Desc() { regOBD("BOOST"); return this; }

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
    public BsFileCrawlingConfigCQ addOrderBy_Available_Asc() { regOBA("AVAILABLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * AVAILABLE: {NotNull, VARCHAR(1)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_Available_Desc() { regOBD("AVAILABLE"); return this; }

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
    public BsFileCrawlingConfigCQ addOrderBy_SortOrder_Asc() { regOBA("SORT_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORT_ORDER: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_SortOrder_Desc() { regOBD("SORT_ORDER"); return this; }

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
    public BsFileCrawlingConfigCQ addOrderBy_CreatedBy_Asc() { regOBA("CREATED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATED_BY: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_CreatedBy_Desc() { regOBD("CREATED_BY"); return this; }

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
    public BsFileCrawlingConfigCQ addOrderBy_CreatedTime_Asc() { regOBA("CREATED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_CreatedTime_Desc() { regOBD("CREATED_TIME"); return this; }

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
    public BsFileCrawlingConfigCQ addOrderBy_UpdatedBy_Asc() { regOBA("UPDATED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATED_BY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_UpdatedBy_Desc() { regOBD("UPDATED_BY"); return this; }

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
    public BsFileCrawlingConfigCQ addOrderBy_UpdatedTime_Asc() { regOBA("UPDATED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_UpdatedTime_Desc() { regOBD("UPDATED_TIME"); return this; }

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
    public BsFileCrawlingConfigCQ addOrderBy_DeletedBy_Asc() { regOBA("DELETED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELETED_BY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_DeletedBy_Desc() { regOBD("DELETED_BY"); return this; }

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
    public BsFileCrawlingConfigCQ addOrderBy_DeletedTime_Asc() { regOBA("DELETED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELETED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_DeletedTime_Desc() { regOBD("DELETED_TIME"); return this; }

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
    public BsFileCrawlingConfigCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsFileCrawlingConfigCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsFileCrawlingConfigCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsFileCrawlingConfigCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, FileCrawlingConfigCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(FileCrawlingConfigCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, FileCrawlingConfigCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(FileCrawlingConfigCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, FileCrawlingConfigCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(FileCrawlingConfigCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, FileCrawlingConfigCQ> _myselfExistsMap;
    public Map<String, FileCrawlingConfigCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(FileCrawlingConfigCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, FileCrawlingConfigCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(FileCrawlingConfigCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return FileCrawlingConfigCB.class.getName(); }
    protected String xCQ() { return FileCrawlingConfigCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
