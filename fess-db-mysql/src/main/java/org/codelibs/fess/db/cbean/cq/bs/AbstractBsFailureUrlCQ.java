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
 * The abstract condition-query of FAILURE_URL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsFailureUrlCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsFailureUrlCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "FAILURE_URL";
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
     * URL: {NotNull, TEXT(65535)}
     * @param url The value of url as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUrl_Equal(String url) {
        doSetUrl_Equal(fRES(url));
    }

    protected void doSetUrl_Equal(String url) {
        regUrl(CK_EQ, url);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URL: {NotNull, TEXT(65535)}
     * @param url The value of url as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUrl_NotEqual(String url) {
        doSetUrl_NotEqual(fRES(url));
    }

    protected void doSetUrl_NotEqual(String url) {
        regUrl(CK_NES, url);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URL: {NotNull, TEXT(65535)}
     * @param url The value of url as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUrl_GreaterThan(String url) {
        regUrl(CK_GT, fRES(url));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URL: {NotNull, TEXT(65535)}
     * @param url The value of url as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUrl_LessThan(String url) {
        regUrl(CK_LT, fRES(url));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URL: {NotNull, TEXT(65535)}
     * @param url The value of url as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUrl_GreaterEqual(String url) {
        regUrl(CK_GE, fRES(url));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URL: {NotNull, TEXT(65535)}
     * @param url The value of url as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUrl_LessEqual(String url) {
        regUrl(CK_LE, fRES(url));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * URL: {NotNull, TEXT(65535)}
     * @param urlList The collection of url as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUrl_InScope(Collection<String> urlList) {
        doSetUrl_InScope(urlList);
    }

    protected void doSetUrl_InScope(Collection<String> urlList) {
        regINS(CK_INS, cTL(urlList), xgetCValueUrl(), "URL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * URL: {NotNull, TEXT(65535)}
     * @param urlList The collection of url as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUrl_NotInScope(Collection<String> urlList) {
        doSetUrl_NotInScope(urlList);
    }

    protected void doSetUrl_NotInScope(Collection<String> urlList) {
        regINS(CK_NINS, cTL(urlList), xgetCValueUrl(), "URL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * URL: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setUrl_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param url The value of url as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUrl_LikeSearch(String url, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUrl_LikeSearch(url, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * URL: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setUrl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param url The value of url as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUrl_LikeSearch(String url, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(url), xgetCValueUrl(), "URL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * URL: {NotNull, TEXT(65535)}
     * @param url The value of url as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUrl_NotLikeSearch(String url, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUrl_NotLikeSearch(url, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * URL: {NotNull, TEXT(65535)}
     * @param url The value of url as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUrl_NotLikeSearch(String url, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(url), xgetCValueUrl(), "URL", likeSearchOption);
    }

    protected void regUrl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUrl(), "URL"); }
    protected abstract ConditionValue xgetCValueUrl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * THREAD_NAME: {NotNull, VARCHAR(30)}
     * @param threadName The value of threadName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setThreadName_Equal(String threadName) {
        doSetThreadName_Equal(fRES(threadName));
    }

    protected void doSetThreadName_Equal(String threadName) {
        regThreadName(CK_EQ, threadName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * THREAD_NAME: {NotNull, VARCHAR(30)}
     * @param threadName The value of threadName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setThreadName_NotEqual(String threadName) {
        doSetThreadName_NotEqual(fRES(threadName));
    }

    protected void doSetThreadName_NotEqual(String threadName) {
        regThreadName(CK_NES, threadName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * THREAD_NAME: {NotNull, VARCHAR(30)}
     * @param threadName The value of threadName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setThreadName_GreaterThan(String threadName) {
        regThreadName(CK_GT, fRES(threadName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * THREAD_NAME: {NotNull, VARCHAR(30)}
     * @param threadName The value of threadName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setThreadName_LessThan(String threadName) {
        regThreadName(CK_LT, fRES(threadName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * THREAD_NAME: {NotNull, VARCHAR(30)}
     * @param threadName The value of threadName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setThreadName_GreaterEqual(String threadName) {
        regThreadName(CK_GE, fRES(threadName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * THREAD_NAME: {NotNull, VARCHAR(30)}
     * @param threadName The value of threadName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setThreadName_LessEqual(String threadName) {
        regThreadName(CK_LE, fRES(threadName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * THREAD_NAME: {NotNull, VARCHAR(30)}
     * @param threadNameList The collection of threadName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setThreadName_InScope(Collection<String> threadNameList) {
        doSetThreadName_InScope(threadNameList);
    }

    protected void doSetThreadName_InScope(Collection<String> threadNameList) {
        regINS(CK_INS, cTL(threadNameList), xgetCValueThreadName(), "THREAD_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * THREAD_NAME: {NotNull, VARCHAR(30)}
     * @param threadNameList The collection of threadName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setThreadName_NotInScope(Collection<String> threadNameList) {
        doSetThreadName_NotInScope(threadNameList);
    }

    protected void doSetThreadName_NotInScope(Collection<String> threadNameList) {
        regINS(CK_NINS, cTL(threadNameList), xgetCValueThreadName(), "THREAD_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * THREAD_NAME: {NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setThreadName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param threadName The value of threadName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setThreadName_LikeSearch(String threadName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setThreadName_LikeSearch(threadName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * THREAD_NAME: {NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setThreadName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param threadName The value of threadName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setThreadName_LikeSearch(String threadName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(threadName), xgetCValueThreadName(), "THREAD_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * THREAD_NAME: {NotNull, VARCHAR(30)}
     * @param threadName The value of threadName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setThreadName_NotLikeSearch(String threadName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setThreadName_NotLikeSearch(threadName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * THREAD_NAME: {NotNull, VARCHAR(30)}
     * @param threadName The value of threadName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setThreadName_NotLikeSearch(String threadName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(threadName), xgetCValueThreadName(), "THREAD_NAME", likeSearchOption);
    }

    protected void regThreadName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueThreadName(), "THREAD_NAME"); }
    protected abstract ConditionValue xgetCValueThreadName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_NAME: {VARCHAR(255)}
     * @param errorName The value of errorName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setErrorName_Equal(String errorName) {
        doSetErrorName_Equal(fRES(errorName));
    }

    protected void doSetErrorName_Equal(String errorName) {
        regErrorName(CK_EQ, errorName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_NAME: {VARCHAR(255)}
     * @param errorName The value of errorName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setErrorName_NotEqual(String errorName) {
        doSetErrorName_NotEqual(fRES(errorName));
    }

    protected void doSetErrorName_NotEqual(String errorName) {
        regErrorName(CK_NES, errorName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_NAME: {VARCHAR(255)}
     * @param errorName The value of errorName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setErrorName_GreaterThan(String errorName) {
        regErrorName(CK_GT, fRES(errorName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_NAME: {VARCHAR(255)}
     * @param errorName The value of errorName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setErrorName_LessThan(String errorName) {
        regErrorName(CK_LT, fRES(errorName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_NAME: {VARCHAR(255)}
     * @param errorName The value of errorName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setErrorName_GreaterEqual(String errorName) {
        regErrorName(CK_GE, fRES(errorName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_NAME: {VARCHAR(255)}
     * @param errorName The value of errorName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setErrorName_LessEqual(String errorName) {
        regErrorName(CK_LE, fRES(errorName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_NAME: {VARCHAR(255)}
     * @param errorNameList The collection of errorName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setErrorName_InScope(Collection<String> errorNameList) {
        doSetErrorName_InScope(errorNameList);
    }

    protected void doSetErrorName_InScope(Collection<String> errorNameList) {
        regINS(CK_INS, cTL(errorNameList), xgetCValueErrorName(), "ERROR_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_NAME: {VARCHAR(255)}
     * @param errorNameList The collection of errorName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setErrorName_NotInScope(Collection<String> errorNameList) {
        doSetErrorName_NotInScope(errorNameList);
    }

    protected void doSetErrorName_NotInScope(Collection<String> errorNameList) {
        regINS(CK_NINS, cTL(errorNameList), xgetCValueErrorName(), "ERROR_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_NAME: {VARCHAR(255)} <br>
     * <pre>e.g. setErrorName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param errorName The value of errorName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setErrorName_LikeSearch(String errorName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setErrorName_LikeSearch(errorName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_NAME: {VARCHAR(255)} <br>
     * <pre>e.g. setErrorName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errorName The value of errorName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setErrorName_LikeSearch(String errorName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errorName), xgetCValueErrorName(), "ERROR_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_NAME: {VARCHAR(255)}
     * @param errorName The value of errorName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setErrorName_NotLikeSearch(String errorName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setErrorName_NotLikeSearch(errorName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_NAME: {VARCHAR(255)}
     * @param errorName The value of errorName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setErrorName_NotLikeSearch(String errorName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorName), xgetCValueErrorName(), "ERROR_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_NAME: {VARCHAR(255)}
     */
    public void setErrorName_IsNull() { regErrorName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ERROR_NAME: {VARCHAR(255)}
     */
    public void setErrorName_IsNullOrEmpty() { regErrorName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_NAME: {VARCHAR(255)}
     */
    public void setErrorName_IsNotNull() { regErrorName(CK_ISNN, DOBJ); }

    protected void regErrorName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorName(), "ERROR_NAME"); }
    protected abstract ConditionValue xgetCValueErrorName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_LOG: {TEXT(65535)}
     * @param errorLog The value of errorLog as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setErrorLog_Equal(String errorLog) {
        doSetErrorLog_Equal(fRES(errorLog));
    }

    protected void doSetErrorLog_Equal(String errorLog) {
        regErrorLog(CK_EQ, errorLog);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_LOG: {TEXT(65535)}
     * @param errorLog The value of errorLog as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setErrorLog_NotEqual(String errorLog) {
        doSetErrorLog_NotEqual(fRES(errorLog));
    }

    protected void doSetErrorLog_NotEqual(String errorLog) {
        regErrorLog(CK_NES, errorLog);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_LOG: {TEXT(65535)}
     * @param errorLog The value of errorLog as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setErrorLog_GreaterThan(String errorLog) {
        regErrorLog(CK_GT, fRES(errorLog));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_LOG: {TEXT(65535)}
     * @param errorLog The value of errorLog as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setErrorLog_LessThan(String errorLog) {
        regErrorLog(CK_LT, fRES(errorLog));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_LOG: {TEXT(65535)}
     * @param errorLog The value of errorLog as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setErrorLog_GreaterEqual(String errorLog) {
        regErrorLog(CK_GE, fRES(errorLog));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_LOG: {TEXT(65535)}
     * @param errorLog The value of errorLog as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setErrorLog_LessEqual(String errorLog) {
        regErrorLog(CK_LE, fRES(errorLog));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_LOG: {TEXT(65535)}
     * @param errorLogList The collection of errorLog as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setErrorLog_InScope(Collection<String> errorLogList) {
        doSetErrorLog_InScope(errorLogList);
    }

    protected void doSetErrorLog_InScope(Collection<String> errorLogList) {
        regINS(CK_INS, cTL(errorLogList), xgetCValueErrorLog(), "ERROR_LOG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_LOG: {TEXT(65535)}
     * @param errorLogList The collection of errorLog as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setErrorLog_NotInScope(Collection<String> errorLogList) {
        doSetErrorLog_NotInScope(errorLogList);
    }

    protected void doSetErrorLog_NotInScope(Collection<String> errorLogList) {
        regINS(CK_NINS, cTL(errorLogList), xgetCValueErrorLog(), "ERROR_LOG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_LOG: {TEXT(65535)} <br>
     * <pre>e.g. setErrorLog_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param errorLog The value of errorLog as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setErrorLog_LikeSearch(String errorLog, ConditionOptionCall<LikeSearchOption> opLambda) {
        setErrorLog_LikeSearch(errorLog, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_LOG: {TEXT(65535)} <br>
     * <pre>e.g. setErrorLog_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errorLog The value of errorLog as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setErrorLog_LikeSearch(String errorLog, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errorLog), xgetCValueErrorLog(), "ERROR_LOG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_LOG: {TEXT(65535)}
     * @param errorLog The value of errorLog as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setErrorLog_NotLikeSearch(String errorLog, ConditionOptionCall<LikeSearchOption> opLambda) {
        setErrorLog_NotLikeSearch(errorLog, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_LOG: {TEXT(65535)}
     * @param errorLog The value of errorLog as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setErrorLog_NotLikeSearch(String errorLog, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorLog), xgetCValueErrorLog(), "ERROR_LOG", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_LOG: {TEXT(65535)}
     */
    public void setErrorLog_IsNull() { regErrorLog(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ERROR_LOG: {TEXT(65535)}
     */
    public void setErrorLog_IsNullOrEmpty() { regErrorLog(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_LOG: {TEXT(65535)}
     */
    public void setErrorLog_IsNotNull() { regErrorLog(CK_ISNN, DOBJ); }

    protected void regErrorLog(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorLog(), "ERROR_LOG"); }
    protected abstract ConditionValue xgetCValueErrorLog();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ERROR_COUNT: {NotNull, INT(10)}
     * @param errorCount The value of errorCount as equal. (NullAllowed: if null, no condition)
     */
    public void setErrorCount_Equal(Integer errorCount) {
        doSetErrorCount_Equal(errorCount);
    }

    protected void doSetErrorCount_Equal(Integer errorCount) {
        regErrorCount(CK_EQ, errorCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ERROR_COUNT: {NotNull, INT(10)}
     * @param errorCount The value of errorCount as notEqual. (NullAllowed: if null, no condition)
     */
    public void setErrorCount_NotEqual(Integer errorCount) {
        doSetErrorCount_NotEqual(errorCount);
    }

    protected void doSetErrorCount_NotEqual(Integer errorCount) {
        regErrorCount(CK_NES, errorCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ERROR_COUNT: {NotNull, INT(10)}
     * @param errorCount The value of errorCount as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setErrorCount_GreaterThan(Integer errorCount) {
        regErrorCount(CK_GT, errorCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ERROR_COUNT: {NotNull, INT(10)}
     * @param errorCount The value of errorCount as lessThan. (NullAllowed: if null, no condition)
     */
    public void setErrorCount_LessThan(Integer errorCount) {
        regErrorCount(CK_LT, errorCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ERROR_COUNT: {NotNull, INT(10)}
     * @param errorCount The value of errorCount as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setErrorCount_GreaterEqual(Integer errorCount) {
        regErrorCount(CK_GE, errorCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ERROR_COUNT: {NotNull, INT(10)}
     * @param errorCount The value of errorCount as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setErrorCount_LessEqual(Integer errorCount) {
        regErrorCount(CK_LE, errorCount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ERROR_COUNT: {NotNull, INT(10)}
     * @param minNumber The min number of errorCount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of errorCount. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setErrorCount_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setErrorCount_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ERROR_COUNT: {NotNull, INT(10)}
     * @param minNumber The min number of errorCount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of errorCount. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setErrorCount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueErrorCount(), "ERROR_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ERROR_COUNT: {NotNull, INT(10)}
     * @param errorCountList The collection of errorCount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setErrorCount_InScope(Collection<Integer> errorCountList) {
        doSetErrorCount_InScope(errorCountList);
    }

    protected void doSetErrorCount_InScope(Collection<Integer> errorCountList) {
        regINS(CK_INS, cTL(errorCountList), xgetCValueErrorCount(), "ERROR_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ERROR_COUNT: {NotNull, INT(10)}
     * @param errorCountList The collection of errorCount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setErrorCount_NotInScope(Collection<Integer> errorCountList) {
        doSetErrorCount_NotInScope(errorCountList);
    }

    protected void doSetErrorCount_NotInScope(Collection<Integer> errorCountList) {
        regINS(CK_NINS, cTL(errorCountList), xgetCValueErrorCount(), "ERROR_COUNT");
    }

    protected void regErrorCount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorCount(), "ERROR_COUNT"); }
    protected abstract ConditionValue xgetCValueErrorCount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_ACCESS_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param lastAccessTime The value of lastAccessTime as equal. (NullAllowed: if null, no condition)
     */
    public void setLastAccessTime_Equal(java.time.LocalDateTime lastAccessTime) {
        regLastAccessTime(CK_EQ,  lastAccessTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_ACCESS_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param lastAccessTime The value of lastAccessTime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setLastAccessTime_GreaterThan(java.time.LocalDateTime lastAccessTime) {
        regLastAccessTime(CK_GT,  lastAccessTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_ACCESS_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param lastAccessTime The value of lastAccessTime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setLastAccessTime_LessThan(java.time.LocalDateTime lastAccessTime) {
        regLastAccessTime(CK_LT,  lastAccessTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_ACCESS_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param lastAccessTime The value of lastAccessTime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setLastAccessTime_GreaterEqual(java.time.LocalDateTime lastAccessTime) {
        regLastAccessTime(CK_GE,  lastAccessTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_ACCESS_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param lastAccessTime The value of lastAccessTime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setLastAccessTime_LessEqual(java.time.LocalDateTime lastAccessTime) {
        regLastAccessTime(CK_LE, lastAccessTime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_ACCESS_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setLastAccessTime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of lastAccessTime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of lastAccessTime. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setLastAccessTime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setLastAccessTime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_ACCESS_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setLastAccessTime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of lastAccessTime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of lastAccessTime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setLastAccessTime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "LAST_ACCESS_TIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueLastAccessTime(), nm, op);
    }

    protected void regLastAccessTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLastAccessTime(), "LAST_ACCESS_TIME"); }
    protected abstract ConditionValue xgetCValueLastAccessTime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIG_ID: {VARCHAR(100)}
     * @param configId The value of configId as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setConfigId_Equal(String configId) {
        doSetConfigId_Equal(fRES(configId));
    }

    protected void doSetConfigId_Equal(String configId) {
        regConfigId(CK_EQ, configId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIG_ID: {VARCHAR(100)}
     * @param configId The value of configId as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setConfigId_NotEqual(String configId) {
        doSetConfigId_NotEqual(fRES(configId));
    }

    protected void doSetConfigId_NotEqual(String configId) {
        regConfigId(CK_NES, configId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIG_ID: {VARCHAR(100)}
     * @param configId The value of configId as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setConfigId_GreaterThan(String configId) {
        regConfigId(CK_GT, fRES(configId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIG_ID: {VARCHAR(100)}
     * @param configId The value of configId as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setConfigId_LessThan(String configId) {
        regConfigId(CK_LT, fRES(configId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIG_ID: {VARCHAR(100)}
     * @param configId The value of configId as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setConfigId_GreaterEqual(String configId) {
        regConfigId(CK_GE, fRES(configId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIG_ID: {VARCHAR(100)}
     * @param configId The value of configId as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setConfigId_LessEqual(String configId) {
        regConfigId(CK_LE, fRES(configId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CONFIG_ID: {VARCHAR(100)}
     * @param configIdList The collection of configId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConfigId_InScope(Collection<String> configIdList) {
        doSetConfigId_InScope(configIdList);
    }

    protected void doSetConfigId_InScope(Collection<String> configIdList) {
        regINS(CK_INS, cTL(configIdList), xgetCValueConfigId(), "CONFIG_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CONFIG_ID: {VARCHAR(100)}
     * @param configIdList The collection of configId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConfigId_NotInScope(Collection<String> configIdList) {
        doSetConfigId_NotInScope(configIdList);
    }

    protected void doSetConfigId_NotInScope(Collection<String> configIdList) {
        regINS(CK_NINS, cTL(configIdList), xgetCValueConfigId(), "CONFIG_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONFIG_ID: {VARCHAR(100)} <br>
     * <pre>e.g. setConfigId_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param configId The value of configId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setConfigId_LikeSearch(String configId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setConfigId_LikeSearch(configId, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONFIG_ID: {VARCHAR(100)} <br>
     * <pre>e.g. setConfigId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param configId The value of configId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setConfigId_LikeSearch(String configId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(configId), xgetCValueConfigId(), "CONFIG_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONFIG_ID: {VARCHAR(100)}
     * @param configId The value of configId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setConfigId_NotLikeSearch(String configId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setConfigId_NotLikeSearch(configId, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONFIG_ID: {VARCHAR(100)}
     * @param configId The value of configId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setConfigId_NotLikeSearch(String configId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(configId), xgetCValueConfigId(), "CONFIG_ID", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CONFIG_ID: {VARCHAR(100)}
     */
    public void setConfigId_IsNull() { regConfigId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CONFIG_ID: {VARCHAR(100)}
     */
    public void setConfigId_IsNullOrEmpty() { regConfigId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CONFIG_ID: {VARCHAR(100)}
     */
    public void setConfigId_IsNotNull() { regConfigId(CK_ISNN, DOBJ); }

    protected void regConfigId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueConfigId(), "CONFIG_ID"); }
    protected abstract ConditionValue xgetCValueConfigId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;FailureUrlCB&gt;() {
     *     public void query(FailureUrlCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<FailureUrlCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, FailureUrlCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;FailureUrlCB&gt;() {
     *     public void query(FailureUrlCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<FailureUrlCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, FailureUrlCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;FailureUrlCB&gt;() {
     *     public void query(FailureUrlCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<FailureUrlCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, FailureUrlCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;FailureUrlCB&gt;() {
     *     public void query(FailureUrlCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<FailureUrlCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, FailureUrlCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;FailureUrlCB&gt;() {
     *     public void query(FailureUrlCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<FailureUrlCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, FailureUrlCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;FailureUrlCB&gt;() {
     *     public void query(FailureUrlCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<FailureUrlCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, FailureUrlCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        FailureUrlCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(FailureUrlCQ sq);

    protected FailureUrlCB xcreateScalarConditionCB() {
        FailureUrlCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected FailureUrlCB xcreateScalarConditionPartitionByCB() {
        FailureUrlCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<FailureUrlCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FailureUrlCB cb = new FailureUrlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(FailureUrlCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<FailureUrlCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(FailureUrlCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FailureUrlCB cb = new FailureUrlCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(FailureUrlCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<FailureUrlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        FailureUrlCB cb = new FailureUrlCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(FailureUrlCQ sq);

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
    protected FailureUrlCB newMyCB() {
        return new FailureUrlCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return FailureUrlCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
