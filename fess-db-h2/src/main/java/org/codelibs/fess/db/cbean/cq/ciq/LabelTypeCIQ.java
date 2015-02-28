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
 * The condition-query for in-line of LABEL_TYPE.
 * @author DBFlute(AutoGenerator)
 */
public class LabelTypeCIQ extends AbstractBsLabelTypeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsLabelTypeCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LabelTypeCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsLabelTypeCQ myCQ) {
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
    public String keepId_ExistsReferrer_FileConfigToLabelTypeMappingList(FileConfigToLabelTypeMappingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepId_ExistsReferrer_LabelTypeToRoleTypeMappingList(LabelTypeToRoleTypeMappingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepId_ExistsReferrer_WebConfigToLabelTypeMappingList(WebConfigToLabelTypeMappingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepId_NotExistsReferrer_DataConfigToLabelTypeMappingList(DataConfigToLabelTypeMappingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepId_NotExistsReferrer_FileConfigToLabelTypeMappingList(FileConfigToLabelTypeMappingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepId_NotExistsReferrer_LabelTypeToRoleTypeMappingList(LabelTypeToRoleTypeMappingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepId_NotExistsReferrer_WebConfigToLabelTypeMappingList(WebConfigToLabelTypeMappingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepId_SpecifyDerivedReferrer_DataConfigToLabelTypeMappingList(DataConfigToLabelTypeMappingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepId_SpecifyDerivedReferrer_FileConfigToLabelTypeMappingList(FileConfigToLabelTypeMappingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepId_SpecifyDerivedReferrer_LabelTypeToRoleTypeMappingList(LabelTypeToRoleTypeMappingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepId_SpecifyDerivedReferrer_WebConfigToLabelTypeMappingList(WebConfigToLabelTypeMappingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_DataConfigToLabelTypeMappingList(DataConfigToLabelTypeMappingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_DataConfigToLabelTypeMappingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_FileConfigToLabelTypeMappingList(FileConfigToLabelTypeMappingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_FileConfigToLabelTypeMappingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_LabelTypeToRoleTypeMappingList(LabelTypeToRoleTypeMappingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_LabelTypeToRoleTypeMappingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_WebConfigToLabelTypeMappingList(WebConfigToLabelTypeMappingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_WebConfigToLabelTypeMappingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueName() { return _myCQ.xdfgetName(); }
    protected ConditionValue xgetCValueValue() { return _myCQ.xdfgetValue(); }
    protected ConditionValue xgetCValueIncludedPaths() { return _myCQ.xdfgetIncludedPaths(); }
    protected ConditionValue xgetCValueExcludedPaths() { return _myCQ.xdfgetExcludedPaths(); }
    protected ConditionValue xgetCValueSortOrder() { return _myCQ.xdfgetSortOrder(); }
    protected ConditionValue xgetCValueCreatedBy() { return _myCQ.xdfgetCreatedBy(); }
    protected ConditionValue xgetCValueCreatedTime() { return _myCQ.xdfgetCreatedTime(); }
    protected ConditionValue xgetCValueUpdatedBy() { return _myCQ.xdfgetUpdatedBy(); }
    protected ConditionValue xgetCValueUpdatedTime() { return _myCQ.xdfgetUpdatedTime(); }
    protected ConditionValue xgetCValueDeletedBy() { return _myCQ.xdfgetDeletedBy(); }
    protected ConditionValue xgetCValueDeletedTime() { return _myCQ.xdfgetDeletedTime(); }
    protected ConditionValue xgetCValueVersionNo() { return _myCQ.xdfgetVersionNo(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(LabelTypeCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(LabelTypeCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(LabelTypeCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(LabelTypeCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return LabelTypeCB.class.getName(); }
    protected String xinCQ() { return LabelTypeCQ.class.getName(); }
}
