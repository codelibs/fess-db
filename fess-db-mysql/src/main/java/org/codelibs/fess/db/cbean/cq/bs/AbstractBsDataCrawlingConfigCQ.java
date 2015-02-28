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
 * The abstract condition-query of DATA_CRAWLING_CONFIG.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsDataCrawlingConfigCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsDataCrawlingConfigCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "DATA_CRAWLING_CONFIG";
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
     * {exists (select DATA_CONFIG_ID from DATA_CONFIG_TO_LABEL_TYPE_MAPPING where ...)} <br>
     * DATA_CONFIG_TO_LABEL_TYPE_MAPPING by DATA_CONFIG_ID, named 'dataConfigToLabelTypeMappingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsDataConfigToLabelTypeMapping</span>(mappingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mappingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of DataConfigToLabelTypeMappingList for 'exists'. (NotNull)
     */
    public void existsDataConfigToLabelTypeMapping(SubQuery<DataConfigToLabelTypeMappingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DataConfigToLabelTypeMappingCB cb = new DataConfigToLabelTypeMappingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_ExistsReferrer_DataConfigToLabelTypeMappingList(cb.query());
        registerExistsReferrer(cb.query(), "ID", "DATA_CONFIG_ID", pp, "dataConfigToLabelTypeMappingList");
    }
    public abstract String keepId_ExistsReferrer_DataConfigToLabelTypeMappingList(DataConfigToLabelTypeMappingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DATA_CONFIG_ID from DATA_CONFIG_TO_ROLE_TYPE_MAPPING where ...)} <br>
     * DATA_CONFIG_TO_ROLE_TYPE_MAPPING by DATA_CONFIG_ID, named 'dataConfigToRoleTypeMappingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsDataConfigToRoleTypeMapping</span>(mappingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mappingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of DataConfigToRoleTypeMappingList for 'exists'. (NotNull)
     */
    public void existsDataConfigToRoleTypeMapping(SubQuery<DataConfigToRoleTypeMappingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DataConfigToRoleTypeMappingCB cb = new DataConfigToRoleTypeMappingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_ExistsReferrer_DataConfigToRoleTypeMappingList(cb.query());
        registerExistsReferrer(cb.query(), "ID", "DATA_CONFIG_ID", pp, "dataConfigToRoleTypeMappingList");
    }
    public abstract String keepId_ExistsReferrer_DataConfigToRoleTypeMappingList(DataConfigToRoleTypeMappingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DATA_CONFIG_ID from DATA_CONFIG_TO_LABEL_TYPE_MAPPING where ...)} <br>
     * DATA_CONFIG_TO_LABEL_TYPE_MAPPING by DATA_CONFIG_ID, named 'dataConfigToLabelTypeMappingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsDataConfigToLabelTypeMapping</span>(mappingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mappingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of Id_NotExistsReferrer_DataConfigToLabelTypeMappingList for 'not exists'. (NotNull)
     */
    public void notExistsDataConfigToLabelTypeMapping(SubQuery<DataConfigToLabelTypeMappingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DataConfigToLabelTypeMappingCB cb = new DataConfigToLabelTypeMappingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_NotExistsReferrer_DataConfigToLabelTypeMappingList(cb.query());
        registerNotExistsReferrer(cb.query(), "ID", "DATA_CONFIG_ID", pp, "dataConfigToLabelTypeMappingList");
    }
    public abstract String keepId_NotExistsReferrer_DataConfigToLabelTypeMappingList(DataConfigToLabelTypeMappingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DATA_CONFIG_ID from DATA_CONFIG_TO_ROLE_TYPE_MAPPING where ...)} <br>
     * DATA_CONFIG_TO_ROLE_TYPE_MAPPING by DATA_CONFIG_ID, named 'dataConfigToRoleTypeMappingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsDataConfigToRoleTypeMapping</span>(mappingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mappingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of Id_NotExistsReferrer_DataConfigToRoleTypeMappingList for 'not exists'. (NotNull)
     */
    public void notExistsDataConfigToRoleTypeMapping(SubQuery<DataConfigToRoleTypeMappingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DataConfigToRoleTypeMappingCB cb = new DataConfigToRoleTypeMappingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_NotExistsReferrer_DataConfigToRoleTypeMappingList(cb.query());
        registerNotExistsReferrer(cb.query(), "ID", "DATA_CONFIG_ID", pp, "dataConfigToRoleTypeMappingList");
    }
    public abstract String keepId_NotExistsReferrer_DataConfigToRoleTypeMappingList(DataConfigToRoleTypeMappingCQ sq);

    public void xsderiveDataConfigToLabelTypeMappingList(String fn, SubQuery<DataConfigToLabelTypeMappingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DataConfigToLabelTypeMappingCB cb = new DataConfigToLabelTypeMappingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepId_SpecifyDerivedReferrer_DataConfigToLabelTypeMappingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ID", "DATA_CONFIG_ID", pp, "dataConfigToLabelTypeMappingList", al, op);
    }
    public abstract String keepId_SpecifyDerivedReferrer_DataConfigToLabelTypeMappingList(DataConfigToLabelTypeMappingCQ sq);

    public void xsderiveDataConfigToRoleTypeMappingList(String fn, SubQuery<DataConfigToRoleTypeMappingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DataConfigToRoleTypeMappingCB cb = new DataConfigToRoleTypeMappingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepId_SpecifyDerivedReferrer_DataConfigToRoleTypeMappingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ID", "DATA_CONFIG_ID", pp, "dataConfigToRoleTypeMappingList", al, op);
    }
    public abstract String keepId_SpecifyDerivedReferrer_DataConfigToRoleTypeMappingList(DataConfigToRoleTypeMappingCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from DATA_CONFIG_TO_LABEL_TYPE_MAPPING where ...)} <br>
     * DATA_CONFIG_TO_LABEL_TYPE_MAPPING by DATA_CONFIG_ID, named 'dataConfigToLabelTypeMappingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedDataConfigToLabelTypeMapping()</span>.<span style="color: #CC4747">max</span>(mappingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mappingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     mappingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<DataConfigToLabelTypeMappingCB> derivedDataConfigToLabelTypeMapping() {
        return xcreateQDRFunctionDataConfigToLabelTypeMappingList();
    }
    protected HpQDRFunction<DataConfigToLabelTypeMappingCB> xcreateQDRFunctionDataConfigToLabelTypeMappingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveDataConfigToLabelTypeMappingList(fn, sq, rd, vl, op));
    }
    public void xqderiveDataConfigToLabelTypeMappingList(String fn, SubQuery<DataConfigToLabelTypeMappingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DataConfigToLabelTypeMappingCB cb = new DataConfigToLabelTypeMappingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepId_QueryDerivedReferrer_DataConfigToLabelTypeMappingList(cb.query()); String prpp = keepId_QueryDerivedReferrer_DataConfigToLabelTypeMappingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ID", "DATA_CONFIG_ID", sqpp, "dataConfigToLabelTypeMappingList", rd, vl, prpp, op);
    }
    public abstract String keepId_QueryDerivedReferrer_DataConfigToLabelTypeMappingList(DataConfigToLabelTypeMappingCQ sq);
    public abstract String keepId_QueryDerivedReferrer_DataConfigToLabelTypeMappingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from DATA_CONFIG_TO_ROLE_TYPE_MAPPING where ...)} <br>
     * DATA_CONFIG_TO_ROLE_TYPE_MAPPING by DATA_CONFIG_ID, named 'dataConfigToRoleTypeMappingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedDataConfigToRoleTypeMapping()</span>.<span style="color: #CC4747">max</span>(mappingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mappingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     mappingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<DataConfigToRoleTypeMappingCB> derivedDataConfigToRoleTypeMapping() {
        return xcreateQDRFunctionDataConfigToRoleTypeMappingList();
    }
    protected HpQDRFunction<DataConfigToRoleTypeMappingCB> xcreateQDRFunctionDataConfigToRoleTypeMappingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveDataConfigToRoleTypeMappingList(fn, sq, rd, vl, op));
    }
    public void xqderiveDataConfigToRoleTypeMappingList(String fn, SubQuery<DataConfigToRoleTypeMappingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DataConfigToRoleTypeMappingCB cb = new DataConfigToRoleTypeMappingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepId_QueryDerivedReferrer_DataConfigToRoleTypeMappingList(cb.query()); String prpp = keepId_QueryDerivedReferrer_DataConfigToRoleTypeMappingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ID", "DATA_CONFIG_ID", sqpp, "dataConfigToRoleTypeMappingList", rd, vl, prpp, op);
    }
    public abstract String keepId_QueryDerivedReferrer_DataConfigToRoleTypeMappingList(DataConfigToRoleTypeMappingCQ sq);
    public abstract String keepId_QueryDerivedReferrer_DataConfigToRoleTypeMappingListParameter(Object vl);

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
     * HANDLER_NAME: {NotNull, VARCHAR(200)}
     * @param handlerName The value of handlerName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setHandlerName_Equal(String handlerName) {
        doSetHandlerName_Equal(fRES(handlerName));
    }

    protected void doSetHandlerName_Equal(String handlerName) {
        regHandlerName(CK_EQ, handlerName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANDLER_NAME: {NotNull, VARCHAR(200)}
     * @param handlerName The value of handlerName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setHandlerName_NotEqual(String handlerName) {
        doSetHandlerName_NotEqual(fRES(handlerName));
    }

    protected void doSetHandlerName_NotEqual(String handlerName) {
        regHandlerName(CK_NES, handlerName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANDLER_NAME: {NotNull, VARCHAR(200)}
     * @param handlerName The value of handlerName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setHandlerName_GreaterThan(String handlerName) {
        regHandlerName(CK_GT, fRES(handlerName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANDLER_NAME: {NotNull, VARCHAR(200)}
     * @param handlerName The value of handlerName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setHandlerName_LessThan(String handlerName) {
        regHandlerName(CK_LT, fRES(handlerName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANDLER_NAME: {NotNull, VARCHAR(200)}
     * @param handlerName The value of handlerName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setHandlerName_GreaterEqual(String handlerName) {
        regHandlerName(CK_GE, fRES(handlerName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANDLER_NAME: {NotNull, VARCHAR(200)}
     * @param handlerName The value of handlerName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setHandlerName_LessEqual(String handlerName) {
        regHandlerName(CK_LE, fRES(handlerName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HANDLER_NAME: {NotNull, VARCHAR(200)}
     * @param handlerNameList The collection of handlerName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setHandlerName_InScope(Collection<String> handlerNameList) {
        doSetHandlerName_InScope(handlerNameList);
    }

    protected void doSetHandlerName_InScope(Collection<String> handlerNameList) {
        regINS(CK_INS, cTL(handlerNameList), xgetCValueHandlerName(), "HANDLER_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HANDLER_NAME: {NotNull, VARCHAR(200)}
     * @param handlerNameList The collection of handlerName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setHandlerName_NotInScope(Collection<String> handlerNameList) {
        doSetHandlerName_NotInScope(handlerNameList);
    }

    protected void doSetHandlerName_NotInScope(Collection<String> handlerNameList) {
        regINS(CK_NINS, cTL(handlerNameList), xgetCValueHandlerName(), "HANDLER_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HANDLER_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setHandlerName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param handlerName The value of handlerName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setHandlerName_LikeSearch(String handlerName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setHandlerName_LikeSearch(handlerName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HANDLER_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setHandlerName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param handlerName The value of handlerName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setHandlerName_LikeSearch(String handlerName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(handlerName), xgetCValueHandlerName(), "HANDLER_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HANDLER_NAME: {NotNull, VARCHAR(200)}
     * @param handlerName The value of handlerName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setHandlerName_NotLikeSearch(String handlerName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setHandlerName_NotLikeSearch(handlerName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HANDLER_NAME: {NotNull, VARCHAR(200)}
     * @param handlerName The value of handlerName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setHandlerName_NotLikeSearch(String handlerName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(handlerName), xgetCValueHandlerName(), "HANDLER_NAME", likeSearchOption);
    }

    protected void regHandlerName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHandlerName(), "HANDLER_NAME"); }
    protected abstract ConditionValue xgetCValueHandlerName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANDLER_PARAMETER: {TEXT(65535)}
     * @param handlerParameter The value of handlerParameter as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setHandlerParameter_Equal(String handlerParameter) {
        doSetHandlerParameter_Equal(fRES(handlerParameter));
    }

    protected void doSetHandlerParameter_Equal(String handlerParameter) {
        regHandlerParameter(CK_EQ, handlerParameter);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANDLER_PARAMETER: {TEXT(65535)}
     * @param handlerParameter The value of handlerParameter as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setHandlerParameter_NotEqual(String handlerParameter) {
        doSetHandlerParameter_NotEqual(fRES(handlerParameter));
    }

    protected void doSetHandlerParameter_NotEqual(String handlerParameter) {
        regHandlerParameter(CK_NES, handlerParameter);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANDLER_PARAMETER: {TEXT(65535)}
     * @param handlerParameter The value of handlerParameter as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setHandlerParameter_GreaterThan(String handlerParameter) {
        regHandlerParameter(CK_GT, fRES(handlerParameter));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANDLER_PARAMETER: {TEXT(65535)}
     * @param handlerParameter The value of handlerParameter as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setHandlerParameter_LessThan(String handlerParameter) {
        regHandlerParameter(CK_LT, fRES(handlerParameter));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANDLER_PARAMETER: {TEXT(65535)}
     * @param handlerParameter The value of handlerParameter as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setHandlerParameter_GreaterEqual(String handlerParameter) {
        regHandlerParameter(CK_GE, fRES(handlerParameter));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANDLER_PARAMETER: {TEXT(65535)}
     * @param handlerParameter The value of handlerParameter as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setHandlerParameter_LessEqual(String handlerParameter) {
        regHandlerParameter(CK_LE, fRES(handlerParameter));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HANDLER_PARAMETER: {TEXT(65535)}
     * @param handlerParameterList The collection of handlerParameter as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setHandlerParameter_InScope(Collection<String> handlerParameterList) {
        doSetHandlerParameter_InScope(handlerParameterList);
    }

    protected void doSetHandlerParameter_InScope(Collection<String> handlerParameterList) {
        regINS(CK_INS, cTL(handlerParameterList), xgetCValueHandlerParameter(), "HANDLER_PARAMETER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HANDLER_PARAMETER: {TEXT(65535)}
     * @param handlerParameterList The collection of handlerParameter as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setHandlerParameter_NotInScope(Collection<String> handlerParameterList) {
        doSetHandlerParameter_NotInScope(handlerParameterList);
    }

    protected void doSetHandlerParameter_NotInScope(Collection<String> handlerParameterList) {
        regINS(CK_NINS, cTL(handlerParameterList), xgetCValueHandlerParameter(), "HANDLER_PARAMETER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HANDLER_PARAMETER: {TEXT(65535)} <br>
     * <pre>e.g. setHandlerParameter_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param handlerParameter The value of handlerParameter as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setHandlerParameter_LikeSearch(String handlerParameter, ConditionOptionCall<LikeSearchOption> opLambda) {
        setHandlerParameter_LikeSearch(handlerParameter, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HANDLER_PARAMETER: {TEXT(65535)} <br>
     * <pre>e.g. setHandlerParameter_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param handlerParameter The value of handlerParameter as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setHandlerParameter_LikeSearch(String handlerParameter, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(handlerParameter), xgetCValueHandlerParameter(), "HANDLER_PARAMETER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HANDLER_PARAMETER: {TEXT(65535)}
     * @param handlerParameter The value of handlerParameter as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setHandlerParameter_NotLikeSearch(String handlerParameter, ConditionOptionCall<LikeSearchOption> opLambda) {
        setHandlerParameter_NotLikeSearch(handlerParameter, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HANDLER_PARAMETER: {TEXT(65535)}
     * @param handlerParameter The value of handlerParameter as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setHandlerParameter_NotLikeSearch(String handlerParameter, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(handlerParameter), xgetCValueHandlerParameter(), "HANDLER_PARAMETER", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HANDLER_PARAMETER: {TEXT(65535)}
     */
    public void setHandlerParameter_IsNull() { regHandlerParameter(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HANDLER_PARAMETER: {TEXT(65535)}
     */
    public void setHandlerParameter_IsNullOrEmpty() { regHandlerParameter(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HANDLER_PARAMETER: {TEXT(65535)}
     */
    public void setHandlerParameter_IsNotNull() { regHandlerParameter(CK_ISNN, DOBJ); }

    protected void regHandlerParameter(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHandlerParameter(), "HANDLER_PARAMETER"); }
    protected abstract ConditionValue xgetCValueHandlerParameter();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANDLER_SCRIPT: {TEXT(65535)}
     * @param handlerScript The value of handlerScript as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setHandlerScript_Equal(String handlerScript) {
        doSetHandlerScript_Equal(fRES(handlerScript));
    }

    protected void doSetHandlerScript_Equal(String handlerScript) {
        regHandlerScript(CK_EQ, handlerScript);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANDLER_SCRIPT: {TEXT(65535)}
     * @param handlerScript The value of handlerScript as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setHandlerScript_NotEqual(String handlerScript) {
        doSetHandlerScript_NotEqual(fRES(handlerScript));
    }

    protected void doSetHandlerScript_NotEqual(String handlerScript) {
        regHandlerScript(CK_NES, handlerScript);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANDLER_SCRIPT: {TEXT(65535)}
     * @param handlerScript The value of handlerScript as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setHandlerScript_GreaterThan(String handlerScript) {
        regHandlerScript(CK_GT, fRES(handlerScript));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANDLER_SCRIPT: {TEXT(65535)}
     * @param handlerScript The value of handlerScript as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setHandlerScript_LessThan(String handlerScript) {
        regHandlerScript(CK_LT, fRES(handlerScript));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANDLER_SCRIPT: {TEXT(65535)}
     * @param handlerScript The value of handlerScript as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setHandlerScript_GreaterEqual(String handlerScript) {
        regHandlerScript(CK_GE, fRES(handlerScript));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HANDLER_SCRIPT: {TEXT(65535)}
     * @param handlerScript The value of handlerScript as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setHandlerScript_LessEqual(String handlerScript) {
        regHandlerScript(CK_LE, fRES(handlerScript));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HANDLER_SCRIPT: {TEXT(65535)}
     * @param handlerScriptList The collection of handlerScript as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setHandlerScript_InScope(Collection<String> handlerScriptList) {
        doSetHandlerScript_InScope(handlerScriptList);
    }

    protected void doSetHandlerScript_InScope(Collection<String> handlerScriptList) {
        regINS(CK_INS, cTL(handlerScriptList), xgetCValueHandlerScript(), "HANDLER_SCRIPT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HANDLER_SCRIPT: {TEXT(65535)}
     * @param handlerScriptList The collection of handlerScript as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setHandlerScript_NotInScope(Collection<String> handlerScriptList) {
        doSetHandlerScript_NotInScope(handlerScriptList);
    }

    protected void doSetHandlerScript_NotInScope(Collection<String> handlerScriptList) {
        regINS(CK_NINS, cTL(handlerScriptList), xgetCValueHandlerScript(), "HANDLER_SCRIPT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HANDLER_SCRIPT: {TEXT(65535)} <br>
     * <pre>e.g. setHandlerScript_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param handlerScript The value of handlerScript as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setHandlerScript_LikeSearch(String handlerScript, ConditionOptionCall<LikeSearchOption> opLambda) {
        setHandlerScript_LikeSearch(handlerScript, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HANDLER_SCRIPT: {TEXT(65535)} <br>
     * <pre>e.g. setHandlerScript_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param handlerScript The value of handlerScript as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setHandlerScript_LikeSearch(String handlerScript, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(handlerScript), xgetCValueHandlerScript(), "HANDLER_SCRIPT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HANDLER_SCRIPT: {TEXT(65535)}
     * @param handlerScript The value of handlerScript as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setHandlerScript_NotLikeSearch(String handlerScript, ConditionOptionCall<LikeSearchOption> opLambda) {
        setHandlerScript_NotLikeSearch(handlerScript, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HANDLER_SCRIPT: {TEXT(65535)}
     * @param handlerScript The value of handlerScript as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setHandlerScript_NotLikeSearch(String handlerScript, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(handlerScript), xgetCValueHandlerScript(), "HANDLER_SCRIPT", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HANDLER_SCRIPT: {TEXT(65535)}
     */
    public void setHandlerScript_IsNull() { regHandlerScript(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HANDLER_SCRIPT: {TEXT(65535)}
     */
    public void setHandlerScript_IsNullOrEmpty() { regHandlerScript(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HANDLER_SCRIPT: {TEXT(65535)}
     */
    public void setHandlerScript_IsNotNull() { regHandlerScript(CK_ISNN, DOBJ); }

    protected void regHandlerScript(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHandlerScript(), "HANDLER_SCRIPT"); }
    protected abstract ConditionValue xgetCValueHandlerScript();

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
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;DataCrawlingConfigCB&gt;() {
     *     public void query(DataCrawlingConfigCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<DataCrawlingConfigCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, DataCrawlingConfigCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;DataCrawlingConfigCB&gt;() {
     *     public void query(DataCrawlingConfigCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<DataCrawlingConfigCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, DataCrawlingConfigCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;DataCrawlingConfigCB&gt;() {
     *     public void query(DataCrawlingConfigCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<DataCrawlingConfigCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, DataCrawlingConfigCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;DataCrawlingConfigCB&gt;() {
     *     public void query(DataCrawlingConfigCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<DataCrawlingConfigCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, DataCrawlingConfigCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;DataCrawlingConfigCB&gt;() {
     *     public void query(DataCrawlingConfigCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<DataCrawlingConfigCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, DataCrawlingConfigCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;DataCrawlingConfigCB&gt;() {
     *     public void query(DataCrawlingConfigCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<DataCrawlingConfigCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, DataCrawlingConfigCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        DataCrawlingConfigCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(DataCrawlingConfigCQ sq);

    protected DataCrawlingConfigCB xcreateScalarConditionCB() {
        DataCrawlingConfigCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected DataCrawlingConfigCB xcreateScalarConditionPartitionByCB() {
        DataCrawlingConfigCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<DataCrawlingConfigCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DataCrawlingConfigCB cb = new DataCrawlingConfigCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(DataCrawlingConfigCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<DataCrawlingConfigCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(DataCrawlingConfigCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DataCrawlingConfigCB cb = new DataCrawlingConfigCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(DataCrawlingConfigCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<DataCrawlingConfigCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DataCrawlingConfigCB cb = new DataCrawlingConfigCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(DataCrawlingConfigCQ sq);

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
    protected DataCrawlingConfigCB newMyCB() {
        return new DataCrawlingConfigCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return DataCrawlingConfigCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
