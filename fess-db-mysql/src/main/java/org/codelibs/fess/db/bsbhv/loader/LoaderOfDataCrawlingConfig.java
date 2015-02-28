package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;
import org.codelibs.fess.db.cbean.*;

/**
 * The referrer loader of DATA_CRAWLING_CONFIG as TABLE. <br>
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
public class LoaderOfDataCrawlingConfig {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DataCrawlingConfig> _selectedList;
    protected BehaviorSelector _selector;
    protected DataCrawlingConfigBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfDataCrawlingConfig ready(List<DataCrawlingConfig> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DataCrawlingConfigBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DataCrawlingConfigBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<DataConfigToLabelTypeMapping> _referrerDataConfigToLabelTypeMapping;

    /**
     * Load referrer of dataConfigToLabelTypeMappingList by the set-upper of referrer. <br>
     * DATA_CONFIG_TO_LABEL_TYPE_MAPPING by DATA_CONFIG_ID, named 'dataConfigToLabelTypeMappingList'.
     * <pre>
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">dataCrawlingConfigList</span>, <span style="color: #553000">configLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">configLoader</span>.<span style="color: #CC4747">loadDataConfigToLabelTypeMapping</span>(<span style="color: #553000">mappingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mappingCB</span>.setupSelect...
     *         <span style="color: #553000">mappingCB</span>.query().set...
     *         <span style="color: #553000">mappingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mappingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mappingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DataCrawlingConfig dataCrawlingConfig : <span style="color: #553000">dataCrawlingConfigList</span>) {
     *     ... = dataCrawlingConfig.<span style="color: #CC4747">getDataConfigToLabelTypeMappingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDataConfigId_InScope(pkList);
     * cb.query().addOrderBy_DataConfigId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfDataConfigToLabelTypeMapping> loadDataConfigToLabelTypeMapping(ReferrerConditionSetupper<DataConfigToLabelTypeMappingCB> refCBLambda) {
        myBhv().loadDataConfigToLabelTypeMapping(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerDataConfigToLabelTypeMapping = refLs);
        return hd -> hd.handle(new LoaderOfDataConfigToLabelTypeMapping().ready(_referrerDataConfigToLabelTypeMapping, _selector));
    }

    protected List<DataConfigToRoleTypeMapping> _referrerDataConfigToRoleTypeMapping;

    /**
     * Load referrer of dataConfigToRoleTypeMappingList by the set-upper of referrer. <br>
     * DATA_CONFIG_TO_ROLE_TYPE_MAPPING by DATA_CONFIG_ID, named 'dataConfigToRoleTypeMappingList'.
     * <pre>
     * <span style="color: #0000C0">dataCrawlingConfigBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">dataCrawlingConfigList</span>, <span style="color: #553000">configLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">configLoader</span>.<span style="color: #CC4747">loadDataConfigToRoleTypeMapping</span>(<span style="color: #553000">mappingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mappingCB</span>.setupSelect...
     *         <span style="color: #553000">mappingCB</span>.query().set...
     *         <span style="color: #553000">mappingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mappingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mappingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (DataCrawlingConfig dataCrawlingConfig : <span style="color: #553000">dataCrawlingConfigList</span>) {
     *     ... = dataCrawlingConfig.<span style="color: #CC4747">getDataConfigToRoleTypeMappingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDataConfigId_InScope(pkList);
     * cb.query().addOrderBy_DataConfigId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfDataConfigToRoleTypeMapping> loadDataConfigToRoleTypeMapping(ReferrerConditionSetupper<DataConfigToRoleTypeMappingCB> refCBLambda) {
        myBhv().loadDataConfigToRoleTypeMapping(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerDataConfigToRoleTypeMapping = refLs);
        return hd -> hd.handle(new LoaderOfDataConfigToRoleTypeMapping().ready(_referrerDataConfigToRoleTypeMapping, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DataCrawlingConfig> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
