package org.codelibs.fess.db.cbean.nss;

import org.codelibs.fess.db.cbean.cq.WebConfigToLabelTypeMappingCQ;

/**
 * The nest select set-upper of WEB_CONFIG_TO_LABEL_TYPE_MAPPING.
 * @author DBFlute(AutoGenerator)
 */
public class WebConfigToLabelTypeMappingNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WebConfigToLabelTypeMappingCQ _query;
    public WebConfigToLabelTypeMappingNss(WebConfigToLabelTypeMappingCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * LABEL_TYPE by my LABEL_TYPE_ID, named 'labelType'.
     */
    public void withLabelType() {
        _query.xdoNss(() -> _query.queryLabelType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WEB_CRAWLING_CONFIG by my WEB_CONFIG_ID, named 'webCrawlingConfig'.
     */
    public void withWebCrawlingConfig() {
        _query.xdoNss(() -> _query.queryWebCrawlingConfig());
    }
}
