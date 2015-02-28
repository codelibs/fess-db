package org.codelibs.fess.db.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.codelibs.fess.db.allcommon.DBMetaInstanceHandler;
import org.codelibs.fess.db.exentity.*;

/**
 * The entity of FILE_CONFIG_TO_LABEL_TYPE_MAPPING as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ID
 * 
 * [column]
 *     ID, FILE_CONFIG_ID, LABEL_TYPE_ID
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
 *     FILE_CRAWLING_CONFIG, LABEL_TYPE
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     fileCrawlingConfig, labelType
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long id = entity.getId();
 * Long fileConfigId = entity.getFileConfigId();
 * Long labelTypeId = entity.getLabelTypeId();
 * entity.setId(id);
 * entity.setFileConfigId(fileConfigId);
 * entity.setLabelTypeId(labelTypeId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsFileConfigToLabelTypeMapping extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _id;

    /** FILE_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to FILE_CRAWLING_CONFIG} */
    protected Long _fileConfigId;

    /** LABEL_TYPE_ID: {IX, NotNull, BIGINT(19), FK to LABEL_TYPE} */
    protected Long _labelTypeId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "FILE_CONFIG_TO_LABEL_TYPE_MAPPING";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** FILE_CRAWLING_CONFIG by my FILE_CONFIG_ID, named 'fileCrawlingConfig'. */
    protected OptionalEntity<FileCrawlingConfig> _fileCrawlingConfig;

    /**
     * [get] FILE_CRAWLING_CONFIG by my FILE_CONFIG_ID, named 'fileCrawlingConfig'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'fileCrawlingConfig'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<FileCrawlingConfig> getFileCrawlingConfig() {
        if (_fileCrawlingConfig == null) { _fileCrawlingConfig = OptionalEntity.relationEmpty(this, "fileCrawlingConfig"); }
        return _fileCrawlingConfig;
    }

    /**
     * [set] FILE_CRAWLING_CONFIG by my FILE_CONFIG_ID, named 'fileCrawlingConfig'.
     * @param fileCrawlingConfig The entity of foreign property 'fileCrawlingConfig'. (NullAllowed)
     */
    public void setFileCrawlingConfig(OptionalEntity<FileCrawlingConfig> fileCrawlingConfig) {
        _fileCrawlingConfig = fileCrawlingConfig;
    }

    /** LABEL_TYPE by my LABEL_TYPE_ID, named 'labelType'. */
    protected OptionalEntity<LabelType> _labelType;

    /**
     * [get] LABEL_TYPE by my LABEL_TYPE_ID, named 'labelType'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'labelType'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<LabelType> getLabelType() {
        if (_labelType == null) { _labelType = OptionalEntity.relationEmpty(this, "labelType"); }
        return _labelType;
    }

    /**
     * [set] LABEL_TYPE by my LABEL_TYPE_ID, named 'labelType'.
     * @param labelType The entity of foreign property 'labelType'. (NullAllowed)
     */
    public void setLabelType(OptionalEntity<LabelType> labelType) {
        _labelType = labelType;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsFileConfigToLabelTypeMapping) {
            BsFileConfigToLabelTypeMapping other = (BsFileConfigToLabelTypeMapping)obj;
            if (!xSV(_id, other._id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_fileCrawlingConfig != null && _fileCrawlingConfig.isPresent())
        { sb.append(li).append(xbRDS(_fileCrawlingConfig, "fileCrawlingConfig")); }
        if (_labelType != null && _labelType.isPresent())
        { sb.append(li).append(xbRDS(_labelType, "labelType")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_fileConfigId));
        sb.append(dm).append(xfND(_labelTypeId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_fileCrawlingConfig != null && _fileCrawlingConfig.isPresent())
        { sb.append(dm).append("fileCrawlingConfig"); }
        if (_labelType != null && _labelType.isPresent())
        { sb.append(dm).append("labelType"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public FileConfigToLabelTypeMapping clone() {
        return (FileConfigToLabelTypeMapping)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getId() {
        checkSpecifiedProperty("id");
        return _id;
    }

    /**
     * [set] ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param id The value of the column 'ID'. (basically NotNull if update: for the constraint)
     */
    public void setId(Long id) {
        registerModifiedProperty("id");
        _id = id;
    }

    /**
     * [get] FILE_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to FILE_CRAWLING_CONFIG} <br>
     * @return The value of the column 'FILE_CONFIG_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getFileConfigId() {
        checkSpecifiedProperty("fileConfigId");
        return _fileConfigId;
    }

    /**
     * [set] FILE_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to FILE_CRAWLING_CONFIG} <br>
     * @param fileConfigId The value of the column 'FILE_CONFIG_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFileConfigId(Long fileConfigId) {
        registerModifiedProperty("fileConfigId");
        _fileConfigId = fileConfigId;
    }

    /**
     * [get] LABEL_TYPE_ID: {IX, NotNull, BIGINT(19), FK to LABEL_TYPE} <br>
     * @return The value of the column 'LABEL_TYPE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLabelTypeId() {
        checkSpecifiedProperty("labelTypeId");
        return _labelTypeId;
    }

    /**
     * [set] LABEL_TYPE_ID: {IX, NotNull, BIGINT(19), FK to LABEL_TYPE} <br>
     * @param labelTypeId The value of the column 'LABEL_TYPE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLabelTypeId(Long labelTypeId) {
        registerModifiedProperty("labelTypeId");
        _labelTypeId = labelTypeId;
    }
}
