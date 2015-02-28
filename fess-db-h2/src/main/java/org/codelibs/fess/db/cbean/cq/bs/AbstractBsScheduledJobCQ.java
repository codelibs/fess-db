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
 * The abstract condition-query of SCHEDULED_JOB.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsScheduledJobCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsScheduledJobCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "SCHEDULED_JOB";
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {NotNull, VARCHAR(100)}
     * @param name The value of name as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_Equal(String name) {
        doSetName_Equal(fRES(name));
    }

    protected void doSetName_Equal(String name) {
        regName(CK_EQ, name);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {NotNull, VARCHAR(100)}
     * @param name The value of name as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_NotEqual(String name) {
        doSetName_NotEqual(fRES(name));
    }

    protected void doSetName_NotEqual(String name) {
        regName(CK_NES, name);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {NotNull, VARCHAR(100)}
     * @param name The value of name as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_GreaterThan(String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {NotNull, VARCHAR(100)}
     * @param name The value of name as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_LessThan(String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {NotNull, VARCHAR(100)}
     * @param name The value of name as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_GreaterEqual(String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {NotNull, VARCHAR(100)}
     * @param name The value of name as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_LessEqual(String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NAME: {NotNull, VARCHAR(100)}
     * @param nameList The collection of name as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_InScope(Collection<String> nameList) {
        doSetName_InScope(nameList);
    }

    protected void doSetName_InScope(Collection<String> nameList) {
        regINS(CK_INS, cTL(nameList), xgetCValueName(), "NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NAME: {NotNull, VARCHAR(100)}
     * @param nameList The collection of name as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_NotInScope(Collection<String> nameList) {
        doSetName_NotInScope(nameList);
    }

    protected void doSetName_NotInScope(Collection<String> nameList) {
        regINS(CK_NINS, cTL(nameList), xgetCValueName(), "NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param name The value of name as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setName_LikeSearch(String name, ConditionOptionCall<LikeSearchOption> opLambda) {
        setName_LikeSearch(name, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param name The value of name as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setName_LikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(name), xgetCValueName(), "NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME: {NotNull, VARCHAR(100)}
     * @param name The value of name as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setName_NotLikeSearch(String name, ConditionOptionCall<LikeSearchOption> opLambda) {
        setName_NotLikeSearch(name, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME: {NotNull, VARCHAR(100)}
     * @param name The value of name as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setName_NotLikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(name), xgetCValueName(), "NAME", likeSearchOption);
    }

    protected void regName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueName(), "NAME"); }
    protected abstract ConditionValue xgetCValueName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TARGET: {NotNull, VARCHAR(100)}
     * @param target The value of target as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTarget_Equal(String target) {
        doSetTarget_Equal(fRES(target));
    }

    protected void doSetTarget_Equal(String target) {
        regTarget(CK_EQ, target);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TARGET: {NotNull, VARCHAR(100)}
     * @param target The value of target as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTarget_NotEqual(String target) {
        doSetTarget_NotEqual(fRES(target));
    }

    protected void doSetTarget_NotEqual(String target) {
        regTarget(CK_NES, target);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TARGET: {NotNull, VARCHAR(100)}
     * @param target The value of target as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setTarget_GreaterThan(String target) {
        regTarget(CK_GT, fRES(target));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TARGET: {NotNull, VARCHAR(100)}
     * @param target The value of target as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setTarget_LessThan(String target) {
        regTarget(CK_LT, fRES(target));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TARGET: {NotNull, VARCHAR(100)}
     * @param target The value of target as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTarget_GreaterEqual(String target) {
        regTarget(CK_GE, fRES(target));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TARGET: {NotNull, VARCHAR(100)}
     * @param target The value of target as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTarget_LessEqual(String target) {
        regTarget(CK_LE, fRES(target));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TARGET: {NotNull, VARCHAR(100)}
     * @param targetList The collection of target as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTarget_InScope(Collection<String> targetList) {
        doSetTarget_InScope(targetList);
    }

    protected void doSetTarget_InScope(Collection<String> targetList) {
        regINS(CK_INS, cTL(targetList), xgetCValueTarget(), "TARGET");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TARGET: {NotNull, VARCHAR(100)}
     * @param targetList The collection of target as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTarget_NotInScope(Collection<String> targetList) {
        doSetTarget_NotInScope(targetList);
    }

    protected void doSetTarget_NotInScope(Collection<String> targetList) {
        regINS(CK_NINS, cTL(targetList), xgetCValueTarget(), "TARGET");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TARGET: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setTarget_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param target The value of target as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTarget_LikeSearch(String target, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTarget_LikeSearch(target, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TARGET: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setTarget_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param target The value of target as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTarget_LikeSearch(String target, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(target), xgetCValueTarget(), "TARGET", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TARGET: {NotNull, VARCHAR(100)}
     * @param target The value of target as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTarget_NotLikeSearch(String target, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTarget_NotLikeSearch(target, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TARGET: {NotNull, VARCHAR(100)}
     * @param target The value of target as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTarget_NotLikeSearch(String target, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(target), xgetCValueTarget(), "TARGET", likeSearchOption);
    }

    protected void regTarget(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTarget(), "TARGET"); }
    protected abstract ConditionValue xgetCValueTarget();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CRON_EXPRESSION: {NotNull, VARCHAR(100)}
     * @param cronExpression The value of cronExpression as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCronExpression_Equal(String cronExpression) {
        doSetCronExpression_Equal(fRES(cronExpression));
    }

    protected void doSetCronExpression_Equal(String cronExpression) {
        regCronExpression(CK_EQ, cronExpression);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CRON_EXPRESSION: {NotNull, VARCHAR(100)}
     * @param cronExpression The value of cronExpression as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCronExpression_NotEqual(String cronExpression) {
        doSetCronExpression_NotEqual(fRES(cronExpression));
    }

    protected void doSetCronExpression_NotEqual(String cronExpression) {
        regCronExpression(CK_NES, cronExpression);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CRON_EXPRESSION: {NotNull, VARCHAR(100)}
     * @param cronExpression The value of cronExpression as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setCronExpression_GreaterThan(String cronExpression) {
        regCronExpression(CK_GT, fRES(cronExpression));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CRON_EXPRESSION: {NotNull, VARCHAR(100)}
     * @param cronExpression The value of cronExpression as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setCronExpression_LessThan(String cronExpression) {
        regCronExpression(CK_LT, fRES(cronExpression));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CRON_EXPRESSION: {NotNull, VARCHAR(100)}
     * @param cronExpression The value of cronExpression as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCronExpression_GreaterEqual(String cronExpression) {
        regCronExpression(CK_GE, fRES(cronExpression));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CRON_EXPRESSION: {NotNull, VARCHAR(100)}
     * @param cronExpression The value of cronExpression as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCronExpression_LessEqual(String cronExpression) {
        regCronExpression(CK_LE, fRES(cronExpression));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CRON_EXPRESSION: {NotNull, VARCHAR(100)}
     * @param cronExpressionList The collection of cronExpression as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCronExpression_InScope(Collection<String> cronExpressionList) {
        doSetCronExpression_InScope(cronExpressionList);
    }

    protected void doSetCronExpression_InScope(Collection<String> cronExpressionList) {
        regINS(CK_INS, cTL(cronExpressionList), xgetCValueCronExpression(), "CRON_EXPRESSION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CRON_EXPRESSION: {NotNull, VARCHAR(100)}
     * @param cronExpressionList The collection of cronExpression as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCronExpression_NotInScope(Collection<String> cronExpressionList) {
        doSetCronExpression_NotInScope(cronExpressionList);
    }

    protected void doSetCronExpression_NotInScope(Collection<String> cronExpressionList) {
        regINS(CK_NINS, cTL(cronExpressionList), xgetCValueCronExpression(), "CRON_EXPRESSION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CRON_EXPRESSION: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setCronExpression_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param cronExpression The value of cronExpression as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCronExpression_LikeSearch(String cronExpression, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCronExpression_LikeSearch(cronExpression, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CRON_EXPRESSION: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setCronExpression_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cronExpression The value of cronExpression as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCronExpression_LikeSearch(String cronExpression, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cronExpression), xgetCValueCronExpression(), "CRON_EXPRESSION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CRON_EXPRESSION: {NotNull, VARCHAR(100)}
     * @param cronExpression The value of cronExpression as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCronExpression_NotLikeSearch(String cronExpression, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCronExpression_NotLikeSearch(cronExpression, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CRON_EXPRESSION: {NotNull, VARCHAR(100)}
     * @param cronExpression The value of cronExpression as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCronExpression_NotLikeSearch(String cronExpression, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cronExpression), xgetCValueCronExpression(), "CRON_EXPRESSION", likeSearchOption);
    }

    protected void regCronExpression(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCronExpression(), "CRON_EXPRESSION"); }
    protected abstract ConditionValue xgetCValueCronExpression();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCRIPT_TYPE: {NotNull, VARCHAR(100)}
     * @param scriptType The value of scriptType as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptType_Equal(String scriptType) {
        doSetScriptType_Equal(fRES(scriptType));
    }

    protected void doSetScriptType_Equal(String scriptType) {
        regScriptType(CK_EQ, scriptType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCRIPT_TYPE: {NotNull, VARCHAR(100)}
     * @param scriptType The value of scriptType as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptType_NotEqual(String scriptType) {
        doSetScriptType_NotEqual(fRES(scriptType));
    }

    protected void doSetScriptType_NotEqual(String scriptType) {
        regScriptType(CK_NES, scriptType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCRIPT_TYPE: {NotNull, VARCHAR(100)}
     * @param scriptType The value of scriptType as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptType_GreaterThan(String scriptType) {
        regScriptType(CK_GT, fRES(scriptType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCRIPT_TYPE: {NotNull, VARCHAR(100)}
     * @param scriptType The value of scriptType as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptType_LessThan(String scriptType) {
        regScriptType(CK_LT, fRES(scriptType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCRIPT_TYPE: {NotNull, VARCHAR(100)}
     * @param scriptType The value of scriptType as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptType_GreaterEqual(String scriptType) {
        regScriptType(CK_GE, fRES(scriptType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCRIPT_TYPE: {NotNull, VARCHAR(100)}
     * @param scriptType The value of scriptType as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptType_LessEqual(String scriptType) {
        regScriptType(CK_LE, fRES(scriptType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCRIPT_TYPE: {NotNull, VARCHAR(100)}
     * @param scriptTypeList The collection of scriptType as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptType_InScope(Collection<String> scriptTypeList) {
        doSetScriptType_InScope(scriptTypeList);
    }

    protected void doSetScriptType_InScope(Collection<String> scriptTypeList) {
        regINS(CK_INS, cTL(scriptTypeList), xgetCValueScriptType(), "SCRIPT_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCRIPT_TYPE: {NotNull, VARCHAR(100)}
     * @param scriptTypeList The collection of scriptType as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptType_NotInScope(Collection<String> scriptTypeList) {
        doSetScriptType_NotInScope(scriptTypeList);
    }

    protected void doSetScriptType_NotInScope(Collection<String> scriptTypeList) {
        regINS(CK_NINS, cTL(scriptTypeList), xgetCValueScriptType(), "SCRIPT_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCRIPT_TYPE: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setScriptType_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param scriptType The value of scriptType as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setScriptType_LikeSearch(String scriptType, ConditionOptionCall<LikeSearchOption> opLambda) {
        setScriptType_LikeSearch(scriptType, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCRIPT_TYPE: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setScriptType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param scriptType The value of scriptType as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setScriptType_LikeSearch(String scriptType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(scriptType), xgetCValueScriptType(), "SCRIPT_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCRIPT_TYPE: {NotNull, VARCHAR(100)}
     * @param scriptType The value of scriptType as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setScriptType_NotLikeSearch(String scriptType, ConditionOptionCall<LikeSearchOption> opLambda) {
        setScriptType_NotLikeSearch(scriptType, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCRIPT_TYPE: {NotNull, VARCHAR(100)}
     * @param scriptType The value of scriptType as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setScriptType_NotLikeSearch(String scriptType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(scriptType), xgetCValueScriptType(), "SCRIPT_TYPE", likeSearchOption);
    }

    protected void regScriptType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScriptType(), "SCRIPT_TYPE"); }
    protected abstract ConditionValue xgetCValueScriptType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCRIPT_DATA: {VARCHAR(4000)}
     * @param scriptData The value of scriptData as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptData_Equal(String scriptData) {
        doSetScriptData_Equal(fRES(scriptData));
    }

    protected void doSetScriptData_Equal(String scriptData) {
        regScriptData(CK_EQ, scriptData);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCRIPT_DATA: {VARCHAR(4000)}
     * @param scriptData The value of scriptData as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptData_NotEqual(String scriptData) {
        doSetScriptData_NotEqual(fRES(scriptData));
    }

    protected void doSetScriptData_NotEqual(String scriptData) {
        regScriptData(CK_NES, scriptData);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCRIPT_DATA: {VARCHAR(4000)}
     * @param scriptData The value of scriptData as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptData_GreaterThan(String scriptData) {
        regScriptData(CK_GT, fRES(scriptData));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCRIPT_DATA: {VARCHAR(4000)}
     * @param scriptData The value of scriptData as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptData_LessThan(String scriptData) {
        regScriptData(CK_LT, fRES(scriptData));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCRIPT_DATA: {VARCHAR(4000)}
     * @param scriptData The value of scriptData as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptData_GreaterEqual(String scriptData) {
        regScriptData(CK_GE, fRES(scriptData));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCRIPT_DATA: {VARCHAR(4000)}
     * @param scriptData The value of scriptData as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptData_LessEqual(String scriptData) {
        regScriptData(CK_LE, fRES(scriptData));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCRIPT_DATA: {VARCHAR(4000)}
     * @param scriptDataList The collection of scriptData as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptData_InScope(Collection<String> scriptDataList) {
        doSetScriptData_InScope(scriptDataList);
    }

    protected void doSetScriptData_InScope(Collection<String> scriptDataList) {
        regINS(CK_INS, cTL(scriptDataList), xgetCValueScriptData(), "SCRIPT_DATA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCRIPT_DATA: {VARCHAR(4000)}
     * @param scriptDataList The collection of scriptData as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptData_NotInScope(Collection<String> scriptDataList) {
        doSetScriptData_NotInScope(scriptDataList);
    }

    protected void doSetScriptData_NotInScope(Collection<String> scriptDataList) {
        regINS(CK_NINS, cTL(scriptDataList), xgetCValueScriptData(), "SCRIPT_DATA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCRIPT_DATA: {VARCHAR(4000)} <br>
     * <pre>e.g. setScriptData_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param scriptData The value of scriptData as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setScriptData_LikeSearch(String scriptData, ConditionOptionCall<LikeSearchOption> opLambda) {
        setScriptData_LikeSearch(scriptData, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCRIPT_DATA: {VARCHAR(4000)} <br>
     * <pre>e.g. setScriptData_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param scriptData The value of scriptData as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setScriptData_LikeSearch(String scriptData, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(scriptData), xgetCValueScriptData(), "SCRIPT_DATA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCRIPT_DATA: {VARCHAR(4000)}
     * @param scriptData The value of scriptData as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setScriptData_NotLikeSearch(String scriptData, ConditionOptionCall<LikeSearchOption> opLambda) {
        setScriptData_NotLikeSearch(scriptData, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCRIPT_DATA: {VARCHAR(4000)}
     * @param scriptData The value of scriptData as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setScriptData_NotLikeSearch(String scriptData, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(scriptData), xgetCValueScriptData(), "SCRIPT_DATA", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SCRIPT_DATA: {VARCHAR(4000)}
     */
    public void setScriptData_IsNull() { regScriptData(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SCRIPT_DATA: {VARCHAR(4000)}
     */
    public void setScriptData_IsNullOrEmpty() { regScriptData(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SCRIPT_DATA: {VARCHAR(4000)}
     */
    public void setScriptData_IsNotNull() { regScriptData(CK_ISNN, DOBJ); }

    protected void regScriptData(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScriptData(), "SCRIPT_DATA"); }
    protected abstract ConditionValue xgetCValueScriptData();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CRAWLER: {NotNull, VARCHAR(1)}
     * @param crawler The value of crawler as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCrawler_Equal(String crawler) {
        doSetCrawler_Equal(fRES(crawler));
    }

    protected void doSetCrawler_Equal(String crawler) {
        regCrawler(CK_EQ, crawler);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CRAWLER: {NotNull, VARCHAR(1)}
     * @param crawler The value of crawler as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCrawler_NotEqual(String crawler) {
        doSetCrawler_NotEqual(fRES(crawler));
    }

    protected void doSetCrawler_NotEqual(String crawler) {
        regCrawler(CK_NES, crawler);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CRAWLER: {NotNull, VARCHAR(1)}
     * @param crawler The value of crawler as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setCrawler_GreaterThan(String crawler) {
        regCrawler(CK_GT, fRES(crawler));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CRAWLER: {NotNull, VARCHAR(1)}
     * @param crawler The value of crawler as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setCrawler_LessThan(String crawler) {
        regCrawler(CK_LT, fRES(crawler));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CRAWLER: {NotNull, VARCHAR(1)}
     * @param crawler The value of crawler as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCrawler_GreaterEqual(String crawler) {
        regCrawler(CK_GE, fRES(crawler));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CRAWLER: {NotNull, VARCHAR(1)}
     * @param crawler The value of crawler as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCrawler_LessEqual(String crawler) {
        regCrawler(CK_LE, fRES(crawler));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CRAWLER: {NotNull, VARCHAR(1)}
     * @param crawlerList The collection of crawler as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCrawler_InScope(Collection<String> crawlerList) {
        doSetCrawler_InScope(crawlerList);
    }

    protected void doSetCrawler_InScope(Collection<String> crawlerList) {
        regINS(CK_INS, cTL(crawlerList), xgetCValueCrawler(), "CRAWLER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CRAWLER: {NotNull, VARCHAR(1)}
     * @param crawlerList The collection of crawler as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCrawler_NotInScope(Collection<String> crawlerList) {
        doSetCrawler_NotInScope(crawlerList);
    }

    protected void doSetCrawler_NotInScope(Collection<String> crawlerList) {
        regINS(CK_NINS, cTL(crawlerList), xgetCValueCrawler(), "CRAWLER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CRAWLER: {NotNull, VARCHAR(1)} <br>
     * <pre>e.g. setCrawler_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param crawler The value of crawler as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCrawler_LikeSearch(String crawler, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCrawler_LikeSearch(crawler, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CRAWLER: {NotNull, VARCHAR(1)} <br>
     * <pre>e.g. setCrawler_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param crawler The value of crawler as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCrawler_LikeSearch(String crawler, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(crawler), xgetCValueCrawler(), "CRAWLER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CRAWLER: {NotNull, VARCHAR(1)}
     * @param crawler The value of crawler as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCrawler_NotLikeSearch(String crawler, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCrawler_NotLikeSearch(crawler, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CRAWLER: {NotNull, VARCHAR(1)}
     * @param crawler The value of crawler as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCrawler_NotLikeSearch(String crawler, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(crawler), xgetCValueCrawler(), "CRAWLER", likeSearchOption);
    }

    protected void regCrawler(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCrawler(), "CRAWLER"); }
    protected abstract ConditionValue xgetCValueCrawler();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JOB_LOGGING: {NotNull, VARCHAR(1)}
     * @param jobLogging The value of jobLogging as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setJobLogging_Equal(String jobLogging) {
        doSetJobLogging_Equal(fRES(jobLogging));
    }

    protected void doSetJobLogging_Equal(String jobLogging) {
        regJobLogging(CK_EQ, jobLogging);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JOB_LOGGING: {NotNull, VARCHAR(1)}
     * @param jobLogging The value of jobLogging as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setJobLogging_NotEqual(String jobLogging) {
        doSetJobLogging_NotEqual(fRES(jobLogging));
    }

    protected void doSetJobLogging_NotEqual(String jobLogging) {
        regJobLogging(CK_NES, jobLogging);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JOB_LOGGING: {NotNull, VARCHAR(1)}
     * @param jobLogging The value of jobLogging as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setJobLogging_GreaterThan(String jobLogging) {
        regJobLogging(CK_GT, fRES(jobLogging));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JOB_LOGGING: {NotNull, VARCHAR(1)}
     * @param jobLogging The value of jobLogging as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setJobLogging_LessThan(String jobLogging) {
        regJobLogging(CK_LT, fRES(jobLogging));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JOB_LOGGING: {NotNull, VARCHAR(1)}
     * @param jobLogging The value of jobLogging as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setJobLogging_GreaterEqual(String jobLogging) {
        regJobLogging(CK_GE, fRES(jobLogging));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JOB_LOGGING: {NotNull, VARCHAR(1)}
     * @param jobLogging The value of jobLogging as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setJobLogging_LessEqual(String jobLogging) {
        regJobLogging(CK_LE, fRES(jobLogging));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JOB_LOGGING: {NotNull, VARCHAR(1)}
     * @param jobLoggingList The collection of jobLogging as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJobLogging_InScope(Collection<String> jobLoggingList) {
        doSetJobLogging_InScope(jobLoggingList);
    }

    protected void doSetJobLogging_InScope(Collection<String> jobLoggingList) {
        regINS(CK_INS, cTL(jobLoggingList), xgetCValueJobLogging(), "JOB_LOGGING");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JOB_LOGGING: {NotNull, VARCHAR(1)}
     * @param jobLoggingList The collection of jobLogging as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJobLogging_NotInScope(Collection<String> jobLoggingList) {
        doSetJobLogging_NotInScope(jobLoggingList);
    }

    protected void doSetJobLogging_NotInScope(Collection<String> jobLoggingList) {
        regINS(CK_NINS, cTL(jobLoggingList), xgetCValueJobLogging(), "JOB_LOGGING");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JOB_LOGGING: {NotNull, VARCHAR(1)} <br>
     * <pre>e.g. setJobLogging_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param jobLogging The value of jobLogging as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJobLogging_LikeSearch(String jobLogging, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJobLogging_LikeSearch(jobLogging, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JOB_LOGGING: {NotNull, VARCHAR(1)} <br>
     * <pre>e.g. setJobLogging_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param jobLogging The value of jobLogging as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setJobLogging_LikeSearch(String jobLogging, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(jobLogging), xgetCValueJobLogging(), "JOB_LOGGING", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JOB_LOGGING: {NotNull, VARCHAR(1)}
     * @param jobLogging The value of jobLogging as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJobLogging_NotLikeSearch(String jobLogging, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJobLogging_NotLikeSearch(jobLogging, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JOB_LOGGING: {NotNull, VARCHAR(1)}
     * @param jobLogging The value of jobLogging as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setJobLogging_NotLikeSearch(String jobLogging, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(jobLogging), xgetCValueJobLogging(), "JOB_LOGGING", likeSearchOption);
    }

    protected void regJobLogging(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJobLogging(), "JOB_LOGGING"); }
    protected abstract ConditionValue xgetCValueJobLogging();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AVAILABLE: {NotNull, VARCHAR(1)}
     * @param available The value of available as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setAvailable_Equal(String available) {
        doSetAvailable_Equal(fRES(available));
    }

    protected void doSetAvailable_Equal(String available) {
        regAvailable(CK_EQ, available);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AVAILABLE: {NotNull, VARCHAR(1)}
     * @param available The value of available as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setAvailable_NotEqual(String available) {
        doSetAvailable_NotEqual(fRES(available));
    }

    protected void doSetAvailable_NotEqual(String available) {
        regAvailable(CK_NES, available);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AVAILABLE: {NotNull, VARCHAR(1)}
     * @param available The value of available as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setAvailable_GreaterThan(String available) {
        regAvailable(CK_GT, fRES(available));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AVAILABLE: {NotNull, VARCHAR(1)}
     * @param available The value of available as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setAvailable_LessThan(String available) {
        regAvailable(CK_LT, fRES(available));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AVAILABLE: {NotNull, VARCHAR(1)}
     * @param available The value of available as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setAvailable_GreaterEqual(String available) {
        regAvailable(CK_GE, fRES(available));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AVAILABLE: {NotNull, VARCHAR(1)}
     * @param available The value of available as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setAvailable_LessEqual(String available) {
        regAvailable(CK_LE, fRES(available));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AVAILABLE: {NotNull, VARCHAR(1)}
     * @param availableList The collection of available as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAvailable_InScope(Collection<String> availableList) {
        doSetAvailable_InScope(availableList);
    }

    protected void doSetAvailable_InScope(Collection<String> availableList) {
        regINS(CK_INS, cTL(availableList), xgetCValueAvailable(), "AVAILABLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AVAILABLE: {NotNull, VARCHAR(1)}
     * @param availableList The collection of available as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAvailable_NotInScope(Collection<String> availableList) {
        doSetAvailable_NotInScope(availableList);
    }

    protected void doSetAvailable_NotInScope(Collection<String> availableList) {
        regINS(CK_NINS, cTL(availableList), xgetCValueAvailable(), "AVAILABLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AVAILABLE: {NotNull, VARCHAR(1)} <br>
     * <pre>e.g. setAvailable_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param available The value of available as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAvailable_LikeSearch(String available, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAvailable_LikeSearch(available, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AVAILABLE: {NotNull, VARCHAR(1)} <br>
     * <pre>e.g. setAvailable_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param available The value of available as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAvailable_LikeSearch(String available, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(available), xgetCValueAvailable(), "AVAILABLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AVAILABLE: {NotNull, VARCHAR(1)}
     * @param available The value of available as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAvailable_NotLikeSearch(String available, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAvailable_NotLikeSearch(available, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AVAILABLE: {NotNull, VARCHAR(1)}
     * @param available The value of available as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAvailable_NotLikeSearch(String available, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(available), xgetCValueAvailable(), "AVAILABLE", likeSearchOption);
    }

    protected void regAvailable(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAvailable(), "AVAILABLE"); }
    protected abstract ConditionValue xgetCValueAvailable();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_ORDER: {NotNull, INTEGER(10)}
     * @param sortOrder The value of sortOrder as equal. (NullAllowed: if null, no condition)
     */
    public void setSortOrder_Equal(Integer sortOrder) {
        doSetSortOrder_Equal(sortOrder);
    }

    protected void doSetSortOrder_Equal(Integer sortOrder) {
        regSortOrder(CK_EQ, sortOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_ORDER: {NotNull, INTEGER(10)}
     * @param sortOrder The value of sortOrder as notEqual. (NullAllowed: if null, no condition)
     */
    public void setSortOrder_NotEqual(Integer sortOrder) {
        doSetSortOrder_NotEqual(sortOrder);
    }

    protected void doSetSortOrder_NotEqual(Integer sortOrder) {
        regSortOrder(CK_NES, sortOrder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_ORDER: {NotNull, INTEGER(10)}
     * @param sortOrder The value of sortOrder as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSortOrder_GreaterThan(Integer sortOrder) {
        regSortOrder(CK_GT, sortOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_ORDER: {NotNull, INTEGER(10)}
     * @param sortOrder The value of sortOrder as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSortOrder_LessThan(Integer sortOrder) {
        regSortOrder(CK_LT, sortOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_ORDER: {NotNull, INTEGER(10)}
     * @param sortOrder The value of sortOrder as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSortOrder_GreaterEqual(Integer sortOrder) {
        regSortOrder(CK_GE, sortOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_ORDER: {NotNull, INTEGER(10)}
     * @param sortOrder The value of sortOrder as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSortOrder_LessEqual(Integer sortOrder) {
        regSortOrder(CK_LE, sortOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_ORDER: {NotNull, INTEGER(10)}
     * @param minNumber The min number of sortOrder. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sortOrder. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSortOrder_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSortOrder_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_ORDER: {NotNull, INTEGER(10)}
     * @param minNumber The min number of sortOrder. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sortOrder. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSortOrder_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSortOrder(), "SORT_ORDER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORT_ORDER: {NotNull, INTEGER(10)}
     * @param sortOrderList The collection of sortOrder as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSortOrder_InScope(Collection<Integer> sortOrderList) {
        doSetSortOrder_InScope(sortOrderList);
    }

    protected void doSetSortOrder_InScope(Collection<Integer> sortOrderList) {
        regINS(CK_INS, cTL(sortOrderList), xgetCValueSortOrder(), "SORT_ORDER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORT_ORDER: {NotNull, INTEGER(10)}
     * @param sortOrderList The collection of sortOrder as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSortOrder_NotInScope(Collection<Integer> sortOrderList) {
        doSetSortOrder_NotInScope(sortOrderList);
    }

    protected void doSetSortOrder_NotInScope(Collection<Integer> sortOrderList) {
        regINS(CK_NINS, cTL(sortOrderList), xgetCValueSortOrder(), "SORT_ORDER");
    }

    protected void regSortOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortOrder(), "SORT_ORDER"); }
    protected abstract ConditionValue xgetCValueSortOrder();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATED_BY: {NotNull, VARCHAR(255)}
     * @param createdBy The value of createdBy as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCreatedBy_Equal(String createdBy) {
        doSetCreatedBy_Equal(fRES(createdBy));
    }

    protected void doSetCreatedBy_Equal(String createdBy) {
        regCreatedBy(CK_EQ, createdBy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATED_BY: {NotNull, VARCHAR(255)}
     * @param createdBy The value of createdBy as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCreatedBy_NotEqual(String createdBy) {
        doSetCreatedBy_NotEqual(fRES(createdBy));
    }

    protected void doSetCreatedBy_NotEqual(String createdBy) {
        regCreatedBy(CK_NES, createdBy);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATED_BY: {NotNull, VARCHAR(255)}
     * @param createdBy The value of createdBy as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setCreatedBy_GreaterThan(String createdBy) {
        regCreatedBy(CK_GT, fRES(createdBy));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATED_BY: {NotNull, VARCHAR(255)}
     * @param createdBy The value of createdBy as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setCreatedBy_LessThan(String createdBy) {
        regCreatedBy(CK_LT, fRES(createdBy));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATED_BY: {NotNull, VARCHAR(255)}
     * @param createdBy The value of createdBy as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCreatedBy_GreaterEqual(String createdBy) {
        regCreatedBy(CK_GE, fRES(createdBy));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATED_BY: {NotNull, VARCHAR(255)}
     * @param createdBy The value of createdBy as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCreatedBy_LessEqual(String createdBy) {
        regCreatedBy(CK_LE, fRES(createdBy));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATED_BY: {NotNull, VARCHAR(255)}
     * @param createdByList The collection of createdBy as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCreatedBy_InScope(Collection<String> createdByList) {
        doSetCreatedBy_InScope(createdByList);
    }

    protected void doSetCreatedBy_InScope(Collection<String> createdByList) {
        regINS(CK_INS, cTL(createdByList), xgetCValueCreatedBy(), "CREATED_BY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATED_BY: {NotNull, VARCHAR(255)}
     * @param createdByList The collection of createdBy as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCreatedBy_NotInScope(Collection<String> createdByList) {
        doSetCreatedBy_NotInScope(createdByList);
    }

    protected void doSetCreatedBy_NotInScope(Collection<String> createdByList) {
        regINS(CK_NINS, cTL(createdByList), xgetCValueCreatedBy(), "CREATED_BY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATED_BY: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setCreatedBy_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param createdBy The value of createdBy as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCreatedBy_LikeSearch(String createdBy, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCreatedBy_LikeSearch(createdBy, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATED_BY: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setCreatedBy_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param createdBy The value of createdBy as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCreatedBy_LikeSearch(String createdBy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(createdBy), xgetCValueCreatedBy(), "CREATED_BY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATED_BY: {NotNull, VARCHAR(255)}
     * @param createdBy The value of createdBy as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCreatedBy_NotLikeSearch(String createdBy, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCreatedBy_NotLikeSearch(createdBy, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATED_BY: {NotNull, VARCHAR(255)}
     * @param createdBy The value of createdBy as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCreatedBy_NotLikeSearch(String createdBy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(createdBy), xgetCValueCreatedBy(), "CREATED_BY", likeSearchOption);
    }

    protected void regCreatedBy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreatedBy(), "CREATED_BY"); }
    protected abstract ConditionValue xgetCValueCreatedBy();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(23, 10)}
     * @param createdTime The value of createdTime as equal. (NullAllowed: if null, no condition)
     */
    public void setCreatedTime_Equal(java.time.LocalDateTime createdTime) {
        regCreatedTime(CK_EQ,  createdTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(23, 10)}
     * @param createdTime The value of createdTime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setCreatedTime_GreaterThan(java.time.LocalDateTime createdTime) {
        regCreatedTime(CK_GT,  createdTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(23, 10)}
     * @param createdTime The value of createdTime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setCreatedTime_LessThan(java.time.LocalDateTime createdTime) {
        regCreatedTime(CK_LT,  createdTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(23, 10)}
     * @param createdTime The value of createdTime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setCreatedTime_GreaterEqual(java.time.LocalDateTime createdTime) {
        regCreatedTime(CK_GE,  createdTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(23, 10)}
     * @param createdTime The value of createdTime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setCreatedTime_LessEqual(java.time.LocalDateTime createdTime) {
        regCreatedTime(CK_LE, createdTime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setCreatedTime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdTime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdTime. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setCreatedTime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setCreatedTime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setCreatedTime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdTime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdTime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setCreatedTime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "CREATED_TIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueCreatedTime(), nm, op);
    }

    protected void regCreatedTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreatedTime(), "CREATED_TIME"); }
    protected abstract ConditionValue xgetCValueCreatedTime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATED_BY: {VARCHAR(255)}
     * @param updatedBy The value of updatedBy as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdatedBy_Equal(String updatedBy) {
        doSetUpdatedBy_Equal(fRES(updatedBy));
    }

    protected void doSetUpdatedBy_Equal(String updatedBy) {
        regUpdatedBy(CK_EQ, updatedBy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATED_BY: {VARCHAR(255)}
     * @param updatedBy The value of updatedBy as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdatedBy_NotEqual(String updatedBy) {
        doSetUpdatedBy_NotEqual(fRES(updatedBy));
    }

    protected void doSetUpdatedBy_NotEqual(String updatedBy) {
        regUpdatedBy(CK_NES, updatedBy);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATED_BY: {VARCHAR(255)}
     * @param updatedBy The value of updatedBy as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdatedBy_GreaterThan(String updatedBy) {
        regUpdatedBy(CK_GT, fRES(updatedBy));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATED_BY: {VARCHAR(255)}
     * @param updatedBy The value of updatedBy as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdatedBy_LessThan(String updatedBy) {
        regUpdatedBy(CK_LT, fRES(updatedBy));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATED_BY: {VARCHAR(255)}
     * @param updatedBy The value of updatedBy as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdatedBy_GreaterEqual(String updatedBy) {
        regUpdatedBy(CK_GE, fRES(updatedBy));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATED_BY: {VARCHAR(255)}
     * @param updatedBy The value of updatedBy as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdatedBy_LessEqual(String updatedBy) {
        regUpdatedBy(CK_LE, fRES(updatedBy));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPDATED_BY: {VARCHAR(255)}
     * @param updatedByList The collection of updatedBy as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdatedBy_InScope(Collection<String> updatedByList) {
        doSetUpdatedBy_InScope(updatedByList);
    }

    protected void doSetUpdatedBy_InScope(Collection<String> updatedByList) {
        regINS(CK_INS, cTL(updatedByList), xgetCValueUpdatedBy(), "UPDATED_BY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPDATED_BY: {VARCHAR(255)}
     * @param updatedByList The collection of updatedBy as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdatedBy_NotInScope(Collection<String> updatedByList) {
        doSetUpdatedBy_NotInScope(updatedByList);
    }

    protected void doSetUpdatedBy_NotInScope(Collection<String> updatedByList) {
        regINS(CK_NINS, cTL(updatedByList), xgetCValueUpdatedBy(), "UPDATED_BY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDATED_BY: {VARCHAR(255)} <br>
     * <pre>e.g. setUpdatedBy_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updatedBy The value of updatedBy as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdatedBy_LikeSearch(String updatedBy, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdatedBy_LikeSearch(updatedBy, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDATED_BY: {VARCHAR(255)} <br>
     * <pre>e.g. setUpdatedBy_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updatedBy The value of updatedBy as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdatedBy_LikeSearch(String updatedBy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updatedBy), xgetCValueUpdatedBy(), "UPDATED_BY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDATED_BY: {VARCHAR(255)}
     * @param updatedBy The value of updatedBy as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdatedBy_NotLikeSearch(String updatedBy, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdatedBy_NotLikeSearch(updatedBy, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDATED_BY: {VARCHAR(255)}
     * @param updatedBy The value of updatedBy as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdatedBy_NotLikeSearch(String updatedBy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updatedBy), xgetCValueUpdatedBy(), "UPDATED_BY", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPDATED_BY: {VARCHAR(255)}
     */
    public void setUpdatedBy_IsNull() { regUpdatedBy(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPDATED_BY: {VARCHAR(255)}
     */
    public void setUpdatedBy_IsNullOrEmpty() { regUpdatedBy(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPDATED_BY: {VARCHAR(255)}
     */
    public void setUpdatedBy_IsNotNull() { regUpdatedBy(CK_ISNN, DOBJ); }

    protected void regUpdatedBy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdatedBy(), "UPDATED_BY"); }
    protected abstract ConditionValue xgetCValueUpdatedBy();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATED_TIME: {TIMESTAMP(23, 10)}
     * @param updatedTime The value of updatedTime as equal. (NullAllowed: if null, no condition)
     */
    public void setUpdatedTime_Equal(java.time.LocalDateTime updatedTime) {
        regUpdatedTime(CK_EQ,  updatedTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATED_TIME: {TIMESTAMP(23, 10)}
     * @param updatedTime The value of updatedTime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setUpdatedTime_GreaterThan(java.time.LocalDateTime updatedTime) {
        regUpdatedTime(CK_GT,  updatedTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATED_TIME: {TIMESTAMP(23, 10)}
     * @param updatedTime The value of updatedTime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setUpdatedTime_LessThan(java.time.LocalDateTime updatedTime) {
        regUpdatedTime(CK_LT,  updatedTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATED_TIME: {TIMESTAMP(23, 10)}
     * @param updatedTime The value of updatedTime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setUpdatedTime_GreaterEqual(java.time.LocalDateTime updatedTime) {
        regUpdatedTime(CK_GE,  updatedTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATED_TIME: {TIMESTAMP(23, 10)}
     * @param updatedTime The value of updatedTime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setUpdatedTime_LessEqual(java.time.LocalDateTime updatedTime) {
        regUpdatedTime(CK_LE, updatedTime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATED_TIME: {TIMESTAMP(23, 10)}
     * <pre>e.g. setUpdatedTime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedTime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedTime. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdatedTime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdatedTime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATED_TIME: {TIMESTAMP(23, 10)}
     * <pre>e.g. setUpdatedTime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedTime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedTime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdatedTime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "UPDATED_TIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdatedTime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPDATED_TIME: {TIMESTAMP(23, 10)}
     */
    public void setUpdatedTime_IsNull() { regUpdatedTime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPDATED_TIME: {TIMESTAMP(23, 10)}
     */
    public void setUpdatedTime_IsNotNull() { regUpdatedTime(CK_ISNN, DOBJ); }

    protected void regUpdatedTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdatedTime(), "UPDATED_TIME"); }
    protected abstract ConditionValue xgetCValueUpdatedTime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELETED_BY: {VARCHAR(255)}
     * @param deletedBy The value of deletedBy as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setDeletedBy_Equal(String deletedBy) {
        doSetDeletedBy_Equal(fRES(deletedBy));
    }

    protected void doSetDeletedBy_Equal(String deletedBy) {
        regDeletedBy(CK_EQ, deletedBy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELETED_BY: {VARCHAR(255)}
     * @param deletedBy The value of deletedBy as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setDeletedBy_NotEqual(String deletedBy) {
        doSetDeletedBy_NotEqual(fRES(deletedBy));
    }

    protected void doSetDeletedBy_NotEqual(String deletedBy) {
        regDeletedBy(CK_NES, deletedBy);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELETED_BY: {VARCHAR(255)}
     * @param deletedBy The value of deletedBy as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setDeletedBy_GreaterThan(String deletedBy) {
        regDeletedBy(CK_GT, fRES(deletedBy));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELETED_BY: {VARCHAR(255)}
     * @param deletedBy The value of deletedBy as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setDeletedBy_LessThan(String deletedBy) {
        regDeletedBy(CK_LT, fRES(deletedBy));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELETED_BY: {VARCHAR(255)}
     * @param deletedBy The value of deletedBy as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setDeletedBy_GreaterEqual(String deletedBy) {
        regDeletedBy(CK_GE, fRES(deletedBy));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELETED_BY: {VARCHAR(255)}
     * @param deletedBy The value of deletedBy as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setDeletedBy_LessEqual(String deletedBy) {
        regDeletedBy(CK_LE, fRES(deletedBy));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELETED_BY: {VARCHAR(255)}
     * @param deletedByList The collection of deletedBy as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDeletedBy_InScope(Collection<String> deletedByList) {
        doSetDeletedBy_InScope(deletedByList);
    }

    protected void doSetDeletedBy_InScope(Collection<String> deletedByList) {
        regINS(CK_INS, cTL(deletedByList), xgetCValueDeletedBy(), "DELETED_BY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELETED_BY: {VARCHAR(255)}
     * @param deletedByList The collection of deletedBy as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDeletedBy_NotInScope(Collection<String> deletedByList) {
        doSetDeletedBy_NotInScope(deletedByList);
    }

    protected void doSetDeletedBy_NotInScope(Collection<String> deletedByList) {
        regINS(CK_NINS, cTL(deletedByList), xgetCValueDeletedBy(), "DELETED_BY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELETED_BY: {VARCHAR(255)} <br>
     * <pre>e.g. setDeletedBy_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param deletedBy The value of deletedBy as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDeletedBy_LikeSearch(String deletedBy, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDeletedBy_LikeSearch(deletedBy, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELETED_BY: {VARCHAR(255)} <br>
     * <pre>e.g. setDeletedBy_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deletedBy The value of deletedBy as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setDeletedBy_LikeSearch(String deletedBy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deletedBy), xgetCValueDeletedBy(), "DELETED_BY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELETED_BY: {VARCHAR(255)}
     * @param deletedBy The value of deletedBy as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDeletedBy_NotLikeSearch(String deletedBy, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDeletedBy_NotLikeSearch(deletedBy, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELETED_BY: {VARCHAR(255)}
     * @param deletedBy The value of deletedBy as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDeletedBy_NotLikeSearch(String deletedBy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deletedBy), xgetCValueDeletedBy(), "DELETED_BY", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELETED_BY: {VARCHAR(255)}
     */
    public void setDeletedBy_IsNull() { regDeletedBy(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELETED_BY: {VARCHAR(255)}
     */
    public void setDeletedBy_IsNullOrEmpty() { regDeletedBy(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELETED_BY: {VARCHAR(255)}
     */
    public void setDeletedBy_IsNotNull() { regDeletedBy(CK_ISNN, DOBJ); }

    protected void regDeletedBy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeletedBy(), "DELETED_BY"); }
    protected abstract ConditionValue xgetCValueDeletedBy();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELETED_TIME: {TIMESTAMP(23, 10)}
     * @param deletedTime The value of deletedTime as equal. (NullAllowed: if null, no condition)
     */
    public void setDeletedTime_Equal(java.time.LocalDateTime deletedTime) {
        regDeletedTime(CK_EQ,  deletedTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELETED_TIME: {TIMESTAMP(23, 10)}
     * @param deletedTime The value of deletedTime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setDeletedTime_GreaterThan(java.time.LocalDateTime deletedTime) {
        regDeletedTime(CK_GT,  deletedTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELETED_TIME: {TIMESTAMP(23, 10)}
     * @param deletedTime The value of deletedTime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setDeletedTime_LessThan(java.time.LocalDateTime deletedTime) {
        regDeletedTime(CK_LT,  deletedTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELETED_TIME: {TIMESTAMP(23, 10)}
     * @param deletedTime The value of deletedTime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setDeletedTime_GreaterEqual(java.time.LocalDateTime deletedTime) {
        regDeletedTime(CK_GE,  deletedTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELETED_TIME: {TIMESTAMP(23, 10)}
     * @param deletedTime The value of deletedTime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setDeletedTime_LessEqual(java.time.LocalDateTime deletedTime) {
        regDeletedTime(CK_LE, deletedTime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELETED_TIME: {TIMESTAMP(23, 10)}
     * <pre>e.g. setDeletedTime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of deletedTime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of deletedTime. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setDeletedTime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setDeletedTime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELETED_TIME: {TIMESTAMP(23, 10)}
     * <pre>e.g. setDeletedTime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of deletedTime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of deletedTime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setDeletedTime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "DELETED_TIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueDeletedTime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELETED_TIME: {TIMESTAMP(23, 10)}
     */
    public void setDeletedTime_IsNull() { regDeletedTime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELETED_TIME: {TIMESTAMP(23, 10)}
     */
    public void setDeletedTime_IsNotNull() { regDeletedTime(CK_ISNN, DOBJ); }

    protected void regDeletedTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeletedTime(), "DELETED_TIME"); }
    protected abstract ConditionValue xgetCValueDeletedTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, INTEGER(10)}
     * @param versionNo The value of versionNo as equal. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_Equal(Integer versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Integer versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, INTEGER(10)}
     * @param versionNo The value of versionNo as notEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_NotEqual(Integer versionNo) {
        doSetVersionNo_NotEqual(versionNo);
    }

    protected void doSetVersionNo_NotEqual(Integer versionNo) {
        regVersionNo(CK_NES, versionNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, INTEGER(10)}
     * @param versionNo The value of versionNo as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_GreaterThan(Integer versionNo) {
        regVersionNo(CK_GT, versionNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, INTEGER(10)}
     * @param versionNo The value of versionNo as lessThan. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_LessThan(Integer versionNo) {
        regVersionNo(CK_LT, versionNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, INTEGER(10)}
     * @param versionNo The value of versionNo as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_GreaterEqual(Integer versionNo) {
        regVersionNo(CK_GE, versionNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, INTEGER(10)}
     * @param versionNo The value of versionNo as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_LessEqual(Integer versionNo) {
        regVersionNo(CK_LE, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, INTEGER(10)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVersionNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, INTEGER(10)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setVersionNo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VERSION_NO: {NotNull, INTEGER(10)}
     * @param versionNoList The collection of versionNo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_InScope(Collection<Integer> versionNoList) {
        doSetVersionNo_InScope(versionNoList);
    }

    protected void doSetVersionNo_InScope(Collection<Integer> versionNoList) {
        regINS(CK_INS, cTL(versionNoList), xgetCValueVersionNo(), "VERSION_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VERSION_NO: {NotNull, INTEGER(10)}
     * @param versionNoList The collection of versionNo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_NotInScope(Collection<Integer> versionNoList) {
        doSetVersionNo_NotInScope(versionNoList);
    }

    protected void doSetVersionNo_NotInScope(Collection<Integer> versionNoList) {
        regINS(CK_NINS, cTL(versionNoList), xgetCValueVersionNo(), "VERSION_NO");
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue xgetCValueVersionNo();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;ScheduledJobCB&gt;() {
     *     public void query(ScheduledJobCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ScheduledJobCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, ScheduledJobCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;ScheduledJobCB&gt;() {
     *     public void query(ScheduledJobCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ScheduledJobCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, ScheduledJobCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;ScheduledJobCB&gt;() {
     *     public void query(ScheduledJobCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ScheduledJobCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, ScheduledJobCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;ScheduledJobCB&gt;() {
     *     public void query(ScheduledJobCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ScheduledJobCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, ScheduledJobCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;ScheduledJobCB&gt;() {
     *     public void query(ScheduledJobCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ScheduledJobCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, ScheduledJobCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ScheduledJobCB&gt;() {
     *     public void query(ScheduledJobCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ScheduledJobCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, ScheduledJobCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        ScheduledJobCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(ScheduledJobCQ sq);

    protected ScheduledJobCB xcreateScalarConditionCB() {
        ScheduledJobCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ScheduledJobCB xcreateScalarConditionPartitionByCB() {
        ScheduledJobCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ScheduledJobCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ScheduledJobCB cb = new ScheduledJobCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ScheduledJobCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ScheduledJobCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ScheduledJobCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ScheduledJobCB cb = new ScheduledJobCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ScheduledJobCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ScheduledJobCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ScheduledJobCB cb = new ScheduledJobCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ScheduledJobCQ sq);

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
    protected ScheduledJobCB newMyCB() {
        return new ScheduledJobCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ScheduledJobCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
