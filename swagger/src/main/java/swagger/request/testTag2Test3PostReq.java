package swagger.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "testTag2Test3PostReqest", description = "test tag2 test3 request")
public class testTag2Test3PostReq {
	@ApiModelProperty(name = "userid", value = "userid", example = "1")
	public int userid;
	@ApiModelProperty(name = "funds", value = "funds", example = "5432.1")
	public double funds;
	@ApiModelProperty(name = "name", value = "name", example = "myName")
	public String name;
}
