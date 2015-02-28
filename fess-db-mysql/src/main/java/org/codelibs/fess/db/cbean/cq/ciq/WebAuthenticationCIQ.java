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
 * The condition-query for in-line of WEB_AUTHENTICATION.
 * @author DBFlute(AutoGenerator)
 */
public class WebAuthenticationCIQ extends AbstractBsWebAuthenticationCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWebAuthenticationCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WebAuthenticationCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWebAuthenticationCQ myCQ) {
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
    protected ConditionValue xgetCValueHostname() { return _myCQ.xdfgetHostname(); }
    protected ConditionValue xgetCValuePort() { return _myCQ.xdfgetPort(); }
    protected ConditionValue xgetCValueAuthRealm() { return _myCQ.xdfgetAuthRealm(); }
    protected ConditionValue xgetCValueProtocolScheme() { return _myCQ.xdfgetProtocolScheme(); }
    protected ConditionValue xgetCValueUsername() { return _myCQ.xdfgetUsername(); }
    protected ConditionValue xgetCValuePassword() { return _myCQ.xdfgetPassword(); }
    protected ConditionValue xgetCValueParameters() { return _myCQ.xdfgetParameters(); }
    protected ConditionValue xgetCValueWebCrawlingConfigId() { return _myCQ.xdfgetWebCrawlingConfigId(); }
    protected ConditionValue xgetCValueCreatedBy() { return _myCQ.xdfgetCreatedBy(); }
    protected ConditionValue xgetCValueCreatedTime() { return _myCQ.xdfgetCreatedTime(); }
    protected ConditionValue xgetCValueUpdatedBy() { return _myCQ.xdfgetUpdatedBy(); }
    protected ConditionValue xgetCValueUpdatedTime() { return _myCQ.xdfgetUpdatedTime(); }
    protected ConditionValue xgetCValueDeletedBy() { return _myCQ.xdfgetDeletedBy(); }
    protected ConditionValue xgetCValueDeletedTime() { return _myCQ.xdfgetDeletedTime(); }
    protected ConditionValue xgetCValueVersionNo() { return _myCQ.xdfgetVersionNo(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(WebAuthenticationCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WebAuthenticationCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WebAuthenticationCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WebAuthenticationCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WebAuthenticationCB.class.getName(); }
    protected String xinCQ() { return WebAuthenticationCQ.class.getName(); }
}
