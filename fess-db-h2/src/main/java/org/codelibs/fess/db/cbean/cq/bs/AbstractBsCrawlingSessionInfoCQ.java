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
 * The abstract condition-query of CRAWLING_SESSION_INFO.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsCrawlingSessionInfoCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsCrawlingSessionInfoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "CRAWLING_SESSION_INFO";
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
     * CRAWLING_SESSION_ID: {IX, NotNull, BIGINT(19), FK to CRAWLING_SESSION}
     * @param crawlingSessionId The value of crawlingSessionId as equal. (NullAllowed: if null, no condition)
     */
    public void setCrawlingSessionId_Equal(Long crawlingSessionId) {
        doSetCrawlingSessionId_Equal(crawlingSessionId);
    }

    protected void doSetCrawlingSessionId_Equal(Long crawlingSessionId) {
        regCrawlingSessionId(CK_EQ, crawlingSessionId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CRAWLING_SESSION_ID: {IX, NotNull, BIGINT(19), FK to CRAWLING_SESSION}
     * @param crawlingSessionId The value of crawlingSessionId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setCrawlingSessionId_NotEqual(Long crawlingSessionId) {
        doSetCrawlingSessionId_NotEqual(crawlingSessionId);
    }

    protected void doSetCrawlingSessionId_NotEqual(Long crawlingSessionId) {
        regCrawlingSessionId(CK_NES, crawlingSessionId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CRAWLING_SESSION_ID: {IX, NotNull, BIGINT(19), FK to CRAWLING_SESSION}
     * @param crawlingSessionId The value of crawlingSessionId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setCrawlingSessionId_GreaterThan(Long crawlingSessionId) {
        regCrawlingSessionId(CK_GT, crawlingSessionId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CRAWLING_SESSION_ID: {IX, NotNull, BIGINT(19), FK to CRAWLING_SESSION}
     * @param crawlingSessionId The value of crawlingSessionId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setCrawlingSessionId_LessThan(Long crawlingSessionId) {
        regCrawlingSessionId(CK_LT, crawlingSessionId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CRAWLING_SESSION_ID: {IX, NotNull, BIGINT(19), FK to CRAWLING_SESSION}
     * @param crawlingSessionId The value of crawlingSessionId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setCrawlingSessionId_GreaterEqual(Long crawlingSessionId) {
        regCrawlingSessionId(CK_GE, crawlingSessionId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CRAWLING_SESSION_ID: {IX, NotNull, BIGINT(19), FK to CRAWLING_SESSION}
     * @param crawlingSessionId The value of crawlingSessionId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setCrawlingSessionId_LessEqual(Long crawlingSessionId) {
        regCrawlingSessionId(CK_LE, crawlingSessionId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CRAWLING_SESSION_ID: {IX, NotNull, BIGINT(19), FK to CRAWLING_SESSION}
     * @param minNumber The min number of crawlingSessionId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of crawlingSessionId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCrawlingSessionId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCrawlingSessionId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CRAWLING_SESSION_ID: {IX, NotNull, BIGINT(19), FK to CRAWLING_SESSION}
     * @param minNumber The min number of crawlingSessionId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of crawlingSessionId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCrawlingSessionId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCrawlingSessionId(), "CRAWLING_SESSION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CRAWLING_SESSION_ID: {IX, NotNull, BIGINT(19), FK to CRAWLING_SESSION}
     * @param crawlingSessionIdList The collection of crawlingSessionId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCrawlingSessionId_InScope(Collection<Long> crawlingSessionIdList) {
        doSetCrawlingSessionId_InScope(crawlingSessionIdList);
    }

    protected void doSetCrawlingSessionId_InScope(Collection<Long> crawlingSessionIdList) {
        regINS(CK_INS, cTL(crawlingSessionIdList), xgetCValueCrawlingSessionId(), "CRAWLING_SESSION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CRAWLING_SESSION_ID: {IX, NotNull, BIGINT(19), FK to CRAWLING_SESSION}
     * @param crawlingSessionIdList The collection of crawlingSessionId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCrawlingSessionId_NotInScope(Collection<Long> crawlingSessionIdList) {
        doSetCrawlingSessionId_NotInScope(crawlingSessionIdList);
    }

    protected void doSetCrawlingSessionId_NotInScope(Collection<Long> crawlingSessionIdList) {
        regINS(CK_NINS, cTL(crawlingSessionIdList), xgetCValueCrawlingSessionId(), "CRAWLING_SESSION_ID");
    }

    protected void regCrawlingSessionId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCrawlingSessionId(), "CRAWLING_SESSION_ID"); }
    protected abstract ConditionValue xgetCValueCrawlingSessionId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KEY: {NotNull, VARCHAR(20)}
     * @param key The value of key as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setKey_Equal(String key) {
        doSetKey_Equal(fRES(key));
    }

    protected void doSetKey_Equal(String key) {
        regKey(CK_EQ, key);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KEY: {NotNull, VARCHAR(20)}
     * @param key The value of key as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setKey_NotEqual(String key) {
        doSetKey_NotEqual(fRES(key));
    }

    protected void doSetKey_NotEqual(String key) {
        regKey(CK_NES, key);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KEY: {NotNull, VARCHAR(20)}
     * @param key The value of key as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setKey_GreaterThan(String key) {
        regKey(CK_GT, fRES(key));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KEY: {NotNull, VARCHAR(20)}
     * @param key The value of key as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setKey_LessThan(String key) {
        regKey(CK_LT, fRES(key));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KEY: {NotNull, VARCHAR(20)}
     * @param key The value of key as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setKey_GreaterEqual(String key) {
        regKey(CK_GE, fRES(key));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KEY: {NotNull, VARCHAR(20)}
     * @param key The value of key as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setKey_LessEqual(String key) {
        regKey(CK_LE, fRES(key));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KEY: {NotNull, VARCHAR(20)}
     * @param keyList The collection of key as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setKey_InScope(Collection<String> keyList) {
        doSetKey_InScope(keyList);
    }

    protected void doSetKey_InScope(Collection<String> keyList) {
        regINS(CK_INS, cTL(keyList), xgetCValueKey(), "KEY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KEY: {NotNull, VARCHAR(20)}
     * @param keyList The collection of key as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setKey_NotInScope(Collection<String> keyList) {
        doSetKey_NotInScope(keyList);
    }

    protected void doSetKey_NotInScope(Collection<String> keyList) {
        regINS(CK_NINS, cTL(keyList), xgetCValueKey(), "KEY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KEY: {NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setKey_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param key The value of key as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setKey_LikeSearch(String key, ConditionOptionCall<LikeSearchOption> opLambda) {
        setKey_LikeSearch(key, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KEY: {NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setKey_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param key The value of key as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setKey_LikeSearch(String key, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(key), xgetCValueKey(), "KEY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KEY: {NotNull, VARCHAR(20)}
     * @param key The value of key as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setKey_NotLikeSearch(String key, ConditionOptionCall<LikeSearchOption> opLambda) {
        setKey_NotLikeSearch(key, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KEY: {NotNull, VARCHAR(20)}
     * @param key The value of key as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setKey_NotLikeSearch(String key, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(key), xgetCValueKey(), "KEY", likeSearchOption);
    }

    protected void regKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKey(), "KEY"); }
    protected abstract ConditionValue xgetCValueKey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALUE: {NotNull, VARCHAR(100)}
     * @param value The value of value as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setValue_Equal(String value) {
        doSetValue_Equal(fRES(value));
    }

    protected void doSetValue_Equal(String value) {
        regValue(CK_EQ, value);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALUE: {NotNull, VARCHAR(100)}
     * @param value The value of value as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setValue_NotEqual(String value) {
        doSetValue_NotEqual(fRES(value));
    }

    protected void doSetValue_NotEqual(String value) {
        regValue(CK_NES, value);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALUE: {NotNull, VARCHAR(100)}
     * @param value The value of value as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setValue_GreaterThan(String value) {
        regValue(CK_GT, fRES(value));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALUE: {NotNull, VARCHAR(100)}
     * @param value The value of value as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setValue_LessThan(String value) {
        regValue(CK_LT, fRES(value));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALUE: {NotNull, VARCHAR(100)}
     * @param value The value of value as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setValue_GreaterEqual(String value) {
        regValue(CK_GE, fRES(value));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALUE: {NotNull, VARCHAR(100)}
     * @param value The value of value as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setValue_LessEqual(String value) {
        regValue(CK_LE, fRES(value));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VALUE: {NotNull, VARCHAR(100)}
     * @param valueList The collection of value as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setValue_InScope(Collection<String> valueList) {
        doSetValue_InScope(valueList);
    }

    protected void doSetValue_InScope(Collection<String> valueList) {
        regINS(CK_INS, cTL(valueList), xgetCValueValue(), "VALUE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VALUE: {NotNull, VARCHAR(100)}
     * @param valueList The collection of value as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setValue_NotInScope(Collection<String> valueList) {
        doSetValue_NotInScope(valueList);
    }

    protected void doSetValue_NotInScope(Collection<String> valueList) {
        regINS(CK_NINS, cTL(valueList), xgetCValueValue(), "VALUE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VALUE: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setValue_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param value The value of value as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setValue_LikeSearch(String value, ConditionOptionCall<LikeSearchOption> opLambda) {
        setValue_LikeSearch(value, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VALUE: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setValue_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param value The value of value as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setValue_LikeSearch(String value, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(value), xgetCValueValue(), "VALUE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VALUE: {NotNull, VARCHAR(100)}
     * @param value The value of value as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setValue_NotLikeSearch(String value, ConditionOptionCall<LikeSearchOption> opLambda) {
        setValue_NotLikeSearch(value, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VALUE: {NotNull, VARCHAR(100)}
     * @param value The value of value as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setValue_NotLikeSearch(String value, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(value), xgetCValueValue(), "VALUE", likeSearchOption);
    }

    protected void regValue(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueValue(), "VALUE"); }
    protected abstract ConditionValue xgetCValueValue();

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

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;CrawlingSessionInfoCB&gt;() {
     *     public void query(CrawlingSessionInfoCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<CrawlingSessionInfoCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, CrawlingSessionInfoCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;CrawlingSessionInfoCB&gt;() {
     *     public void query(CrawlingSessionInfoCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<CrawlingSessionInfoCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, CrawlingSessionInfoCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;CrawlingSessionInfoCB&gt;() {
     *     public void query(CrawlingSessionInfoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<CrawlingSessionInfoCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, CrawlingSessionInfoCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;CrawlingSessionInfoCB&gt;() {
     *     public void query(CrawlingSessionInfoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<CrawlingSessionInfoCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, CrawlingSessionInfoCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;CrawlingSessionInfoCB&gt;() {
     *     public void query(CrawlingSessionInfoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<CrawlingSessionInfoCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, CrawlingSessionInfoCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;CrawlingSessionInfoCB&gt;() {
     *     public void query(CrawlingSessionInfoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<CrawlingSessionInfoCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, CrawlingSessionInfoCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        CrawlingSessionInfoCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(CrawlingSessionInfoCQ sq);

    protected CrawlingSessionInfoCB xcreateScalarConditionCB() {
        CrawlingSessionInfoCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected CrawlingSessionInfoCB xcreateScalarConditionPartitionByCB() {
        CrawlingSessionInfoCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<CrawlingSessionInfoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CrawlingSessionInfoCB cb = new CrawlingSessionInfoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(CrawlingSessionInfoCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<CrawlingSessionInfoCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(CrawlingSessionInfoCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CrawlingSessionInfoCB cb = new CrawlingSessionInfoCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(CrawlingSessionInfoCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<CrawlingSessionInfoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CrawlingSessionInfoCB cb = new CrawlingSessionInfoCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(CrawlingSessionInfoCQ sq);

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
    protected CrawlingSessionInfoCB newMyCB() {
        return new CrawlingSessionInfoCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return CrawlingSessionInfoCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
