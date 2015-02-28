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
 * The condition-query for in-line of JOB_LOG.
 * @author DBFlute(AutoGenerator)
 */
public class JobLogCIQ extends AbstractBsJobLogCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsJobLogCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public JobLogCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsJobLogCQ myCQ) {
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
    protected ConditionValue xgetCValueJobName() { return _myCQ.xdfgetJobName(); }
    protected ConditionValue xgetCValueJobStatus() { return _myCQ.xdfgetJobStatus(); }
    protected ConditionValue xgetCValueTarget() { return _myCQ.xdfgetTarget(); }
    protected ConditionValue xgetCValueScriptType() { return _myCQ.xdfgetScriptType(); }
    protected ConditionValue xgetCValueScriptData() { return _myCQ.xdfgetScriptData(); }
    protected ConditionValue xgetCValueScriptResult() { return _myCQ.xdfgetScriptResult(); }
    protected ConditionValue xgetCValueStartTime() { return _myCQ.xdfgetStartTime(); }
    protected ConditionValue xgetCValueEndTime() { return _myCQ.xdfgetEndTime(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(JobLogCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(JobLogCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(JobLogCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(JobLogCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return JobLogCB.class.getName(); }
    protected String xinCQ() { return JobLogCQ.class.getName(); }
}
