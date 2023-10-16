package com.zwj.database.view.common;

import cn.smallbun.screw.core.engine.EngineFileType;
import org.apache.commons.lang.StringUtils;

/**
 * @Author zhouwenjie
 * @Description
 * @Date 2023/10/16 17:09
 **/
public class DataBaseConstant {

    private static final String FILE_TYPE_HTML = "html";
    private static final String FILE_TYPE_WORD = "word";
    private static final String FILE_TYPE_MD = "md";

    public static EngineFileType getEngineFileTypeByType(String fileType) {
        if (StringUtils.isEmpty(fileType) || FILE_TYPE_HTML.equals(fileType)) {
            return EngineFileType.HTML;
        }
        if (FILE_TYPE_WORD.equals(fileType)) {
            return EngineFileType.WORD;
        }
        if (FILE_TYPE_MD.equals(fileType)) {
            return EngineFileType.MD;
        }
        return EngineFileType.HTML;
    }
}
