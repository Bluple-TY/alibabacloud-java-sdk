// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMattingJobRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    // 输入文件
    @NameInMap("InputFile")
    public String inputFile;

    // 输入文件类型
    @NameInMap("InputType")
    public String inputType;

    // 输出bucket
    @NameInMap("OutputConfig")
    public String outputConfig;

    // 输出类型
    @NameInMap("OutputMediaTarget")
    public String outputMediaTarget;

    // 是否强制覆盖现有OSS文件
    @NameInMap("Overwrite")
    public String overwrite;

    @NameInMap("Title")
    public String title;

    @NameInMap("UserData")
    public String userData;

    public static SubmitMattingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitMattingJobRequest self = new SubmitMattingJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitMattingJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitMattingJobRequest setInputFile(String inputFile) {
        this.inputFile = inputFile;
        return this;
    }
    public String getInputFile() {
        return this.inputFile;
    }

    public SubmitMattingJobRequest setInputType(String inputType) {
        this.inputType = inputType;
        return this;
    }
    public String getInputType() {
        return this.inputType;
    }

    public SubmitMattingJobRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public SubmitMattingJobRequest setOutputMediaTarget(String outputMediaTarget) {
        this.outputMediaTarget = outputMediaTarget;
        return this;
    }
    public String getOutputMediaTarget() {
        return this.outputMediaTarget;
    }

    public SubmitMattingJobRequest setOverwrite(String overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public String getOverwrite() {
        return this.overwrite;
    }

    public SubmitMattingJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitMattingJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
