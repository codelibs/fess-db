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
 * The base condition-query of USER_INFO.
 * @author DBFlute(AutoGenerator)
 */
public class BsUserInfoCQ extends AbstractBsUserInfoCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected UserInfoCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsUserInfoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from USER_INFO) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public UserInfoCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected UserInfoCIQ xcreateCIQ() {
        UserInfoCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected UserInfoCIQ xnewCIQ() {
        return new UserInfoCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join USER_INFO on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public UserInfoCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        UserInfoCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    public Map<String, FavoriteLogCQ> xdfgetId_ExistsReferrer_FavoriteLogList() { return xgetSQueMap("id_ExistsReferrer_FavoriteLogList"); }
    public String keepId_ExistsReferrer_FavoriteLogList(FavoriteLogCQ sq) { return xkeepSQue("id_ExistsReferrer_FavoriteLogList", sq); }

    public Map<String, SearchLogCQ> xdfgetId_ExistsReferrer_SearchLogList() { return xgetSQueMap("id_ExistsReferrer_SearchLogList"); }
    public String keepId_ExistsReferrer_SearchLogList(SearchLogCQ sq) { return xkeepSQue("id_ExistsReferrer_SearchLogList", sq); }

    public Map<String, FavoriteLogCQ> xdfgetId_NotExistsReferrer_FavoriteLogList() { return xgetSQueMap("id_NotExistsReferrer_FavoriteLogList"); }
    public String keepId_NotExistsReferrer_FavoriteLogList(FavoriteLogCQ sq) { return xkeepSQue("id_NotExistsReferrer_FavoriteLogList", sq); }

    public Map<String, SearchLogCQ> xdfgetId_NotExistsReferrer_SearchLogList() { return xgetSQueMap("id_NotExistsReferrer_SearchLogList"); }
    public String keepId_NotExistsReferrer_SearchLogList(SearchLogCQ sq) { return xkeepSQue("id_NotExistsReferrer_SearchLogList", sq); }

    public Map<String, FavoriteLogCQ> xdfgetId_SpecifyDerivedReferrer_FavoriteLogList() { return xgetSQueMap("id_SpecifyDerivedReferrer_FavoriteLogList"); }
    public String keepId_SpecifyDerivedReferrer_FavoriteLogList(FavoriteLogCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_FavoriteLogList", sq); }

    public Map<String, SearchLogCQ> xdfgetId_SpecifyDerivedReferrer_SearchLogList() { return xgetSQueMap("id_SpecifyDerivedReferrer_SearchLogList"); }
    public String keepId_SpecifyDerivedReferrer_SearchLogList(SearchLogCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_SearchLogList", sq); }

    public Map<String, FavoriteLogCQ> xdfgetId_QueryDerivedReferrer_FavoriteLogList() { return xgetSQueMap("id_QueryDerivedReferrer_FavoriteLogList"); }
    public String keepId_QueryDerivedReferrer_FavoriteLogList(FavoriteLogCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_FavoriteLogList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_FavoriteLogListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_FavoriteLogList"); }
    public String keepId_QueryDerivedReferrer_FavoriteLogListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_FavoriteLogList", pm); }

    public Map<String, SearchLogCQ> xdfgetId_QueryDerivedReferrer_SearchLogList() { return xgetSQueMap("id_QueryDerivedReferrer_SearchLogList"); }
    public String keepId_QueryDerivedReferrer_SearchLogList(SearchLogCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_SearchLogList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_SearchLogListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_SearchLogList"); }
    public String keepId_QueryDerivedReferrer_SearchLogListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_SearchLogList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsUserInfoCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsUserInfoCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

    protected ConditionValue _code;
    public ConditionValue xdfgetCode()
    { if (_code == null) { _code = nCV(); }
      return _code; }
    protected ConditionValue xgetCValueCode() { return xdfgetCode(); }

    /** 
     * Add order-by as ascend. <br>
     * CODE: {NotNull, TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsUserInfoCQ addOrderBy_Code_Asc() { regOBA("CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CODE: {NotNull, TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsUserInfoCQ addOrderBy_Code_Desc() { regOBD("CODE"); return this; }

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
    public BsUserInfoCQ addOrderBy_CreatedTime_Asc() { regOBA("CREATED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsUserInfoCQ addOrderBy_CreatedTime_Desc() { regOBD("CREATED_TIME"); return this; }

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
    public BsUserInfoCQ addOrderBy_UpdatedTime_Asc() { regOBA("UPDATED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @return this. (NotNull)
     */
    public BsUserInfoCQ addOrderBy_UpdatedTime_Desc() { regOBD("UPDATED_TIME"); return this; }

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
    public BsUserInfoCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsUserInfoCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, UserInfoCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(UserInfoCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, UserInfoCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(UserInfoCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, UserInfoCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(UserInfoCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, UserInfoCQ> _myselfExistsMap;
    public Map<String, UserInfoCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(UserInfoCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, UserInfoCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(UserInfoCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return UserInfoCB.class.getName(); }
    protected String xCQ() { return UserInfoCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
