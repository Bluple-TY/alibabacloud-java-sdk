// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130;

import com.aliyun.tea.*;
import com.aliyun.umeng_finplus20211130.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("umeng-finplus", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    public CancelComputeTaskByBcIdResponse cancelComputeTaskByBcId(CancelComputeTaskByBcIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelComputeTaskByBcIdWithOptions(request, headers, runtime);
    }

    public CancelComputeTaskByBcIdResponse cancelComputeTaskByBcIdWithOptions(CancelComputeTaskByBcIdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bcId)) {
            query.put("bcId", request.bcId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelComputeTaskByBcId"),
            new TeaPair("version", "2021-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/batch_compute/cancelComputeTaskByBcId"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelComputeTaskByBcIdResponse());
    }

    public CreateComputeTaskByDataSetIdResponse createComputeTaskByDataSetId(CreateComputeTaskByDataSetIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createComputeTaskByDataSetIdWithOptions(request, headers, runtime);
    }

    public CreateComputeTaskByDataSetIdResponse createComputeTaskByDataSetIdWithOptions(CreateComputeTaskByDataSetIdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchInfoForm)) {
            body.put("BatchInfoForm", request.batchInfoForm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            body.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarks)) {
            body.put("Remarks", request.remarks);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateComputeTaskByDataSetId"),
            new TeaPair("version", "2021-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/batch_compute/createComputeTaskByDataSetId"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateComputeTaskByDataSetIdResponse());
    }

    public CreateComputeTaskByMultiDataSetIdResponse createComputeTaskByMultiDataSetId(CreateComputeTaskByMultiDataSetIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createComputeTaskByMultiDataSetIdWithOptions(request, headers, runtime);
    }

    public CreateComputeTaskByMultiDataSetIdResponse createComputeTaskByMultiDataSetIdWithOptions(CreateComputeTaskByMultiDataSetIdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSetIds)) {
            body.put("dataSetIds", request.dataSetIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarks)) {
            body.put("remarks", request.remarks);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateComputeTaskByMultiDataSetId"),
            new TeaPair("version", "2021-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/batch_compute/createComputeTaskByMultiDataSetId"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateComputeTaskByMultiDataSetIdResponse());
    }

    public GetAvailableDataSetListResponse getAvailableDataSetList() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAvailableDataSetListWithOptions(headers, runtime);
    }

    public GetAvailableDataSetListResponse getAvailableDataSetListWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAvailableDataSetList"),
            new TeaPair("version", "2021-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/batch_compute/getAvailableDataSetList"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAvailableDataSetListResponse());
    }

    public GetComputeResultResponse getComputeResult(GetComputeResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getComputeResultWithOptions(request, headers, runtime);
    }

    public GetComputeResultResponse getComputeResultWithOptions(GetComputeResultRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bcId)) {
            query.put("bcId", request.bcId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetComputeResult"),
            new TeaPair("version", "2021-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/batch_compute/getComputeTaskResult"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetComputeResultResponse());
    }

    public GetDataSetStatusResponse getDataSetStatus(GetDataSetStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataSetStatusWithOptions(request, headers, runtime);
    }

    public GetDataSetStatusResponse getDataSetStatusWithOptions(GetDataSetStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSetId)) {
            query.put("dataSetId", request.dataSetId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataSetStatus"),
            new TeaPair("version", "2021-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/batch_compute/getDataSetStatus"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataSetStatusResponse());
    }

    public GetDataSetStsAKResponse getDataSetStsAK() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataSetStsAKWithOptions(headers, runtime);
    }

    public GetDataSetStsAKResponse getDataSetStsAKWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataSetStsAK"),
            new TeaPair("version", "2021-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/batch_compute/getDataSetStsAk"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataSetStsAKResponse());
    }

    public SubmitDataSetTaskResponse submitDataSetTask(SubmitDataSetTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitDataSetTaskWithOptions(request, headers, runtime);
    }

    public SubmitDataSetTaskResponse submitDataSetTaskWithOptions(SubmitDataSetTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSetType)) {
            body.put("dataSetType", request.dataSetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idType)) {
            body.put("idType", request.idType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossFileName)) {
            body.put("ossFileName", request.ossFileName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitDataSetTask"),
            new TeaPair("version", "2021-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/batch_compute/submitDataSetTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitDataSetTaskResponse());
    }

    public CancelYydTaskByBcIdResponse cancelYydTaskByBcId(CancelYydTaskByBcIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelYydTaskByBcIdWithOptions(request, headers, runtime);
    }

    public CancelYydTaskByBcIdResponse cancelYydTaskByBcIdWithOptions(CancelYydTaskByBcIdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bcId)) {
            query.put("bcId", request.bcId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "cancelYydTaskByBcId"),
            new TeaPair("version", "2021-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/batch_compute/yyd/task/cancel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelYydTaskByBcIdResponse());
    }

    public CreateYydComputeTaskResponse createYydComputeTask(CreateYydComputeTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createYydComputeTaskWithOptions(request, headers, runtime);
    }

    public CreateYydComputeTaskResponse createYydComputeTaskWithOptions(CreateYydComputeTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            body.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarks)) {
            body.put("Remarks", request.remarks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("appId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "createYydComputeTask"),
            new TeaPair("version", "2021-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/batch_compute/yyd/task/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateYydComputeTaskResponse());
    }

    public CreateYydDataSetResponse createYydDataSet(CreateYydDataSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createYydDataSetWithOptions(request, headers, runtime);
    }

    public CreateYydDataSetResponse createYydDataSetWithOptions(CreateYydDataSetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossFileName)) {
            body.put("ossFileName", request.ossFileName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "createYydDataSet"),
            new TeaPair("version", "2021-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/batch_compute/yyd/dataset/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateYydDataSetResponse());
    }

    public ListYydComputeTaskListResponse listYydComputeTaskList() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listYydComputeTaskListWithOptions(headers, runtime);
    }

    public ListYydComputeTaskListResponse listYydComputeTaskListWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "listYydComputeTaskList"),
            new TeaPair("version", "2021-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/batch_compute/yyd/task/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListYydComputeTaskListResponse());
    }

    public ListYydDataSetResponse listYydDataSet() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listYydDataSetWithOptions(headers, runtime);
    }

    public ListYydDataSetResponse listYydDataSetWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "listYydDataSet"),
            new TeaPair("version", "2021-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/batch_compute/yyd/dataset/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListYydDataSetResponse());
    }
}
