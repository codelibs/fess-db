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
 * The behavior of DATA_CRAWLING_CONFIG as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, NAME, HANDLER_NAME, HANDLER_PARAMETER, HANDLER_SCRIPT, BOOST, AVAILABLE, SORT_ORDER, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME, DELETED_BY, DELETED_TIME, VERSION_NO
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
 *     DATA_CONFIG_TO_LABEL_TYPE_MAPPING, DATA_CONFIG_TO_ROLE_TYPE_MAPPING
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     dataConfigToLabelTypeMappingList, dataConfigToRoleTypeMappingList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsDataCrawlingConfigBhv extends AbstractBehaviorWritable<DataCrawlingConfig, DataCrawlingConfigCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DataCrawlingConfigDbm asDBMeta() { return DataCrawlingConfigDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "DATA_CRAWLING_CONFIG"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public DataCrawlingConfigCB newConditionBean() { return new DataCrawlingConfigCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DataCrawlingConfig. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<DataCrawlingConfigCB> cbLambda) {
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
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">dataCrawlingConfig</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">dataCrawlingConfig</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">dataCrawlingConfig</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">dataCrawlingConfig</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DataCrawlingConfig. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<DataCrawlingConfig> selectEntity(CBCall<DataCrawlingConfigCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<DataCrawlingConfig> facadeSelectEntity(DataCrawlingConfigCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends DataCrawlingConfig> OptionalEntity<ENTITY> doSelectOptionalEntity(DataCrawlingConfigCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * DataCrawlingConfig <span style="color: #553000">dataCrawlingConfig</span> = <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">dataCrawlingConfig</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of DataCrawlingConfig. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public DataCrawlingConfig selectEntityWithDeletedCheck(CBCall<DataCrawlingConfigCB> cbLambda) {
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
    public OptionalEntity<DataCrawlingConfig> selectByPK(Long id) {
        return facadeSelectByPK(id);
    }

    protected OptionalEntity<DataCrawlingConfig> facadeSelectByPK(Long id) {
        return doSelectOptionalByPK(id, typeOfSelectedEntity());
    }

    protected <ENTITY extends DataCrawlingConfig> ENTITY doSelectByPK(Long id, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(id), tp);
    }

    protected <ENTITY extends DataCrawlingConfig> OptionalEntity<ENTITY> doSelectOptionalByPK(Long id, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(id, tp), id);
    }

    protected DataCrawlingConfigCB xprepareCBAsPK(Long id) {
        assertObjectNotNull("id", id);
        return newConditionBean().acceptPK(id);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;DataCrawlingConfig&gt; <span style="color: #553000">dataCrawlingConfigList</span> = <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (DataCrawlingConfig <span style="color: #553000">dataCrawlingConfig</span> : <span style="color: #553000">dataCrawlingConfigList</span>) {
     *     ... = <span style="color: #553000">dataCrawlingConfig</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of DataCrawlingConfig. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<DataCrawlingConfig> selectList(CBCall<DataCrawlingConfigCB> cbLambda) {
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
     * PagingResultBean&lt;DataCrawlingConfig&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (DataCrawlingConfig dataCrawlingConfig : <span style="color: #553000">page</span>) {
     *     ... = dataCrawlingConfig.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of DataCrawlingConfig. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<DataCrawlingConfig> selectPage(CBCall<DataCrawlingConfigCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DataCrawlingConfig. (NotNull)
     * @param entityLambda The handler of entity row of DataCrawlingConfig. (NotNull)
     */
    public void selectCursor(CBCall<DataCrawlingConfigCB> cbLambda, EntityRowHandler<DataCrawlingConfig> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<DataCrawlingConfigCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param dataCrawlingConfigList The entity list of dataCrawlingConfig. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<DataCrawlingConfig> dataCrawlingConfigList, ReferrerLoaderHandler<LoaderOfDataCrawlingConfig> loaderLambda) {
        xassLRArg(dataCrawlingConfigList, loaderLambda);
        loaderLambda.handle(new LoaderOfDataCrawlingConfig().ready(dataCrawlingConfigList, _behaviorSelector));
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
     * @param dataCrawlingConfig The entity of dataCrawlingConfig. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(DataCrawlingConfig dataCrawlingConfig, ReferrerLoaderHandler<LoaderOfDataCrawlingConfig> loaderLambda) {
        xassLRArg(dataCrawlingConfig, loaderLambda);
        loaderLambda.handle(new LoaderOfDataCrawlingConfig().ready(xnewLRAryLs(dataCrawlingConfig), _behaviorSelector));
    }

    /**
     * Load referrer of dataConfigToLabelTypeMappingList by the set-upper of referrer. <br>
     * DATA_CONFIG_TO_LABEL_TYPE_MAPPING by DATA_CONFIG_ID, named 'dataConfigToLabelTypeMappingList'.
     * <pre>
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">loadDataConfigToLabelTypeMapping</span>(<span style="color: #553000">dataCrawlingConfigList</span>, <span style="color: #553000">mappingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">mappingCB</span>.setupSelect...
     *     <span style="color: #553000">mappingCB</span>.query().set...
     *     <span style="color: #553000">mappingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DataCrawlingConfig dataCrawlingConfig : <span style="color: #553000">dataCrawlingConfigList</span>) {
     *     ... = dataCrawlingConfig.<span style="color: #CC4747">getDataConfigToLabelTypeMappingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDataConfigId_InScope(pkList);
     * cb.query().addOrderBy_DataConfigId_Asc();
     * </pre>
     * @param dataCrawlingConfigList The entity list of dataCrawlingConfig. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DataConfigToLabelTypeMapping> loadDataConfigToLabelTypeMapping(List<DataCrawlingConfig> dataCrawlingConfigList, ReferrerConditionSetupper<DataConfigToLabelTypeMappingCB> refCBLambda) {
        xassLRArg(dataCrawlingConfigList, refCBLambda);
        return doLoadDataConfigToLabelTypeMapping(dataCrawlingConfigList, new LoadReferrerOption<DataConfigToLabelTypeMappingCB, DataConfigToLabelTypeMapping>().xinit(refCBLambda));
    }

    /**
     * Load referrer of dataConfigToLabelTypeMappingList by the set-upper of referrer. <br>
     * DATA_CONFIG_TO_LABEL_TYPE_MAPPING by DATA_CONFIG_ID, named 'dataConfigToLabelTypeMappingList'.
     * <pre>
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">loadDataConfigToLabelTypeMapping</span>(<span style="color: #553000">dataCrawlingConfig</span>, <span style="color: #553000">mappingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">mappingCB</span>.setupSelect...
     *     <span style="color: #553000">mappingCB</span>.query().set...
     *     <span style="color: #553000">mappingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">dataCrawlingConfig</span>.<span style="color: #CC4747">getDataConfigToLabelTypeMappingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDataConfigId_InScope(pkList);
     * cb.query().addOrderBy_DataConfigId_Asc();
     * </pre>
     * @param dataCrawlingConfig The entity of dataCrawlingConfig. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DataConfigToLabelTypeMapping> loadDataConfigToLabelTypeMapping(DataCrawlingConfig dataCrawlingConfig, ReferrerConditionSetupper<DataConfigToLabelTypeMappingCB> refCBLambda) {
        xassLRArg(dataCrawlingConfig, refCBLambda);
        return doLoadDataConfigToLabelTypeMapping(xnewLRLs(dataCrawlingConfig), new LoadReferrerOption<DataConfigToLabelTypeMappingCB, DataConfigToLabelTypeMapping>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DataConfigToLabelTypeMapping> doLoadDataConfigToLabelTypeMapping(List<DataCrawlingConfig> dataCrawlingConfigList, LoadReferrerOption<DataConfigToLabelTypeMappingCB, DataConfigToLabelTypeMapping> option) {
        return helpLoadReferrerInternally(dataCrawlingConfigList, option, "dataConfigToLabelTypeMappingList");
    }

    /**
     * Load referrer of dataConfigToRoleTypeMappingList by the set-upper of referrer. <br>
     * DATA_CONFIG_TO_ROLE_TYPE_MAPPING by DATA_CONFIG_ID, named 'dataConfigToRoleTypeMappingList'.
     * <pre>
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">loadDataConfigToRoleTypeMapping</span>(<span style="color: #553000">dataCrawlingConfigList</span>, <span style="color: #553000">mappingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">mappingCB</span>.setupSelect...
     *     <span style="color: #553000">mappingCB</span>.query().set...
     *     <span style="color: #553000">mappingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (DataCrawlingConfig dataCrawlingConfig : <span style="color: #553000">dataCrawlingConfigList</span>) {
     *     ... = dataCrawlingConfig.<span style="color: #CC4747">getDataConfigToRoleTypeMappingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDataConfigId_InScope(pkList);
     * cb.query().addOrderBy_DataConfigId_Asc();
     * </pre>
     * @param dataCrawlingConfigList The entity list of dataCrawlingConfig. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DataConfigToRoleTypeMapping> loadDataConfigToRoleTypeMapping(List<DataCrawlingConfig> dataCrawlingConfigList, ReferrerConditionSetupper<DataConfigToRoleTypeMappingCB> refCBLambda) {
        xassLRArg(dataCrawlingConfigList, refCBLambda);
        return doLoadDataConfigToRoleTypeMapping(dataCrawlingConfigList, new LoadReferrerOption<DataConfigToRoleTypeMappingCB, DataConfigToRoleTypeMapping>().xinit(refCBLambda));
    }

    /**
     * Load referrer of dataConfigToRoleTypeMappingList by the set-upper of referrer. <br>
     * DATA_CONFIG_TO_ROLE_TYPE_MAPPING by DATA_CONFIG_ID, named 'dataConfigToRoleTypeMappingList'.
     * <pre>
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">loadDataConfigToRoleTypeMapping</span>(<span style="color: #553000">dataCrawlingConfig</span>, <span style="color: #553000">mappingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">mappingCB</span>.setupSelect...
     *     <span style="color: #553000">mappingCB</span>.query().set...
     *     <span style="color: #553000">mappingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">dataCrawlingConfig</span>.<span style="color: #CC4747">getDataConfigToRoleTypeMappingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDataConfigId_InScope(pkList);
     * cb.query().addOrderBy_DataConfigId_Asc();
     * </pre>
     * @param dataCrawlingConfig The entity of dataCrawlingConfig. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<DataConfigToRoleTypeMapping> loadDataConfigToRoleTypeMapping(DataCrawlingConfig dataCrawlingConfig, ReferrerConditionSetupper<DataConfigToRoleTypeMappingCB> refCBLambda) {
        xassLRArg(dataCrawlingConfig, refCBLambda);
        return doLoadDataConfigToRoleTypeMapping(xnewLRLs(dataCrawlingConfig), new LoadReferrerOption<DataConfigToRoleTypeMappingCB, DataConfigToRoleTypeMapping>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<DataConfigToRoleTypeMapping> doLoadDataConfigToRoleTypeMapping(List<DataCrawlingConfig> dataCrawlingConfigList, LoadReferrerOption<DataConfigToRoleTypeMappingCB, DataConfigToRoleTypeMapping> option) {
        return helpLoadReferrerInternally(dataCrawlingConfigList, option, "dataConfigToRoleTypeMappingList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key id.
     * @param dataCrawlingConfigList The list of dataCrawlingConfig. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractIdList(List<DataCrawlingConfig> dataCrawlingConfigList)
    { return helpExtractListInternally(dataCrawlingConfigList, "id"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DataCrawlingConfig dataCrawlingConfig = <span style="color: #70226C">new</span> DataCrawlingConfig();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * dataCrawlingConfig.setFoo...(value);
     * dataCrawlingConfig.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//dataCrawlingConfig.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//dataCrawlingConfig.set...;</span>
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">insert</span>(dataCrawlingConfig);
     * ... = dataCrawlingConfig.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param dataCrawlingConfig The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(DataCrawlingConfig dataCrawlingConfig) {
        doInsert(dataCrawlingConfig, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * DataCrawlingConfig dataCrawlingConfig = <span style="color: #70226C">new</span> DataCrawlingConfig();
     * dataCrawlingConfig.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * dataCrawlingConfig.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//dataCrawlingConfig.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//dataCrawlingConfig.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * dataCrawlingConfig.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">update</span>(dataCrawlingConfig);
     * </pre>
     * @param dataCrawlingConfig The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(DataCrawlingConfig dataCrawlingConfig) {
        doUpdate(dataCrawlingConfig, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * DataCrawlingConfig dataCrawlingConfig = <span style="color: #70226C">new</span> DataCrawlingConfig();
     * dataCrawlingConfig.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * dataCrawlingConfig.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//dataCrawlingConfig.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//dataCrawlingConfig.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//dataCrawlingConfig.setVersionNo(value);</span>
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(dataCrawlingConfig);
     * </pre>
     * @param dataCrawlingConfig The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(DataCrawlingConfig dataCrawlingConfig) {
        doUpdateNonstrict(dataCrawlingConfig, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param dataCrawlingConfig The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(DataCrawlingConfig dataCrawlingConfig) {
        doInsertOrUpdate(dataCrawlingConfig, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param dataCrawlingConfig The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(DataCrawlingConfig dataCrawlingConfig) {
        doInsertOrUpdateNonstrict(dataCrawlingConfig, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * DataCrawlingConfig dataCrawlingConfig = <span style="color: #70226C">new</span> DataCrawlingConfig();
     * dataCrawlingConfig.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * dataCrawlingConfig.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">delete</span>(dataCrawlingConfig);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param dataCrawlingConfig The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(DataCrawlingConfig dataCrawlingConfig) {
        doDelete(dataCrawlingConfig, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * DataCrawlingConfig dataCrawlingConfig = <span style="color: #70226C">new</span> DataCrawlingConfig();
     * dataCrawlingConfig.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//dataCrawlingConfig.setVersionNo(value);</span>
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(dataCrawlingConfig);
     * </pre>
     * @param dataCrawlingConfig The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(DataCrawlingConfig dataCrawlingConfig) {
        doDeleteNonstrict(dataCrawlingConfig, null);
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
     *     DataCrawlingConfig dataCrawlingConfig = <span style="color: #70226C">new</span> DataCrawlingConfig();
     *     dataCrawlingConfig.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         dataCrawlingConfig.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     dataCrawlingConfigList.add(dataCrawlingConfig);
     * }
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">batchInsert</span>(dataCrawlingConfigList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param dataCrawlingConfigList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<DataCrawlingConfig> dataCrawlingConfigList) {
        return doBatchInsert(dataCrawlingConfigList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DataCrawlingConfig dataCrawlingConfig = <span style="color: #70226C">new</span> DataCrawlingConfig();
     *     dataCrawlingConfig.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         dataCrawlingConfig.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         dataCrawlingConfig.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//dataCrawlingConfig.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     dataCrawlingConfigList.add(dataCrawlingConfig);
     * }
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">batchUpdate</span>(dataCrawlingConfigList);
     * </pre>
     * @param dataCrawlingConfigList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<DataCrawlingConfig> dataCrawlingConfigList) {
        return doBatchUpdate(dataCrawlingConfigList, null);
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     DataCrawlingConfig dataCrawlingConfig = <span style="color: #70226C">new</span> DataCrawlingConfig();
     *     dataCrawlingConfig.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         dataCrawlingConfig.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         dataCrawlingConfig.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//dataCrawlingConfig.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     dataCrawlingConfigList.add(dataCrawlingConfig);
     * }
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">batchUpdate</span>(dataCrawlingConfigList);
     * </pre>
     * @param dataCrawlingConfigList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<DataCrawlingConfig> dataCrawlingConfigList) {
        return doBatchUpdateNonstrict(dataCrawlingConfigList, null);
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param dataCrawlingConfigList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<DataCrawlingConfig> dataCrawlingConfigList) {
        return doBatchDelete(dataCrawlingConfigList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param dataCrawlingConfigList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<DataCrawlingConfig> dataCrawlingConfigList) {
        return doBatchDeleteNonstrict(dataCrawlingConfigList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;DataCrawlingConfig, DataCrawlingConfigCB&gt;() {
     *     public ConditionBean setup(DataCrawlingConfig entity, DataCrawlingConfigCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<DataCrawlingConfig, DataCrawlingConfigCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * DataCrawlingConfig dataCrawlingConfig = <span style="color: #70226C">new</span> DataCrawlingConfig();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//dataCrawlingConfig.setPK...(value);</span>
     * dataCrawlingConfig.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//dataCrawlingConfig.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//dataCrawlingConfig.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//dataCrawlingConfig.setVersionNo(value);</span>
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">queryUpdate</span>(dataCrawlingConfig, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param dataCrawlingConfig The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of DataCrawlingConfig. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(DataCrawlingConfig dataCrawlingConfig, CBCall<DataCrawlingConfigCB> cbLambda) {
        return doQueryUpdate(dataCrawlingConfig, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">queryDelete</span>(dataCrawlingConfig, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DataCrawlingConfig. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<DataCrawlingConfigCB> cbLambda) {
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
     * DataCrawlingConfig dataCrawlingConfig = <span style="color: #70226C">new</span> DataCrawlingConfig();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * dataCrawlingConfig.setFoo...(value);
     * dataCrawlingConfig.setBar...(value);
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">varyingInsert</span>(dataCrawlingConfig, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = dataCrawlingConfig.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param dataCrawlingConfig The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(DataCrawlingConfig dataCrawlingConfig, WritableOptionCall<DataCrawlingConfigCB, InsertOption<DataCrawlingConfigCB>> opLambda) {
        doInsert(dataCrawlingConfig, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * DataCrawlingConfig dataCrawlingConfig = <span style="color: #70226C">new</span> DataCrawlingConfig();
     * dataCrawlingConfig.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * dataCrawlingConfig.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * dataCrawlingConfig.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(dataCrawlingConfig, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param dataCrawlingConfig The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(DataCrawlingConfig dataCrawlingConfig, WritableOptionCall<DataCrawlingConfigCB, UpdateOption<DataCrawlingConfigCB>> opLambda) {
        doUpdate(dataCrawlingConfig, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * DataCrawlingConfig dataCrawlingConfig = <span style="color: #70226C">new</span> DataCrawlingConfig();
     * dataCrawlingConfig.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * dataCrawlingConfig.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//dataCrawlingConfig.setVersionNo(value);</span>
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(dataCrawlingConfig, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param dataCrawlingConfig The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(DataCrawlingConfig dataCrawlingConfig, WritableOptionCall<DataCrawlingConfigCB, UpdateOption<DataCrawlingConfigCB>> opLambda) {
        doUpdateNonstrict(dataCrawlingConfig, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param dataCrawlingConfig The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(DataCrawlingConfig dataCrawlingConfig, WritableOptionCall<DataCrawlingConfigCB, InsertOption<DataCrawlingConfigCB>> insertOpLambda, WritableOptionCall<DataCrawlingConfigCB, UpdateOption<DataCrawlingConfigCB>> updateOpLambda) {
        doInsertOrUpdate(dataCrawlingConfig, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param dataCrawlingConfig The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(DataCrawlingConfig dataCrawlingConfig, WritableOptionCall<DataCrawlingConfigCB, InsertOption<DataCrawlingConfigCB>> insertOpLambda, WritableOptionCall<DataCrawlingConfigCB, UpdateOption<DataCrawlingConfigCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(dataCrawlingConfig, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param dataCrawlingConfig The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(DataCrawlingConfig dataCrawlingConfig, WritableOptionCall<DataCrawlingConfigCB, DeleteOption<DataCrawlingConfigCB>> opLambda) {
        doDelete(dataCrawlingConfig, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param dataCrawlingConfig The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(DataCrawlingConfig dataCrawlingConfig, WritableOptionCall<DataCrawlingConfigCB, DeleteOption<DataCrawlingConfigCB>> opLambda) {
        doDeleteNonstrict(dataCrawlingConfig, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param dataCrawlingConfigList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<DataCrawlingConfig> dataCrawlingConfigList, WritableOptionCall<DataCrawlingConfigCB, InsertOption<DataCrawlingConfigCB>> opLambda) {
        return doBatchInsert(dataCrawlingConfigList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param dataCrawlingConfigList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<DataCrawlingConfig> dataCrawlingConfigList, WritableOptionCall<DataCrawlingConfigCB, UpdateOption<DataCrawlingConfigCB>> opLambda) {
        return doBatchUpdate(dataCrawlingConfigList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param dataCrawlingConfigList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<DataCrawlingConfig> dataCrawlingConfigList, WritableOptionCall<DataCrawlingConfigCB, UpdateOption<DataCrawlingConfigCB>> opLambda) {
        return doBatchUpdateNonstrict(dataCrawlingConfigList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param dataCrawlingConfigList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<DataCrawlingConfig> dataCrawlingConfigList, WritableOptionCall<DataCrawlingConfigCB, DeleteOption<DataCrawlingConfigCB>> opLambda) {
        return doBatchDelete(dataCrawlingConfigList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param dataCrawlingConfigList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<DataCrawlingConfig> dataCrawlingConfigList, WritableOptionCall<DataCrawlingConfigCB, DeleteOption<DataCrawlingConfigCB>> opLambda) {
        return doBatchDeleteNonstrict(dataCrawlingConfigList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<DataCrawlingConfig, DataCrawlingConfigCB> manyArgLambda, WritableOptionCall<DataCrawlingConfigCB, InsertOption<DataCrawlingConfigCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * DataCrawlingConfig dataCrawlingConfig = <span style="color: #70226C">new</span> DataCrawlingConfig();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//dataCrawlingConfig.setPK...(value);</span>
     * dataCrawlingConfig.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//dataCrawlingConfig.setVersionNo(value);</span>
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(dataCrawlingConfig, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param dataCrawlingConfig The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of DataCrawlingConfig. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(DataCrawlingConfig dataCrawlingConfig, CBCall<DataCrawlingConfigCB> cbLambda, WritableOptionCall<DataCrawlingConfigCB, UpdateOption<DataCrawlingConfigCB>> opLambda) {
        return doQueryUpdate(dataCrawlingConfig, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #CC4747">queryDelete</span>(dataCrawlingConfig, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of DataCrawlingConfig. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<DataCrawlingConfigCB> cbLambda, WritableOptionCall<DataCrawlingConfigCB, DeleteOption<DataCrawlingConfigCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * dataCrawlingConfigBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * dataCrawlingConfigBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * dataCrawlingConfigBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * dataCrawlingConfigBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * dataCrawlingConfigBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * dataCrawlingConfigBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * dataCrawlingConfigBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * dataCrawlingConfigBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * dataCrawlingConfigBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * dataCrawlingConfigBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * dataCrawlingConfigBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * dataCrawlingConfigBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * dataCrawlingConfigBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * dataCrawlingConfigBhv.outideSql().removeBlockComment().selectList()
     * dataCrawlingConfigBhv.outideSql().removeLineComment().selectList()
     * dataCrawlingConfigBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<DataCrawlingConfigBhv> outsideSql() {
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
    protected Class<? extends DataCrawlingConfig> typeOfSelectedEntity() { return DataCrawlingConfig.class; }
    protected Class<DataCrawlingConfig> typeOfHandlingEntity() { return DataCrawlingConfig.class; }
    protected Class<DataCrawlingConfigCB> typeOfHandlingConditionBean() { return DataCrawlingConfigCB.class; }
}
