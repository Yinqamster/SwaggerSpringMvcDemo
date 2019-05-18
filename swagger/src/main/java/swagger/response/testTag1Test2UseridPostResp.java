package swagger.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class testTag1Test2UseridPostResp {

	@ApiModelProperty(name = "userid", value = "userid", example = "3")
	public int userid;
	@ApiModelProperty(name = "funds", value = "funds", example = "5432.1")
	public double funds;
	
}
