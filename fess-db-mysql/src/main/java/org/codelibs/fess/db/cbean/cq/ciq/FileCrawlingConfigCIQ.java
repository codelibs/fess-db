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
 * The condition-query for in-line of FILE_CRAWLING_CONFIG.
 * @author DBFlute(AutoGenerator)
 */
public class FileCrawlingConfigCIQ extends AbstractBsFileCrawlingConfigCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsFileCrawlingConfigCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public FileCrawlingConfigCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsFileCrawlingConfigCQ myCQ) {
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
    public String keepId_ExistsReferrer_FileAuthenticationList(FileAuthenticationCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepId_ExistsReferrer_FileConfigToLabelTypeMappingList(FileConfigToLabelTypeMappingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepId_ExistsReferrer_FileConfigToRoleTypeMappingList(FileConfigToRoleTypeMappingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepId_NotExistsReferrer_FileAuthenticationList(FileAuthenticationCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepId_NotExistsReferrer_FileConfigToLabelTypeMappingList(FileConfigToLabelTypeMappingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepId_NotExistsReferrer_FileConfigToRoleTypeMappingList(FileConfigToRoleTypeMappingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepId_SpecifyDerivedReferrer_FileAuthenticationList(FileAuthenticationCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepId_SpecifyDerivedReferrer_FileConfigToLabelTypeMappingList(FileConfigToLabelTypeMappingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepId_SpecifyDerivedReferrer_FileConfigToRoleTypeMappingList(FileConfigToRoleTypeMappingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_FileAuthenticationList(FileAuthenticationCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_FileAuthenticationListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_FileConfigToLabelTypeMappingList(FileConfigToLabelTypeMappingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_FileConfigToLabelTypeMappingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_FileConfigToRoleTypeMappingList(FileConfigToRoleTypeMappingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_FileConfigToRoleTypeMappingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueName() { return _myCQ.xdfgetName(); }
    protected ConditionValue xgetCValuePaths() { return _myCQ.xdfgetPaths(); }
    protected ConditionValue xgetCValueIncludedPaths() { return _myCQ.xdfgetIncludedPaths(); }
    protected ConditionValue xgetCValueExcludedPaths() { return _myCQ.xdfgetExcludedPaths(); }
    protected ConditionValue xgetCValueIncludedDocPaths() { return _myCQ.xdfgetIncludedDocPaths(); }
    protected ConditionValue xgetCValueExcludedDocPaths() { return _myCQ.xdfgetExcludedDocPaths(); }
    protected ConditionValue xgetCValueConfigParameter() { return _myCQ.xdfgetConfigParameter(); }
    protected ConditionValue xgetCValueDepth() { return _myCQ.xdfgetDepth(); }
    protected ConditionValue xgetCValueMaxAccessCount() { return _myCQ.xdfgetMaxAccessCount(); }
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
    public String keepScalarCondition(FileCrawlingConfigCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(FileCrawlingConfigCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(FileCrawlingConfigCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(FileCrawlingConfigCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return FileCrawlingConfigCB.class.getName(); }
    protected String xinCQ() { return FileCrawlingConfigCQ.class.getName(); }
}
