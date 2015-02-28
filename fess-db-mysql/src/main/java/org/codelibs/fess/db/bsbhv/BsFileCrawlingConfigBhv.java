package org.codelibs.fess.db.bsbhv;

import java.util.List;

import org.dbflute.*;
import org.dbflute.bhv.*;
import org.dbflute.bhv.readable.*;
import org.dbflute.bhv.writable.*;
import org.dbflute.bhv.referrer.*;
import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.HpSLSFunction;
import org.dbflute.cbean.result.*;
import org.dbflute.exception.*;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.outsidesql.executor.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.bsbhv.loader.*;
import org.codelibs.fess.db.exentity.*;
import org.codelibs.fess.db.bsentity.dbmeta.*;
import org.codelibs.fess.db.cbean.*;

/**
 * The behavior of FILE_CRAWLING_CONFIG as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, NAME, PATHS, INCLUDED_PATHS, EXCLUDED_PATHS, INCLUDED_DOC_PATHS, EXCLUDED_DOC_PATHS, CONFIG_PARAMETER, DEPTH, MAX_ACCESS_COUNT, NUM_OF_THREAD, INTERVAL_TIME, BOOST, AVAILABLE, SORT_ORDER, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME, DELETED_BY, DELETED_TIME, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     FILE_AUTHENTICATION, FILE_CONFIG_TO_LABEL_TYPE_MAPPING, FILE_CONFIG_TO_ROLE_TYPE_MAPPING
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     fileAuthenticationList, fileConfigToLabelTypeMappingList, fileConfigToRoleTypeMappingList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsFileCrawlingConfigBhv extends AbstractBehaviorWritable<FileCrawlingConfig, FileCrawlingConfigCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public FileCrawlingConfigDbm asDBMeta() { return FileCrawlingConfigDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "FILE_CRAWLING_CONFIG"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public FileCrawlingConfigCB newConditionBean() { return new FileCrawlingConfigCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of FileCrawlingConfig. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<FileCrawlingConfigCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, isPresent() and orElse(), ...</span>
     * <pre>
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">fileCrawlingConfig</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">fileCrawlingConfig</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">fileCrawlingConfig</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">fileCrawlingConfig</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of FileCrawlingConfig. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<FileCrawlingConfig> selectEntity(CBCall<FileCrawlingConfigCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<FileCrawlingConfig> facadeSelectEntity(FileCrawlingConfigCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends FileCrawlingConfig> OptionalEntity<ENTITY> doSelectOptionalEntity(FileCrawlingConfigCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * FileCrawlingConfig <span style="color: #553000">fileCrawlingConfig</span> = <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">fileCrawlingConfig</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of FileCrawlingConfig. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public FileCrawlingConfig selectEntityWithDeletedCheck(CBCall<FileCrawlingConfigCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param id : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<FileCrawlingConfig> selectByPK(Long id) {
        return facadeSelectByPK(id);
    }

    protected OptionalEntity<FileCrawlingConfig> facadeSelectByPK(Long id) {
        return doSelectOptionalByPK(id, typeOfSelectedEntity());
    }

    protected <ENTITY extends FileCrawlingConfig> ENTITY doSelectByPK(Long id, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(id), tp);
    }

    protected <ENTITY extends FileCrawlingConfig> OptionalEntity<ENTITY> doSelectOptionalByPK(Long id, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(id, tp), id);
    }

    protected FileCrawlingConfigCB xprepareCBAsPK(Long id) {
        assertObjectNotNull("id", id);
        return newConditionBean().acceptPK(id);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;FileCrawlingConfig&gt; <span style="color: #553000">fileCrawlingConfigList</span> = <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (FileCrawlingConfig <span style="color: #553000">fileCrawlingConfig</span> : <span style="color: #553000">fileCrawlingConfigList</span>) {
     *     ... = <span style="color: #553000">fileCrawlingConfig</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of FileCrawlingConfig. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<FileCrawlingConfig> selectList(CBCall<FileCrawlingConfigCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    @Override
    protected boolean isEntityDerivedMappable() { return true; }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PagingResultBean&lt;FileCrawlingConfig&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (FileCrawlingConfig fileCrawlingConfig : <span style="color: #553000">page</span>) {
     *     ... = fileCrawlingConfig.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of FileCrawlingConfig. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<FileCrawlingConfig> selectPage(CBCall<FileCrawlingConfigCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of FileCrawlingConfig. (NotNull)
     * @param entityLambda The handler of entity row of FileCrawlingConfig. (NotNull)
     */
    public void selectCursor(CBCall<FileCrawlingConfigCB> cbLambda, EntityRowHandler<FileCrawlingConfig> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<FileCrawlingConfigCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + asTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer for the list by the referrer loader.
     * <pre>
     * List&lt;Member&gt; <span style="color: #553000">memberList</span> = <span style="color: #0000C0">memberBhv</span>.selectList(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * memberBhv.<span style="color: #CC4747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * <span style="color: #70226C">for</span> (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param fileCrawlingConfigList The entity list of fileCrawlingConfig. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<FileCrawlingConfig> fileCrawlingConfigList, ReferrerLoaderHandler<LoaderOfFileCrawlingConfig> loaderLambda) {
        xassLRArg(fileCrawlingConfigList, loaderLambda);
        loaderLambda.handle(new LoaderOfFileCrawlingConfig().ready(fileCrawlingConfigList, _behaviorSelector));
    }

    /**
     * Load referrer for the entity by the referrer loader.
     * <pre>
     * Member <span style="color: #553000">member</span> = <span style="color: #0000C0">memberBhv</span>.selectEntityWithDeletedCheck(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> <span style="color: #553000">cb</span>.acceptPK(1));
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">load</span>(<span style="color: #553000">member</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * List&lt;Purchase&gt; purchaseList = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *     ...
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param fileCrawlingConfig The entity of fileCrawlingConfig. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(FileCrawlingConfig fileCrawlingConfig, ReferrerLoaderHandler<LoaderOfFileCrawlingConfig> loaderLambda) {
        xassLRArg(fileCrawlingConfig, loaderLambda);
        loaderLambda.handle(new LoaderOfFileCrawlingConfig().ready(xnewLRAryLs(fileCrawlingConfig), _behaviorSelector));
    }

    /**
     * Load referrer of fileAuthenticationList by the set-upper of referrer. <br>
     * FILE_AUTHENTICATION by FILE_CRAWLING_CONFIG_ID, named 'fileAuthenticationList'.
     * <pre>
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">loadFileAuthentication</span>(<span style="color: #553000">fileCrawlingConfigList</span>, <span style="color: #553000">authenticationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">authenticationCB</span>.setupSelect...
     *     <span style="color: #553000">authenticationCB</span>.query().set...
     *     <span style="color: #553000">authenticationCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (FileCrawlingConfig fileCrawlingConfig : <span style="color: #553000">fileCrawlingConfigList</span>) {
     *     ... = fileCrawlingConfig.<span style="color: #CC4747">getFileAuthenticationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFileCrawlingConfigId_InScope(pkList);
     * cb.query().addOrderBy_FileCrawlingConfigId_Asc();
     * </pre>
     * @param fileCrawlingConfigList The entity list of fileCrawlingConfig. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<FileAuthentication> loadFileAuthentication(List<FileCrawlingConfig> fileCrawlingConfigList, ReferrerConditionSetupper<FileAuthenticationCB> refCBLambda) {
        xassLRArg(fileCrawlingConfigList, refCBLambda);
        return doLoadFileAuthentication(fileCrawlingConfigList, new LoadReferrerOption<FileAuthenticationCB, FileAuthentication>().xinit(refCBLambda));
    }

    /**
     * Load referrer of fileAuthenticationList by the set-upper of referrer. <br>
     * FILE_AUTHENTICATION by FILE_CRAWLING_CONFIG_ID, named 'fileAuthenticationList'.
     * <pre>
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">loadFileAuthentication</span>(<span style="color: #553000">fileCrawlingConfig</span>, <span style="color: #553000">authenticationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">authenticationCB</span>.setupSelect...
     *     <span style="color: #553000">authenticationCB</span>.query().set...
     *     <span style="color: #553000">authenticationCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">fileCrawlingConfig</span>.<span style="color: #CC4747">getFileAuthenticationList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFileCrawlingConfigId_InScope(pkList);
     * cb.query().addOrderBy_FileCrawlingConfigId_Asc();
     * </pre>
     * @param fileCrawlingConfig The entity of fileCrawlingConfig. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<FileAuthentication> loadFileAuthentication(FileCrawlingConfig fileCrawlingConfig, ReferrerConditionSetupper<FileAuthenticationCB> refCBLambda) {
        xassLRArg(fileCrawlingConfig, refCBLambda);
        return doLoadFileAuthentication(xnewLRLs(fileCrawlingConfig), new LoadReferrerOption<FileAuthenticationCB, FileAuthentication>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<FileAuthentication> doLoadFileAuthentication(List<FileCrawlingConfig> fileCrawlingConfigList, LoadReferrerOption<FileAuthenticationCB, FileAuthentication> option) {
        return helpLoadReferrerInternally(fileCrawlingConfigList, option, "fileAuthenticationList");
    }

    /**
     * Load referrer of fileConfigToLabelTypeMappingList by the set-upper of referrer. <br>
     * FILE_CONFIG_TO_LABEL_TYPE_MAPPING by FILE_CONFIG_ID, named 'fileConfigToLabelTypeMappingList'.
     * <pre>
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">loadFileConfigToLabelTypeMapping</span>(<span style="color: #553000">fileCrawlingConfigList</span>, <span style="color: #553000">mappingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">mappingCB</span>.setupSelect...
     *     <span style="color: #553000">mappingCB</span>.query().set...
     *     <span style="color: #553000">mappingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (FileCrawlingConfig fileCrawlingConfig : <span style="color: #553000">fileCrawlingConfigList</span>) {
     *     ... = fileCrawlingConfig.<span style="color: #CC4747">getFileConfigToLabelTypeMappingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFileConfigId_InScope(pkList);
     * cb.query().addOrderBy_FileConfigId_Asc();
     * </pre>
     * @param fileCrawlingConfigList The entity list of fileCrawlingConfig. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<FileConfigToLabelTypeMapping> loadFileConfigToLabelTypeMapping(List<FileCrawlingConfig> fileCrawlingConfigList, ReferrerConditionSetupper<FileConfigToLabelTypeMappingCB> refCBLambda) {
        xassLRArg(fileCrawlingConfigList, refCBLambda);
        return doLoadFileConfigToLabelTypeMapping(fileCrawlingConfigList, new LoadReferrerOption<FileConfigToLabelTypeMappingCB, FileConfigToLabelTypeMapping>().xinit(refCBLambda));
    }

    /**
     * Load referrer of fileConfigToLabelTypeMappingList by the set-upper of referrer. <br>
     * FILE_CONFIG_TO_LABEL_TYPE_MAPPING by FILE_CONFIG_ID, named 'fileConfigToLabelTypeMappingList'.
     * <pre>
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">loadFileConfigToLabelTypeMapping</span>(<span style="color: #553000">fileCrawlingConfig</span>, <span style="color: #553000">mappingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">mappingCB</span>.setupSelect...
     *     <span style="color: #553000">mappingCB</span>.query().set...
     *     <span style="color: #553000">mappingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">fileCrawlingConfig</span>.<span style="color: #CC4747">getFileConfigToLabelTypeMappingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFileConfigId_InScope(pkList);
     * cb.query().addOrderBy_FileConfigId_Asc();
     * </pre>
     * @param fileCrawlingConfig The entity of fileCrawlingConfig. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<FileConfigToLabelTypeMapping> loadFileConfigToLabelTypeMapping(FileCrawlingConfig fileCrawlingConfig, ReferrerConditionSetupper<FileConfigToLabelTypeMappingCB> refCBLambda) {
        xassLRArg(fileCrawlingConfig, refCBLambda);
        return doLoadFileConfigToLabelTypeMapping(xnewLRLs(fileCrawlingConfig), new LoadReferrerOption<FileConfigToLabelTypeMappingCB, FileConfigToLabelTypeMapping>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<FileConfigToLabelTypeMapping> doLoadFileConfigToLabelTypeMapping(List<FileCrawlingConfig> fileCrawlingConfigList, LoadReferrerOption<FileConfigToLabelTypeMappingCB, FileConfigToLabelTypeMapping> option) {
        return helpLoadReferrerInternally(fileCrawlingConfigList, option, "fileConfigToLabelTypeMappingList");
    }

    /**
     * Load referrer of fileConfigToRoleTypeMappingList by the set-upper of referrer. <br>
     * FILE_CONFIG_TO_ROLE_TYPE_MAPPING by FILE_CONFIG_ID, named 'fileConfigToRoleTypeMappingList'.
     * <pre>
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">loadFileConfigToRoleTypeMapping</span>(<span style="color: #553000">fileCrawlingConfigList</span>, <span style="color: #553000">mappingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">mappingCB</span>.setupSelect...
     *     <span style="color: #553000">mappingCB</span>.query().set...
     *     <span style="color: #553000">mappingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (FileCrawlingConfig fileCrawlingConfig : <span style="color: #553000">fileCrawlingConfigList</span>) {
     *     ... = fileCrawlingConfig.<span style="color: #CC4747">getFileConfigToRoleTypeMappingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFileConfigId_InScope(pkList);
     * cb.query().addOrderBy_FileConfigId_Asc();
     * </pre>
     * @param fileCrawlingConfigList The entity list of fileCrawlingConfig. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<FileConfigToRoleTypeMapping> loadFileConfigToRoleTypeMapping(List<FileCrawlingConfig> fileCrawlingConfigList, ReferrerConditionSetupper<FileConfigToRoleTypeMappingCB> refCBLambda) {
        xassLRArg(fileCrawlingConfigList, refCBLambda);
        return doLoadFileConfigToRoleTypeMapping(fileCrawlingConfigList, new LoadReferrerOption<FileConfigToRoleTypeMappingCB, FileConfigToRoleTypeMapping>().xinit(refCBLambda));
    }

    /**
     * Load referrer of fileConfigToRoleTypeMappingList by the set-upper of referrer. <br>
     * FILE_CONFIG_TO_ROLE_TYPE_MAPPING by FILE_CONFIG_ID, named 'fileConfigToRoleTypeMappingList'.
     * <pre>
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">loadFileConfigToRoleTypeMapping</span>(<span style="color: #553000">fileCrawlingConfig</span>, <span style="color: #553000">mappingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">mappingCB</span>.setupSelect...
     *     <span style="color: #553000">mappingCB</span>.query().set...
     *     <span style="color: #553000">mappingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">fileCrawlingConfig</span>.<span style="color: #CC4747">getFileConfigToRoleTypeMappingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFileConfigId_InScope(pkList);
     * cb.query().addOrderBy_FileConfigId_Asc();
     * </pre>
     * @param fileCrawlingConfig The entity of fileCrawlingConfig. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<FileConfigToRoleTypeMapping> loadFileConfigToRoleTypeMapping(FileCrawlingConfig fileCrawlingConfig, ReferrerConditionSetupper<FileConfigToRoleTypeMappingCB> refCBLambda) {
        xassLRArg(fileCrawlingConfig, refCBLambda);
        return doLoadFileConfigToRoleTypeMapping(xnewLRLs(fileCrawlingConfig), new LoadReferrerOption<FileConfigToRoleTypeMappingCB, FileConfigToRoleTypeMapping>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<FileConfigToRoleTypeMapping> doLoadFileConfigToRoleTypeMapping(List<FileCrawlingConfig> fileCrawlingConfigList, LoadReferrerOption<FileConfigToRoleTypeMappingCB, FileConfigToRoleTypeMapping> option) {
        return helpLoadReferrerInternally(fileCrawlingConfigList, option, "fileConfigToRoleTypeMappingList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key id.
     * @param fileCrawlingConfigList The list of fileCrawlingConfig. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractIdList(List<FileCrawlingConfig> fileCrawlingConfigList)
    { return helpExtractListInternally(fileCrawlingConfigList, "id"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * FileCrawlingConfig fileCrawlingConfig = <span style="color: #70226C">new</span> FileCrawlingConfig();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * fileCrawlingConfig.setFoo...(value);
     * fileCrawlingConfig.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//fileCrawlingConfig.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//fileCrawlingConfig.set...;</span>
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">insert</span>(fileCrawlingConfig);
     * ... = fileCrawlingConfig.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param fileCrawlingConfig The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(FileCrawlingConfig fileCrawlingConfig) {
        doInsert(fileCrawlingConfig, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * FileCrawlingConfig fileCrawlingConfig = <span style="color: #70226C">new</span> FileCrawlingConfig();
     * fileCrawlingConfig.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * fileCrawlingConfig.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//fileCrawlingConfig.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//fileCrawlingConfig.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * fileCrawlingConfig.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">update</span>(fileCrawlingConfig);
     * </pre>
     * @param fileCrawlingConfig The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(FileCrawlingConfig fileCrawlingConfig) {
        doUpdate(fileCrawlingConfig, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * FileCrawlingConfig fileCrawlingConfig = <span style="color: #70226C">new</span> FileCrawlingConfig();
     * fileCrawlingConfig.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * fileCrawlingConfig.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//fileCrawlingConfig.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//fileCrawlingConfig.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//fileCrawlingConfig.setVersionNo(value);</span>
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(fileCrawlingConfig);
     * </pre>
     * @param fileCrawlingConfig The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(FileCrawlingConfig fileCrawlingConfig) {
        doUpdateNonstrict(fileCrawlingConfig, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param fileCrawlingConfig The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(FileCrawlingConfig fileCrawlingConfig) {
        doInsertOrUpdate(fileCrawlingConfig, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param fileCrawlingConfig The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(FileCrawlingConfig fileCrawlingConfig) {
        doInsertOrUpdateNonstrict(fileCrawlingConfig, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * FileCrawlingConfig fileCrawlingConfig = <span style="color: #70226C">new</span> FileCrawlingConfig();
     * fileCrawlingConfig.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * fileCrawlingConfig.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">delete</span>(fileCrawlingConfig);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param fileCrawlingConfig The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(FileCrawlingConfig fileCrawlingConfig) {
        doDelete(fileCrawlingConfig, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * FileCrawlingConfig fileCrawlingConfig = <span style="color: #70226C">new</span> FileCrawlingConfig();
     * fileCrawlingConfig.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//fileCrawlingConfig.setVersionNo(value);</span>
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(fileCrawlingConfig);
     * </pre>
     * @param fileCrawlingConfig The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(FileCrawlingConfig fileCrawlingConfig) {
        doDeleteNonstrict(fileCrawlingConfig, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <p><span style="color: #CC4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     FileCrawlingConfig fileCrawlingConfig = <span style="color: #70226C">new</span> FileCrawlingConfig();
     *     fileCrawlingConfig.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         fileCrawlingConfig.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     fileCrawlingConfigList.add(fileCrawlingConfig);
     * }
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">batchInsert</span>(fileCrawlingConfigList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param fileCrawlingConfigList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<FileCrawlingConfig> fileCrawlingConfigList) {
        return doBatchInsert(fileCrawlingConfigList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     FileCrawlingConfig fileCrawlingConfig = <span style="color: #70226C">new</span> FileCrawlingConfig();
     *     fileCrawlingConfig.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         fileCrawlingConfig.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         fileCrawlingConfig.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//fileCrawlingConfig.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     fileCrawlingConfigList.add(fileCrawlingConfig);
     * }
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">batchUpdate</span>(fileCrawlingConfigList);
     * </pre>
     * @param fileCrawlingConfigList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<FileCrawlingConfig> fileCrawlingConfigList) {
        return doBatchUpdate(fileCrawlingConfigList, null);
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     FileCrawlingConfig fileCrawlingConfig = <span style="color: #70226C">new</span> FileCrawlingConfig();
     *     fileCrawlingConfig.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         fileCrawlingConfig.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         fileCrawlingConfig.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//fileCrawlingConfig.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     fileCrawlingConfigList.add(fileCrawlingConfig);
     * }
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">batchUpdate</span>(fileCrawlingConfigList);
     * </pre>
     * @param fileCrawlingConfigList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<FileCrawlingConfig> fileCrawlingConfigList) {
        return doBatchUpdateNonstrict(fileCrawlingConfigList, null);
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param fileCrawlingConfigList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<FileCrawlingConfig> fileCrawlingConfigList) {
        return doBatchDelete(fileCrawlingConfigList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param fileCrawlingConfigList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<FileCrawlingConfig> fileCrawlingConfigList) {
        return doBatchDeleteNonstrict(fileCrawlingConfigList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;FileCrawlingConfig, FileCrawlingConfigCB&gt;() {
     *     public ConditionBean setup(FileCrawlingConfig entity, FileCrawlingConfigCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param manyArgLambda The callback to set up query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<FileCrawlingConfig, FileCrawlingConfigCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * FileCrawlingConfig fileCrawlingConfig = <span style="color: #70226C">new</span> FileCrawlingConfig();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//fileCrawlingConfig.setPK...(value);</span>
     * fileCrawlingConfig.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//fileCrawlingConfig.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//fileCrawlingConfig.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//fileCrawlingConfig.setVersionNo(value);</span>
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">queryUpdate</span>(fileCrawlingConfig, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param fileCrawlingConfig The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of FileCrawlingConfig. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(FileCrawlingConfig fileCrawlingConfig, CBCall<FileCrawlingConfigCB> cbLambda) {
        return doQueryUpdate(fileCrawlingConfig, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">queryDelete</span>(fileCrawlingConfig, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of FileCrawlingConfig. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<FileCrawlingConfigCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as insert(entity).
     * <pre>
     * FileCrawlingConfig fileCrawlingConfig = <span style="color: #70226C">new</span> FileCrawlingConfig();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * fileCrawlingConfig.setFoo...(value);
     * fileCrawlingConfig.setBar...(value);
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">varyingInsert</span>(fileCrawlingConfig, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = fileCrawlingConfig.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param fileCrawlingConfig The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(FileCrawlingConfig fileCrawlingConfig, WritableOptionCall<FileCrawlingConfigCB, InsertOption<FileCrawlingConfigCB>> opLambda) {
        doInsert(fileCrawlingConfig, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * FileCrawlingConfig fileCrawlingConfig = <span style="color: #70226C">new</span> FileCrawlingConfig();
     * fileCrawlingConfig.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * fileCrawlingConfig.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * fileCrawlingConfig.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(fileCrawlingConfig, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param fileCrawlingConfig The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(FileCrawlingConfig fileCrawlingConfig, WritableOptionCall<FileCrawlingConfigCB, UpdateOption<FileCrawlingConfigCB>> opLambda) {
        doUpdate(fileCrawlingConfig, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * FileCrawlingConfig fileCrawlingConfig = <span style="color: #70226C">new</span> FileCrawlingConfig();
     * fileCrawlingConfig.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * fileCrawlingConfig.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//fileCrawlingConfig.setVersionNo(value);</span>
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(fileCrawlingConfig, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param fileCrawlingConfig The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(FileCrawlingConfig fileCrawlingConfig, WritableOptionCall<FileCrawlingConfigCB, UpdateOption<FileCrawlingConfigCB>> opLambda) {
        doUpdateNonstrict(fileCrawlingConfig, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param fileCrawlingConfig The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(FileCrawlingConfig fileCrawlingConfig, WritableOptionCall<FileCrawlingConfigCB, InsertOption<FileCrawlingConfigCB>> insertOpLambda, WritableOptionCall<FileCrawlingConfigCB, UpdateOption<FileCrawlingConfigCB>> updateOpLambda) {
        doInsertOrUpdate(fileCrawlingConfig, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param fileCrawlingConfig The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(FileCrawlingConfig fileCrawlingConfig, WritableOptionCall<FileCrawlingConfigCB, InsertOption<FileCrawlingConfigCB>> insertOpLambda, WritableOptionCall<FileCrawlingConfigCB, UpdateOption<FileCrawlingConfigCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(fileCrawlingConfig, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param fileCrawlingConfig The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(FileCrawlingConfig fileCrawlingConfig, WritableOptionCall<FileCrawlingConfigCB, DeleteOption<FileCrawlingConfigCB>> opLambda) {
        doDelete(fileCrawlingConfig, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param fileCrawlingConfig The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(FileCrawlingConfig fileCrawlingConfig, WritableOptionCall<FileCrawlingConfigCB, DeleteOption<FileCrawlingConfigCB>> opLambda) {
        doDeleteNonstrict(fileCrawlingConfig, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param fileCrawlingConfigList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<FileCrawlingConfig> fileCrawlingConfigList, WritableOptionCall<FileCrawlingConfigCB, InsertOption<FileCrawlingConfigCB>> opLambda) {
        return doBatchInsert(fileCrawlingConfigList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param fileCrawlingConfigList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<FileCrawlingConfig> fileCrawlingConfigList, WritableOptionCall<FileCrawlingConfigCB, UpdateOption<FileCrawlingConfigCB>> opLambda) {
        return doBatchUpdate(fileCrawlingConfigList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param fileCrawlingConfigList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<FileCrawlingConfig> fileCrawlingConfigList, WritableOptionCall<FileCrawlingConfigCB, UpdateOption<FileCrawlingConfigCB>> opLambda) {
        return doBatchUpdateNonstrict(fileCrawlingConfigList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param fileCrawlingConfigList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<FileCrawlingConfig> fileCrawlingConfigList, WritableOptionCall<FileCrawlingConfigCB, DeleteOption<FileCrawlingConfigCB>> opLambda) {
        return doBatchDelete(fileCrawlingConfigList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param fileCrawlingConfigList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<FileCrawlingConfig> fileCrawlingConfigList, WritableOptionCall<FileCrawlingConfigCB, DeleteOption<FileCrawlingConfigCB>> opLambda) {
        return doBatchDeleteNonstrict(fileCrawlingConfigList, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as queryInsert(entity, setupper).
     * @param manyArgLambda The set-upper of query-insert. (NotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<FileCrawlingConfig, FileCrawlingConfigCB> manyArgLambda, WritableOptionCall<FileCrawlingConfigCB, InsertOption<FileCrawlingConfigCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * FileCrawlingConfig fileCrawlingConfig = <span style="color: #70226C">new</span> FileCrawlingConfig();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//fileCrawlingConfig.setPK...(value);</span>
     * fileCrawlingConfig.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//fileCrawlingConfig.setVersionNo(value);</span>
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(fileCrawlingConfig, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param fileCrawlingConfig The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of FileCrawlingConfig. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(FileCrawlingConfig fileCrawlingConfig, CBCall<FileCrawlingConfigCB> cbLambda, WritableOptionCall<FileCrawlingConfigCB, UpdateOption<FileCrawlingConfigCB>> opLambda) {
        return doQueryUpdate(fileCrawlingConfig, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #CC4747">queryDelete</span>(fileCrawlingConfig, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of FileCrawlingConfig. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<FileCrawlingConfigCB> cbLambda, WritableOptionCall<FileCrawlingConfigCB, DeleteOption<FileCrawlingConfigCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * fileCrawlingConfigBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * fileCrawlingConfigBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * fileCrawlingConfigBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * fileCrawlingConfigBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * fileCrawlingConfigBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * fileCrawlingConfigBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * fileCrawlingConfigBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * fileCrawlingConfigBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * fileCrawlingConfigBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * fileCrawlingConfigBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * fileCrawlingConfigBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * fileCrawlingConfigBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * fileCrawlingConfigBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * fileCrawlingConfigBhv.outideSql().removeBlockComment().selectList()
     * fileCrawlingConfigBhv.outideSql().removeLineComment().selectList()
     * fileCrawlingConfigBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<FileCrawlingConfigBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    @Override
    protected boolean hasVersionNoValue(Entity et) { return downcast(et).getVersionNo() != null; }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends FileCrawlingConfig> typeOfSelectedEntity() { return FileCrawlingConfig.class; }
    protected Class<FileCrawlingConfig> typeOfHandlingEntity() { return FileCrawlingConfig.class; }
    protected Class<FileCrawlingConfigCB> typeOfHandlingConditionBean() { return FileCrawlingConfigCB.class; }
}
