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
 * The base condition-query of FILE_CONFIG_TO_ROLE_TYPE_MAPPING.
 * @author DBFlute(AutoGenerator)
 */
public class BsFileConfigToRoleTypeMappingCQ extends AbstractBsFileConfigToRoleTypeMappingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected FileConfigToRoleTypeMappingCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsFileConfigToRoleTypeMappingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from FILE_CONFIG_TO_ROLE_TYPE_MAPPING) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public FileConfigToRoleTypeMappingCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected FileConfigToRoleTypeMappingCIQ xcreateCIQ() {
        FileConfigToRoleTypeMappingCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected FileConfigToRoleTypeMappingCIQ xnewCIQ() {
        return new FileConfigToRoleTypeMappingCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join FILE_CONFIG_TO_ROLE_TYPE_MAPPING on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public FileConfigToRoleTypeMappingCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        FileConfigToRoleTypeMappingCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
    public BsFileConfigToRoleTypeMappingCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsFileConfigToRoleTypeMappingCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

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
    public BsFileConfigToRoleTypeMappingCQ addOrderBy_FileConfigId_Asc() { regOBA("FILE_CONFIG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FILE_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to FILE_CRAWLING_CONFIG}
     * @return this. (NotNull)
     */
    public BsFileConfigToRoleTypeMappingCQ addOrderBy_FileConfigId_Desc() { regOBD("FILE_CONFIG_ID"); return this; }

    protected ConditionValue _roleTypeId;
    public ConditionValue xdfgetRoleTypeId()
    { if (_roleTypeId == null) { _roleTypeId = nCV(); }
      return _roleTypeId; }
    protected ConditionValue xgetCValueRoleTypeId() { return xdfgetRoleTypeId(); }

    /** 
     * Add order-by as ascend. <br>
     * ROLE_TYPE_ID: {IX, NotNull, BIGINT(19), FK to ROLE_TYPE}
     * @return this. (NotNull)
     */
    public BsFileConfigToRoleTypeMappingCQ addOrderBy_RoleTypeId_Asc() { regOBA("ROLE_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROLE_TYPE_ID: {IX, NotNull, BIGINT(19), FK to ROLE_TYPE}
     * @return this. (NotNull)
     */
    public BsFileConfigToRoleTypeMappingCQ addOrderBy_RoleTypeId_Desc() { regOBD("ROLE_TYPE_ID"); return this; }

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
    public BsFileConfigToRoleTypeMappingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsFileConfigToRoleTypeMappingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        FileConfigToRoleTypeMappingCQ bq = (FileConfigToRoleTypeMappingCQ)bqs;
        FileConfigToRoleTypeMappingCQ uq = (FileConfigToRoleTypeMappingCQ)uqs;
        if (bq.hasConditionQueryFileCrawlingConfig()) {
            uq.queryFileCrawlingConfig().reflectRelationOnUnionQuery(bq.queryFileCrawlingConfig(), uq.queryFileCrawlingConfig());
        }
        if (bq.hasConditionQueryRoleType()) {
            uq.queryRoleType().reflectRelationOnUnionQuery(bq.queryRoleType(), uq.queryRoleType());
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
        String nrp = xresolveNRP("FILE_CONFIG_TO_ROLE_TYPE_MAPPING", "fileCrawlingConfig"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new FileCrawlingConfigCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "fileCrawlingConfig", nrp);
    }
    protected void xsetupOuterJoinFileCrawlingConfig() { xregOutJo("fileCrawlingConfig"); }
    public boolean hasConditionQueryFileCrawlingConfig() { return xhasQueRlMap("fileCrawlingConfig"); }

    /**
     * Get the condition-query for relation table. <br>
     * ROLE_TYPE by my ROLE_TYPE_ID, named 'roleType'.
     * @return The instance of condition-query. (NotNull)
     */
    public RoleTypeCQ queryRoleType() {
        return xdfgetConditionQueryRoleType();
    }
    public RoleTypeCQ xdfgetConditionQueryRoleType() {
        String prop = "roleType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryRoleType()); xsetupOuterJoinRoleType(); }
        return xgetQueRlMap(prop);
    }
    protected RoleTypeCQ xcreateQueryRoleType() {
        String nrp = xresolveNRP("FILE_CONFIG_TO_ROLE_TYPE_MAPPING", "roleType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new RoleTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "roleType", nrp);
    }
    protected void xsetupOuterJoinRoleType() { xregOutJo("roleType"); }
    public boolean hasConditionQueryRoleType() { return xhasQueRlMap("roleType"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, FileConfigToRoleTypeMappingCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(FileConfigToRoleTypeMappingCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, FileConfigToRoleTypeMappingCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(FileConfigToRoleTypeMappingCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, FileConfigToRoleTypeMappingCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(FileConfigToRoleTypeMappingCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, FileConfigToRoleTypeMappingCQ> _myselfExistsMap;
    public Map<String, FileConfigToRoleTypeMappingCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(FileConfigToRoleTypeMappingCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, FileConfigToRoleTypeMappingCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(FileConfigToRoleTypeMappingCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return FileConfigToRoleTypeMappingCB.class.getName(); }
    protected String xCQ() { return FileConfigToRoleTypeMappingCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
