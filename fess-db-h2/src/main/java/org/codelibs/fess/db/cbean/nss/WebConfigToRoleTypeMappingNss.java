package org.codelibs.fess.db.cbean.nss;

import org.codelibs.fess.db.cbean.cq.WebConfigToRoleTypeMappingCQ;

/**
 * The nest select set-upper of WEB_CONFIG_TO_ROLE_TYPE_MAPPING.
 * @author DBFlute(AutoGenerator)
 */
public class WebConfigToRoleTypeMappingNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WebConfigToRoleTypeMappingCQ _query;
    public WebConfigToRoleTypeMappingNss(WebConfigToRoleTypeMappingCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * ROLE_TYPE by my ROLE_TYPE_ID, named 'roleType'.
     */
    public void withRoleType() {
        _query.xdoNss(() -> _query.queryRoleType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WEB_CRAWLING_CONFIG by my WEB_CONFIG_ID, named 'webCrawlingConfig'.
     */
    public void withWebCrawlingConfig() {
        _query.xdoNss(() -> _query.queryWebCrawlingConfig());
    }
}
