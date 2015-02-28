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
 * The base condition-query of FILE_CONFIG_TO_LABEL_TYPE_MAPPING.
 * @author DBFlute(AutoGenerator)
 */
public class BsFileConfigToLabelTypeMappingCQ extends AbstractBsFileConfigToLabelTypeMappingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected FileConfigToLabelTypeMappingCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsFileConfigToLabelTypeMappingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from FILE_CONFIG_TO_LABEL_TYPE_MAPPING) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public FileConfigToLabelTypeMappingCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected FileConfigToLabelTypeMappingCIQ xcreateCIQ() {
        FileConfigToLabelTypeMappingCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected FileConfigToLabelTypeMappingCIQ xnewCIQ() {
        return new FileConfigToLabelTypeMappingCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join FILE_CONFIG_TO_LABEL_TYPE_MAPPING on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public FileConfigToLabelTypeMappingCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        FileConfigToLabelTypeMappingCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
    public BsFileConfigToLabelTypeMappingCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsFileConfigToLabelTypeMappingCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

    protected ConditionValue _fileConfigId;
    public ConditionValue xdfgetFileConfigId()
    { if (_fileConfigId == null) { _fileConfigId = nCV(); }
      return _fileConfigId; }
    protected ConditionValue xgetCValueFileConfigId() { return xdfgetFileConfigId(); }

    /** 
     * Add order-by as ascend. <br>
     * FILE_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to FILE_CRAWLING_CONFIG}
     * @return this. (NotNull)
     */
    public BsFileConfigToLabelTypeMappingCQ addOrderBy_FileConfigId_Asc() { regOBA("FILE_CONFIG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FILE_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to FILE_CRAWLING_CONFIG}
     * @return this. (NotNull)
     */
    public BsFileConfigToLabelTypeMappingCQ addOrderBy_FileConfigId_Desc() { regOBD("FILE_CONFIG_ID"); return this; }

    protected ConditionValue _labelTypeId;
    public ConditionValue xdfgetLabelTypeId()
    { if (_labelTypeId == null) { _labelTypeId = nCV(); }
      return _labelTypeId; }
    protected ConditionValue xgetCValueLabelTypeId() { return xdfgetLabelTypeId(); }

    /** 
     * Add order-by as ascend. <br>
     * LABEL_TYPE_ID: {IX, NotNull, BIGINT(19), FK to LABEL_TYPE}
     * @return this. (NotNull)
     */
    public BsFileConfigToLabelTypeMappingCQ addOrderBy_LabelTypeId_Asc() { regOBA("LABEL_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LABEL_TYPE_ID: {IX, NotNull, BIGINT(19), FK to LABEL_TYPE}
     * @return this. (NotNull)
     */
    public BsFileConfigToLabelTypeMappingCQ addOrderBy_LabelTypeId_Desc() { regOBD("LABEL_TYPE_ID"); return this; }

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
    public BsFileConfigToLabelTypeMappingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsFileConfigToLabelTypeMappingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        FileConfigToLabelTypeMappingCQ bq = (FileConfigToLabelTypeMappingCQ)bqs;
        FileConfigToLabelTypeMappingCQ uq = (FileConfigToLabelTypeMappingCQ)uqs;
        if (bq.hasConditionQueryFileCrawlingConfig()) {
            uq.queryFileCrawlingConfig().reflectRelationOnUnionQuery(bq.queryFileCrawlingConfig(), uq.queryFileCrawlingConfig());
        }
        if (bq.hasConditionQueryLabelType()) {
            uq.queryLabelType().reflectRelationOnUnionQuery(bq.queryLabelType(), uq.queryLabelType());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * FILE_CRAWLING_CONFIG by my FILE_CONFIG_ID, named 'fileCrawlingConfig'.
     * @return The instance of condition-query. (NotNull)
     */
    public FileCrawlingConfigCQ queryFileCrawlingConfig() {
        return xdfgetConditionQueryFileCrawlingConfig();
    }
    public FileCrawlingConfigCQ xdfgetConditionQueryFileCrawlingConfig() {
        String prop = "fileCrawlingConfig";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryFileCrawlingConfig()); xsetupOuterJoinFileCrawlingConfig(); }
        return xgetQueRlMap(prop);
    }
    protected FileCrawlingConfigCQ xcreateQueryFileCrawlingConfig() {
        String nrp = xresolveNRP("FILE_CONFIG_TO_LABEL_TYPE_MAPPING", "fileCrawlingConfig"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new FileCrawlingConfigCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "fileCrawlingConfig", nrp);
    }
    protected void xsetupOuterJoinFileCrawlingConfig() { xregOutJo("fileCrawlingConfig"); }
    public boolean hasConditionQueryFileCrawlingConfig() { return xhasQueRlMap("fileCrawlingConfig"); }

    /**
     * Get the condition-query for relation table. <br>
     * LABEL_TYPE by my LABEL_TYPE_ID, named 'labelType'.
     * @return The instance of condition-query. (NotNull)
     */
    public LabelTypeCQ queryLabelType() {
        return xdfgetConditionQueryLabelType();
    }
    public LabelTypeCQ xdfgetConditionQueryLabelType() {
        String prop = "labelType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryLabelType()); xsetupOuterJoinLabelType(); }
        return xgetQueRlMap(prop);
    }
    protected LabelTypeCQ xcreateQueryLabelType() {
        String nrp = xresolveNRP("FILE_CONFIG_TO_LABEL_TYPE_MAPPING", "labelType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LabelTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "labelType", nrp);
    }
    protected void xsetupOuterJoinLabelType() { xregOutJo("labelType"); }
    public boolean hasConditionQueryLabelType() { return xhasQueRlMap("labelType"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, FileConfigToLabelTypeMappingCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(FileConfigToLabelTypeMappingCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, FileConfigToLabelTypeMappingCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(FileConfigToLabelTypeMappingCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, FileConfigToLabelTypeMappingCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(FileConfigToLabelTypeMappingCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, FileConfigToLabelTypeMappingCQ> _myselfExistsMap;
    public Map<String, FileConfigToLabelTypeMappingCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(FileConfigToLabelTypeMappingCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, FileConfigToLabelTypeMappingCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(FileConfigToLabelTypeMappingCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return FileConfigToLabelTypeMappingCB.class.getName(); }
    protected String xCQ() { return FileConfigToLabelTypeMappingCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
