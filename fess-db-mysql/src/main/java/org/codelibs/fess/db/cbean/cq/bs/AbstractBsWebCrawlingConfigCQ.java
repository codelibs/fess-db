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
 * The abstract condition-query of WEB_CRAWLING_CONFIG.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWebCrawlingConfigCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWebCrawlingConfigCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WEB_CRAWLING_CONFIG";
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
     * {exists (select WEB_CRAWLING_CONFIG_ID from REQUEST_HEADER where ...)} <br>
     * REQUEST_HEADER by WEB_CRAWLING_CONFIG_ID, named 'requestHeaderAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsRequestHeader</span>(headerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     headerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of RequestHeaderList for 'exists'. (NotNull)
     */
    public void existsRequestHeader(SubQuery<RequestHeaderCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        RequestHeaderCB cb = new RequestHeaderCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_ExistsReferrer_RequestHeaderList(cb.query());
        registerExistsReferrer(cb.query(), "ID", "WEB_CRAWLING_CONFIG_ID", pp, "requestHeaderList");
    }
    public abstract String keepId_ExistsReferrer_RequestHeaderList(RequestHeaderCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select WEB_CRAWLING_CONFIG_ID from WEB_AUTHENTICATION where ...)} <br>
     * WEB_AUTHENTICATION by WEB_CRAWLING_CONFIG_ID, named 'webAuthenticationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWebAuthentication</span>(authenticationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     authenticationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WebAuthenticationList for 'exists'. (NotNull)
     */
    public void existsWebAuthentication(SubQuery<WebAuthenticationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WebAuthenticationCB cb = new WebAuthenticationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_ExistsReferrer_WebAuthenticationList(cb.query());
        registerExistsReferrer(cb.query(), "ID", "WEB_CRAWLING_CONFIG_ID", pp, "webAuthenticationList");
    }
    public abstract String keepId_ExistsReferrer_WebAuthenticationList(WebAuthenticationCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select WEB_CONFIG_ID from WEB_CONFIG_TO_LABEL_TYPE_MAPPING where ...)} <br>
     * WEB_CONFIG_TO_LABEL_TYPE_MAPPING by WEB_CONFIG_ID, named 'webConfigToLabelTypeMappingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWebConfigToLabelTypeMapping</span>(mappingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mappingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WebConfigToLabelTypeMappingList for 'exists'. (NotNull)
     */
    public void existsWebConfigToLabelTypeMapping(SubQuery<WebConfigToLabelTypeMappingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WebConfigToLabelTypeMappingCB cb = new WebConfigToLabelTypeMappingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_ExistsReferrer_WebConfigToLabelTypeMappingList(cb.query());
        registerExistsReferrer(cb.query(), "ID", "WEB_CONFIG_ID", pp, "webConfigToLabelTypeMappingList");
    }
    public abstract String keepId_ExistsReferrer_WebConfigToLabelTypeMappingList(WebConfigToLabelTypeMappingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select WEB_CONFIG_ID from WEB_CONFIG_TO_ROLE_TYPE_MAPPING where ...)} <br>
     * WEB_CONFIG_TO_ROLE_TYPE_MAPPING by WEB_CONFIG_ID, named 'webConfigToRoleTypeMappingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWebConfigToRoleTypeMapping</span>(mappingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mappingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WebConfigToRoleTypeMappingList for 'exists'. (NotNull)
     */
    public void existsWebConfigToRoleTypeMapping(SubQuery<WebConfigToRoleTypeMappingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WebConfigToRoleTypeMappingCB cb = new WebConfigToRoleTypeMappingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_ExistsReferrer_WebConfigToRoleTypeMappingList(cb.query());
        registerExistsReferrer(cb.query(), "ID", "WEB_CONFIG_ID", pp, "webConfigToRoleTypeMappingList");
    }
    public abstract String keepId_ExistsReferrer_WebConfigToRoleTypeMappingList(WebConfigToRoleTypeMappingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select WEB_CRAWLING_CONFIG_ID from REQUEST_HEADER where ...)} <br>
     * REQUEST_HEADER by WEB_CRAWLING_CONFIG_ID, named 'requestHeaderAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsRequestHeader</span>(headerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     headerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of Id_NotExistsReferrer_RequestHeaderList for 'not exists'. (NotNull)
     */
    public void notExistsRequestHeader(SubQuery<RequestHeaderCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        RequestHeaderCB cb = new RequestHeaderCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_NotExistsReferrer_RequestHeaderList(cb.query());
        registerNotExistsReferrer(cb.query(), "ID", "WEB_CRAWLING_CONFIG_ID", pp, "requestHeaderList");
    }
    public abstract String keepId_NotExistsReferrer_RequestHeaderList(RequestHeaderCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select WEB_CRAWLING_CONFIG_ID from WEB_AUTHENTICATION where ...)} <br>
     * WEB_AUTHENTICATION by WEB_CRAWLING_CONFIG_ID, named 'webAuthenticationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWebAuthentication</span>(authenticationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     authenticationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of Id_NotExistsReferrer_WebAuthenticationList for 'not exists'. (NotNull)
     */
    public void notExistsWebAuthentication(SubQuery<WebAuthenticationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WebAuthenticationCB cb = new WebAuthenticationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_NotExistsReferrer_WebAuthenticationList(cb.query());
        registerNotExistsReferrer(cb.query(), "ID", "WEB_CRAWLING_CONFIG_ID", pp, "webAuthenticationList");
    }
    public abstract String keepId_NotExistsReferrer_WebAuthenticationList(WebAuthenticationCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select WEB_CONFIG_ID from WEB_CONFIG_TO_LABEL_TYPE_MAPPING where ...)} <br>
     * WEB_CONFIG_TO_LABEL_TYPE_MAPPING by WEB_CONFIG_ID, named 'webConfigToLabelTypeMappingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWebConfigToLabelTypeMapping</span>(mappingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mappingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of Id_NotExistsReferrer_WebConfigToLabelTypeMappingList for 'not exists'. (NotNull)
     */
    public void notExistsWebConfigToLabelTypeMapping(SubQuery<WebConfigToLabelTypeMappingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WebConfigToLabelTypeMappingCB cb = new WebConfigToLabelTypeMappingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_NotExistsReferrer_WebConfigToLabelTypeMappingList(cb.query());
        registerNotExistsReferrer(cb.query(), "ID", "WEB_CONFIG_ID", pp, "webConfigToLabelTypeMappingList");
    }
    public abstract String keepId_NotExistsReferrer_WebConfigToLabelTypeMappingList(WebConfigToLabelTypeMappingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select WEB_CONFIG_ID from WEB_CONFIG_TO_ROLE_TYPE_MAPPING where ...)} <br>
     * WEB_CONFIG_TO_ROLE_TYPE_MAPPING by WEB_CONFIG_ID, named 'webConfigToRoleTypeMappingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWebConfigToRoleTypeMapping</span>(mappingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mappingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of Id_NotExistsReferrer_WebConfigToRoleTypeMappingList for 'not exists'. (NotNull)
     */
    public void notExistsWebConfigToRoleTypeMapping(SubQuery<WebConfigToRoleTypeMappingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WebConfigToRoleTypeMappingCB cb = new WebConfigToRoleTypeMappingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_NotExistsReferrer_WebConfigToRoleTypeMappingList(cb.query());
        registerNotExistsReferrer(cb.query(), "ID", "WEB_CONFIG_ID", pp, "webConfigToRoleTypeMappingList");
    }
    public abstract String keepId_NotExistsReferrer_WebConfigToRoleTypeMappingList(WebConfigToRoleTypeMappingCQ sq);

    public void xsderiveRequestHeaderList(String fn, SubQuery<RequestHeaderCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RequestHeaderCB cb = new RequestHeaderCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepId_SpecifyDerivedReferrer_RequestHeaderList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ID", "WEB_CRAWLING_CONFIG_ID", pp, "requestHeaderList", al, op);
    }
    public abstract String keepId_SpecifyDerivedReferrer_RequestHeaderList(RequestHeaderCQ sq);

    public void xsderiveWebAuthenticationList(String fn, SubQuery<WebAuthenticationCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WebAuthenticationCB cb = new WebAuthenticationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepId_SpecifyDerivedReferrer_WebAuthenticationList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ID", "WEB_CRAWLING_CONFIG_ID", pp, "webAuthenticationList", al, op);
    }
    public abstract String keepId_SpecifyDerivedReferrer_WebAuthenticationList(WebAuthenticationCQ sq);

    public void xsderiveWebConfigToLabelTypeMappingList(String fn, SubQuery<WebConfigToLabelTypeMappingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WebConfigToLabelTypeMappingCB cb = new WebConfigToLabelTypeMappingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepId_SpecifyDerivedReferrer_WebConfigToLabelTypeMappingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ID", "WEB_CONFIG_ID", pp, "webConfigToLabelTypeMappingList", al, op);
    }
    public abstract String keepId_SpecifyDerivedReferrer_WebConfigToLabelTypeMappingList(WebConfigToLabelTypeMappingCQ sq);

    public void xsderiveWebConfigToRoleTypeMappingList(String fn, SubQuery<WebConfigToRoleTypeMappingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WebConfigToRoleTypeMappingCB cb = new WebConfigToRoleTypeMappingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepId_SpecifyDerivedReferrer_WebConfigToRoleTypeMappingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ID", "WEB_CONFIG_ID", pp, "webConfigToRoleTypeMappingList", al, op);
    }
    public abstract String keepId_SpecifyDerivedReferrer_WebConfigToRoleTypeMappingList(WebConfigToRoleTypeMappingCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from REQUEST_HEADER where ...)} <br>
     * REQUEST_HEADER by WEB_CRAWLING_CONFIG_ID, named 'requestHeaderAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedRequestHeader()</span>.<span style="color: #CC4747">max</span>(headerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     headerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     headerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<RequestHeaderCB> derivedRequestHeader() {
        return xcreateQDRFunctionRequestHeaderList();
    }
    protected HpQDRFunction<RequestHeaderCB> xcreateQDRFunctionRequestHeaderList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveRequestHeaderList(fn, sq, rd, vl, op));
    }
    public void xqderiveRequestHeaderList(String fn, SubQuery<RequestHeaderCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RequestHeaderCB cb = new RequestHeaderCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepId_QueryDerivedReferrer_RequestHeaderList(cb.query()); String prpp = keepId_QueryDerivedReferrer_RequestHeaderListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ID", "WEB_CRAWLING_CONFIG_ID", sqpp, "requestHeaderList", rd, vl, prpp, op);
    }
    public abstract String keepId_QueryDerivedReferrer_RequestHeaderList(RequestHeaderCQ sq);
    public abstract String keepId_QueryDerivedReferrer_RequestHeaderListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from WEB_AUTHENTICATION where ...)} <br>
     * WEB_AUTHENTICATION by WEB_CRAWLING_CONFIG_ID, named 'webAuthenticationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWebAuthentication()</span>.<span style="color: #CC4747">max</span>(authenticationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     authenticationCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     authenticationCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WebAuthenticationCB> derivedWebAuthentication() {
        return xcreateQDRFunctionWebAuthenticationList();
    }
    protected HpQDRFunction<WebAuthenticationCB> xcreateQDRFunctionWebAuthenticationList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWebAuthenticationList(fn, sq, rd, vl, op));
    }
    public void xqderiveWebAuthenticationList(String fn, SubQuery<WebAuthenticationCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WebAuthenticationCB cb = new WebAuthenticationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepId_QueryDerivedReferrer_WebAuthenticationList(cb.query()); String prpp = keepId_QueryDerivedReferrer_WebAuthenticationListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ID", "WEB_CRAWLING_CONFIG_ID", sqpp, "webAuthenticationList", rd, vl, prpp, op);
    }
    public abstract String keepId_QueryDerivedReferrer_WebAuthenticationList(WebAuthenticationCQ sq);
    public abstract String keepId_QueryDerivedReferrer_WebAuthenticationListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from WEB_CONFIG_TO_LABEL_TYPE_MAPPING where ...)} <br>
     * WEB_CONFIG_TO_LABEL_TYPE_MAPPING by WEB_CONFIG_ID, named 'webConfigToLabelTypeMappingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWebConfigToLabelTypeMapping()</span>.<span style="color: #CC4747">max</span>(mappingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mappingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     mappingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WebConfigToLabelTypeMappingCB> derivedWebConfigToLabelTypeMapping() {
        return xcreateQDRFunctionWebConfigToLabelTypeMappingList();
    }
    protected HpQDRFunction<WebConfigToLabelTypeMappingCB> xcreateQDRFunctionWebConfigToLabelTypeMappingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWebConfigToLabelTypeMappingList(fn, sq, rd, vl, op));
    }
    public void xqderiveWebConfigToLabelTypeMappingList(String fn, SubQuery<WebConfigToLabelTypeMappingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WebConfigToLabelTypeMappingCB cb = new WebConfigToLabelTypeMappingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepId_QueryDerivedReferrer_WebConfigToLabelTypeMappingList(cb.query()); String prpp = keepId_QueryDerivedReferrer_WebConfigToLabelTypeMappingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ID", "WEB_CONFIG_ID", sqpp, "webConfigToLabelTypeMappingList", rd, vl, prpp, op);
    }
    public abstract String keepId_QueryDerivedReferrer_WebConfigToLabelTypeMappingList(WebConfigToLabelTypeMappingCQ sq);
    public abstract String keepId_QueryDerivedReferrer_WebConfigToLabelTypeMappingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from WEB_CONFIG_TO_ROLE_TYPE_MAPPING where ...)} <br>
     * WEB_CONFIG_TO_ROLE_TYPE_MAPPING by WEB_CONFIG_ID, named 'webConfigToRoleTypeMappingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWebConfigToRoleTypeMapping()</span>.<span style="color: #CC4747">max</span>(mappingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mappingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     mappingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WebConfigToRoleTypeMappingCB> derivedWebConfigToRoleTypeMapping() {
        return xcreateQDRFunctionWebConfigToRoleTypeMappingList();
    }
    protected HpQDRFunction<WebConfigToRoleTypeMappingCB> xcreateQDRFunctionWebConfigToRoleTypeMappingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWebConfigToRoleTypeMappingList(fn, sq, rd, vl, op));
    }
    public void xqderiveWebConfigToRoleTypeMappingList(String fn, SubQuery<WebConfigToRoleTypeMappingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WebConfigToRoleTypeMappingCB cb = new WebConfigToRoleTypeMappingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepId_QueryDerivedReferrer_WebConfigToRoleTypeMappingList(cb.query()); String prpp = keepId_QueryDerivedReferrer_WebConfigToRoleTypeMappingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ID", "WEB_CONFIG_ID", sqpp, "webConfigToRoleTypeMappingList", rd, vl, prpp, op);
    }
    public abstract String keepId_QueryDerivedReferrer_WebConfigToRoleTypeMappingList(WebConfigToRoleTypeMappingCQ sq);
    public abstract String keepId_QueryDerivedReferrer_WebConfigToRoleTypeMappingListParameter(Object vl);

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
     * NAME: {NotNull, VARCHAR(200)}
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
     * NAME: {NotNull, VARCHAR(200)}
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
     * NAME: {NotNull, VARCHAR(200)}
     * @param name The value of name as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_GreaterThan(String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {NotNull, VARCHAR(200)}
     * @param name The value of name as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_LessThan(String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {NotNull, VARCHAR(200)}
     * @param name The value of name as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_GreaterEqual(String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {NotNull, VARCHAR(200)}
     * @param name The value of name as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_LessEqual(String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NAME: {NotNull, VARCHAR(200)}
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
     * NAME: {NotNull, VARCHAR(200)}
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
     * NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param name The value of name as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setName_LikeSearch(String name, ConditionOptionCall<LikeSearchOption> opLambda) {
        setName_LikeSearch(name, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME: {NotNull, VARCHAR(200)} <br>
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
     * NAME: {NotNull, VARCHAR(200)}
     * @param name The value of name as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setName_NotLikeSearch(String name, ConditionOptionCall<LikeSearchOption> opLambda) {
        setName_NotLikeSearch(name, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME: {NotNull, VARCHAR(200)}
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
     * URLS: {NotNull, TEXT(65535)}
     * @param urls The value of urls as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUrls_Equal(String urls) {
        doSetUrls_Equal(fRES(urls));
    }

    protected void doSetUrls_Equal(String urls) {
        regUrls(CK_EQ, urls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URLS: {NotNull, TEXT(65535)}
     * @param urls The value of urls as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUrls_NotEqual(String urls) {
        doSetUrls_NotEqual(fRES(urls));
    }

    protected void doSetUrls_NotEqual(String urls) {
        regUrls(CK_NES, urls);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URLS: {NotNull, TEXT(65535)}
     * @param urls The value of urls as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUrls_GreaterThan(String urls) {
        regUrls(CK_GT, fRES(urls));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URLS: {NotNull, TEXT(65535)}
     * @param urls The value of urls as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUrls_LessThan(String urls) {
        regUrls(CK_LT, fRES(urls));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URLS: {NotNull, TEXT(65535)}
     * @param urls The value of urls as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUrls_GreaterEqual(String urls) {
        regUrls(CK_GE, fRES(urls));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URLS: {NotNull, TEXT(65535)}
     * @param urls The value of urls as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUrls_LessEqual(String urls) {
        regUrls(CK_LE, fRES(urls));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * URLS: {NotNull, TEXT(65535)}
     * @param urlsList The collection of urls as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUrls_InScope(Collection<String> urlsList) {
        doSetUrls_InScope(urlsList);
    }

    protected void doSetUrls_InScope(Collection<String> urlsList) {
        regINS(CK_INS, cTL(urlsList), xgetCValueUrls(), "URLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * URLS: {NotNull, TEXT(65535)}
     * @param urlsList The collection of urls as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUrls_NotInScope(Collection<String> urlsList) {
        doSetUrls_NotInScope(urlsList);
    }

    protected void doSetUrls_NotInScope(Collection<String> urlsList) {
        regINS(CK_NINS, cTL(urlsList), xgetCValueUrls(), "URLS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * URLS: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setUrls_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param urls The value of urls as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUrls_LikeSearch(String urls, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUrls_LikeSearch(urls, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * URLS: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setUrls_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param urls The value of urls as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUrls_LikeSearch(String urls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(urls), xgetCValueUrls(), "URLS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * URLS: {NotNull, TEXT(65535)}
     * @param urls The value of urls as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUrls_NotLikeSearch(String urls, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUrls_NotLikeSearch(urls, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * URLS: {NotNull, TEXT(65535)}
     * @param urls The value of urls as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUrls_NotLikeSearch(String urls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(urls), xgetCValueUrls(), "URLS", likeSearchOption);
    }

    protected void regUrls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUrls(), "URLS"); }
    protected abstract ConditionValue xgetCValueUrls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INCLUDED_URLS: {TEXT(65535)}
     * @param includedUrls The value of includedUrls as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedUrls_Equal(String includedUrls) {
        doSetIncludedUrls_Equal(fRES(includedUrls));
    }

    protected void doSetIncludedUrls_Equal(String includedUrls) {
        regIncludedUrls(CK_EQ, includedUrls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INCLUDED_URLS: {TEXT(65535)}
     * @param includedUrls The value of includedUrls as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedUrls_NotEqual(String includedUrls) {
        doSetIncludedUrls_NotEqual(fRES(includedUrls));
    }

    protected void doSetIncludedUrls_NotEqual(String includedUrls) {
        regIncludedUrls(CK_NES, includedUrls);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INCLUDED_URLS: {TEXT(65535)}
     * @param includedUrls The value of includedUrls as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedUrls_GreaterThan(String includedUrls) {
        regIncludedUrls(CK_GT, fRES(includedUrls));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INCLUDED_URLS: {TEXT(65535)}
     * @param includedUrls The value of includedUrls as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedUrls_LessThan(String includedUrls) {
        regIncludedUrls(CK_LT, fRES(includedUrls));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INCLUDED_URLS: {TEXT(65535)}
     * @param includedUrls The value of includedUrls as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedUrls_GreaterEqual(String includedUrls) {
        regIncludedUrls(CK_GE, fRES(includedUrls));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INCLUDED_URLS: {TEXT(65535)}
     * @param includedUrls The value of includedUrls as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedUrls_LessEqual(String includedUrls) {
        regIncludedUrls(CK_LE, fRES(includedUrls));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INCLUDED_URLS: {TEXT(65535)}
     * @param includedUrlsList The collection of includedUrls as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedUrls_InScope(Collection<String> includedUrlsList) {
        doSetIncludedUrls_InScope(includedUrlsList);
    }

    protected void doSetIncludedUrls_InScope(Collection<String> includedUrlsList) {
        regINS(CK_INS, cTL(includedUrlsList), xgetCValueIncludedUrls(), "INCLUDED_URLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INCLUDED_URLS: {TEXT(65535)}
     * @param includedUrlsList The collection of includedUrls as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedUrls_NotInScope(Collection<String> includedUrlsList) {
        doSetIncludedUrls_NotInScope(includedUrlsList);
    }

    protected void doSetIncludedUrls_NotInScope(Collection<String> includedUrlsList) {
        regINS(CK_NINS, cTL(includedUrlsList), xgetCValueIncludedUrls(), "INCLUDED_URLS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INCLUDED_URLS: {TEXT(65535)} <br>
     * <pre>e.g. setIncludedUrls_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param includedUrls The value of includedUrls as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setIncludedUrls_LikeSearch(String includedUrls, ConditionOptionCall<LikeSearchOption> opLambda) {
        setIncludedUrls_LikeSearch(includedUrls, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INCLUDED_URLS: {TEXT(65535)} <br>
     * <pre>e.g. setIncludedUrls_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param includedUrls The value of includedUrls as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setIncludedUrls_LikeSearch(String includedUrls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(includedUrls), xgetCValueIncludedUrls(), "INCLUDED_URLS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INCLUDED_URLS: {TEXT(65535)}
     * @param includedUrls The value of includedUrls as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setIncludedUrls_NotLikeSearch(String includedUrls, ConditionOptionCall<LikeSearchOption> opLambda) {
        setIncludedUrls_NotLikeSearch(includedUrls, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INCLUDED_URLS: {TEXT(65535)}
     * @param includedUrls The value of includedUrls as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setIncludedUrls_NotLikeSearch(String includedUrls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(includedUrls), xgetCValueIncludedUrls(), "INCLUDED_URLS", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INCLUDED_URLS: {TEXT(65535)}
     */
    public void setIncludedUrls_IsNull() { regIncludedUrls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INCLUDED_URLS: {TEXT(65535)}
     */
    public void setIncludedUrls_IsNullOrEmpty() { regIncludedUrls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INCLUDED_URLS: {TEXT(65535)}
     */
    public void setIncludedUrls_IsNotNull() { regIncludedUrls(CK_ISNN, DOBJ); }

    protected void regIncludedUrls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIncludedUrls(), "INCLUDED_URLS"); }
    protected abstract ConditionValue xgetCValueIncludedUrls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCLUDED_URLS: {TEXT(65535)}
     * @param excludedUrls The value of excludedUrls as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedUrls_Equal(String excludedUrls) {
        doSetExcludedUrls_Equal(fRES(excludedUrls));
    }

    protected void doSetExcludedUrls_Equal(String excludedUrls) {
        regExcludedUrls(CK_EQ, excludedUrls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCLUDED_URLS: {TEXT(65535)}
     * @param excludedUrls The value of excludedUrls as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedUrls_NotEqual(String excludedUrls) {
        doSetExcludedUrls_NotEqual(fRES(excludedUrls));
    }

    protected void doSetExcludedUrls_NotEqual(String excludedUrls) {
        regExcludedUrls(CK_NES, excludedUrls);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCLUDED_URLS: {TEXT(65535)}
     * @param excludedUrls The value of excludedUrls as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedUrls_GreaterThan(String excludedUrls) {
        regExcludedUrls(CK_GT, fRES(excludedUrls));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCLUDED_URLS: {TEXT(65535)}
     * @param excludedUrls The value of excludedUrls as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedUrls_LessThan(String excludedUrls) {
        regExcludedUrls(CK_LT, fRES(excludedUrls));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCLUDED_URLS: {TEXT(65535)}
     * @param excludedUrls The value of excludedUrls as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedUrls_GreaterEqual(String excludedUrls) {
        regExcludedUrls(CK_GE, fRES(excludedUrls));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCLUDED_URLS: {TEXT(65535)}
     * @param excludedUrls The value of excludedUrls as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedUrls_LessEqual(String excludedUrls) {
        regExcludedUrls(CK_LE, fRES(excludedUrls));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXCLUDED_URLS: {TEXT(65535)}
     * @param excludedUrlsList The collection of excludedUrls as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedUrls_InScope(Collection<String> excludedUrlsList) {
        doSetExcludedUrls_InScope(excludedUrlsList);
    }

    protected void doSetExcludedUrls_InScope(Collection<String> excludedUrlsList) {
        regINS(CK_INS, cTL(excludedUrlsList), xgetCValueExcludedUrls(), "EXCLUDED_URLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXCLUDED_URLS: {TEXT(65535)}
     * @param excludedUrlsList The collection of excludedUrls as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedUrls_NotInScope(Collection<String> excludedUrlsList) {
        doSetExcludedUrls_NotInScope(excludedUrlsList);
    }

    protected void doSetExcludedUrls_NotInScope(Collection<String> excludedUrlsList) {
        regINS(CK_NINS, cTL(excludedUrlsList), xgetCValueExcludedUrls(), "EXCLUDED_URLS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXCLUDED_URLS: {TEXT(65535)} <br>
     * <pre>e.g. setExcludedUrls_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param excludedUrls The value of excludedUrls as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setExcludedUrls_LikeSearch(String excludedUrls, ConditionOptionCall<LikeSearchOption> opLambda) {
        setExcludedUrls_LikeSearch(excludedUrls, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXCLUDED_URLS: {TEXT(65535)} <br>
     * <pre>e.g. setExcludedUrls_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param excludedUrls The value of excludedUrls as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setExcludedUrls_LikeSearch(String excludedUrls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(excludedUrls), xgetCValueExcludedUrls(), "EXCLUDED_URLS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXCLUDED_URLS: {TEXT(65535)}
     * @param excludedUrls The value of excludedUrls as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setExcludedUrls_NotLikeSearch(String excludedUrls, ConditionOptionCall<LikeSearchOption> opLambda) {
        setExcludedUrls_NotLikeSearch(excludedUrls, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXCLUDED_URLS: {TEXT(65535)}
     * @param excludedUrls The value of excludedUrls as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setExcludedUrls_NotLikeSearch(String excludedUrls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(excludedUrls), xgetCValueExcludedUrls(), "EXCLUDED_URLS", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXCLUDED_URLS: {TEXT(65535)}
     */
    public void setExcludedUrls_IsNull() { regExcludedUrls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXCLUDED_URLS: {TEXT(65535)}
     */
    public void setExcludedUrls_IsNullOrEmpty() { regExcludedUrls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXCLUDED_URLS: {TEXT(65535)}
     */
    public void setExcludedUrls_IsNotNull() { regExcludedUrls(CK_ISNN, DOBJ); }

    protected void regExcludedUrls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExcludedUrls(), "EXCLUDED_URLS"); }
    protected abstract ConditionValue xgetCValueExcludedUrls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INCLUDED_DOC_URLS: {TEXT(65535)}
     * @param includedDocUrls The value of includedDocUrls as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedDocUrls_Equal(String includedDocUrls) {
        doSetIncludedDocUrls_Equal(fRES(includedDocUrls));
    }

    protected void doSetIncludedDocUrls_Equal(String includedDocUrls) {
        regIncludedDocUrls(CK_EQ, includedDocUrls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INCLUDED_DOC_URLS: {TEXT(65535)}
     * @param includedDocUrls The value of includedDocUrls as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedDocUrls_NotEqual(String includedDocUrls) {
        doSetIncludedDocUrls_NotEqual(fRES(includedDocUrls));
    }

    protected void doSetIncludedDocUrls_NotEqual(String includedDocUrls) {
        regIncludedDocUrls(CK_NES, includedDocUrls);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INCLUDED_DOC_URLS: {TEXT(65535)}
     * @param includedDocUrls The value of includedDocUrls as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedDocUrls_GreaterThan(String includedDocUrls) {
        regIncludedDocUrls(CK_GT, fRES(includedDocUrls));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INCLUDED_DOC_URLS: {TEXT(65535)}
     * @param includedDocUrls The value of includedDocUrls as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedDocUrls_LessThan(String includedDocUrls) {
        regIncludedDocUrls(CK_LT, fRES(includedDocUrls));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INCLUDED_DOC_URLS: {TEXT(65535)}
     * @param includedDocUrls The value of includedDocUrls as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedDocUrls_GreaterEqual(String includedDocUrls) {
        regIncludedDocUrls(CK_GE, fRES(includedDocUrls));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INCLUDED_DOC_URLS: {TEXT(65535)}
     * @param includedDocUrls The value of includedDocUrls as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedDocUrls_LessEqual(String includedDocUrls) {
        regIncludedDocUrls(CK_LE, fRES(includedDocUrls));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INCLUDED_DOC_URLS: {TEXT(65535)}
     * @param includedDocUrlsList The collection of includedDocUrls as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedDocUrls_InScope(Collection<String> includedDocUrlsList) {
        doSetIncludedDocUrls_InScope(includedDocUrlsList);
    }

    protected void doSetIncludedDocUrls_InScope(Collection<String> includedDocUrlsList) {
        regINS(CK_INS, cTL(includedDocUrlsList), xgetCValueIncludedDocUrls(), "INCLUDED_DOC_URLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INCLUDED_DOC_URLS: {TEXT(65535)}
     * @param includedDocUrlsList The collection of includedDocUrls as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedDocUrls_NotInScope(Collection<String> includedDocUrlsList) {
        doSetIncludedDocUrls_NotInScope(includedDocUrlsList);
    }

    protected void doSetIncludedDocUrls_NotInScope(Collection<String> includedDocUrlsList) {
        regINS(CK_NINS, cTL(includedDocUrlsList), xgetCValueIncludedDocUrls(), "INCLUDED_DOC_URLS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INCLUDED_DOC_URLS: {TEXT(65535)} <br>
     * <pre>e.g. setIncludedDocUrls_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param includedDocUrls The value of includedDocUrls as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setIncludedDocUrls_LikeSearch(String includedDocUrls, ConditionOptionCall<LikeSearchOption> opLambda) {
        setIncludedDocUrls_LikeSearch(includedDocUrls, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INCLUDED_DOC_URLS: {TEXT(65535)} <br>
     * <pre>e.g. setIncludedDocUrls_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param includedDocUrls The value of includedDocUrls as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setIncludedDocUrls_LikeSearch(String includedDocUrls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(includedDocUrls), xgetCValueIncludedDocUrls(), "INCLUDED_DOC_URLS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INCLUDED_DOC_URLS: {TEXT(65535)}
     * @param includedDocUrls The value of includedDocUrls as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setIncludedDocUrls_NotLikeSearch(String includedDocUrls, ConditionOptionCall<LikeSearchOption> opLambda) {
        setIncludedDocUrls_NotLikeSearch(includedDocUrls, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INCLUDED_DOC_URLS: {TEXT(65535)}
     * @param includedDocUrls The value of includedDocUrls as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setIncludedDocUrls_NotLikeSearch(String includedDocUrls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(includedDocUrls), xgetCValueIncludedDocUrls(), "INCLUDED_DOC_URLS", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INCLUDED_DOC_URLS: {TEXT(65535)}
     */
    public void setIncludedDocUrls_IsNull() { regIncludedDocUrls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INCLUDED_DOC_URLS: {TEXT(65535)}
     */
    public void setIncludedDocUrls_IsNullOrEmpty() { regIncludedDocUrls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INCLUDED_DOC_URLS: {TEXT(65535)}
     */
    public void setIncludedDocUrls_IsNotNull() { regIncludedDocUrls(CK_ISNN, DOBJ); }

    protected void regIncludedDocUrls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIncludedDocUrls(), "INCLUDED_DOC_URLS"); }
    protected abstract ConditionValue xgetCValueIncludedDocUrls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCLUDED_DOC_URLS: {TEXT(65535)}
     * @param excludedDocUrls The value of excludedDocUrls as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedDocUrls_Equal(String excludedDocUrls) {
        doSetExcludedDocUrls_Equal(fRES(excludedDocUrls));
    }

    protected void doSetExcludedDocUrls_Equal(String excludedDocUrls) {
        regExcludedDocUrls(CK_EQ, excludedDocUrls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCLUDED_DOC_URLS: {TEXT(65535)}
     * @param excludedDocUrls The value of excludedDocUrls as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedDocUrls_NotEqual(String excludedDocUrls) {
        doSetExcludedDocUrls_NotEqual(fRES(excludedDocUrls));
    }

    protected void doSetExcludedDocUrls_NotEqual(String excludedDocUrls) {
        regExcludedDocUrls(CK_NES, excludedDocUrls);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCLUDED_DOC_URLS: {TEXT(65535)}
     * @param excludedDocUrls The value of excludedDocUrls as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedDocUrls_GreaterThan(String excludedDocUrls) {
        regExcludedDocUrls(CK_GT, fRES(excludedDocUrls));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCLUDED_DOC_URLS: {TEXT(65535)}
     * @param excludedDocUrls The value of excludedDocUrls as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedDocUrls_LessThan(String excludedDocUrls) {
        regExcludedDocUrls(CK_LT, fRES(excludedDocUrls));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCLUDED_DOC_URLS: {TEXT(65535)}
     * @param excludedDocUrls The value of excludedDocUrls as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedDocUrls_GreaterEqual(String excludedDocUrls) {
        regExcludedDocUrls(CK_GE, fRES(excludedDocUrls));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCLUDED_DOC_URLS: {TEXT(65535)}
     * @param excludedDocUrls The value of excludedDocUrls as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedDocUrls_LessEqual(String excludedDocUrls) {
        regExcludedDocUrls(CK_LE, fRES(excludedDocUrls));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXCLUDED_DOC_URLS: {TEXT(65535)}
     * @param excludedDocUrlsList The collection of excludedDocUrls as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedDocUrls_InScope(Collection<String> excludedDocUrlsList) {
        doSetExcludedDocUrls_InScope(excludedDocUrlsList);
    }

    protected void doSetExcludedDocUrls_InScope(Collection<String> excludedDocUrlsList) {
        regINS(CK_INS, cTL(excludedDocUrlsList), xgetCValueExcludedDocUrls(), "EXCLUDED_DOC_URLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXCLUDED_DOC_URLS: {TEXT(65535)}
     * @param excludedDocUrlsList The collection of excludedDocUrls as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedDocUrls_NotInScope(Collection<String> excludedDocUrlsList) {
        doSetExcludedDocUrls_NotInScope(excludedDocUrlsList);
    }

    protected void doSetExcludedDocUrls_NotInScope(Collection<String> excludedDocUrlsList) {
        regINS(CK_NINS, cTL(excludedDocUrlsList), xgetCValueExcludedDocUrls(), "EXCLUDED_DOC_URLS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXCLUDED_DOC_URLS: {TEXT(65535)} <br>
     * <pre>e.g. setExcludedDocUrls_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param excludedDocUrls The value of excludedDocUrls as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setExcludedDocUrls_LikeSearch(String excludedDocUrls, ConditionOptionCall<LikeSearchOption> opLambda) {
        setExcludedDocUrls_LikeSearch(excludedDocUrls, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXCLUDED_DOC_URLS: {TEXT(65535)} <br>
     * <pre>e.g. setExcludedDocUrls_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param excludedDocUrls The value of excludedDocUrls as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setExcludedDocUrls_LikeSearch(String excludedDocUrls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(excludedDocUrls), xgetCValueExcludedDocUrls(), "EXCLUDED_DOC_URLS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXCLUDED_DOC_URLS: {TEXT(65535)}
     * @param excludedDocUrls The value of excludedDocUrls as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setExcludedDocUrls_NotLikeSearch(String excludedDocUrls, ConditionOptionCall<LikeSearchOption> opLambda) {
        setExcludedDocUrls_NotLikeSearch(excludedDocUrls, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXCLUDED_DOC_URLS: {TEXT(65535)}
     * @param excludedDocUrls The value of excludedDocUrls as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setExcludedDocUrls_NotLikeSearch(String excludedDocUrls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(excludedDocUrls), xgetCValueExcludedDocUrls(), "EXCLUDED_DOC_URLS", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXCLUDED_DOC_URLS: {TEXT(65535)}
     */
    public void setExcludedDocUrls_IsNull() { regExcludedDocUrls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXCLUDED_DOC_URLS: {TEXT(65535)}
     */
    public void setExcludedDocUrls_IsNullOrEmpty() { regExcludedDocUrls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXCLUDED_DOC_URLS: {TEXT(65535)}
     */
    public void setExcludedDocUrls_IsNotNull() { regExcludedDocUrls(CK_ISNN, DOBJ); }

    protected void regExcludedDocUrls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExcludedDocUrls(), "EXCLUDED_DOC_URLS"); }
    protected abstract ConditionValue xgetCValueExcludedDocUrls();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIG_PARAMETER: {TEXT(65535)}
     * @param configParameter The value of configParameter as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setConfigParameter_Equal(String configParameter) {
        doSetConfigParameter_Equal(fRES(configParameter));
    }

    protected void doSetConfigParameter_Equal(String configParameter) {
        regConfigParameter(CK_EQ, configParameter);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIG_PARAMETER: {TEXT(65535)}
     * @param configParameter The value of configParameter as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setConfigParameter_NotEqual(String configParameter) {
        doSetConfigParameter_NotEqual(fRES(configParameter));
    }

    protected void doSetConfigParameter_NotEqual(String configParameter) {
        regConfigParameter(CK_NES, configParameter);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIG_PARAMETER: {TEXT(65535)}
     * @param configParameter The value of configParameter as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setConfigParameter_GreaterThan(String configParameter) {
        regConfigParameter(CK_GT, fRES(configParameter));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIG_PARAMETER: {TEXT(65535)}
     * @param configParameter The value of configParameter as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setConfigParameter_LessThan(String configParameter) {
        regConfigParameter(CK_LT, fRES(configParameter));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIG_PARAMETER: {TEXT(65535)}
     * @param configParameter The value of configParameter as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setConfigParameter_GreaterEqual(String configParameter) {
        regConfigParameter(CK_GE, fRES(configParameter));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIG_PARAMETER: {TEXT(65535)}
     * @param configParameter The value of configParameter as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setConfigParameter_LessEqual(String configParameter) {
        regConfigParameter(CK_LE, fRES(configParameter));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CONFIG_PARAMETER: {TEXT(65535)}
     * @param configParameterList The collection of configParameter as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConfigParameter_InScope(Collection<String> configParameterList) {
        doSetConfigParameter_InScope(configParameterList);
    }

    protected void doSetConfigParameter_InScope(Collection<String> configParameterList) {
        regINS(CK_INS, cTL(configParameterList), xgetCValueConfigParameter(), "CONFIG_PARAMETER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CONFIG_PARAMETER: {TEXT(65535)}
     * @param configParameterList The collection of configParameter as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConfigParameter_NotInScope(Collection<String> configParameterList) {
        doSetConfigParameter_NotInScope(configParameterList);
    }

    protected void doSetConfigParameter_NotInScope(Collection<String> configParameterList) {
        regINS(CK_NINS, cTL(configParameterList), xgetCValueConfigParameter(), "CONFIG_PARAMETER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONFIG_PARAMETER: {TEXT(65535)} <br>
     * <pre>e.g. setConfigParameter_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param configParameter The value of configParameter as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setConfigParameter_LikeSearch(String configParameter, ConditionOptionCall<LikeSearchOption> opLambda) {
        setConfigParameter_LikeSearch(configParameter, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONFIG_PARAMETER: {TEXT(65535)} <br>
     * <pre>e.g. setConfigParameter_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param configParameter The value of configParameter as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setConfigParameter_LikeSearch(String configParameter, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(configParameter), xgetCValueConfigParameter(), "CONFIG_PARAMETER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONFIG_PARAMETER: {TEXT(65535)}
     * @param configParameter The value of configParameter as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setConfigParameter_NotLikeSearch(String configParameter, ConditionOptionCall<LikeSearchOption> opLambda) {
        setConfigParameter_NotLikeSearch(configParameter, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONFIG_PARAMETER: {TEXT(65535)}
     * @param configParameter The value of configParameter as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setConfigParameter_NotLikeSearch(String configParameter, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(configParameter), xgetCValueConfigParameter(), "CONFIG_PARAMETER", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CONFIG_PARAMETER: {TEXT(65535)}
     */
    public void setConfigParameter_IsNull() { regConfigParameter(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CONFIG_PARAMETER: {TEXT(65535)}
     */
    public void setConfigParameter_IsNullOrEmpty() { regConfigParameter(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CONFIG_PARAMETER: {TEXT(65535)}
     */
    public void setConfigParameter_IsNotNull() { regConfigParameter(CK_ISNN, DOBJ); }

    protected void regConfigParameter(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueConfigParameter(), "CONFIG_PARAMETER"); }
    protected abstract ConditionValue xgetCValueConfigParameter();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPTH: {INT(10)}
     * @param depth The value of depth as equal. (NullAllowed: if null, no condition)
     */
    public void setDepth_Equal(Integer depth) {
        doSetDepth_Equal(depth);
    }

    protected void doSetDepth_Equal(Integer depth) {
        regDepth(CK_EQ, depth);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPTH: {INT(10)}
     * @param depth The value of depth as notEqual. (NullAllowed: if null, no condition)
     */
    public void setDepth_NotEqual(Integer depth) {
        doSetDepth_NotEqual(depth);
    }

    protected void doSetDepth_NotEqual(Integer depth) {
        regDepth(CK_NES, depth);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPTH: {INT(10)}
     * @param depth The value of depth as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setDepth_GreaterThan(Integer depth) {
        regDepth(CK_GT, depth);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPTH: {INT(10)}
     * @param depth The value of depth as lessThan. (NullAllowed: if null, no condition)
     */
    public void setDepth_LessThan(Integer depth) {
        regDepth(CK_LT, depth);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPTH: {INT(10)}
     * @param depth The value of depth as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setDepth_GreaterEqual(Integer depth) {
        regDepth(CK_GE, depth);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPTH: {INT(10)}
     * @param depth The value of depth as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setDepth_LessEqual(Integer depth) {
        regDepth(CK_LE, depth);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DEPTH: {INT(10)}
     * @param minNumber The min number of depth. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of depth. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDepth_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDepth_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DEPTH: {INT(10)}
     * @param minNumber The min number of depth. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of depth. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDepth_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDepth(), "DEPTH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEPTH: {INT(10)}
     * @param depthList The collection of depth as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDepth_InScope(Collection<Integer> depthList) {
        doSetDepth_InScope(depthList);
    }

    protected void doSetDepth_InScope(Collection<Integer> depthList) {
        regINS(CK_INS, cTL(depthList), xgetCValueDepth(), "DEPTH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEPTH: {INT(10)}
     * @param depthList The collection of depth as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDepth_NotInScope(Collection<Integer> depthList) {
        doSetDepth_NotInScope(depthList);
    }

    protected void doSetDepth_NotInScope(Collection<Integer> depthList) {
        regINS(CK_NINS, cTL(depthList), xgetCValueDepth(), "DEPTH");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEPTH: {INT(10)}
     */
    public void setDepth_IsNull() { regDepth(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEPTH: {INT(10)}
     */
    public void setDepth_IsNotNull() { regDepth(CK_ISNN, DOBJ); }

    protected void regDepth(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDepth(), "DEPTH"); }
    protected abstract ConditionValue xgetCValueDepth();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_ACCESS_COUNT: {BIGINT(19)}
     * @param maxAccessCount The value of maxAccessCount as equal. (NullAllowed: if null, no condition)
     */
    public void setMaxAccessCount_Equal(Long maxAccessCount) {
        doSetMaxAccessCount_Equal(maxAccessCount);
    }

    protected void doSetMaxAccessCount_Equal(Long maxAccessCount) {
        regMaxAccessCount(CK_EQ, maxAccessCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_ACCESS_COUNT: {BIGINT(19)}
     * @param maxAccessCount The value of maxAccessCount as notEqual. (NullAllowed: if null, no condition)
     */
    public void setMaxAccessCount_NotEqual(Long maxAccessCount) {
        doSetMaxAccessCount_NotEqual(maxAccessCount);
    }

    protected void doSetMaxAccessCount_NotEqual(Long maxAccessCount) {
        regMaxAccessCount(CK_NES, maxAccessCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_ACCESS_COUNT: {BIGINT(19)}
     * @param maxAccessCount The value of maxAccessCount as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMaxAccessCount_GreaterThan(Long maxAccessCount) {
        regMaxAccessCount(CK_GT, maxAccessCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_ACCESS_COUNT: {BIGINT(19)}
     * @param maxAccessCount The value of maxAccessCount as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMaxAccessCount_LessThan(Long maxAccessCount) {
        regMaxAccessCount(CK_LT, maxAccessCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_ACCESS_COUNT: {BIGINT(19)}
     * @param maxAccessCount The value of maxAccessCount as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMaxAccessCount_GreaterEqual(Long maxAccessCount) {
        regMaxAccessCount(CK_GE, maxAccessCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_ACCESS_COUNT: {BIGINT(19)}
     * @param maxAccessCount The value of maxAccessCount as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMaxAccessCount_LessEqual(Long maxAccessCount) {
        regMaxAccessCount(CK_LE, maxAccessCount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_ACCESS_COUNT: {BIGINT(19)}
     * @param minNumber The min number of maxAccessCount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of maxAccessCount. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMaxAccessCount_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMaxAccessCount_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_ACCESS_COUNT: {BIGINT(19)}
     * @param minNumber The min number of maxAccessCount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of maxAccessCount. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMaxAccessCount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMaxAccessCount(), "MAX_ACCESS_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAX_ACCESS_COUNT: {BIGINT(19)}
     * @param maxAccessCountList The collection of maxAccessCount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMaxAccessCount_InScope(Collection<Long> maxAccessCountList) {
        doSetMaxAccessCount_InScope(maxAccessCountList);
    }

    protected void doSetMaxAccessCount_InScope(Collection<Long> maxAccessCountList) {
        regINS(CK_INS, cTL(maxAccessCountList), xgetCValueMaxAccessCount(), "MAX_ACCESS_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAX_ACCESS_COUNT: {BIGINT(19)}
     * @param maxAccessCountList The collection of maxAccessCount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMaxAccessCount_NotInScope(Collection<Long> maxAccessCountList) {
        doSetMaxAccessCount_NotInScope(maxAccessCountList);
    }

    protected void doSetMaxAccessCount_NotInScope(Collection<Long> maxAccessCountList) {
        regINS(CK_NINS, cTL(maxAccessCountList), xgetCValueMaxAccessCount(), "MAX_ACCESS_COUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAX_ACCESS_COUNT: {BIGINT(19)}
     */
    public void setMaxAccessCount_IsNull() { regMaxAccessCount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAX_ACCESS_COUNT: {BIGINT(19)}
     */
    public void setMaxAccessCount_IsNotNull() { regMaxAccessCount(CK_ISNN, DOBJ); }

    protected void regMaxAccessCount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMaxAccessCount(), "MAX_ACCESS_COUNT"); }
    protected abstract ConditionValue xgetCValueMaxAccessCount();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_AGENT: {NotNull, VARCHAR(200)}
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
     * USER_AGENT: {NotNull, VARCHAR(200)}
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
     * USER_AGENT: {NotNull, VARCHAR(200)}
     * @param userAgent The value of userAgent as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserAgent_GreaterThan(String userAgent) {
        regUserAgent(CK_GT, fRES(userAgent));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_AGENT: {NotNull, VARCHAR(200)}
     * @param userAgent The value of userAgent as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserAgent_LessThan(String userAgent) {
        regUserAgent(CK_LT, fRES(userAgent));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_AGENT: {NotNull, VARCHAR(200)}
     * @param userAgent The value of userAgent as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserAgent_GreaterEqual(String userAgent) {
        regUserAgent(CK_GE, fRES(userAgent));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_AGENT: {NotNull, VARCHAR(200)}
     * @param userAgent The value of userAgent as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserAgent_LessEqual(String userAgent) {
        regUserAgent(CK_LE, fRES(userAgent));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_AGENT: {NotNull, VARCHAR(200)}
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
     * USER_AGENT: {NotNull, VARCHAR(200)}
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
     * USER_AGENT: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setUserAgent_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param userAgent The value of userAgent as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUserAgent_LikeSearch(String userAgent, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUserAgent_LikeSearch(userAgent, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_AGENT: {NotNull, VARCHAR(200)} <br>
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
     * USER_AGENT: {NotNull, VARCHAR(200)}
     * @param userAgent The value of userAgent as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUserAgent_NotLikeSearch(String userAgent, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUserAgent_NotLikeSearch(userAgent, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_AGENT: {NotNull, VARCHAR(200)}
     * @param userAgent The value of userAgent as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUserAgent_NotLikeSearch(String userAgent, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userAgent), xgetCValueUserAgent(), "USER_AGENT", likeSearchOption);
    }

    protected void regUserAgent(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserAgent(), "USER_AGENT"); }
    protected abstract ConditionValue xgetCValueUserAgent();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM_OF_THREAD: {NotNull, INT(10)}
     * @param numOfThread The value of numOfThread as equal. (NullAllowed: if null, no condition)
     */
    public void setNumOfThread_Equal(Integer numOfThread) {
        doSetNumOfThread_Equal(numOfThread);
    }

    protected void doSetNumOfThread_Equal(Integer numOfThread) {
        regNumOfThread(CK_EQ, numOfThread);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM_OF_THREAD: {NotNull, INT(10)}
     * @param numOfThread The value of numOfThread as notEqual. (NullAllowed: if null, no condition)
     */
    public void setNumOfThread_NotEqual(Integer numOfThread) {
        doSetNumOfThread_NotEqual(numOfThread);
    }

    protected void doSetNumOfThread_NotEqual(Integer numOfThread) {
        regNumOfThread(CK_NES, numOfThread);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM_OF_THREAD: {NotNull, INT(10)}
     * @param numOfThread The value of numOfThread as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNumOfThread_GreaterThan(Integer numOfThread) {
        regNumOfThread(CK_GT, numOfThread);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM_OF_THREAD: {NotNull, INT(10)}
     * @param numOfThread The value of numOfThread as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNumOfThread_LessThan(Integer numOfThread) {
        regNumOfThread(CK_LT, numOfThread);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM_OF_THREAD: {NotNull, INT(10)}
     * @param numOfThread The value of numOfThread as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNumOfThread_GreaterEqual(Integer numOfThread) {
        regNumOfThread(CK_GE, numOfThread);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM_OF_THREAD: {NotNull, INT(10)}
     * @param numOfThread The value of numOfThread as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNumOfThread_LessEqual(Integer numOfThread) {
        regNumOfThread(CK_LE, numOfThread);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NUM_OF_THREAD: {NotNull, INT(10)}
     * @param minNumber The min number of numOfThread. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of numOfThread. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNumOfThread_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNumOfThread_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NUM_OF_THREAD: {NotNull, INT(10)}
     * @param minNumber The min number of numOfThread. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of numOfThread. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setNumOfThread_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNumOfThread(), "NUM_OF_THREAD", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM_OF_THREAD: {NotNull, INT(10)}
     * @param numOfThreadList The collection of numOfThread as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNumOfThread_InScope(Collection<Integer> numOfThreadList) {
        doSetNumOfThread_InScope(numOfThreadList);
    }

    protected void doSetNumOfThread_InScope(Collection<Integer> numOfThreadList) {
        regINS(CK_INS, cTL(numOfThreadList), xgetCValueNumOfThread(), "NUM_OF_THREAD");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM_OF_THREAD: {NotNull, INT(10)}
     * @param numOfThreadList The collection of numOfThread as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNumOfThread_NotInScope(Collection<Integer> numOfThreadList) {
        doSetNumOfThread_NotInScope(numOfThreadList);
    }

    protected void doSetNumOfThread_NotInScope(Collection<Integer> numOfThreadList) {
        regINS(CK_NINS, cTL(numOfThreadList), xgetCValueNumOfThread(), "NUM_OF_THREAD");
    }

    protected void regNumOfThread(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNumOfThread(), "NUM_OF_THREAD"); }
    protected abstract ConditionValue xgetCValueNumOfThread();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INTERVAL_TIME: {NotNull, INT(10)}
     * @param intervalTime The value of intervalTime as equal. (NullAllowed: if null, no condition)
     */
    public void setIntervalTime_Equal(Integer intervalTime) {
        doSetIntervalTime_Equal(intervalTime);
    }

    protected void doSetIntervalTime_Equal(Integer intervalTime) {
        regIntervalTime(CK_EQ, intervalTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INTERVAL_TIME: {NotNull, INT(10)}
     * @param intervalTime The value of intervalTime as notEqual. (NullAllowed: if null, no condition)
     */
    public void setIntervalTime_NotEqual(Integer intervalTime) {
        doSetIntervalTime_NotEqual(intervalTime);
    }

    protected void doSetIntervalTime_NotEqual(Integer intervalTime) {
        regIntervalTime(CK_NES, intervalTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INTERVAL_TIME: {NotNull, INT(10)}
     * @param intervalTime The value of intervalTime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setIntervalTime_GreaterThan(Integer intervalTime) {
        regIntervalTime(CK_GT, intervalTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INTERVAL_TIME: {NotNull, INT(10)}
     * @param intervalTime The value of intervalTime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setIntervalTime_LessThan(Integer intervalTime) {
        regIntervalTime(CK_LT, intervalTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INTERVAL_TIME: {NotNull, INT(10)}
     * @param intervalTime The value of intervalTime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setIntervalTime_GreaterEqual(Integer intervalTime) {
        regIntervalTime(CK_GE, intervalTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INTERVAL_TIME: {NotNull, INT(10)}
     * @param intervalTime The value of intervalTime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setIntervalTime_LessEqual(Integer intervalTime) {
        regIntervalTime(CK_LE, intervalTime);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INTERVAL_TIME: {NotNull, INT(10)}
     * @param minNumber The min number of intervalTime. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of intervalTime. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setIntervalTime_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setIntervalTime_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INTERVAL_TIME: {NotNull, INT(10)}
     * @param minNumber The min number of intervalTime. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of intervalTime. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setIntervalTime_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueIntervalTime(), "INTERVAL_TIME", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INTERVAL_TIME: {NotNull, INT(10)}
     * @param intervalTimeList The collection of intervalTime as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setIntervalTime_InScope(Collection<Integer> intervalTimeList) {
        doSetIntervalTime_InScope(intervalTimeList);
    }

    protected void doSetIntervalTime_InScope(Collection<Integer> intervalTimeList) {
        regINS(CK_INS, cTL(intervalTimeList), xgetCValueIntervalTime(), "INTERVAL_TIME");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INTERVAL_TIME: {NotNull, INT(10)}
     * @param intervalTimeList The collection of intervalTime as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setIntervalTime_NotInScope(Collection<Integer> intervalTimeList) {
        doSetIntervalTime_NotInScope(intervalTimeList);
    }

    protected void doSetIntervalTime_NotInScope(Collection<Integer> intervalTimeList) {
        regINS(CK_NINS, cTL(intervalTimeList), xgetCValueIntervalTime(), "INTERVAL_TIME");
    }

    protected void regIntervalTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIntervalTime(), "INTERVAL_TIME"); }
    protected abstract ConditionValue xgetCValueIntervalTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOOST: {NotNull, FLOAT(12)}
     * @param boost The value of boost as equal. (NullAllowed: if null, no condition)
     */
    public void setBoost_Equal(java.math.BigDecimal boost) {
        doSetBoost_Equal(boost);
    }

    protected void doSetBoost_Equal(java.math.BigDecimal boost) {
        regBoost(CK_EQ, boost);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOOST: {NotNull, FLOAT(12)}
     * @param boost The value of boost as notEqual. (NullAllowed: if null, no condition)
     */
    public void setBoost_NotEqual(java.math.BigDecimal boost) {
        doSetBoost_NotEqual(boost);
    }

    protected void doSetBoost_NotEqual(java.math.BigDecimal boost) {
        regBoost(CK_NES, boost);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOOST: {NotNull, FLOAT(12)}
     * @param boost The value of boost as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setBoost_GreaterThan(java.math.BigDecimal boost) {
        regBoost(CK_GT, boost);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOOST: {NotNull, FLOAT(12)}
     * @param boost The value of boost as lessThan. (NullAllowed: if null, no condition)
     */
    public void setBoost_LessThan(java.math.BigDecimal boost) {
        regBoost(CK_LT, boost);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOOST: {NotNull, FLOAT(12)}
     * @param boost The value of boost as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setBoost_GreaterEqual(java.math.BigDecimal boost) {
        regBoost(CK_GE, boost);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOOST: {NotNull, FLOAT(12)}
     * @param boost The value of boost as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setBoost_LessEqual(java.math.BigDecimal boost) {
        regBoost(CK_LE, boost);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BOOST: {NotNull, FLOAT(12)}
     * @param minNumber The min number of boost. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of boost. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setBoost_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setBoost_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BOOST: {NotNull, FLOAT(12)}
     * @param minNumber The min number of boost. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of boost. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBoost_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBoost(), "BOOST", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOOST: {NotNull, FLOAT(12)}
     * @param boostList The collection of boost as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBoost_InScope(Collection<java.math.BigDecimal> boostList) {
        doSetBoost_InScope(boostList);
    }

    protected void doSetBoost_InScope(Collection<java.math.BigDecimal> boostList) {
        regINS(CK_INS, cTL(boostList), xgetCValueBoost(), "BOOST");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOOST: {NotNull, FLOAT(12)}
     * @param boostList The collection of boost as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBoost_NotInScope(Collection<java.math.BigDecimal> boostList) {
        doSetBoost_NotInScope(boostList);
    }

    protected void doSetBoost_NotInScope(Collection<java.math.BigDecimal> boostList) {
        regINS(CK_NINS, cTL(boostList), xgetCValueBoost(), "BOOST");
    }

    protected void regBoost(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoost(), "BOOST"); }
    protected abstract ConditionValue xgetCValueBoost();

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
     * SORT_ORDER: {NotNull, INT(10)}
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
     * SORT_ORDER: {NotNull, INT(10)}
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
     * SORT_ORDER: {NotNull, INT(10)}
     * @param sortOrder The value of sortOrder as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSortOrder_GreaterThan(Integer sortOrder) {
        regSortOrder(CK_GT, sortOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_ORDER: {NotNull, INT(10)}
     * @param sortOrder The value of sortOrder as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSortOrder_LessThan(Integer sortOrder) {
        regSortOrder(CK_LT, sortOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_ORDER: {NotNull, INT(10)}
     * @param sortOrder The value of sortOrder as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSortOrder_GreaterEqual(Integer sortOrder) {
        regSortOrder(CK_GE, sortOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_ORDER: {NotNull, INT(10)}
     * @param sortOrder The value of sortOrder as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSortOrder_LessEqual(Integer sortOrder) {
        regSortOrder(CK_LE, sortOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_ORDER: {NotNull, INT(10)}
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
     * SORT_ORDER: {NotNull, INT(10)}
     * @param minNumber The min number of sortOrder. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sortOrder. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSortOrder_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSortOrder(), "SORT_ORDER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORT_ORDER: {NotNull, INT(10)}
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
     * SORT_ORDER: {NotNull, INT(10)}
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
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;WebCrawlingConfigCB&gt;() {
     *     public void query(WebCrawlingConfigCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WebCrawlingConfigCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WebCrawlingConfigCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WebCrawlingConfigCB&gt;() {
     *     public void query(WebCrawlingConfigCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WebCrawlingConfigCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WebCrawlingConfigCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WebCrawlingConfigCB&gt;() {
     *     public void query(WebCrawlingConfigCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WebCrawlingConfigCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WebCrawlingConfigCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;WebCrawlingConfigCB&gt;() {
     *     public void query(WebCrawlingConfigCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WebCrawlingConfigCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WebCrawlingConfigCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WebCrawlingConfigCB&gt;() {
     *     public void query(WebCrawlingConfigCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WebCrawlingConfigCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WebCrawlingConfigCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WebCrawlingConfigCB&gt;() {
     *     public void query(WebCrawlingConfigCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WebCrawlingConfigCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WebCrawlingConfigCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WebCrawlingConfigCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WebCrawlingConfigCQ sq);

    protected WebCrawlingConfigCB xcreateScalarConditionCB() {
        WebCrawlingConfigCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WebCrawlingConfigCB xcreateScalarConditionPartitionByCB() {
        WebCrawlingConfigCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WebCrawlingConfigCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WebCrawlingConfigCB cb = new WebCrawlingConfigCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WebCrawlingConfigCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WebCrawlingConfigCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WebCrawlingConfigCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WebCrawlingConfigCB cb = new WebCrawlingConfigCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WebCrawlingConfigCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WebCrawlingConfigCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WebCrawlingConfigCB cb = new WebCrawlingConfigCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WebCrawlingConfigCQ sq);

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
    protected WebCrawlingConfigCB newMyCB() {
        return new WebCrawlingConfigCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WebCrawlingConfigCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
