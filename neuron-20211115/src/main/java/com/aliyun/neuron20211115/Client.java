// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115;

import com.aliyun.tea.*;
import com.aliyun.neuron20211115.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "neuron.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "neuron.aliyuncs.com"),
            new TeaPair("ap-south-1", "neuron.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "neuron.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "neuron.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "neuron.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "neuron.aliyuncs.com"),
            new TeaPair("cn-beijing", "neuron.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "neuron.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "neuron.aliyuncs.com"),
            new TeaPair("cn-chengdu", "neuron.aliyuncs.com"),
            new TeaPair("cn-edge-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-fujian", "neuron.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "neuron.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "neuron.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "neuron.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "neuron.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "neuron.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "neuron.aliyuncs.com"),
            new TeaPair("cn-hongkong", "neuron.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "neuron.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "neuron.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-qingdao", "neuron.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "neuron.aliyuncs.com"),
            new TeaPair("cn-shanghai", "neuron.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "neuron.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "neuron.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "neuron.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "neuron.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "neuron.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "neuron.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "neuron.aliyuncs.com"),
            new TeaPair("cn-wuhan", "neuron.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "neuron.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "neuron.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "neuron.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "neuron.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "neuron.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "neuron.aliyuncs.com"),
            new TeaPair("eu-central-1", "neuron.aliyuncs.com"),
            new TeaPair("eu-west-1", "neuron.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "neuron.aliyuncs.com"),
            new TeaPair("me-east-1", "neuron.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "neuron.aliyuncs.com"),
            new TeaPair("us-east-1", "neuron.aliyuncs.com"),
            new TeaPair("us-west-1", "neuron.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("neuron", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AuditForkReviewResponse auditForkReview(String reviewId, AuditForkReviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.auditForkReviewWithOptions(reviewId, request, headers, runtime);
    }

    public AuditForkReviewResponse auditForkReviewWithOptions(String reviewId, AuditForkReviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuditForkReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/fork-reviews/" + com.aliyun.openapiutil.Client.getEncodeParam(reviewId) + "/commands/audit"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuditForkReviewResponse());
    }

    public AuditPbcInvokeReviewResponse auditPbcInvokeReview(String reviewId, AuditPbcInvokeReviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.auditPbcInvokeReviewWithOptions(reviewId, request, headers, runtime);
    }

    public AuditPbcInvokeReviewResponse auditPbcInvokeReviewWithOptions(String reviewId, AuditPbcInvokeReviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approve)) {
            body.put("approve", request.approve);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuditPbcInvokeReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-invoke-reviews/" + com.aliyun.openapiutil.Client.getEncodeParam(reviewId) + "/commands/audit"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuditPbcInvokeReviewResponse());
    }

    public BatchGrantRolesToDeveloperResponse batchGrantRolesToDeveloper(BatchGrantRolesToDeveloperRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchGrantRolesToDeveloperWithOptions(request, headers, runtime);
    }

    public BatchGrantRolesToDeveloperResponse batchGrantRolesToDeveloperWithOptions(BatchGrantRolesToDeveloperRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGrantRolesToDeveloper"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles/commands/batch-grant-roles"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGrantRolesToDeveloperResponse());
    }

    public CheckDeveloperRoleResponse checkDeveloperRole(CheckDeveloperRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkDeveloperRoleWithOptions(request, headers, runtime);
    }

    public CheckDeveloperRoleResponse checkDeveloperRoleWithOptions(CheckDeveloperRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("accountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("roleName", request.roleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDeveloperRole"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles/commands/check-role"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDeveloperRoleResponse());
    }

    public CheckServiceReachableResponse checkServiceReachable() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkServiceReachableWithOptions(headers, runtime);
    }

    public CheckServiceReachableResponse checkServiceReachableWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckServiceReachable"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/checkpreload.htm"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckServiceReachableResponse());
    }

    public CompleteRegisterLibraryResponse completeRegisterLibrary(String libraryName, CompleteRegisterLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.completeRegisterLibraryWithOptions(libraryName, request, headers, runtime);
    }

    public CompleteRegisterLibraryResponse completeRegisterLibraryWithOptions(String libraryName, CompleteRegisterLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dependIntegral)) {
            body.put("dependIntegral", request.dependIntegral);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompleteRegisterLibrary"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryName) + "/commands/complete-register"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompleteRegisterLibraryResponse());
    }

    public CompleteRegistrationPbcVersionResponse completeRegistrationPbcVersion(String pbcName, String version) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.completeRegistrationPbcVersionWithOptions(pbcName, version, headers, runtime);
    }

    public CompleteRegistrationPbcVersionResponse completeRegistrationPbcVersionWithOptions(String pbcName, String version, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompleteRegistrationPbcVersion"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(version) + "/commands/complete-register"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompleteRegistrationPbcVersionResponse());
    }

    public ContinueDeploymentResponse continueDeployment(ContinueDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.continueDeploymentWithOptions(request, headers, runtime);
    }

    public ContinueDeploymentResponse continueDeploymentWithOptions(ContinueDeploymentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ContinueDeployment"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/deployments/commands/continue"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ContinueDeploymentResponse());
    }

    public CreateAssetWatchResponse createAssetWatch(CreateAssetWatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAssetWatchWithOptions(request, headers, runtime);
    }

    public CreateAssetWatchResponse createAssetWatchWithOptions(CreateAssetWatchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAssetWatch"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/asset-watch"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAssetWatchResponse());
    }

    public CreateDeveloperResponse createDeveloper(CreateDeveloperRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDeveloperWithOptions(request, headers, runtime);
    }

    public CreateDeveloperResponse createDeveloperWithOptions(CreateDeveloperRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeveloper"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/developers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeveloperResponse());
    }

    public CreateEnterpriseResponse createEnterprise(CreateEnterpriseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEnterpriseWithOptions(request, headers, runtime);
    }

    public CreateEnterpriseResponse createEnterpriseWithOptions(CreateEnterpriseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEnterprise"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/enterprises"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEnterpriseResponse());
    }

    public CreateForkReviewResponse createForkReview(CreateForkReviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createForkReviewWithOptions(request, headers, runtime);
    }

    public CreateForkReviewResponse createForkReviewWithOptions(CreateForkReviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateForkReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/fork-reviews"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateForkReviewResponse());
    }

    public CreateLibraryResponse createLibrary(CreateLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLibraryWithOptions(request, headers, runtime);
    }

    public CreateLibraryResponse createLibraryWithOptions(CreateLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.artifactId)) {
            body.put("artifactId", request.artifactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            body.put("companyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("groupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoUrl)) {
            body.put("repoUrl", request.repoUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLibrary"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLibraryResponse());
    }

    public CreateLibraryInstructionResponse createLibraryInstruction(String libraryName, CreateLibraryInstructionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLibraryInstructionWithOptions(libraryName, request, headers, runtime);
    }

    public CreateLibraryInstructionResponse createLibraryInstructionWithOptions(String libraryName, CreateLibraryInstructionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.document)) {
            body.put("document", request.document);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryName)) {
            body.put("libraryName", request.libraryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryVersion)) {
            body.put("libraryVersion", request.libraryVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLibraryInstruction"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryName) + "/instructions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLibraryInstructionResponse());
    }

    public CreateLibraryReviewResponse createLibraryReview(CreateLibraryReviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLibraryReviewWithOptions(request, headers, runtime);
    }

    public CreateLibraryReviewResponse createLibraryReviewWithOptions(CreateLibraryReviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.libraryName)) {
            body.put("libraryName", request.libraryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryUrl)) {
            body.put("libraryUrl", request.libraryUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryVersion)) {
            body.put("libraryVersion", request.libraryVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marketId)) {
            body.put("marketId", request.marketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reviewerId)) {
            body.put("reviewerId", request.reviewerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLibraryReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/library-reviews"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLibraryReviewResponse());
    }

    public CreateLibrarySchemaResponse createLibrarySchema(String libraryName, CreateLibrarySchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLibrarySchemaWithOptions(libraryName, request, headers, runtime);
    }

    public CreateLibrarySchemaResponse createLibrarySchemaWithOptions(String libraryName, CreateLibrarySchemaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLibrarySchema"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryName) + "/schemas"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLibrarySchemaResponse());
    }

    public CreatePbcResponse createPbc(CreatePbcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPbcWithOptions(request, headers, runtime);
    }

    public CreatePbcResponse createPbcWithOptions(CreatePbcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePbc"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePbcResponse());
    }

    public CreatePbcApiSchemaResponse createPbcApiSchema(String pbcName, String version, CreatePbcApiSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPbcApiSchemaWithOptions(pbcName, version, request, headers, runtime);
    }

    public CreatePbcApiSchemaResponse createPbcApiSchemaWithOptions(String pbcName, String version, CreatePbcApiSchemaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePbcApiSchema"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(version) + "/api-schemas"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePbcApiSchemaResponse());
    }

    public CreatePbcInstructionResponse createPbcInstruction(String pbcName, String version, CreatePbcInstructionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPbcInstructionWithOptions(pbcName, version, request, headers, runtime);
    }

    public CreatePbcInstructionResponse createPbcInstructionWithOptions(String pbcName, String version, CreatePbcInstructionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePbcInstruction"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(version) + "/instruction"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePbcInstructionResponse());
    }

    public CreatePbcInvokeResponse createPbcInvoke(CreatePbcInvokeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPbcInvokeWithOptions(request, headers, runtime);
    }

    public CreatePbcInvokeResponse createPbcInvokeWithOptions(CreatePbcInvokeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePbcInvoke"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-invokes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePbcInvokeResponse());
    }

    public CreatePbcInvokeReviewResponse createPbcInvokeReview(CreatePbcInvokeReviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPbcInvokeReviewWithOptions(request, headers, runtime);
    }

    public CreatePbcInvokeReviewResponse createPbcInvokeReviewWithOptions(CreatePbcInvokeReviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pbcName)) {
            body.put("pbcName", request.pbcName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePbcInvokeReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-invoke-reviews"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePbcInvokeReviewResponse());
    }

    public CreatePbcReviewResponse createPbcReview(CreatePbcReviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPbcReviewWithOptions(request, headers, runtime);
    }

    public CreatePbcReviewResponse createPbcReviewWithOptions(CreatePbcReviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePbcReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-reviews"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePbcReviewResponse());
    }

    public CreatePbcSchemaResponse createPbcSchema(String pbcName, String version, CreatePbcSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPbcSchemaWithOptions(pbcName, version, request, headers, runtime);
    }

    public CreatePbcSchemaResponse createPbcSchemaWithOptions(String pbcName, String version, CreatePbcSchemaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            body.put("companyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pbcName)) {
            body.put("pbcName", request.pbcName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pbcVersion)) {
            body.put("pbcVersion", request.pbcVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            body.put("schema", request.schema);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePbcSchema"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(version) + "/schemas"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePbcSchemaResponse());
    }

    public CreatePbcVersionResponse createPbcVersion(String pbcName, String version, CreatePbcVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPbcVersionWithOptions(pbcName, version, request, headers, runtime);
    }

    public CreatePbcVersionResponse createPbcVersionWithOptions(String pbcName, String version, CreatePbcVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePbcVersion"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(version) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePbcVersionResponse());
    }

    public CreatePdpConfigResponse createPdpConfig(CreatePdpConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPdpConfigWithOptions(request, headers, runtime);
    }

    public CreatePdpConfigResponse createPdpConfigWithOptions(CreatePdpConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePdpConfig"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/configs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePdpConfigResponse());
    }

    public CreatePdpPbcResponse createPdpPbc(CreatePdpPbcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPdpPbcWithOptions(request, headers, runtime);
    }

    public CreatePdpPbcResponse createPdpPbcWithOptions(CreatePdpPbcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePdpPbc"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/pbcs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePdpPbcResponse());
    }

    public CreatePdpServiceResponse createPdpService(CreatePdpServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPdpServiceWithOptions(request, headers, runtime);
    }

    public CreatePdpServiceResponse createPdpServiceWithOptions(CreatePdpServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePdpService"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/services"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePdpServiceResponse());
    }

    public CreatePrivilegeResponse createPrivilege(String roleId, CreatePrivilegeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPrivilegeWithOptions(roleId, request, headers, runtime);
    }

    public CreatePrivilegeResponse createPrivilegeWithOptions(String roleId, CreatePrivilegeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePrivilege"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles/" + com.aliyun.openapiutil.Client.getEncodeParam(roleId) + "/privileges"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePrivilegeResponse());
    }

    public CreateRepoForkResponse createRepoFork(CreateRepoForkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRepoForkWithOptions(request, headers, runtime);
    }

    public CreateRepoForkResponse createRepoForkWithOptions(CreateRepoForkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRepoFork"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/repo-forks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRepoForkResponse());
    }

    public CreateRoleResponse createRole(CreateRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRoleWithOptions(request, headers, runtime);
    }

    public CreateRoleResponse createRoleWithOptions(CreateRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRole"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRoleResponse());
    }

    public DeleteDeveloperResponse deleteDeveloper(String accountId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDeveloperWithOptions(accountId, headers, runtime);
    }

    public DeleteDeveloperResponse deleteDeveloperWithOptions(String accountId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeveloper"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/developers/" + com.aliyun.openapiutil.Client.getEncodeParam(accountId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeveloperResponse());
    }

    public DeleteEnterpriseResponse deleteEnterprise(String enterpriseId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEnterpriseWithOptions(enterpriseId, headers, runtime);
    }

    public DeleteEnterpriseResponse deleteEnterpriseWithOptions(String enterpriseId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEnterprise"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/enterprises/" + com.aliyun.openapiutil.Client.getEncodeParam(enterpriseId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEnterpriseResponse());
    }

    public DeleteLibraryResponse deleteLibrary(String libraryName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLibraryWithOptions(libraryName, headers, runtime);
    }

    public DeleteLibraryResponse deleteLibraryWithOptions(String libraryName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLibrary"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLibraryResponse());
    }

    public DeleteLibraryInstructionResponse deleteLibraryInstruction(String libraryName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLibraryInstructionWithOptions(libraryName, headers, runtime);
    }

    public DeleteLibraryInstructionResponse deleteLibraryInstructionWithOptions(String libraryName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLibraryInstruction"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryName) + "/instructions"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLibraryInstructionResponse());
    }

    public DeleteLibrarySchemaResponse deleteLibrarySchema(String libraryName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLibrarySchemaWithOptions(libraryName, headers, runtime);
    }

    public DeleteLibrarySchemaResponse deleteLibrarySchemaWithOptions(String libraryName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLibrarySchema"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryName) + "/schemas"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLibrarySchemaResponse());
    }

    public DeletePbcInvokeResponse deletePbcInvoke(DeletePbcInvokeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePbcInvokeWithOptions(request, headers, runtime);
    }

    public DeletePbcInvokeResponse deletePbcInvokeWithOptions(DeletePbcInvokeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.invokePbcName)) {
            query.put("invoke_pbc_name", request.invokePbcName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pbcName)) {
            query.put("pbc_name", request.pbcName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePbcInvoke"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-invokes"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePbcInvokeResponse());
    }

    public DeletePdpConfigResponse deletePdpConfig(String configId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePdpConfigWithOptions(configId, headers, runtime);
    }

    public DeletePdpConfigResponse deletePdpConfigWithOptions(String configId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePdpConfig"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/configs/" + com.aliyun.openapiutil.Client.getEncodeParam(configId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePdpConfigResponse());
    }

    public DeletePdpPbcResponse deletePdpPbc(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePdpPbcWithOptions(id, headers, runtime);
    }

    public DeletePdpPbcResponse deletePdpPbcWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePdpPbc"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePdpPbcResponse());
    }

    public DeletePdpServiceResponse deletePdpService(String serviceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePdpServiceWithOptions(serviceId, headers, runtime);
    }

    public DeletePdpServiceResponse deletePdpServiceWithOptions(String serviceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePdpService"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePdpServiceResponse());
    }

    public DeletePrivilegeResponse deletePrivilege(String privilegeId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePrivilegeWithOptions(privilegeId, headers, runtime);
    }

    public DeletePrivilegeResponse deletePrivilegeWithOptions(String privilegeId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePrivilege"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles/privileges/" + com.aliyun.openapiutil.Client.getEncodeParam(privilegeId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePrivilegeResponse());
    }

    public DeleteRoleResponse deleteRole(String roleId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRoleWithOptions(roleId, headers, runtime);
    }

    public DeleteRoleResponse deleteRoleWithOptions(String roleId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRole"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles/" + com.aliyun.openapiutil.Client.getEncodeParam(roleId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRoleResponse());
    }

    public DependLibraryResponse dependLibrary(String libraryName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.dependLibraryWithOptions(libraryName, headers, runtime);
    }

    public DependLibraryResponse dependLibraryWithOptions(String libraryName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DependLibrary"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryName) + "/commands/dependency"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DependLibraryResponse());
    }

    public FeedbackLibraryReviewResponse feedbackLibraryReview(String reviewId, FeedbackLibraryReviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.feedbackLibraryReviewWithOptions(reviewId, request, headers, runtime);
    }

    public FeedbackLibraryReviewResponse feedbackLibraryReviewWithOptions(String reviewId, FeedbackLibraryReviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approve)) {
            body.put("approve", request.approve);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.feedback)) {
            body.put("feedback", request.feedback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reviewId)) {
            body.put("reviewId", request.reviewId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FeedbackLibraryReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/library-reviews/" + com.aliyun.openapiutil.Client.getEncodeParam(reviewId) + "/commands/feedback"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FeedbackLibraryReviewResponse());
    }

    public FeedbackPbcReviewResponse feedbackPbcReview(String reviewId, FeedbackPbcReviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.feedbackPbcReviewWithOptions(reviewId, request, headers, runtime);
    }

    public FeedbackPbcReviewResponse feedbackPbcReviewWithOptions(String reviewId, FeedbackPbcReviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FeedbackPbcReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-reviews/" + com.aliyun.openapiutil.Client.getEncodeParam(reviewId) + "/commands/feedback"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FeedbackPbcReviewResponse());
    }

    public GetDeploymentResponse getDeployment(String deploymentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeploymentWithOptions(deploymentId, headers, runtime);
    }

    public GetDeploymentResponse getDeploymentWithOptions(String deploymentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeployment"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/deployments/instance/" + com.aliyun.openapiutil.Client.getEncodeParam(deploymentId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeploymentResponse());
    }

    public GetDeveloperResponse getDeveloper(String accountId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeveloperWithOptions(accountId, headers, runtime);
    }

    public GetDeveloperResponse getDeveloperWithOptions(String accountId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeveloper"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/developers/" + com.aliyun.openapiutil.Client.getEncodeParam(accountId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeveloperResponse());
    }

    public GetDeveloperEnterpriseResponse getDeveloperEnterprise(String accountId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeveloperEnterpriseWithOptions(accountId, headers, runtime);
    }

    public GetDeveloperEnterpriseResponse getDeveloperEnterpriseWithOptions(String accountId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeveloperEnterprise"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/enterprises/developers/" + com.aliyun.openapiutil.Client.getEncodeParam(accountId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeveloperEnterpriseResponse());
    }

    public GetEnterpriseResponse getEnterprise(String enterpriseId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEnterpriseWithOptions(enterpriseId, headers, runtime);
    }

    public GetEnterpriseResponse getEnterpriseWithOptions(String enterpriseId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEnterprise"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/enterprises/" + com.aliyun.openapiutil.Client.getEncodeParam(enterpriseId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEnterpriseResponse());
    }

    public GetForkReviewResponse getForkReview(String reviewId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getForkReviewWithOptions(reviewId, headers, runtime);
    }

    public GetForkReviewResponse getForkReviewWithOptions(String reviewId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetForkReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/fork-reviews/" + com.aliyun.openapiutil.Client.getEncodeParam(reviewId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetForkReviewResponse());
    }

    public GetHistoryDeveloperResponse getHistoryDeveloper(String accountId, GetHistoryDeveloperRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHistoryDeveloperWithOptions(accountId, request, headers, runtime);
    }

    public GetHistoryDeveloperResponse getHistoryDeveloperWithOptions(String accountId, GetHistoryDeveloperRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("enterprise_id", request.enterpriseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHistoryDeveloper"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/developers/" + com.aliyun.openapiutil.Client.getEncodeParam(accountId) + "/commonds/history"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHistoryDeveloperResponse());
    }

    public GetLastDeploymentConfigResponse getLastDeploymentConfig(GetLastDeploymentConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLastDeploymentConfigWithOptions(request, headers, runtime);
    }

    public GetLastDeploymentConfigResponse getLastDeploymentConfigWithOptions(GetLastDeploymentConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("service_id", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLastDeploymentConfig"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/deployments/last-config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLastDeploymentConfigResponse());
    }

    public GetLibraryResponse getLibrary(String libraryName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLibraryWithOptions(libraryName, headers, runtime);
    }

    public GetLibraryResponse getLibraryWithOptions(String libraryName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLibrary"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLibraryResponse());
    }

    public GetLibraryDeveloperRepoMetricsResponse getLibraryDeveloperRepoMetrics(String libraryName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLibraryDeveloperRepoMetricsWithOptions(libraryName, headers, runtime);
    }

    public GetLibraryDeveloperRepoMetricsResponse getLibraryDeveloperRepoMetricsWithOptions(String libraryName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLibraryDeveloperRepoMetrics"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/Librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryName) + "/code/commands/get-developer-repo-metrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLibraryDeveloperRepoMetricsResponse());
    }

    public GetLibraryInstructionResponse getLibraryInstruction(String libraryName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLibraryInstructionWithOptions(libraryName, headers, runtime);
    }

    public GetLibraryInstructionResponse getLibraryInstructionWithOptions(String libraryName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLibraryInstruction"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryName) + "/instructions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLibraryInstructionResponse());
    }

    public GetLibraryRepoMetricsResponse getLibraryRepoMetrics(String libraryName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLibraryRepoMetricsWithOptions(libraryName, headers, runtime);
    }

    public GetLibraryRepoMetricsResponse getLibraryRepoMetricsWithOptions(String libraryName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLibraryRepoMetrics"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/Librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryName) + "/code/commands/get-repo-metrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLibraryRepoMetricsResponse());
    }

    public GetLibraryReviewResponse getLibraryReview(String reviewId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLibraryReviewWithOptions(reviewId, headers, runtime);
    }

    public GetLibraryReviewResponse getLibraryReviewWithOptions(String reviewId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLibraryReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/library-reviews/" + com.aliyun.openapiutil.Client.getEncodeParam(reviewId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLibraryReviewResponse());
    }

    public GetLibrarySchemaResponse getLibrarySchema(String libraryName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLibrarySchemaWithOptions(libraryName, headers, runtime);
    }

    public GetLibrarySchemaResponse getLibrarySchemaWithOptions(String libraryName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLibrarySchema"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryName) + "/schemas"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLibrarySchemaResponse());
    }

    public GetPbcResponse getPbc(String pbcName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPbcWithOptions(pbcName, headers, runtime);
    }

    public GetPbcResponse getPbcWithOptions(String pbcName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPbc"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPbcResponse());
    }

    public GetPbcApiSchemaResponse getPbcApiSchema(String pbcName, String version) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPbcApiSchemaWithOptions(pbcName, version, headers, runtime);
    }

    public GetPbcApiSchemaResponse getPbcApiSchemaWithOptions(String pbcName, String version, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPbcApiSchema"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(version) + "/api-schemas"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPbcApiSchemaResponse());
    }

    public GetPbcDeveloperRepoMetricsResponse getPbcDeveloperRepoMetrics(String pbcName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPbcDeveloperRepoMetricsWithOptions(pbcName, headers, runtime);
    }

    public GetPbcDeveloperRepoMetricsResponse getPbcDeveloperRepoMetricsWithOptions(String pbcName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPbcDeveloperRepoMetrics"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + "/code/commands/get-developer-repo-metrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPbcDeveloperRepoMetricsResponse());
    }

    public GetPbcInstructionResponse getPbcInstruction(String pbcName, String version) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPbcInstructionWithOptions(pbcName, version, headers, runtime);
    }

    public GetPbcInstructionResponse getPbcInstructionWithOptions(String pbcName, String version, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPbcInstruction"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(version) + "/instruction"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPbcInstructionResponse());
    }

    public GetPbcInvokeReviewResponse getPbcInvokeReview(String reviewId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPbcInvokeReviewWithOptions(reviewId, headers, runtime);
    }

    public GetPbcInvokeReviewResponse getPbcInvokeReviewWithOptions(String reviewId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPbcInvokeReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-invoke-reviews/" + com.aliyun.openapiutil.Client.getEncodeParam(reviewId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPbcInvokeReviewResponse());
    }

    public GetPbcRepoMetricsResponse getPbcRepoMetrics(String pbcName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPbcRepoMetricsWithOptions(pbcName, headers, runtime);
    }

    public GetPbcRepoMetricsResponse getPbcRepoMetricsWithOptions(String pbcName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPbcRepoMetrics"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + "/code/commands/get-repo-metrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPbcRepoMetricsResponse());
    }

    public GetPbcReviewResponse getPbcReview(String reviewId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPbcReviewWithOptions(reviewId, headers, runtime);
    }

    public GetPbcReviewResponse getPbcReviewWithOptions(String reviewId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPbcReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-reviews/" + com.aliyun.openapiutil.Client.getEncodeParam(reviewId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPbcReviewResponse());
    }

    public GetPbcSchemaResponse getPbcSchema(String pbcName, String version) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPbcSchemaWithOptions(pbcName, version, headers, runtime);
    }

    public GetPbcSchemaResponse getPbcSchemaWithOptions(String pbcName, String version, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPbcSchema"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(version) + "/schemas"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPbcSchemaResponse());
    }

    public GetPbcVersionResponse getPbcVersion(String pbcName, String version) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPbcVersionWithOptions(pbcName, version, headers, runtime);
    }

    public GetPbcVersionResponse getPbcVersionWithOptions(String pbcName, String version, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPbcVersion"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(version) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPbcVersionResponse());
    }

    public GetPdpConfigResponse getPdpConfig(String configId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPdpConfigWithOptions(configId, headers, runtime);
    }

    public GetPdpConfigResponse getPdpConfigWithOptions(String configId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPdpConfig"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/configs/last/" + com.aliyun.openapiutil.Client.getEncodeParam(configId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPdpConfigResponse());
    }

    public GetPdpPbcResponse getPdpPbc(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPdpPbcWithOptions(id, headers, runtime);
    }

    public GetPdpPbcResponse getPdpPbcWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPdpPbc"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPdpPbcResponse());
    }

    public GetPdpServiceResponse getPdpService(String serviceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPdpServiceWithOptions(serviceId, headers, runtime);
    }

    public GetPdpServiceResponse getPdpServiceWithOptions(String serviceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPdpService"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPdpServiceResponse());
    }

    public GetRepoForkResponse getRepoFork(String forkId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepoForkWithOptions(forkId, headers, runtime);
    }

    public GetRepoForkResponse getRepoForkWithOptions(String forkId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepoFork"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/repo-forks/" + com.aliyun.openapiutil.Client.getEncodeParam(forkId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepoForkResponse());
    }

    public GetRepoMetricResponse getRepoMetric(GetRepoMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepoMetricWithOptions(request, headers, runtime);
    }

    public GetRepoMetricResponse getRepoMetricWithOptions(GetRepoMetricRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.repoUrls)) {
            query.put("RepoUrls", request.repoUrls);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepoMetric"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/code-metric/repos-metric"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepoMetricResponse());
    }

    public GetRoleResponse getRole(String roleId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRoleWithOptions(roleId, headers, runtime);
    }

    public GetRoleResponse getRoleWithOptions(String roleId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRole"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles/role-id/" + com.aliyun.openapiutil.Client.getEncodeParam(roleId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRoleResponse());
    }

    public GrantRoleResponse grantRole(String roleId, GrantRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.grantRoleWithOptions(roleId, request, headers, runtime);
    }

    public GrantRoleResponse grantRoleWithOptions(String roleId, GrantRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantRole"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles/" + com.aliyun.openapiutil.Client.getEncodeParam(roleId) + "/commands/grant"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantRoleResponse());
    }

    public ListDependLibrarysResponse listDependLibrarys(ListDependLibrarysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDependLibrarysWithOptions(request, headers, runtime);
    }

    public ListDependLibrarysResponse listDependLibrarysWithOptions(ListDependLibrarysRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicant)) {
            query.put("applicant", request.applicant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDependLibrarys"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/librarys/commands/list-dependency"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDependLibrarysResponse());
    }

    public ListDeploymentsResponse listDeployments(ListDeploymentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDeploymentsWithOptions(request, headers, runtime);
    }

    public ListDeploymentsResponse listDeploymentsWithOptions(ListDeploymentsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDeploymentsShrinkRequest request = new ListDeploymentsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.excludeStatus)) {
            request.excludeStatusShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.excludeStatus, "exclude_status", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.status)) {
            request.statusShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.status, "status", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeStatusShrink)) {
            query.put("exclude_status", request.excludeStatusShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("service_id", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusShrink)) {
            query.put("status", request.statusShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeployments"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/deployments"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeploymentsResponse());
    }

    public ListDeveloperPbcsResponse listDeveloperPbcs() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDeveloperPbcsWithOptions(headers, runtime);
    }

    public ListDeveloperPbcsResponse listDeveloperPbcsWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeveloperPbcs"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/commands/allow-list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeveloperPbcsResponse());
    }

    public ListDeveloperRepoMetricSumResponse listDeveloperRepoMetricSum(ListDeveloperRepoMetricSumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDeveloperRepoMetricSumWithOptions(request, headers, runtime);
    }

    public ListDeveloperRepoMetricSumResponse listDeveloperRepoMetricSumWithOptions(ListDeveloperRepoMetricSumRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.repoUrls)) {
            query.put("RepoUrls", request.repoUrls);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeveloperRepoMetricSum"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/code-metric/developer-metrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeveloperRepoMetricSumResponse());
    }

    public ListDevelopersResponse listDevelopers(ListDevelopersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDevelopersWithOptions(request, headers, runtime);
    }

    public ListDevelopersResponse listDevelopersWithOptions(ListDevelopersRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDevelopersShrinkRequest request = new ListDevelopersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.accountIds)) {
            request.accountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.accountIds, "account_ids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountIdsShrink)) {
            query.put("account_ids", request.accountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("enterprise_id", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            query.put("role_id", request.roleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDevelopers"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/developers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDevelopersResponse());
    }

    public ListDownstreamPbcResponse listDownstreamPbc(String pbcName, String version) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDownstreamPbcWithOptions(pbcName, version, headers, runtime);
    }

    public ListDownstreamPbcResponse listDownstreamPbcWithOptions(String pbcName, String version, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDownstreamPbc"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(version) + "/commands/list-downstream"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDownstreamPbcResponse());
    }

    public ListEnterprisesResponse listEnterprises(ListEnterprisesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnterprisesWithOptions(request, headers, runtime);
    }

    public ListEnterprisesResponse listEnterprisesWithOptions(ListEnterprisesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnterprises"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/enterprises"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnterprisesResponse());
    }

    public ListForkReviewsResponse listForkReviews(ListForkReviewsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listForkReviewsWithOptions(request, headers, runtime);
    }

    public ListForkReviewsResponse listForkReviewsWithOptions(ListForkReviewsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicant)) {
            query.put("applicant", request.applicant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reviewer)) {
            query.put("reviewer", request.reviewer);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListForkReviews"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/fork-reviews"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListForkReviewsResponse());
    }

    public ListGrantedRolesResponse listGrantedRoles(ListGrantedRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGrantedRolesWithOptions(request, headers, runtime);
    }

    public ListGrantedRolesResponse listGrantedRolesWithOptions(ListGrantedRolesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizerId)) {
            query.put("authorizer_id", request.authorizerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizerType)) {
            query.put("authorizer_type", request.authorizerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGrantedRoles"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles/commands/list-granted-roles"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGrantedRolesResponse());
    }

    public ListInvokePbcsResponse listInvokePbcs(String pbcName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInvokePbcsWithOptions(pbcName, headers, runtime);
    }

    public ListInvokePbcsResponse listInvokePbcsWithOptions(String pbcName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInvokePbcs"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + "/commands/invoke-list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInvokePbcsResponse());
    }

    public ListLibraryReviewsResponse listLibraryReviews(ListLibraryReviewsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLibraryReviewsWithOptions(request, headers, runtime);
    }

    public ListLibraryReviewsResponse listLibraryReviewsWithOptions(ListLibraryReviewsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicant)) {
            query.put("applicant", request.applicant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marketId)) {
            query.put("marketId", request.marketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reviewer)) {
            query.put("reviewer", request.reviewer);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLibraryReviews"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/library-reviews"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLibraryReviewsResponse());
    }

    public ListLibrarysResponse listLibrarys(ListLibrarysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLibrarysWithOptions(request, headers, runtime);
    }

    public ListLibrarysResponse listLibrarysWithOptions(ListLibrarysRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("company_id", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            query.put("provider", request.provider);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLibrarys"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLibrarysResponse());
    }

    public ListMarketsResponse listMarkets() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMarketsWithOptions(headers, runtime);
    }

    public ListMarketsResponse listMarketsWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMarkets"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/markets"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMarketsResponse());
    }

    public ListMetadataInfosResponse listMetadataInfos(ListMetadataInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMetadataInfosWithOptions(request, headers, runtime);
    }

    public ListMetadataInfosResponse listMetadataInfosWithOptions(ListMetadataInfosRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("namespace_id", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("namespace_name", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            query.put("org_id", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pbcId)) {
            query.put("pbc_id", request.pbcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMetadataInfos"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/metadata"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMetadataInfosResponse());
    }

    public ListPbcInvokeReviewsResponse listPbcInvokeReviews(ListPbcInvokeReviewsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPbcInvokeReviewsWithOptions(request, headers, runtime);
    }

    public ListPbcInvokeReviewsResponse listPbcInvokeReviewsWithOptions(ListPbcInvokeReviewsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicant)) {
            query.put("applicant", request.applicant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reviewer)) {
            query.put("reviewer", request.reviewer);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPbcInvokeReviews"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-invoke-reviews"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPbcInvokeReviewsResponse());
    }

    public ListPbcReviewsResponse listPbcReviews(ListPbcReviewsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPbcReviewsWithOptions(request, headers, runtime);
    }

    public ListPbcReviewsResponse listPbcReviewsWithOptions(ListPbcReviewsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPbcReviews"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-reviews"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPbcReviewsResponse());
    }

    public ListPbcSubscribeResponse listPbcSubscribe(ListPbcSubscribeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPbcSubscribeWithOptions(request, headers, runtime);
    }

    public ListPbcSubscribeResponse listPbcSubscribeWithOptions(ListPbcSubscribeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPbcSubscribe"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/commands/list-subscribe"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPbcSubscribeResponse());
    }

    public ListPbcVersionBuildResponse listPbcVersionBuild(ListPbcVersionBuildRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPbcVersionBuildWithOptions(request, headers, runtime);
    }

    public ListPbcVersionBuildResponse listPbcVersionBuildWithOptions(ListPbcVersionBuildRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPbcVersionBuild"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/versions/commands/list-build"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPbcVersionBuildResponse());
    }

    public ListPbcVersionNumbersResponse listPbcVersionNumbers(String pbcName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPbcVersionNumbersWithOptions(pbcName, headers, runtime);
    }

    public ListPbcVersionNumbersResponse listPbcVersionNumbersWithOptions(String pbcName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPbcVersionNumbers"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + "/commands/listPbcVersionNumbers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPbcVersionNumbersResponse());
    }

    public ListPbcsResponse listPbcs(ListPbcsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPbcsWithOptions(request, headers, runtime);
    }

    public ListPbcsResponse listPbcsWithOptions(ListPbcsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPbcs"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPbcsResponse());
    }

    public ListPdpConfigsResponse listPdpConfigs(ListPdpConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPdpConfigsWithOptions(request, headers, runtime);
    }

    public ListPdpConfigsResponse listPdpConfigsWithOptions(ListPdpConfigsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("service_id", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPdpConfigs"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/configs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPdpConfigsResponse());
    }

    public ListPdpHistoryConfigsResponse listPdpHistoryConfigs(ListPdpHistoryConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPdpHistoryConfigsWithOptions(request, headers, runtime);
    }

    public ListPdpHistoryConfigsResponse listPdpHistoryConfigsWithOptions(ListPdpHistoryConfigsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("config_id", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("service_id", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPdpHistoryConfigs"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/configs/history"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPdpHistoryConfigsResponse());
    }

    public ListPdpLogsResponse listPdpLogs(ListPdpLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPdpLogsWithOptions(request, headers, runtime);
    }

    public ListPdpLogsResponse listPdpLogsWithOptions(ListPdpLogsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("from", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("service_id", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("to", request.to);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPdpLogs"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/pdp-log"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPdpLogsResponse());
    }

    public ListPdpPbcsResponse listPdpPbcs(ListPdpPbcsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPdpPbcsWithOptions(request, headers, runtime);
    }

    public ListPdpPbcsResponse listPdpPbcsWithOptions(ListPdpPbcsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListPdpPbcsShrinkRequest request = new ListPdpPbcsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.pbcIds)) {
            request.pbcIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.pbcIds, "pbcIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.developerId)) {
            query.put("developer_id", request.developerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pbcIdsShrink)) {
            query.put("pbcIds", request.pbcIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPdpPbcs"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/pbcs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPdpPbcsResponse());
    }

    public ListPdpServicesResponse listPdpServices(ListPdpServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPdpServicesWithOptions(request, headers, runtime);
    }

    public ListPdpServicesResponse listPdpServicesWithOptions(ListPdpServicesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListPdpServicesShrinkRequest request = new ListPdpServicesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.pdpServiceIds)) {
            request.pdpServiceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.pdpServiceIds, "pdp_service_ids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alias)) {
            query.put("alias", request.alias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pbcId)) {
            query.put("pbc_id", request.pbcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pdpServiceIdsShrink)) {
            query.put("pdp_service_ids", request.pdpServiceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPdpServices"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/services"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPdpServicesResponse());
    }

    public ListPermissionResourceResponse listPermissionResource(ListPermissionResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPermissionResourceWithOptions(request, headers, runtime);
    }

    public ListPermissionResourceResponse listPermissionResourceWithOptions(ListPermissionResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            query.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            query.put("operator_id", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorType)) {
            query.put("operator_type", request.operatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourcePrefix)) {
            query.put("resource_prefix", request.resourcePrefix);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPermissionResource"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/permissions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPermissionResourceResponse());
    }

    public ListPermissionResourcePopResponse listPermissionResourcePop(ListPermissionResourcePopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPermissionResourcePopWithOptions(request, headers, runtime);
    }

    public ListPermissionResourcePopResponse listPermissionResourcePopWithOptions(ListPermissionResourcePopRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            query.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            query.put("operator_id", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorType)) {
            query.put("operator_type", request.operatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourcePrefix)) {
            query.put("resource_prefix", request.resourcePrefix);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPermissionResourcePop"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/permissions/pop"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPermissionResourcePopResponse());
    }

    public ListPrivilegeByRoleResponse listPrivilegeByRole(String roleId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPrivilegeByRoleWithOptions(roleId, headers, runtime);
    }

    public ListPrivilegeByRoleResponse listPrivilegeByRoleWithOptions(String roleId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrivilegeByRole"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles/" + com.aliyun.openapiutil.Client.getEncodeParam(roleId) + "/privileges"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrivilegeByRoleResponse());
    }

    public ListRepoForksResponse listRepoForks(ListRepoForksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepoForksWithOptions(request, headers, runtime);
    }

    public ListRepoForksResponse listRepoForksWithOptions(ListRepoForksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pbcName)) {
            query.put("pbc_name", request.pbcName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepoForks"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/repo-forks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepoForksResponse());
    }

    public ListReviewersResponse listReviewers() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listReviewersWithOptions(headers, runtime);
    }

    public ListReviewersResponse listReviewersWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListReviewers"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-reviews/commands/listReviewers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListReviewersResponse());
    }

    public ListRolesResponse listRoles(ListRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRolesWithOptions(request, headers, runtime);
    }

    public ListRolesResponse listRolesWithOptions(ListRolesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListRolesShrinkRequest request = new ListRolesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roleIds)) {
            request.roleIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roleIds, "role_ids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizerId)) {
            query.put("authorizer_id", request.authorizerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizerType)) {
            query.put("authorizer_type", request.authorizerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("enterprise_id", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleIdsShrink)) {
            query.put("role_ids", request.roleIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            query.put("role_type", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRoles"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRolesResponse());
    }

    public ListRuntimeTokensResponse listRuntimeTokens(ListRuntimeTokensRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRuntimeTokensWithOptions(request, headers, runtime);
    }

    public ListRuntimeTokensResponse listRuntimeTokensWithOptions(ListRuntimeTokensRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("enterprise_id", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pbcId)) {
            query.put("pbc_id", request.pbcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("service_id", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRuntimeTokens"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/services/env/tokens"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRuntimeTokensResponse());
    }

    public ListSubscribePbcsResponse listSubscribePbcs(String pbcName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSubscribePbcsWithOptions(pbcName, headers, runtime);
    }

    public ListSubscribePbcsResponse listSubscribePbcsWithOptions(String pbcName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSubscribePbcs"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + "/commands/subscribe-list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubscribePbcsResponse());
    }

    public ListUpstreamPbcResponse listUpstreamPbc(String pbcName, String version) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUpstreamPbcWithOptions(pbcName, version, headers, runtime);
    }

    public ListUpstreamPbcResponse listUpstreamPbcWithOptions(String pbcName, String version, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUpstreamPbc"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(version) + "/commands/list-upstream"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUpstreamPbcResponse());
    }

    public ListWatchAssetsResponse listWatchAssets(ListWatchAssetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWatchAssetsWithOptions(request, headers, runtime);
    }

    public ListWatchAssetsResponse listWatchAssetsWithOptions(ListWatchAssetsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("account_id", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetName)) {
            query.put("asset_name", request.assetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetType)) {
            query.put("asset_type", request.assetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWatchAssets"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/asset-watch/commands/list-watch"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWatchAssetsResponse());
    }

    public RemoveAssetWatchResponse removeAssetWatch(String assetName, RemoveAssetWatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeAssetWatchWithOptions(assetName, request, headers, runtime);
    }

    public RemoveAssetWatchResponse removeAssetWatchWithOptions(String assetName, RemoveAssetWatchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assetType)) {
            query.put("asset_type", request.assetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveAssetWatch"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/asset-watch/" + com.aliyun.openapiutil.Client.getEncodeParam(assetName) + "/commands/remove-watch"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveAssetWatchResponse());
    }

    public RemoveDependLibraryResponse removeDependLibrary(String libraryName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeDependLibraryWithOptions(libraryName, headers, runtime);
    }

    public RemoveDependLibraryResponse removeDependLibraryWithOptions(String libraryName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveDependLibrary"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryName) + "/commands/remove-dependency"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveDependLibraryResponse());
    }

    public RevokeRoleResponse revokeRole(String roleId, RevokeRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revokeRoleWithOptions(roleId, request, headers, runtime);
    }

    public RevokeRoleResponse revokeRoleWithOptions(String roleId, RevokeRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeRole"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles/" + com.aliyun.openapiutil.Client.getEncodeParam(roleId) + "/commands/revoke"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeRoleResponse());
    }

    public RollbackPdpServiceResponse rollbackPdpService(RollbackPdpServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rollbackPdpServiceWithOptions(request, headers, runtime);
    }

    public RollbackPdpServiceResponse rollbackPdpServiceWithOptions(RollbackPdpServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackPdpService"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/deployments/commands/rollback"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackPdpServiceResponse());
    }

    public SearchAssetsResponse searchAssets(SearchAssetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchAssetsWithOptions(request, headers, runtime);
    }

    public SearchAssetsResponse searchAssetsWithOptions(SearchAssetsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchAssetsShrinkRequest request = new SearchAssetsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.assetIndustrys)) {
            request.assetIndustrysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.assetIndustrys, "asset_industrys", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.assetTypes)) {
            request.assetTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.assetTypes, "asset_types", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assetIndustrysShrink)) {
            query.put("asset_industrys", request.assetIndustrysShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetName)) {
            query.put("asset_name", request.assetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetTypesShrink)) {
            query.put("asset_types", request.assetTypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchAssets"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/markets/commands/search-asset"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchAssetsResponse());
    }

    public SearchPbcAssetsResponse searchPbcAssets(SearchPbcAssetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchPbcAssetsWithOptions(request, headers, runtime);
    }

    public SearchPbcAssetsResponse searchPbcAssetsWithOptions(SearchPbcAssetsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.industry)) {
            query.put("industry", request.industry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchPbcAssets"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/markets/commands/search"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchPbcAssetsResponse());
    }

    public SubscribePbcResponse subscribePbc(String pbcName, SubscribePbcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.subscribePbcWithOptions(pbcName, request, headers, runtime);
    }

    public SubscribePbcResponse subscribePbcWithOptions(String pbcName, SubscribePbcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubscribePbc"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + "/commands/subscribe"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubscribePbcResponse());
    }

    public TransferEnterpriseResponse transferEnterprise(String enterpriseId, TransferEnterpriseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.transferEnterpriseWithOptions(enterpriseId, request, headers, runtime);
    }

    public TransferEnterpriseResponse transferEnterpriseWithOptions(String enterpriseId, TransferEnterpriseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferEnterprise"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/enterprises/" + com.aliyun.openapiutil.Client.getEncodeParam(enterpriseId) + "/commands/transfer"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferEnterpriseResponse());
    }

    public TriggerDeploymentResponse triggerDeployment(TriggerDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.triggerDeploymentWithOptions(request, headers, runtime);
    }

    public TriggerDeploymentResponse triggerDeploymentWithOptions(TriggerDeploymentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TriggerDeployment"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/deployments"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TriggerDeploymentResponse());
    }

    public UpShelfLibraryResponse upShelfLibrary(String libraryName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upShelfLibraryWithOptions(libraryName, headers, runtime);
    }

    public UpShelfLibraryResponse upShelfLibraryWithOptions(String libraryName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpShelfLibrary"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryName) + "/commands/up-shelf-library"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpShelfLibraryResponse());
    }

    public UpShelfPbcVersionResponse upShelfPbcVersion(String pbcName, String version) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upShelfPbcVersionWithOptions(pbcName, version, headers, runtime);
    }

    public UpShelfPbcVersionResponse upShelfPbcVersionWithOptions(String pbcName, String version, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpShelfPbcVersion"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(version) + "/commands/upShelf"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpShelfPbcVersionResponse());
    }

    public UpdateDeveloperResponse updateDeveloper(String accountId, UpdateDeveloperRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDeveloperWithOptions(accountId, request, headers, runtime);
    }

    public UpdateDeveloperResponse updateDeveloperWithOptions(String accountId, UpdateDeveloperRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDeveloper"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/developers/" + com.aliyun.openapiutil.Client.getEncodeParam(accountId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDeveloperResponse());
    }

    public UpdateEnterpriseResponse updateEnterprise(String enterpriseId, UpdateEnterpriseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEnterpriseWithOptions(enterpriseId, request, headers, runtime);
    }

    public UpdateEnterpriseResponse updateEnterpriseWithOptions(String enterpriseId, UpdateEnterpriseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEnterprise"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/enterprises/" + com.aliyun.openapiutil.Client.getEncodeParam(enterpriseId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEnterpriseResponse());
    }

    public UpdateLibraryResponse updateLibrary(UpdateLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLibraryWithOptions(request, headers, runtime);
    }

    public UpdateLibraryResponse updateLibraryWithOptions(UpdateLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLibrary"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLibraryResponse());
    }

    public UpdateLibraryInstructionResponse updateLibraryInstruction(String libraryName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLibraryInstructionWithOptions(libraryName, headers, runtime);
    }

    public UpdateLibraryInstructionResponse updateLibraryInstructionWithOptions(String libraryName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLibraryInstruction"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryName) + "/instructions"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLibraryInstructionResponse());
    }

    public UpdateLibrarySchemaResponse updateLibrarySchema(String libraryName, UpdateLibrarySchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLibrarySchemaWithOptions(libraryName, request, headers, runtime);
    }

    public UpdateLibrarySchemaResponse updateLibrarySchemaWithOptions(String libraryName, UpdateLibrarySchemaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.artifactId)) {
            body.put("artifactId", request.artifactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gitGroup)) {
            body.put("gitGroup", request.gitGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("groupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLibrarySchema"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryName) + "/schemas"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLibrarySchemaResponse());
    }

    public UpdatePbcApiSchemaResponse updatePbcApiSchema(String pbcName, String version, UpdatePbcApiSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePbcApiSchemaWithOptions(pbcName, version, request, headers, runtime);
    }

    public UpdatePbcApiSchemaResponse updatePbcApiSchemaWithOptions(String pbcName, String version, UpdatePbcApiSchemaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePbcApiSchema"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(version) + "/api-schemas"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePbcApiSchemaResponse());
    }

    public UpdatePbcInstructionResponse updatePbcInstruction(String pbcName, String version, UpdatePbcInstructionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePbcInstructionWithOptions(pbcName, version, request, headers, runtime);
    }

    public UpdatePbcInstructionResponse updatePbcInstructionWithOptions(String pbcName, String version, UpdatePbcInstructionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePbcInstruction"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(version) + "/instruction"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePbcInstructionResponse());
    }

    public UpdatePbcSchemaResponse updatePbcSchema(String pbcName, String version, UpdatePbcSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePbcSchemaWithOptions(pbcName, version, request, headers, runtime);
    }

    public UpdatePbcSchemaResponse updatePbcSchemaWithOptions(String pbcName, String version, UpdatePbcSchemaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePbcSchema"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(version) + "/schemas"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePbcSchemaResponse());
    }

    public UpdatePbcVersionResponse updatePbcVersion(String pbcName, String version, UpdatePbcVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePbcVersionWithOptions(pbcName, version, request, headers, runtime);
    }

    public UpdatePbcVersionResponse updatePbcVersionWithOptions(String pbcName, String version, UpdatePbcVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePbcVersion"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(version) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePbcVersionResponse());
    }

    public UpdatePdpConfigResponse updatePdpConfig(UpdatePdpConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePdpConfigWithOptions(request, headers, runtime);
    }

    public UpdatePdpConfigResponse updatePdpConfigWithOptions(UpdatePdpConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePdpConfig"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/configs"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePdpConfigResponse());
    }

    public UpdatePdpPbcResponse updatePdpPbc(UpdatePdpPbcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePdpPbcWithOptions(request, headers, runtime);
    }

    public UpdatePdpPbcResponse updatePdpPbcWithOptions(UpdatePdpPbcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePdpPbc"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/pbcs"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePdpPbcResponse());
    }

    public UpdatePdpServiceResponse updatePdpService(UpdatePdpServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePdpServiceWithOptions(request, headers, runtime);
    }

    public UpdatePdpServiceResponse updatePdpServiceWithOptions(UpdatePdpServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePdpService"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/services"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePdpServiceResponse());
    }

    public UpdateRoleResponse updateRole(String roleId, UpdateRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRoleWithOptions(roleId, request, headers, runtime);
    }

    public UpdateRoleResponse updateRoleWithOptions(String roleId, UpdateRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRole"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles/role-id/" + com.aliyun.openapiutil.Client.getEncodeParam(roleId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRoleResponse());
    }
}
