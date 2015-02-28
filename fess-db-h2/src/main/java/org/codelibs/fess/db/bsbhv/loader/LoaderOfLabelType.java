package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;
import org.codelibs.fess.db.cbean.*;

/**
 * The referrer loader of LABEL_TYPE as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, NAME, VALUE, INCLUDED_PATHS, EXCLUDED_PATHS, SORT_ORDER, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME, DELETED_BY, DELETED_TIME, VERSION_NO
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
 *     DATA_CONFIG_TO_LABEL_TYPE_MAPPING, FILE_CONFIG_TO_LABEL_TYPE_MAPPING, LABEL_TYPE_TO_ROLE_TYPE_MAPPING, WEB_CONFIG_TO_LABEL_TYPE_MAPPING
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     dataConfigToLabelTypeMappingList, fileConfigToLabelTypeMappingList, labelTypeToRoleTypeMappingList, webConfigToLabelTypeMappingList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfLabelType {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LabelType> _selectedList;
    protected BehaviorSelector _selector;
    protected LabelTypeBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfLabelType ready(List<LabelType> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LabelTypeBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LabelTypeBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<DataConfigToLabelTypeMapping> _referrerDataConfigToLabelTypeMapping;

    /**
     * Load referrer of dataConfigToLabelTypeMappingList by the set-upper of referrer. <br>
     * DATA_CONFIG_TO_LABEL_TYPE_MAPPING by LABEL_TYPE_ID, named 'dataConfigToLabelTypeMappingList'.
     * <pre>
     * <span style="color: #0000C0">labelTypeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">labelTypeList</span>, <span style="color: #553000">typeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">typeLoader</span>.<span style="color: #CC4747">loadDataConfigToLabelTypeMapping</span>(<span style="color: #553000">mappingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mappingCB</span>.setupSelect...
     *         <span style="color: #553000">mappingCB</span>.query().set...
     *         <span style="color: #553000">mappingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mappingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mappingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (LabelType labelType : <span style="color: #553000">labelTypeList</span>) {
     *     ... = labelType.<span style="color: #CC4747">getDataConfigToLabelTypeMappingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLabelTypeId_InScope(pkList);
     * cb.query().addOrderBy_LabelTypeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfDataConfigToLabelTypeMapping> loadDataConfigToLabelTypeMapping(ReferrerConditionSetupper<DataConfigToLabelTypeMappingCB> refCBLambda) {
        myBhv().loadDataConfigToLabelTypeMapping(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerDataConfigToLabelTypeMapping = refLs);
        return hd -> hd.handle(new LoaderOfDataConfigToLabelTypeMapping().ready(_referrerDataConfigToLabelTypeMapping, _selector));
    }

    protected List<FileConfigToLabelTypeMapping> _referrerFileConfigToLabelTypeMapping;

    /**
     * Load referrer of fileConfigToLabelTypeMappingList by the set-upper of referrer. <br>
     * FILE_CONFIG_TO_LABEL_TYPE_MAPPING by LABEL_TYPE_ID, named 'fileConfigToLabelTypeMappingList'.
     * <pre>
     * <span style="color: #0000C0">labelTypeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">labelTypeList</span>, <span style="color: #553000">typeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">typeLoader</span>.<span style="color: #CC4747">loadFileConfigToLabelTypeMapping</span>(<span style="color: #553000">mappingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mappingCB</span>.setupSelect...
     *         <span style="color: #553000">mappingCB</span>.query().set...
     *         <span style="color: #553000">mappingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mappingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mappingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (LabelType labelType : <span style="color: #553000">labelTypeList</span>) {
     *     ... = labelType.<span style="color: #CC4747">getFileConfigToLabelTypeMappingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLabelTypeId_InScope(pkList);
     * cb.query().addOrderBy_LabelTypeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfFileConfigToLabelTypeMapping> loadFileConfigToLabelTypeMapping(ReferrerConditionSetupper<FileConfigToLabelTypeMappingCB> refCBLambda) {
        myBhv().loadFileConfigToLabelTypeMapping(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerFileConfigToLabelTypeMapping = refLs);
        return hd -> hd.handle(new LoaderOfFileConfigToLabelTypeMapping().ready(_referrerFileConfigToLabelTypeMapping, _selector));
    }

    protected List<LabelTypeToRoleTypeMapping> _referrerLabelTypeToRoleTypeMapping;

    /**
     * Load referrer of labelTypeToRoleTypeMappingList by the set-upper of referrer. <br>
     * LABEL_TYPE_TO_ROLE_TYPE_MAPPING by LABEL_TYPE_ID, named 'labelTypeToRoleTypeMappingList'.
     * <pre>
     * <span style="color: #0000C0">labelTypeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">labelTypeList</span>, <span style="color: #553000">typeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">typeLoader</span>.<span style="color: #CC4747">loadLabelTypeToRoleTypeMapping</span>(<span style="color: #553000">mappingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mappingCB</span>.setupSelect...
     *         <span style="color: #553000">mappingCB</span>.query().set...
     *         <span style="color: #553000">mappingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mappingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mappingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (LabelType labelType : <span style="color: #553000">labelTypeList</span>) {
     *     ... = labelType.<span style="color: #CC4747">getLabelTypeToRoleTypeMappingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLabelTypeId_InScope(pkList);
     * cb.query().addOrderBy_LabelTypeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfLabelTypeToRoleTypeMapping> loadLabelTypeToRoleTypeMapping(ReferrerConditionSetupper<LabelTypeToRoleTypeMappingCB> refCBLambda) {
        myBhv().loadLabelTypeToRoleTypeMapping(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerLabelTypeToRoleTypeMapping = refLs);
        return hd -> hd.handle(new LoaderOfLabelTypeToRoleTypeMapping().ready(_referrerLabelTypeToRoleTypeMapping, _selector));
    }

    protected List<WebConfigToLabelTypeMapping> _referrerWebConfigToLabelTypeMapping;

    /**
     * Load referrer of webConfigToLabelTypeMappingList by the set-upper of referrer. <br>
     * WEB_CONFIG_TO_LABEL_TYPE_MAPPING by LABEL_TYPE_ID, named 'webConfigToLabelTypeMappingList'.
     * <pre>
     * <span style="color: #0000C0">labelTypeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">labelTypeList</span>, <span style="color: #553000">typeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">typeLoader</span>.<span style="color: #CC4747">loadWebConfigToLabelTypeMapping</span>(<span style="color: #553000">mappingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mappingCB</span>.setupSelect...
     *         <span style="color: #553000">mappingCB</span>.query().set...
     *         <span style="color: #553000">mappingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mappingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mappingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (LabelType labelType : <span style="color: #553000">labelTypeList</span>) {
     *     ... = labelType.<span style="color: #CC4747">getWebConfigToLabelTypeMappingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLabelTypeId_InScope(pkList);
     * cb.query().addOrderBy_LabelTypeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWebConfigToLabelTypeMapping> loadWebConfigToLabelTypeMapping(ReferrerConditionSetupper<WebConfigToLabelTypeMappingCB> refCBLambda) {
        myBhv().loadWebConfigToLabelTypeMapping(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWebConfigToLabelTypeMapping = refLs);
        return hd -> hd.handle(new LoaderOfWebConfigToLabelTypeMapping().ready(_referrerWebConfigToLabelTypeMapping, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LabelType> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
