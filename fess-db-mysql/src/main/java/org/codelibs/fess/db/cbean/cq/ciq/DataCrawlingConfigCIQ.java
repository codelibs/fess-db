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
 * The condition-query for in-line of DATA_CRAWLING_CONFIG.
 * @author DBFlute(AutoGenerator)
 */
public class DataCrawlingConfigCIQ extends AbstractBsDataCrawlingConfigCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsDataCrawlingConfigCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DataCrawlingConfigCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsDataCrawlingConfigCQ myCQ) {
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
    public String keepId_ExistsReferrer_DataConfigToLabelTypeMappingList(DataConfigToLabelTypeMappingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepId_ExistsReferrer_DataConfigToRoleTypeMappingList(DataConfigToRoleTypeMappingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepId_NotExistsReferrer_DataConfigToLabelTypeMappingList(DataConfigToLabelTypeMappingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepId_NotExistsReferrer_DataConfigToRoleTypeMappingList(DataConfigToRoleTypeMappingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepId_SpecifyDerivedReferrer_DataConfigToLabelTypeMappingList(DataConfigToLabelTypeMappingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepId_SpecifyDerivedReferrer_DataConfigToRoleTypeMappingList(DataConfigToRoleTypeMappingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_DataConfigToLabelTypeMappingList(DataConfigToLabelTypeMappingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_DataConfigToLabelTypeMappingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_DataConfigToRoleTypeMappingList(DataConfigToRoleTypeMappingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_DataConfigToRoleTypeMappingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueName() { return _myCQ.xdfgetName(); }
    protected ConditionValue xgetCValueHandlerName() { return _myCQ.xdfgetHandlerName(); }
    protected ConditionValue xgetCValueHandlerParameter() { return _myCQ.xdfgetHandlerParameter(); }
    protected ConditionValue xgetCValueHandlerScript() { return _myCQ.xdfgetHandlerScript(); }
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
    public String keepScalarCondition(DataCrawlingConfigCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(DataCrawlingConfigCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(DataCrawlingConfigCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(DataCrawlingConfigCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return DataCrawlingConfigCB.class.getName(); }
    protected String xinCQ() { return DataCrawlingConfigCQ.class.getName(); }
}
