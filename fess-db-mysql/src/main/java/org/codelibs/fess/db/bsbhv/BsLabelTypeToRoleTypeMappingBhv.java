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
 * The behavior of LABEL_TYPE_TO_ROLE_TYPE_MAPPING as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, LABEL_TYPE_ID, ROLE_TYPE_ID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     LABEL_TYPE, ROLE_TYPE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     labelType, roleType
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsLabelTypeToRoleTypeMappingBhv extends AbstractBehaviorWritable<LabelTypeToRoleTypeMapping, LabelTypeToRoleTypeMappingCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public LabelTypeToRoleTypeMappingDbm asDBMeta() { return LabelTypeToRoleTypeMappingDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "LABEL_TYPE_TO_ROLE_TYPE_MAPPING"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public LabelTypeToRoleTypeMappingCB newConditionBean() { return new LabelTypeToRoleTypeMappingCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">labelTypeToRoleTypeMappingBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of LabelTypeToRoleTypeMapping. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<LabelTypeToRoleTypeMappingCB> cbLambda) {
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
     * <span style="color: #0000C0">labelTypeToRoleTypeMappingBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">labelTypeToRoleTypeMapping</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">labelTypeToRoleTypeMapping</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">labelTypeToRoleTypeMappingBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">labelTypeToRoleTypeMapping</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">labelTypeToRoleTypeMapping</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of LabelTypeToRoleTypeMapping. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<LabelTypeToRoleTypeMapping> selectEntity(CBCall<LabelTypeToRoleTypeMappingCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<LabelTypeToRoleTypeMapping> facadeSelectEntity(LabelTypeToRoleTypeMappingCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends LabelTypeToRoleTypeMapping> OptionalEntity<ENTITY> doSelectOptionalEntity(LabelTypeToRoleTypeMappingCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * LabelTypeToRoleTypeMapping <span style="color: #553000">labelTypeToRoleTypeMapping</span> = <span style="color: #0000C0">labelTypeToRoleTypeMappingBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">labelTypeToRoleTypeMapping</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of LabelTypeToRoleTypeMapping. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LabelTypeToRoleTypeMapping selectEntityWithDeletedCheck(CBCall<LabelTypeToRoleTypeMappingCB> cbLambda) {
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
    public OptionalEntity<LabelTypeToRoleTypeMapping> selectByPK(Long id) {
        return facadeSelectByPK(id);
    }

    protected OptionalEntity<LabelTypeToRoleTypeMapping> facadeSelectByPK(Long id) {
        return doSelectOptionalByPK(id, typeOfSelectedEntity());
    }

    protected <ENTITY extends LabelTypeToRoleTypeMapping> ENTITY doSelectByPK(Long id, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(id), tp);
    }

    protected <ENTITY extends LabelTypeToRoleTypeMapping> OptionalEntity<ENTITY> doSelectOptionalByPK(Long id, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(id, tp), id);
    }

    protected LabelTypeToRoleTypeMappingCB xprepareCBAsPK(Long id) {
        assertObjectNotNull("id", id);
        return newConditionBean().acceptPK(id);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;LabelTypeToRoleTypeMapping&gt; <span style="color: #553000">labelTypeToRoleTypeMappingList</span> = <span style="color: #0000C0">labelTypeToRoleTypeMappingBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (LabelTypeToRoleTypeMapping <span style="color: #553000">labelTypeToRoleTypeMapping</span> : <span style="color: #553000">labelTypeToRoleTypeMappingList</span>) {
     *     ... = <span style="color: #553000">labelTypeToRoleTypeMapping</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of LabelTypeToRoleTypeMapping. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LabelTypeToRoleTypeMapping> selectList(CBCall<LabelTypeToRoleTypeMappingCB> cbLambda) {
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
     * PagingResultBean&lt;LabelTypeToRoleTypeMapping&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">labelTypeToRoleTypeMappingBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (LabelTypeToRoleTypeMapping labelTypeToRoleTypeMapping : <span style="color: #553000">page</span>) {
     *     ... = labelTypeToRoleTypeMapping.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of LabelTypeToRoleTypeMapping. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LabelTypeToRoleTypeMapping> selectPage(CBCall<LabelTypeToRoleTypeMappingCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">labelTypeToRoleTypeMappingBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of LabelTypeToRoleTypeMapping. (NotNull)
     * @param entityLambda The handler of entity row of LabelTypeToRoleTypeMapping. (NotNull)
     */
    public void selectCursor(CBCall<LabelTypeToRoleTypeMappingCB> cbLambda, EntityRowHandler<LabelTypeToRoleTypeMapping> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">labelTypeToRoleTypeMappingBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<LabelTypeToRoleTypeMappingCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param labelTypeToRoleTypeMappingList The entity list of labelTypeToRoleTypeMapping. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<LabelTypeToRoleTypeMapping> labelTypeToRoleTypeMappingList, ReferrerLoaderHandler<LoaderOfLabelTypeToRoleTypeMapping> loaderLambda) {
        xassLRArg(labelTypeToRoleTypeMappingList, loaderLambda);
        loaderLambda.handle(new LoaderOfLabelTypeToRoleTypeMapping().ready(labelTypeToRoleTypeMappingList, _behaviorSelector));
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
     * @param labelTypeToRoleTypeMapping The entity of labelTypeToRoleTypeMapping. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(LabelTypeToRoleTypeMapping labelTypeToRoleTypeMapping, ReferrerLoaderHandler<LoaderOfLabelTypeToRoleTypeMapping> loaderLambda) {
        xassLRArg(labelTypeToRoleTypeMapping, loaderLambda);
        loaderLambda.handle(new LoaderOfLabelTypeToRoleTypeMapping().ready(xnewLRAryLs(labelTypeToRoleTypeMapping), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'LabelType'.
     * @param labelTypeToRoleTypeMappingList The list of labelTypeToRoleTypeMapping. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LabelType> pulloutLabelType(List<LabelTypeToRoleTypeMapping> labelTypeToRoleTypeMappingList)
    { return helpPulloutInternally(labelTypeToRoleTypeMappingList, "labelType"); }

    /**
     * Pull out the list of foreign table 'RoleType'.
     * @param labelTypeToRoleTypeMappingList The list of labelTypeToRoleTypeMapping. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<RoleType> pulloutRoleType(List<LabelTypeToRoleTypeMapping> labelTypeToRoleTypeMappingList)
    { return helpPulloutInternally(labelTypeToRoleTypeMappingList, "roleType"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key id.
     * @param labelTypeToRoleTypeMappingList The list of labelTypeToRoleTypeMapping. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractIdList(List<LabelTypeToRoleTypeMapping> labelTypeToRoleTypeMappingList)
    { return helpExtractListInternally(labelTypeToRoleTypeMappingList, "id"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LabelTypeToRoleTypeMapping labelTypeToRoleTypeMapping = <span style="color: #70226C">new</span> LabelTypeToRoleTypeMapping();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * labelTypeToRoleTypeMapping.setFoo...(value);
     * labelTypeToRoleTypeMapping.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//labelTypeToRoleTypeMapping.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//labelTypeToRoleTypeMapping.set...;</span>
     * <span style="color: #0000C0">labelTypeToRoleTypeMappingBhv</span>.<span style="color: #CC4747">insert</span>(labelTypeToRoleTypeMapping);
     * ... = labelTypeToRoleTypeMapping.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param labelTypeToRoleTypeMapping The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LabelTypeToRoleTypeMapping labelTypeToRoleTypeMapping) {
        doInsert(labelTypeToRoleTypeMapping, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * LabelTypeToRoleTypeMapping labelTypeToRoleTypeMapping = <span style="color: #70226C">new</span> LabelTypeToRoleTypeMapping();
     * labelTypeToRoleTypeMapping.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * labelTypeToRoleTypeMapping.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//labelTypeToRoleTypeMapping.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//labelTypeToRoleTypeMapping.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * labelTypeToRoleTypeMapping.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">labelTypeToRoleTypeMappingBhv</span>.<span style="color: #CC4747">update</span>(labelTypeToRoleTypeMapping);
     * </pre>
     * @param labelTypeToRoleTypeMapping The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(LabelTypeToRoleTypeMapping labelTypeToRoleTypeMapping) {
        doUpdate(labelTypeToRoleTypeMapping, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param labelTypeToRoleTypeMapping The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LabelTypeToRoleTypeMapping labelTypeToRoleTypeMapping) {
        doInsertOrUpdate(labelTypeToRoleTypeMapping, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * LabelTypeToRoleTypeMapping labelTypeToRoleTypeMapping = <span style="color: #70226C">new</span> LabelTypeToRoleTypeMapping();
     * labelTypeToRoleTypeMapping.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * labelTypeToRoleTypeMapping.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">labelTypeToRoleTypeMappingBhv</span>.<span style="color: #CC4747">delete</span>(labelTypeToRoleTypeMapping);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param labelTypeToRoleTypeMapping The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LabelTypeToRoleTypeMapping labelTypeToRoleTypeMapping) {
        doDelete(labelTypeToRoleTypeMapping, null);
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
     *     LabelTypeToRoleTypeMapping labelTypeToRoleTypeMapping = <span style="color: #70226C">new</span> LabelTypeToRoleTypeMapping();
     *     labelTypeToRoleTypeMapping.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         labelTypeToRoleTypeMapping.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     labelTypeToRoleTypeMappingList.add(labelTypeToRoleTypeMapping);
     * }
     * <span style="color: #0000C0">labelTypeToRoleTypeMappingBhv</span>.<span style="color: #CC4747">batchInsert</span>(labelTypeToRoleTypeMappingList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param labelTypeToRoleTypeMappingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LabelTypeToRoleTypeMapping> labelTypeToRoleTypeMappingList) {
        return doBatchInsert(labelTypeToRoleTypeMappingList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LabelTypeToRoleTypeMapping labelTypeToRoleTypeMapping = <span style="color: #70226C">new</span> LabelTypeToRoleTypeMapping();
     *     labelTypeToRoleTypeMapping.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         labelTypeToRoleTypeMapping.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         labelTypeToRoleTypeMapping.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//labelTypeToRoleTypeMapping.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     labelTypeToRoleTypeMappingList.add(labelTypeToRoleTypeMapping);
     * }
     * <span style="color: #0000C0">labelTypeToRoleTypeMappingBhv</span>.<span style="color: #CC4747">batchUpdate</span>(labelTypeToRoleTypeMappingList);
     * </pre>
     * @param labelTypeToRoleTypeMappingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<LabelTypeToRoleTypeMapping> labelTypeToRoleTypeMappingList) {
        return doBatchUpdate(labelTypeToRoleTypeMappingList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param labelTypeToRoleTypeMappingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<LabelTypeToRoleTypeMapping> labelTypeToRoleTypeMappingList) {
        return doBatchDelete(labelTypeToRoleTypeMappingList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">labelTypeToRoleTypeMappingBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;LabelTypeToRoleTypeMapping, LabelTypeToRoleTypeMappingCB&gt;() {
     *     public ConditionBean setup(LabelTypeToRoleTypeMapping entity, LabelTypeToRoleTypeMappingCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LabelTypeToRoleTypeMapping, LabelTypeToRoleTypeMappingCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * LabelTypeToRoleTypeMapping labelTypeToRoleTypeMapping = <span style="color: #70226C">new</span> LabelTypeToRoleTypeMapping();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//labelTypeToRoleTypeMapping.setPK...(value);</span>
     * labelTypeToRoleTypeMapping.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//labelTypeToRoleTypeMapping.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//labelTypeToRoleTypeMapping.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//labelTypeToRoleTypeMapping.setVersionNo(value);</span>
     * <span style="color: #0000C0">labelTypeToRoleTypeMappingBhv</span>.<span style="color: #CC4747">queryUpdate</span>(labelTypeToRoleTypeMapping, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param labelTypeToRoleTypeMapping The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of LabelTypeToRoleTypeMapping. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LabelTypeToRoleTypeMapping labelTypeToRoleTypeMapping, CBCall<LabelTypeToRoleTypeMappingCB> cbLambda) {
        return doQueryUpdate(labelTypeToRoleTypeMapping, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">labelTypeToRoleTypeMappingBhv</span>.<span style="color: #CC4747">queryDelete</span>(labelTypeToRoleTypeMapping, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of LabelTypeToRoleTypeMapping. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<LabelTypeToRoleTypeMappingCB> cbLambda) {
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
     * LabelTypeToRoleTypeMapping labelTypeToRoleTypeMapping = <span style="color: #70226C">new</span> LabelTypeToRoleTypeMapping();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * labelTypeToRoleTypeMapping.setFoo...(value);
     * labelTypeToRoleTypeMapping.setBar...(value);
     * <span style="color: #0000C0">labelTypeToRoleTypeMappingBhv</span>.<span style="color: #CC4747">varyingInsert</span>(labelTypeToRoleTypeMapping, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = labelTypeToRoleTypeMapping.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param labelTypeToRoleTypeMapping The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LabelTypeToRoleTypeMapping labelTypeToRoleTypeMapping, WritableOptionCall<LabelTypeToRoleTypeMappingCB, InsertOption<LabelTypeToRoleTypeMappingCB>> opLambda) {
        doInsert(labelTypeToRoleTypeMapping, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * LabelTypeToRoleTypeMapping labelTypeToRoleTypeMapping = <span style="color: #70226C">new</span> LabelTypeToRoleTypeMapping();
     * labelTypeToRoleTypeMapping.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * labelTypeToRoleTypeMapping.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * labelTypeToRoleTypeMapping.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">labelTypeToRoleTypeMappingBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(labelTypeToRoleTypeMapping, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param labelTypeToRoleTypeMapping The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LabelTypeToRoleTypeMapping labelTypeToRoleTypeMapping, WritableOptionCall<LabelTypeToRoleTypeMappingCB, UpdateOption<LabelTypeToRoleTypeMappingCB>> opLambda) {
        doUpdate(labelTypeToRoleTypeMapping, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param labelTypeToRoleTypeMapping The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LabelTypeToRoleTypeMapping labelTypeToRoleTypeMapping, WritableOptionCall<LabelTypeToRoleTypeMappingCB, InsertOption<LabelTypeToRoleTypeMappingCB>> insertOpLambda, WritableOptionCall<LabelTypeToRoleTypeMappingCB, UpdateOption<LabelTypeToRoleTypeMappingCB>> updateOpLambda) {
        doInsertOrUpdate(labelTypeToRoleTypeMapping, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param labelTypeToRoleTypeMapping The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LabelTypeToRoleTypeMapping labelTypeToRoleTypeMapping, WritableOptionCall<LabelTypeToRoleTypeMappingCB, DeleteOption<LabelTypeToRoleTypeMappingCB>> opLambda) {
        doDelete(labelTypeToRoleTypeMapping, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param labelTypeToRoleTypeMappingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LabelTypeToRoleTypeMapping> labelTypeToRoleTypeMappingList, WritableOptionCall<LabelTypeToRoleTypeMappingCB, InsertOption<LabelTypeToRoleTypeMappingCB>> opLambda) {
        return doBatchInsert(labelTypeToRoleTypeMappingList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param labelTypeToRoleTypeMappingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LabelTypeToRoleTypeMapping> labelTypeToRoleTypeMappingList, WritableOptionCall<LabelTypeToRoleTypeMappingCB, UpdateOption<LabelTypeToRoleTypeMappingCB>> opLambda) {
        return doBatchUpdate(labelTypeToRoleTypeMappingList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param labelTypeToRoleTypeMappingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LabelTypeToRoleTypeMapping> labelTypeToRoleTypeMappingList, WritableOptionCall<LabelTypeToRoleTypeMappingCB, DeleteOption<LabelTypeToRoleTypeMappingCB>> opLambda) {
        return doBatchDelete(labelTypeToRoleTypeMappingList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<LabelTypeToRoleTypeMapping, LabelTypeToRoleTypeMappingCB> manyArgLambda, WritableOptionCall<LabelTypeToRoleTypeMappingCB, InsertOption<LabelTypeToRoleTypeMappingCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LabelTypeToRoleTypeMapping labelTypeToRoleTypeMapping = <span style="color: #70226C">new</span> LabelTypeToRoleTypeMapping();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//labelTypeToRoleTypeMapping.setPK...(value);</span>
     * labelTypeToRoleTypeMapping.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//labelTypeToRoleTypeMapping.setVersionNo(value);</span>
     * <span style="color: #0000C0">labelTypeToRoleTypeMappingBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(labelTypeToRoleTypeMapping, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param labelTypeToRoleTypeMapping The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of LabelTypeToRoleTypeMapping. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LabelTypeToRoleTypeMapping labelTypeToRoleTypeMapping, CBCall<LabelTypeToRoleTypeMappingCB> cbLambda, WritableOptionCall<LabelTypeToRoleTypeMappingCB, UpdateOption<LabelTypeToRoleTypeMappingCB>> opLambda) {
        return doQueryUpdate(labelTypeToRoleTypeMapping, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">labelTypeToRoleTypeMappingBhv</span>.<span style="color: #CC4747">queryDelete</span>(labelTypeToRoleTypeMapping, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of LabelTypeToRoleTypeMapping. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<LabelTypeToRoleTypeMappingCB> cbLambda, WritableOptionCall<LabelTypeToRoleTypeMappingCB, DeleteOption<LabelTypeToRoleTypeMappingCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * labelTypeToRoleTypeMappingBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * labelTypeToRoleTypeMappingBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * labelTypeToRoleTypeMappingBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * labelTypeToRoleTypeMappingBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * labelTypeToRoleTypeMappingBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * labelTypeToRoleTypeMappingBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * labelTypeToRoleTypeMappingBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * labelTypeToRoleTypeMappingBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * labelTypeToRoleTypeMappingBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * labelTypeToRoleTypeMappingBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * labelTypeToRoleTypeMappingBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * labelTypeToRoleTypeMappingBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * labelTypeToRoleTypeMappingBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * labelTypeToRoleTypeMappingBhv.outideSql().removeBlockComment().selectList()
     * labelTypeToRoleTypeMappingBhv.outideSql().removeLineComment().selectList()
     * labelTypeToRoleTypeMappingBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<LabelTypeToRoleTypeMappingBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends LabelTypeToRoleTypeMapping> typeOfSelectedEntity() { return LabelTypeToRoleTypeMapping.class; }
    protected Class<LabelTypeToRoleTypeMapping> typeOfHandlingEntity() { return LabelTypeToRoleTypeMapping.class; }
    protected Class<LabelTypeToRoleTypeMappingCB> typeOfHandlingConditionBean() { return LabelTypeToRoleTypeMappingCB.class; }
}
