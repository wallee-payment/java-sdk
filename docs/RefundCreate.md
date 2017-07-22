
# RefundCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**externalId** | **String** | The external id helps to identify duplicate calls to the refund service. As such the external ID has to be unique per transaction. | 
**merchantReference** | **String** |  |  [optional]
**reductions** | [**List&lt;LineItemReductionCreate&gt;**](LineItemReductionCreate.md) |  | 
**transaction** | **Long** |  | 
**type** | [**RefundType**](RefundType.md) |  | 



