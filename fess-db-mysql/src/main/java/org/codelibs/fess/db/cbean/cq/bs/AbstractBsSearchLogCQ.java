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
 * The abstract condition-query of SEARCH_LOG.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsSearchLogCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsSearchLogCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "SEARCH_LOG";
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
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SEARCH_ID from CLICK_LOG where ...)} <br>
     * CLICK_LOG by SEARCH_ID, named 'clickLogAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsClickLog</span>(logCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     logCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClickLogList for 'exists'. (NotNull)
     */
    public void existsClickLog(SubQuery<ClickLogCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ClickLogCB cb = new ClickLogCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_ExistsReferrer_ClickLogList(cb.query());
        registerExistsReferrer(cb.query(), "ID", "SEARCH_ID", pp, "clickLogList");
    }
    public abstract String keepId_ExistsReferrer_ClickLogList(ClickLogCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SEARCH_ID from SEARCH_FIELD_LOG where ...)} <br>
     * SEARCH_FIELD_LOG by SEARCH_ID, named 'searchFieldLogAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsSearchFieldLog</span>(logCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     logCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SearchFieldLogList for 'exists'. (NotNull)
     */
    public void existsSearchFieldLog(SubQuery<SearchFieldLogCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SearchFieldLogCB cb = new SearchFieldLogCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_ExistsReferrer_SearchFieldLogList(cb.query());
        registerExistsReferrer(cb.query(), "ID", "SEARCH_ID", pp, "searchFieldLogList");
    }
    public abstract String keepId_ExistsReferrer_SearchFieldLogList(SearchFieldLogCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SEARCH_ID from CLICK_LOG where ...)} <br>
     * CLICK_LOG by SEARCH_ID, named 'clickLogAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsClickLog</span>(logCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     logCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of Id_NotExistsReferrer_ClickLogList for 'not exists'. (NotNull)
     */
    public void notExistsClickLog(SubQuery<ClickLogCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ClickLogCB cb = new ClickLogCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_NotExistsReferrer_ClickLogList(cb.query());
        registerNotExistsReferrer(cb.query(), "ID", "SEARCH_ID", pp, "clickLogList");
    }
    public abstract String keepId_NotExistsReferrer_ClickLogList(ClickLogCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SEARCH_ID from SEARCH_FIELD_LOG where ...)} <br>
     * SEARCH_FIELD_LOG by SEARCH_ID, named 'searchFieldLogAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsSearchFieldLog</span>(logCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     logCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of Id_NotExistsReferrer_SearchFieldLogList for 'not exists'. (NotNull)
     */
    public void notExistsSearchFieldLog(SubQuery<SearchFieldLogCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SearchFieldLogCB cb = new SearchFieldLogCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_NotExistsReferrer_SearchFieldLogList(cb.query());
        registerNotExistsReferrer(cb.query(), "ID", "SEARCH_ID", pp, "searchFieldLogList");
    }
    public abstract String keepId_NotExistsReferrer_SearchFieldLogList(SearchFieldLogCQ sq);

    public void xsderiveClickLogList(String fn, SubQuery<ClickLogCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ClickLogCB cb = new ClickLogCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepId_SpecifyDerivedReferrer_ClickLogList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ID", "SEARCH_ID", pp, "clickLogList", al, op);
    }
    public abstract String keepId_SpecifyDerivedReferrer_ClickLogList(ClickLogCQ sq);

    public void xsderiveSearchFieldLogList(String fn, SubQuery<SearchFieldLogCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SearchFieldLogCB cb = new SearchFieldLogCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepId_SpecifyDerivedReferrer_SearchFieldLogList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ID", "SEARCH_ID", pp, "searchFieldLogList", al, op);
    }
    public abstract String keepId_SpecifyDerivedReferrer_SearchFieldLogList(SearchFieldLogCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from CLICK_LOG where ...)} <br>
     * CLICK_LOG by SEARCH_ID, named 'clickLogAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedClickLog()</span>.<span style="color: #CC4747">max</span>(logCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     logCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     logCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ClickLogCB> derivedClickLog() {
        return xcreateQDRFunctionClickLogList();
    }
    protected HpQDRFunction<ClickLogCB> xcreateQDRFunctionClickLogList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveClickLogList(fn, sq, rd, vl, op));
    }
    public void xqderiveClickLogList(String fn, SubQuery<ClickLogCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ClickLogCB cb = new ClickLogCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepId_QueryDerivedReferrer_ClickLogList(cb.query()); String prpp = keepId_QueryDerivedReferrer_ClickLogListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ID", "SEARCH_ID", sqpp, "clickLogList", rd, vl, prpp, op);
    }
    public abstract String keepId_QueryDerivedReferrer_ClickLogList(ClickLogCQ sq);
    public abstract String keepId_QueryDerivedReferrer_ClickLogListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from SEARCH_FIELD_LOG where ...)} <br>
     * SEARCH_FIELD_LOG by SEARCH_ID, named 'searchFieldLogAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedSearchFieldLog()</span>.<span style="color: #CC4747">max</span>(logCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     logCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     logCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<SearchFieldLogCB> derivedSearchFieldLog() {
        return xcreateQDRFunctionSearchFieldLogList();
    }
    protected HpQDRFunction<SearchFieldLogCB> xcreateQDRFunctionSearchFieldLogList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveSearchFieldLogList(fn, sq, rd, vl, op));
    }
    public void xqderiveSearchFieldLogList(String fn, SubQuery<SearchFieldLogCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SearchFieldLogCB cb = new SearchFieldLogCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepId_QueryDerivedReferrer_SearchFieldLogList(cb.query()); String prpp = keepId_QueryDerivedReferrer_SearchFieldLogListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ID", "SEARCH_ID", sqpp, "searchFieldLogList", rd, vl, prpp, op);
    }
    public abstract String keepId_QueryDerivedReferrer_SearchFieldLogList(SearchFieldLogCQ sq);
    public abstract String keepId_QueryDerivedReferrer_SearchFieldLogListParameter(Object vl);

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
     * SEARCH_WORD: {TEXT(65535)}
     * @param searchWord The value of searchWord as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSearchWord_Equal(String searchWord) {
        doSetSearchWord_Equal(fRES(searchWord));
    }

    protected void doSetSearchWord_Equal(String searchWord) {
        regSearchWord(CK_EQ, searchWord);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEARCH_WORD: {TEXT(65535)}
     * @param searchWord The value of searchWord as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSearchWord_NotEqual(String searchWord) {
        doSetSearchWord_NotEqual(fRES(searchWord));
    }

    protected void doSetSearchWord_NotEqual(String searchWord) {
        regSearchWord(CK_NES, searchWord);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEARCH_WORD: {TEXT(65535)}
     * @param searchWord The value of searchWord as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setSearchWord_GreaterThan(String searchWord) {
        regSearchWord(CK_GT, fRES(searchWord));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEARCH_WORD: {TEXT(65535)}
     * @param searchWord The value of searchWord as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setSearchWord_LessThan(String searchWord) {
        regSearchWord(CK_LT, fRES(searchWord));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEARCH_WORD: {TEXT(65535)}
     * @param searchWord The value of searchWord as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSearchWord_GreaterEqual(String searchWord) {
        regSearchWord(CK_GE, fRES(searchWord));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEARCH_WORD: {TEXT(65535)}
     * @param searchWord The value of searchWord as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSearchWord_LessEqual(String searchWord) {
        regSearchWord(CK_LE, fRES(searchWord));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEARCH_WORD: {TEXT(65535)}
     * @param searchWordList The collection of searchWord as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSearchWord_InScope(Collection<String> searchWordList) {
        doSetSearchWord_InScope(searchWordList);
    }

    protected void doSetSearchWord_InScope(Collection<String> searchWordList) {
        regINS(CK_INS, cTL(searchWordList), xgetCValueSearchWord(), "SEARCH_WORD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEARCH_WORD: {TEXT(65535)}
     * @param searchWordList The collection of searchWord as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSearchWord_NotInScope(Collection<String> searchWordList) {
        doSetSearchWord_NotInScope(searchWordList);
    }

    protected void doSetSearchWord_NotInScope(Collection<String> searchWordList) {
        regINS(CK_NINS, cTL(searchWordList), xgetCValueSearchWord(), "SEARCH_WORD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEARCH_WORD: {TEXT(65535)} <br>
     * <pre>e.g. setSearchWord_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param searchWord The value of searchWord as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSearchWord_LikeSearch(String searchWord, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSearchWord_LikeSearch(searchWord, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEARCH_WORD: {TEXT(65535)} <br>
     * <pre>e.g. setSearchWord_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param searchWord The value of searchWord as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSearchWord_LikeSearch(String searchWord, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(searchWord), xgetCValueSearchWord(), "SEARCH_WORD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEARCH_WORD: {TEXT(65535)}
     * @param searchWord The value of searchWord as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSearchWord_NotLikeSearch(String searchWord, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSearchWord_NotLikeSearch(searchWord, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEARCH_WORD: {TEXT(65535)}
     * @param searchWord The value of searchWord as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSearchWord_NotLikeSearch(String searchWord, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(searchWord), xgetCValueSearchWord(), "SEARCH_WORD", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEARCH_WORD: {TEXT(65535)}
     */
    public void setSearchWord_IsNull() { regSearchWord(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SEARCH_WORD: {TEXT(65535)}
     */
    public void setSearchWord_IsNullOrEmpty() { regSearchWord(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEARCH_WORD: {TEXT(65535)}
     */
    public void setSearchWord_IsNotNull() { regSearchWord(CK_ISNN, DOBJ); }

    protected void regSearchWord(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSearchWord(), "SEARCH_WORD"); }
    protected abstract ConditionValue xgetCValueSearchWord();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REQUESTED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param requestedTime The value of requestedTime as equal. (NullAllowed: if null, no condition)
     */
    public void setRequestedTime_Equal(java.time.LocalDateTime requestedTime) {
        regRequestedTime(CK_EQ,  requestedTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REQUESTED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param requestedTime The value of requestedTime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRequestedTime_GreaterThan(java.time.LocalDateTime requestedTime) {
        regRequestedTime(CK_GT,  requestedTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REQUESTED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param requestedTime The value of requestedTime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRequestedTime_LessThan(java.time.LocalDateTime requestedTime) {
        regRequestedTime(CK_LT,  requestedTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REQUESTED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param requestedTime The value of requestedTime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRequestedTime_GreaterEqual(java.time.LocalDateTime requestedTime) {
        regRequestedTime(CK_GE,  requestedTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REQUESTED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param requestedTime The value of requestedTime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRequestedTime_LessEqual(java.time.LocalDateTime requestedTime) {
        regRequestedTime(CK_LE, requestedTime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REQUESTED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setRequestedTime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of requestedTime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of requestedTime. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRequestedTime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRequestedTime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REQUESTED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setRequestedTime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of requestedTime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of requestedTime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRequestedTime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "REQUESTED_TIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRequestedTime(), nm, op);
    }

    protected void regRequestedTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRequestedTime(), "REQUESTED_TIME"); }
    protected abstract ConditionValue xgetCValueRequestedTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESPONSE_TIME: {NotNull, INT(10)}
     * @param responseTime The value of responseTime as equal. (NullAllowed: if null, no condition)
     */
    public void setResponseTime_Equal(Integer responseTime) {
        doSetResponseTime_Equal(responseTime);
    }

    protected void doSetResponseTime_Equal(Integer responseTime) {
        regResponseTime(CK_EQ, responseTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESPONSE_TIME: {NotNull, INT(10)}
     * @param responseTime The value of responseTime as notEqual. (NullAllowed: if null, no condition)
     */
    public void setResponseTime_NotEqual(Integer responseTime) {
        doSetResponseTime_NotEqual(responseTime);
    }

    protected void doSetResponseTime_NotEqual(Integer responseTime) {
        regResponseTime(CK_NES, responseTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESPONSE_TIME: {NotNull, INT(10)}
     * @param responseTime The value of responseTime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setResponseTime_GreaterThan(Integer responseTime) {
        regResponseTime(CK_GT, responseTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESPONSE_TIME: {NotNull, INT(10)}
     * @param responseTime The value of responseTime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setResponseTime_LessThan(Integer responseTime) {
        regResponseTime(CK_LT, responseTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESPONSE_TIME: {NotNull, INT(10)}
     * @param responseTime The value of responseTime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setResponseTime_GreaterEqual(Integer responseTime) {
        regResponseTime(CK_GE, responseTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESPONSE_TIME: {NotNull, INT(10)}
     * @param responseTime The value of responseTime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setResponseTime_LessEqual(Integer responseTime) {
        regResponseTime(CK_LE, responseTime);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RESPONSE_TIME: {NotNull, INT(10)}
     * @param minNumber The min number of responseTime. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of responseTime. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setResponseTime_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setResponseTime_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RESPONSE_TIME: {NotNull, INT(10)}
     * @param minNumber The min number of responseTime. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of responseTime. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setResponseTime_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueResponseTime(), "RESPONSE_TIME", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RESPONSE_TIME: {NotNull, INT(10)}
     * @param responseTimeList The collection of responseTime as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setResponseTime_InScope(Collection<Integer> responseTimeList) {
        doSetResponseTime_InScope(responseTimeList);
    }

    protected void doSetResponseTime_InScope(Collection<Integer> responseTimeList) {
        regINS(CK_INS, cTL(responseTimeList), xgetCValueResponseTime(), "RESPONSE_TIME");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RESPONSE_TIME: {NotNull, INT(10)}
     * @param responseTimeList The collection of responseTime as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setResponseTime_NotInScope(Collection<Integer> responseTimeList) {
        doSetResponseTime_NotInScope(responseTimeList);
    }

    protected void doSetResponseTime_NotInScope(Collection<Integer> responseTimeList) {
        regINS(CK_NINS, cTL(responseTimeList), xgetCValueResponseTime(), "RESPONSE_TIME");
    }

    protected void regResponseTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueResponseTime(), "RESPONSE_TIME"); }
    protected abstract ConditionValue xgetCValueResponseTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HIT_COUNT: {NotNull, BIGINT(19)}
     * @param hitCount The value of hitCount as equal. (NullAllowed: if null, no condition)
     */
    public void setHitCount_Equal(Long hitCount) {
        doSetHitCount_Equal(hitCount);
    }

    protected void doSetHitCount_Equal(Long hitCount) {
        regHitCount(CK_EQ, hitCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HIT_COUNT: {NotNull, BIGINT(19)}
     * @param hitCount The value of hitCount as notEqual. (NullAllowed: if null, no condition)
     */
    public void setHitCount_NotEqual(Long hitCount) {
        doSetHitCount_NotEqual(hitCount);
    }

    protected void doSetHitCount_NotEqual(Long hitCount) {
        regHitCount(CK_NES, hitCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HIT_COUNT: {NotNull, BIGINT(19)}
     * @param hitCount The value of hitCount as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setHitCount_GreaterThan(Long hitCount) {
        regHitCount(CK_GT, hitCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HIT_COUNT: {NotNull, BIGINT(19)}
     * @param hitCount The value of hitCount as lessThan. (NullAllowed: if null, no condition)
     */
    public void setHitCount_LessThan(Long hitCount) {
        regHitCount(CK_LT, hitCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HIT_COUNT: {NotNull, BIGINT(19)}
     * @param hitCount The value of hitCount as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setHitCount_GreaterEqual(Long hitCount) {
        regHitCount(CK_GE, hitCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HIT_COUNT: {NotNull, BIGINT(19)}
     * @param hitCount The value of hitCount as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setHitCount_LessEqual(Long hitCount) {
        regHitCount(CK_LE, hitCount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HIT_COUNT: {NotNull, BIGINT(19)}
     * @param minNumber The min number of hitCount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of hitCount. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setHitCount_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setHitCount_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HIT_COUNT: {NotNull, BIGINT(19)}
     * @param minNumber The min number of hitCount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of hitCount. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setHitCount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHitCount(), "HIT_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HIT_COUNT: {NotNull, BIGINT(19)}
     * @param hitCountList The collection of hitCount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setHitCount_InScope(Collection<Long> hitCountList) {
        doSetHitCount_InScope(hitCountList);
    }

    protected void doSetHitCount_InScope(Collection<Long> hitCountList) {
        regINS(CK_INS, cTL(hitCountList), xgetCValueHitCount(), "HIT_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HIT_COUNT: {NotNull, BIGINT(19)}
     * @param hitCountList The collection of hitCount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setHitCount_NotInScope(Collection<Long> hitCountList) {
        doSetHitCount_NotInScope(hitCountList);
    }

    protected void doSetHitCount_NotInScope(Collection<Long> hitCountList) {
        regINS(CK_NINS, cTL(hitCountList), xgetCValueHitCount(), "HIT_COUNT");
    }

    protected void regHitCount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHitCount(), "HIT_COUNT"); }
    protected abstract ConditionValue xgetCValueHitCount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUERY_OFFSET: {NotNull, INT(10)}
     * @param queryOffset The value of queryOffset as equal. (NullAllowed: if null, no condition)
     */
    public void setQueryOffset_Equal(Integer queryOffset) {
        doSetQueryOffset_Equal(queryOffset);
    }

    protected void doSetQueryOffset_Equal(Integer queryOffset) {
        regQueryOffset(CK_EQ, queryOffset);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUERY_OFFSET: {NotNull, INT(10)}
     * @param queryOffset The value of queryOffset as notEqual. (NullAllowed: if null, no condition)
     */
    public void setQueryOffset_NotEqual(Integer queryOffset) {
        doSetQueryOffset_NotEqual(queryOffset);
    }

    protected void doSetQueryOffset_NotEqual(Integer queryOffset) {
        regQueryOffset(CK_NES, queryOffset);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUERY_OFFSET: {NotNull, INT(10)}
     * @param queryOffset The value of queryOffset as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setQueryOffset_GreaterThan(Integer queryOffset) {
        regQueryOffset(CK_GT, queryOffset);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUERY_OFFSET: {NotNull, INT(10)}
     * @param queryOffset The value of queryOffset as lessThan. (NullAllowed: if null, no condition)
     */
    public void setQueryOffset_LessThan(Integer queryOffset) {
        regQueryOffset(CK_LT, queryOffset);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUERY_OFFSET: {NotNull, INT(10)}
     * @param queryOffset The value of queryOffset as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setQueryOffset_GreaterEqual(Integer queryOffset) {
        regQueryOffset(CK_GE, queryOffset);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUERY_OFFSET: {NotNull, INT(10)}
     * @param queryOffset The value of queryOffset as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setQueryOffset_LessEqual(Integer queryOffset) {
        regQueryOffset(CK_LE, queryOffset);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QUERY_OFFSET: {NotNull, INT(10)}
     * @param minNumber The min number of queryOffset. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of queryOffset. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setQueryOffset_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setQueryOffset_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QUERY_OFFSET: {NotNull, INT(10)}
     * @param minNumber The min number of queryOffset. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of queryOffset. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setQueryOffset_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQueryOffset(), "QUERY_OFFSET", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QUERY_OFFSET: {NotNull, INT(10)}
     * @param queryOffsetList The collection of queryOffset as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setQueryOffset_InScope(Collection<Integer> queryOffsetList) {
        doSetQueryOffset_InScope(queryOffsetList);
    }

    protected void doSetQueryOffset_InScope(Collection<Integer> queryOffsetList) {
        regINS(CK_INS, cTL(queryOffsetList), xgetCValueQueryOffset(), "QUERY_OFFSET");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QUERY_OFFSET: {NotNull, INT(10)}
     * @param queryOffsetList The collection of queryOffset as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setQueryOffset_NotInScope(Collection<Integer> queryOffsetList) {
        doSetQueryOffset_NotInScope(queryOffsetList);
    }

    protected void doSetQueryOffset_NotInScope(Collection<Integer> queryOffsetList) {
        regINS(CK_NINS, cTL(queryOffsetList), xgetCValueQueryOffset(), "QUERY_OFFSET");
    }

    protected void regQueryOffset(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQueryOffset(), "QUERY_OFFSET"); }
    protected abstract ConditionValue xgetCValueQueryOffset();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUERY_PAGE_SIZE: {NotNull, INT(10)}
     * @param queryPageSize The value of queryPageSize as equal. (NullAllowed: if null, no condition)
     */
    public void setQueryPageSize_Equal(Integer queryPageSize) {
        doSetQueryPageSize_Equal(queryPageSize);
    }

    protected void doSetQueryPageSize_Equal(Integer queryPageSize) {
        regQueryPageSize(CK_EQ, queryPageSize);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUERY_PAGE_SIZE: {NotNull, INT(10)}
     * @param queryPageSize The value of queryPageSize as notEqual. (NullAllowed: if null, no condition)
     */
    public void setQueryPageSize_NotEqual(Integer queryPageSize) {
        doSetQueryPageSize_NotEqual(queryPageSize);
    }

    protected void doSetQueryPageSize_NotEqual(Integer queryPageSize) {
        regQueryPageSize(CK_NES, queryPageSize);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUERY_PAGE_SIZE: {NotNull, INT(10)}
     * @param queryPageSize The value of queryPageSize as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setQueryPageSize_GreaterThan(Integer queryPageSize) {
        regQueryPageSize(CK_GT, queryPageSize);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUERY_PAGE_SIZE: {NotNull, INT(10)}
     * @param queryPageSize The value of queryPageSize as lessThan. (NullAllowed: if null, no condition)
     */
    public void setQueryPageSize_LessThan(Integer queryPageSize) {
        regQueryPageSize(CK_LT, queryPageSize);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUERY_PAGE_SIZE: {NotNull, INT(10)}
     * @param queryPageSize The value of queryPageSize as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setQueryPageSize_GreaterEqual(Integer queryPageSize) {
        regQueryPageSize(CK_GE, queryPageSize);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUERY_PAGE_SIZE: {NotNull, INT(10)}
     * @param queryPageSize The value of queryPageSize as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setQueryPageSize_LessEqual(Integer queryPageSize) {
        regQueryPageSize(CK_LE, queryPageSize);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QUERY_PAGE_SIZE: {NotNull, INT(10)}
     * @param minNumber The min number of queryPageSize. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of queryPageSize. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setQueryPageSize_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setQueryPageSize_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QUERY_PAGE_SIZE: {NotNull, INT(10)}
     * @param minNumber The min number of queryPageSize. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of queryPageSize. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setQueryPageSize_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQueryPageSize(), "QUERY_PAGE_SIZE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QUERY_PAGE_SIZE: {NotNull, INT(10)}
     * @param queryPageSizeList The collection of queryPageSize as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setQueryPageSize_InScope(Collection<Integer> queryPageSizeList) {
        doSetQueryPageSize_InScope(queryPageSizeList);
    }

    protected void doSetQueryPageSize_InScope(Collection<Integer> queryPageSizeList) {
        regINS(CK_INS, cTL(queryPageSizeList), xgetCValueQueryPageSize(), "QUERY_PAGE_SIZE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QUERY_PAGE_SIZE: {NotNull, INT(10)}
     * @param queryPageSizeList The collection of queryPageSize as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setQueryPageSize_NotInScope(Collection<Integer> queryPageSizeList) {
        doSetQueryPageSize_NotInScope(queryPageSizeList);
    }

    protected void doSetQueryPageSize_NotInScope(Collection<Integer> queryPageSizeList) {
        regINS(CK_NINS, cTL(queryPageSizeList), xgetCValueQueryPageSize(), "QUERY_PAGE_SIZE");
    }

    protected void regQueryPageSize(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQueryPageSize(), "QUERY_PAGE_SIZE"); }
    protected abstract ConditionValue xgetCValueQueryPageSize();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_AGENT: {VARCHAR(255)}
     * @param userAgent The value of userAgent as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserAgent_Equal(String userAgent) {
        doSetUserAgent_Equal(fRES(userAgent));
    }

    protected void doSetUserAgent_Equal(String userAgent) {
        regUserAgent(CK_EQ, userAgent);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_AGENT: {VARCHAR(255)}
     * @param userAgent The value of userAgent as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserAgent_NotEqual(String userAgent) {
        doSetUserAgent_NotEqual(fRES(userAgent));
    }

    protected void doSetUserAgent_NotEqual(String userAgent) {
        regUserAgent(CK_NES, userAgent);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_AGENT: {VARCHAR(255)}
     * @param userAgent The value of userAgent as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserAgent_GreaterThan(String userAgent) {
        regUserAgent(CK_GT, fRES(userAgent));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_AGENT: {VARCHAR(255)}
     * @param userAgent The value of userAgent as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserAgent_LessThan(String userAgent) {
        regUserAgent(CK_LT, fRES(userAgent));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_AGENT: {VARCHAR(255)}
     * @param userAgent The value of userAgent as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserAgent_GreaterEqual(String userAgent) {
        regUserAgent(CK_GE, fRES(userAgent));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_AGENT: {VARCHAR(255)}
     * @param userAgent The value of userAgent as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserAgent_LessEqual(String userAgent) {
        regUserAgent(CK_LE, fRES(userAgent));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_AGENT: {VARCHAR(255)}
     * @param userAgentList The collection of userAgent as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserAgent_InScope(Collection<String> userAgentList) {
        doSetUserAgent_InScope(userAgentList);
    }

    protected void doSetUserAgent_InScope(Collection<String> userAgentList) {
        regINS(CK_INS, cTL(userAgentList), xgetCValueUserAgent(), "USER_AGENT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_AGENT: {VARCHAR(255)}
     * @param userAgentList The collection of userAgent as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserAgent_NotInScope(Collection<String> userAgentList) {
        doSetUserAgent_NotInScope(userAgentList);
    }

    protected void doSetUserAgent_NotInScope(Collection<String> userAgentList) {
        regINS(CK_NINS, cTL(userAgentList), xgetCValueUserAgent(), "USER_AGENT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_AGENT: {VARCHAR(255)} <br>
     * <pre>e.g. setUserAgent_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param userAgent The value of userAgent as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUserAgent_LikeSearch(String userAgent, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUserAgent_LikeSearch(userAgent, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_AGENT: {VARCHAR(255)} <br>
     * <pre>e.g. setUserAgent_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userAgent The value of userAgent as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUserAgent_LikeSearch(String userAgent, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userAgent), xgetCValueUserAgent(), "USER_AGENT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_AGENT: {VARCHAR(255)}
     * @param userAgent The value of userAgent as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUserAgent_NotLikeSearch(String userAgent, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUserAgent_NotLikeSearch(userAgent, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_AGENT: {VARCHAR(255)}
     * @param userAgent The value of userAgent as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUserAgent_NotLikeSearch(String userAgent, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userAgent), xgetCValueUserAgent(), "USER_AGENT", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USER_AGENT: {VARCHAR(255)}
     */
    public void setUserAgent_IsNull() { regUserAgent(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USER_AGENT: {VARCHAR(255)}
     */
    public void setUserAgent_IsNullOrEmpty() { regUserAgent(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USER_AGENT: {VARCHAR(255)}
     */
    public void setUserAgent_IsNotNull() { regUserAgent(CK_ISNN, DOBJ); }

    protected void regUserAgent(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserAgent(), "USER_AGENT"); }
    protected abstract ConditionValue xgetCValueUserAgent();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFERER: {TEXT(65535)}
     * @param referer The value of referer as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setReferer_Equal(String referer) {
        doSetReferer_Equal(fRES(referer));
    }

    protected void doSetReferer_Equal(String referer) {
        regReferer(CK_EQ, referer);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFERER: {TEXT(65535)}
     * @param referer The value of referer as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setReferer_NotEqual(String referer) {
        doSetReferer_NotEqual(fRES(referer));
    }

    protected void doSetReferer_NotEqual(String referer) {
        regReferer(CK_NES, referer);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFERER: {TEXT(65535)}
     * @param referer The value of referer as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setReferer_GreaterThan(String referer) {
        regReferer(CK_GT, fRES(referer));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFERER: {TEXT(65535)}
     * @param referer The value of referer as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setReferer_LessThan(String referer) {
        regReferer(CK_LT, fRES(referer));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFERER: {TEXT(65535)}
     * @param referer The value of referer as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setReferer_GreaterEqual(String referer) {
        regReferer(CK_GE, fRES(referer));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFERER: {TEXT(65535)}
     * @param referer The value of referer as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setReferer_LessEqual(String referer) {
        regReferer(CK_LE, fRES(referer));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REFERER: {TEXT(65535)}
     * @param refererList The collection of referer as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReferer_InScope(Collection<String> refererList) {
        doSetReferer_InScope(refererList);
    }

    protected void doSetReferer_InScope(Collection<String> refererList) {
        regINS(CK_INS, cTL(refererList), xgetCValueReferer(), "REFERER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REFERER: {TEXT(65535)}
     * @param refererList The collection of referer as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReferer_NotInScope(Collection<String> refererList) {
        doSetReferer_NotInScope(refererList);
    }

    protected void doSetReferer_NotInScope(Collection<String> refererList) {
        regINS(CK_NINS, cTL(refererList), xgetCValueReferer(), "REFERER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFERER: {TEXT(65535)} <br>
     * <pre>e.g. setReferer_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param referer The value of referer as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setReferer_LikeSearch(String referer, ConditionOptionCall<LikeSearchOption> opLambda) {
        setReferer_LikeSearch(referer, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFERER: {TEXT(65535)} <br>
     * <pre>e.g. setReferer_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param referer The value of referer as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setReferer_LikeSearch(String referer, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(referer), xgetCValueReferer(), "REFERER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFERER: {TEXT(65535)}
     * @param referer The value of referer as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setReferer_NotLikeSearch(String referer, ConditionOptionCall<LikeSearchOption> opLambda) {
        setReferer_NotLikeSearch(referer, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFERER: {TEXT(65535)}
     * @param referer The value of referer as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setReferer_NotLikeSearch(String referer, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(referer), xgetCValueReferer(), "REFERER", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REFERER: {TEXT(65535)}
     */
    public void setReferer_IsNull() { regReferer(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REFERER: {TEXT(65535)}
     */
    public void setReferer_IsNullOrEmpty() { regReferer(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REFERER: {TEXT(65535)}
     */
    public void setReferer_IsNotNull() { regReferer(CK_ISNN, DOBJ); }

    protected void regReferer(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReferer(), "REFERER"); }
    protected abstract ConditionValue xgetCValueReferer();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_IP: {VARCHAR(50)}
     * @param clientIp The value of clientIp as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setClientIp_Equal(String clientIp) {
        doSetClientIp_Equal(fRES(clientIp));
    }

    protected void doSetClientIp_Equal(String clientIp) {
        regClientIp(CK_EQ, clientIp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_IP: {VARCHAR(50)}
     * @param clientIp The value of clientIp as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setClientIp_NotEqual(String clientIp) {
        doSetClientIp_NotEqual(fRES(clientIp));
    }

    protected void doSetClientIp_NotEqual(String clientIp) {
        regClientIp(CK_NES, clientIp);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_IP: {VARCHAR(50)}
     * @param clientIp The value of clientIp as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setClientIp_GreaterThan(String clientIp) {
        regClientIp(CK_GT, fRES(clientIp));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_IP: {VARCHAR(50)}
     * @param clientIp The value of clientIp as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setClientIp_LessThan(String clientIp) {
        regClientIp(CK_LT, fRES(clientIp));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_IP: {VARCHAR(50)}
     * @param clientIp The value of clientIp as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setClientIp_GreaterEqual(String clientIp) {
        regClientIp(CK_GE, fRES(clientIp));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_IP: {VARCHAR(50)}
     * @param clientIp The value of clientIp as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setClientIp_LessEqual(String clientIp) {
        regClientIp(CK_LE, fRES(clientIp));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_IP: {VARCHAR(50)}
     * @param clientIpList The collection of clientIp as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setClientIp_InScope(Collection<String> clientIpList) {
        doSetClientIp_InScope(clientIpList);
    }

    protected void doSetClientIp_InScope(Collection<String> clientIpList) {
        regINS(CK_INS, cTL(clientIpList), xgetCValueClientIp(), "CLIENT_IP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_IP: {VARCHAR(50)}
     * @param clientIpList The collection of clientIp as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setClientIp_NotInScope(Collection<String> clientIpList) {
        doSetClientIp_NotInScope(clientIpList);
    }

    protected void doSetClientIp_NotInScope(Collection<String> clientIpList) {
        regINS(CK_NINS, cTL(clientIpList), xgetCValueClientIp(), "CLIENT_IP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_IP: {VARCHAR(50)} <br>
     * <pre>e.g. setClientIp_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param clientIp The value of clientIp as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setClientIp_LikeSearch(String clientIp, ConditionOptionCall<LikeSearchOption> opLambda) {
        setClientIp_LikeSearch(clientIp, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_IP: {VARCHAR(50)} <br>
     * <pre>e.g. setClientIp_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clientIp The value of clientIp as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setClientIp_LikeSearch(String clientIp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clientIp), xgetCValueClientIp(), "CLIENT_IP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_IP: {VARCHAR(50)}
     * @param clientIp The value of clientIp as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setClientIp_NotLikeSearch(String clientIp, ConditionOptionCall<LikeSearchOption> opLambda) {
        setClientIp_NotLikeSearch(clientIp, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_IP: {VARCHAR(50)}
     * @param clientIp The value of clientIp as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setClientIp_NotLikeSearch(String clientIp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clientIp), xgetCValueClientIp(), "CLIENT_IP", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLIENT_IP: {VARCHAR(50)}
     */
    public void setClientIp_IsNull() { regClientIp(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CLIENT_IP: {VARCHAR(50)}
     */
    public void setClientIp_IsNullOrEmpty() { regClientIp(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLIENT_IP: {VARCHAR(50)}
     */
    public void setClientIp_IsNotNull() { regClientIp(CK_ISNN, DOBJ); }

    protected void regClientIp(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientIp(), "CLIENT_IP"); }
    protected abstract ConditionValue xgetCValueClientIp();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_SESSION_ID: {VARCHAR(100)}
     * @param userSessionId The value of userSessionId as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserSessionId_Equal(String userSessionId) {
        doSetUserSessionId_Equal(fRES(userSessionId));
    }

    protected void doSetUserSessionId_Equal(String userSessionId) {
        regUserSessionId(CK_EQ, userSessionId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_SESSION_ID: {VARCHAR(100)}
     * @param userSessionId The value of userSessionId as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserSessionId_NotEqual(String userSessionId) {
        doSetUserSessionId_NotEqual(fRES(userSessionId));
    }

    protected void doSetUserSessionId_NotEqual(String userSessionId) {
        regUserSessionId(CK_NES, userSessionId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_SESSION_ID: {VARCHAR(100)}
     * @param userSessionId The value of userSessionId as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserSessionId_GreaterThan(String userSessionId) {
        regUserSessionId(CK_GT, fRES(userSessionId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_SESSION_ID: {VARCHAR(100)}
     * @param userSessionId The value of userSessionId as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserSessionId_LessThan(String userSessionId) {
        regUserSessionId(CK_LT, fRES(userSessionId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_SESSION_ID: {VARCHAR(100)}
     * @param userSessionId The value of userSessionId as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserSessionId_GreaterEqual(String userSessionId) {
        regUserSessionId(CK_GE, fRES(userSessionId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_SESSION_ID: {VARCHAR(100)}
     * @param userSessionId The value of userSessionId as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserSessionId_LessEqual(String userSessionId) {
        regUserSessionId(CK_LE, fRES(userSessionId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_SESSION_ID: {VARCHAR(100)}
     * @param userSessionIdList The collection of userSessionId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserSessionId_InScope(Collection<String> userSessionIdList) {
        doSetUserSessionId_InScope(userSessionIdList);
    }

    protected void doSetUserSessionId_InScope(Collection<String> userSessionIdList) {
        regINS(CK_INS, cTL(userSessionIdList), xgetCValueUserSessionId(), "USER_SESSION_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_SESSION_ID: {VARCHAR(100)}
     * @param userSessionIdList The collection of userSessionId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserSessionId_NotInScope(Collection<String> userSessionIdList) {
        doSetUserSessionId_NotInScope(userSessionIdList);
    }

    protected void doSetUserSessionId_NotInScope(Collection<String> userSessionIdList) {
        regINS(CK_NINS, cTL(userSessionIdList), xgetCValueUserSessionId(), "USER_SESSION_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_SESSION_ID: {VARCHAR(100)} <br>
     * <pre>e.g. setUserSessionId_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param userSessionId The value of userSessionId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUserSessionId_LikeSearch(String userSessionId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUserSessionId_LikeSearch(userSessionId, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_SESSION_ID: {VARCHAR(100)} <br>
     * <pre>e.g. setUserSessionId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userSessionId The value of userSessionId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUserSessionId_LikeSearch(String userSessionId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userSessionId), xgetCValueUserSessionId(), "USER_SESSION_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_SESSION_ID: {VARCHAR(100)}
     * @param userSessionId The value of userSessionId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUserSessionId_NotLikeSearch(String userSessionId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUserSessionId_NotLikeSearch(userSessionId, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_SESSION_ID: {VARCHAR(100)}
     * @param userSessionId The value of userSessionId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUserSessionId_NotLikeSearch(String userSessionId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userSessionId), xgetCValueUserSessionId(), "USER_SESSION_ID", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USER_SESSION_ID: {VARCHAR(100)}
     */
    public void setUserSessionId_IsNull() { regUserSessionId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USER_SESSION_ID: {VARCHAR(100)}
     */
    public void setUserSessionId_IsNullOrEmpty() { regUserSessionId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USER_SESSION_ID: {VARCHAR(100)}
     */
    public void setUserSessionId_IsNotNull() { regUserSessionId(CK_ISNN, DOBJ); }

    protected void regUserSessionId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserSessionId(), "USER_SESSION_ID"); }
    protected abstract ConditionValue xgetCValueUserSessionId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCESS_TYPE: {NotNull, VARCHAR(1), classification=AccessType}
     * @param accessType The value of accessType as equal. (NullAllowed: if null (or empty), no condition)
     */
    protected void setAccessType_Equal(String accessType) {
        doSetAccessType_Equal(fRES(accessType));
    }

    /**
     * Equal(=). As AccessType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCESS_TYPE: {NotNull, VARCHAR(1), classification=AccessType} <br>
     * Access Type
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setAccessType_Equal_AsAccessType(CDef.AccessType cdef) {
        doSetAccessType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As Web (W). And OnlyOnceRegistered. <br>
     * Web: Web
     */
    public void setAccessType_Equal_Web() {
        setAccessType_Equal_AsAccessType(CDef.AccessType.Web);
    }

    /**
     * Equal(=). As Xml (X). And OnlyOnceRegistered. <br>
     * Xml: Xml
     */
    public void setAccessType_Equal_Xml() {
        setAccessType_Equal_AsAccessType(CDef.AccessType.Xml);
    }

    /**
     * Equal(=). As Json (J). And OnlyOnceRegistered. <br>
     * Json: Json
     */
    public void setAccessType_Equal_Json() {
        setAccessType_Equal_AsAccessType(CDef.AccessType.Json);
    }

    /**
     * Equal(=). As Others (O). And OnlyOnceRegistered. <br>
     * Others: Others
     */
    public void setAccessType_Equal_Others() {
        setAccessType_Equal_AsAccessType(CDef.AccessType.Others);
    }

    protected void doSetAccessType_Equal(String accessType) {
        regAccessType(CK_EQ, accessType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCESS_TYPE: {NotNull, VARCHAR(1), classification=AccessType}
     * @param accessType The value of accessType as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    protected void setAccessType_NotEqual(String accessType) {
        doSetAccessType_NotEqual(fRES(accessType));
    }

    /**
     * NotEqual(&lt;&gt;). As AccessType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCESS_TYPE: {NotNull, VARCHAR(1), classification=AccessType} <br>
     * Access Type
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setAccessType_NotEqual_AsAccessType(CDef.AccessType cdef) {
        doSetAccessType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As Web (W). And OnlyOnceRegistered. <br>
     * Web: Web
     */
    public void setAccessType_NotEqual_Web() {
        setAccessType_NotEqual_AsAccessType(CDef.AccessType.Web);
    }

    /**
     * NotEqual(&lt;&gt;). As Xml (X). And OnlyOnceRegistered. <br>
     * Xml: Xml
     */
    public void setAccessType_NotEqual_Xml() {
        setAccessType_NotEqual_AsAccessType(CDef.AccessType.Xml);
    }

    /**
     * NotEqual(&lt;&gt;). As Json (J). And OnlyOnceRegistered. <br>
     * Json: Json
     */
    public void setAccessType_NotEqual_Json() {
        setAccessType_NotEqual_AsAccessType(CDef.AccessType.Json);
    }

    /**
     * NotEqual(&lt;&gt;). As Others (O). And OnlyOnceRegistered. <br>
     * Others: Others
     */
    public void setAccessType_NotEqual_Others() {
        setAccessType_NotEqual_AsAccessType(CDef.AccessType.Others);
    }

    protected void doSetAccessType_NotEqual(String accessType) {
        regAccessType(CK_NES, accessType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACCESS_TYPE: {NotNull, VARCHAR(1), classification=AccessType}
     * @param accessTypeList The collection of accessType as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccessType_InScope(Collection<String> accessTypeList) {
        doSetAccessType_InScope(accessTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As AccessType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACCESS_TYPE: {NotNull, VARCHAR(1), classification=AccessType} <br>
     * Access Type
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setAccessType_InScope_AsAccessType(Collection<CDef.AccessType> cdefList) {
        doSetAccessType_InScope(cTStrL(cdefList));
    }

    protected void doSetAccessType_InScope(Collection<String> accessTypeList) {
        regINS(CK_INS, cTL(accessTypeList), xgetCValueAccessType(), "ACCESS_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACCESS_TYPE: {NotNull, VARCHAR(1), classification=AccessType}
     * @param accessTypeList The collection of accessType as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAccessType_NotInScope(Collection<String> accessTypeList) {
        doSetAccessType_NotInScope(accessTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As AccessType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACCESS_TYPE: {NotNull, VARCHAR(1), classification=AccessType} <br>
     * Access Type
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setAccessType_NotInScope_AsAccessType(Collection<CDef.AccessType> cdefList) {
        doSetAccessType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetAccessType_NotInScope(Collection<String> accessTypeList) {
        regINS(CK_NINS, cTL(accessTypeList), xgetCValueAccessType(), "ACCESS_TYPE");
    }

    protected void regAccessType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAccessType(), "ACCESS_TYPE"); }
    protected abstract ConditionValue xgetCValueAccessType();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, BIGINT(19), FK to USER_INFO}
     * @param userId The value of userId as equal. (NullAllowed: if null, no condition)
     */
    public void setUserId_Equal(Long userId) {
        doSetUserId_Equal(userId);
    }

    protected void doSetUserId_Equal(Long userId) {
        regUserId(CK_EQ, userId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, BIGINT(19), FK to USER_INFO}
     * @param userId The value of userId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setUserId_NotEqual(Long userId) {
        doSetUserId_NotEqual(userId);
    }

    protected void doSetUserId_NotEqual(Long userId) {
        regUserId(CK_NES, userId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, BIGINT(19), FK to USER_INFO}
     * @param userId The value of userId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setUserId_GreaterThan(Long userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, BIGINT(19), FK to USER_INFO}
     * @param userId The value of userId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setUserId_LessThan(Long userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, BIGINT(19), FK to USER_INFO}
     * @param userId The value of userId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setUserId_GreaterEqual(Long userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, BIGINT(19), FK to USER_INFO}
     * @param userId The value of userId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setUserId_LessEqual(Long userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, BIGINT(19), FK to USER_INFO}
     * @param minNumber The min number of userId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUserId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUserId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, BIGINT(19), FK to USER_INFO}
     * @param minNumber The min number of userId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {IX, BIGINT(19), FK to USER_INFO}
     * @param userIdList The collection of userId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserId_InScope(Collection<Long> userIdList) {
        doSetUserId_InScope(userIdList);
    }

    protected void doSetUserId_InScope(Collection<Long> userIdList) {
        regINS(CK_INS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {IX, BIGINT(19), FK to USER_INFO}
     * @param userIdList The collection of userId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserId_NotInScope(Collection<Long> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Long> userIdList) {
        regINS(CK_NINS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USER_ID: {IX, BIGINT(19), FK to USER_INFO}
     */
    public void setUserId_IsNull() { regUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USER_ID: {IX, BIGINT(19), FK to USER_INFO}
     */
    public void setUserId_IsNotNull() { regUserId(CK_ISNN, DOBJ); }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "USER_ID"); }
    protected abstract ConditionValue xgetCValueUserId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;SearchLogCB&gt;() {
     *     public void query(SearchLogCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SearchLogCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, SearchLogCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;SearchLogCB&gt;() {
     *     public void query(SearchLogCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SearchLogCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, SearchLogCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;SearchLogCB&gt;() {
     *     public void query(SearchLogCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SearchLogCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, SearchLogCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;SearchLogCB&gt;() {
     *     public void query(SearchLogCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SearchLogCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, SearchLogCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;SearchLogCB&gt;() {
     *     public void query(SearchLogCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SearchLogCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, SearchLogCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;SearchLogCB&gt;() {
     *     public void query(SearchLogCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SearchLogCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, SearchLogCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        SearchLogCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(SearchLogCQ sq);

    protected SearchLogCB xcreateScalarConditionCB() {
        SearchLogCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected SearchLogCB xcreateScalarConditionPartitionByCB() {
        SearchLogCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<SearchLogCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SearchLogCB cb = new SearchLogCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(SearchLogCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<SearchLogCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(SearchLogCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SearchLogCB cb = new SearchLogCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(SearchLogCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<SearchLogCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SearchLogCB cb = new SearchLogCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(SearchLogCQ sq);

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
    protected SearchLogCB newMyCB() {
        return new SearchLogCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return SearchLogCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
