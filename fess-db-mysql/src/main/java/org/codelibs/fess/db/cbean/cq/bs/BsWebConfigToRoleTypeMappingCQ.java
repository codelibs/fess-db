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
 * The base condition-query of WEB_CONFIG_TO_ROLE_TYPE_MAPPING.
 * @author DBFlute(AutoGenerator)
 */
public class BsWebConfigToRoleTypeMappingCQ extends AbstractBsWebConfigToRoleTypeMappingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WebConfigToRoleTypeMappingCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWebConfigToRoleTypeMappingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WEB_CONFIG_TO_ROLE_TYPE_MAPPING) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WebConfigToRoleTypeMappingCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WebConfigToRoleTypeMappingCIQ xcreateCIQ() {
        WebConfigToRoleTypeMappingCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WebConfigToRoleTypeMappingCIQ xnewCIQ() {
        return new WebConfigToRoleTypeMappingCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WEB_CONFIG_TO_ROLE_TYPE_MAPPING on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WebConfigToRoleTypeMappingCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WebConfigToRoleTypeMappingCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
    public BsWebConfigToRoleTypeMappingCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWebConfigToRoleTypeMappingCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

    protected ConditionValue _webConfigId;
    public ConditionValue xdfgetWebConfigId()
    { if (_webConfigId == null) { _webConfigId = nCV(); }
      return _webConfigId; }
    protected ConditionValue xgetCValueWebConfigId() { return xdfgetWebConfigId(); }

    /** 
     * Add order-by as ascend. <br>
     * WEB_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to WEB_CRAWLING_CONFIG}
     * @return this. (NotNull)
     */
    public BsWebConfigToRoleTypeMappingCQ addOrderBy_WebConfigId_Asc() { regOBA("WEB_CONFIG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * WEB_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to WEB_CRAWLING_CONFIG}
     * @return this. (NotNull)
     */
    public BsWebConfigToRoleTypeMappingCQ addOrderBy_WebConfigId_Desc() { regOBD("WEB_CONFIG_ID"); return this; }

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
    public BsWebConfigToRoleTypeMappingCQ addOrderBy_RoleTypeId_Asc() { regOBA("ROLE_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROLE_TYPE_ID: {IX, NotNull, BIGINT(19), FK to ROLE_TYPE}
     * @return this. (NotNull)
     */
    public BsWebConfigToRoleTypeMappingCQ addOrderBy_RoleTypeId_Desc() { regOBD("ROLE_TYPE_ID"); return this; }

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
    public BsWebConfigToRoleTypeMappingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWebConfigToRoleTypeMappingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WebConfigToRoleTypeMappingCQ bq = (WebConfigToRoleTypeMappingCQ)bqs;
        WebConfigToRoleTypeMappingCQ uq = (WebConfigToRoleTypeMappingCQ)uqs;
        if (bq.hasConditionQueryRoleType()) {
            uq.queryRoleType().reflectRelationOnUnionQuery(bq.queryRoleType(), uq.queryRoleType());
        }
        if (bq.hasConditionQueryWebCrawlingConfig()) {
            uq.queryWebCrawlingConfig().reflectRelationOnUnionQuery(bq.queryWebCrawlingConfig(), uq.queryWebCrawlingConfig());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = xresolveNRP("WEB_CONFIG_TO_ROLE_TYPE_MAPPING", "roleType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new RoleTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "roleType", nrp);
    }
    protected void xsetupOuterJoinRoleType() { xregOutJo("roleType"); }
    public boolean hasConditionQueryRoleType() { return xhasQueRlMap("roleType"); }

    /**
     * Get the condition-query for relation table. <br>
     * WEB_CRAWLING_CONFIG by my WEB_CONFIG_ID, named 'webCrawlingConfig'.
     * @return The instance of condition-query. (NotNull)
     */
    public WebCrawlingConfigCQ queryWebCrawlingConfig() {
        return xdfgetConditionQueryWebCrawlingConfig();
    }
    public WebCrawlingConfigCQ xdfgetConditionQueryWebCrawlingConfig() {
        String prop = "webCrawlingConfig";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWebCrawlingConfig()); xsetupOuterJoinWebCrawlingConfig(); }
        return xgetQueRlMap(prop);
    }
    protected WebCrawlingConfigCQ xcreateQueryWebCrawlingConfig() {
        String nrp = xresolveNRP("WEB_CONFIG_TO_ROLE_TYPE_MAPPING", "webCrawlingConfig"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WebCrawlingConfigCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "webCrawlingConfig", nrp);
    }
    protected void xsetupOuterJoinWebCrawlingConfig() { xregOutJo("webCrawlingConfig"); }
    public boolean hasConditionQueryWebCrawlingConfig() { return xhasQueRlMap("webCrawlingConfig"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WebConfigToRoleTypeMappingCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WebConfigToRoleTypeMappingCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WebConfigToRoleTypeMappingCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WebConfigToRoleTypeMappingCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WebConfigToRoleTypeMappingCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WebConfigToRoleTypeMappingCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WebConfigToRoleTypeMappingCQ> _myselfExistsMap;
    public Map<String, WebConfigToRoleTypeMappingCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WebConfigToRoleTypeMappingCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WebConfigToRoleTypeMappingCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WebConfigToRoleTypeMappingCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WebConfigToRoleTypeMappingCB.class.getName(); }
    protected String xCQ() { return WebConfigToRoleTypeMappingCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
