package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;
import org.codelibs.fess.db.cbean.*;

/**
 * The referrer loader of WEB_CRAWLING_CONFIG as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, NAME, URLS, INCLUDED_URLS, EXCLUDED_URLS, INCLUDED_DOC_URLS, EXCLUDED_DOC_URLS, CONFIG_PARAMETER, DEPTH, MAX_ACCESS_COUNT, USER_AGENT, NUM_OF_THREAD, INTERVAL_TIME, BOOST, AVAILABLE, SORT_ORDER, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME, DELETED_BY, DELETED_TIME, VERSION_NO
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
 *     REQUEST_HEADER, WEB_AUTHENTICATION, WEB_CONFIG_TO_LABEL_TYPE_MAPPING, WEB_CONFIG_TO_ROLE_TYPE_MAPPING
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     requestHeaderList, webAuthenticationList, webConfigToLabelTypeMappingList, webConfigToRoleTypeMappingList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWebCrawlingConfig {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WebCrawlingConfig> _selectedList;
    protected BehaviorSelector _selector;
    protected WebCrawlingConfigBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWebCrawlingConfig ready(List<WebCrawlingConfig> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WebCrawlingConfigBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WebCrawlingConfigBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<RequestHeader> _referrerRequestHeader;

    /**
     * Load referrer of requestHeaderList by the set-upper of referrer. <br>
     * REQUEST_HEADER by WEB_CRAWLING_CONFIG_ID, named 'requestHeaderList'.
     * <pre>
     * <span style="color: #0000C0">webCrawlingConfigBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">webCrawlingConfigList</span>, <span style="color: #553000">configLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">configLoader</span>.<span style="color: #CC4747">loadRequestHeader</span>(<span style="color: #553000">headerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">headerCB</span>.setupSelect...
     *         <span style="color: #553000">headerCB</span>.query().set...
     *         <span style="color: #553000">headerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">headerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    headerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WebCrawlingConfig webCrawlingConfig : <span style="color: #553000">webCrawlingConfigList</span>) {
     *     ... = webCrawlingConfig.<span style="color: #CC4747">getRequestHeaderList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWebCrawlingConfigId_InScope(pkList);
     * cb.query().addOrderBy_WebCrawlingConfigId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfRequestHeader> loadRequestHeader(ReferrerConditionSetupper<RequestHeaderCB> refCBLambda) {
        myBhv().loadRequestHeader(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerRequestHeader = refLs);
        return hd -> hd.handle(new LoaderOfRequestHeader().ready(_referrerRequestHeader, _selector));
    }

    protected List<WebAuthentication> _referrerWebAuthentication;

    /**
     * Load referrer of webAuthenticationList by the set-upper of referrer. <br>
     * WEB_AUTHENTICATION by WEB_CRAWLING_CONFIG_ID, named 'webAuthenticationList'.
     * <pre>
     * <span style="color: #0000C0">webCrawlingConfigBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">webCrawlingConfigList</span>, <span style="color: #553000">configLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">configLoader</span>.<span style="color: #CC4747">loadWebAuthentication</span>(<span style="color: #553000">authenticationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">authenticationCB</span>.setupSelect...
     *         <span style="color: #553000">authenticationCB</span>.query().set...
     *         <span style="color: #553000">authenticationCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">authenticationLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    authenticationLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WebCrawlingConfig webCrawlingConfig : <span style="color: #553000">webCrawlingConfigList</span>) {
     *     ... = webCrawlingConfig.<span style="color: #CC4747">getWebAuthenticationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWebCrawlingConfigId_InScope(pkList);
     * cb.query().addOrderBy_WebCrawlingConfigId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWebAuthentication> loadWebAuthentication(ReferrerConditionSetupper<WebAuthenticationCB> refCBLambda) {
        myBhv().loadWebAuthentication(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWebAuthentication = refLs);
        return hd -> hd.handle(new LoaderOfWebAuthentication().ready(_referrerWebAuthentication, _selector));
    }

    protected List<WebConfigToLabelTypeMapping> _referrerWebConfigToLabelTypeMapping;

    /**
     * Load referrer of webConfigToLabelTypeMappingList by the set-upper of referrer. <br>
     * WEB_CONFIG_TO_LABEL_TYPE_MAPPING by WEB_CONFIG_ID, named 'webConfigToLabelTypeMappingList'.
     * <pre>
     * <span style="color: #0000C0">webCrawlingConfigBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">webCrawlingConfigList</span>, <span style="color: #553000">configLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">configLoader</span>.<span style="color: #CC4747">loadWebConfigToLabelTypeMapping</span>(<span style="color: #553000">mappingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mappingCB</span>.setupSelect...
     *         <span style="color: #553000">mappingCB</span>.query().set...
     *         <span style="color: #553000">mappingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mappingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mappingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WebCrawlingConfig webCrawlingConfig : <span style="color: #553000">webCrawlingConfigList</span>) {
     *     ... = webCrawlingConfig.<span style="color: #CC4747">getWebConfigToLabelTypeMappingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWebConfigId_InScope(pkList);
     * cb.query().addOrderBy_WebConfigId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWebConfigToLabelTypeMapping> loadWebConfigToLabelTypeMapping(ReferrerConditionSetupper<WebConfigToLabelTypeMappingCB> refCBLambda) {
        myBhv().loadWebConfigToLabelTypeMapping(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWebConfigToLabelTypeMapping = refLs);
        return hd -> hd.handle(new LoaderOfWebConfigToLabelTypeMapping().ready(_referrerWebConfigToLabelTypeMapping, _selector));
    }

    protected List<WebConfigToRoleTypeMapping> _referrerWebConfigToRoleTypeMapping;

    /**
     * Load referrer of webConfigToRoleTypeMappingList by the set-upper of referrer. <br>
     * WEB_CONFIG_TO_ROLE_TYPE_MAPPING by WEB_CONFIG_ID, named 'webConfigToRoleTypeMappingList'.
     * <pre>
     * <span style="color: #0000C0">webCrawlingConfigBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">webCrawlingConfigList</span>, <span style="color: #553000">configLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">configLoader</span>.<span style="color: #CC4747">loadWebConfigToRoleTypeMapping</span>(<span style="color: #553000">mappingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mappingCB</span>.setupSelect...
     *         <span style="color: #553000">mappingCB</span>.query().set...
     *         <span style="color: #553000">mappingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mappingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mappingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WebCrawlingConfig webCrawlingConfig : <span style="color: #553000">webCrawlingConfigList</span>) {
     *     ... = webCrawlingConfig.<span style="color: #CC4747">getWebConfigToRoleTypeMappingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWebConfigId_InScope(pkList);
     * cb.query().addOrderBy_WebConfigId_Asc();
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
    public List<WebCrawlingConfig> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
