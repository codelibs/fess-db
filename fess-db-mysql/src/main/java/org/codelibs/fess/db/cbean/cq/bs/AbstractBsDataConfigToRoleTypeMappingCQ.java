package org.codelibs.fess.db.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.codelibs.fess.db.allcommon.*;
import org.codelibs.fess.db.cbean.*;
import org.codelibs.fess.db.cbean.cq.*;

/**
 * The abstract condition-query of DATA_CONFIG_TO_ROLE_TYPE_MAPPING.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsDataConfigToRoleTypeMappingCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsDataConfigToRoleTypeMappingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "DATA_CONFIG_TO_ROLE_TYPE_MAPPING";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @param id The value of id as equal. (NullAllowed: if null, no condition)
     */
    public void setId_Equal(Long id) {
        doSetId_Equal(id);
    }

    protected void doSetId_Equal(Long id) {
        regId(CK_EQ, id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @param id The value of id as notEqual. (NullAllowed: if null, no condition)
     */
    public void setId_NotEqual(Long id) {
        doSetId_NotEqual(id);
    }

    protected void doSetId_NotEqual(Long id) {
        regId(CK_NES, id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @param id The value of id as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setId_GreaterThan(Long id) {
        regId(CK_GT, id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @param id The value of id as lessThan. (NullAllowed: if null, no condition)
     */
    public void setId_LessThan(Long id) {
        regId(CK_LT, id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @param id The value of id as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setId_GreaterEqual(Long id) {
        regId(CK_GE, id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @param id The value of id as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setId_LessEqual(Long id) {
        regId(CK_LE, id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of id. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of id. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of id. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of id. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueId(), "ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @param idList The collection of id as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setId_InScope(Collection<Long> idList) {
        doSetId_InScope(idList);
    }

    protected void doSetId_InScope(Collection<Long> idList) {
        regINS(CK_INS, cTL(idList), xgetCValueId(), "ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @param idList The collection of id as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setId_NotInScope(Collection<Long> idList) {
        doSetId_NotInScope(idList);
    }

    protected void doSetId_NotInScope(Collection<Long> idList) {
        regINS(CK_NINS, cTL(idList), xgetCValueId(), "ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setId_IsNull() { regId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setId_IsNotNull() { regId(CK_ISNN, DOBJ); }

    protected void regId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueId(), "ID"); }
    protected abstract ConditionValue xgetCValueId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to DATA_CRAWLING_CONFIG}
     * @param dataConfigId The value of dataConfigId as equal. (NullAllowed: if null, no condition)
     */
    public void setDataConfigId_Equal(Long dataConfigId) {
        doSetDataConfigId_Equal(dataConfigId);
    }

    protected void doSetDataConfigId_Equal(Long dataConfigId) {
        regDataConfigId(CK_EQ, dataConfigId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to DATA_CRAWLING_CONFIG}
     * @param dataConfigId The value of dataConfigId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setDataConfigId_NotEqual(Long dataConfigId) {
        doSetDataConfigId_NotEqual(dataConfigId);
    }

    protected void doSetDataConfigId_NotEqual(Long dataConfigId) {
        regDataConfigId(CK_NES, dataConfigId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to DATA_CRAWLING_CONFIG}
     * @param dataConfigId The value of dataConfigId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setDataConfigId_GreaterThan(Long dataConfigId) {
        regDataConfigId(CK_GT, dataConfigId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to DATA_CRAWLING_CONFIG}
     * @param dataConfigId The value of dataConfigId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setDataConfigId_LessThan(Long dataConfigId) {
        regDataConfigId(CK_LT, dataConfigId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to DATA_CRAWLING_CONFIG}
     * @param dataConfigId The value of dataConfigId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setDataConfigId_GreaterEqual(Long dataConfigId) {
        regDataConfigId(CK_GE, dataConfigId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to DATA_CRAWLING_CONFIG}
     * @param dataConfigId The value of dataConfigId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setDataConfigId_LessEqual(Long dataConfigId) {
        regDataConfigId(CK_LE, dataConfigId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to DATA_CRAWLING_CONFIG}
     * @param minNumber The min number of dataConfigId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of dataConfigId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDataConfigId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDataConfigId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to DATA_CRAWLING_CONFIG}
     * @param minNumber The min number of dataConfigId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of dataConfigId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDataConfigId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDataConfigId(), "DATA_CONFIG_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DATA_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to DATA_CRAWLING_CONFIG}
     * @param dataConfigIdList The collection of dataConfigId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDataConfigId_InScope(Collection<Long> dataConfigIdList) {
        doSetDataConfigId_InScope(dataConfigIdList);
    }

    protected void doSetDataConfigId_InScope(Collection<Long> dataConfigIdList) {
        regINS(CK_INS, cTL(dataConfigIdList), xgetCValueDataConfigId(), "DATA_CONFIG_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DATA_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to DATA_CRAWLING_CONFIG}
     * @param dataConfigIdList The collection of dataConfigId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDataConfigId_NotInScope(Collection<Long> dataConfigIdList) {
        doSetDataConfigId_NotInScope(dataConfigIdList);
    }

    protected void doSetDataConfigId_NotInScope(Collection<Long> dataConfigIdList) {
        regINS(CK_NINS, cTL(dataConfigIdList), xgetCValueDataConfigId(), "DATA_CONFIG_ID");
    }

    protected void regDataConfigId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataConfigId(), "DATA_CONFIG_ID"); }
    protected abstract ConditionValue xgetCValueDataConfigId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_TYPE_ID: {IX, NotNull, BIGINT(19), FK to ROLE_TYPE}
     * @param roleTypeId The value of roleTypeId as equal. (NullAllowed: if null, no condition)
     */
    public void setRoleTypeId_Equal(Long roleTypeId) {
        doSetRoleTypeId_Equal(roleTypeId);
    }

    protected void doSetRoleTypeId_Equal(Long roleTypeId) {
        regRoleTypeId(CK_EQ, roleTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_TYPE_ID: {IX, NotNull, BIGINT(19), FK to ROLE_TYPE}
     * @param roleTypeId The value of roleTypeId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setRoleTypeId_NotEqual(Long roleTypeId) {
        doSetRoleTypeId_NotEqual(roleTypeId);
    }

    protected void doSetRoleTypeId_NotEqual(Long roleTypeId) {
        regRoleTypeId(CK_NES, roleTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_TYPE_ID: {IX, NotNull, BIGINT(19), FK to ROLE_TYPE}
     * @param roleTypeId The value of roleTypeId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRoleTypeId_GreaterThan(Long roleTypeId) {
        regRoleTypeId(CK_GT, roleTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_TYPE_ID: {IX, NotNull, BIGINT(19), FK to ROLE_TYPE}
     * @param roleTypeId The value of roleTypeId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRoleTypeId_LessThan(Long roleTypeId) {
        regRoleTypeId(CK_LT, roleTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_TYPE_ID: {IX, NotNull, BIGINT(19), FK to ROLE_TYPE}
     * @param roleTypeId The value of roleTypeId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRoleTypeId_GreaterEqual(Long roleTypeId) {
        regRoleTypeId(CK_GE, roleTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_TYPE_ID: {IX, NotNull, BIGINT(19), FK to ROLE_TYPE}
     * @param roleTypeId The value of roleTypeId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRoleTypeId_LessEqual(Long roleTypeId) {
        regRoleTypeId(CK_LE, roleTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_TYPE_ID: {IX, NotNull, BIGINT(19), FK to ROLE_TYPE}
     * @param minNumber The min number of roleTypeId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of roleTypeId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setRoleTypeId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setRoleTypeId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_TYPE_ID: {IX, NotNull, BIGINT(19), FK to ROLE_TYPE}
     * @param minNumber The min number of roleTypeId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of roleTypeId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setRoleTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRoleTypeId(), "ROLE_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ROLE_TYPE_ID: {IX, NotNull, BIGINT(19), FK to ROLE_TYPE}
     * @param roleTypeIdList The collection of roleTypeId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRoleTypeId_InScope(Collection<Long> roleTypeIdList) {
        doSetRoleTypeId_InScope(roleTypeIdList);
    }

    protected void doSetRoleTypeId_InScope(Collection<Long> roleTypeIdList) {
        regINS(CK_INS, cTL(roleTypeIdList), xgetCValueRoleTypeId(), "ROLE_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ROLE_TYPE_ID: {IX, NotNull, BIGINT(19), FK to ROLE_TYPE}
     * @param roleTypeIdList The collection of roleTypeId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRoleTypeId_NotInScope(Collection<Long> roleTypeIdList) {
        doSetRoleTypeId_NotInScope(roleTypeIdList);
    }

    protected void doSetRoleTypeId_NotInScope(Collection<Long> roleTypeIdList) {
        regINS(CK_NINS, cTL(roleTypeIdList), xgetCValueRoleTypeId(), "ROLE_TYPE_ID");
    }

    protected void regRoleTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRoleTypeId(), "ROLE_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueRoleTypeId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;DataConfigToRoleTypeMappingCB&gt;() {
     *     public void query(DataConfigToRoleTypeMappingCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<DataConfigToRoleTypeMappingCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, DataConfigToRoleTypeMappingCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;DataConfigToRoleTypeMappingCB&gt;() {
     *     public void query(DataConfigToRoleTypeMappingCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<DataConfigToRoleTypeMappingCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, DataConfigToRoleTypeMappingCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;DataConfigToRoleTypeMappingCB&gt;() {
     *     public void query(DataConfigToRoleTypeMappingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<DataConfigToRoleTypeMappingCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, DataConfigToRoleTypeMappingCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;DataConfigToRoleTypeMappingCB&gt;() {
     *     public void query(DataConfigToRoleTypeMappingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<DataConfigToRoleTypeMappingCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, DataConfigToRoleTypeMappingCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;DataConfigToRoleTypeMappingCB&gt;() {
     *     public void query(DataConfigToRoleTypeMappingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<DataConfigToRoleTypeMappingCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, DataConfigToRoleTypeMappingCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;DataConfigToRoleTypeMappingCB&gt;() {
     *     public void query(DataConfigToRoleTypeMappingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<DataConfigToRoleTypeMappingCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, DataConfigToRoleTypeMappingCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        DataConfigToRoleTypeMappingCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(DataConfigToRoleTypeMappingCQ sq);

    protected DataConfigToRoleTypeMappingCB xcreateScalarConditionCB() {
        DataConfigToRoleTypeMappingCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected DataConfigToRoleTypeMappingCB xcreateScalarConditionPartitionByCB() {
        DataConfigToRoleTypeMappingCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<DataConfigToRoleTypeMappingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DataConfigToRoleTypeMappingCB cb = new DataConfigToRoleTypeMappingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(DataConfigToRoleTypeMappingCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<DataConfigToRoleTypeMappingCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(DataConfigToRoleTypeMappingCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DataConfigToRoleTypeMappingCB cb = new DataConfigToRoleTypeMappingCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(DataConfigToRoleTypeMappingCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<DataConfigToRoleTypeMappingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DataConfigToRoleTypeMappingCB cb = new DataConfigToRoleTypeMappingCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(DataConfigToRoleTypeMappingCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected DataConfigToRoleTypeMappingCB newMyCB() {
        return new DataConfigToRoleTypeMappingCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return DataConfigToRoleTypeMappingCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
