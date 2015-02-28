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
 * The condition-query for in-line of WEB_CRAWLING_CONFIG.
 * @author DBFlute(AutoGenerator)
 */
public class WebCrawlingConfigCIQ extends AbstractBsWebCrawlingConfigCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWebCrawlingConfigCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WebCrawlingConfigCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWebCrawlingConfigCQ myCQ) {
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
    public String keepId_ExistsReferrer_RequestHeaderList(RequestHeaderCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepId_ExistsReferrer_WebAuthenticationList(WebAuthenticationCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepId_ExistsReferrer_WebConfigToLabelTypeMappingList(WebConfigToLabelTypeMappingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepId_ExistsReferrer_WebConfigToRoleTypeMappingList(WebConfigToRoleTypeMappingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepId_NotExistsReferrer_RequestHeaderList(RequestHeaderCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepId_NotExistsReferrer_WebAuthenticationList(WebAuthenticationCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepId_NotExistsReferrer_WebConfigToLabelTypeMappingList(WebConfigToLabelTypeMappingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepId_NotExistsReferrer_WebConfigToRoleTypeMappingList(WebConfigToRoleTypeMappingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepId_SpecifyDerivedReferrer_RequestHeaderList(RequestHeaderCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepId_SpecifyDerivedReferrer_WebAuthenticationList(WebAuthenticationCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepId_SpecifyDerivedReferrer_WebConfigToLabelTypeMappingList(WebConfigToLabelTypeMappingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepId_SpecifyDerivedReferrer_WebConfigToRoleTypeMappingList(WebConfigToRoleTypeMappingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_RequestHeaderList(RequestHeaderCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_RequestHeaderListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_WebAuthenticationList(WebAuthenticationCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_WebAuthenticationListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_WebConfigToLabelTypeMappingList(WebConfigToLabelTypeMappingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_WebConfigToLabelTypeMappingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_WebConfigToRoleTypeMappingList(WebConfigToRoleTypeMappingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_WebConfigToRoleTypeMappingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueName() { return _myCQ.xdfgetName(); }
    protected ConditionValue xgetCValueUrls() { return _myCQ.xdfgetUrls(); }
    protected ConditionValue xgetCValueIncludedUrls() { return _myCQ.xdfgetIncludedUrls(); }
    protected ConditionValue xgetCValueExcludedUrls() { return _myCQ.xdfgetExcludedUrls(); }
    protected ConditionValue xgetCValueIncludedDocUrls() { return _myCQ.xdfgetIncludedDocUrls(); }
    protected ConditionValue xgetCValueExcludedDocUrls() { return _myCQ.xdfgetExcludedDocUrls(); }
    protected ConditionValue xgetCValueConfigParameter() { return _myCQ.xdfgetConfigParameter(); }
    protected ConditionValue xgetCValueDepth() { return _myCQ.xdfgetDepth(); }
    protected ConditionValue xgetCValueMaxAccessCount() { return _myCQ.xdfgetMaxAccessCount(); }
    protected ConditionValue xgetCValueUserAgent() { return _myCQ.xdfgetUserAgent(); }
    protected ConditionValue xgetCValueNumOfThread() { return _myCQ.xdfgetNumOfThread(); }
    protected ConditionValue xgetCValueIntervalTime() { return _myCQ.xdfgetIntervalTime(); }
    protected ConditionValue xgetCValueBoost() { return _myCQ.xdfgetBoost(); }
    protected ConditionValue xgetCValueAvailable() { return _myCQ.xdfgetAvailable(); }
    protected ConditionValue xgetCValueSortOrder() { return _myCQ.xdfgetSortOrder(); }
    protected ConditionValue xgetCValueCreatedBy() { return _myCQ.xdfgetCreatedBy(); }
    protected ConditionValue xgetCValueCreatedTime() { return _myCQ.xdfgetCreatedTime(); }
    protected ConditionValue xgetCValueUpdatedBy() { return _myCQ.xdfgetUpdatedBy(); }
    protected ConditionValue xgetCValueUpdatedTime() { return _myCQ.xdfgetUpdatedTime(); }
    protected ConditionValue xgetCValueDeletedBy() { return _myCQ.xdfgetDeletedBy(); }
    protected ConditionValue xgetCValueDeletedTime() { return _myCQ.xdfgetDeletedTime(); }
    protected ConditionValue xgetCValueVersionNo() { return _myCQ.xdfgetVersionNo(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(WebCrawlingConfigCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WebCrawlingConfigCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WebCrawlingConfigCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WebCrawlingConfigCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WebCrawlingConfigCB.class.getName(); }
    protected String xinCQ() { return WebCrawlingConfigCQ.class.getName(); }
}
