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
 * The abstract condition-query of REQUEST_HEADER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsRequestHeaderCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsRequestHeaderCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "REQUEST_HEADER";
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
     * VALUE: {NotNull, TEXT(65535)}
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
     * VALUE: {NotNull, TEXT(65535)}
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
     * VALUE: {NotNull, TEXT(65535)}
     * @param value The value of value as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setValue_GreaterThan(String value) {
        regValue(CK_GT, fRES(value));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALUE: {NotNull, TEXT(65535)}
     * @param value The value of value as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setValue_LessThan(String value) {
        regValue(CK_LT, fRES(value));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALUE: {NotNull, TEXT(65535)}
     * @param value The value of value as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setValue_GreaterEqual(String value) {
        regValue(CK_GE, fRES(value));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALUE: {NotNull, TEXT(65535)}
     * @param value The value of value as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setValue_LessEqual(String value) {
        regValue(CK_LE, fRES(value));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VALUE: {NotNull, TEXT(65535)}
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
     * VALUE: {NotNull, TEXT(65535)}
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
     * VALUE: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setValue_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param value The value of value as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setValue_LikeSearch(String value, ConditionOptionCall<LikeSearchOption> opLambda) {
        setValue_LikeSearch(value, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VALUE: {NotNull, TEXT(65535)} <br>
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
     * VALUE: {NotNull, TEXT(65535)}
     * @param value The value of value as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setValue_NotLikeSearch(String value, ConditionOptionCall<LikeSearchOption> opLambda) {
        setValue_NotLikeSearch(value, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VALUE: {NotNull, TEXT(65535)}
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
     * WEB_CRAWLING_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to WEB_CRAWLING_CONFIG}
     * @param webCrawlingConfigId The value of webCrawlingConfigId as equal. (NullAllowed: if null, no condition)
     */
    public void setWebCrawlingConfigId_Equal(Long webCrawlingConfigId) {
        doSetWebCrawlingConfigId_Equal(webCrawlingConfigId);
    }

    protected void doSetWebCrawlingConfigId_Equal(Long webCrawlingConfigId) {
        regWebCrawlingConfigId(CK_EQ, webCrawlingConfigId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WEB_CRAWLING_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to WEB_CRAWLING_CONFIG}
     * @param webCrawlingConfigId The value of webCrawlingConfigId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setWebCrawlingConfigId_NotEqual(Long webCrawlingConfigId) {
        doSetWebCrawlingConfigId_NotEqual(webCrawlingConfigId);
    }

    protected void doSetWebCrawlingConfigId_NotEqual(Long webCrawlingConfigId) {
        regWebCrawlingConfigId(CK_NES, webCrawlingConfigId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WEB_CRAWLING_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to WEB_CRAWLING_CONFIG}
     * @param webCrawlingConfigId The value of webCrawlingConfigId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setWebCrawlingConfigId_GreaterThan(Long webCrawlingConfigId) {
        regWebCrawlingConfigId(CK_GT, webCrawlingConfigId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WEB_CRAWLING_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to WEB_CRAWLING_CONFIG}
     * @param webCrawlingConfigId The value of webCrawlingConfigId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setWebCrawlingConfigId_LessThan(Long webCrawlingConfigId) {
        regWebCrawlingConfigId(CK_LT, webCrawlingConfigId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WEB_CRAWLING_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to WEB_CRAWLING_CONFIG}
     * @param webCrawlingConfigId The value of webCrawlingConfigId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setWebCrawlingConfigId_GreaterEqual(Long webCrawlingConfigId) {
        regWebCrawlingConfigId(CK_GE, webCrawlingConfigId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WEB_CRAWLING_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to WEB_CRAWLING_CONFIG}
     * @param webCrawlingConfigId The value of webCrawlingConfigId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setWebCrawlingConfigId_LessEqual(Long webCrawlingConfigId) {
        regWebCrawlingConfigId(CK_LE, webCrawlingConfigId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WEB_CRAWLING_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to WEB_CRAWLING_CONFIG}
     * @param minNumber The min number of webCrawlingConfigId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of webCrawlingConfigId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setWebCrawlingConfigId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setWebCrawlingConfigId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WEB_CRAWLING_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to WEB_CRAWLING_CONFIG}
     * @param minNumber The min number of webCrawlingConfigId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of webCrawlingConfigId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setWebCrawlingConfigId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWebCrawlingConfigId(), "WEB_CRAWLING_CONFIG_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WEB_CRAWLING_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to WEB_CRAWLING_CONFIG}
     * @param webCrawlingConfigIdList The collection of webCrawlingConfigId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWebCrawlingConfigId_InScope(Collection<Long> webCrawlingConfigIdList) {
        doSetWebCrawlingConfigId_InScope(webCrawlingConfigIdList);
    }

    protected void doSetWebCrawlingConfigId_InScope(Collection<Long> webCrawlingConfigIdList) {
        regINS(CK_INS, cTL(webCrawlingConfigIdList), xgetCValueWebCrawlingConfigId(), "WEB_CRAWLING_CONFIG_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WEB_CRAWLING_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to WEB_CRAWLING_CONFIG}
     * @param webCrawlingConfigIdList The collection of webCrawlingConfigId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWebCrawlingConfigId_NotInScope(Collection<Long> webCrawlingConfigIdList) {
        doSetWebCrawlingConfigId_NotInScope(webCrawlingConfigIdList);
    }

    protected void doSetWebCrawlingConfigId_NotInScope(Collection<Long> webCrawlingConfigIdList) {
        regINS(CK_NINS, cTL(webCrawlingConfigIdList), xgetCValueWebCrawlingConfigId(), "WEB_CRAWLING_CONFIG_ID");
    }

    protected void regWebCrawlingConfigId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWebCrawlingConfigId(), "WEB_CRAWLING_CONFIG_ID"); }
    protected abstract ConditionValue xgetCValueWebCrawlingConfigId();

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
     * CREATED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param createdTime The value of createdTime as equal. (NullAllowed: if null, no condition)
     */
    public void setCreatedTime_Equal(java.time.LocalDateTime createdTime) {
        regCreatedTime(CK_EQ,  createdTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param createdTime The value of createdTime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setCreatedTime_GreaterThan(java.time.LocalDateTime createdTime) {
        regCreatedTime(CK_GT,  createdTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param createdTime The value of createdTime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setCreatedTime_LessThan(java.time.LocalDateTime createdTime) {
        regCreatedTime(CK_LT,  createdTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param createdTime The value of createdTime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setCreatedTime_GreaterEqual(java.time.LocalDateTime createdTime) {
        regCreatedTime(CK_GE,  createdTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param createdTime The value of createdTime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setCreatedTime_LessEqual(java.time.LocalDateTime createdTime) {
        regCreatedTime(CK_LE, createdTime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
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
     * CREATED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
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
     * UPDATED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @param updatedTime The value of updatedTime as equal. (NullAllowed: if null, no condition)
     */
    public void setUpdatedTime_Equal(java.time.LocalDateTime updatedTime) {
        regUpdatedTime(CK_EQ,  updatedTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @param updatedTime The value of updatedTime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setUpdatedTime_GreaterThan(java.time.LocalDateTime updatedTime) {
        regUpdatedTime(CK_GT,  updatedTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @param updatedTime The value of updatedTime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setUpdatedTime_LessThan(java.time.LocalDateTime updatedTime) {
        regUpdatedTime(CK_LT,  updatedTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @param updatedTime The value of updatedTime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setUpdatedTime_GreaterEqual(java.time.LocalDateTime updatedTime) {
        regUpdatedTime(CK_GE,  updatedTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @param updatedTime The value of updatedTime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setUpdatedTime_LessEqual(java.time.LocalDateTime updatedTime) {
        regUpdatedTime(CK_LE, updatedTime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
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
     * UPDATED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * <pre>e.g. setUpdatedTime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedTime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedTime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdatedTime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "UPDATED_TIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdatedTime(), nm, op);
    }

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
     * DELETED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @param deletedTime The value of deletedTime as equal. (NullAllowed: if null, no condition)
     */
    public void setDeletedTime_Equal(java.time.LocalDateTime deletedTime) {
        regDeletedTime(CK_EQ,  deletedTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELETED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @param deletedTime The value of deletedTime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setDeletedTime_GreaterThan(java.time.LocalDateTime deletedTime) {
        regDeletedTime(CK_GT,  deletedTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELETED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @param deletedTime The value of deletedTime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setDeletedTime_LessThan(java.time.LocalDateTime deletedTime) {
        regDeletedTime(CK_LT,  deletedTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELETED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @param deletedTime The value of deletedTime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setDeletedTime_GreaterEqual(java.time.LocalDateTime deletedTime) {
        regDeletedTime(CK_GE,  deletedTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELETED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @param deletedTime The value of deletedTime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setDeletedTime_LessEqual(java.time.LocalDateTime deletedTime) {
        regDeletedTime(CK_LE, deletedTime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELETED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
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
     * DELETED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * <pre>e.g. setDeletedTime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of deletedTime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of deletedTime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setDeletedTime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "DELETED_TIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueDeletedTime(), nm, op);
    }

    protected void regDeletedTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeletedTime(), "DELETED_TIME"); }
    protected abstract ConditionValue xgetCValueDeletedTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, INT(10)}
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
     * VERSION_NO: {NotNull, INT(10)}
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
     * VERSION_NO: {NotNull, INT(10)}
     * @param versionNo The value of versionNo as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_GreaterThan(Integer versionNo) {
        regVersionNo(CK_GT, versionNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, INT(10)}
     * @param versionNo The value of versionNo as lessThan. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_LessThan(Integer versionNo) {
        regVersionNo(CK_LT, versionNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, INT(10)}
     * @param versionNo The value of versionNo as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_GreaterEqual(Integer versionNo) {
        regVersionNo(CK_GE, versionNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, INT(10)}
     * @param versionNo The value of versionNo as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_LessEqual(Integer versionNo) {
        regVersionNo(CK_LE, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, INT(10)}
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
     * VERSION_NO: {NotNull, INT(10)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setVersionNo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VERSION_NO: {NotNull, INT(10)}
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
     * VERSION_NO: {NotNull, INT(10)}
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
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;RequestHeaderCB&gt;() {
     *     public void query(RequestHeaderCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RequestHeaderCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, RequestHeaderCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;RequestHeaderCB&gt;() {
     *     public void query(RequestHeaderCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RequestHeaderCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, RequestHeaderCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;RequestHeaderCB&gt;() {
     *     public void query(RequestHeaderCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RequestHeaderCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, RequestHeaderCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;RequestHeaderCB&gt;() {
     *     public void query(RequestHeaderCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RequestHeaderCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, RequestHeaderCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;RequestHeaderCB&gt;() {
     *     public void query(RequestHeaderCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RequestHeaderCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, RequestHeaderCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;RequestHeaderCB&gt;() {
     *     public void query(RequestHeaderCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RequestHeaderCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, RequestHeaderCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        RequestHeaderCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(RequestHeaderCQ sq);

    protected RequestHeaderCB xcreateScalarConditionCB() {
        RequestHeaderCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected RequestHeaderCB xcreateScalarConditionPartitionByCB() {
        RequestHeaderCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<RequestHeaderCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RequestHeaderCB cb = new RequestHeaderCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(RequestHeaderCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<RequestHeaderCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(RequestHeaderCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RequestHeaderCB cb = new RequestHeaderCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(RequestHeaderCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<RequestHeaderCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        RequestHeaderCB cb = new RequestHeaderCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(RequestHeaderCQ sq);

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
    protected RequestHeaderCB newMyCB() {
        return new RequestHeaderCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return RequestHeaderCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
