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
 * The abstract condition-query of JOB_LOG.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsJobLogCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsJobLogCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "JOB_LOG";
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
     * JOB_NAME: {NotNull, VARCHAR(100)}
     * @param jobName The value of jobName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setJobName_Equal(String jobName) {
        doSetJobName_Equal(fRES(jobName));
    }

    protected void doSetJobName_Equal(String jobName) {
        regJobName(CK_EQ, jobName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JOB_NAME: {NotNull, VARCHAR(100)}
     * @param jobName The value of jobName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setJobName_NotEqual(String jobName) {
        doSetJobName_NotEqual(fRES(jobName));
    }

    protected void doSetJobName_NotEqual(String jobName) {
        regJobName(CK_NES, jobName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JOB_NAME: {NotNull, VARCHAR(100)}
     * @param jobName The value of jobName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setJobName_GreaterThan(String jobName) {
        regJobName(CK_GT, fRES(jobName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JOB_NAME: {NotNull, VARCHAR(100)}
     * @param jobName The value of jobName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setJobName_LessThan(String jobName) {
        regJobName(CK_LT, fRES(jobName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JOB_NAME: {NotNull, VARCHAR(100)}
     * @param jobName The value of jobName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setJobName_GreaterEqual(String jobName) {
        regJobName(CK_GE, fRES(jobName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JOB_NAME: {NotNull, VARCHAR(100)}
     * @param jobName The value of jobName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setJobName_LessEqual(String jobName) {
        regJobName(CK_LE, fRES(jobName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JOB_NAME: {NotNull, VARCHAR(100)}
     * @param jobNameList The collection of jobName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJobName_InScope(Collection<String> jobNameList) {
        doSetJobName_InScope(jobNameList);
    }

    protected void doSetJobName_InScope(Collection<String> jobNameList) {
        regINS(CK_INS, cTL(jobNameList), xgetCValueJobName(), "JOB_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JOB_NAME: {NotNull, VARCHAR(100)}
     * @param jobNameList The collection of jobName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJobName_NotInScope(Collection<String> jobNameList) {
        doSetJobName_NotInScope(jobNameList);
    }

    protected void doSetJobName_NotInScope(Collection<String> jobNameList) {
        regINS(CK_NINS, cTL(jobNameList), xgetCValueJobName(), "JOB_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JOB_NAME: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setJobName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param jobName The value of jobName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJobName_LikeSearch(String jobName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJobName_LikeSearch(jobName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JOB_NAME: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setJobName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param jobName The value of jobName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setJobName_LikeSearch(String jobName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(jobName), xgetCValueJobName(), "JOB_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JOB_NAME: {NotNull, VARCHAR(100)}
     * @param jobName The value of jobName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJobName_NotLikeSearch(String jobName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJobName_NotLikeSearch(jobName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JOB_NAME: {NotNull, VARCHAR(100)}
     * @param jobName The value of jobName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setJobName_NotLikeSearch(String jobName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(jobName), xgetCValueJobName(), "JOB_NAME", likeSearchOption);
    }

    protected void regJobName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJobName(), "JOB_NAME"); }
    protected abstract ConditionValue xgetCValueJobName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JOB_STATUS: {NotNull, VARCHAR(10)}
     * @param jobStatus The value of jobStatus as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setJobStatus_Equal(String jobStatus) {
        doSetJobStatus_Equal(fRES(jobStatus));
    }

    protected void doSetJobStatus_Equal(String jobStatus) {
        regJobStatus(CK_EQ, jobStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JOB_STATUS: {NotNull, VARCHAR(10)}
     * @param jobStatus The value of jobStatus as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setJobStatus_NotEqual(String jobStatus) {
        doSetJobStatus_NotEqual(fRES(jobStatus));
    }

    protected void doSetJobStatus_NotEqual(String jobStatus) {
        regJobStatus(CK_NES, jobStatus);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JOB_STATUS: {NotNull, VARCHAR(10)}
     * @param jobStatus The value of jobStatus as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setJobStatus_GreaterThan(String jobStatus) {
        regJobStatus(CK_GT, fRES(jobStatus));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JOB_STATUS: {NotNull, VARCHAR(10)}
     * @param jobStatus The value of jobStatus as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setJobStatus_LessThan(String jobStatus) {
        regJobStatus(CK_LT, fRES(jobStatus));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JOB_STATUS: {NotNull, VARCHAR(10)}
     * @param jobStatus The value of jobStatus as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setJobStatus_GreaterEqual(String jobStatus) {
        regJobStatus(CK_GE, fRES(jobStatus));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JOB_STATUS: {NotNull, VARCHAR(10)}
     * @param jobStatus The value of jobStatus as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setJobStatus_LessEqual(String jobStatus) {
        regJobStatus(CK_LE, fRES(jobStatus));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JOB_STATUS: {NotNull, VARCHAR(10)}
     * @param jobStatusList The collection of jobStatus as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJobStatus_InScope(Collection<String> jobStatusList) {
        doSetJobStatus_InScope(jobStatusList);
    }

    protected void doSetJobStatus_InScope(Collection<String> jobStatusList) {
        regINS(CK_INS, cTL(jobStatusList), xgetCValueJobStatus(), "JOB_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JOB_STATUS: {NotNull, VARCHAR(10)}
     * @param jobStatusList The collection of jobStatus as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJobStatus_NotInScope(Collection<String> jobStatusList) {
        doSetJobStatus_NotInScope(jobStatusList);
    }

    protected void doSetJobStatus_NotInScope(Collection<String> jobStatusList) {
        regINS(CK_NINS, cTL(jobStatusList), xgetCValueJobStatus(), "JOB_STATUS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JOB_STATUS: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setJobStatus_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param jobStatus The value of jobStatus as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJobStatus_LikeSearch(String jobStatus, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJobStatus_LikeSearch(jobStatus, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JOB_STATUS: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setJobStatus_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param jobStatus The value of jobStatus as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setJobStatus_LikeSearch(String jobStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(jobStatus), xgetCValueJobStatus(), "JOB_STATUS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JOB_STATUS: {NotNull, VARCHAR(10)}
     * @param jobStatus The value of jobStatus as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJobStatus_NotLikeSearch(String jobStatus, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJobStatus_NotLikeSearch(jobStatus, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JOB_STATUS: {NotNull, VARCHAR(10)}
     * @param jobStatus The value of jobStatus as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setJobStatus_NotLikeSearch(String jobStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(jobStatus), xgetCValueJobStatus(), "JOB_STATUS", likeSearchOption);
    }

    protected void regJobStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJobStatus(), "JOB_STATUS"); }
    protected abstract ConditionValue xgetCValueJobStatus();

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
     * SCRIPT_DATA: {TEXT(65535)}
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
     * SCRIPT_DATA: {TEXT(65535)}
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
     * SCRIPT_DATA: {TEXT(65535)}
     * @param scriptData The value of scriptData as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptData_GreaterThan(String scriptData) {
        regScriptData(CK_GT, fRES(scriptData));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCRIPT_DATA: {TEXT(65535)}
     * @param scriptData The value of scriptData as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptData_LessThan(String scriptData) {
        regScriptData(CK_LT, fRES(scriptData));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCRIPT_DATA: {TEXT(65535)}
     * @param scriptData The value of scriptData as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptData_GreaterEqual(String scriptData) {
        regScriptData(CK_GE, fRES(scriptData));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCRIPT_DATA: {TEXT(65535)}
     * @param scriptData The value of scriptData as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptData_LessEqual(String scriptData) {
        regScriptData(CK_LE, fRES(scriptData));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCRIPT_DATA: {TEXT(65535)}
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
     * SCRIPT_DATA: {TEXT(65535)}
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
     * SCRIPT_DATA: {TEXT(65535)} <br>
     * <pre>e.g. setScriptData_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param scriptData The value of scriptData as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setScriptData_LikeSearch(String scriptData, ConditionOptionCall<LikeSearchOption> opLambda) {
        setScriptData_LikeSearch(scriptData, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCRIPT_DATA: {TEXT(65535)} <br>
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
     * SCRIPT_DATA: {TEXT(65535)}
     * @param scriptData The value of scriptData as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setScriptData_NotLikeSearch(String scriptData, ConditionOptionCall<LikeSearchOption> opLambda) {
        setScriptData_NotLikeSearch(scriptData, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCRIPT_DATA: {TEXT(65535)}
     * @param scriptData The value of scriptData as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setScriptData_NotLikeSearch(String scriptData, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(scriptData), xgetCValueScriptData(), "SCRIPT_DATA", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SCRIPT_DATA: {TEXT(65535)}
     */
    public void setScriptData_IsNull() { regScriptData(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SCRIPT_DATA: {TEXT(65535)}
     */
    public void setScriptData_IsNullOrEmpty() { regScriptData(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SCRIPT_DATA: {TEXT(65535)}
     */
    public void setScriptData_IsNotNull() { regScriptData(CK_ISNN, DOBJ); }

    protected void regScriptData(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScriptData(), "SCRIPT_DATA"); }
    protected abstract ConditionValue xgetCValueScriptData();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCRIPT_RESULT: {TEXT(65535)}
     * @param scriptResult The value of scriptResult as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptResult_Equal(String scriptResult) {
        doSetScriptResult_Equal(fRES(scriptResult));
    }

    protected void doSetScriptResult_Equal(String scriptResult) {
        regScriptResult(CK_EQ, scriptResult);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCRIPT_RESULT: {TEXT(65535)}
     * @param scriptResult The value of scriptResult as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptResult_NotEqual(String scriptResult) {
        doSetScriptResult_NotEqual(fRES(scriptResult));
    }

    protected void doSetScriptResult_NotEqual(String scriptResult) {
        regScriptResult(CK_NES, scriptResult);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCRIPT_RESULT: {TEXT(65535)}
     * @param scriptResult The value of scriptResult as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptResult_GreaterThan(String scriptResult) {
        regScriptResult(CK_GT, fRES(scriptResult));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCRIPT_RESULT: {TEXT(65535)}
     * @param scriptResult The value of scriptResult as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptResult_LessThan(String scriptResult) {
        regScriptResult(CK_LT, fRES(scriptResult));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCRIPT_RESULT: {TEXT(65535)}
     * @param scriptResult The value of scriptResult as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptResult_GreaterEqual(String scriptResult) {
        regScriptResult(CK_GE, fRES(scriptResult));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCRIPT_RESULT: {TEXT(65535)}
     * @param scriptResult The value of scriptResult as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptResult_LessEqual(String scriptResult) {
        regScriptResult(CK_LE, fRES(scriptResult));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCRIPT_RESULT: {TEXT(65535)}
     * @param scriptResultList The collection of scriptResult as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptResult_InScope(Collection<String> scriptResultList) {
        doSetScriptResult_InScope(scriptResultList);
    }

    protected void doSetScriptResult_InScope(Collection<String> scriptResultList) {
        regINS(CK_INS, cTL(scriptResultList), xgetCValueScriptResult(), "SCRIPT_RESULT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCRIPT_RESULT: {TEXT(65535)}
     * @param scriptResultList The collection of scriptResult as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setScriptResult_NotInScope(Collection<String> scriptResultList) {
        doSetScriptResult_NotInScope(scriptResultList);
    }

    protected void doSetScriptResult_NotInScope(Collection<String> scriptResultList) {
        regINS(CK_NINS, cTL(scriptResultList), xgetCValueScriptResult(), "SCRIPT_RESULT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCRIPT_RESULT: {TEXT(65535)} <br>
     * <pre>e.g. setScriptResult_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param scriptResult The value of scriptResult as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setScriptResult_LikeSearch(String scriptResult, ConditionOptionCall<LikeSearchOption> opLambda) {
        setScriptResult_LikeSearch(scriptResult, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCRIPT_RESULT: {TEXT(65535)} <br>
     * <pre>e.g. setScriptResult_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param scriptResult The value of scriptResult as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setScriptResult_LikeSearch(String scriptResult, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(scriptResult), xgetCValueScriptResult(), "SCRIPT_RESULT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCRIPT_RESULT: {TEXT(65535)}
     * @param scriptResult The value of scriptResult as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setScriptResult_NotLikeSearch(String scriptResult, ConditionOptionCall<LikeSearchOption> opLambda) {
        setScriptResult_NotLikeSearch(scriptResult, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCRIPT_RESULT: {TEXT(65535)}
     * @param scriptResult The value of scriptResult as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setScriptResult_NotLikeSearch(String scriptResult, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(scriptResult), xgetCValueScriptResult(), "SCRIPT_RESULT", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SCRIPT_RESULT: {TEXT(65535)}
     */
    public void setScriptResult_IsNull() { regScriptResult(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SCRIPT_RESULT: {TEXT(65535)}
     */
    public void setScriptResult_IsNullOrEmpty() { regScriptResult(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SCRIPT_RESULT: {TEXT(65535)}
     */
    public void setScriptResult_IsNotNull() { regScriptResult(CK_ISNN, DOBJ); }

    protected void regScriptResult(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScriptResult(), "SCRIPT_RESULT"); }
    protected abstract ConditionValue xgetCValueScriptResult();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * START_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param startTime The value of startTime as equal. (NullAllowed: if null, no condition)
     */
    public void setStartTime_Equal(java.time.LocalDateTime startTime) {
        regStartTime(CK_EQ,  startTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * START_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param startTime The value of startTime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setStartTime_GreaterThan(java.time.LocalDateTime startTime) {
        regStartTime(CK_GT,  startTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * START_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param startTime The value of startTime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setStartTime_LessThan(java.time.LocalDateTime startTime) {
        regStartTime(CK_LT,  startTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * START_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param startTime The value of startTime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setStartTime_GreaterEqual(java.time.LocalDateTime startTime) {
        regStartTime(CK_GE,  startTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * START_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param startTime The value of startTime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setStartTime_LessEqual(java.time.LocalDateTime startTime) {
        regStartTime(CK_LE, startTime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * START_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setStartTime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of startTime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of startTime. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setStartTime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setStartTime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * START_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setStartTime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of startTime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of startTime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setStartTime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "START_TIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueStartTime(), nm, op);
    }

    protected void regStartTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStartTime(), "START_TIME"); }
    protected abstract ConditionValue xgetCValueStartTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * END_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @param endTime The value of endTime as equal. (NullAllowed: if null, no condition)
     */
    public void setEndTime_Equal(java.time.LocalDateTime endTime) {
        regEndTime(CK_EQ,  endTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * END_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @param endTime The value of endTime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setEndTime_GreaterThan(java.time.LocalDateTime endTime) {
        regEndTime(CK_GT,  endTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * END_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @param endTime The value of endTime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setEndTime_LessThan(java.time.LocalDateTime endTime) {
        regEndTime(CK_LT,  endTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * END_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @param endTime The value of endTime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setEndTime_GreaterEqual(java.time.LocalDateTime endTime) {
        regEndTime(CK_GE,  endTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * END_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @param endTime The value of endTime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setEndTime_LessEqual(java.time.LocalDateTime endTime) {
        regEndTime(CK_LE, endTime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * END_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * <pre>e.g. setEndTime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endTime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endTime. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setEndTime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setEndTime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * END_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * <pre>e.g. setEndTime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endTime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endTime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setEndTime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "END_TIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueEndTime(), nm, op);
    }

    protected void regEndTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEndTime(), "END_TIME"); }
    protected abstract ConditionValue xgetCValueEndTime();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;JobLogCB&gt;() {
     *     public void query(JobLogCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<JobLogCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, JobLogCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;JobLogCB&gt;() {
     *     public void query(JobLogCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<JobLogCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, JobLogCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;JobLogCB&gt;() {
     *     public void query(JobLogCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<JobLogCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, JobLogCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;JobLogCB&gt;() {
     *     public void query(JobLogCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<JobLogCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, JobLogCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;JobLogCB&gt;() {
     *     public void query(JobLogCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<JobLogCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, JobLogCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;JobLogCB&gt;() {
     *     public void query(JobLogCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<JobLogCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, JobLogCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        JobLogCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(JobLogCQ sq);

    protected JobLogCB xcreateScalarConditionCB() {
        JobLogCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected JobLogCB xcreateScalarConditionPartitionByCB() {
        JobLogCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<JobLogCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JobLogCB cb = new JobLogCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(JobLogCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<JobLogCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(JobLogCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JobLogCB cb = new JobLogCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(JobLogCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<JobLogCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JobLogCB cb = new JobLogCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(JobLogCQ sq);

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
    protected JobLogCB newMyCB() {
        return new JobLogCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return JobLogCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
