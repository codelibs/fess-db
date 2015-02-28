package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;
import org.codelibs.fess.db.cbean.*;

/**
 * The referrer loader of ROLE_TYPE as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, NAME, VALUE, SORT_ORDER, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME, DELETED_BY, DELETED_TIME, VERSION_NO
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
 *     DATA_CONFIG_TO_ROLE_TYPE_MAPPING, FILE_CONFIG_TO_ROLE_TYPE_MAPPING, LABEL_TYPE_TO_ROLE_TYPE_MAPPING, WEB_CONFIG_TO_ROLE_TYPE_MAPPING
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     dataConfigToRoleTypeMappingList, fileConfigToRoleTypeMappingList, labelTypeToRoleTypeMappingList, webConfigToRoleTypeMappingList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfRoleType {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<RoleType> _selectedList;
    protected BehaviorSelector _selector;
    protected RoleTypeBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfRoleType ready(List<RoleType> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected RoleTypeBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(RoleTypeBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<DataConfigToRoleTypeMapping> _referrerDataConfigToRoleTypeMapping;

    /**
     * Load referrer of dataConfigToRoleTypeMappingList by the set-upper of referrer. <br>
     * DATA_CONFIG_TO_ROLE_TYPE_MAPPING by ROLE_TYPE_ID, named 'dataConfigToRoleTypeMappingList'.
     * <pre>
     * <span style="color: #0000C0">roleTypeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">roleTypeList</span>, <span style="color: #553000">typeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">typeLoader</span>.<span style="color: #CC4747">loadDataConfigToRoleTypeMapping</span>(<span style="color: #553000">mappingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mappingCB</span>.setupSelect...
     *         <span style="color: #553000">mappingCB</span>.query().set...
     *         <span style="color: #553000">mappingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mappingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mappingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (RoleType roleType : <span style="color: #553000">roleTypeList</span>) {
     *     ... = roleType.<span style="color: #CC4747">getDataConfigToRoleTypeMappingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleTypeId_InScope(pkList);
     * cb.query().addOrderBy_RoleTypeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfDataConfigToRoleTypeMapping> loadDataConfigToRoleTypeMapping(ReferrerConditionSetupper<DataConfigToRoleTypeMappingCB> refCBLambda) {
        myBhv().loadDataConfigToRoleTypeMapping(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerDataConfigToRoleTypeMapping = refLs);
        return hd -> hd.handle(new LoaderOfDataConfigToRoleTypeMapping().ready(_referrerDataConfigToRoleTypeMapping, _selector));
    }

    protected List<FileConfigToRoleTypeMapping> _referrerFileConfigToRoleTypeMapping;

    /**
     * Load referrer of fileConfigToRoleTypeMappingList by the set-upper of referrer. <br>
     * FILE_CONFIG_TO_ROLE_TYPE_MAPPING by ROLE_TYPE_ID, named 'fileConfigToRoleTypeMappingList'.
     * <pre>
     * <span style="color: #0000C0">roleTypeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">roleTypeList</span>, <span style="color: #553000">typeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">typeLoader</span>.<span style="color: #CC4747">loadFileConfigToRoleTypeMapping</span>(<span style="color: #553000">mappingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mappingCB</span>.setupSelect...
     *         <span style="color: #553000">mappingCB</span>.query().set...
     *         <span style="color: #553000">mappingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mappingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mappingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (RoleType roleType : <span style="color: #553000">roleTypeList</span>) {
     *     ... = roleType.<span style="color: #CC4747">getFileConfigToRoleTypeMappingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleTypeId_InScope(pkList);
     * cb.query().addOrderBy_RoleTypeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfFileConfigToRoleTypeMapping> loadFileConfigToRoleTypeMapping(ReferrerConditionSetupper<FileConfigToRoleTypeMappingCB> refCBLambda) {
        myBhv().loadFileConfigToRoleTypeMapping(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerFileConfigToRoleTypeMapping = refLs);
        return hd -> hd.handle(new LoaderOfFileConfigToRoleTypeMapping().ready(_referrerFileConfigToRoleTypeMapping, _selector));
    }

    protected List<LabelTypeToRoleTypeMapping> _referrerLabelTypeToRoleTypeMapping;

    /**
     * Load referrer of labelTypeToRoleTypeMappingList by the set-upper of referrer. <br>
     * LABEL_TYPE_TO_ROLE_TYPE_MAPPING by ROLE_TYPE_ID, named 'labelTypeToRoleTypeMappingList'.
     * <pre>
     * <span style="color: #0000C0">roleTypeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">roleTypeList</span>, <span style="color: #553000">typeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">typeLoader</span>.<span style="color: #CC4747">loadLabelTypeToRoleTypeMapping</span>(<span style="color: #553000">mappingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mappingCB</span>.setupSelect...
     *         <span style="color: #553000">mappingCB</span>.query().set...
     *         <span style="color: #553000">mappingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mappingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mappingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (RoleType roleType : <span style="color: #553000">roleTypeList</span>) {
     *     ... = roleType.<span style="color: #CC4747">getLabelTypeToRoleTypeMappingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleTypeId_InScope(pkList);
     * cb.query().addOrderBy_RoleTypeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfLabelTypeToRoleTypeMapping> loadLabelTypeToRoleTypeMapping(ReferrerConditionSetupper<LabelTypeToRoleTypeMappingCB> refCBLambda) {
        myBhv().loadLabelTypeToRoleTypeMapping(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerLabelTypeToRoleTypeMapping = refLs);
        return hd -> hd.handle(new LoaderOfLabelTypeToRoleTypeMapping().ready(_referrerLabelTypeToRoleTypeMapping, _selector));
    }

    protected List<WebConfigToRoleTypeMapping> _referrerWebConfigToRoleTypeMapping;

    /**
     * Load referrer of webConfigToRoleTypeMappingList by the set-upper of referrer. <br>
     * WEB_CONFIG_TO_ROLE_TYPE_MAPPING by ROLE_TYPE_ID, named 'webConfigToRoleTypeMappingList'.
     * <pre>
     * <span style="color: #0000C0">roleTypeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">roleTypeList</span>, <span style="color: #553000">typeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">typeLoader</span>.<span style="color: #CC4747">loadWebConfigToRoleTypeMapping</span>(<span style="color: #553000">mappingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mappingCB</span>.setupSelect...
     *         <span style="color: #553000">mappingCB</span>.query().set...
     *         <span style="color: #553000">mappingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mappingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mappingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (RoleType roleType : <span style="color: #553000">roleTypeList</span>) {
     *     ... = roleType.<span style="color: #CC4747">getWebConfigToRoleTypeMappingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleTypeId_InScope(pkList);
     * cb.query().addOrderBy_RoleTypeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWebConfigToRoleTypeMapping> loadWebConfigToRoleTypeMapping(ReferrerConditionSetupper<WebConfigToRoleTypeMappingCB> refCBLambda) {
        myBhv().loadWebConfigToRoleTypeMapping(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWebConfigToRoleTypeMapping = refLs);
        return hd -> hd.handle(new LoaderOfWebConfigToRoleTypeMapping().ready(_referrerWebConfigToRoleTypeMapping, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<RoleType> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
