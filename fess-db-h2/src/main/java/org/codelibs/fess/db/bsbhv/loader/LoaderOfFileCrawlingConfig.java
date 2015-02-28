package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;
import org.codelibs.fess.db.cbean.*;

/**
 * The referrer loader of FILE_CRAWLING_CONFIG as TABLE. <br>
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
public class LoaderOfFileCrawlingConfig {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<FileCrawlingConfig> _selectedList;
    protected BehaviorSelector _selector;
    protected FileCrawlingConfigBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfFileCrawlingConfig ready(List<FileCrawlingConfig> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected FileCrawlingConfigBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(FileCrawlingConfigBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<FileAuthentication> _referrerFileAuthentication;

    /**
     * Load referrer of fileAuthenticationList by the set-upper of referrer. <br>
     * FILE_AUTHENTICATION by FILE_CRAWLING_CONFIG_ID, named 'fileAuthenticationList'.
     * <pre>
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">fileCrawlingConfigList</span>, <span style="color: #553000">configLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">configLoader</span>.<span style="color: #CC4747">loadFileAuthentication</span>(<span style="color: #553000">authenticationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">authenticationCB</span>.setupSelect...
     *         <span style="color: #553000">authenticationCB</span>.query().set...
     *         <span style="color: #553000">authenticationCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">authenticationLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    authenticationLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (FileCrawlingConfig fileCrawlingConfig : <span style="color: #553000">fileCrawlingConfigList</span>) {
     *     ... = fileCrawlingConfig.<span style="color: #CC4747">getFileAuthenticationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFileCrawlingConfigId_InScope(pkList);
     * cb.query().addOrderBy_FileCrawlingConfigId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfFileAuthentication> loadFileAuthentication(ReferrerConditionSetupper<FileAuthenticationCB> refCBLambda) {
        myBhv().loadFileAuthentication(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerFileAuthentication = refLs);
        return hd -> hd.handle(new LoaderOfFileAuthentication().ready(_referrerFileAuthentication, _selector));
    }

    protected List<FileConfigToLabelTypeMapping> _referrerFileConfigToLabelTypeMapping;

    /**
     * Load referrer of fileConfigToLabelTypeMappingList by the set-upper of referrer. <br>
     * FILE_CONFIG_TO_LABEL_TYPE_MAPPING by FILE_CONFIG_ID, named 'fileConfigToLabelTypeMappingList'.
     * <pre>
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">fileCrawlingConfigList</span>, <span style="color: #553000">configLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">configLoader</span>.<span style="color: #CC4747">loadFileConfigToLabelTypeMapping</span>(<span style="color: #553000">mappingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mappingCB</span>.setupSelect...
     *         <span style="color: #553000">mappingCB</span>.query().set...
     *         <span style="color: #553000">mappingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mappingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mappingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (FileCrawlingConfig fileCrawlingConfig : <span style="color: #553000">fileCrawlingConfigList</span>) {
     *     ... = fileCrawlingConfig.<span style="color: #CC4747">getFileConfigToLabelTypeMappingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFileConfigId_InScope(pkList);
     * cb.query().addOrderBy_FileConfigId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfFileConfigToLabelTypeMapping> loadFileConfigToLabelTypeMapping(ReferrerConditionSetupper<FileConfigToLabelTypeMappingCB> refCBLambda) {
        myBhv().loadFileConfigToLabelTypeMapping(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerFileConfigToLabelTypeMapping = refLs);
        return hd -> hd.handle(new LoaderOfFileConfigToLabelTypeMapping().ready(_referrerFileConfigToLabelTypeMapping, _selector));
    }

    protected List<FileConfigToRoleTypeMapping> _referrerFileConfigToRoleTypeMapping;

    /**
     * Load referrer of fileConfigToRoleTypeMappingList by the set-upper of referrer. <br>
     * FILE_CONFIG_TO_ROLE_TYPE_MAPPING by FILE_CONFIG_ID, named 'fileConfigToRoleTypeMappingList'.
     * <pre>
     * <span style="color: #0000C0">fileCrawlingConfigBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">fileCrawlingConfigList</span>, <span style="color: #553000">configLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">configLoader</span>.<span style="color: #CC4747">loadFileConfigToRoleTypeMapping</span>(<span style="color: #553000">mappingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mappingCB</span>.setupSelect...
     *         <span style="color: #553000">mappingCB</span>.query().set...
     *         <span style="color: #553000">mappingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mappingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mappingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (FileCrawlingConfig fileCrawlingConfig : <span style="color: #553000">fileCrawlingConfigList</span>) {
     *     ... = fileCrawlingConfig.<span style="color: #CC4747">getFileConfigToRoleTypeMappingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFileConfigId_InScope(pkList);
     * cb.query().addOrderBy_FileConfigId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfFileConfigToRoleTypeMapping> loadFileConfigToRoleTypeMapping(ReferrerConditionSetupper<FileConfigToRoleTypeMappingCB> refCBLambda) {
        myBhv().loadFileConfigToRoleTypeMapping(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerFileConfigToRoleTypeMapping = refLs);
        return hd -> hd.handle(new LoaderOfFileConfigToRoleTypeMapping().ready(_referrerFileConfigToRoleTypeMapping, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<FileCrawlingConfig> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
