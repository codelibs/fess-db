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
 * The abstract condition-query of FILE_CRAWLING_CONFIG.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsFileCrawlingConfigCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsFileCrawlingConfigCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "FILE_CRAWLING_CONFIG";
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
     * {exists (select FILE_CRAWLING_CONFIG_ID from FILE_AUTHENTICATION where ...)} <br>
     * FILE_AUTHENTICATION by FILE_CRAWLING_CONFIG_ID, named 'fileAuthenticationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsFileAuthentication</span>(authenticationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     authenticationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of FileAuthenticationList for 'exists'. (NotNull)
     */
    public void existsFileAuthentication(SubQuery<FileAuthenticationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        FileAuthenticationCB cb = new FileAuthenticationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_ExistsReferrer_FileAuthenticationList(cb.query());
        registerExistsReferrer(cb.query(), "ID", "FILE_CRAWLING_CONFIG_ID", pp, "fileAuthenticationList");
    }
    public abstract String keepId_ExistsReferrer_FileAuthenticationList(FileAuthenticationCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select FILE_CONFIG_ID from FILE_CONFIG_TO_LABEL_TYPE_MAPPING where ...)} <br>
     * FILE_CONFIG_TO_LABEL_TYPE_MAPPING by FILE_CONFIG_ID, named 'fileConfigToLabelTypeMappingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsFileConfigToLabelTypeMapping</span>(mappingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mappingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of FileConfigToLabelTypeMappingList for 'exists'. (NotNull)
     */
    public void existsFileConfigToLabelTypeMapping(SubQuery<FileConfigToLabelTypeMappingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        FileConfigToLabelTypeMappingCB cb = new FileConfigToLabelTypeMappingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_ExistsReferrer_FileConfigToLabelTypeMappingList(cb.query());
        registerExistsReferrer(cb.query(), "ID", "FILE_CONFIG_ID", pp, "fileConfigToLabelTypeMappingList");
    }
    public abstract String keepId_ExistsReferrer_FileConfigToLabelTypeMappingList(FileConfigToLabelTypeMappingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select FILE_CONFIG_ID from FILE_CONFIG_TO_ROLE_TYPE_MAPPING where ...)} <br>
     * FILE_CONFIG_TO_ROLE_TYPE_MAPPING by FILE_CONFIG_ID, named 'fileConfigToRoleTypeMappingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsFileConfigToRoleTypeMapping</span>(mappingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mappingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of FileConfigToRoleTypeMappingList for 'exists'. (NotNull)
     */
    public void existsFileConfigToRoleTypeMapping(SubQuery<FileConfigToRoleTypeMappingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        FileConfigToRoleTypeMappingCB cb = new FileConfigToRoleTypeMappingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_ExistsReferrer_FileConfigToRoleTypeMappingList(cb.query());
        registerExistsReferrer(cb.query(), "ID", "FILE_CONFIG_ID", pp, "fileConfigToRoleTypeMappingList");
    }
    public abstract String keepId_ExistsReferrer_FileConfigToRoleTypeMappingList(FileConfigToRoleTypeMappingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select FILE_CRAWLING_CONFIG_ID from FILE_AUTHENTICATION where ...)} <br>
     * FILE_AUTHENTICATION by FILE_CRAWLING_CONFIG_ID, named 'fileAuthenticationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsFileAuthentication</span>(authenticationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     authenticationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of Id_NotExistsReferrer_FileAuthenticationList for 'not exists'. (NotNull)
     */
    public void notExistsFileAuthentication(SubQuery<FileAuthenticationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        FileAuthenticationCB cb = new FileAuthenticationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_NotExistsReferrer_FileAuthenticationList(cb.query());
        registerNotExistsReferrer(cb.query(), "ID", "FILE_CRAWLING_CONFIG_ID", pp, "fileAuthenticationList");
    }
    public abstract String keepId_NotExistsReferrer_FileAuthenticationList(FileAuthenticationCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select FILE_CONFIG_ID from FILE_CONFIG_TO_LABEL_TYPE_MAPPING where ...)} <br>
     * FILE_CONFIG_TO_LABEL_TYPE_MAPPING by FILE_CONFIG_ID, named 'fileConfigToLabelTypeMappingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsFileConfigToLabelTypeMapping</span>(mappingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mappingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of Id_NotExistsReferrer_FileConfigToLabelTypeMappingList for 'not exists'. (NotNull)
     */
    public void notExistsFileConfigToLabelTypeMapping(SubQuery<FileConfigToLabelTypeMappingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        FileConfigToLabelTypeMappingCB cb = new FileConfigToLabelTypeMappingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_NotExistsReferrer_FileConfigToLabelTypeMappingList(cb.query());
        registerNotExistsReferrer(cb.query(), "ID", "FILE_CONFIG_ID", pp, "fileConfigToLabelTypeMappingList");
    }
    public abstract String keepId_NotExistsReferrer_FileConfigToLabelTypeMappingList(FileConfigToLabelTypeMappingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select FILE_CONFIG_ID from FILE_CONFIG_TO_ROLE_TYPE_MAPPING where ...)} <br>
     * FILE_CONFIG_TO_ROLE_TYPE_MAPPING by FILE_CONFIG_ID, named 'fileConfigToRoleTypeMappingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsFileConfigToRoleTypeMapping</span>(mappingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mappingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of Id_NotExistsReferrer_FileConfigToRoleTypeMappingList for 'not exists'. (NotNull)
     */
    public void notExistsFileConfigToRoleTypeMapping(SubQuery<FileConfigToRoleTypeMappingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        FileConfigToRoleTypeMappingCB cb = new FileConfigToRoleTypeMappingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_NotExistsReferrer_FileConfigToRoleTypeMappingList(cb.query());
        registerNotExistsReferrer(cb.query(), "ID", "FILE_CONFIG_ID", pp, "fileConfigToRoleTypeMappingList");
    }
    public abstract String keepId_NotExistsReferrer_FileConfigToRoleTypeMappingList(FileConfigToRoleTypeMappingCQ sq);

    public void xsderiveFileAuthenticationList(String fn, SubQuery<FileAuthenticationCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FileAuthenticationCB cb = new FileAuthenticationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepId_SpecifyDerivedReferrer_FileAuthenticationList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ID", "FILE_CRAWLING_CONFIG_ID", pp, "fileAuthenticationList", al, op);
    }
    public abstract String keepId_SpecifyDerivedReferrer_FileAuthenticationList(FileAuthenticationCQ sq);

    public void xsderiveFileConfigToLabelTypeMappingList(String fn, SubQuery<FileConfigToLabelTypeMappingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FileConfigToLabelTypeMappingCB cb = new FileConfigToLabelTypeMappingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepId_SpecifyDerivedReferrer_FileConfigToLabelTypeMappingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ID", "FILE_CONFIG_ID", pp, "fileConfigToLabelTypeMappingList", al, op);
    }
    public abstract String keepId_SpecifyDerivedReferrer_FileConfigToLabelTypeMappingList(FileConfigToLabelTypeMappingCQ sq);

    public void xsderiveFileConfigToRoleTypeMappingList(String fn, SubQuery<FileConfigToRoleTypeMappingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FileConfigToRoleTypeMappingCB cb = new FileConfigToRoleTypeMappingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepId_SpecifyDerivedReferrer_FileConfigToRoleTypeMappingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ID", "FILE_CONFIG_ID", pp, "fileConfigToRoleTypeMappingList", al, op);
    }
    public abstract String keepId_SpecifyDerivedReferrer_FileConfigToRoleTypeMappingList(FileConfigToRoleTypeMappingCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from FILE_AUTHENTICATION where ...)} <br>
     * FILE_AUTHENTICATION by FILE_CRAWLING_CONFIG_ID, named 'fileAuthenticationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedFileAuthentication()</span>.<span style="color: #CC4747">max</span>(authenticationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     authenticationCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     authenticationCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<FileAuthenticationCB> derivedFileAuthentication() {
        return xcreateQDRFunctionFileAuthenticationList();
    }
    protected HpQDRFunction<FileAuthenticationCB> xcreateQDRFunctionFileAuthenticationList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveFileAuthenticationList(fn, sq, rd, vl, op));
    }
    public void xqderiveFileAuthenticationList(String fn, SubQuery<FileAuthenticationCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FileAuthenticationCB cb = new FileAuthenticationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepId_QueryDerivedReferrer_FileAuthenticationList(cb.query()); String prpp = keepId_QueryDerivedReferrer_FileAuthenticationListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ID", "FILE_CRAWLING_CONFIG_ID", sqpp, "fileAuthenticationList", rd, vl, prpp, op);
    }
    public abstract String keepId_QueryDerivedReferrer_FileAuthenticationList(FileAuthenticationCQ sq);
    public abstract String keepId_QueryDerivedReferrer_FileAuthenticationListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from FILE_CONFIG_TO_LABEL_TYPE_MAPPING where ...)} <br>
     * FILE_CONFIG_TO_LABEL_TYPE_MAPPING by FILE_CONFIG_ID, named 'fileConfigToLabelTypeMappingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedFileConfigToLabelTypeMapping()</span>.<span style="color: #CC4747">max</span>(mappingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mappingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     mappingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<FileConfigToLabelTypeMappingCB> derivedFileConfigToLabelTypeMapping() {
        return xcreateQDRFunctionFileConfigToLabelTypeMappingList();
    }
    protected HpQDRFunction<FileConfigToLabelTypeMappingCB> xcreateQDRFunctionFileConfigToLabelTypeMappingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveFileConfigToLabelTypeMappingList(fn, sq, rd, vl, op));
    }
    public void xqderiveFileConfigToLabelTypeMappingList(String fn, SubQuery<FileConfigToLabelTypeMappingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FileConfigToLabelTypeMappingCB cb = new FileConfigToLabelTypeMappingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepId_QueryDerivedReferrer_FileConfigToLabelTypeMappingList(cb.query()); String prpp = keepId_QueryDerivedReferrer_FileConfigToLabelTypeMappingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ID", "FILE_CONFIG_ID", sqpp, "fileConfigToLabelTypeMappingList", rd, vl, prpp, op);
    }
    public abstract String keepId_QueryDerivedReferrer_FileConfigToLabelTypeMappingList(FileConfigToLabelTypeMappingCQ sq);
    public abstract String keepId_QueryDerivedReferrer_FileConfigToLabelTypeMappingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from FILE_CONFIG_TO_ROLE_TYPE_MAPPING where ...)} <br>
     * FILE_CONFIG_TO_ROLE_TYPE_MAPPING by FILE_CONFIG_ID, named 'fileConfigToRoleTypeMappingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedFileConfigToRoleTypeMapping()</span>.<span style="color: #CC4747">max</span>(mappingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mappingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     mappingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<FileConfigToRoleTypeMappingCB> derivedFileConfigToRoleTypeMapping() {
        return xcreateQDRFunctionFileConfigToRoleTypeMappingList();
    }
    protected HpQDRFunction<FileConfigToRoleTypeMappingCB> xcreateQDRFunctionFileConfigToRoleTypeMappingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveFileConfigToRoleTypeMappingList(fn, sq, rd, vl, op));
    }
    public void xqderiveFileConfigToRoleTypeMappingList(String fn, SubQuery<FileConfigToRoleTypeMappingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FileConfigToRoleTypeMappingCB cb = new FileConfigToRoleTypeMappingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepId_QueryDerivedReferrer_FileConfigToRoleTypeMappingList(cb.query()); String prpp = keepId_QueryDerivedReferrer_FileConfigToRoleTypeMappingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ID", "FILE_CONFIG_ID", sqpp, "fileConfigToRoleTypeMappingList", rd, vl, prpp, op);
    }
    public abstract String keepId_QueryDerivedReferrer_FileConfigToRoleTypeMappingList(FileConfigToRoleTypeMappingCQ sq);
    public abstract String keepId_QueryDerivedReferrer_FileConfigToRoleTypeMappingListParameter(Object vl);

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
     * PATHS: {NotNull, TEXT(65535)}
     * @param paths The value of paths as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPaths_Equal(String paths) {
        doSetPaths_Equal(fRES(paths));
    }

    protected void doSetPaths_Equal(String paths) {
        regPaths(CK_EQ, paths);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PATHS: {NotNull, TEXT(65535)}
     * @param paths The value of paths as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPaths_NotEqual(String paths) {
        doSetPaths_NotEqual(fRES(paths));
    }

    protected void doSetPaths_NotEqual(String paths) {
        regPaths(CK_NES, paths);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PATHS: {NotNull, TEXT(65535)}
     * @param paths The value of paths as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setPaths_GreaterThan(String paths) {
        regPaths(CK_GT, fRES(paths));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PATHS: {NotNull, TEXT(65535)}
     * @param paths The value of paths as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setPaths_LessThan(String paths) {
        regPaths(CK_LT, fRES(paths));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PATHS: {NotNull, TEXT(65535)}
     * @param paths The value of paths as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPaths_GreaterEqual(String paths) {
        regPaths(CK_GE, fRES(paths));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PATHS: {NotNull, TEXT(65535)}
     * @param paths The value of paths as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPaths_LessEqual(String paths) {
        regPaths(CK_LE, fRES(paths));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PATHS: {NotNull, TEXT(65535)}
     * @param pathsList The collection of paths as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPaths_InScope(Collection<String> pathsList) {
        doSetPaths_InScope(pathsList);
    }

    protected void doSetPaths_InScope(Collection<String> pathsList) {
        regINS(CK_INS, cTL(pathsList), xgetCValuePaths(), "PATHS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PATHS: {NotNull, TEXT(65535)}
     * @param pathsList The collection of paths as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPaths_NotInScope(Collection<String> pathsList) {
        doSetPaths_NotInScope(pathsList);
    }

    protected void doSetPaths_NotInScope(Collection<String> pathsList) {
        regINS(CK_NINS, cTL(pathsList), xgetCValuePaths(), "PATHS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PATHS: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setPaths_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param paths The value of paths as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPaths_LikeSearch(String paths, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPaths_LikeSearch(paths, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PATHS: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setPaths_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param paths The value of paths as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPaths_LikeSearch(String paths, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(paths), xgetCValuePaths(), "PATHS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PATHS: {NotNull, TEXT(65535)}
     * @param paths The value of paths as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPaths_NotLikeSearch(String paths, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPaths_NotLikeSearch(paths, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PATHS: {NotNull, TEXT(65535)}
     * @param paths The value of paths as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPaths_NotLikeSearch(String paths, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(paths), xgetCValuePaths(), "PATHS", likeSearchOption);
    }

    protected void regPaths(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePaths(), "PATHS"); }
    protected abstract ConditionValue xgetCValuePaths();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INCLUDED_PATHS: {TEXT(65535)}
     * @param includedPaths The value of includedPaths as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedPaths_Equal(String includedPaths) {
        doSetIncludedPaths_Equal(fRES(includedPaths));
    }

    protected void doSetIncludedPaths_Equal(String includedPaths) {
        regIncludedPaths(CK_EQ, includedPaths);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INCLUDED_PATHS: {TEXT(65535)}
     * @param includedPaths The value of includedPaths as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedPaths_NotEqual(String includedPaths) {
        doSetIncludedPaths_NotEqual(fRES(includedPaths));
    }

    protected void doSetIncludedPaths_NotEqual(String includedPaths) {
        regIncludedPaths(CK_NES, includedPaths);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INCLUDED_PATHS: {TEXT(65535)}
     * @param includedPaths The value of includedPaths as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedPaths_GreaterThan(String includedPaths) {
        regIncludedPaths(CK_GT, fRES(includedPaths));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INCLUDED_PATHS: {TEXT(65535)}
     * @param includedPaths The value of includedPaths as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedPaths_LessThan(String includedPaths) {
        regIncludedPaths(CK_LT, fRES(includedPaths));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INCLUDED_PATHS: {TEXT(65535)}
     * @param includedPaths The value of includedPaths as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedPaths_GreaterEqual(String includedPaths) {
        regIncludedPaths(CK_GE, fRES(includedPaths));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INCLUDED_PATHS: {TEXT(65535)}
     * @param includedPaths The value of includedPaths as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedPaths_LessEqual(String includedPaths) {
        regIncludedPaths(CK_LE, fRES(includedPaths));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INCLUDED_PATHS: {TEXT(65535)}
     * @param includedPathsList The collection of includedPaths as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedPaths_InScope(Collection<String> includedPathsList) {
        doSetIncludedPaths_InScope(includedPathsList);
    }

    protected void doSetIncludedPaths_InScope(Collection<String> includedPathsList) {
        regINS(CK_INS, cTL(includedPathsList), xgetCValueIncludedPaths(), "INCLUDED_PATHS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INCLUDED_PATHS: {TEXT(65535)}
     * @param includedPathsList The collection of includedPaths as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedPaths_NotInScope(Collection<String> includedPathsList) {
        doSetIncludedPaths_NotInScope(includedPathsList);
    }

    protected void doSetIncludedPaths_NotInScope(Collection<String> includedPathsList) {
        regINS(CK_NINS, cTL(includedPathsList), xgetCValueIncludedPaths(), "INCLUDED_PATHS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INCLUDED_PATHS: {TEXT(65535)} <br>
     * <pre>e.g. setIncludedPaths_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param includedPaths The value of includedPaths as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setIncludedPaths_LikeSearch(String includedPaths, ConditionOptionCall<LikeSearchOption> opLambda) {
        setIncludedPaths_LikeSearch(includedPaths, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INCLUDED_PATHS: {TEXT(65535)} <br>
     * <pre>e.g. setIncludedPaths_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param includedPaths The value of includedPaths as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setIncludedPaths_LikeSearch(String includedPaths, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(includedPaths), xgetCValueIncludedPaths(), "INCLUDED_PATHS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INCLUDED_PATHS: {TEXT(65535)}
     * @param includedPaths The value of includedPaths as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setIncludedPaths_NotLikeSearch(String includedPaths, ConditionOptionCall<LikeSearchOption> opLambda) {
        setIncludedPaths_NotLikeSearch(includedPaths, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INCLUDED_PATHS: {TEXT(65535)}
     * @param includedPaths The value of includedPaths as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setIncludedPaths_NotLikeSearch(String includedPaths, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(includedPaths), xgetCValueIncludedPaths(), "INCLUDED_PATHS", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INCLUDED_PATHS: {TEXT(65535)}
     */
    public void setIncludedPaths_IsNull() { regIncludedPaths(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INCLUDED_PATHS: {TEXT(65535)}
     */
    public void setIncludedPaths_IsNullOrEmpty() { regIncludedPaths(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INCLUDED_PATHS: {TEXT(65535)}
     */
    public void setIncludedPaths_IsNotNull() { regIncludedPaths(CK_ISNN, DOBJ); }

    protected void regIncludedPaths(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIncludedPaths(), "INCLUDED_PATHS"); }
    protected abstract ConditionValue xgetCValueIncludedPaths();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCLUDED_PATHS: {TEXT(65535)}
     * @param excludedPaths The value of excludedPaths as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedPaths_Equal(String excludedPaths) {
        doSetExcludedPaths_Equal(fRES(excludedPaths));
    }

    protected void doSetExcludedPaths_Equal(String excludedPaths) {
        regExcludedPaths(CK_EQ, excludedPaths);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCLUDED_PATHS: {TEXT(65535)}
     * @param excludedPaths The value of excludedPaths as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedPaths_NotEqual(String excludedPaths) {
        doSetExcludedPaths_NotEqual(fRES(excludedPaths));
    }

    protected void doSetExcludedPaths_NotEqual(String excludedPaths) {
        regExcludedPaths(CK_NES, excludedPaths);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCLUDED_PATHS: {TEXT(65535)}
     * @param excludedPaths The value of excludedPaths as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedPaths_GreaterThan(String excludedPaths) {
        regExcludedPaths(CK_GT, fRES(excludedPaths));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCLUDED_PATHS: {TEXT(65535)}
     * @param excludedPaths The value of excludedPaths as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedPaths_LessThan(String excludedPaths) {
        regExcludedPaths(CK_LT, fRES(excludedPaths));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCLUDED_PATHS: {TEXT(65535)}
     * @param excludedPaths The value of excludedPaths as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedPaths_GreaterEqual(String excludedPaths) {
        regExcludedPaths(CK_GE, fRES(excludedPaths));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCLUDED_PATHS: {TEXT(65535)}
     * @param excludedPaths The value of excludedPaths as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedPaths_LessEqual(String excludedPaths) {
        regExcludedPaths(CK_LE, fRES(excludedPaths));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXCLUDED_PATHS: {TEXT(65535)}
     * @param excludedPathsList The collection of excludedPaths as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedPaths_InScope(Collection<String> excludedPathsList) {
        doSetExcludedPaths_InScope(excludedPathsList);
    }

    protected void doSetExcludedPaths_InScope(Collection<String> excludedPathsList) {
        regINS(CK_INS, cTL(excludedPathsList), xgetCValueExcludedPaths(), "EXCLUDED_PATHS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXCLUDED_PATHS: {TEXT(65535)}
     * @param excludedPathsList The collection of excludedPaths as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedPaths_NotInScope(Collection<String> excludedPathsList) {
        doSetExcludedPaths_NotInScope(excludedPathsList);
    }

    protected void doSetExcludedPaths_NotInScope(Collection<String> excludedPathsList) {
        regINS(CK_NINS, cTL(excludedPathsList), xgetCValueExcludedPaths(), "EXCLUDED_PATHS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXCLUDED_PATHS: {TEXT(65535)} <br>
     * <pre>e.g. setExcludedPaths_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param excludedPaths The value of excludedPaths as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setExcludedPaths_LikeSearch(String excludedPaths, ConditionOptionCall<LikeSearchOption> opLambda) {
        setExcludedPaths_LikeSearch(excludedPaths, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXCLUDED_PATHS: {TEXT(65535)} <br>
     * <pre>e.g. setExcludedPaths_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param excludedPaths The value of excludedPaths as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setExcludedPaths_LikeSearch(String excludedPaths, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(excludedPaths), xgetCValueExcludedPaths(), "EXCLUDED_PATHS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXCLUDED_PATHS: {TEXT(65535)}
     * @param excludedPaths The value of excludedPaths as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setExcludedPaths_NotLikeSearch(String excludedPaths, ConditionOptionCall<LikeSearchOption> opLambda) {
        setExcludedPaths_NotLikeSearch(excludedPaths, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXCLUDED_PATHS: {TEXT(65535)}
     * @param excludedPaths The value of excludedPaths as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setExcludedPaths_NotLikeSearch(String excludedPaths, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(excludedPaths), xgetCValueExcludedPaths(), "EXCLUDED_PATHS", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXCLUDED_PATHS: {TEXT(65535)}
     */
    public void setExcludedPaths_IsNull() { regExcludedPaths(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXCLUDED_PATHS: {TEXT(65535)}
     */
    public void setExcludedPaths_IsNullOrEmpty() { regExcludedPaths(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXCLUDED_PATHS: {TEXT(65535)}
     */
    public void setExcludedPaths_IsNotNull() { regExcludedPaths(CK_ISNN, DOBJ); }

    protected void regExcludedPaths(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExcludedPaths(), "EXCLUDED_PATHS"); }
    protected abstract ConditionValue xgetCValueExcludedPaths();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INCLUDED_DOC_PATHS: {TEXT(65535)}
     * @param includedDocPaths The value of includedDocPaths as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedDocPaths_Equal(String includedDocPaths) {
        doSetIncludedDocPaths_Equal(fRES(includedDocPaths));
    }

    protected void doSetIncludedDocPaths_Equal(String includedDocPaths) {
        regIncludedDocPaths(CK_EQ, includedDocPaths);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INCLUDED_DOC_PATHS: {TEXT(65535)}
     * @param includedDocPaths The value of includedDocPaths as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedDocPaths_NotEqual(String includedDocPaths) {
        doSetIncludedDocPaths_NotEqual(fRES(includedDocPaths));
    }

    protected void doSetIncludedDocPaths_NotEqual(String includedDocPaths) {
        regIncludedDocPaths(CK_NES, includedDocPaths);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INCLUDED_DOC_PATHS: {TEXT(65535)}
     * @param includedDocPaths The value of includedDocPaths as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedDocPaths_GreaterThan(String includedDocPaths) {
        regIncludedDocPaths(CK_GT, fRES(includedDocPaths));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INCLUDED_DOC_PATHS: {TEXT(65535)}
     * @param includedDocPaths The value of includedDocPaths as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedDocPaths_LessThan(String includedDocPaths) {
        regIncludedDocPaths(CK_LT, fRES(includedDocPaths));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INCLUDED_DOC_PATHS: {TEXT(65535)}
     * @param includedDocPaths The value of includedDocPaths as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedDocPaths_GreaterEqual(String includedDocPaths) {
        regIncludedDocPaths(CK_GE, fRES(includedDocPaths));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INCLUDED_DOC_PATHS: {TEXT(65535)}
     * @param includedDocPaths The value of includedDocPaths as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedDocPaths_LessEqual(String includedDocPaths) {
        regIncludedDocPaths(CK_LE, fRES(includedDocPaths));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INCLUDED_DOC_PATHS: {TEXT(65535)}
     * @param includedDocPathsList The collection of includedDocPaths as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedDocPaths_InScope(Collection<String> includedDocPathsList) {
        doSetIncludedDocPaths_InScope(includedDocPathsList);
    }

    protected void doSetIncludedDocPaths_InScope(Collection<String> includedDocPathsList) {
        regINS(CK_INS, cTL(includedDocPathsList), xgetCValueIncludedDocPaths(), "INCLUDED_DOC_PATHS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INCLUDED_DOC_PATHS: {TEXT(65535)}
     * @param includedDocPathsList The collection of includedDocPaths as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setIncludedDocPaths_NotInScope(Collection<String> includedDocPathsList) {
        doSetIncludedDocPaths_NotInScope(includedDocPathsList);
    }

    protected void doSetIncludedDocPaths_NotInScope(Collection<String> includedDocPathsList) {
        regINS(CK_NINS, cTL(includedDocPathsList), xgetCValueIncludedDocPaths(), "INCLUDED_DOC_PATHS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INCLUDED_DOC_PATHS: {TEXT(65535)} <br>
     * <pre>e.g. setIncludedDocPaths_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param includedDocPaths The value of includedDocPaths as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setIncludedDocPaths_LikeSearch(String includedDocPaths, ConditionOptionCall<LikeSearchOption> opLambda) {
        setIncludedDocPaths_LikeSearch(includedDocPaths, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INCLUDED_DOC_PATHS: {TEXT(65535)} <br>
     * <pre>e.g. setIncludedDocPaths_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param includedDocPaths The value of includedDocPaths as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setIncludedDocPaths_LikeSearch(String includedDocPaths, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(includedDocPaths), xgetCValueIncludedDocPaths(), "INCLUDED_DOC_PATHS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INCLUDED_DOC_PATHS: {TEXT(65535)}
     * @param includedDocPaths The value of includedDocPaths as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setIncludedDocPaths_NotLikeSearch(String includedDocPaths, ConditionOptionCall<LikeSearchOption> opLambda) {
        setIncludedDocPaths_NotLikeSearch(includedDocPaths, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INCLUDED_DOC_PATHS: {TEXT(65535)}
     * @param includedDocPaths The value of includedDocPaths as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setIncludedDocPaths_NotLikeSearch(String includedDocPaths, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(includedDocPaths), xgetCValueIncludedDocPaths(), "INCLUDED_DOC_PATHS", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INCLUDED_DOC_PATHS: {TEXT(65535)}
     */
    public void setIncludedDocPaths_IsNull() { regIncludedDocPaths(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INCLUDED_DOC_PATHS: {TEXT(65535)}
     */
    public void setIncludedDocPaths_IsNullOrEmpty() { regIncludedDocPaths(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INCLUDED_DOC_PATHS: {TEXT(65535)}
     */
    public void setIncludedDocPaths_IsNotNull() { regIncludedDocPaths(CK_ISNN, DOBJ); }

    protected void regIncludedDocPaths(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIncludedDocPaths(), "INCLUDED_DOC_PATHS"); }
    protected abstract ConditionValue xgetCValueIncludedDocPaths();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCLUDED_DOC_PATHS: {TEXT(65535)}
     * @param excludedDocPaths The value of excludedDocPaths as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedDocPaths_Equal(String excludedDocPaths) {
        doSetExcludedDocPaths_Equal(fRES(excludedDocPaths));
    }

    protected void doSetExcludedDocPaths_Equal(String excludedDocPaths) {
        regExcludedDocPaths(CK_EQ, excludedDocPaths);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCLUDED_DOC_PATHS: {TEXT(65535)}
     * @param excludedDocPaths The value of excludedDocPaths as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedDocPaths_NotEqual(String excludedDocPaths) {
        doSetExcludedDocPaths_NotEqual(fRES(excludedDocPaths));
    }

    protected void doSetExcludedDocPaths_NotEqual(String excludedDocPaths) {
        regExcludedDocPaths(CK_NES, excludedDocPaths);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCLUDED_DOC_PATHS: {TEXT(65535)}
     * @param excludedDocPaths The value of excludedDocPaths as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedDocPaths_GreaterThan(String excludedDocPaths) {
        regExcludedDocPaths(CK_GT, fRES(excludedDocPaths));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCLUDED_DOC_PATHS: {TEXT(65535)}
     * @param excludedDocPaths The value of excludedDocPaths as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedDocPaths_LessThan(String excludedDocPaths) {
        regExcludedDocPaths(CK_LT, fRES(excludedDocPaths));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCLUDED_DOC_PATHS: {TEXT(65535)}
     * @param excludedDocPaths The value of excludedDocPaths as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedDocPaths_GreaterEqual(String excludedDocPaths) {
        regExcludedDocPaths(CK_GE, fRES(excludedDocPaths));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCLUDED_DOC_PATHS: {TEXT(65535)}
     * @param excludedDocPaths The value of excludedDocPaths as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedDocPaths_LessEqual(String excludedDocPaths) {
        regExcludedDocPaths(CK_LE, fRES(excludedDocPaths));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXCLUDED_DOC_PATHS: {TEXT(65535)}
     * @param excludedDocPathsList The collection of excludedDocPaths as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedDocPaths_InScope(Collection<String> excludedDocPathsList) {
        doSetExcludedDocPaths_InScope(excludedDocPathsList);
    }

    protected void doSetExcludedDocPaths_InScope(Collection<String> excludedDocPathsList) {
        regINS(CK_INS, cTL(excludedDocPathsList), xgetCValueExcludedDocPaths(), "EXCLUDED_DOC_PATHS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXCLUDED_DOC_PATHS: {TEXT(65535)}
     * @param excludedDocPathsList The collection of excludedDocPaths as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setExcludedDocPaths_NotInScope(Collection<String> excludedDocPathsList) {
        doSetExcludedDocPaths_NotInScope(excludedDocPathsList);
    }

    protected void doSetExcludedDocPaths_NotInScope(Collection<String> excludedDocPathsList) {
        regINS(CK_NINS, cTL(excludedDocPathsList), xgetCValueExcludedDocPaths(), "EXCLUDED_DOC_PATHS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXCLUDED_DOC_PATHS: {TEXT(65535)} <br>
     * <pre>e.g. setExcludedDocPaths_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param excludedDocPaths The value of excludedDocPaths as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setExcludedDocPaths_LikeSearch(String excludedDocPaths, ConditionOptionCall<LikeSearchOption> opLambda) {
        setExcludedDocPaths_LikeSearch(excludedDocPaths, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXCLUDED_DOC_PATHS: {TEXT(65535)} <br>
     * <pre>e.g. setExcludedDocPaths_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param excludedDocPaths The value of excludedDocPaths as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setExcludedDocPaths_LikeSearch(String excludedDocPaths, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(excludedDocPaths), xgetCValueExcludedDocPaths(), "EXCLUDED_DOC_PATHS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXCLUDED_DOC_PATHS: {TEXT(65535)}
     * @param excludedDocPaths The value of excludedDocPaths as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setExcludedDocPaths_NotLikeSearch(String excludedDocPaths, ConditionOptionCall<LikeSearchOption> opLambda) {
        setExcludedDocPaths_NotLikeSearch(excludedDocPaths, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXCLUDED_DOC_PATHS: {TEXT(65535)}
     * @param excludedDocPaths The value of excludedDocPaths as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setExcludedDocPaths_NotLikeSearch(String excludedDocPaths, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(excludedDocPaths), xgetCValueExcludedDocPaths(), "EXCLUDED_DOC_PATHS", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXCLUDED_DOC_PATHS: {TEXT(65535)}
     */
    public void setExcludedDocPaths_IsNull() { regExcludedDocPaths(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXCLUDED_DOC_PATHS: {TEXT(65535)}
     */
    public void setExcludedDocPaths_IsNullOrEmpty() { regExcludedDocPaths(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXCLUDED_DOC_PATHS: {TEXT(65535)}
     */
    public void setExcludedDocPaths_IsNotNull() { regExcludedDocPaths(CK_ISNN, DOBJ); }

    protected void regExcludedDocPaths(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExcludedDocPaths(), "EXCLUDED_DOC_PATHS"); }
    protected abstract ConditionValue xgetCValueExcludedDocPaths();

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
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;FileCrawlingConfigCB&gt;() {
     *     public void query(FileCrawlingConfigCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<FileCrawlingConfigCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, FileCrawlingConfigCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;FileCrawlingConfigCB&gt;() {
     *     public void query(FileCrawlingConfigCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<FileCrawlingConfigCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, FileCrawlingConfigCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;FileCrawlingConfigCB&gt;() {
     *     public void query(FileCrawlingConfigCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<FileCrawlingConfigCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, FileCrawlingConfigCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;FileCrawlingConfigCB&gt;() {
     *     public void query(FileCrawlingConfigCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<FileCrawlingConfigCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, FileCrawlingConfigCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;FileCrawlingConfigCB&gt;() {
     *     public void query(FileCrawlingConfigCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<FileCrawlingConfigCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, FileCrawlingConfigCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;FileCrawlingConfigCB&gt;() {
     *     public void query(FileCrawlingConfigCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<FileCrawlingConfigCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, FileCrawlingConfigCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        FileCrawlingConfigCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(FileCrawlingConfigCQ sq);

    protected FileCrawlingConfigCB xcreateScalarConditionCB() {
        FileCrawlingConfigCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected FileCrawlingConfigCB xcreateScalarConditionPartitionByCB() {
        FileCrawlingConfigCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<FileCrawlingConfigCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FileCrawlingConfigCB cb = new FileCrawlingConfigCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(FileCrawlingConfigCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<FileCrawlingConfigCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(FileCrawlingConfigCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FileCrawlingConfigCB cb = new FileCrawlingConfigCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(FileCrawlingConfigCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<FileCrawlingConfigCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        FileCrawlingConfigCB cb = new FileCrawlingConfigCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(FileCrawlingConfigCQ sq);

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
    protected FileCrawlingConfigCB newMyCB() {
        return new FileCrawlingConfigCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return FileCrawlingConfigCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
