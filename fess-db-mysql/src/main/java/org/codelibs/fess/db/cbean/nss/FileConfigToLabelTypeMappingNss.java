package org.codelibs.fess.db.cbean.nss;

import org.codelibs.fess.db.cbean.cq.FileConfigToLabelTypeMappingCQ;

/**
 * The nest select set-upper of FILE_CONFIG_TO_LABEL_TYPE_MAPPING.
 * @author DBFlute(AutoGenerator)
 */
public class FileConfigToLabelTypeMappingNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final FileConfigToLabelTypeMappingCQ _query;
    public FileConfigToLabelTypeMappingNss(FileConfigToLabelTypeMappingCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * FILE_CRAWLING_CONFIG by my FILE_CONFIG_ID, named 'fileCrawlingConfig'.
     */
    public void withFileCrawlingConfig() {
        _query.xdoNss(() -> _query.queryFileCrawlingConfig());
    }
    /**
     * With nested relation columns to select clause. <br>
     * LABEL_TYPE by my LABEL_TYPE_ID, named 'labelType'.
     */
    public void withLabelType() {
        _query.xdoNss(() -> _query.queryLabelType());
    }
}
