package org.codelibs.fess.db.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.codelibs.fess.db.cbean.*;
import org.codelibs.fess.db.cbean.cq.bs.*;
import org.codelibs.fess.db.cbean.cq.*;

/**
 * The condition-query for in-line of SEARCH_LOG.
 * @author DBFlute(AutoGenerator)
 */
public class SearchLogCIQ extends AbstractBsSearchLogCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsSearchLogCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public SearchLogCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsSearchLogCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueId() { return _myCQ.xdfgetId(); }
    public String keepId_ExistsReferrer_ClickLogList(ClickLogCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepId_ExistsReferrer_SearchFieldLogList(SearchFieldLogCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepId_NotExistsReferrer_ClickLogList(ClickLogCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepId_NotExistsReferrer_SearchFieldLogList(SearchFieldLogCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepId_SpecifyDerivedReferrer_ClickLogList(ClickLogCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepId_SpecifyDerivedReferrer_SearchFieldLogList(SearchFieldLogCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_ClickLogList(ClickLogCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_ClickLogListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_SearchFieldLogList(SearchFieldLogCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_SearchFieldLogListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueSearchWord() { return _myCQ.xdfgetSearchWord(); }
    protected ConditionValue xgetCValueRequestedTime() { return _myCQ.xdfgetRequestedTime(); }
    protected ConditionValue xgetCValueResponseTime() { return _myCQ.xdfgetResponseTime(); }
    protected ConditionValue xgetCValueHitCount() { return _myCQ.xdfgetHitCount(); }
    protected ConditionValue xgetCValueQueryOffset() { return _myCQ.xdfgetQueryOffset(); }
    protected ConditionValue xgetCValueQueryPageSize() { return _myCQ.xdfgetQueryPageSize(); }
    protected ConditionValue xgetCValueUserAgent() { return _myCQ.xdfgetUserAgent(); }
    protected ConditionValue xgetCValueReferer() { return _myCQ.xdfgetReferer(); }
    protected ConditionValue xgetCValueClientIp() { return _myCQ.xdfgetClientIp(); }
    protected ConditionValue xgetCValueUserSessionId() { return _myCQ.xdfgetUserSessionId(); }
    protected ConditionValue xgetCValueAccessType() { return _myCQ.xdfgetAccessType(); }
    protected ConditionValue xgetCValueUserId() { return _myCQ.xdfgetUserId(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(SearchLogCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(SearchLogCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(SearchLogCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(SearchLogCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return SearchLogCB.class.getName(); }
    protected String xinCQ() { return SearchLogCQ.class.getName(); }
}
