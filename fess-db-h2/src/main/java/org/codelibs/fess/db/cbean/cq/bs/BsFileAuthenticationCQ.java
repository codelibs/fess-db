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
 * The base condition-query of FILE_AUTHENTICATION.
 * @author DBFlute(AutoGenerator)
 */
public class BsFileAuthenticationCQ extends AbstractBsFileAuthenticationCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected FileAuthenticationCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsFileAuthenticationCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from FILE_AUTHENTICATION) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public FileAuthenticationCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected FileAuthenticationCIQ xcreateCIQ() {
        FileAuthenticationCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected FileAuthenticationCIQ xnewCIQ() {
        return new FileAuthenticationCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join FILE_AUTHENTICATION on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public FileAuthenticationCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        FileAuthenticationCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
    public BsFileAuthenticationCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsFileAuthenticationCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

    protected ConditionValue _hostname;
    public ConditionValue xdfgetHostname()
    { if (_hostname == null) { _hostname = nCV(); }
      return _hostname; }
    protected ConditionValue xgetCValueHostname() { return xdfgetHostname(); }

    /** 
     * Add order-by as ascend. <br>
     * HOSTNAME: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsFileAuthenticationCQ addOrderBy_Hostname_Asc() { regOBA("HOSTNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * HOSTNAME: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsFileAuthenticationCQ addOrderBy_Hostname_Desc() { regOBD("HOSTNAME"); return this; }

    protected ConditionValue _port;
    public ConditionValue xdfgetPort()
    { if (_port == null) { _port = nCV(); }
      return _port; }
    protected ConditionValue xgetCValuePort() { return xdfgetPort(); }

    /** 
     * Add order-by as ascend. <br>
     * PORT: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsFileAuthenticationCQ addOrderBy_Port_Asc() { regOBA("PORT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PORT: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsFileAuthenticationCQ addOrderBy_Port_Desc() { regOBD("PORT"); return this; }

    protected ConditionValue _protocolScheme;
    public ConditionValue xdfgetProtocolScheme()
    { if (_protocolScheme == null) { _protocolScheme = nCV(); }
      return _protocolScheme; }
    protected ConditionValue xgetCValueProtocolScheme() { return xdfgetProtocolScheme(); }

    /** 
     * Add order-by as ascend. <br>
     * PROTOCOL_SCHEME: {VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsFileAuthenticationCQ addOrderBy_ProtocolScheme_Asc() { regOBA("PROTOCOL_SCHEME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROTOCOL_SCHEME: {VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsFileAuthenticationCQ addOrderBy_ProtocolScheme_Desc() { regOBD("PROTOCOL_SCHEME"); return this; }

    protected ConditionValue _username;
    public ConditionValue xdfgetUsername()
    { if (_username == null) { _username = nCV(); }
      return _username; }
    protected ConditionValue xgetCValueUsername() { return xdfgetUsername(); }

    /** 
     * Add order-by as ascend. <br>
     * USERNAME: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsFileAuthenticationCQ addOrderBy_Username_Asc() { regOBA("USERNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERNAME: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsFileAuthenticationCQ addOrderBy_Username_Desc() { regOBD("USERNAME"); return this; }

    protected ConditionValue _password;
    public ConditionValue xdfgetPassword()
    { if (_password == null) { _password = nCV(); }
      return _password; }
    protected ConditionValue xgetCValuePassword() { return xdfgetPassword(); }

    /** 
     * Add order-by as ascend. <br>
     * PASSWORD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsFileAuthenticationCQ addOrderBy_Password_Asc() { regOBA("PASSWORD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PASSWORD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsFileAuthenticationCQ addOrderBy_Password_Desc() { regOBD("PASSWORD"); return this; }

    protected ConditionValue _parameters;
    public ConditionValue xdfgetParameters()
    { if (_parameters == null) { _parameters = nCV(); }
      return _parameters; }
    protected ConditionValue xgetCValueParameters() { return xdfgetParameters(); }

    /** 
     * Add order-by as ascend. <br>
     * PARAMETERS: {VARCHAR(1000)}
     * @return this. (NotNull)
     */
    public BsFileAuthenticationCQ addOrderBy_Parameters_Asc() { regOBA("PARAMETERS"); return this; }

    /**
     * Add order-by as descend. <br>
     * PARAMETERS: {VARCHAR(1000)}
     * @return this. (NotNull)
     */
    public BsFileAuthenticationCQ addOrderBy_Parameters_Desc() { regOBD("PARAMETERS"); return this; }

    protected ConditionValue _fileCrawlingConfigId;
    public ConditionValue xdfgetFileCrawlingConfigId()
    { if (_fileCrawlingConfigId == null) { _fileCrawlingConfigId = nCV(); }
      return _fileCrawlingConfigId; }
    protected ConditionValue xgetCValueFileCrawlingConfigId() { return xdfgetFileCrawlingConfigId(); }

    /** 
     * Add order-by as ascend. <br>
     * FILE_CRAWLING_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to FILE_CRAWLING_CONFIG}
     * @return this. (NotNull)
     */
    public BsFileAuthenticationCQ addOrderBy_FileCrawlingConfigId_Asc() { regOBA("FILE_CRAWLING_CONFIG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FILE_CRAWLING_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to FILE_CRAWLING_CONFIG}
     * @return this. (NotNull)
     */
    public BsFileAuthenticationCQ addOrderBy_FileCrawlingConfigId_Desc() { regOBD("FILE_CRAWLING_CONFIG_ID"); return this; }

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
    public BsFileAuthenticationCQ addOrderBy_CreatedBy_Asc() { regOBA("CREATED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATED_BY: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsFileAuthenticationCQ addOrderBy_CreatedBy_Desc() { regOBD("CREATED_BY"); return this; }

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
    public BsFileAuthenticationCQ addOrderBy_CreatedTime_Asc() { regOBA("CREATED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsFileAuthenticationCQ addOrderBy_CreatedTime_Desc() { regOBD("CREATED_TIME"); return this; }

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
    public BsFileAuthenticationCQ addOrderBy_UpdatedBy_Asc() { regOBA("UPDATED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATED_BY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsFileAuthenticationCQ addOrderBy_UpdatedBy_Desc() { regOBD("UPDATED_BY"); return this; }

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
    public BsFileAuthenticationCQ addOrderBy_UpdatedTime_Asc() { regOBA("UPDATED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATED_TIME: {TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsFileAuthenticationCQ addOrderBy_UpdatedTime_Desc() { regOBD("UPDATED_TIME"); return this; }

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
    public BsFileAuthenticationCQ addOrderBy_DeletedBy_Asc() { regOBA("DELETED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELETED_BY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsFileAuthenticationCQ addOrderBy_DeletedBy_Desc() { regOBD("DELETED_BY"); return this; }

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
    public BsFileAuthenticationCQ addOrderBy_DeletedTime_Asc() { regOBA("DELETED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELETED_TIME: {TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsFileAuthenticationCQ addOrderBy_DeletedTime_Desc() { regOBD("DELETED_TIME"); return this; }

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
    public BsFileAuthenticationCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsFileAuthenticationCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsFileAuthenticationCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsFileAuthenticationCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        FileAuthenticationCQ bq = (FileAuthenticationCQ)bqs;
        FileAuthenticationCQ uq = (FileAuthenticationCQ)uqs;
        if (bq.hasConditionQueryFileCrawlingConfig()) {
            uq.queryFileCrawlingConfig().reflectRelationOnUnionQuery(bq.queryFileCrawlingConfig(), uq.queryFileCrawlingConfig());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * FILE_CRAWLING_CONFIG by my FILE_CRAWLING_CONFIG_ID, named 'fileCrawlingConfig'.
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
        String nrp = xresolveNRP("FILE_AUTHENTICATION", "fileCrawlingConfig"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new FileCrawlingConfigCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "fileCrawlingConfig", nrp);
    }
    protected void xsetupOuterJoinFileCrawlingConfig() { xregOutJo("fileCrawlingConfig"); }
    public boolean hasConditionQueryFileCrawlingConfig() { return xhasQueRlMap("fileCrawlingConfig"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, FileAuthenticationCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(FileAuthenticationCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, FileAuthenticationCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(FileAuthenticationCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, FileAuthenticationCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(FileAuthenticationCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, FileAuthenticationCQ> _myselfExistsMap;
    public Map<String, FileAuthenticationCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(FileAuthenticationCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, FileAuthenticationCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(FileAuthenticationCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return FileAuthenticationCB.class.getName(); }
    protected String xCQ() { return FileAuthenticationCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
